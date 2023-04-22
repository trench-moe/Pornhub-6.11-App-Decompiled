package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableFlatMapMaybe<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final boolean delayErrors;
    public final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
    public final int maxConcurrency;

    /* loaded from: classes2.dex */
    public static final class FlatMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 8600231336733376951L;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public final c<? super R> downstream;
        public final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
        public final int maxConcurrency;
        public d upstream;
        public final AtomicLong requested = new AtomicLong();
        public final CompositeDisposable set = new CompositeDisposable();
        public final AtomicThrowable errors = new AtomicThrowable();
        public final AtomicInteger active = new AtomicInteger(1);
        public final AtomicReference<SpscLinkedArrayQueue<R>> queue = new AtomicReference<>();

        /* loaded from: classes2.dex */
        public final class InnerObserver extends AtomicReference<Disposable> implements MaybeObserver<R>, Disposable {
            private static final long serialVersionUID = -502562646270949838L;

            public InnerObserver() {
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                FlatMapMaybeSubscriber.this.innerComplete(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                FlatMapMaybeSubscriber.this.innerError(this, th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r10) {
                FlatMapMaybeSubscriber.this.innerSuccess(this, r10);
            }
        }

        public FlatMapMaybeSubscriber(c<? super R> cVar, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10, int i10) {
            this.downstream = cVar;
            this.mapper = function;
            this.delayErrors = z10;
            this.maxConcurrency = i10;
        }

        @Override // df.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.set.dispose();
        }

        public void clear() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.queue.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
            if (r13 != 0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
            if (r17.cancelled == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
            clear();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
            if (r17.delayErrors != false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
            if (r17.errors.get() == null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
            r2 = r17.errors.terminate();
            clear();
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
            if (r2.get() != 0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00ad, code lost:
            r7 = r3.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00b3, code lost:
            if (r7 == null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00b9, code lost:
            if (r7.isEmpty() == false) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00bb, code lost:
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00bd, code lost:
            if (r6 == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00bf, code lost:
            if (r12 == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00c1, code lost:
            r2 = r17.errors.terminate();
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00c7, code lost:
            if (r2 == null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
            r1.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00d0, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
            if (r10 == 0) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00d5, code lost:
            io.reactivex.internal.util.BackpressureHelper.produced(r17.requested, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00df, code lost:
            if (r17.maxConcurrency == Integer.MAX_VALUE) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00e1, code lost:
            r17.upstream.request(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00e6, code lost:
            r5 = addAndGet(-r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drainLoop() {
            /*
                Method dump skipped, instructions count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.drainLoop():void");
        }

        public SpscLinkedArrayQueue<R> getOrCreateQueue() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
            do {
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = this.queue.get();
                if (spscLinkedArrayQueue2 != null) {
                    return spscLinkedArrayQueue2;
                }
                spscLinkedArrayQueue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
            } while (!this.queue.compareAndSet(null, spscLinkedArrayQueue));
            return spscLinkedArrayQueue;
        }

        public void innerComplete(FlatMapMaybeSubscriber<T, R>.InnerObserver innerObserver) {
            this.set.delete(innerObserver);
            if (get() == 0) {
                boolean z10 = false;
                if (compareAndSet(0, 1)) {
                    if (this.active.decrementAndGet() == 0) {
                        z10 = true;
                    }
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.queue.get();
                    if (!z10 || (spscLinkedArrayQueue != null && !spscLinkedArrayQueue.isEmpty())) {
                        if (this.maxConcurrency != Integer.MAX_VALUE) {
                            this.upstream.request(1L);
                        }
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        drainLoop();
                        return;
                    }
                    Throwable terminate = this.errors.terminate();
                    if (terminate != null) {
                        this.downstream.onError(terminate);
                        return;
                    } else {
                        this.downstream.onComplete();
                        return;
                    }
                }
            }
            this.active.decrementAndGet();
            if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
            drain();
        }

        public void innerError(FlatMapMaybeSubscriber<T, R>.InnerObserver innerObserver, Throwable th) {
            this.set.delete(innerObserver);
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.cancel();
                this.set.dispose();
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
            this.active.decrementAndGet();
            drain();
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0091 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void innerSuccess(io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber<T, R>.InnerObserver r10, R r11) {
            /*
                r9 = this;
                r5 = r9
                io.reactivex.disposables.CompositeDisposable r0 = r5.set
                r0.delete(r10)
                int r8 = r5.get()
                r10 = r8
                if (r10 != 0) goto L96
                r8 = 5
                r8 = 0
                r10 = r8
                r7 = 1
                r0 = r7
                boolean r7 = r5.compareAndSet(r10, r0)
                r1 = r7
                if (r1 == 0) goto L96
                r8 = 7
                java.util.concurrent.atomic.AtomicInteger r1 = r5.active
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L25
                r7 = 4
                r8 = 1
                r10 = r8
            L25:
                java.util.concurrent.atomic.AtomicLong r0 = r5.requested
                r7 = 1
                long r0 = r0.get()
                r2 = 0
                r7 = 1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r8 = 3
                if (r4 == 0) goto L81
                r8 = 6
                df.c<? super R> r0 = r5.downstream
                r0.onNext(r11)
                r7 = 6
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r11 = r5.queue
                r8 = 5
                java.lang.Object r11 = r11.get()
                io.reactivex.internal.queue.SpscLinkedArrayQueue r11 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r11
                if (r10 == 0) goto L66
                if (r11 == 0) goto L4e
                boolean r10 = r11.isEmpty()
                if (r10 == 0) goto L66
            L4e:
                io.reactivex.internal.util.AtomicThrowable r10 = r5.errors
                r7 = 4
                java.lang.Throwable r10 = r10.terminate()
                if (r10 == 0) goto L5e
                df.c<? super R> r11 = r5.downstream
                r11.onError(r10)
                r7 = 1
                goto L65
            L5e:
                df.c<? super R> r10 = r5.downstream
                java.lang.String r8 = "Ⓢⓜⓞⓑ⓸⓺"
                r10.onComplete()
            L65:
                return
            L66:
                r7 = 2
                java.util.concurrent.atomic.AtomicLong r10 = r5.requested
                r8 = 4
                r0 = 1
                r8 = 6
                io.reactivex.internal.util.BackpressureHelper.produced(r10, r0)
                int r10 = r5.maxConcurrency
                r8 = 7
                r11 = 2147483647(0x7fffffff, float:NaN)
                if (r10 == r11) goto L8a
                r7 = 3
                df.d r10 = r5.upstream
                r8 = 2
                r10.request(r0)
                r8 = 5
                goto L8b
            L81:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r10 = r5.getOrCreateQueue()
                monitor-enter(r10)
                r10.offer(r11)     // Catch: java.lang.Throwable -> L92
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L92
            L8a:
                r7 = 7
            L8b:
                int r10 = r5.decrementAndGet()
                if (r10 != 0) goto Laf
                return
            L92:
                r11 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L92
                throw r11
                r7 = 1
            L96:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r8 = r5.getOrCreateQueue()
                r10 = r8
                monitor-enter(r10)
                r8 = 2
                r10.offer(r11)     // Catch: java.lang.Throwable -> Lb3
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb3
                java.util.concurrent.atomic.AtomicInteger r10 = r5.active
                r10.decrementAndGet()
                int r8 = r5.getAndIncrement()
                r10 = r8
                if (r10 == 0) goto Laf
                r7 = 1
                return
            Laf:
                r5.drainLoop()
                return
            Lb3:
                r11 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb3
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.innerSuccess(io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver, java.lang.Object):void");
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.active.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.active.decrementAndGet();
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.delayErrors) {
                this.set.dispose();
            }
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            try {
                MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.mapper.apply(t2), "The mapper returned a null MaybeSource");
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.cancelled || !this.set.add(innerObserver)) {
                    return;
                }
                maybeSource.subscribe(innerObserver);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                int i10 = this.maxConcurrency;
                if (i10 == Integer.MAX_VALUE) {
                    dVar.request(Long.MAX_VALUE);
                } else {
                    dVar.request(i10);
                }
            }
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }
    }

    public FlowableFlatMapMaybe(Flowable<T> flowable, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10, int i10) {
        super(flowable);
        this.mapper = function;
        this.delayErrors = z10;
        this.maxConcurrency = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        this.source.subscribe((FlowableSubscriber) new FlatMapMaybeSubscriber(cVar, this.mapper, this.delayErrors, this.maxConcurrency));
    }
}
