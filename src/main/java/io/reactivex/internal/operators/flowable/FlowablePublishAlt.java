package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowablePublishAlt<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T>, ResettableConnectable {
    public final int bufferSize;
    public final AtomicReference<PublishConnection<T>> current = new AtomicReference<>();
    public final b<T> source;

    /* loaded from: classes2.dex */
    public static final class InnerSubscription<T> extends AtomicLong implements d {
        private static final long serialVersionUID = 2845000326761540265L;
        public final c<? super T> downstream;
        public long emitted;
        public final PublishConnection<T> parent;

        public InnerSubscription(c<? super T> cVar, PublishConnection<T> publishConnection) {
            this.downstream = cVar;
            this.parent = publishConnection;
        }

        @Override // df.d
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
                this.parent.drain();
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        @Override // df.d
        public void request(long j10) {
            BackpressureHelper.addCancel(this, j10);
            this.parent.drain();
        }
    }

    /* loaded from: classes2.dex */
    public static final class PublishConnection<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        public static final InnerSubscription[] EMPTY = new InnerSubscription[0];
        public static final InnerSubscription[] TERMINATED = new InnerSubscription[0];
        private static final long serialVersionUID = -1672047311619175801L;
        public final int bufferSize;
        public int consumed;
        public final AtomicReference<PublishConnection<T>> current;
        public volatile boolean done;
        public Throwable error;
        public volatile SimpleQueue<T> queue;
        public int sourceMode;
        public final AtomicReference<d> upstream = new AtomicReference<>();
        public final AtomicBoolean connect = new AtomicBoolean();
        public final AtomicReference<InnerSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);

        public PublishConnection(AtomicReference<PublishConnection<T>> atomicReference, int i10) {
            this.current = atomicReference;
            this.bufferSize = i10;
        }

        public boolean add(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription<T>[] innerSubscriptionArr2;
            do {
                innerSubscriptionArr = this.subscribers.get();
                if (innerSubscriptionArr == TERMINATED) {
                    return false;
                }
                int length = innerSubscriptionArr.length;
                innerSubscriptionArr2 = new InnerSubscription[length + 1];
                System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
                innerSubscriptionArr2[length] = innerSubscription;
            } while (!this.subscribers.compareAndSet(innerSubscriptionArr, innerSubscriptionArr2));
            return true;
        }

        public boolean checkTerminated(boolean z10, boolean z11) {
            InnerSubscription<T>[] andSet;
            if (z10 && z11) {
                Throwable th = this.error;
                if (th != null) {
                    signalError(th);
                    return true;
                }
                for (InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(TERMINATED)) {
                    if (!innerSubscription.isCancelled()) {
                        innerSubscription.downstream.onComplete();
                    }
                }
                return true;
            }
            return false;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.subscribers.getAndSet(TERMINATED);
            this.current.compareAndSet(this, null);
            SubscriptionHelper.cancel(this.upstream);
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            SimpleQueue<T> simpleQueue = this.queue;
            int i10 = this.consumed;
            int i11 = this.bufferSize;
            int i12 = i11 - (i11 >> 2);
            boolean z10 = this.sourceMode != 1;
            int i13 = 1;
            SimpleQueue<T> simpleQueue2 = simpleQueue;
            int i14 = i10;
            while (true) {
                if (simpleQueue2 != null) {
                    long j10 = Long.MAX_VALUE;
                    InnerSubscription<T>[] innerSubscriptionArr = this.subscribers.get();
                    boolean z11 = false;
                    for (InnerSubscription<T> innerSubscription : innerSubscriptionArr) {
                        long j11 = innerSubscription.get();
                        if (j11 != Long.MIN_VALUE) {
                            j10 = Math.min(j11 - innerSubscription.emitted, j10);
                            z11 = true;
                        }
                    }
                    if (!z11) {
                        j10 = 0;
                    }
                    for (long j12 = 0; j10 != j12; j12 = 0) {
                        boolean z12 = this.done;
                        try {
                            T poll = simpleQueue2.poll();
                            boolean z13 = poll == null;
                            if (checkTerminated(z12, z13)) {
                                return;
                            }
                            if (z13) {
                                break;
                            }
                            for (InnerSubscription<T> innerSubscription2 : innerSubscriptionArr) {
                                if (!innerSubscription2.isCancelled()) {
                                    innerSubscription2.downstream.onNext(poll);
                                    innerSubscription2.emitted++;
                                }
                            }
                            if (z10 && (i14 = i14 + 1) == i12) {
                                this.upstream.get().request(i12);
                                i14 = 0;
                            }
                            j10--;
                            if (innerSubscriptionArr != this.subscribers.get()) {
                                break;
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.upstream.get().cancel();
                            simpleQueue2.clear();
                            this.done = true;
                            signalError(th);
                            return;
                        }
                    }
                    if (checkTerminated(this.done, simpleQueue2.isEmpty())) {
                        return;
                    }
                }
                this.consumed = i14;
                i13 = addAndGet(-i13);
                if (i13 == 0) {
                    return;
                }
                if (simpleQueue2 == null) {
                    simpleQueue2 = this.queue;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.subscribers.get() == TERMINATED;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.sourceMode != 0 || this.queue.offer(t2)) {
                drain();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        dVar.request(this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                dVar.request(this.bufferSize);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void remove(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription[] innerSubscriptionArr2;
            do {
                innerSubscriptionArr = this.subscribers.get();
                int length = innerSubscriptionArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    } else if (innerSubscriptionArr[i11] == innerSubscription) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriptionArr2 = EMPTY;
                } else {
                    InnerSubscription[] innerSubscriptionArr3 = new InnerSubscription[length - 1];
                    System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr3, 0, i10);
                    System.arraycopy(innerSubscriptionArr, i10 + 1, innerSubscriptionArr3, i10, (length - i10) - 1);
                    innerSubscriptionArr2 = innerSubscriptionArr3;
                }
            } while (!this.subscribers.compareAndSet(innerSubscriptionArr, innerSubscriptionArr2));
        }

        public void signalError(Throwable th) {
            InnerSubscription<T>[] andSet;
            for (InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(TERMINATED)) {
                if (!innerSubscription.isCancelled()) {
                    innerSubscription.downstream.onError(th);
                }
            }
        }
    }

    public FlowablePublishAlt(b<T> bVar, int i10) {
        this.source = bVar;
        this.bufferSize = i10;
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        PublishConnection<T> publishConnection;
        while (true) {
            publishConnection = this.current.get();
            if (publishConnection != null && !publishConnection.isDisposed()) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.current, this.bufferSize);
            if (this.current.compareAndSet(publishConnection, publishConnection2)) {
                publishConnection = publishConnection2;
                break;
            }
        }
        boolean z10 = true;
        z10 = (publishConnection.connect.get() || !publishConnection.connect.compareAndSet(false, true)) ? false : false;
        try {
            consumer.accept(publishConnection);
            if (z10) {
                this.source.subscribe(publishConnection);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    public int publishBufferSize() {
        return this.bufferSize;
    }

    @Override // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(Disposable disposable) {
        this.current.compareAndSet((PublishConnection) disposable, null);
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public b<T> source() {
        return this.source;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        PublishConnection<T> publishConnection;
        while (true) {
            publishConnection = this.current.get();
            if (publishConnection != null) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.current, this.bufferSize);
            if (this.current.compareAndSet(publishConnection, publishConnection2)) {
                publishConnection = publishConnection2;
                break;
            }
        }
        InnerSubscription<T> innerSubscription = new InnerSubscription<>(cVar, publishConnection);
        cVar.onSubscribe(innerSubscription);
        if (publishConnection.add(innerSubscription)) {
            if (innerSubscription.isCancelled()) {
                publishConnection.remove(innerSubscription);
                return;
            } else {
                publishConnection.drain();
                return;
            }
        }
        Throwable th = publishConnection.error;
        if (th != null) {
            cVar.onError(th);
        } else {
            cVar.onComplete();
        }
    }
}
