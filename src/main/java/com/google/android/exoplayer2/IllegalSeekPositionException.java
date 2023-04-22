package com.google.android.exoplayer2;

import w6.x0;

/* loaded from: classes.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final x0 timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(x0 x0Var, int i10, long j10) {
        this.timeline = x0Var;
        this.windowIndex = i10;
        this.positionMs = j10;
    }
}
