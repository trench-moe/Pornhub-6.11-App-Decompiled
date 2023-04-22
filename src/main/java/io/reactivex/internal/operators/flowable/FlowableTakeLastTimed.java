package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class FlowableTakeLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    public final int bufferSize;
    public final long count;
    public final boolean delayError;
    public final Scheduler scheduler;
    public final long time;
    public final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class TakeLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -5677354903406201275L;
        public volatile boolean cancelled;
        public final long count;
        public final boolean delayError;
        public volatile boolean done;
        public final c<? super T> downstream;
        public Throwable error;
        public final SpscLinkedArrayQueue<Object> queue;
        public final AtomicLong requested = new AtomicLong();
        public final Scheduler scheduler;
        public final long time;
        public final TimeUnit unit;
        public d upstream;

        public TakeLastTimedSubscriber(c<? super T> cVar, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
            this.downstream = cVar;
            this.count = j10;
            this.time = j11;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.queue = new SpscLinkedArrayQueue<>(i10);
            this.delayError = z10;
        }

        @Override // df.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public boolean checkTerminated(boolean z10, c<? super T> cVar, boolean z11) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (!z11) {
                Throwable th = this.error;
                if (th != null) {
                    this.queue.clear();
                    cVar.onError(th);
                    return true;
                } else if (z10) {
                    cVar.onComplete();
                    return true;
                }
            } else if (z10) {
                Throwable th2 = this.error;
                if (th2 != null) {
                    cVar.onError(th2);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
            return false;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            c<? super T> cVar = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            boolean z10 = this.delayError;
            int i10 = 1;
            do {
                if (this.done) {
                    if (checkTerminated(spscLinkedArrayQueue.isEmpty(), cVar, z10)) {
                        return;
                    }
                    long j10 = this.requested.get();
                    long j11 = 0;
                    while (true) {
                        if (checkTerminated(spscLinkedArrayQueue.peek() == null, cVar, z10)) {
                            return;
                        }
                        if (j10 != j11) {
                            spscLinkedArrayQueue.poll();
                            cVar.onNext(spscLinkedArrayQueue.poll());
                            j11++;
                        } else if (j11 != 0) {
                            BackpressureHelper.produced(this.requested, j11);
                        }
                    }
                }
                i10 = addAndGet(-i10);
            } while (i10 != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            trim(this.scheduler.now(this.unit), this.queue);
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.delayError) {
                trim(this.scheduler.now(this.unit), this.queue);
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            long now = this.scheduler.now(this.unit);
            spscLinkedArrayQueue.offer(Long.valueOf(now), t2);
            trim(now, spscLinkedArrayQueue);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }

        public void trim(long j10, SpscLinkedArrayQueue<Object> spscLinkedArrayQueue) {
            long j11 = this.time;
            long j12 = this.count;
            boolean z10 = j12 == Long.MAX_VALUE;
            while (!spscLinkedArrayQueue.isEmpty()) {
                if (((Long) spscLinkedArrayQueue.peek()).longValue() >= j10 - j11 && (z10 || (spscLinkedArrayQueue.size() >> 1) <= j12)) {
                    return;
                }
                spscLinkedArrayQueue.poll();
                spscLinkedArrayQueue.poll();
            }
        }
    }

    public FlowableTakeLastTimed(Flowable<T> flowable, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
        super(flowable);
        this.count = j10;
        this.time = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i10;
        this.delayError = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber) new TakeLastTimedSubscriber(cVar, this.count, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }
}
