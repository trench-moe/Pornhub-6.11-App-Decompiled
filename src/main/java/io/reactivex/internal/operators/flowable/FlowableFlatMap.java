package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableFlatMap<T, U> extends AbstractFlowableWithUpstream<T, U> {
    public final int bufferSize;
    public final boolean delayErrors;
    public final Function<? super T, ? extends b<? extends U>> mapper;
    public final int maxConcurrency;

    /* loaded from: classes2.dex */
    public static final class InnerSubscriber<T, U> extends AtomicReference<d> implements FlowableSubscriber<U>, Disposable {
        private static final long serialVersionUID = -4606175640614850599L;
        public final int bufferSize;
        public volatile boolean done;
        public int fusionMode;

        /* renamed from: id  reason: collision with root package name */
        public final long f10738id;
        public final int limit;
        public final MergeSubscriber<T, U> parent;
        public long produced;
        public volatile SimpleQueue<U> queue;

        public InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j10) {
            this.f10738id = j10;
            this.parent = mergeSubscriber;
            int i10 = mergeSubscriber.bufferSize;
            this.bufferSize = i10;
            this.limit = i10 >> 2;
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
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.innerError(this, th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(U u2) {
            if (this.fusionMode != 2) {
                this.parent.tryEmit(u2, this);
            } else {
                this.parent.drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this, dVar)) {
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                    }
                }
                dVar.request(this.bufferSize);
            }
        }

        public void requestMore(long j10) {
            if (this.fusionMode != 1) {
                long j11 = this.produced + j10;
                if (j11 < this.limit) {
                    this.produced = j11;
                    return;
                }
                this.produced = 0L;
                get().request(j11);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class MergeSubscriber<T, U> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -2117620485640801370L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final c<? super U> downstream;
        public final AtomicThrowable errs = new AtomicThrowable();
        public long lastId;
        public int lastIndex;
        public final Function<? super T, ? extends b<? extends U>> mapper;
        public final int maxConcurrency;
        public volatile SimplePlainQueue<U> queue;
        public final AtomicLong requested;
        public int scalarEmitted;
        public final int scalarLimit;
        public final AtomicReference<InnerSubscriber<?, ?>[]> subscribers;
        public long uniqueId;
        public d upstream;
        public static final InnerSubscriber<?, ?>[] EMPTY = new InnerSubscriber[0];
        public static final InnerSubscriber<?, ?>[] CANCELLED = new InnerSubscriber[0];

        public MergeSubscriber(c<? super U> cVar, Function<? super T, ? extends b<? extends U>> function, boolean z10, int i10, int i11) {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.downstream = cVar;
            this.mapper = function;
            this.delayErrors = z10;
            this.maxConcurrency = i10;
            this.bufferSize = i11;
            this.scalarLimit = Math.max(1, i10 >> 1);
            atomicReference.lazySet(EMPTY);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean addInner(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                if (innerSubscriberArr == CANCELLED) {
                    innerSubscriber.dispose();
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new InnerSubscriber[length + 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        @Override // df.d
        public void cancel() {
            SimplePlainQueue<U> simplePlainQueue;
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                disposeAll();
                if (getAndIncrement() == 0 && (simplePlainQueue = this.queue) != null) {
                    simplePlainQueue.clear();
                }
            }
        }

        public boolean checkTerminate() {
            if (this.cancelled) {
                clearScalarQueue();
                return true;
            } else if (this.delayErrors || this.errs.get() == null) {
                return false;
            } else {
                clearScalarQueue();
                Throwable terminate = this.errs.terminate();
                if (terminate != ExceptionHelper.TERMINATED) {
                    this.downstream.onError(terminate);
                }
                return true;
            }
        }

        public void clearScalarQueue() {
            SimplePlainQueue<U> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                simplePlainQueue.clear();
            }
        }

        public void disposeAll() {
            InnerSubscriber<?, ?>[] andSet;
            InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
            InnerSubscriber<?, ?>[] innerSubscriberArr2 = CANCELLED;
            if (innerSubscriberArr == innerSubscriberArr2 || (andSet = this.subscribers.getAndSet(innerSubscriberArr2)) == innerSubscriberArr2) {
                return;
            }
            for (InnerSubscriber<?, ?> innerSubscriber : andSet) {
                innerSubscriber.dispose();
            }
            Throwable terminate = this.errs.terminate();
            if (terminate == null || terminate == ExceptionHelper.TERMINATED) {
                return;
            }
            RxJavaPlugins.onError(terminate);
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:121:0x019a, code lost:
            r24.lastIndex = r3;
            r24.lastId = r13[r3].f10738id;
            r3 = r16;
            r5 = 0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drainLoop() {
            /*
                Method dump skipped, instructions count: 458
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.drainLoop():void");
        }

        public SimpleQueue<U> getInnerQueue(InnerSubscriber<T, U> innerSubscriber) {
            SimpleQueue<U> simpleQueue = innerSubscriber.queue;
            if (simpleQueue == null) {
                SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.bufferSize);
                innerSubscriber.queue = spscArrayQueue;
                return spscArrayQueue;
            }
            return simpleQueue;
        }

        public SimpleQueue<U> getMainQueue() {
            SimplePlainQueue<U> simplePlainQueue = this.queue;
            if (simplePlainQueue == null) {
                simplePlainQueue = this.maxConcurrency == Integer.MAX_VALUE ? new SpscLinkedArrayQueue<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                this.queue = simplePlainQueue;
            }
            return simplePlainQueue;
        }

        public void innerError(InnerSubscriber<T, U> innerSubscriber, Throwable th) {
            if (!this.errs.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            innerSubscriber.done = true;
            if (!this.delayErrors) {
                this.upstream.cancel();
                for (InnerSubscriber<?, ?> innerSubscriber2 : this.subscribers.getAndSet(CANCELLED)) {
                    innerSubscriber2.dispose();
                }
            }
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else if (!this.errs.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                if (!this.delayErrors) {
                    for (InnerSubscriber<?, ?> innerSubscriber : this.subscribers.getAndSet(CANCELLED)) {
                        innerSubscriber.dispose();
                    }
                }
                drain();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.done) {
                return;
            }
            try {
                b bVar = (b) ObjectHelper.requireNonNull(this.mapper.apply(t2), "The mapper returned a null Publisher");
                if (bVar instanceof Callable) {
                    try {
                        Object call = ((Callable) bVar).call();
                        if (call != null) {
                            tryEmitScalar(call);
                        } else if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                            int i10 = this.scalarEmitted + 1;
                            this.scalarEmitted = i10;
                            int i11 = this.scalarLimit;
                            if (i10 == i11) {
                                this.scalarEmitted = 0;
                                this.upstream.request(i11);
                            }
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.errs.addThrowable(th);
                        drain();
                    }
                } else {
                    long j10 = this.uniqueId;
                    this.uniqueId = 1 + j10;
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this, j10);
                    if (addInner(innerSubscriber)) {
                        bVar.subscribe(innerSubscriber);
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                int i10 = this.maxConcurrency;
                if (i10 == Integer.MAX_VALUE) {
                    dVar.request(Long.MAX_VALUE);
                } else {
                    dVar.request(i10);
                }
            }
        }

        public void removeInner(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber<?, ?>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    } else if (innerSubscriberArr[i11] == innerSubscriber) {
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
                    innerSubscriberArr2 = EMPTY;
                } else {
                    InnerSubscriber<?, ?>[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i10);
                    System.arraycopy(innerSubscriberArr, i10 + 1, innerSubscriberArr3, i10, (length - i10) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, innerSubscriberArr2));
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void tryEmit(U r10, io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> r11) {
            /*
                r9 = this;
                int r7 = r9.get()
                r0 = r7
                java.lang.String r7 = "Inner queue full?!"
                r1 = r7
                if (r0 != 0) goto L71
                r8 = 7
                r0 = 0
                r7 = 1
                r2 = r7
                boolean r0 = r9.compareAndSet(r0, r2)
                if (r0 == 0) goto L71
                r8 = 7
                java.util.concurrent.atomic.AtomicLong r0 = r9.requested
                r8 = 1
                long r2 = r0.get()
                io.reactivex.internal.fuseable.SimpleQueue<U> r0 = r11.queue
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r8 = 6
                if (r6 == 0) goto L4b
                r8 = 5
                if (r0 == 0) goto L30
                r8 = 2
                boolean r4 = r0.isEmpty()
                if (r4 == 0) goto L4b
                r8 = 2
            L30:
                df.c<? super U> r0 = r9.downstream
                r0.onNext(r10)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r8 = 5
                int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                r8 = 3
                if (r10 == 0) goto L45
                java.util.concurrent.atomic.AtomicLong r10 = r9.requested
                r10.decrementAndGet()
            L45:
                r0 = 1
                r11.requestMore(r0)
                goto L69
            L4b:
                r8 = 2
                if (r0 != 0) goto L54
                r8 = 4
                io.reactivex.internal.fuseable.SimpleQueue r7 = r9.getInnerQueue(r11)
                r0 = r7
            L54:
                r8 = 2
                boolean r7 = r0.offer(r10)
                r10 = r7
                if (r10 != 0) goto L68
                r8 = 4
                io.reactivex.exceptions.MissingBackpressureException r10 = new io.reactivex.exceptions.MissingBackpressureException
                r8 = 1
                r10.<init>(r1)
                r8 = 7
                r9.onError(r10)
                return
            L68:
                r8 = 4
            L69:
                int r10 = r9.decrementAndGet()
                if (r10 != 0) goto L9e
                r8 = 6
                return
            L71:
                io.reactivex.internal.fuseable.SimpleQueue<U> r0 = r11.queue
                r8 = 6
                if (r0 != 0) goto L82
                r8 = 4
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                r8 = 5
                int r2 = r9.bufferSize
                r8 = 6
                r0.<init>(r2)
                r11.queue = r0
            L82:
                r8 = 2
                boolean r7 = r0.offer(r10)
                r10 = r7
                if (r10 != 0) goto L95
                io.reactivex.exceptions.MissingBackpressureException r10 = new io.reactivex.exceptions.MissingBackpressureException
                r10.<init>(r1)
                r8 = 7
                r9.onError(r10)
                r8 = 5
                return
            L95:
                r8 = 3
                int r10 = r9.getAndIncrement()
                if (r10 == 0) goto L9e
                r8 = 6
                return
            L9e:
                r8 = 4
                r9.drainLoop()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.tryEmit(java.lang.Object, io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void tryEmitScalar(U r14) {
            /*
                r13 = this;
                r9 = r13
                int r0 = r9.get()
                java.lang.String r11 = "Scalar queue full?!"
                r1 = r11
                if (r0 != 0) goto L88
                r0 = 0
                r11 = 1
                r2 = r11
                boolean r3 = r9.compareAndSet(r0, r2)
                if (r3 == 0) goto L88
                java.util.concurrent.atomic.AtomicLong r3 = r9.requested
                long r3 = r3.get()
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r5 = r9.queue
                r6 = 0
                r12 = 7
                int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                r11 = 1
                if (r8 == 0) goto L69
                r11 = 2
                if (r5 == 0) goto L2d
                boolean r6 = r5.isEmpty()
                if (r6 == 0) goto L69
                r12 = 7
            L2d:
                r12 = 4
                df.c<? super U> r1 = r9.downstream
                r12 = 3
                r1.onNext(r14)
                r11 = 7
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r14 == 0) goto L44
                r11 = 5
                java.util.concurrent.atomic.AtomicLong r14 = r9.requested
                r14.decrementAndGet()
            L44:
                int r14 = r9.maxConcurrency
                r12 = 7
                r1 = 2147483647(0x7fffffff, float:NaN)
                r11 = 2
                if (r14 == r1) goto L80
                r11 = 1
                boolean r14 = r9.cancelled
                if (r14 != 0) goto L80
                int r14 = r9.scalarEmitted
                r12 = 2
                int r14 = r14 + r2
                r12 = 7
                r9.scalarEmitted = r14
                int r1 = r9.scalarLimit
                if (r14 != r1) goto L80
                r12 = 6
                r9.scalarEmitted = r0
                df.d r14 = r9.upstream
                r11 = 3
                long r0 = (long) r1
                r14.request(r0)
                r11 = 6
                goto L81
            L69:
                if (r5 != 0) goto L6f
                io.reactivex.internal.fuseable.SimpleQueue r5 = r9.getMainQueue()
            L6f:
                boolean r14 = r5.offer(r14)
                if (r14 != 0) goto L80
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                r12 = 4
                r14.<init>(r1)
                r9.onError(r14)
                r12 = 4
                return
            L80:
                r12 = 3
            L81:
                int r14 = r9.decrementAndGet()
                if (r14 != 0) goto Lab
                return
            L88:
                r12 = 5
                io.reactivex.internal.fuseable.SimpleQueue r12 = r9.getMainQueue()
                r0 = r12
                boolean r12 = r0.offer(r14)
                r14 = r12
                if (r14 != 0) goto La2
                r11 = 3
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                r11 = 7
                r14.<init>(r1)
                r11 = 2
                r9.onError(r14)
                r11 = 2
                return
            La2:
                r12 = 7
                int r11 = r9.getAndIncrement()
                r14 = r11
                if (r14 == 0) goto Lab
                return
            Lab:
                r9.drainLoop()
                r11 = 7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.tryEmitScalar(java.lang.Object):void");
        }
    }

    public FlowableFlatMap(Flowable<T> flowable, Function<? super T, ? extends b<? extends U>> function, boolean z10, int i10, int i11) {
        super(flowable);
        this.mapper = function;
        this.delayErrors = z10;
        this.maxConcurrency = i10;
        this.bufferSize = i11;
    }

    public static <T, U> FlowableSubscriber<T> subscribe(c<? super U> cVar, Function<? super T, ? extends b<? extends U>> function, boolean z10, int i10, int i11) {
        return new MergeSubscriber(cVar, function, z10, i10, i11);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super U> cVar) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, cVar, this.mapper)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) subscribe(cVar, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
