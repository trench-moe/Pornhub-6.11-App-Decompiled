package com.google.android.exoplayer2;

import s6.q;

/* loaded from: classes.dex */
public class PlaybackException extends Exception {
    public final int errorCode;
    public final long timestampMs;

    static {
        q qVar = q.f14885j;
    }

    public PlaybackException(String str, Throwable th, int i10, long j10) {
        super(str, th);
        this.errorCode = i10;
        this.timestampMs = j10;
    }
}
