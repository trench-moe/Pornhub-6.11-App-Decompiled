package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class FlowableZipIterable<T, U, V> extends AbstractFlowableWithUpstream<T, V> {
    public final Iterable<U> other;
    public final BiFunction<? super T, ? super U, ? extends V> zipper;

    /* loaded from: classes2.dex */
    public static final class ZipIterableSubscriber<T, U, V> implements FlowableSubscriber<T>, d {
        public boolean done;
        public final c<? super V> downstream;
        public final Iterator<U> iterator;
        public d upstream;
        public final BiFunction<? super T, ? super U, ? extends V> zipper;

        public ZipIterableSubscriber(c<? super V> cVar, Iterator<U> it, BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.downstream = cVar;
            this.iterator = it;
            this.zipper = biFunction;
        }

        @Override // df.d
        public void cancel() {
            this.upstream.cancel();
        }

        public void error(Throwable th) {
            Exceptions.throwIfFatal(th);
            this.done = true;
            this.upstream.cancel();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.done) {
                return;
            }
            try {
                try {
                    this.downstream.onNext(ObjectHelper.requireNonNull(this.zipper.apply(t2, ObjectHelper.requireNonNull(this.iterator.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (!this.iterator.hasNext()) {
                            this.done = true;
                            this.upstream.cancel();
                            this.downstream.onComplete();
                        }
                    } catch (Throwable th) {
                        error(th);
                    }
                } catch (Throwable th2) {
                    error(th2);
                }
            } catch (Throwable th3) {
                error(th3);
            }
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

    public FlowableZipIterable(Flowable<T> flowable, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        super(flowable);
        this.other = iterable;
        this.zipper = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super V> cVar) {
        try {
            Iterator it = (Iterator) ObjectHelper.requireNonNull(this.other.iterator(), "The iterator returned by other is null");
            try {
                if (it.hasNext()) {
                    this.source.subscribe((FlowableSubscriber) new ZipIterableSubscriber(cVar, it, this.zipper));
                } else {
                    EmptySubscription.complete(cVar);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, cVar);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, cVar);
        }
    }
}
