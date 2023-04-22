package io.reactivex.internal.operators.flowable;

import a1.a;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableInterval extends Flowable<Long> {
    public final long initialDelay;
    public final long period;
    public final Scheduler scheduler;
    public final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class IntervalSubscriber extends AtomicLong implements d, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        public long count;
        public final c<? super Long> downstream;
        public final AtomicReference<Disposable> resource = new AtomicReference<>();

        public IntervalSubscriber(c<? super Long> cVar) {
            this.downstream = cVar;
        }

        @Override // df.d
        public void cancel() {
            DisposableHelper.dispose(this.resource);
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this, j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.resource.get() != DisposableHelper.DISPOSED) {
                if (get() != 0) {
                    c<? super Long> cVar = this.downstream;
                    long j10 = this.count;
                    this.count = j10 + 1;
                    cVar.onNext(Long.valueOf(j10));
                    BackpressureHelper.produced(this, 1L);
                    return;
                }
                c<? super Long> cVar2 = this.downstream;
                StringBuilder m10 = a.m("Can't deliver value ");
                m10.append(this.count);
                m10.append(" due to lack of requests");
                cVar2.onError(new MissingBackpressureException(m10.toString()));
                DisposableHelper.dispose(this.resource);
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.setOnce(this.resource, disposable);
        }
    }

    public FlowableInterval(long j10, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        this.initialDelay = j10;
        this.period = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super Long> cVar) {
        IntervalSubscriber intervalSubscriber = new IntervalSubscriber(cVar);
        cVar.onSubscribe(intervalSubscriber);
        Scheduler scheduler = this.scheduler;
        if (!(scheduler instanceof TrampolineScheduler)) {
            intervalSubscriber.setResource(scheduler.schedulePeriodicallyDirect(intervalSubscriber, this.initialDelay, this.period, this.unit));
            return;
        }
        Scheduler.Worker createWorker = scheduler.createWorker();
        intervalSubscriber.setResource(createWorker);
        createWorker.schedulePeriodically(intervalSubscriber, this.initialDelay, this.period, this.unit);
    }
}
