package io.reactivex.internal.operators.parallel;

import df.c;
import df.d;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes2.dex */
public final class ParallelFilterTry<T> extends ParallelFlowable<T> {
    public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;
    public final Predicate<? super T> predicate;
    public final ParallelFlowable<T> source;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelFilterTry$1  reason: invalid class name */
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
    public static abstract class BaseFilterSubscriber<T> implements ConditionalSubscriber<T>, d {
        public boolean done;
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;
        public final Predicate<? super T> predicate;
        public d upstream;

        public BaseFilterSubscriber(Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.predicate = predicate;
            this.errorHandler = biFunction;
        }

        @Override // df.d
        public final void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, df.c
        public abstract /* synthetic */ void onComplete();

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, df.c
        public abstract /* synthetic */ void onError(Throwable th);

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, df.c
        public final void onNext(T t2) {
            if (tryOnNext(t2) || this.done) {
                return;
            }
            this.upstream.request(1L);
        }

        @Override // df.d
        public final void request(long j10) {
            this.upstream.request(j10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ParallelFilterConditionalSubscriber<T> extends BaseFilterSubscriber<T> {
        public final ConditionalSubscriber<? super T> downstream;

        public ParallelFilterConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            super(predicate, biFunction);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelFilterTry.BaseFilterSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelFilterTry.BaseFilterSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean tryOnNext(T r13) {
            /*
                r12 = this;
                r9 = r12
                boolean r0 = r9.done
                r11 = 0
                r1 = r11
                if (r0 != 0) goto L77
                r11 = 3
                r2 = 0
                r11 = 1
            Lb:
                r0 = 1
                r11 = 6
                io.reactivex.functions.Predicate<? super T> r4 = r9.predicate     // Catch: java.lang.Throwable -> L21
                boolean r2 = r4.test(r13)     // Catch: java.lang.Throwable -> L21
                if (r2 == 0) goto L20
                r11 = 2
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r2 = r9.downstream
                boolean r13 = r2.tryOnNext(r13)
                if (r13 == 0) goto L20
                r1 = 1
                r11 = 7
            L20:
                return r1
            L21:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                r11 = 2
                r5 = r11
                io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r6 = r9.errorHandler     // Catch: java.lang.Throwable -> L5f
                r7 = 1
                long r2 = r2 + r7
                java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L5f
                r7 = r11
                java.lang.Object r6 = r6.apply(r7, r4)     // Catch: java.lang.Throwable -> L5f
                java.lang.String r7 = "The errorHandler returned a null item"
                r11 = 7
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L5f
                io.reactivex.parallel.ParallelFailureHandling r6 = (io.reactivex.parallel.ParallelFailureHandling) r6     // Catch: java.lang.Throwable -> L5f
                int[] r7 = io.reactivex.internal.operators.parallel.ParallelFilterTry.AnonymousClass1.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling
                int r11 = r6.ordinal()
                r6 = r11
                r6 = r7[r6]
                if (r6 == r0) goto Lb
                r11 = 5
                if (r6 == r5) goto L5e
                r11 = 7
                r13 = 3
                if (r6 == r13) goto L57
                r9.cancel()
                r9.onError(r4)
                return r1
            L57:
                r11 = 6
                r9.cancel()
                r9.onComplete()
            L5e:
                return r1
            L5f:
                r13 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r13)
                r11 = 1
                r9.cancel()
                r11 = 1
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
                r3[r1] = r4
                r3[r0] = r13
                r2.<init>(r3)
                r11 = 3
                r9.onError(r2)
            L77:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelFilterTry.ParallelFilterConditionalSubscriber.tryOnNext(java.lang.Object):boolean");
        }
    }

    /* loaded from: classes2.dex */
    public static final class ParallelFilterSubscriber<T> extends BaseFilterSubscriber<T> {
        public final c<? super T> downstream;

        public ParallelFilterSubscriber(c<? super T> cVar, Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            super(predicate, biFunction);
            this.downstream = cVar;
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelFilterTry.BaseFilterSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelFilterTry.BaseFilterSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean tryOnNext(T r12) {
            /*
                r11 = this;
                boolean r0 = r11.done
                r1 = 0
                if (r0 != 0) goto L76
                r10 = 2
                r2 = 0
            L8:
                r10 = 2
                r9 = 1
                r0 = r9
                io.reactivex.functions.Predicate<? super T> r4 = r11.predicate     // Catch: java.lang.Throwable -> L1b
                r10 = 3
                boolean r2 = r4.test(r12)     // Catch: java.lang.Throwable -> L1b
                if (r2 == 0) goto L1a
                df.c<? super T> r1 = r11.downstream
                r1.onNext(r12)
                return r0
            L1a:
                return r1
            L1b:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                r10 = 4
                r5 = 2
                io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r6 = r11.errorHandler     // Catch: java.lang.Throwable -> L5c
                r7 = 1
                long r2 = r2 + r7
                java.lang.Long r9 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L5c
                r7 = r9
                java.lang.Object r9 = r6.apply(r7, r4)     // Catch: java.lang.Throwable -> L5c
                r6 = r9
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r9 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L5c
                r6 = r9
                io.reactivex.parallel.ParallelFailureHandling r6 = (io.reactivex.parallel.ParallelFailureHandling) r6     // Catch: java.lang.Throwable -> L5c
                int[] r7 = io.reactivex.internal.operators.parallel.ParallelFilterTry.AnonymousClass1.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling
                r10 = 5
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r0) goto L8
                if (r6 == r5) goto L5b
                r12 = 3
                r10 = 5
                if (r6 == r12) goto L52
                r10 = 1
                r11.cancel()
                r11.onError(r4)
                return r1
            L52:
                r10 = 3
                r11.cancel()
                r10 = 3
                r11.onComplete()
                r10 = 5
            L5b:
                return r1
            L5c:
                r12 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r12)
                r10 = 6
                r11.cancel()
                r10 = 6
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
                r10 = 7
                r3[r1] = r4
                r10 = 4
                r3[r0] = r12
                r10 = 6
                r2.<init>(r3)
                r11.onError(r2)
            L76:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelFilterTry.ParallelFilterSubscriber.tryOnNext(java.lang.Object):boolean");
        }
    }

    public ParallelFilterTry(ParallelFlowable<T> parallelFlowable, Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        this.source = parallelFlowable;
        this.predicate = predicate;
        this.errorHandler = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(c<? super T>[] cVarArr) {
        if (validate(cVarArr)) {
            int length = cVarArr.length;
            c<? super T>[] cVarArr2 = new c[length];
            for (int i10 = 0; i10 < length; i10++) {
                c<? super T> cVar = cVarArr[i10];
                if (cVar instanceof ConditionalSubscriber) {
                    cVarArr2[i10] = new ParallelFilterConditionalSubscriber((ConditionalSubscriber) cVar, this.predicate, this.errorHandler);
                } else {
                    cVarArr2[i10] = new ParallelFilterSubscriber(cVar, this.predicate, this.errorHandler);
                }
            }
            this.source.subscribe(cVarArr2);
        }
    }
}
