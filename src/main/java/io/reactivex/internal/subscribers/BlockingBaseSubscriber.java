package io.reactivex.internal.subscribers;

import df.d;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public abstract class BlockingBaseSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T> {
    public volatile boolean cancelled;
    public Throwable error;
    public d upstream;
    public T value;

    public BlockingBaseSubscriber() {
        super(1);
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e10) {
                d dVar = this.upstream;
                this.upstream = SubscriptionHelper.CANCELLED;
                if (dVar != null) {
                    dVar.cancel();
                }
                throw ExceptionHelper.wrapOrThrow(e10);
            }
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw ExceptionHelper.wrapOrThrow(th);
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, df.c
    public abstract /* synthetic */ void onNext(T t2);

    @Override // io.reactivex.FlowableSubscriber, df.c
    public final void onSubscribe(d dVar) {
        if (SubscriptionHelper.validate(this.upstream, dVar)) {
            this.upstream = dVar;
            if (!this.cancelled) {
                dVar.request(Long.MAX_VALUE);
                if (this.cancelled) {
                    this.upstream = SubscriptionHelper.CANCELLED;
                    dVar.cancel();
                }
            }
        }
    }
}
