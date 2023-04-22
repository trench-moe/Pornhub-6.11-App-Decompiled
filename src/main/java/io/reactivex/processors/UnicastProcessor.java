package io.reactivex.processors;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {
    public volatile boolean cancelled;
    public final boolean delayError;
    public volatile boolean done;
    public final AtomicReference<c<? super T>> downstream;
    public boolean enableOperatorFusion;
    public Throwable error;
    public final AtomicReference<Runnable> onTerminate;
    public final AtomicBoolean once;
    public final SpscLinkedArrayQueue<T> queue;
    public final AtomicLong requested;
    public final BasicIntQueueSubscription<T> wip;

    /* loaded from: classes2.dex */
    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public UnicastQueueSubscription() {
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void cancel() {
            if (UnicastProcessor.this.cancelled) {
                return;
            }
            UnicastProcessor.this.cancelled = true;
            UnicastProcessor.this.doTerminate();
            UnicastProcessor.this.downstream.lazySet(null);
            if (UnicastProcessor.this.wip.getAndIncrement() == 0) {
                UnicastProcessor.this.downstream.lazySet(null);
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                if (unicastProcessor.enableOperatorFusion) {
                    return;
                }
                unicastProcessor.queue.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            UnicastProcessor.this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return UnicastProcessor.this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            return UnicastProcessor.this.queue.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(UnicastProcessor.this.requested, j10);
                UnicastProcessor.this.drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            if ((i10 & 2) != 0) {
                UnicastProcessor.this.enableOperatorFusion = true;
                return 2;
            }
            return 0;
        }
    }

    public UnicastProcessor(int i10) {
        this(i10, null, true);
    }

    public UnicastProcessor(int i10, Runnable runnable) {
        this(i10, runnable, true);
    }

    public UnicastProcessor(int i10, Runnable runnable, boolean z10) {
        this.queue = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i10, "capacityHint"));
        this.onTerminate = new AtomicReference<>(runnable);
        this.delayError = z10;
        this.downstream = new AtomicReference<>();
        this.once = new AtomicBoolean();
        this.wip = new UnicastQueueSubscription();
        this.requested = new AtomicLong();
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create() {
        return new UnicastProcessor<>(Flowable.bufferSize());
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i10) {
        return new UnicastProcessor<>(i10);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i10, Runnable runnable) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i10, runnable);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i10, Runnable runnable, boolean z10) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i10, runnable, z10);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(boolean z10) {
        return new UnicastProcessor<>(Flowable.bufferSize(), null, z10);
    }

    public boolean checkTerminated(boolean z10, boolean z11, boolean z12, c<? super T> cVar, SpscLinkedArrayQueue<T> spscLinkedArrayQueue) {
        if (this.cancelled) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            return true;
        } else if (z11) {
            if (z10 && this.error != null) {
                spscLinkedArrayQueue.clear();
                this.downstream.lazySet(null);
                cVar.onError(this.error);
                return true;
            } else if (z12) {
                Throwable th = this.error;
                this.downstream.lazySet(null);
                if (th != null) {
                    cVar.onError(th);
                } else {
                    cVar.onComplete();
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void doTerminate() {
        Runnable andSet = this.onTerminate.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    public void drain() {
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        int i10 = 1;
        c<? super T> cVar = this.downstream.get();
        while (cVar == null) {
            i10 = this.wip.addAndGet(-i10);
            if (i10 == 0) {
                return;
            }
            cVar = this.downstream.get();
        }
        if (this.enableOperatorFusion) {
            drainFused(cVar);
        } else {
            drainRegular(cVar);
        }
    }

    public void drainFused(c<? super T> cVar) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        int i10 = 1;
        boolean z10 = !this.delayError;
        while (!this.cancelled) {
            boolean z11 = this.done;
            if (z10 && z11 && this.error != null) {
                spscLinkedArrayQueue.clear();
                this.downstream.lazySet(null);
                cVar.onError(this.error);
                return;
            }
            cVar.onNext(null);
            if (z11) {
                this.downstream.lazySet(null);
                Throwable th = this.error;
                if (th != null) {
                    cVar.onError(th);
                    return;
                } else {
                    cVar.onComplete();
                    return;
                }
            }
            i10 = this.wip.addAndGet(-i10);
            if (i10 == 0) {
                return;
            }
        }
        this.downstream.lazySet(null);
    }

    public void drainRegular(c<? super T> cVar) {
        int i10;
        long j10;
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z10 = !this.delayError;
        int i11 = 1;
        while (true) {
            long j11 = this.requested.get();
            long j12 = 0;
            while (true) {
                i10 = (j11 > j12 ? 1 : (j11 == j12 ? 0 : -1));
                if (i10 == 0) {
                    j10 = j12;
                    break;
                }
                boolean z11 = this.done;
                T poll = spscLinkedArrayQueue.poll();
                boolean z12 = poll == null;
                j10 = j12;
                if (checkTerminated(z10, z11, z12, cVar, spscLinkedArrayQueue)) {
                    return;
                }
                if (z12) {
                    break;
                }
                cVar.onNext(poll);
                j12 = 1 + j10;
            }
            if (i10 == 0 && checkTerminated(z10, this.done, spscLinkedArrayQueue.isEmpty(), cVar, spscLinkedArrayQueue)) {
                return;
            }
            if (j10 != 0 && j11 != Long.MAX_VALUE) {
                this.requested.addAndGet(-j10);
            }
            i11 = this.wip.addAndGet(-i11);
            if (i11 == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        if (this.done) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.done && this.error == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.downstream.get() != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.done && this.error != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor, df.c
    public void onComplete() {
        if (this.done || this.cancelled) {
            return;
        }
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.processors.FlowableProcessor, df.c
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.cancelled) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.processors.FlowableProcessor, df.c
    public void onNext(T t2) {
        ObjectHelper.requireNonNull(t2, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.cancelled) {
            return;
        }
        this.queue.offer(t2);
        drain();
    }

    @Override // df.c
    public void onSubscribe(d dVar) {
        if (this.done || this.cancelled) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), cVar);
            return;
        }
        cVar.onSubscribe(this.wip);
        this.downstream.set(cVar);
        if (this.cancelled) {
            this.downstream.lazySet(null);
        } else {
            drain();
        }
    }
}
