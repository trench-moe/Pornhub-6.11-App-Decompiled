package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class FlowableTakeLast<T> extends AbstractFlowableWithUpstream<T, T> {
    public final int count;

    /* loaded from: classes2.dex */
    public static final class TakeLastSubscriber<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 7240042530241604978L;
        public volatile boolean cancelled;
        public final int count;
        public volatile boolean done;
        public final c<? super T> downstream;
        public d upstream;
        public final AtomicLong requested = new AtomicLong();
        public final AtomicInteger wip = new AtomicInteger();

        public TakeLastSubscriber(c<? super T> cVar, int i10) {
            this.downstream = cVar;
            this.count = i10;
        }

        @Override // df.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        public void drain() {
            if (this.wip.getAndIncrement() == 0) {
                c<? super T> cVar = this.downstream;
                long j10 = this.requested.get();
                while (!this.cancelled) {
                    if (this.done) {
                        long j11 = 0;
                        while (j11 != j10) {
                            if (this.cancelled) {
                                return;
                            }
                            Object obj = (T) poll();
                            if (obj == null) {
                                cVar.onComplete();
                                return;
                            } else {
                                cVar.onNext(obj);
                                j11++;
                            }
                        }
                        if (j11 != 0 && j10 != Long.MAX_VALUE) {
                            j10 = this.requested.addAndGet(-j11);
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.count == size()) {
                poll();
            }
            offer(t2);
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

    public FlowableTakeLast(Flowable<T> flowable, int i10) {
        super(flowable);
        this.count = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber) new TakeLastSubscriber(cVar, this.count));
    }
}
