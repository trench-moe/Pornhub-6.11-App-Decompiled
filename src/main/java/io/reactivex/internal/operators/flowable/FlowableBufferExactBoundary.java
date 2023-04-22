package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class FlowableBufferExactBoundary<T, U extends Collection<? super T>, B> extends AbstractFlowableWithUpstream<T, U> {
    public final b<B> boundary;
    public final Callable<U> bufferSupplier;

    /* loaded from: classes2.dex */
    public static final class BufferBoundarySubscriber<T, U extends Collection<? super T>, B> extends DisposableSubscriber<B> {
        public final BufferExactBoundarySubscriber<T, U, B> parent;

        public BufferBoundarySubscriber(BufferExactBoundarySubscriber<T, U, B> bufferExactBoundarySubscriber) {
            this.parent = bufferExactBoundarySubscriber;
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.parent.onComplete();
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.parent.onError(th);
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(B b10) {
            this.parent.next();
        }
    }

    /* loaded from: classes2.dex */
    public static final class BufferExactBoundarySubscriber<T, U extends Collection<? super T>, B> extends QueueDrainSubscriber<T, U, U> implements d, Disposable {
        public final b<B> boundary;
        public U buffer;
        public final Callable<U> bufferSupplier;
        public Disposable other;
        public d upstream;

        public BufferExactBoundarySubscriber(c<? super U> cVar, Callable<U> callable, b<B> bVar) {
            super(cVar, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.boundary = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(c cVar, Object obj) {
            return accept((c<? super c>) cVar, (c) ((Collection) obj));
        }

        public boolean accept(c<? super U> cVar, U u2) {
            this.downstream.onNext(u2);
            return true;
        }

        @Override // df.d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.other.dispose();
            this.upstream.cancel();
            if (enter()) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void next() {
            try {
                U u2 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                synchronized (this) {
                    U u10 = this.buffer;
                    if (u10 == null) {
                        return;
                    }
                    this.buffer = u2;
                    fastPathEmitMax(u10, false, this);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            synchronized (this) {
                try {
                    U u2 = this.buffer;
                    if (u2 == null) {
                        return;
                    }
                    this.buffer = null;
                    this.queue.offer(u2);
                    this.done = true;
                    if (enter()) {
                        QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            cancel();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            synchronized (this) {
                U u2 = this.buffer;
                if (u2 == null) {
                    return;
                }
                u2.add(t2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(this);
                    this.other = bufferBoundarySubscriber;
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    dVar.request(Long.MAX_VALUE);
                    this.boundary.subscribe(bufferBoundarySubscriber);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.cancelled = true;
                    dVar.cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        @Override // df.d
        public void request(long j10) {
            requested(j10);
        }
    }

    public FlowableBufferExactBoundary(Flowable<T> flowable, b<B> bVar, Callable<U> callable) {
        super(flowable);
        this.boundary = bVar;
        this.bufferSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super U> cVar) {
        this.source.subscribe((FlowableSubscriber) new BufferExactBoundarySubscriber(new SerializedSubscriber(cVar), this.bufferSupplier, this.boundary));
    }
}
