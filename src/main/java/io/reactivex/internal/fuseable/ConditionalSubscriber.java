package io.reactivex.internal.fuseable;

import io.reactivex.FlowableSubscriber;

/* loaded from: classes2.dex */
public interface ConditionalSubscriber<T> extends FlowableSubscriber<T> {
    @Override // io.reactivex.FlowableSubscriber, df.c
    /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, df.c
    /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, df.c
    /* synthetic */ void onNext(T t2);

    boolean tryOnNext(T t2);
}
