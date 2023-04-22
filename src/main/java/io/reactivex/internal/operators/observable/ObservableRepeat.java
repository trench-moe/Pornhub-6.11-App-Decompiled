package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class ObservableRepeat<T> extends AbstractObservableWithUpstream<T, T> {
    public final long count;

    /* loaded from: classes2.dex */
    public static final class RepeatObserver<T> extends AtomicInteger implements Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final Observer<? super T> downstream;
        public long remaining;

        /* renamed from: sd  reason: collision with root package name */
        public final SequentialDisposable f10760sd;
        public final ObservableSource<? extends T> source;

        public RepeatObserver(Observer<? super T> observer, long j10, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.downstream = observer;
            this.f10760sd = sequentialDisposable;
            this.source = observableSource;
            this.remaining = j10;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            long j10 = this.remaining;
            if (j10 != Long.MAX_VALUE) {
                this.remaining = j10 - 1;
            }
            if (j10 != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t2) {
            this.downstream.onNext(t2);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f10760sd.replace(disposable);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i10 = 1;
                while (!this.f10760sd.isDisposed()) {
                    this.source.subscribe(this);
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                }
            }
        }
    }

    public ObservableRepeat(Observable<T> observable, long j10) {
        super(observable);
        this.count = j10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        long j10 = this.count;
        new RepeatObserver(observer, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, sequentialDisposable, this.source).subscribeNext();
    }
}
