package io.reactivex;

import df.c;
import df.d;
import io.reactivex.annotations.NonNull;

/* loaded from: classes2.dex */
public interface FlowableSubscriber<T> extends c<T> {
    @Override // df.c
    /* synthetic */ void onComplete();

    @Override // df.c
    /* synthetic */ void onError(Throwable th);

    @Override // df.c
    /* synthetic */ void onNext(T t2);

    @Override // df.c
    void onSubscribe(@NonNull d dVar);
}
