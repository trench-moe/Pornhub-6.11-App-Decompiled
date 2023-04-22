package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ObservableIntervalRange extends Observable<Long> {
    public final long end;
    public final long initialDelay;
    public final long period;
    public final Scheduler scheduler;
    public final long start;
    public final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class IntervalRangeObserver extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        public long count;
        public final Observer<? super Long> downstream;
        public final long end;

        public IntervalRangeObserver(Observer<? super Long> observer, long j10, long j11) {
            this.downstream = observer;
            this.count = j10;
            this.end = j11;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isDisposed()) {
                return;
            }
            long j10 = this.count;
            this.downstream.onNext(Long.valueOf(j10));
            if (j10 != this.end) {
                this.count = j10 + 1;
                return;
            }
            DisposableHelper.dispose(this);
            this.downstream.onComplete();
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableIntervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit, Scheduler scheduler) {
        this.initialDelay = j12;
        this.period = j13;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.start = j10;
        this.end = j11;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Long> observer) {
        IntervalRangeObserver intervalRangeObserver = new IntervalRangeObserver(observer, this.start, this.end);
        observer.onSubscribe(intervalRangeObserver);
        Scheduler scheduler = this.scheduler;
        if (!(scheduler instanceof TrampolineScheduler)) {
            intervalRangeObserver.setResource(scheduler.schedulePeriodicallyDirect(intervalRangeObserver, this.initialDelay, this.period, this.unit));
            return;
        }
        Scheduler.Worker createWorker = scheduler.createWorker();
        intervalRangeObserver.setResource(createWorker);
        createWorker.schedulePeriodically(intervalRangeObserver, this.initialDelay, this.period, this.unit);
    }
}
