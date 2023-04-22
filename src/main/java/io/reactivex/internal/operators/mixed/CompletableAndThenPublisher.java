package io.reactivex.internal.operators.mixed;

import df.b;
import df.c;
import df.d;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class CompletableAndThenPublisher<R> extends Flowable<R> {
    public final b<? extends R> other;
    public final CompletableSource source;

    /* loaded from: classes2.dex */
    public static final class AndThenPublisherSubscriber<R> extends AtomicReference<d> implements FlowableSubscriber<R>, CompletableObserver, d {
        private static final long serialVersionUID = -8948264376121066672L;
        public final c<? super R> downstream;
        public b<? extends R> other;
        public final AtomicLong requested = new AtomicLong();
        public Disposable upstream;

        public AndThenPublisherSubscriber(c<? super R> cVar, b<? extends R> bVar) {
            this.downstream = cVar;
            this.other = bVar;
        }

        @Override // df.d
        public void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            b<? extends R> bVar = this.other;
            if (bVar == null) {
                this.downstream.onComplete();
                return;
            }
            this.other = null;
            bVar.subscribe(this);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(R r10) {
            this.downstream.onNext(r10);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this, this.requested, dVar);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // df.d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this, this.requested, j10);
        }
    }

    public CompletableAndThenPublisher(CompletableSource completableSource, b<? extends R> bVar) {
        this.source = completableSource;
        this.other = bVar;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        this.source.subscribe(new AndThenPublisherSubscriber(cVar, this.other));
    }
}
