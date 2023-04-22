package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes2.dex */
public final class FlowableScan<T> extends AbstractFlowableWithUpstream<T, T> {
    public final BiFunction<T, T, T> accumulator;

    /* loaded from: classes2.dex */
    public static final class ScanSubscriber<T> implements FlowableSubscriber<T>, d {
        public final BiFunction<T, T, T> accumulator;
        public boolean done;
        public final c<? super T> downstream;
        public d upstream;
        public T value;

        public ScanSubscriber(c<? super T> cVar, BiFunction<T, T, T> biFunction) {
            this.downstream = cVar;
            this.accumulator = biFunction;
        }

        @Override // df.d
        public void cancel() {
            this.upstream.cancel();
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

        /* JADX WARN: Type inference failed for: r5v8, types: [T, java.lang.Object] */
        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.done) {
                return;
            }
            c<? super T> cVar = this.downstream;
            T t8 = this.value;
            if (t8 == null) {
                this.value = t2;
                cVar.onNext(t2);
                return;
            }
            try {
                ?? r52 = (T) ObjectHelper.requireNonNull(this.accumulator.apply(t8, t2), "The value returned by the accumulator is null");
                this.value = r52;
                cVar.onNext(r52);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
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

    public FlowableScan(Flowable<T> flowable, BiFunction<T, T, T> biFunction) {
        super(flowable);
        this.accumulator = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber) new ScanSubscriber(cVar, this.accumulator));
    }
}
