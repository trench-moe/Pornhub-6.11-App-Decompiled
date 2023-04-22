package io.reactivex.internal.subscribers;

import df.d;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<T>, d {
    private static final long serialVersionUID = 22876611072430776L;
    public volatile boolean done;
    public int fusionMode;
    public final int limit;
    public final InnerQueuedSubscriberSupport<T> parent;
    public final int prefetch;
    public long produced;
    public volatile SimpleQueue<T> queue;

    public InnerQueuedSubscriber(InnerQueuedSubscriberSupport<T> innerQueuedSubscriberSupport, int i10) {
        this.parent = innerQueuedSubscriberSupport;
        this.prefetch = i10;
        this.limit = i10 - (i10 >> 2);
    }

    @Override // df.d
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDone() {
        return this.done;
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public void onNext(T t2) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t2);
        } else {
            this.parent.drain();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public void onSubscribe(d dVar) {
        if (SubscriptionHelper.setOnce(this, dVar)) {
            if (dVar instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) dVar;
                int requestFusion = queueSubscription.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = queueSubscription;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = queueSubscription;
                    QueueDrainHelper.request(dVar, this.prefetch);
                    return;
                }
            }
            this.queue = QueueDrainHelper.createQueue(this.prefetch);
            QueueDrainHelper.request(dVar, this.prefetch);
        }
    }

    public SimpleQueue<T> queue() {
        return this.queue;
    }

    @Override // df.d
    public void request(long j10) {
        if (this.fusionMode != 1) {
            long j11 = this.produced + j10;
            if (j11 >= this.limit) {
                this.produced = 0L;
                get().request(j11);
                return;
            }
            this.produced = j11;
        }
    }

    public void requestOne() {
        if (this.fusionMode != 1) {
            long j10 = this.produced + 1;
            if (j10 == this.limit) {
                this.produced = 0L;
                get().request(j10);
                return;
            }
            this.produced = j10;
        }
    }

    public void setDone() {
        this.done = true;
    }
}
