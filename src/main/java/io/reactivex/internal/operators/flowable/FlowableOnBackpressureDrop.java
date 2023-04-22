package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class FlowableOnBackpressureDrop<T> extends AbstractFlowableWithUpstream<T, T> implements Consumer<T> {
    public final Consumer<? super T> onDrop;

    /* loaded from: classes2.dex */
    public static final class BackpressureDropSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -6246093802440953054L;
        public boolean done;
        public final c<? super T> downstream;
        public final Consumer<? super T> onDrop;
        public d upstream;

        public BackpressureDropSubscriber(c<? super T> cVar, Consumer<? super T> consumer) {
            this.downstream = cVar;
            this.onDrop = consumer;
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

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.done) {
                return;
            }
            if (get() != 0) {
                this.downstream.onNext(t2);
                BackpressureHelper.produced(this, 1L);
                return;
            }
            try {
                this.onDrop.accept(t2);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this, j10);
            }
        }
    }

    public FlowableOnBackpressureDrop(Flowable<T> flowable) {
        super(flowable);
        this.onDrop = this;
    }

    public FlowableOnBackpressureDrop(Flowable<T> flowable, Consumer<? super T> consumer) {
        super(flowable);
        this.onDrop = consumer;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(T t2) {
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber) new BackpressureDropSubscriber(cVar, this.onDrop));
    }
}
