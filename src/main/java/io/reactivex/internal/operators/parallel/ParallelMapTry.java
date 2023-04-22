package io.reactivex.internal.operators.parallel;

import df.c;
import df.d;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes2.dex */
public final class ParallelMapTry<T, R> extends ParallelFlowable<R> {
    public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;
    public final Function<? super T, ? extends R> mapper;
    public final ParallelFlowable<T> source;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelMapTry$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$reactivex$parallel$ParallelFailureHandling;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            $SwitchMap$io$reactivex$parallel$ParallelFailureHandling = iArr;
            try {
                iArr[ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$parallel$ParallelFailureHandling[ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$reactivex$parallel$ParallelFailureHandling[ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class ParallelMapTryConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, d {
        public boolean done;
        public final ConditionalSubscriber<? super R> downstream;
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;
        public final Function<? super T, ? extends R> mapper;
        public d upstream;

        public ParallelMapTryConditionalSubscriber(ConditionalSubscriber<? super R> conditionalSubscriber, Function<? super T, ? extends R> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.downstream = conditionalSubscriber;
            this.mapper = function;
            this.errorHandler = biFunction;
        }

        @Override // df.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (!tryOnNext(t2) && !this.done) {
                this.upstream.request(1L);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // df.d
        public void request(long j10) {
            this.upstream.request(j10);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean tryOnNext(T r13) {
            /*
                r12 = this;
                boolean r0 = r12.done
                r1 = 0
                if (r0 == 0) goto L7
                r10 = 2
                return r1
            L7:
                r2 = 0
                r11 = 4
            La:
                r10 = 2
                io.reactivex.functions.Function<? super T, ? extends R> r0 = r12.mapper     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r0 = r0.apply(r13)     // Catch: java.lang.Throwable -> L1e
                java.lang.String r4 = "The mapper returned a null value"
                java.lang.Object r13 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r4)     // Catch: java.lang.Throwable -> L1e
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r12.downstream
                boolean r13 = r0.tryOnNext(r13)
                return r13
            L1e:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r4 = 1
                r11 = 6
                r9 = 2
                r5 = r9
                r10 = 7
                io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r6 = r12.errorHandler     // Catch: java.lang.Throwable -> L64
                r10 = 1
                r7 = 1
                long r2 = r2 + r7
                r10 = 2
                java.lang.Long r9 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L64
                r7 = r9
                java.lang.Object r6 = r6.apply(r7, r0)     // Catch: java.lang.Throwable -> L64
                java.lang.String r9 = "The errorHandler returned a null item"
                r7 = r9
                java.lang.Object r9 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L64
                r6 = r9
                io.reactivex.parallel.ParallelFailureHandling r6 = (io.reactivex.parallel.ParallelFailureHandling) r6     // Catch: java.lang.Throwable -> L64
                int[] r7 = io.reactivex.internal.operators.parallel.ParallelMapTry.AnonymousClass1.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling
                r10 = 4
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r4) goto La
                r10 = 2
                if (r6 == r5) goto L63
                r10 = 6
                r13 = 3
                if (r6 == r13) goto L5c
                r10 = 2
                r12.cancel()
                r12.onError(r0)
                r10 = 5
                return r1
            L5c:
                r10 = 4
                r12.cancel()
                r12.onComplete()
            L63:
                return r1
            L64:
                r13 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r13)
                r10 = 4
                r12.cancel()
                r10 = 2
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r11 = 1
                java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
                r11 = 5
                r3[r1] = r0
                r3[r4] = r13
                r10 = 4
                r2.<init>(r3)
                r11 = 4
                r12.onError(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelMapTry.ParallelMapTryConditionalSubscriber.tryOnNext(java.lang.Object):boolean");
        }
    }

    /* loaded from: classes2.dex */
    public static final class ParallelMapTrySubscriber<T, R> implements ConditionalSubscriber<T>, d {
        public boolean done;
        public final c<? super R> downstream;
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;
        public final Function<? super T, ? extends R> mapper;
        public d upstream;

        public ParallelMapTrySubscriber(c<? super R> cVar, Function<? super T, ? extends R> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.downstream = cVar;
            this.mapper = function;
            this.errorHandler = biFunction;
        }

        @Override // df.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (!tryOnNext(t2) && !this.done) {
                this.upstream.request(1L);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // df.d
        public void request(long j10) {
            this.upstream.request(j10);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean tryOnNext(T r14) {
            /*
                r13 = this;
                r9 = r13
                boolean r0 = r9.done
                r12 = 2
                r11 = 0
                r1 = r11
                if (r0 == 0) goto La
                r11 = 6
                return r1
            La:
                r2 = 0
                r11 = 2
            Ld:
                r0 = 1
                r11 = 1
                io.reactivex.functions.Function<? super T, ? extends R> r4 = r9.mapper     // Catch: java.lang.Throwable -> L23
                java.lang.Object r4 = r4.apply(r14)     // Catch: java.lang.Throwable -> L23
                java.lang.String r12 = "The mapper returned a null value"
                r5 = r12
                java.lang.Object r14 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r5)     // Catch: java.lang.Throwable -> L23
                df.c<? super R> r1 = r9.downstream
                r11 = 1
                r1.onNext(r14)
                return r0
            L23:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                r11 = 2
                r5 = r11
                r12 = 2
                io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r6 = r9.errorHandler     // Catch: java.lang.Throwable -> L6b
                r12 = 3
                r7 = 1
                r11 = 6
                long r2 = r2 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L6b
                java.lang.Object r6 = r6.apply(r7, r4)     // Catch: java.lang.Throwable -> L6b
                java.lang.String r12 = "The errorHandler returned a null item"
                r7 = r12
                java.lang.Object r12 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L6b
                r6 = r12
                io.reactivex.parallel.ParallelFailureHandling r6 = (io.reactivex.parallel.ParallelFailureHandling) r6     // Catch: java.lang.Throwable -> L6b
                int[] r7 = io.reactivex.internal.operators.parallel.ParallelMapTry.AnonymousClass1.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling
                r12 = 3
                int r11 = r6.ordinal()
                r6 = r11
                r6 = r7[r6]
                r12 = 3
                if (r6 == r0) goto Ld
                if (r6 == r5) goto L69
                r11 = 4
                r14 = 3
                if (r6 == r14) goto L60
                r12 = 1
                r9.cancel()
                r11 = 4
                r9.onError(r4)
                r12 = 7
                return r1
            L60:
                r11 = 3
                r9.cancel()
                r11 = 4
                r9.onComplete()
                r12 = 7
            L69:
                r11 = 5
                return r1
            L6b:
                r14 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r14)
                r9.cancel()
                r12 = 4
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
                r3[r1] = r4
                r3[r0] = r14
                r2.<init>(r3)
                r9.onError(r2)
                r12 = 4
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelMapTry.ParallelMapTrySubscriber.tryOnNext(java.lang.Object):boolean");
        }
    }

    public ParallelMapTry(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends R> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        this.source = parallelFlowable;
        this.mapper = function;
        this.errorHandler = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(c<? super R>[] cVarArr) {
        if (validate(cVarArr)) {
            int length = cVarArr.length;
            c<? super T>[] cVarArr2 = new c[length];
            for (int i10 = 0; i10 < length; i10++) {
                c<? super R> cVar = cVarArr[i10];
                if (cVar instanceof ConditionalSubscriber) {
                    cVarArr2[i10] = new ParallelMapTryConditionalSubscriber((ConditionalSubscriber) cVar, this.mapper, this.errorHandler);
                } else {
                    cVarArr2[i10] = new ParallelMapTrySubscriber(cVar, this.mapper, this.errorHandler);
                }
            }
            this.source.subscribe(cVarArr2);
        }
    }
}
