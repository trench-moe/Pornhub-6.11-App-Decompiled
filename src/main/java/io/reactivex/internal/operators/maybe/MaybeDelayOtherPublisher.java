package io.reactivex.internal.operators.maybe;

import df.b;
import df.d;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class MaybeDelayOtherPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {
    public final b<U> other;

    /* loaded from: classes2.dex */
    public static final class DelayMaybeObserver<T, U> implements MaybeObserver<T>, Disposable {
        public final OtherSubscriber<T> other;
        public final b<U> otherSource;
        public Disposable upstream;

        public DelayMaybeObserver(MaybeObserver<? super T> maybeObserver, b<U> bVar) {
            this.other = new OtherSubscriber<>(maybeObserver);
            this.otherSource = bVar;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
            SubscriptionHelper.cancel(this.other);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.other.get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.upstream = DisposableHelper.DISPOSED;
            subscribeNext();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.upstream = DisposableHelper.DISPOSED;
            this.other.error = th;
            subscribeNext();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.other.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t2) {
            this.upstream = DisposableHelper.DISPOSED;
            this.other.value = t2;
            subscribeNext();
        }

        public void subscribeNext() {
            this.otherSource.subscribe(this.other);
        }
    }

    /* loaded from: classes2.dex */
    public static final class OtherSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<Object> {
        private static final long serialVersionUID = -1215060610805418006L;
        public final MaybeObserver<? super T> downstream;
        public Throwable error;
        public T value;

        public OtherSubscriber(MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
                return;
            }
            T t2 = this.value;
            if (t2 != null) {
                this.downstream.onSuccess(t2);
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            Throwable th2 = this.error;
            if (th2 == null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onError(new CompositeException(th2, th));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(Object obj) {
            d dVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (dVar != subscriptionHelper) {
                lazySet(subscriptionHelper);
                dVar.cancel();
                onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
        }
    }

    public MaybeDelayOtherPublisher(MaybeSource<T> maybeSource, b<U> bVar) {
        super(maybeSource);
        this.other = bVar;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new DelayMaybeObserver(maybeObserver, this.other));
    }
}
