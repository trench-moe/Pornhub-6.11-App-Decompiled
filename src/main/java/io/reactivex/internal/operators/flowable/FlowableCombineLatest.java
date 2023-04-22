package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableMap;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableCombineLatest<T, R> extends Flowable<R> {
    @Nullable
    public final b<? extends T>[] array;
    public final int bufferSize;
    public final Function<? super Object[], ? extends R> combiner;
    public final boolean delayErrors;
    @Nullable
    public final Iterable<? extends b<? extends T>> iterable;

    /* loaded from: classes2.dex */
    public static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        public volatile boolean cancelled;
        public final Function<? super Object[], ? extends R> combiner;
        public int completedSources;
        public final boolean delayErrors;
        public volatile boolean done;
        public final c<? super R> downstream;
        public final AtomicReference<Throwable> error;
        public final Object[] latest;
        public int nonEmptySources;
        public boolean outputFused;
        public final SpscLinkedArrayQueue<Object> queue;
        public final AtomicLong requested;
        public final CombineLatestInnerSubscriber<T>[] subscribers;

        public CombineLatestCoordinator(c<? super R> cVar, Function<? super Object[], ? extends R> function, int i10, int i11, boolean z10) {
            this.downstream = cVar;
            this.combiner = function;
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = new CombineLatestInnerSubscriber[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                combineLatestInnerSubscriberArr[i12] = new CombineLatestInnerSubscriber<>(this, i12, i11);
            }
            this.subscribers = combineLatestInnerSubscriberArr;
            this.latest = new Object[i10];
            this.queue = new SpscLinkedArrayQueue<>(i11);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
            this.delayErrors = z10;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void cancel() {
            this.cancelled = true;
            cancelAll();
        }

        public void cancelAll() {
            for (CombineLatestInnerSubscriber<T> combineLatestInnerSubscriber : this.subscribers) {
                combineLatestInnerSubscriber.cancel();
            }
        }

        public boolean checkTerminated(boolean z10, boolean z11, c<?> cVar, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                cancelAll();
                spscLinkedArrayQueue.clear();
                return true;
            } else if (z10) {
                if (this.delayErrors) {
                    if (z11) {
                        cancelAll();
                        Throwable terminate = ExceptionHelper.terminate(this.error);
                        if (terminate == null || terminate == ExceptionHelper.TERMINATED) {
                            cVar.onComplete();
                        } else {
                            cVar.onError(terminate);
                        }
                        return true;
                    }
                    return false;
                }
                Throwable terminate2 = ExceptionHelper.terminate(this.error);
                if (terminate2 != null && terminate2 != ExceptionHelper.TERMINATED) {
                    cancelAll();
                    spscLinkedArrayQueue.clear();
                    cVar.onError(terminate2);
                    return true;
                } else if (z11) {
                    cancelAll();
                    cVar.onComplete();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainOutput();
            } else {
                drainAsync();
            }
        }

        public void drainAsync() {
            int i10;
            c<? super R> cVar = this.downstream;
            SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.queue;
            int i11 = 1;
            do {
                long j10 = this.requested.get();
                long j11 = 0;
                while (true) {
                    i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
                    if (i10 == 0) {
                        break;
                    }
                    boolean z10 = this.done;
                    Object poll = spscLinkedArrayQueue.poll();
                    boolean z11 = poll == null;
                    if (checkTerminated(z10, z11, cVar, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    try {
                        cVar.onNext((Object) ObjectHelper.requireNonNull(this.combiner.apply((Object[]) spscLinkedArrayQueue.poll()), "The combiner returned a null value"));
                        ((CombineLatestInnerSubscriber) poll).requestOne();
                        j11++;
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        cancelAll();
                        ExceptionHelper.addThrowable(this.error, th);
                        cVar.onError(ExceptionHelper.terminate(this.error));
                        return;
                    }
                }
                if (i10 == 0 && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), cVar, spscLinkedArrayQueue)) {
                    return;
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j11);
                }
                i11 = addAndGet(-i11);
            } while (i11 != 0);
        }

        public void drainOutput() {
            c<? super R> cVar = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            int i10 = 1;
            while (!this.cancelled) {
                Throwable th = this.error.get();
                if (th != null) {
                    spscLinkedArrayQueue.clear();
                    cVar.onError(th);
                    return;
                }
                boolean z10 = this.done;
                boolean isEmpty = spscLinkedArrayQueue.isEmpty();
                if (!isEmpty) {
                    cVar.onNext(null);
                }
                if (z10 && isEmpty) {
                    cVar.onComplete();
                    return;
                }
                i10 = addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public void innerComplete(int i10) {
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    if (objArr[i10] != null) {
                        int i11 = this.completedSources + 1;
                        if (i11 != objArr.length) {
                            this.completedSources = i11;
                            return;
                        }
                        this.done = true;
                    } else {
                        this.done = true;
                    }
                    drain();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void innerError(int i10, Throwable th) {
            if (!ExceptionHelper.addThrowable(this.error, th)) {
                RxJavaPlugins.onError(th);
            } else if (this.delayErrors) {
                innerComplete(i10);
            } else {
                cancelAll();
                this.done = true;
                drain();
            }
        }

        public void innerValue(int i10, T t2) {
            boolean z10;
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    int i11 = this.nonEmptySources;
                    if (objArr[i10] == null) {
                        i11++;
                        this.nonEmptySources = i11;
                    }
                    objArr[i10] = t2;
                    if (objArr.length == i11) {
                        this.queue.offer(this.subscribers[i10], objArr.clone());
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z10) {
                this.subscribers[i10].requestOne();
            } else {
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() {
            Object poll = this.queue.poll();
            if (poll == null) {
                return null;
            }
            R r10 = (R) ObjectHelper.requireNonNull(this.combiner.apply((Object[]) this.queue.poll()), "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) poll).requestOne();
            return r10;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            boolean z10 = false;
            if ((i10 & 4) != 0) {
                return 0;
            }
            int i11 = i10 & 2;
            if (i11 != 0) {
                z10 = true;
            }
            this.outputFused = z10;
            return i11;
        }

        public void subscribe(b<? extends T>[] bVarArr, int i10) {
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = this.subscribers;
            for (int i11 = 0; i11 < i10 && !this.done; i11++) {
                if (this.cancelled) {
                    return;
                }
                bVarArr[i11].subscribe(combineLatestInnerSubscriberArr[i11]);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class CombineLatestInnerSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        public final int index;
        public final int limit;
        public final CombineLatestCoordinator<T, ?> parent;
        public final int prefetch;
        public int produced;

        public CombineLatestInnerSubscriber(CombineLatestCoordinator<T, ?> combineLatestCoordinator, int i10, int i11) {
            this.parent = combineLatestCoordinator;
            this.index = i10;
            this.prefetch = i11;
            this.limit = i11 - (i11 >> 2);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            this.parent.innerValue(this.index, t2);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, this.prefetch);
        }

        public void requestOne() {
            int i10 = this.produced + 1;
            if (i10 != this.limit) {
                this.produced = i10;
                return;
            }
            this.produced = 0;
            get().request(i10);
        }
    }

    /* loaded from: classes2.dex */
    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // io.reactivex.functions.Function
        public R apply(T t2) {
            return FlowableCombineLatest.this.combiner.apply(new Object[]{t2});
        }
    }

    public FlowableCombineLatest(@NonNull Iterable<? extends b<? extends T>> iterable, @NonNull Function<? super Object[], ? extends R> function, int i10, boolean z10) {
        this.array = null;
        this.iterable = iterable;
        this.combiner = function;
        this.bufferSize = i10;
        this.delayErrors = z10;
    }

    public FlowableCombineLatest(@NonNull b<? extends T>[] bVarArr, @NonNull Function<? super Object[], ? extends R> function, int i10, boolean z10) {
        this.array = bVarArr;
        this.iterable = null;
        this.combiner = function;
        this.bufferSize = i10;
        this.delayErrors = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        int length;
        b<? extends T>[] bVarArr = this.array;
        if (bVarArr == null) {
            bVarArr = new b[8];
            try {
                Iterator it = (Iterator) ObjectHelper.requireNonNull(this.iterable.iterator(), "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            b<? extends T> bVar = (b) ObjectHelper.requireNonNull(it.next(), "The publisher returned by the iterator is null");
                            if (length == bVarArr.length) {
                                b<? extends T>[] bVarArr2 = new b[(length >> 2) + length];
                                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                                bVarArr = bVarArr2;
                            }
                            bVarArr[length] = bVar;
                            length++;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            EmptySubscription.error(th, cVar);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        EmptySubscription.error(th2, cVar);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, cVar);
                return;
            }
        } else {
            length = bVarArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            EmptySubscription.complete(cVar);
        } else if (i10 == 1) {
            bVarArr[0].subscribe(new FlowableMap.MapSubscriber(cVar, new SingletonArrayFunc()));
        } else {
            CombineLatestCoordinator combineLatestCoordinator = new CombineLatestCoordinator(cVar, this.combiner, i10, this.bufferSize, this.delayErrors);
            cVar.onSubscribe(combineLatestCoordinator);
            combineLatestCoordinator.subscribe(bVarArr, i10);
        }
    }
}
