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
public final class FlowableIntervalRange extends Flowable<Long> {
    public final long end;
    public final long initialDelay;
    public final long period;
    public final Scheduler scheduler;
    public final long start;
    public final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class IntervalRangeSubscriber extends AtomicLong implements d, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        public long count;
        public final c<? super Long> downstream;
        public final long end;
        public final AtomicReference<Disposable> resource = new AtomicReference<>();

        public IntervalRangeSubscriber(c<? super Long> cVar, long j10, long j11) {
            this.downstream = cVar;
            this.count = j10;
            this.end = j11;
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
            Disposable disposable = this.resource.get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                long j10 = get();
                if (j10 != 0) {
                    long j11 = this.count;
                    this.downstream.onNext(Long.valueOf(j11));
                    if (j11 == this.end) {
                        if (this.resource.get() != disposableHelper) {
                            this.downstream.onComplete();
                        }
                        DisposableHelper.dispose(this.resource);
                        return;
                    }
                    this.count = j11 + 1;
                    if (j10 != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                } else {
                    c<? super Long> cVar = this.downstream;
                    StringBuilder m10 = a.m("Can't deliver value ");
                    m10.append(this.count);
                    m10.append(" due to lack of requests");
                    cVar.onError(new MissingBackpressureException(m10.toString()));
                    DisposableHelper.dispose(this.resource);
                }
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.setOnce(this.resource, disposable);
        }
    }

    public FlowableIntervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit, Scheduler scheduler) {
        this.initialDelay = j12;
        this.period = j13;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.start = j10;
        this.end = j11;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super Long> cVar) {
        IntervalRangeSubscriber intervalRangeSubscriber = new IntervalRangeSubscriber(cVar, this.start, this.end);
        cVar.onSubscribe(intervalRangeSubscriber);
        Scheduler scheduler = this.scheduler;
        if (!(scheduler instanceof TrampolineScheduler)) {
            intervalRangeSubscriber.setResource(scheduler.schedulePeriodicallyDirect(intervalRangeSubscriber, this.initialDelay, this.period, this.unit));
            return;
        }
        Scheduler.Worker createWorker = scheduler.createWorker();
        intervalRangeSubscriber.setResource(createWorker);
        createWorker.schedulePeriodically(intervalRangeSubscriber, this.initialDelay, this.period, this.unit);
    }
}
