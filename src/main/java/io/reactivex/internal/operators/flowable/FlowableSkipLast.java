package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class FlowableSkipLast<T> extends AbstractFlowableWithUpstream<T, T> {
    public final int skip;

    /* loaded from: classes2.dex */
    public static final class SkipLastSubscriber<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -3807491841935125653L;
        public final c<? super T> downstream;
        public final int skip;
        public d upstream;

        public SkipLastSubscriber(c<? super T> cVar, int i10) {
            super(i10);
            this.downstream = cVar;
            this.skip = i10;
        }

        @Override // df.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.skip == size()) {
                this.downstream.onNext((T) poll());
            } else {
                this.upstream.request(1L);
            }
            offer(t2);
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
    }

    public FlowableSkipLast(Flowable<T> flowable, int i10) {
        super(flowable);
        this.skip = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber) new SkipLastSubscriber(cVar, this.skip));
    }
}
