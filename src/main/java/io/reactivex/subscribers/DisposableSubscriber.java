package io.reactivex.subscribers;

import df.d;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {
    public final AtomicReference<d> upstream = new AtomicReference<>();

    public final void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public abstract /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, df.c
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, df.c
    public abstract /* synthetic */ void onNext(T t2);

    public void onStart() {
        this.upstream.get().request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public final void onSubscribe(d dVar) {
        if (EndConsumerHelper.setOnce(this.upstream, dVar, getClass())) {
            onStart();
        }
    }

    public final void request(long j10) {
        this.upstream.get().request(j10);
    }
}
