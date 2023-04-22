package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ObservableMergeWithSingle<T> extends AbstractObservableWithUpstream<T, T> {
    public final SingleSource<? extends T> other;

    /* loaded from: classes2.dex */
    public static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        public static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        public static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        public volatile boolean disposed;
        public final Observer<? super T> downstream;
        public volatile boolean mainDone;
        public volatile int otherState;
        public volatile SimplePlainQueue<T> queue;
        public T singleItem;
        public final AtomicReference<Disposable> mainDisposable = new AtomicReference<>();
        public final OtherObserver<T> otherObserver = new OtherObserver<>(this);
        public final AtomicThrowable error = new AtomicThrowable();

        /* loaded from: classes2.dex */
        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            public final MergeWithObserver<T> parent;

            public OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.parent.otherError(th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t2) {
                this.parent.otherSuccess(t2);
            }
        }

        public MergeWithObserver(Observer<? super T> observer) {
            this.downstream = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            DisposableHelper.dispose(this.mainDisposable);
            DisposableHelper.dispose(this.otherObserver);
            if (getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            Observer<? super T> observer = this.downstream;
            int i10 = 1;
            do {
                while (!this.disposed) {
                    if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        observer.onError(this.error.terminate());
                        return;
                    }
                    int i11 = this.otherState;
                    if (i11 == 1) {
                        this.singleItem = null;
                        this.otherState = 2;
                        observer.onNext((T) this.singleItem);
                        i11 = 2;
                    }
                    boolean z10 = this.mainDone;
                    SimplePlainQueue<T> simplePlainQueue = this.queue;
                    T poll = simplePlainQueue != null ? simplePlainQueue.poll() : (Object) null;
                    boolean z11 = poll == null;
                    if (z10 && z11 && i11 == 2) {
                        this.queue = null;
                        observer.onComplete();
                        return;
                    } else if (z11) {
                        i10 = addAndGet(-i10);
                    } else {
                        observer.onNext(poll);
                    }
                }
                this.singleItem = null;
                this.queue = null;
                return;
            } while (i10 != 0);
        }

        public SimplePlainQueue<T> getOrCreateQueue() {
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            if (simplePlainQueue == null) {
                SpscLinkedArrayQueue spscLinkedArrayQueue = new SpscLinkedArrayQueue(Observable.bufferSize());
                this.queue = spscLinkedArrayQueue;
                return spscLinkedArrayQueue;
            }
            return simplePlainQueue;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.mainDisposable.get());
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.mainDone = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            DisposableHelper.dispose(this.otherObserver);
            drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t2) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t2);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t2);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.mainDisposable, disposable);
        }

        public void otherError(Throwable th) {
            if (!this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            DisposableHelper.dispose(this.mainDisposable);
            drain();
        }

        public void otherSuccess(T t2) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t2);
                this.otherState = 2;
            } else {
                this.singleItem = t2;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }
    }

    public ObservableMergeWithSingle(Observable<T> observable, SingleSource<? extends T> singleSource) {
        super(observable);
        this.other = singleSource;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(observer);
        observer.onSubscribe(mergeWithObserver);
        this.source.subscribe(mergeWithObserver);
        this.other.subscribe(mergeWithObserver.otherObserver);
    }
}
