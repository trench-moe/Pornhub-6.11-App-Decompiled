package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {
    public final boolean delayError;
    public final b<? extends T>[] sources;

    /* loaded from: classes2.dex */
    public static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        public final boolean delayError;
        public final c<? super T> downstream;
        public List<Throwable> errors;
        public int index;
        public long produced;
        public final b<? extends T>[] sources;
        public final AtomicInteger wip;

        public ConcatArraySubscriber(b<? extends T>[] bVarArr, boolean z10, c<? super T> cVar) {
            super(false);
            this.downstream = cVar;
            this.sources = bVarArr;
            this.delayError = z10;
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                b<? extends T>[] bVarArr = this.sources;
                int length = bVarArr.length;
                int i10 = this.index;
                while (i10 != length) {
                    b<? extends T> bVar = bVarArr[i10];
                    if (bVar == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (!this.delayError) {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                        List list = this.errors;
                        if (list == null) {
                            list = new ArrayList((length - i10) + 1);
                            this.errors = list;
                        }
                        list.add(nullPointerException);
                        i10++;
                    } else {
                        long j10 = this.produced;
                        if (j10 != 0) {
                            this.produced = 0L;
                            produced(j10);
                        }
                        bVar.subscribe(this);
                        i10++;
                        this.index = i10;
                        if (this.wip.decrementAndGet() == 0) {
                        }
                    }
                }
                List<Throwable> list2 = this.errors;
                if (list2 == null) {
                    this.downstream.onComplete();
                } else if (list2.size() == 1) {
                    this.downstream.onError(list2.get(0));
                } else {
                    this.downstream.onError(new CompositeException(list2));
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (!this.delayError) {
                this.downstream.onError(th);
                return;
            }
            List list = this.errors;
            if (list == null) {
                list = new ArrayList((this.sources.length - this.index) + 1);
                this.errors = list;
            }
            list.add(th);
            onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            this.produced++;
            this.downstream.onNext(t2);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            setSubscription(dVar);
        }
    }

    public FlowableConcatArray(b<? extends T>[] bVarArr, boolean z10) {
        this.sources = bVarArr;
        this.delayError = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.sources, this.delayError, cVar);
        cVar.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
