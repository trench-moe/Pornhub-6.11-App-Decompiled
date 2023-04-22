package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableTimeoutTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    public final b<? extends T> other;
    public final Scheduler scheduler;
    public final long timeout;
    public final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class FallbackSubscriber<T> implements FlowableSubscriber<T> {
        public final SubscriptionArbiter arbiter;
        public final c<? super T> downstream;

        public FallbackSubscriber(c<? super T> cVar, SubscriptionArbiter subscriptionArbiter) {
            this.downstream = cVar;
            this.arbiter = subscriptionArbiter;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            this.downstream.onNext(t2);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            this.arbiter.setSubscription(dVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        public long consumed;
        public final c<? super T> downstream;
        public b<? extends T> fallback;
        public final AtomicLong index;
        public final SequentialDisposable task;
        public final long timeout;
        public final TimeUnit unit;
        public final AtomicReference<d> upstream;
        public final Scheduler.Worker worker;

        public TimeoutFallbackSubscriber(c<? super T> cVar, long j10, TimeUnit timeUnit, Scheduler.Worker worker, b<? extends T> bVar) {
            super(true);
            this.downstream = cVar;
            this.timeout = j10;
            this.unit = timeUnit;
            this.worker = worker;
            this.fallback = bVar;
            this.task = new SequentialDisposable();
            this.upstream = new AtomicReference<>();
            this.index = new AtomicLong();
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, df.d
        public void cancel() {
            super.cancel();
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.task.dispose();
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            long j10 = this.index.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = j10 + 1;
                if (this.index.compareAndSet(j10, j11)) {
                    this.task.get().dispose();
                    this.consumed++;
                    this.downstream.onNext(t2);
                    startTimeout(j11);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                setSubscription(dVar);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j10) {
            if (this.index.compareAndSet(j10, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                long j11 = this.consumed;
                if (j11 != 0) {
                    produced(j11);
                }
                b<? extends T> bVar = this.fallback;
                this.fallback = null;
                bVar.subscribe(new FallbackSubscriber(this.downstream, this));
                this.worker.dispose();
            }
        }

        public void startTimeout(long j10) {
            this.task.replace(this.worker.schedule(new TimeoutTask(j10, this), this.timeout, this.unit));
        }
    }

    /* loaded from: classes2.dex */
    public static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, d, TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        public final c<? super T> downstream;
        public final long timeout;
        public final TimeUnit unit;
        public final Scheduler.Worker worker;
        public final SequentialDisposable task = new SequentialDisposable();
        public final AtomicReference<d> upstream = new AtomicReference<>();
        public final AtomicLong requested = new AtomicLong();

        public TimeoutSubscriber(c<? super T> cVar, long j10, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.downstream = cVar;
            this.timeout = j10;
            this.unit = timeUnit;
            this.worker = worker;
        }

        @Override // df.d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.task.dispose();
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (!compareAndSet(j10, j11)) {
                    return;
                }
                this.task.get().dispose();
                this.downstream.onNext(t2);
                startTimeout(j11);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(new TimeoutException(ExceptionHelper.timeoutMessage(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        @Override // df.d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j10);
        }

        public void startTimeout(long j10) {
            this.task.replace(this.worker.schedule(new TimeoutTask(j10, this), this.timeout, this.unit));
        }
    }

    /* loaded from: classes2.dex */
    public interface TimeoutSupport {
        void onTimeout(long j10);
    }

    /* loaded from: classes2.dex */
    public static final class TimeoutTask implements Runnable {
        public final long idx;
        public final TimeoutSupport parent;

        public TimeoutTask(long j10, TimeoutSupport timeoutSupport) {
            this.idx = j10;
            this.parent = timeoutSupport;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.onTimeout(this.idx);
        }
    }

    public FlowableTimeoutTimed(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, b<? extends T> bVar) {
        super(flowable);
        this.timeout = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.other = bVar;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        if (this.other == null) {
            TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(cVar, this.timeout, this.unit, this.scheduler.createWorker());
            cVar.onSubscribe(timeoutSubscriber);
            timeoutSubscriber.startTimeout(0L);
            this.source.subscribe((FlowableSubscriber) timeoutSubscriber);
            return;
        }
        TimeoutFallbackSubscriber timeoutFallbackSubscriber = new TimeoutFallbackSubscriber(cVar, this.timeout, this.unit, this.scheduler.createWorker(), this.other);
        cVar.onSubscribe(timeoutFallbackSubscriber);
        timeoutFallbackSubscriber.startTimeout(0L);
        this.source.subscribe((FlowableSubscriber) timeoutFallbackSubscriber);
    }
}
