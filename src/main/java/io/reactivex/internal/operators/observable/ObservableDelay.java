package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ObservableDelay<T> extends AbstractObservableWithUpstream<T, T> {
    public final long delay;
    public final boolean delayError;
    public final Scheduler scheduler;
    public final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class DelayObserver<T> implements Observer<T>, Disposable {
        public final long delay;
        public final boolean delayError;
        public final Observer<? super T> downstream;
        public final TimeUnit unit;
        public Disposable upstream;

        /* renamed from: w  reason: collision with root package name */
        public final Scheduler.Worker f10755w;

        /* loaded from: classes2.dex */
        public final class OnComplete implements Runnable {
            public OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelayObserver.this.downstream.onComplete();
                    DelayObserver.this.f10755w.dispose();
                } catch (Throwable th) {
                    DelayObserver.this.f10755w.dispose();
                    throw th;
                }
            }
        }

        /* loaded from: classes2.dex */
        public final class OnError implements Runnable {
            private final Throwable throwable;

            public OnError(Throwable th) {
                this.throwable = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelayObserver.this.downstream.onError(this.throwable);
                    DelayObserver.this.f10755w.dispose();
                } catch (Throwable th) {
                    DelayObserver.this.f10755w.dispose();
                    throw th;
                }
            }
        }

        /* loaded from: classes2.dex */
        public final class OnNext implements Runnable {

            /* renamed from: t  reason: collision with root package name */
            private final T f10756t;

            public OnNext(T t2) {
                this.f10756t = t2;
            }

            @Override // java.lang.Runnable
            public void run() {
                DelayObserver.this.downstream.onNext((T) this.f10756t);
            }
        }

        public DelayObserver(Observer<? super T> observer, long j10, TimeUnit timeUnit, Scheduler.Worker worker, boolean z10) {
            this.downstream = observer;
            this.delay = j10;
            this.unit = timeUnit;
            this.f10755w = worker;
            this.delayError = z10;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.f10755w.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f10755w.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f10755w.schedule(new OnComplete(), this.delay, this.unit);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f10755w.schedule(new OnError(th), this.delayError ? this.delay : 0L, this.unit);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t2) {
            this.f10755w.schedule(new OnNext(t2), this.delay, this.unit);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableDelay(ObservableSource<T> observableSource, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        super(observableSource);
        this.delay = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new DelayObserver(this.delayError ? observer : new SerializedObserver(observer), this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }
}
