package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class SingleDelay<T> extends Single<T> {
    public final boolean delayError;
    public final Scheduler scheduler;
    public final SingleSource<? extends T> source;
    public final long time;
    public final TimeUnit unit;

    /* loaded from: classes2.dex */
    public final class Delay implements SingleObserver<T> {
        public final SingleObserver<? super T> downstream;

        /* renamed from: sd  reason: collision with root package name */
        private final SequentialDisposable f10769sd;

        /* loaded from: classes2.dex */
        public final class OnError implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            private final Throwable f10770e;

            public OnError(Throwable th) {
                this.f10770e = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                Delay.this.downstream.onError(this.f10770e);
            }
        }

        /* loaded from: classes2.dex */
        public final class OnSuccess implements Runnable {
            private final T value;

            public OnSuccess(T t2) {
                this.value = t2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Delay.this.downstream.onSuccess((T) this.value);
            }
        }

        public Delay(SequentialDisposable sequentialDisposable, SingleObserver<? super T> singleObserver) {
            this.f10769sd = sequentialDisposable;
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            SequentialDisposable sequentialDisposable = this.f10769sd;
            Scheduler scheduler = SingleDelay.this.scheduler;
            OnError onError = new OnError(th);
            SingleDelay singleDelay = SingleDelay.this;
            sequentialDisposable.replace(scheduler.scheduleDirect(onError, singleDelay.delayError ? singleDelay.time : 0L, singleDelay.unit));
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f10769sd.replace(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t2) {
            SequentialDisposable sequentialDisposable = this.f10769sd;
            Scheduler scheduler = SingleDelay.this.scheduler;
            OnSuccess onSuccess = new OnSuccess(t2);
            SingleDelay singleDelay = SingleDelay.this;
            sequentialDisposable.replace(scheduler.scheduleDirect(onSuccess, singleDelay.time, singleDelay.unit));
        }
    }

    public SingleDelay(SingleSource<? extends T> singleSource, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        this.source = singleSource;
        this.time = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z10;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        singleObserver.onSubscribe(sequentialDisposable);
        this.source.subscribe(new Delay(sequentialDisposable, singleObserver));
    }
}
