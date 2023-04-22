package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableWindowBoundarySelector<T, B, V> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    public final int bufferSize;
    public final Function<? super B, ? extends b<V>> close;
    public final b<B> open;

    /* loaded from: classes2.dex */
    public static final class OperatorWindowBoundaryCloseSubscriber<T, V> extends DisposableSubscriber<V> {
        public boolean done;
        public final WindowBoundaryMainSubscriber<T, ?, V> parent;

        /* renamed from: w  reason: collision with root package name */
        public final UnicastProcessor<T> f10747w;

        public OperatorWindowBoundaryCloseSubscriber(WindowBoundaryMainSubscriber<T, ?, V> windowBoundaryMainSubscriber, UnicastProcessor<T> unicastProcessor) {
            this.parent = windowBoundaryMainSubscriber;
            this.f10747w = unicastProcessor;
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.close(this);
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.parent.error(th);
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(V v2) {
            cancel();
            onComplete();
        }
    }

    /* loaded from: classes2.dex */
    public static final class OperatorWindowBoundaryOpenSubscriber<T, B> extends DisposableSubscriber<B> {
        public final WindowBoundaryMainSubscriber<T, B, ?> parent;

        public OperatorWindowBoundaryOpenSubscriber(WindowBoundaryMainSubscriber<T, B, ?> windowBoundaryMainSubscriber) {
            this.parent = windowBoundaryMainSubscriber;
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.parent.onComplete();
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.parent.error(th);
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(B b10) {
            this.parent.open(b10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class WindowBoundaryMainSubscriber<T, B, V> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements d {
        public final AtomicReference<Disposable> boundary;
        public final int bufferSize;
        public final Function<? super B, ? extends b<V>> close;
        public final b<B> open;
        public final CompositeDisposable resources;
        public final AtomicBoolean stopWindows;
        public d upstream;
        public final AtomicLong windows;
        public final List<UnicastProcessor<T>> ws;

        public WindowBoundaryMainSubscriber(c<? super Flowable<T>> cVar, b<B> bVar, Function<? super B, ? extends b<V>> function, int i10) {
            super(cVar, new MpscLinkedQueue());
            this.boundary = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.windows = atomicLong;
            this.stopWindows = new AtomicBoolean();
            this.open = bVar;
            this.close = function;
            this.bufferSize = i10;
            this.resources = new CompositeDisposable();
            this.ws = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public boolean accept(c<? super Flowable<T>> cVar, Object obj) {
            return false;
        }

        @Override // df.d
        public void cancel() {
            if (this.stopWindows.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.boundary);
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        public void close(OperatorWindowBoundaryCloseSubscriber<T, V> operatorWindowBoundaryCloseSubscriber) {
            this.resources.delete(operatorWindowBoundaryCloseSubscriber);
            this.queue.offer(new WindowOperation(operatorWindowBoundaryCloseSubscriber.f10747w, null));
            if (enter()) {
                drainLoop();
            }
        }

        public void dispose() {
            this.resources.dispose();
            DisposableHelper.dispose(this.boundary);
        }

        public void drainLoop() {
            SimpleQueue simpleQueue = this.queue;
            c<? super V> cVar = this.downstream;
            List<UnicastProcessor<T>> list = this.ws;
            int i10 = 1;
            while (true) {
                while (true) {
                    boolean z10 = this.done;
                    Object poll = simpleQueue.poll();
                    boolean z11 = poll == null;
                    if (z10 && z11) {
                        dispose();
                        Throwable th = this.error;
                        if (th != null) {
                            for (UnicastProcessor<T> unicastProcessor : list) {
                                unicastProcessor.onError(th);
                            }
                        } else {
                            for (UnicastProcessor<T> unicastProcessor2 : list) {
                                unicastProcessor2.onComplete();
                            }
                        }
                        list.clear();
                        return;
                    } else if (z11) {
                        i10 = leave(-i10);
                        if (i10 == 0) {
                            return;
                        }
                    } else if (poll instanceof WindowOperation) {
                        WindowOperation windowOperation = (WindowOperation) poll;
                        UnicastProcessor<T> unicastProcessor3 = windowOperation.f10748w;
                        if (unicastProcessor3 != null) {
                            if (list.remove(unicastProcessor3)) {
                                windowOperation.f10748w.onComplete();
                                if (this.windows.decrementAndGet() == 0) {
                                    dispose();
                                    return;
                                }
                            } else {
                                continue;
                            }
                        } else if (!this.stopWindows.get()) {
                            UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                            long requested = requested();
                            if (requested != 0) {
                                list.add(create);
                                cVar.onNext(create);
                                if (requested != Long.MAX_VALUE) {
                                    produced(1L);
                                }
                                try {
                                    b bVar = (b) ObjectHelper.requireNonNull(this.close.apply((B) windowOperation.open), "The publisher supplied is null");
                                    OperatorWindowBoundaryCloseSubscriber operatorWindowBoundaryCloseSubscriber = new OperatorWindowBoundaryCloseSubscriber(this, create);
                                    if (this.resources.add(operatorWindowBoundaryCloseSubscriber)) {
                                        this.windows.getAndIncrement();
                                        bVar.subscribe(operatorWindowBoundaryCloseSubscriber);
                                    }
                                } catch (Throwable th2) {
                                    cancel();
                                    cVar.onError(th2);
                                }
                            } else {
                                cancel();
                                cVar.onError(new MissingBackpressureException("Could not deliver new window due to lack of requests"));
                            }
                        }
                    } else {
                        for (UnicastProcessor<T> unicastProcessor4 : list) {
                            unicastProcessor4.onNext((T) NotificationLite.getValue(poll));
                        }
                    }
                }
            }
        }

        public void error(Throwable th) {
            this.upstream.cancel();
            this.resources.dispose();
            DisposableHelper.dispose(this.boundary);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            if (this.windows.decrementAndGet() == 0) {
                this.resources.dispose();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            if (this.windows.decrementAndGet() == 0) {
                this.resources.dispose();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.done) {
                return;
            }
            if (fastEnter()) {
                for (UnicastProcessor<T> unicastProcessor : this.ws) {
                    unicastProcessor.onNext(t2);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(NotificationLite.next(t2));
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (this.stopWindows.get()) {
                    return;
                }
                OperatorWindowBoundaryOpenSubscriber operatorWindowBoundaryOpenSubscriber = new OperatorWindowBoundaryOpenSubscriber(this);
                if (this.boundary.compareAndSet(null, operatorWindowBoundaryOpenSubscriber)) {
                    dVar.request(Long.MAX_VALUE);
                    this.open.subscribe(operatorWindowBoundaryOpenSubscriber);
                }
            }
        }

        public void open(B b10) {
            this.queue.offer(new WindowOperation(null, b10));
            if (enter()) {
                drainLoop();
            }
        }

        @Override // df.d
        public void request(long j10) {
            requested(j10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class WindowOperation<T, B> {
        public final B open;

        /* renamed from: w  reason: collision with root package name */
        public final UnicastProcessor<T> f10748w;

        public WindowOperation(UnicastProcessor<T> unicastProcessor, B b10) {
            this.f10748w = unicastProcessor;
            this.open = b10;
        }
    }

    public FlowableWindowBoundarySelector(Flowable<T> flowable, b<B> bVar, Function<? super B, ? extends b<V>> function, int i10) {
        super(flowable);
        this.open = bVar;
        this.close = function;
        this.bufferSize = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super Flowable<T>> cVar) {
        this.source.subscribe((FlowableSubscriber) new WindowBoundaryMainSubscriber(new SerializedSubscriber(cVar), this.open, this.close, this.bufferSize));
    }
}
