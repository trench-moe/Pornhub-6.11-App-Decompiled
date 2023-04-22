package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ObservableCombineLatest<T, R> extends Observable<R> {
    public final int bufferSize;
    public final Function<? super Object[], ? extends R> combiner;
    public final boolean delayError;
    public final ObservableSource<? extends T>[] sources;
    public final Iterable<? extends ObservableSource<? extends T>> sourcesIterable;

    /* loaded from: classes2.dex */
    public static final class CombinerObserver<T, R> extends AtomicReference<Disposable> implements Observer<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        public final int index;
        public final LatestCoordinator<T, R> parent;

        public CombinerObserver(LatestCoordinator<T, R> latestCoordinator, int i10) {
            this.parent = latestCoordinator;
            this.index = i10;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t2) {
            this.parent.innerNext(this.index, t2);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    /* loaded from: classes2.dex */
    public static final class LatestCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 8567835998786448817L;
        public int active;
        public volatile boolean cancelled;
        public final Function<? super Object[], ? extends R> combiner;
        public int complete;
        public final boolean delayError;
        public volatile boolean done;
        public final Observer<? super R> downstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public Object[] latest;
        public final CombinerObserver<T, R>[] observers;
        public final SpscLinkedArrayQueue<Object[]> queue;

        public LatestCoordinator(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i10, int i11, boolean z10) {
            this.downstream = observer;
            this.combiner = function;
            this.delayError = z10;
            this.latest = new Object[i10];
            CombinerObserver<T, R>[] combinerObserverArr = new CombinerObserver[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                combinerObserverArr[i12] = new CombinerObserver<>(this, i12);
            }
            this.observers = combinerObserverArr;
            this.queue = new SpscLinkedArrayQueue<>(i11);
        }

        public void cancelSources() {
            for (CombinerObserver<T, R> combinerObserver : this.observers) {
                combinerObserver.dispose();
            }
        }

        public void clear(SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            synchronized (this) {
                try {
                    this.latest = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            spscLinkedArrayQueue.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelSources();
                if (getAndIncrement() == 0) {
                    clear(this.queue);
                }
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object[]> spscLinkedArrayQueue = this.queue;
            Observer<? super R> observer = this.downstream;
            boolean z10 = this.delayError;
            int i10 = 1;
            do {
                while (!this.cancelled) {
                    if (!z10 && this.errors.get() != null) {
                        cancelSources();
                        clear(spscLinkedArrayQueue);
                        observer.onError(this.errors.terminate());
                        return;
                    }
                    boolean z11 = this.done;
                    Object[] poll = spscLinkedArrayQueue.poll();
                    boolean z12 = poll == null;
                    if (z11 && z12) {
                        clear(spscLinkedArrayQueue);
                        Throwable terminate = this.errors.terminate();
                        if (terminate == null) {
                            observer.onComplete();
                            return;
                        } else {
                            observer.onError(terminate);
                            return;
                        }
                    } else if (z12) {
                        i10 = addAndGet(-i10);
                    } else {
                        try {
                            observer.onNext((Object) ObjectHelper.requireNonNull(this.combiner.apply(poll), "The combiner returned a null value"));
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.errors.addThrowable(th);
                            cancelSources();
                            clear(spscLinkedArrayQueue);
                            observer.onError(this.errors.terminate());
                            return;
                        }
                    }
                }
                clear(spscLinkedArrayQueue);
                return;
            } while (i10 != 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void innerComplete(int r8) {
            /*
                r7 = this;
                r3 = r7
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.latest     // Catch: java.lang.Throwable -> L35
                if (r0 != 0) goto La
                r5 = 7
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
                r6 = 5
                return
            La:
                r6 = 2
                r8 = r0[r8]     // Catch: java.lang.Throwable -> L35
                r5 = 1
                r1 = r5
                if (r8 != 0) goto L15
                r6 = 7
                r6 = 1
                r8 = r6
                goto L17
            L15:
                r8 = 0
                r5 = 7
            L17:
                if (r8 != 0) goto L24
                r5 = 5
                int r2 = r3.complete     // Catch: java.lang.Throwable -> L35
                int r2 = r2 + r1
                r3.complete = r2     // Catch: java.lang.Throwable -> L35
                int r0 = r0.length     // Catch: java.lang.Throwable -> L35
                r5 = 4
                if (r2 != r0) goto L26
                r5 = 6
            L24:
                r3.done = r1     // Catch: java.lang.Throwable -> L35
            L26:
                r5 = 2
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
                if (r8 == 0) goto L2f
                r6 = 2
                r3.cancelSources()
                r6 = 6
            L2f:
                r5 = 1
                r3.drain()
                r5 = 5
                return
            L35:
                r8 = move-exception
                r5 = 3
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
                throw r8
                r6 = 6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator.innerComplete(int):void");
        }

        public void innerError(int i10, Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            boolean z10 = true;
            if (this.delayError) {
                synchronized (this) {
                    Object[] objArr = this.latest;
                    if (objArr == null) {
                        return;
                    }
                    boolean z11 = objArr[i10] == null;
                    if (!z11) {
                        int i11 = this.complete + 1;
                        this.complete = i11;
                        if (i11 == objArr.length) {
                        }
                        z10 = z11;
                    }
                    this.done = true;
                    z10 = z11;
                }
            }
            if (z10) {
                cancelSources();
            }
            drain();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void innerNext(int i10, T t2) {
            boolean z10;
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    if (objArr == null) {
                        return;
                    }
                    Object obj = objArr[i10];
                    int i11 = this.active;
                    if (obj == null) {
                        i11++;
                        this.active = i11;
                    }
                    objArr[i10] = t2;
                    if (i11 == objArr.length) {
                        this.queue.offer(objArr.clone());
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        drain();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void subscribe(ObservableSource<? extends T>[] observableSourceArr) {
            CombinerObserver<T, R>[] combinerObserverArr = this.observers;
            int length = combinerObserverArr.length;
            this.downstream.onSubscribe(this);
            for (int i10 = 0; i10 < length && !this.done && !this.cancelled; i10++) {
                observableSourceArr[i10].subscribe(combinerObserverArr[i10]);
            }
        }
    }

    public ObservableCombineLatest(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i10, boolean z10) {
        this.sources = observableSourceArr;
        this.sourcesIterable = iterable;
        this.combiner = function;
        this.bufferSize = i10;
        this.delayError = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        int length;
        ObservableSource<? extends T>[] observableSourceArr = this.sources;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            length = 0;
            for (ObservableSource<? extends T> observableSource : this.sourcesIterable) {
                if (length == observableSourceArr.length) {
                    ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                    System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                    observableSourceArr = observableSourceArr2;
                }
                observableSourceArr[length] = observableSource;
                length++;
            }
        } else {
            length = observableSourceArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            EmptyDisposable.complete(observer);
        } else {
            new LatestCoordinator(observer, this.combiner, i10, this.bufferSize, this.delayError).subscribe(observableSourceArr);
        }
    }
}
