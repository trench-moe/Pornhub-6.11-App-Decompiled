package io.reactivex.internal.operators.single;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class SingleFlatMapPublisher<T, R> extends Flowable<R> {
    public final Function<? super T, ? extends b<? extends R>> mapper;
    public final SingleSource<T> source;

    /* loaded from: classes2.dex */
    public static final class SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements SingleObserver<S>, FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 7759721921468635667L;
        public Disposable disposable;
        public final c<? super T> downstream;
        public final Function<? super S, ? extends b<? extends T>> mapper;
        public final AtomicReference<d> parent = new AtomicReference<>();

        public SingleFlatMapPublisherObserver(c<? super T> cVar, Function<? super S, ? extends b<? extends T>> function) {
            this.downstream = cVar;
            this.mapper = function;
        }

        @Override // df.d
        public void cancel() {
            this.disposable.dispose();
            SubscriptionHelper.cancel(this.parent);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            this.downstream.onNext(t2);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.parent, this, dVar);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.disposable = disposable;
            this.downstream.onSubscribe(this);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(S s10) {
            try {
                ((b) ObjectHelper.requireNonNull(this.mapper.apply(s10), "the mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // df.d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.parent, this, j10);
        }
    }

    public SingleFlatMapPublisher(SingleSource<T> singleSource, Function<? super T, ? extends b<? extends R>> function) {
        this.source = singleSource;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        this.source.subscribe(new SingleFlatMapPublisherObserver(cVar, this.mapper));
    }
}
