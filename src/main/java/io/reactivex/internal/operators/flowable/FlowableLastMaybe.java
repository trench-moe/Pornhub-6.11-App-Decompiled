package io.reactivex.internal.operators.flowable;

import df.b;
import df.d;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* loaded from: classes2.dex */
public final class FlowableLastMaybe<T> extends Maybe<T> {
    public final b<T> source;

    /* loaded from: classes2.dex */
    public static final class LastSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public final MaybeObserver<? super T> downstream;
        public T item;
        public d upstream;

        public LastSubscriber(MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.upstream = SubscriptionHelper.CANCELLED;
            T t2 = this.item;
            if (t2 == null) {
                this.downstream.onComplete();
                return;
            }
            this.item = null;
            this.downstream.onSuccess(t2);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.upstream = SubscriptionHelper.CANCELLED;
            this.item = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            this.item = t2;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableLastMaybe(b<T> bVar) {
        this.source = bVar;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new LastSubscriber(maybeObserver));
    }
}
