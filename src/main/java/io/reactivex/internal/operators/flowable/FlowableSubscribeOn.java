package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    public final boolean nonScheduledRequests;
    public final Scheduler scheduler;

    /* loaded from: classes2.dex */
    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        public final c<? super T> downstream;
        public final boolean nonScheduledRequests;
        public b<T> source;
        public final Scheduler.Worker worker;
        public final AtomicReference<d> upstream = new AtomicReference<>();
        public final AtomicLong requested = new AtomicLong();

        /* loaded from: classes2.dex */
        public static final class Request implements Runnable {
            public final long n;
            public final d upstream;

            public Request(d dVar, long j10) {
                this.upstream = dVar;
                this.n = j10;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.upstream.request(this.n);
            }
        }

        public SubscribeOnSubscriber(c<? super T> cVar, Scheduler.Worker worker, b<T> bVar, boolean z10) {
            this.downstream = cVar;
            this.worker = worker;
            this.source = bVar;
            this.nonScheduledRequests = !z10;
        }

        @Override // df.d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            this.downstream.onNext(t2);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                long andSet = this.requested.getAndSet(0L);
                if (andSet != 0) {
                    requestUpstream(andSet, dVar);
                }
            }
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                d dVar = this.upstream.get();
                if (dVar != null) {
                    requestUpstream(j10, dVar);
                    return;
                }
                BackpressureHelper.add(this.requested, j10);
                d dVar2 = this.upstream.get();
                if (dVar2 != null) {
                    long andSet = this.requested.getAndSet(0L);
                    if (andSet != 0) {
                        requestUpstream(andSet, dVar2);
                    }
                }
            }
        }

        public void requestUpstream(long j10, d dVar) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                dVar.request(j10);
            } else {
                this.worker.schedule(new Request(dVar, j10));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            b<T> bVar = this.source;
            this.source = null;
            bVar.subscribe(this);
        }
    }

    public FlowableSubscribeOn(Flowable<T> flowable, Scheduler scheduler, boolean z10) {
        super(flowable);
        this.scheduler = scheduler;
        this.nonScheduledRequests = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        Scheduler.Worker createWorker = this.scheduler.createWorker();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(cVar, createWorker, this.source, this.nonScheduledRequests);
        cVar.onSubscribe(subscribeOnSubscriber);
        createWorker.schedule(subscribeOnSubscriber);
    }
}
