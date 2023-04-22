package io.reactivex.processors;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

@SchedulerSupport(SchedulerSupport.NONE)
@BackpressureSupport(BackpressureKind.FULL)
/* loaded from: classes2.dex */
public final class MulticastProcessor<T> extends FlowableProcessor<T> {
    public static final MulticastSubscription[] EMPTY = new MulticastSubscription[0];
    public static final MulticastSubscription[] TERMINATED = new MulticastSubscription[0];
    public final int bufferSize;
    public int consumed;
    public volatile boolean done;
    public volatile Throwable error;
    public int fusionMode;
    public final int limit;
    public final AtomicBoolean once;
    public volatile SimpleQueue<T> queue;
    public final boolean refcount;
    public final AtomicReference<MulticastSubscription<T>[]> subscribers;
    public final AtomicReference<d> upstream;
    public final AtomicInteger wip;

    /* loaded from: classes2.dex */
    public static final class MulticastSubscription<T> extends AtomicLong implements d {
        private static final long serialVersionUID = -363282618957264509L;
        public final c<? super T> downstream;
        public long emitted;
        public final MulticastProcessor<T> parent;

        public MulticastSubscription(c<? super T> cVar, MulticastProcessor<T> multicastProcessor) {
            this.downstream = cVar;
            this.parent = multicastProcessor;
        }

