package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ObservableFlatMap<T, U> extends AbstractObservableWithUpstream<T, U> {
    public final int bufferSize;
    public final boolean delayErrors;
    public final Function<? super T, ? extends ObservableSource<? extends U>> mapper;
    public final int maxConcurrency;

    /* loaded from: classes2.dex */
    public static final class InnerObserver<T, U> extends AtomicReference<Disposable> implements Observer<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        public volatile boolean done;
        public int fusionMode;

        /* renamed from: id  reason: collision with root package name */
        public final long f10758id;
        public final MergeObserver<T, U> parent;
        public volatile SimpleQueue<U> queue;

        public InnerObserver(MergeObserver<T, U> mergeObserver, long j10) {
            this.f10758id = j10;
            this.parent = mergeObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!this.parent.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            MergeObserver<T, U> mergeObserver = this.parent;
            if (!mergeObserver.delayErrors) {
                mergeObserver.disposeAll();
            }
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(U u2) {
            if (this.fusionMode == 0) {
                this.parent.tryEmit(u2, this);
            } else {
                this.parent.drain();
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) && (disposable instanceof QueueDisposable)) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int requestFusion = queueDisposable.requestFusion(7);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = queueDisposable;
                    this.done = true;
                    this.parent.drain();
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = queueDisposable;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class MergeObserver<T, U> extends AtomicInteger implements Disposable, Observer<T> {
        private static final long serialVersionUID = -2117620485640801370L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final Observer<? super U> downstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public long lastId;
        public int lastIndex;
        public final Function<? super T, ? extends ObservableSource<? extends U>> mapper;
        public final int maxConcurrency;
        public final AtomicReference<InnerObserver<?, ?>[]> observers;
        public volatile SimplePlainQueue<U> queue;
        public Queue<ObservableSource<? extends U>> sources;
        public long uniqueId;
        public Disposable upstream;
        public int wip;
        public static final InnerObserver<?, ?>[] EMPTY = new InnerObserver[0];
        public static final InnerObserver<?, ?>[] CANCELLED = new InnerObserver[0];

        public MergeObserver(Observer<? super U> observer, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z10, int i10, int i11) {
            this.downstream = observer;
            this.mapper = function;
            this.delayErrors = z10;
            this.maxConcurrency = i10;
            this.bufferSize = i11;
            if (i10 != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i10);
            }
            this.observers = new AtomicReference<>(EMPTY);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean addInner(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                if (innerObserverArr == CANCELLED) {
                    innerObserver.dispose();
                    return false;
                }
                int length = innerObserverArr.length;
                innerObserverArr2 = new InnerObserver[length + 1];
                System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                innerObserverArr2[length] = innerObserver;
            } while (!this.observers.compareAndSet(innerObserverArr, innerObserverArr2));
            return true;
        }

        public boolean checkTerminate() {
            if (this.cancelled) {
                return true;
            }
            Throwable th = this.errors.get();
            if (this.delayErrors || th == null) {
                return false;
            }
            disposeAll();
            Throwable terminate = this.errors.terminate();
            if (terminate != ExceptionHelper.TERMINATED) {
                this.downstream.onError(terminate);
            }
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Throwable terminate;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            if (!disposeAll() || (terminate = this.errors.terminate()) == null || terminate == ExceptionHelper.TERMINATED) {
                return;
            }
            RxJavaPlugins.onError(terminate);
        }

        public boolean disposeAll() {
            InnerObserver<?, ?>[] andSet;
            this.upstream.dispose();
            InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
            InnerObserver<?, ?>[] innerObserverArr2 = CANCELLED;
            if (innerObserverArr == innerObserverArr2 || (andSet = this.observers.getAndSet(innerObserverArr2)) == innerObserverArr2) {
                return false;
            }
            for (InnerObserver<?, ?> innerObserver : andSet) {
                innerObserver.dispose();
            }
            return true;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            int i10;
            Observer<? super U> observer = this.downstream;
            int i11 = 1;
            while (true) {
                while (!checkTerminate()) {
                    SimplePlainQueue<U> simplePlainQueue = this.queue;
                    int i12 = 0;
                    if (simplePlainQueue != null) {
                        while (!checkTerminate()) {
                            Object obj = (U) simplePlainQueue.poll();
                            if (obj != null) {
                                observer.onNext(obj);
                                i12++;
                            }
                        }
                        return;
                    }
                    if (i12 == 0) {
                        boolean z10 = this.done;
                        SimplePlainQueue<U> simplePlainQueue2 = this.queue;
                        InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
                        int length = innerObserverArr.length;
                        if (this.maxConcurrency != Integer.MAX_VALUE) {
                            synchronized (this) {
                                i10 = this.sources.size();
                            }
                        } else {
                            i10 = 0;
                        }
                        if (z10 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0 && i10 == 0)) {
                            Throwable terminate = this.errors.terminate();
                            if (terminate != ExceptionHelper.TERMINATED) {
                                if (terminate == null) {
                                    observer.onComplete();
                                    return;
                                }
                                observer.onError(terminate);
                            }
                            return;
                        }
                        if (length != 0) {
                            long j10 = this.lastId;
                            int i13 = this.lastIndex;
                            if (length <= i13 || innerObserverArr[i13].f10758id != j10) {
                                if (length <= i13) {
                                    i13 = 0;
                                }
                                for (int i14 = 0; i14 < length && innerObserverArr[i13].f10758id != j10; i14++) {
                                    i13++;
                                    if (i13 == length) {
                                        i13 = 0;
                                    }
                                }
                                this.lastIndex = i13;
                                this.lastId = innerObserverArr[i13].f10758id;
                            }
                            for (int i15 = 0; i15 < length; i15++) {
                                if (checkTerminate()) {
                                    return;
                                }
                                InnerObserver<T, U> innerObserver = innerObserverArr[i13];
                                SimpleQueue<U> simpleQueue = innerObserver.queue;
                                if (simpleQueue != null) {
                                    while (true) {
                                        try {
                                            Object obj2 = (U) simpleQueue.poll();
                                            if (obj2 == null) {
                                                break;
                                            }
                                            observer.onNext(obj2);
                                            if (checkTerminate()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.throwIfFatal(th);
                                            innerObserver.dispose();
                                            this.errors.addThrowable(th);
                                            if (checkTerminate()) {
                                                return;
                                            }
                                            removeInner(innerObserver);
                                            i12++;
                                            i13++;
                                            if (i13 == length) {
                                            }
                                        }
                                    }
                                }
                                boolean z11 = innerObserver.done;
                                SimpleQueue<U> simpleQueue2 = innerObserver.queue;
                                if (z11) {
                                    if (simpleQueue2 != null) {
                                        if (simpleQueue2.isEmpty()) {
                                        }
                                    }
                                    removeInner(innerObserver);
                                    if (checkTerminate()) {
                                        return;
                                    }
                                    i12++;
                                }
                                i13++;
                                if (i13 == length) {
                                    i13 = 0;
                                }
                            }
                            this.lastIndex = i13;
                            this.lastId = innerObserverArr[i13].f10758id;
                        }
                        if (i12 == 0) {
                            i11 = addAndGet(-i11);
                            if (i11 == 0) {
                                return;
                            }
                        } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                            subscribeMore(i12);
                        }
                    } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                        subscribeMore(i12);
                    }
                }
                return;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t2) {
            if (this.done) {
                return;
            }
            try {
                ObservableSource<? extends U> observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.mapper.apply(t2), "The mapper returned a null ObservableSource");
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i10 = this.wip;
                        if (i10 == this.maxConcurrency) {
                            this.sources.offer(observableSource);
                            return;
                        }
                        this.wip = i10 + 1;
                    }
                }
                subscribeInner(observableSource);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public void removeInner(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver<?, ?>[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                int length = innerObserverArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    } else if (innerObserverArr[i11] == innerObserver) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr2 = EMPTY;
                } else {
                    InnerObserver<?, ?>[] innerObserverArr3 = new InnerObserver[length - 1];
                    System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i10);
                    System.arraycopy(innerObserverArr, i10 + 1, innerObserverArr3, i10, (length - i10) - 1);
                    innerObserverArr2 = innerObserverArr3;
                }
            } while (!this.observers.compareAndSet(innerObserverArr, innerObserverArr2));
        }

        public void subscribeInner(ObservableSource<? extends U> observableSource) {
            ObservableSource<? extends U> poll;
            while (true) {
                if (!(observableSource instanceof Callable)) {
                    long j10 = this.uniqueId;
                    this.uniqueId = 1 + j10;
                    InnerObserver<T, U> innerObserver = new InnerObserver<>(this, j10);
                    if (addInner(innerObserver)) {
                        observableSource.subscribe(innerObserver);
                    }
                } else if (!tryEmitScalar((Callable) observableSource) || this.maxConcurrency == Integer.MAX_VALUE) {
                    break;
                } else {
                    boolean z10 = false;
                    synchronized (this) {
                        poll = this.sources.poll();
                        if (poll == null) {
                            this.wip--;
                            z10 = true;
                        }
                    }
                    if (z10) {
                        drain();
                        return;
                    }
                    observableSource = poll;
                }
            }
        }

        public void subscribeMore(int i10) {
            while (true) {
                int i11 = i10 - 1;
                if (i10 == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        ObservableSource<? extends U> poll = this.sources.poll();
                        if (poll == null) {
                            this.wip--;
                        } else {
                            subscribeInner(poll);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                i10 = i11;
            }
        }

        public void tryEmit(U u2, InnerObserver<T, U> innerObserver) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(u2);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue simpleQueue = innerObserver.queue;
                if (simpleQueue == null) {
                    simpleQueue = new SpscLinkedArrayQueue(this.bufferSize);
                    innerObserver.queue = simpleQueue;
                }
                simpleQueue.offer(u2);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public boolean tryEmitScalar(Callable<? extends U> callable) {
            try {
                U call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.downstream.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    SimplePlainQueue<U> simplePlainQueue = this.queue;
                    if (simplePlainQueue == null) {
                        simplePlainQueue = this.maxConcurrency == Integer.MAX_VALUE ? new SpscLinkedArrayQueue<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                        this.queue = simplePlainQueue;
                    }
                    if (!simplePlainQueue.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                drainLoop();
                return true;
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.errors.addThrowable(th);
                drain();
                return true;
            }
        }
    }

    public ObservableFlatMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z10, int i10, int i11) {
        super(observableSource);
        this.mapper = function;
        this.delayErrors = z10;
        this.maxConcurrency = i10;
        this.bufferSize = i11;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        if (ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.mapper)) {
            return;
        }
        this.source.subscribe(new MergeObserver(observer, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
