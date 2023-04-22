package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends AbstractFlowableWithUpstream<T, U> {
    public final Function<? super Open, ? extends b<? extends Close>> bufferClose;
    public final b<? extends Open> bufferOpen;
    public final Callable<U> bufferSupplier;

    /* loaded from: classes2.dex */
    public static final class BufferBoundarySubscriber<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -8466418554264089604L;
        public final Function<? super Open, ? extends b<? extends Close>> bufferClose;
        public final b<? extends Open> bufferOpen;
        public final Callable<C> bufferSupplier;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final c<? super C> downstream;
        public long emitted;
        public long index;
        public final SpscLinkedArrayQueue<C> queue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
        public final CompositeDisposable subscribers = new CompositeDisposable();
        public final AtomicLong requested = new AtomicLong();
        public final AtomicReference<d> upstream = new AtomicReference<>();
        public Map<Long, C> buffers = new LinkedHashMap();
        public final AtomicThrowable errors = new AtomicThrowable();

        /* loaded from: classes2.dex */
        public static final class BufferOpenSubscriber<Open> extends AtomicReference<d> implements FlowableSubscriber<Open>, Disposable {
            private static final long serialVersionUID = -8498650778633225126L;
            public final BufferBoundarySubscriber<?, ?, Open, ?> parent;

            public BufferOpenSubscriber(BufferBoundarySubscriber<?, ?, Open, ?> bufferBoundarySubscriber) {
                this.parent = bufferBoundarySubscriber;
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                SubscriptionHelper.cancel(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return get() == SubscriptionHelper.CANCELLED;
            }

            @Override // io.reactivex.FlowableSubscriber, df.c
            public void onComplete() {
                lazySet(SubscriptionHelper.CANCELLED);
                this.parent.openComplete(this);
            }

            @Override // io.reactivex.FlowableSubscriber, df.c
            public void onError(Throwable th) {
                lazySet(SubscriptionHelper.CANCELLED);
                this.parent.boundaryError(this, th);
            }

            @Override // io.reactivex.FlowableSubscriber, df.c
            public void onNext(Open open) {
                this.parent.open(open);
            }

            @Override // io.reactivex.FlowableSubscriber, df.c
            public void onSubscribe(d dVar) {
                SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
            }
        }

        public BufferBoundarySubscriber(c<? super C> cVar, b<? extends Open> bVar, Function<? super Open, ? extends b<? extends Close>> function, Callable<C> callable) {
            this.downstream = cVar;
            this.bufferSupplier = callable;
            this.bufferOpen = bVar;
            this.bufferClose = function;
        }

        public void boundaryError(Disposable disposable, Throwable th) {
            SubscriptionHelper.cancel(this.upstream);
            this.subscribers.delete(disposable);
            onError(th);
        }

        /* JADX WARN: Finally extract failed */
        @Override // df.d
        public void cancel() {
            if (SubscriptionHelper.cancel(this.upstream)) {
                this.cancelled = true;
                this.subscribers.dispose();
                synchronized (this) {
                    try {
                        this.buffers = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (getAndIncrement() != 0) {
                    this.queue.clear();
                }
            }
        }

        public void close(BufferCloseSubscriber<T, C> bufferCloseSubscriber, long j10) {
            boolean z10;
            this.subscribers.delete(bufferCloseSubscriber);
            if (this.subscribers.size() == 0) {
                SubscriptionHelper.cancel(this.upstream);
                z10 = true;
            } else {
                z10 = false;
            }
            synchronized (this) {
                try {
                    Map<Long, C> map = this.buffers;
                    if (map == null) {
                        return;
                    }
                    this.queue.offer(map.remove(Long.valueOf(j10)));
                    if (z10) {
                        this.done = true;
                    }
                    drain();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void drain() {
            int i10;
            if (getAndIncrement() != 0) {
                return;
            }
            long j10 = this.emitted;
            c<? super C> cVar = this.downstream;
            SpscLinkedArrayQueue<C> spscLinkedArrayQueue = this.queue;
            int i11 = 1;
            do {
                long j11 = this.requested.get();
                while (true) {
                    i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                    if (i10 == 0) {
                        break;
                    } else if (this.cancelled) {
                        spscLinkedArrayQueue.clear();
                        return;
                    } else {
                        boolean z10 = this.done;
                        if (z10 && this.errors.get() != null) {
                            spscLinkedArrayQueue.clear();
                            cVar.onError(this.errors.terminate());
                            return;
                        }
                        C poll = spscLinkedArrayQueue.poll();
                        boolean z11 = poll == null;
                        if (z10 && z11) {
                            cVar.onComplete();
                            return;
                        } else if (z11) {
                            break;
                        } else {
                            cVar.onNext(poll);
                            j10++;
                        }
                    }
                }
                if (i10 == 0) {
                    if (this.cancelled) {
                        spscLinkedArrayQueue.clear();
                        return;
                    } else if (this.done) {
                        if (this.errors.get() != null) {
                            spscLinkedArrayQueue.clear();
                            cVar.onError(this.errors.terminate());
                            return;
                        } else if (spscLinkedArrayQueue.isEmpty()) {
                            cVar.onComplete();
                            return;
                        }
                    }
                }
                this.emitted = j10;
                i11 = addAndGet(-i11);
            } while (i11 != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.subscribers.dispose();
            synchronized (this) {
                try {
                    Map<Long, C> map = this.buffers;
                    if (map == null) {
                        return;
                    }
                    for (C c10 : map.values()) {
                        this.queue.offer(c10);
                    }
                    this.buffers = null;
                    this.done = true;
                    drain();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.subscribers.dispose();
            synchronized (this) {
                this.buffers = null;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                for (C c10 : map.values()) {
                    c10.add(t2);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                BufferOpenSubscriber bufferOpenSubscriber = new BufferOpenSubscriber(this);
                this.subscribers.add(bufferOpenSubscriber);
                this.bufferOpen.subscribe(bufferOpenSubscriber);
                dVar.request(Long.MAX_VALUE);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void open(Open open) {
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null Collection");
                b bVar = (b) ObjectHelper.requireNonNull(this.bufferClose.apply(open), "The bufferClose returned a null Publisher");
                long j10 = this.index;
                this.index = 1 + j10;
                synchronized (this) {
                    Map<Long, C> map = this.buffers;
                    if (map == 0) {
                        return;
                    }
                    map.put(Long.valueOf(j10), collection);
                    BufferCloseSubscriber bufferCloseSubscriber = new BufferCloseSubscriber(this, j10);
                    this.subscribers.add(bufferCloseSubscriber);
                    bVar.subscribe(bufferCloseSubscriber);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                SubscriptionHelper.cancel(this.upstream);
                onError(th);
            }
        }

        public void openComplete(BufferOpenSubscriber<Open> bufferOpenSubscriber) {
            this.subscribers.delete(bufferOpenSubscriber);
            if (this.subscribers.size() == 0) {
                SubscriptionHelper.cancel(this.upstream);
                this.done = true;
                drain();
            }
        }

        @Override // df.d
        public void request(long j10) {
            BackpressureHelper.add(this.requested, j10);
            drain();
        }
    }

    /* loaded from: classes2.dex */
    public static final class BufferCloseSubscriber<T, C extends Collection<? super T>> extends AtomicReference<d> implements FlowableSubscriber<Object>, Disposable {
        private static final long serialVersionUID = -8498650778633225126L;
        public final long index;
        public final BufferBoundarySubscriber<T, C, ?, ?> parent;

        public BufferCloseSubscriber(BufferBoundarySubscriber<T, C, ?, ?> bufferBoundarySubscriber, long j10) {
            this.parent = bufferBoundarySubscriber;
            this.index = j10;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            d dVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (dVar != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.parent.close(this, this.index);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            d dVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (dVar == subscriptionHelper) {
                RxJavaPlugins.onError(th);
                return;
            }
            lazySet(subscriptionHelper);
            this.parent.boundaryError(this, th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(Object obj) {
            d dVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (dVar != subscriptionHelper) {
                lazySet(subscriptionHelper);
                dVar.cancel();
                this.parent.close(this, this.index);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
        }
    }

    public FlowableBufferBoundary(Flowable<T> flowable, b<? extends Open> bVar, Function<? super Open, ? extends b<? extends Close>> function, Callable<U> callable) {
        super(flowable);
        this.bufferOpen = bVar;
        this.bufferClose = function;
        this.bufferSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super U> cVar) {
        BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(cVar, this.bufferOpen, this.bufferClose, this.bufferSupplier);
        cVar.onSubscribe(bufferBoundarySubscriber);
        this.source.subscribe((FlowableSubscriber) bufferBoundarySubscriber);
    }
}
