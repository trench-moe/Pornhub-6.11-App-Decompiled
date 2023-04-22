package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableAmb<T> extends Flowable<T> {
    public final b<? extends T>[] sources;
    public final Iterable<? extends b<? extends T>> sourcesIterable;

    /* loaded from: classes2.dex */
    public static final class AmbCoordinator<T> implements d {
        public final c<? super T> downstream;
        public final AmbInnerSubscriber<T>[] subscribers;
        public final AtomicInteger winner = new AtomicInteger();

        public AmbCoordinator(c<? super T> cVar, int i10) {
            this.downstream = cVar;
            this.subscribers = new AmbInnerSubscriber[i10];
        }

        @Override // df.d
        public void cancel() {
            if (this.winner.get() != -1) {
                this.winner.lazySet(-1);
                for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                    ambInnerSubscriber.cancel();
                }
            }
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                int i10 = this.winner.get();
                if (i10 > 0) {
                    this.subscribers[i10 - 1].request(j10);
                } else if (i10 == 0) {
                    for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                        ambInnerSubscriber.request(j10);
                    }
                }
            }
        }

        public void subscribe(b<? extends T>[] bVarArr) {
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                ambInnerSubscriberArr[i10] = new AmbInnerSubscriber<>(this, i11, this.downstream);
                i10 = i11;
            }
            this.winner.lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i12 = 0; i12 < length && this.winner.get() == 0; i12++) {
                bVarArr[i12].subscribe(ambInnerSubscriberArr[i12]);
            }
        }

        public boolean win(int i10) {
            int i11 = 0;
            if (this.winner.get() == 0 && this.winner.compareAndSet(0, i10)) {
                AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
                int length = ambInnerSubscriberArr.length;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    if (i12 != i10) {
                        ambInnerSubscriberArr[i11].cancel();
                    }
                    i11 = i12;
                }
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class AmbInnerSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -1185974347409665484L;
        public final c<? super T> downstream;
        public final int index;
        public final AtomicLong missedRequested = new AtomicLong();
        public final AmbCoordinator<T> parent;
        public boolean won;

        public AmbInnerSubscriber(AmbCoordinator<T> ambCoordinator, int i10, c<? super T> cVar) {
            this.parent = ambCoordinator;
            this.index = i10;
            this.downstream = cVar;
        }

        @Override // df.d
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (!this.parent.win(this.index)) {
                get().cancel();
            } else {
                this.won = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.won) {
                this.downstream.onError(th);
            } else if (this.parent.win(this.index)) {
                this.won = true;
                this.downstream.onError(th);
            } else {
                get().cancel();
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.won) {
                this.downstream.onNext(t2);
            } else if (!this.parent.win(this.index)) {
                get().cancel();
            } else {
                this.won = true;
                this.downstream.onNext(t2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this, this.missedRequested, dVar);
        }

        @Override // df.d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this, this.missedRequested, j10);
        }
    }

    public FlowableAmb(b<? extends T>[] bVarArr, Iterable<? extends b<? extends T>> iterable) {
        this.sources = bVarArr;
        this.sourcesIterable = iterable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        int length;
        b<? extends T>[] bVarArr = this.sources;
        if (bVarArr == null) {
            bVarArr = new b[8];
            try {
                length = 0;
                for (b<? extends T> bVar : this.sourcesIterable) {
                    if (bVar == null) {
                        EmptySubscription.error(new NullPointerException("One of the sources is null"), cVar);
                        return;
                    }
                    if (length == bVarArr.length) {
                        b<? extends T>[] bVarArr2 = new b[(length >> 2) + length];
                        System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                        bVarArr = bVarArr2;
                    }
                    int i10 = length + 1;
                    bVarArr[length] = bVar;
                    length = i10;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, cVar);
                return;
            }
        } else {
            length = bVarArr.length;
        }
        if (length == 0) {
            EmptySubscription.complete(cVar);
        } else if (length == 1) {
            bVarArr[0].subscribe(cVar);
        } else {
            new AmbCoordinator(cVar, length).subscribe(bVarArr);
        }
    }
}
