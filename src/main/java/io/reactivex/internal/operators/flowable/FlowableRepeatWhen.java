package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableRepeatWhen<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Function<? super Flowable<Object>, ? extends b<?>> handler;

    /* loaded from: classes2.dex */
    public static final class RepeatWhenSubscriber<T> extends WhenSourceSubscriber<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        public RepeatWhenSubscriber(c<? super T> cVar, FlowableProcessor<Object> flowableProcessor, d dVar) {
            super(cVar, flowableProcessor, dVar);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            again(0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.receiver.cancel();
            this.downstream.onError(th);
        }
    }

    /* loaded from: classes2.dex */
    public static final class WhenReceiver<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, d {
        private static final long serialVersionUID = 2827772011130406689L;
        public final b<T> source;
        public WhenSourceSubscriber<T, U> subscriber;
        public final AtomicReference<d> upstream = new AtomicReference<>();
        public final AtomicLong requested = new AtomicLong();

        public WhenReceiver(b<T> bVar) {
            this.source = bVar;
        }

        @Override // df.d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.subscriber.cancel();
            this.subscriber.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.subscriber.cancel();
            this.subscriber.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                    this.source.subscribe(this.subscriber);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
        }

        @Override // df.d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j10);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        public final c<? super T> downstream;
        public final FlowableProcessor<U> processor;
        private long produced;
        public final d receiver;

        public WhenSourceSubscriber(c<? super T> cVar, FlowableProcessor<U> flowableProcessor, d dVar) {
            super(false);
            this.downstream = cVar;
            this.processor = flowableProcessor;
            this.receiver = dVar;
        }

        public final void again(U u2) {
            setSubscription(EmptySubscription.INSTANCE);
            long j10 = this.produced;
            if (j10 != 0) {
                this.produced = 0L;
                produced(j10);
            }
            this.receiver.request(1L);
            this.processor.onNext(u2);
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, df.d
        public final void cancel() {
            super.cancel();
            this.receiver.cancel();
        }

        public abstract /* synthetic */ void onComplete();

        public abstract /* synthetic */ void onError(Throwable th);

        @Override // io.reactivex.FlowableSubscriber, df.c
        public final void onNext(T t2) {
            this.produced++;
            this.downstream.onNext(t2);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public final void onSubscribe(d dVar) {
            setSubscription(dVar);
        }
    }

    public FlowableRepeatWhen(Flowable<T> flowable, Function<? super Flowable<Object>, ? extends b<?>> function) {
        super(flowable);
        this.handler = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(cVar);
        FlowableProcessor<T> serialized = UnicastProcessor.create(8).toSerialized();
        try {
            b bVar = (b) ObjectHelper.requireNonNull(this.handler.apply(serialized), "handler returned a null Publisher");
            WhenReceiver whenReceiver = new WhenReceiver(this.source);
            RepeatWhenSubscriber repeatWhenSubscriber = new RepeatWhenSubscriber(serializedSubscriber, serialized, whenReceiver);
            whenReceiver.subscriber = repeatWhenSubscriber;
            cVar.onSubscribe(repeatWhenSubscriber);
            bVar.subscribe(whenReceiver);
            whenReceiver.onNext(0);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
