package io.reactivex.internal.util;

import df.c;

/* loaded from: classes2.dex */
public interface QueueDrain<T, U> {
    boolean accept(c<? super U> cVar, T t2);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int i10);

    long produced(long j10);

    long requested();
}