        @Override // df.d
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            }
        }

        public void onNext(T t2) {
            if (get() != Long.MIN_VALUE) {
                this.emitted++;
                this.downstream.onNext(t2);
            }
        }

        @Override // df.d
        public void request(long j10) {
            long j11;
            long j12;
            if (SubscriptionHelper.validate(j10)) {
                do {
                    j11 = get();
                    if (j11 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j11 == Long.MAX_VALUE) {
                        return;
                    }
                    j12 = j11 + j10;
                } while (!compareAndSet(j11, j12 >= 0 ? j12 : Long.MAX_VALUE));
                this.parent.drain();
            }
        }
    }

    public MulticastProcessor(int i10, boolean z10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        this.bufferSize = i10;
        this.limit = i10 - (i10 >> 2);
        this.wip = new AtomicInteger();
        this.subscribers = new AtomicReference<>(EMPTY);
        this.upstream = new AtomicReference<>();
        this.refcount = z10;
        this.once = new AtomicBoolean();
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create() {
        return new MulticastProcessor<>(Flowable.bufferSize(), false);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i10) {
        return new MulticastProcessor<>(i10, false);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i10, boolean z10) {
        return new MulticastProcessor<>(i10, z10);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(boolean z10) {
        return new MulticastProcessor<>(Flowable.bufferSize(), z10);
    }

    public boolean add(MulticastSubscription<T> multicastSubscription) {
        MulticastSubscription<T>[] multicastSubscriptionArr;
        MulticastSubscription<T>[] multicastSubscriptionArr2;
        do {
            multicastSubscriptionArr = this.subscribers.get();
            if (multicastSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = multicastSubscriptionArr.length;
            multicastSubscriptionArr2 = new MulticastSubscription[length + 1];
            System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
            multicastSubscriptionArr2[length] = multicastSubscription;
        } while (!this.subscribers.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2));
        return true;
    }

    public void drain() {
        int i10;
        T t2;
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        AtomicReference<MulticastSubscription<T>[]> atomicReference = this.subscribers;
        int i11 = this.consumed;
        int i12 = this.limit;
        int i13 = this.fusionMode;
        int i14 = 1;
        while (true) {
            SimpleQueue<T> simpleQueue = this.queue;
            if (simpleQueue != null) {
                MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference.get();
                if (multicastSubscriptionArr.length != 0) {
                    int length = multicastSubscriptionArr.length;
                    long j10 = -1;
                    long j11 = -1;
                    int i15 = 0;
                    while (i15 < length) {
                        MulticastSubscription<T> multicastSubscription = multicastSubscriptionArr[i15];
                        long j12 = multicastSubscription.get();
                        if (j12 >= 0) {
                            j11 = j11 == j10 ? j12 - multicastSubscription.emitted : Math.min(j11, j12 - multicastSubscription.emitted);
                        }
                        i15++;
                        j10 = -1;
                    }
                    int i16 = i11;
                    while (true) {
                        i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                        if (i10 <= 0) {
                            break;
                        }
                        MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                        if (multicastSubscriptionArr2 == TERMINATED) {
                            simpleQueue.clear();
                            return;
                        } else if (multicastSubscriptionArr != multicastSubscriptionArr2) {
                            break;
                        } else {
                            boolean z10 = this.done;
                            try {
                                t2 = simpleQueue.poll();
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                SubscriptionHelper.cancel(this.upstream);
                                this.error = th;
                                this.done = true;
                                t2 = null;
                                z10 = true;
                            }
                            boolean z11 = t2 == null;
                            if (z10 && z11) {
                                Throwable th2 = this.error;
                                if (th2 != null) {
                                    for (MulticastSubscription<T> multicastSubscription2 : atomicReference.getAndSet(TERMINATED)) {
                                        multicastSubscription2.onError(th2);
                                    }
                                    return;
                                }
                                for (MulticastSubscription<T> multicastSubscription3 : atomicReference.getAndSet(TERMINATED)) {
                                    multicastSubscription3.onComplete();
                                }
                                return;
                            } else if (z11) {
                                break;
                            } else {
                                for (MulticastSubscription<T> multicastSubscription4 : multicastSubscriptionArr) {
                                    multicastSubscription4.onNext(t2);
                                }
                                j11--;
                                if (i13 != 1 && (i16 = i16 + 1) == i12) {
                                    this.upstream.get().request(i12);
                                    i16 = 0;
                                }
                            }
                        }
                    }
                    if (i10 == 0) {
                        MulticastSubscription<T>[] multicastSubscriptionArr3 = atomicReference.get();
                        MulticastSubscription<T>[] multicastSubscriptionArr4 = TERMINATED;
                        if (multicastSubscriptionArr3 == multicastSubscriptionArr4) {
                            simpleQueue.clear();
                            return;
                        } else if (multicastSubscriptionArr != multicastSubscriptionArr3) {
                            i11 = i16;
                        } else if (this.done && simpleQueue.isEmpty()) {
                            Throwable th3 = this.error;
                            if (th3 != null) {
                                for (MulticastSubscription<T> multicastSubscription5 : atomicReference.getAndSet(multicastSubscriptionArr4)) {
                                    multicastSubscription5.onError(th3);
                                }
                                return;
                            }
                            for (MulticastSubscription<T> multicastSubscription6 : atomicReference.getAndSet(multicastSubscriptionArr4)) {
                                multicastSubscription6.onComplete();
                            }
                            return;
                        }
                    }
                    i11 = i16;
                }
            }
            this.consumed = i11;
            i14 = this.wip.addAndGet(-i14);
            if (i14 == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public Throwable getThrowable() {
        if (this.once.get()) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.once.get() && this.error == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.once.get() && this.error != null;
    }

    public boolean offer(T t2) {
        if (this.once.get()) {
            return false;
        }
        ObjectHelper.requireNonNull(t2, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.fusionMode == 0 && this.queue.offer(t2)) {
            drain();
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor, df.c
    public void onComplete() {
        if (this.once.compareAndSet(false, true)) {
            this.done = true;
            drain();
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, df.c
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.once.compareAndSet(false, true)) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // io.reactivex.processors.FlowableProcessor, df.c
    public void onNext(T t2) {
        if (this.once.get()) {
            return;
        }
        if (this.fusionMode == 0) {
            ObjectHelper.requireNonNull(t2, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (!this.queue.offer(t2)) {
                SubscriptionHelper.cancel(this.upstream);
                onError(new MissingBackpressureException());
                return;
            }
        }
        drain();
    }

    @Override // df.c
    public void onSubscribe(d dVar) {
        if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
            if (dVar instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) dVar;
                int requestFusion = queueSubscription.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = queueSubscription;
                    this.done = true;
                    drain();
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = queueSubscription;
                    dVar.request(this.bufferSize);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.bufferSize);
            dVar.request(this.bufferSize);
        }
    }

    public void remove(MulticastSubscription<T> multicastSubscription) {
        while (true) {
            MulticastSubscription<T>[] multicastSubscriptionArr = this.subscribers.get();
            int length = multicastSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i10 = -1;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (multicastSubscriptionArr[i11] == multicastSubscription) {
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length != 1) {
                MulticastSubscription<T>[] multicastSubscriptionArr2 = new MulticastSubscription[length - 1];
                System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, i10);
                System.arraycopy(multicastSubscriptionArr, i10 + 1, multicastSubscriptionArr2, i10, (length - i10) - 1);
                if (this.subscribers.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2)) {
                    return;
                }
            } else if (this.refcount) {
                if (this.subscribers.compareAndSet(multicastSubscriptionArr, TERMINATED)) {
                    SubscriptionHelper.cancel(this.upstream);
                    this.once.set(true);
                    return;
                }
            } else if (this.subscribers.compareAndSet(multicastSubscriptionArr, EMPTY)) {
                return;
            }
        }
    }

    public void start() {
        if (SubscriptionHelper.setOnce(this.upstream, EmptySubscription.INSTANCE)) {
            this.queue = new SpscArrayQueue(this.bufferSize);
        }
    }

    public void startUnbounded() {
        if (SubscriptionHelper.setOnce(this.upstream, EmptySubscription.INSTANCE)) {
            this.queue = new SpscLinkedArrayQueue(this.bufferSize);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        Throwable th;
        MulticastSubscription<T> multicastSubscription = new MulticastSubscription<>(cVar, this);
        cVar.onSubscribe(multicastSubscription);
        if (add(multicastSubscription)) {
            if (multicastSubscription.get() == Long.MIN_VALUE) {
                remove(multicastSubscription);
            } else {
                drain();
            }
        } else if ((this.once.get() || !this.refcount) && (th = this.error) != null) {
            cVar.onError(th);
        } else {
            cVar.onComplete();
        }
    }
}
