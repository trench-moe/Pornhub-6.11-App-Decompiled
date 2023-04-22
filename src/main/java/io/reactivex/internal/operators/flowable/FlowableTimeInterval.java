package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class FlowableTimeInterval<T> extends AbstractFlowableWithUpstream<T, Timed<T>> {
    public final Scheduler scheduler;
    public final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class TimeIntervalSubscriber<T> implements FlowableSubscriber<T>, d {
        public final c<? super Timed<T>> downstream;
        public long lastTime;
        public final Scheduler scheduler;
        public final TimeUnit unit;
        public d upstream;

        public TimeIntervalSubscriber(c<? super Timed<T>> cVar, TimeUnit timeUnit, Scheduler scheduler) {
            this.downstream = cVar;
            this.scheduler = scheduler;
            this.unit = timeUnit;
        }

        @Override // df.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            long now = this.scheduler.now(this.unit);
            long j10 = this.lastTime;
            this.lastTime = now;
            this.downstream.onNext(new Timed(t2, now - j10, this.unit));
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.lastTime = this.scheduler.now(this.unit);
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // df.d
        public void request(long j10) {
            this.upstream.request(j10);
        }
    }

    public FlowableTimeInterval(Flowable<T> flowable, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.scheduler = scheduler;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super Timed<T>> cVar) {
        this.source.subscribe((FlowableSubscriber) new TimeIntervalSubscriber(cVar, this.unit, this.scheduler));
    }
}
