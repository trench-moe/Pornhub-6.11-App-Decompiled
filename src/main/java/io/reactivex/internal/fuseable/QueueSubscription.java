package io.reactivex.internal.fuseable;

import df.d;

/* loaded from: classes2.dex */
public interface QueueSubscription<T> extends QueueFuseable<T>, d {
    @Override // df.d
    /* synthetic */ void cancel();

    @Override // df.d
    /* synthetic */ void request(long j10);
}
