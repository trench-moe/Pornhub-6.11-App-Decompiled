package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class FlowableUsing<T, D> extends Flowable<T> {
    public final Consumer<? super D> disposer;
    public final boolean eager;
    public final Callable<? extends D> resourceSupplier;
    public final Function<? super D, ? extends b<? extends T>> sourceSupplier;

    /* loaded from: classes2.dex */
    public static final class UsingSubscriber<T, D> extends AtomicBoolean implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 5904473792286235046L;
        public final Consumer<? super D> disposer;
        public final c<? super T> downstream;
        public final boolean eager;
        public final D resource;
        public d upstream;

        public UsingSubscriber(c<? super T> cVar, D d, Consumer<? super D> consumer, boolean z10) {
            this.downstream = cVar;
            this.resource = d;
            this.disposer = consumer;
            this.eager = z10;
        }

        @Override // df.d
        public void cancel() {
            disposeAfter();
            this.upstream.cancel();
        }

        public void disposeAfter() {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept((D) this.resource);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (!this.eager) {
                this.downstream.onComplete();
                this.upstream.cancel();
                disposeAfter();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept((D) this.resource);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.downstream.onError(th);
                    return;
                }
            }
            this.upstream.cancel();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (!this.eager) {
                this.downstream.onError(th);
                this.upstream.cancel();
                disposeAfter();
                return;
            }
            Throwable th2 = null;
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept((D) this.resource);
                } catch (Throwable th3) {
                    th2 = th3;
                    Exceptions.throwIfFatal(th2);
                }
            }
            this.upstream.cancel();
            if (th2 != null) {
                this.downstream.onError(new CompositeException(th, th2));
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            this.downstream.onNext(t2);
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

    public FlowableUsing(Callable<? extends D> callable, Function<? super D, ? extends b<? extends T>> function, Consumer<? super D> consumer, boolean z10) {
        this.resourceSupplier = callable;
        this.sourceSupplier = function;
        this.disposer = consumer;
        this.eager = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        try {
            D call = this.resourceSupplier.call();
            try {
                ((b) ObjectHelper.requireNonNull(this.sourceSupplier.apply(call), "The sourceSupplier returned a null Publisher")).subscribe(new UsingSubscriber(cVar, call, this.disposer, this.eager));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                try {
                    this.disposer.accept(call);
                    EmptySubscription.error(th, cVar);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptySubscription.error(new CompositeException(th, th2), cVar);
                }
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptySubscription.error(th3, cVar);
        }
    }
}
