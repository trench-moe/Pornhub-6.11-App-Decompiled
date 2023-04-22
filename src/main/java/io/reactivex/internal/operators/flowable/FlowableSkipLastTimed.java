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
public final class FlowableSkipLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    public final int bufferSize;
    public final boolean delayError;
    public final Scheduler scheduler;
    public final long time;
    public final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class SkipLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -5677354903406201275L;
        public volatile boolean cancelled;
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

        public SkipLastTimedSubscriber(c<? super T> cVar, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
            this.downstream = cVar;
            this.time = j10;
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

        public boolean checkTerminated(boolean z10, boolean z11, c<? super T> cVar, boolean z12) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (z10) {
                if (!z12) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        cVar.onError(th);
                        return true;
                    } else if (z11) {
                        cVar.onComplete();
                        return true;
                    }
                } else if (z11) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
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
            TimeUnit timeUnit = this.unit;
            Scheduler scheduler = this.scheduler;
            long j10 = this.time;
            int i10 = 1;
            do {
                long j11 = this.requested.get();
                long j12 = 0;
                while (j12 != j11) {
                    boolean z11 = this.done;
                    Long l10 = (Long) spscLinkedArrayQueue.peek();
                    boolean z12 = l10 == null;
                    boolean z13 = (z12 || l10.longValue() <= scheduler.now(timeUnit) - j10) ? z12 : true;
                    if (checkTerminated(z11, z13, cVar, z10)) {
                        return;
                    }
                    if (z13) {
                        break;
                    }
                    spscLinkedArrayQueue.poll();
                    cVar.onNext(spscLinkedArrayQueue.poll());
                    j12++;
                }
                if (j12 != 0) {
                    BackpressureHelper.produced(this.requested, j12);
                }
                i10 = addAndGet(-i10);
            } while (i10 != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            this.queue.offer(Long.valueOf(this.scheduler.now(this.unit)), t2);
            drain();
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
    }

    public FlowableSkipLastTimed(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
        super(flowable);
        this.time = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i10;
        this.delayError = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber) new SkipLastTimedSubscriber(cVar, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }
}
