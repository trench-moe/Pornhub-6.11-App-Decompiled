package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class FlowableDelay<T> extends AbstractFlowableWithUpstream<T, T> {
    public final long delay;
    public final boolean delayError;
    public final Scheduler scheduler;
    public final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class DelaySubscriber<T> implements FlowableSubscriber<T>, d {
        public final long delay;
        public final boolean delayError;
        public final c<? super T> downstream;
        public final TimeUnit unit;
        public d upstream;

        /* renamed from: w  reason: collision with root package name */
        public final Scheduler.Worker f10735w;

        /* loaded from: classes2.dex */
        public final class OnComplete implements Runnable {
            public OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onComplete();
                    DelaySubscriber.this.f10735w.dispose();
                } catch (Throwable th) {
                    DelaySubscriber.this.f10735w.dispose();
                    throw th;
                }
            }
        }

        /* loaded from: classes2.dex */
        public final class OnError implements Runnable {

            /* renamed from: t  reason: collision with root package name */
            private final Throwable f10736t;

            public OnError(Throwable th) {
                this.f10736t = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onError(this.f10736t);
                    DelaySubscriber.this.f10735w.dispose();
                } catch (Throwable th) {
                    DelaySubscriber.this.f10735w.dispose();
                    throw th;
                }
            }
        }

        /* loaded from: classes2.dex */
        public final class OnNext implements Runnable {

            /* renamed from: t  reason: collision with root package name */
            private final T f10737t;

            public OnNext(T t2) {
                this.f10737t = t2;
            }

            @Override // java.lang.Runnable
            public void run() {
                DelaySubscriber.this.downstream.onNext((T) this.f10737t);
            }
        }

        public DelaySubscriber(c<? super T> cVar, long j10, TimeUnit timeUnit, Scheduler.Worker worker, boolean z10) {
            this.downstream = cVar;
            this.delay = j10;
            this.unit = timeUnit;
            this.f10735w = worker;
            this.delayError = z10;
        }

        @Override // df.d
        public void cancel() {
            this.upstream.cancel();
            this.f10735w.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.f10735w.schedule(new OnComplete(), this.delay, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.f10735w.schedule(new OnError(th), this.delayError ? this.delay : 0L, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            this.f10735w.schedule(new OnNext(t2), this.delay, this.unit);
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

    public FlowableDelay(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        super(flowable);
        this.delay = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber) new DelaySubscriber(this.delayError ? cVar : new SerializedSubscriber(cVar), this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }
}
