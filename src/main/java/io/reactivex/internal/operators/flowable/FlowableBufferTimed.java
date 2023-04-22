package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableBufferTimed<T, U extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, U> {
    public final Callable<U> bufferSupplier;
    public final int maxSize;
    public final boolean restartTimerOnMaxSize;
    public final Scheduler scheduler;
    public final long timeskip;
    public final long timespan;
    public final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class BufferExactBoundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements d, Runnable, Disposable {
        public U buffer;
        public final Callable<U> bufferSupplier;
        public long consumerIndex;
        public final int maxSize;
        public long producerIndex;
        public final boolean restartTimerOnMaxSize;
        public Disposable timer;
        public final long timespan;
        public final TimeUnit unit;
        public d upstream;

        /* renamed from: w  reason: collision with root package name */
        public final Scheduler.Worker f10731w;

        public BufferExactBoundedSubscriber(c<? super U> cVar, Callable<U> callable, long j10, TimeUnit timeUnit, int i10, boolean z10, Scheduler.Worker worker) {
            super(cVar, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j10;
            this.unit = timeUnit;
            this.maxSize = i10;
            this.restartTimerOnMaxSize = z10;
            this.f10731w = worker;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(c cVar, Object obj) {
            return accept((c<? super c>) cVar, (c) ((Collection) obj));
        }

        public boolean accept(c<? super U> cVar, U u2) {
            cVar.onNext(u2);
            return true;
        }

        @Override // df.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            synchronized (this) {
                this.buffer = null;
            }
            this.upstream.cancel();
            this.f10731w.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f10731w.isDisposed();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            U u2;
            synchronized (this) {
                try {
                    u2 = this.buffer;
                    this.buffer = null;
                } finally {
                }
            }
            if (u2 != null) {
                this.queue.offer(u2);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
                }
                this.f10731w.dispose();
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th);
            this.f10731w.dispose();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            synchronized (this) {
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
                fastPathOrderedEmitMax(u2, false, this);
                try {
                    U u10 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    synchronized (this) {
                        try {
                            this.buffer = u10;
                            this.consumerIndex++;
                        } finally {
                        }
                    }
                    if (this.restartTimerOnMaxSize) {
                        Scheduler.Worker worker = this.f10731w;
                        long j10 = this.timespan;
                        this.timer = worker.schedulePeriodically(this, j10, j10, this.unit);
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    this.downstream.onError(th);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f10731w;
                    long j10 = this.timespan;
                    this.timer = worker.schedulePeriodically(this, j10, j10, this.unit);
                    dVar.request(Long.MAX_VALUE);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.f10731w.dispose();
                    dVar.cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        @Override // df.d
        public void request(long j10) {
            requested(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u2 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u10 = this.buffer;
                    if (u10 != null && this.producerIndex == this.consumerIndex) {
                        this.buffer = u2;
                        fastPathOrderedEmitMax(u10, false, this);
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                this.downstream.onError(th);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class BufferExactUnboundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements d, Runnable, Disposable {
        public U buffer;
        public final Callable<U> bufferSupplier;
        public final Scheduler scheduler;
        public final AtomicReference<Disposable> timer;
        public final long timespan;
        public final TimeUnit unit;
        public d upstream;

        public BufferExactUnboundedSubscriber(c<? super U> cVar, Callable<U> callable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            super(cVar, new MpscLinkedQueue());
            this.timer = new AtomicReference<>();
            this.bufferSupplier = callable;
            this.timespan = j10;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(c cVar, Object obj) {
            return accept((c<? super c>) cVar, (c) ((Collection) obj));
        }

        public boolean accept(c<? super U> cVar, U u2) {
            this.downstream.onNext(u2);
            return true;
        }

        @Override // df.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            DisposableHelper.dispose(this.timer);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.timer.get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            DisposableHelper.dispose(this.timer);
            synchronized (this) {
                try {
                    U u2 = this.buffer;
                    if (u2 == null) {
                        return;
                    }
                    this.buffer = null;
                    this.queue.offer(u2);
                    this.done = true;
                    if (enter()) {
                        QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, null, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.timer);
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            synchronized (this) {
                U u2 = this.buffer;
                if (u2 != null) {
                    u2.add(t2);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    dVar.request(Long.MAX_VALUE);
                    Scheduler scheduler = this.scheduler;
                    long j10 = this.timespan;
                    Disposable schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j10, j10, this.unit);
                    if (this.timer.compareAndSet(null, schedulePeriodicallyDirect)) {
                        return;
                    }
                    schedulePeriodicallyDirect.dispose();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        @Override // df.d
        public void request(long j10) {
            requested(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u2 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u10 = this.buffer;
                    if (u10 == null) {
                        return;
                    }
                    this.buffer = u2;
                    fastPathEmitMax(u10, false, this);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                this.downstream.onError(th);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class BufferSkipBoundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements d, Runnable {
        public final Callable<U> bufferSupplier;
        public final List<U> buffers;
        public final long timeskip;
        public final long timespan;
        public final TimeUnit unit;
        public d upstream;

        /* renamed from: w  reason: collision with root package name */
        public final Scheduler.Worker f10732w;

        /* loaded from: classes2.dex */
        public final class RemoveFromBuffer implements Runnable {
            private final U buffer;

            public RemoveFromBuffer(U u2) {
                this.buffer = u2;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (BufferSkipBoundedSubscriber.this) {
                    BufferSkipBoundedSubscriber.this.buffers.remove(this.buffer);
                }
                BufferSkipBoundedSubscriber bufferSkipBoundedSubscriber = BufferSkipBoundedSubscriber.this;
                bufferSkipBoundedSubscriber.fastPathOrderedEmitMax(this.buffer, false, bufferSkipBoundedSubscriber.f10732w);
            }
        }

        public BufferSkipBoundedSubscriber(c<? super U> cVar, Callable<U> callable, long j10, long j11, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(cVar, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j10;
            this.timeskip = j11;
            this.unit = timeUnit;
            this.f10732w = worker;
            this.buffers = new LinkedList();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(c cVar, Object obj) {
            return accept((c<? super c>) cVar, (c) ((Collection) obj));
        }

        public boolean accept(c<? super U> cVar, U u2) {
            cVar.onNext(u2);
            return true;
        }

        @Override // df.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.f10732w.dispose();
            clear();
        }

        public void clear() {
            synchronized (this) {
                this.buffers.clear();
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.buffers);
                this.buffers.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.queue.offer((Collection) it.next());
            }
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this.f10732w, this);
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.done = true;
            this.f10732w.dispose();
            clear();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            synchronized (this) {
                for (U u2 : this.buffers) {
                    u2.add(t2);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                try {
                    Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.buffers.add(collection);
                    this.downstream.onSubscribe(this);
                    dVar.request(Long.MAX_VALUE);
                    Scheduler.Worker worker = this.f10732w;
                    long j10 = this.timeskip;
                    worker.schedulePeriodically(this, j10, j10, this.unit);
                    this.f10732w.schedule(new RemoveFromBuffer(collection), this.timespan, this.unit);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.f10732w.dispose();
                    dVar.cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        @Override // df.d
        public void request(long j10) {
            requested(j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                return;
            }
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                synchronized (this) {
                    if (this.cancelled) {
                        return;
                    }
                    this.buffers.add(collection);
                    this.f10732w.schedule(new RemoveFromBuffer(collection), this.timespan, this.unit);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                this.downstream.onError(th);
            }
        }
    }

    public FlowableBufferTimed(Flowable<T> flowable, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable, int i10, boolean z10) {
        super(flowable);
        this.timespan = j10;
        this.timeskip = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSupplier = callable;
        this.maxSize = i10;
        this.restartTimerOnMaxSize = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super U> cVar) {
        if (this.timespan == this.timeskip && this.maxSize == Integer.MAX_VALUE) {
            this.source.subscribe((FlowableSubscriber) new BufferExactUnboundedSubscriber(new SerializedSubscriber(cVar), this.bufferSupplier, this.timespan, this.unit, this.scheduler));
            return;
        }
        Scheduler.Worker createWorker = this.scheduler.createWorker();
        if (this.timespan == this.timeskip) {
            this.source.subscribe((FlowableSubscriber) new BufferExactBoundedSubscriber(new SerializedSubscriber(cVar), this.bufferSupplier, this.timespan, this.unit, this.maxSize, this.restartTimerOnMaxSize, createWorker));
        } else {
            this.source.subscribe((FlowableSubscriber) new BufferSkipBoundedSubscriber(new SerializedSubscriber(cVar), this.bufferSupplier, this.timespan, this.timeskip, this.unit, createWorker));
        }
    }
}
