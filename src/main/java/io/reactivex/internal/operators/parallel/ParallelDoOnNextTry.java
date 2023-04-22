package io.reactivex.internal.operators.parallel;

import df.c;
import df.d;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes2.dex */
public final class ParallelDoOnNextTry<T> extends ParallelFlowable<T> {
    public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;
    public final Consumer<? super T> onNext;
    public final ParallelFlowable<T> source;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelDoOnNextTry$1  reason: invalid class name */
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
    public static final class ParallelDoOnNextConditionalSubscriber<T> implements ConditionalSubscriber<T>, d {
        public boolean done;
        public final ConditionalSubscriber<? super T> downstream;
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;
        public final Consumer<? super T> onNext;
        public d upstream;

        public ParallelDoOnNextConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Consumer<? super T> consumer, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.downstream = conditionalSubscriber;
            this.onNext = consumer;
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
            if (tryOnNext(t2) || this.done) {
                return;
            }
            this.upstream.request(1L);
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

        /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
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
                r12 = 1
                r1 = 0
                if (r0 == 0) goto L9
                r12 = 5
                return r1
            L9:
                r2 = 0
                r12 = 1
            Lc:
                io.reactivex.functions.Consumer<? super T> r0 = r9.onNext     // Catch: java.lang.Throwable -> L1a
                r0.accept(r14)     // Catch: java.lang.Throwable -> L1a
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r9.downstream
                r11 = 5
                boolean r11 = r0.tryOnNext(r14)
                r14 = r11
                return r14
            L1a:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r11 = 5
                r11 = 1
                r4 = r11
                r5 = 2
                r12 = 5
                io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r6 = r9.errorHandler     // Catch: java.lang.Throwable -> L5f
                r7 = 1
                long r2 = r2 + r7
                java.lang.Long r12 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L5f
                r7 = r12
                java.lang.Object r6 = r6.apply(r7, r0)     // Catch: java.lang.Throwable -> L5f
                java.lang.String r7 = "The errorHandler returned a null item"
                r11 = 7
                java.lang.Object r11 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L5f
                r6 = r11
                io.reactivex.parallel.ParallelFailureHandling r6 = (io.reactivex.parallel.ParallelFailureHandling) r6     // Catch: java.lang.Throwable -> L5f
                int[] r7 = io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.AnonymousClass1.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling
                int r12 = r6.ordinal()
                r6 = r12
                r6 = r7[r6]
                if (r6 == r4) goto Lc
                r12 = 4
                if (r6 == r5) goto L5e
                r14 = 3
                r11 = 2
                if (r6 == r14) goto L56
                r11 = 6
                r9.cancel()
                r11 = 5
                r9.onError(r0)
                return r1
            L56:
                r11 = 6
                r9.cancel()
                r12 = 2
                r9.onComplete()
            L5e:
                return r1
            L5f:
                r14 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r14)
                r9.cancel()
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
                r3[r1] = r0
                r11 = 7
                r3[r4] = r14
                r2.<init>(r3)
                r9.onError(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.ParallelDoOnNextConditionalSubscriber.tryOnNext(java.lang.Object):boolean");
        }
    }

    /* loaded from: classes2.dex */
    public static final class ParallelDoOnNextSubscriber<T> implements ConditionalSubscriber<T>, d {
        public boolean done;
        public final c<? super T> downstream;
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;
        public final Consumer<? super T> onNext;
        public d upstream;

        public ParallelDoOnNextSubscriber(c<? super T> cVar, Consumer<? super T> consumer, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.downstream = cVar;
            this.onNext = consumer;
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
            if (tryOnNext(t2)) {
                return;
            }
            this.upstream.request(1L);
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

        /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean tryOnNext(T r14) {
            /*
                r13 = this;
                boolean r0 = r13.done
                r9 = 0
                r1 = r9
                if (r0 == 0) goto L8
                r11 = 4
                return r1
            L8:
                r12 = 5
                r2 = 0
            Lb:
                r10 = 4
                r0 = 1
                r12 = 6
                r11 = 5
                io.reactivex.functions.Consumer<? super T> r4 = r13.onNext     // Catch: java.lang.Throwable -> L1b
                r12 = 7
                r4.accept(r14)     // Catch: java.lang.Throwable -> L1b
                df.c<? super T> r1 = r13.downstream
                r1.onNext(r14)
                return r0
            L1b:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                r10 = 5
                r9 = 2
                r5 = r9
                r12 = 5
                io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r6 = r13.errorHandler     // Catch: java.lang.Throwable -> L61
                r11 = 2
                r7 = 1
                long r2 = r2 + r7
                r12 = 4
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L61
                java.lang.Object r6 = r6.apply(r7, r4)     // Catch: java.lang.Throwable -> L61
                java.lang.String r9 = "The errorHandler returned a null item"
                r7 = r9
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L61
                io.reactivex.parallel.ParallelFailureHandling r6 = (io.reactivex.parallel.ParallelFailureHandling) r6     // Catch: java.lang.Throwable -> L61
                int[] r7 = io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.AnonymousClass1.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling
                r10 = 5
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r0) goto Lb
                r10 = 4
                if (r6 == r5) goto L5f
                r10 = 2
                r14 = 3
                r12 = 3
                if (r6 == r14) goto L56
                r13.cancel()
                r11 = 4
                r13.onError(r4)
                return r1
            L56:
                r10 = 1
                r13.cancel()
                r10 = 1
                r13.onComplete()
                r10 = 1
            L5f:
                r12 = 3
                return r1
            L61:
                r14 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r14)
                r12 = 3
                r13.cancel()
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r11 = 4
                java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
                r3[r1] = r4
                r12 = 5
                r3[r0] = r14
                r12 = 6
                r2.<init>(r3)
                r13.onError(r2)
                r10 = 2
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.ParallelDoOnNextSubscriber.tryOnNext(java.lang.Object):boolean");
        }
    }

    public ParallelDoOnNextTry(ParallelFlowable<T> parallelFlowable, Consumer<? super T> consumer, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        this.source = parallelFlowable;
        this.onNext = consumer;
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
                    cVarArr2[i10] = new ParallelDoOnNextConditionalSubscriber((ConditionalSubscriber) cVar, this.onNext, this.errorHandler);
                } else {
                    cVarArr2[i10] = new ParallelDoOnNextSubscriber(cVar, this.onNext, this.errorHandler);
                }
            }
            this.source.subscribe(cVarArr2);
        }
    }
}
