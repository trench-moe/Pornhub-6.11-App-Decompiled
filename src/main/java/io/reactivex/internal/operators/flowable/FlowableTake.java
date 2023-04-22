package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class FlowableTake<T> extends AbstractFlowableWithUpstream<T, T> {
    public final long limit;

    /* loaded from: classes2.dex */
    public static final class TakeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -5636543848937116287L;
        public boolean done;
        public final c<? super T> downstream;
        public final long limit;
        public long remaining;
        public d upstream;

        public TakeSubscriber(c<? super T> cVar, long j10) {
            this.downstream = cVar;
            this.limit = j10;
            this.remaining = j10;
        }

        @Override // df.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.upstream.cancel();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (!this.done) {
                long j10 = this.remaining;
                long j11 = j10 - 1;
                this.remaining = j11;
                if (j10 > 0) {
                    boolean z10 = j11 == 0;
                    this.downstream.onNext(t2);
                    if (z10) {
                        this.upstream.cancel();
                        onComplete();
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (this.limit != 0) {
                    this.downstream.onSubscribe(this);
                    return;
                }
                dVar.cancel();
                this.done = true;
                EmptySubscription.complete(this.downstream);
            }
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                if (get() || !compareAndSet(false, true) || j10 < this.limit) {
                    this.upstream.request(j10);
                } else {
                    this.upstream.request(Long.MAX_VALUE);
                }
            }
        }
    }

    public FlowableTake(Flowable<T> flowable, long j10) {
        super(flowable);
        this.limit = j10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber) new TakeSubscriber(cVar, this.limit));
    }
}
