package io.reactivex.internal.subscribers;

import df.c;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrain;
import io.reactivex.internal.util.QueueDrainHelper;

/* loaded from: classes2.dex */
public abstract class QueueDrainSubscriber<T, U, V> extends QueueDrainSubscriberPad4 implements FlowableSubscriber<T>, QueueDrain<U, V> {
    public volatile boolean cancelled;
    public volatile boolean done;
    public final c<? super V> downstream;
    public Throwable error;
    public final SimplePlainQueue<U> queue;

    public QueueDrainSubscriber(c<? super V> cVar, SimplePlainQueue<U> simplePlainQueue) {
        this.downstream = cVar;
        this.queue = simplePlainQueue;
    }

    public boolean accept(c<? super V> cVar, U u2) {
        return false;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean cancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean done() {
        return this.done;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean enter() {
        return this.wip.getAndIncrement() == 0;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final Throwable error() {
        return this.error;
    }

    public final boolean fastEnter() {
        return this.wip.get() == 0 && this.wip.compareAndSet(0, 1);
    }

    public final void fastPathEmitMax(U u2, boolean z10, Disposable disposable) {
        c<? super V> cVar = this.downstream;
        SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (fastEnter()) {
            long j10 = this.requested.get();
            if (j10 == 0) {
                disposable.dispose();
                cVar.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            }
            if (accept(cVar, u2) && j10 != Long.MAX_VALUE) {
                produced(1L);
            }
            if (leave(-1) == 0) {
                return;
            }
        } else {
            simplePlainQueue.offer(u2);
            if (!enter()) {
                return;
            }
        }
        QueueDrainHelper.drainMaxLoop(simplePlainQueue, cVar, z10, disposable, this);
    }

    public final void fastPathOrderedEmitMax(U u2, boolean z10, Disposable disposable) {
        c<? super V> cVar = this.downstream;
        SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (fastEnter()) {
            long j10 = this.requested.get();
            if (j10 == 0) {
                this.cancelled = true;
                disposable.dispose();
                cVar.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else if (simplePlainQueue.isEmpty()) {
                if (accept(cVar, u2) && j10 != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                simplePlainQueue.offer(u2);
            }
        } else {
            simplePlainQueue.offer(u2);
            if (!enter()) {
                return;
            }
        }
        QueueDrainHelper.drainMaxLoop(simplePlainQueue, cVar, z10, disposable, this);
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final int leave(int i10) {
        return this.wip.addAndGet(i10);
    }

    public abstract /* synthetic */ void onComplete();

    public abstract /* synthetic */ void onError(Throwable th);

    public abstract /* synthetic */ void onNext(T t2);

    @Override // io.reactivex.internal.util.QueueDrain
    public final long produced(long j10) {
        return this.requested.addAndGet(-j10);
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final long requested() {
        return this.requested.get();
    }

    public final void requested(long j10) {
        if (SubscriptionHelper.validate(j10)) {
            BackpressureHelper.add(this.requested, j10);
        }
    }
}
