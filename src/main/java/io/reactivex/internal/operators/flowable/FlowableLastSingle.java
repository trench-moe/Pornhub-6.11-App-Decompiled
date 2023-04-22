package io.reactivex.internal.operators.flowable;

import df.b;
import df.d;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class FlowableLastSingle<T> extends Single<T> {
    public final T defaultItem;
    public final b<T> source;

    /* loaded from: classes2.dex */
    public static final class LastSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public final T defaultItem;
        public final SingleObserver<? super T> downstream;
        public T item;
        public d upstream;

        public LastSubscriber(SingleObserver<? super T> singleObserver, T t2) {
            this.downstream = singleObserver;
            this.defaultItem = t2;
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
            if (t2 != null) {
                this.item = null;
                this.downstream.onSuccess(t2);
                return;
            }
            T t8 = this.defaultItem;
            if (t8 != null) {
                this.downstream.onSuccess(t8);
            } else {
                this.downstream.onError(new NoSuchElementException());
            }
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

    public FlowableLastSingle(b<T> bVar, T t2) {
        this.source = bVar;
        this.defaultItem = t2;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new LastSubscriber(singleObserver, this.defaultItem));
    }
}
