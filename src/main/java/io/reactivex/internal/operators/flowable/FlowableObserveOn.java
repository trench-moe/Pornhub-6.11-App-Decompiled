package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class FlowableObserveOn<T> extends AbstractFlowableWithUpstream<T, T> {
    public final boolean delayError;
    public final int prefetch;
    public final Scheduler scheduler;

    /* loaded from: classes2.dex */
    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public Throwable error;
        public final int limit;
        public boolean outputFused;
        public final int prefetch;
        public long produced;
        public SimpleQueue<T> queue;
        public final AtomicLong requested = new AtomicLong();
        public int sourceMode;
        public d upstream;
        public final Scheduler.Worker worker;

        public BaseObserveOnSubscriber(Scheduler.Worker worker, boolean z10, int i10) {
            this.worker = worker;
            this.delayError = z10;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (this.outputFused || getAndIncrement() != 0) {
                return;
            }
            this.queue.clear();
        }

        public final boolean checkTerminated(boolean z10, boolean z11, c<?> cVar) {
            if (this.cancelled) {
                clear();
                return true;
            }
            if (z10) {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.cancelled = true;
                        clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return true;
                    } else if (z11) {
                        this.cancelled = true;
                        cVar.onComplete();
                        this.worker.dispose();
                        return true;
                    }
                } else if (z11) {
                    this.cancelled = true;
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    this.worker.dispose();
                    return true;
                }
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                trySchedule();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            trySchedule();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public final void onNext(T t2) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 2) {
                trySchedule();
                return;
            }
            if (!this.queue.offer(t2)) {
                this.upstream.cancel();
                this.error = new MissingBackpressureException("Queue is full?!");
                this.done = true;
            }
            trySchedule();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                trySchedule();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) != 0) {
                this.outputFused = true;
                return 2;
            }
            return 0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.outputFused) {
                runBackfused();
            } else if (this.sourceMode == 1) {
                runSync();
            } else {
                runAsync();
            }
        }

        public abstract void runAsync();

        public abstract void runBackfused();

        public abstract void runSync();

        public final void trySchedule() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.worker.schedule(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = 644624475404284533L;
        public long consumed;
        public final ConditionalSubscriber<? super T> downstream;

        public ObserveOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Scheduler.Worker worker, boolean z10, int i10) {
            super(worker, z10, i10);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        dVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                dVar.request(this.prefetch);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            T poll = this.queue.poll();
            if (poll != null && this.sourceMode != 1) {
                long j10 = this.consumed + 1;
                if (j10 == this.limit) {
                    this.consumed = 0L;
                    this.upstream.request(j10);
                    return poll;
                }
                this.consumed = j10;
            }
            return poll;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runAsync() {
            int i10;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j10 = this.produced;
            long j11 = this.consumed;
            int i11 = 1;
            do {
                while (true) {
                    long j12 = this.requested.get();
                    while (true) {
                        i10 = (j10 > j12 ? 1 : (j10 == j12 ? 0 : -1));
                        if (i10 == 0) {
                            break;
                        }
                        boolean z10 = this.done;
                        try {
                            Object obj = (T) simpleQueue.poll();
                            boolean z11 = obj == null;
                            if (checkTerminated(z10, z11, conditionalSubscriber)) {
                                return;
                            }
                            if (z11) {
                                break;
                            }
                            if (conditionalSubscriber.tryOnNext(obj)) {
                                j10++;
                            }
                            j11++;
                            if (j11 == this.limit) {
                                this.upstream.request(j11);
                                j11 = 0;
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.cancelled = true;
                            this.upstream.cancel();
                            simpleQueue.clear();
                            conditionalSubscriber.onError(th);
                            this.worker.dispose();
                            return;
                        }
                    }
                    if (i10 == 0 && checkTerminated(this.done, simpleQueue.isEmpty(), conditionalSubscriber)) {
                        return;
                    }
                    int i12 = get();
                    if (i11 == i12) {
                        this.produced = j10;
                        this.consumed = j11;
                        i11 = addAndGet(-i11);
                    } else {
                        i11 = i12;
                    }
                }
            } while (i11 != 0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runBackfused() {
            int i10 = 1;
            while (!this.cancelled) {
                boolean z10 = this.done;
                this.downstream.onNext(null);
                if (z10) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i10 = addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runSync() {
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j10 = this.produced;
            int i10 = 1;
            do {
                while (true) {
                    long j11 = this.requested.get();
                    while (j10 != j11) {
                        try {
                            Object obj = (T) simpleQueue.poll();
                            if (this.cancelled) {
                                return;
                            }
                            if (obj == null) {
                                this.cancelled = true;
                                conditionalSubscriber.onComplete();
                                this.worker.dispose();
                                return;
                            } else if (conditionalSubscriber.tryOnNext(obj)) {
                                j10++;
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.cancelled = true;
                            this.upstream.cancel();
                            conditionalSubscriber.onError(th);
                            this.worker.dispose();
                            return;
                        }
                    }
                    if (this.cancelled) {
                        return;
                    }
                    if (simpleQueue.isEmpty()) {
                        this.cancelled = true;
                        conditionalSubscriber.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    int i11 = get();
                    if (i10 == i11) {
                        this.produced = j10;
                        i10 = addAndGet(-i10);
                    } else {
                        i10 = i11;
                    }
                }
            } while (i10 != 0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        public final c<? super T> downstream;

        public ObserveOnSubscriber(c<? super T> cVar, Scheduler.Worker worker, boolean z10, int i10) {
            super(worker, z10, i10);
            this.downstream = cVar;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        dVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                dVar.request(this.prefetch);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            T poll = this.queue.poll();
            if (poll != null && this.sourceMode != 1) {
                long j10 = this.produced + 1;
                if (j10 == this.limit) {
                    this.produced = 0L;
                    this.upstream.request(j10);
                    return poll;
                }
                this.produced = j10;
            }
            return poll;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runAsync() {
            int i10;
            c<? super T> cVar = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j10 = this.produced;
            int i11 = 1;
            while (true) {
                long j11 = this.requested.get();
                while (true) {
                    while (true) {
                        i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                        if (i10 == 0) {
                            break;
                        }
                        boolean z10 = this.done;
                        try {
                            Object obj = (T) simpleQueue.poll();
                            boolean z11 = obj == null;
                            if (checkTerminated(z10, z11, cVar)) {
                                return;
                            }
                            if (z11) {
                                break;
                            }
                            cVar.onNext(obj);
                            j10++;
                            if (j10 == this.limit) {
                                if (j11 != Long.MAX_VALUE) {
                                    j11 = this.requested.addAndGet(-j10);
                                }
                                this.upstream.request(j10);
                                j10 = 0;
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.cancelled = true;
                            this.upstream.cancel();
                            simpleQueue.clear();
                            cVar.onError(th);
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                if (i10 == 0 && checkTerminated(this.done, simpleQueue.isEmpty(), cVar)) {
                    return;
                }
                int i12 = get();
                if (i11 == i12) {
                    this.produced = j10;
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else {
                    i11 = i12;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runBackfused() {
            int i10 = 1;
            while (!this.cancelled) {
                boolean z10 = this.done;
                this.downstream.onNext(null);
                if (z10) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i10 = addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runSync() {
            c<? super T> cVar = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j10 = this.produced;
            int i10 = 1;
            while (true) {
                long j11 = this.requested.get();
                while (j10 != j11) {
                    try {
                        Object obj = (T) simpleQueue.poll();
                        if (this.cancelled) {
                            return;
                        }
                        if (obj == null) {
                            this.cancelled = true;
                            cVar.onComplete();
                            this.worker.dispose();
                            return;
                        }
                        cVar.onNext(obj);
                        j10++;
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (this.cancelled) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.cancelled = true;
                    cVar.onComplete();
                    this.worker.dispose();
                    return;
                }
                int i11 = get();
                if (i10 == i11) {
                    this.produced = j10;
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    i10 = i11;
                }
            }
        }
    }

    public FlowableObserveOn(Flowable<T> flowable, Scheduler scheduler, boolean z10, int i10) {
        super(flowable);
        this.scheduler = scheduler;
        this.delayError = z10;
        this.prefetch = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        Scheduler.Worker createWorker = this.scheduler.createWorker();
        if (cVar instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber) new ObserveOnConditionalSubscriber((ConditionalSubscriber) cVar, createWorker, this.delayError, this.prefetch));
        } else {
            this.source.subscribe((FlowableSubscriber) new ObserveOnSubscriber(cVar, createWorker, this.delayError, this.prefetch));
        }
    }
}
