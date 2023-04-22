package io.reactivex.internal.operators.parallel;

import df.c;
import df.d;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ParallelReduce<T, R> extends ParallelFlowable<R> {
    public final Callable<R> initialSupplier;
    public final BiFunction<R, ? super T, R> reducer;
    public final ParallelFlowable<? extends T> source;

    /* loaded from: classes2.dex */
    public static final class ParallelReduceSubscriber<T, R> extends DeferredScalarSubscriber<T, R> {
        private static final long serialVersionUID = 8200530050639449080L;
        public R accumulator;
        public boolean done;
        public final BiFunction<R, ? super T, R> reducer;

        public ParallelReduceSubscriber(c<? super R> cVar, R r10, BiFunction<R, ? super T, R> biFunction) {
            super(cVar);
            this.accumulator = r10;
            this.reducer = biFunction;
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            R r10 = this.accumulator;
            this.accumulator = null;
            complete(r10);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.accumulator = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.done) {
                return;
            }
            try {
                this.accumulator = (R) ObjectHelper.requireNonNull(this.reducer.apply(this.accumulator, t2), "The reducer returned a null value");
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }
    }

    public ParallelReduce(ParallelFlowable<? extends T> parallelFlowable, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        this.source = parallelFlowable;
        this.initialSupplier = callable;
        this.reducer = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    public void reportError(c<?>[] cVarArr, Throwable th) {
        for (c<?> cVar : cVarArr) {
            EmptySubscription.error(th, cVar);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(c<? super R>[] cVarArr) {
        if (validate(cVarArr)) {
            int length = cVarArr.length;
            c<? super Object>[] cVarArr2 = new c[length];
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    cVarArr2[i10] = new ParallelReduceSubscriber(cVarArr[i10], ObjectHelper.requireNonNull(this.initialSupplier.call(), "The initialSupplier returned a null value"), this.reducer);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    reportError(cVarArr, th);
                    return;
                }
            }
            this.source.subscribe(cVarArr2);
        }
    }
}
