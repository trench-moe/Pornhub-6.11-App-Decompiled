package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ObservableBufferTimed<T, U extends Collection<? super T>> extends AbstractObservableWithUpstream<T, U> {
    public final Callable<U> bufferSupplier;
    public final int maxSize;
    public final boolean restartTimerOnMaxSize;
    public final Scheduler scheduler;
    public final long timeskip;
    public final long timespan;
    public final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class BufferExactBoundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        public U buffer;
        public final Callable<U> bufferSupplier;
        public long consumerIndex;
        public final int maxSize;
        public long producerIndex;
        public final boolean restartTimerOnMaxSize;
        public Disposable timer;
        public final long timespan;
        public final TimeUnit unit;
        public Disposable upstream;

        /* renamed from: w  reason: collision with root package name */
        public final Scheduler.Worker f10750w;

        public BufferExactBoundedObserver(Observer<? super U> observer, Callable<U> callable, long j10, TimeUnit timeUnit, int i10, boolean z10, Scheduler.Worker worker) {
            super(observer, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j10;
            this.unit = timeUnit;
            this.maxSize = i10;
            this.restartTimerOnMaxSize = z10;
            this.f10750w = worker;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(Observer observer, Object obj) {
            accept((Observer<? super Observer>) observer, (Observer) ((Collection) obj));
        }

        public void accept(Observer<? super U> observer, U u2) {
            observer.onNext(u2);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            this.f10750w.dispose();
            synchronized (this) {
                this.buffer = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            U u2;
            this.f10750w.dispose();
            synchronized (this) {
                try {
                    u2 = this.buffer;
                    this.buffer = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (u2 != null) {
                this.queue.offer(u2);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this, this);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            synchronized (this) {
                try {
                    this.buffer = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.downstream.onError(th);
            this.f10750w.dispose();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t2) {
            synchronized (this) {
                try {
                    U u2 = this.buffer;
                    if (u2 == null) {
                        return;
                    }
                    u2.add(t2);
                    if (u2.size() < this.maxSize) {
                        return;
                    }
                    this.buffer = null;
                    this.producerIndex++;
                    if (this.restartTimerOnMaxSize) {
                        this.timer.dispose();
                    }
                    fastPathOrderedEmit(u2, false, this);
                    try {
                        U u10 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                        synchronized (this) {
                            this.buffer = u10;
                            this.consumerIndex++;
                        }
                        if (this.restartTimerOnMaxSize) {
                            Scheduler.Worker worker = this.f10750w;
                            long j10 = this.timespan;
                            this.timer = worker.schedulePeriodically(this, j10, j10, this.unit);
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.downstream.onError(th);
                        dispose();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f10750w;
                    long j10 = this.timespan;
                    this.timer = worker.schedulePeriodically(this, j10, j10, this.unit);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    disposable.dispose();
                    EmptyDisposable.error(th, this.downstream);
                    this.f10750w.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u2 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u10 = this.buffer;
                    if (u10 != null && this.producerIndex == this.consumerIndex) {
                        this.buffer = u2;
                        fastPathOrderedEmit(u10, false, this);
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                dispose();
                this.downstream.onError(th);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class BufferExactUnboundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        public U buffer;
        public final Callable<U> bufferSupplier;
        public final Scheduler scheduler;
        public final AtomicReference<Disposable> timer;
        public final long timespan;
        public final TimeUnit unit;
        public Disposable upstream;

        public BufferExactUnboundedObserver(Observer<? super U> observer, Callable<U> callable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            super(observer, new MpscLinkedQueue());
            this.timer = new AtomicReference<>();
            this.bufferSupplier = callable;
            this.timespan = j10;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(Observer observer, Object obj) {
            accept((Observer<? super Observer>) observer, (Observer) ((Collection) obj));
        }

        public void accept(Observer<? super U> observer, U u2) {
            this.downstream.onNext(u2);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.timer);
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.timer.get() == DisposableHelper.DISPOSED;
        }

        /* JADX WARN: Finally extract failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            U u2;
            synchronized (this) {
                try {
                    u2 = this.buffer;
                    this.buffer = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (u2 != null) {
                this.queue.offer(u2);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainLoop(this.queue, this.downstream, false, null, this);
                }
            }
            DisposableHelper.dispose(this.timer);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            synchronized (this) {
                try {
                    this.buffer = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.downstream.onError(th);
            DisposableHelper.dispose(this.timer);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t2) {
            synchronized (this) {
                U u2 = this.buffer;
                if (u2 == null) {
                    return;
                }
                u2.add(t2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    Scheduler scheduler = this.scheduler;
                    long j10 = this.timespan;
                    Disposable schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j10, j10, this.unit);
                    if (this.timer.compareAndSet(null, schedulePeriodicallyDirect)) {
                        return;
                    }
                    schedulePeriodicallyDirect.dispose();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    dispose();
                    EmptyDisposable.error(th, this.downstream);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u2;
            try {
                U u10 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    u2 = this.buffer;
                    if (u2 != null) {
                        this.buffer = u10;
                    }
                }
                if (u2 == null) {
                    DisposableHelper.dispose(this.timer);
                } else {
                    fastPathEmit(u2, false, this);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
                dispose();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class BufferSkipBoundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        public final Callable<U> bufferSupplier;
        public final List<U> buffers;
        public final long timeskip;
        public final long timespan;
        public final TimeUnit unit;
        public Disposable upstream;

        /* renamed from: w  reason: collision with root package name */
        public final Scheduler.Worker f10751w;

        /* loaded from: classes2.dex */
        public final class RemoveFromBuffer implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private final U f10752b;

            public RemoveFromBuffer(U u2) {
                this.f10752b = u2;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (BufferSkipBoundedObserver.this) {
                    try {
                        BufferSkipBoundedObserver.this.buffers.remove(this.f10752b);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                BufferSkipBoundedObserver bufferSkipBoundedObserver = BufferSkipBoundedObserver.this;
                bufferSkipBoundedObserver.fastPathOrderedEmit(this.f10752b, false, bufferSkipBoundedObserver.f10751w);
            }
        }

        /* loaded from: classes2.dex */
        public final class RemoveFromBufferEmit implements Runnable {
            private final U buffer;

            public RemoveFromBufferEmit(U u2) {
                this.buffer = u2;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (BufferSkipBoundedObserver.this) {
                    try {
                        BufferSkipBoundedObserver.this.buffers.remove(this.buffer);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                BufferSkipBoundedObserver bufferSkipBoundedObserver = BufferSkipBoundedObserver.this;
                bufferSkipBoundedObserver.fastPathOrderedEmit(this.buffer, false, bufferSkipBoundedObserver.f10751w);
            }
        }

        public BufferSkipBoundedObserver(Observer<? super U> observer, Callable<U> callable, long j10, long j11, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(observer, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j10;
            this.timeskip = j11;
            this.unit = timeUnit;
            this.f10751w = worker;
            this.buffers = new LinkedList();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(Observer observer, Object obj) {
            accept((Observer<? super Observer>) observer, (Observer) ((Collection) obj));
        }

        public void accept(Observer<? super U> observer, U u2) {
            observer.onNext(u2);
        }

        public void clear() {
            synchronized (this) {
                this.buffers.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                clear();
                this.upstream.dispose();
                this.f10751w.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        /* JADX WARN: Finally extract failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                try {
                    arrayList = new ArrayList(this.buffers);
                    this.buffers.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.queue.offer((Collection) it.next());
            }
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this.f10751w, this);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.done = true;
            clear();
            this.downstream.onError(th);
            this.f10751w.dispose();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t2) {
            synchronized (this) {
                for (U u2 : this.buffers) {
                    u2.add(t2);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                try {
                    Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    this.buffers.add(collection);
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f10751w;
                    long j10 = this.timeskip;
                    worker.schedulePeriodically(this, j10, j10, this.unit);
                    this.f10751w.schedule(new RemoveFromBufferEmit(collection), this.timespan, this.unit);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    disposable.dispose();
                    EmptyDisposable.error(th, this.downstream);
                    this.f10751w.dispose();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                return;
            }
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    if (this.cancelled) {
                        return;
                    }
                    this.buffers.add(collection);
                    this.f10751w.schedule(new RemoveFromBuffer(collection), this.timespan, this.unit);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
                dispose();
            }
        }
    }

    public ObservableBufferTimed(ObservableSource<T> observableSource, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable, int i10, boolean z10) {
        super(observableSource);
        this.timespan = j10;
        this.timeskip = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSupplier = callable;
        this.maxSize = i10;
        this.restartTimerOnMaxSize = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        if (this.timespan == this.timeskip && this.maxSize == Integer.MAX_VALUE) {
            this.source.subscribe(new BufferExactUnboundedObserver(new SerializedObserver(observer), this.bufferSupplier, this.timespan, this.unit, this.scheduler));
            return;
        }
        Scheduler.Worker createWorker = this.scheduler.createWorker();
        if (this.timespan == this.timeskip) {
            this.source.subscribe(new BufferExactBoundedObserver(new SerializedObserver(observer), this.bufferSupplier, this.timespan, this.unit, this.maxSize, this.restartTimerOnMaxSize, createWorker));
        } else {
            this.source.subscribe(new BufferSkipBoundedObserver(new SerializedObserver(observer), this.bufferSupplier, this.timespan, this.timeskip, this.unit, createWorker));
        }
    }
}
