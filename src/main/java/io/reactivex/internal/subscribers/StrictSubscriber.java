package io.reactivex.internal.subscribers;

import android.support.v4.media.b;
import df.c;
import df.d;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
    private static final long serialVersionUID = -4945028590049415624L;
    public volatile boolean done;
    public final c<? super T> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public final AtomicLong requested = new AtomicLong();
    public final AtomicReference<d> upstream = new AtomicReference<>();
    public final AtomicBoolean once = new AtomicBoolean();

    public StrictSubscriber(c<? super T> cVar) {
        this.downstream = cVar;
    }

    @Override // df.d
    public void cancel() {
        if (this.done) {
            return;
        }
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public void onComplete() {
        this.done = true;
        HalfSerializer.onComplete(this.downstream, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public void onError(Throwable th) {
        this.done = true;
        HalfSerializer.onError(this.downstream, th, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public void onNext(T t2) {
        HalfSerializer.onNext(this.downstream, t2, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public void onSubscribe(d dVar) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
            return;
        }
        dVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    @Override // df.d
    public void request(long j10) {
        if (j10 > 0) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j10);
            return;
        }
        cancel();
        onError(new IllegalArgumentException(b.h("§3.9 violated: positive request amount required but it was ", j10)));
    }
}
