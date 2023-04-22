package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class FlowableRetryBiPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    public final BiPredicate<? super Integer, ? super Throwable> predicate;

    /* loaded from: classes2.dex */
    public static final class RetryBiSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final c<? super T> downstream;
        public final BiPredicate<? super Integer, ? super Throwable> predicate;
        public long produced;
        public int retries;

        /* renamed from: sa  reason: collision with root package name */
        public final SubscriptionArbiter f10743sa;
        public final b<? extends T> source;

        public RetryBiSubscriber(c<? super T> cVar, BiPredicate<? super Integer, ? super Throwable> biPredicate, SubscriptionArbiter subscriptionArbiter, b<? extends T> bVar) {
            this.downstream = cVar;
            this.f10743sa = subscriptionArbiter;
            this.source = bVar;
            this.predicate = biPredicate;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            try {
                BiPredicate<? super Integer, ? super Throwable> biPredicate = this.predicate;
                int i10 = this.retries + 1;
                this.retries = i10;
                if (biPredicate.test(Integer.valueOf(i10), th)) {
                    subscribeNext();
                } else {
                    this.downstream.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            this.produced++;
            this.downstream.onNext(t2);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            this.f10743sa.setSubscription(dVar);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i10 = 1;
                while (!this.f10743sa.isCancelled()) {
                    long j10 = this.produced;
                    if (j10 != 0) {
                        this.produced = 0L;
                        this.f10743sa.produced(j10);
                    }
                    this.source.subscribe(this);
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                }
            }
        }
    }

    public FlowableRetryBiPredicate(Flowable<T> flowable, BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        super(flowable);
        this.predicate = biPredicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        cVar.onSubscribe(subscriptionArbiter);
        new RetryBiSubscriber(cVar, this.predicate, subscriptionArbiter, this.source).subscribeNext();
    }
}
