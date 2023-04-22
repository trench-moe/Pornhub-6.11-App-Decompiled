package io.reactivex.internal.operators.mixed;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class MaybeFlatMapPublisher<T, R> extends Flowable<R> {
    public final Function<? super T, ? extends b<? extends R>> mapper;
    public final MaybeSource<T> source;

    /* loaded from: classes2.dex */
    public static final class FlatMapPublisherSubscriber<T, R> extends AtomicReference<d> implements FlowableSubscriber<R>, MaybeObserver<T>, d {
        private static final long serialVersionUID = -8948264376121066672L;
        public final c<? super R> downstream;
        public final Function<? super T, ? extends b<? extends R>> mapper;
        public final AtomicLong requested = new AtomicLong();
        public Disposable upstream;

        public FlatMapPublisherSubscriber(c<? super R> cVar, Function<? super T, ? extends b<? extends R>> function) {
            this.downstream = cVar;
            this.mapper = function;
        }

        @Override // df.d
        public void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
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
        public void onNext(R r10) {
            this.downstream.onNext(r10);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this, this.requested, dVar);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t2) {
            try {
                ((b) ObjectHelper.requireNonNull(this.mapper.apply(t2), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // df.d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this, this.requested, j10);
        }
    }

    public MaybeFlatMapPublisher(MaybeSource<T> maybeSource, Function<? super T, ? extends b<? extends R>> function) {
        this.source = maybeSource;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        this.source.subscribe(new FlatMapPublisherSubscriber(cVar, this.mapper));
    }
}
