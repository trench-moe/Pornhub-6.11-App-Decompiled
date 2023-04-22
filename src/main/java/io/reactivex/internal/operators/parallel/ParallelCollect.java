package io.reactivex.internal.operators.parallel;

import df.c;
import df.d;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ParallelCollect<T, C> extends ParallelFlowable<C> {
    public final BiConsumer<? super C, ? super T> collector;
    public final Callable<? extends C> initialCollection;
    public final ParallelFlowable<? extends T> source;

    /* loaded from: classes2.dex */
    public static final class ParallelCollectSubscriber<T, C> extends DeferredScalarSubscriber<T, C> {
        private static final long serialVersionUID = -4767392946044436228L;
        public C collection;
        public final BiConsumer<? super C, ? super T> collector;
        public boolean done;

        public ParallelCollectSubscriber(c<? super C> cVar, C c10, BiConsumer<? super C, ? super T> biConsumer) {
            super(cVar);
            this.collection = c10;
            this.collector = biConsumer;
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
            C c10 = this.collection;
            this.collection = null;
            complete(c10);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.collection = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.done) {
                return;
            }
            try {
                this.collector.accept((C) this.collection, t2);
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

    public ParallelCollect(ParallelFlowable<? extends T> parallelFlowable, Callable<? extends C> callable, BiConsumer<? super C, ? super T> biConsumer) {
        this.source = parallelFlowable;
        this.initialCollection = callable;
        this.collector = biConsumer;
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
    public void subscribe(c<? super C>[] cVarArr) {
        if (validate(cVarArr)) {
            int length = cVarArr.length;
            c<? super Object>[] cVarArr2 = new c[length];
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    cVarArr2[i10] = new ParallelCollectSubscriber(cVarArr[i10], ObjectHelper.requireNonNull(this.initialCollection.call(), "The initialSupplier returned a null value"), this.collector);
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
