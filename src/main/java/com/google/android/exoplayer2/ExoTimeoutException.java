package com.google.android.exoplayer2;

/* loaded from: classes.dex */
public final class ExoTimeoutException extends RuntimeException {
    public final int timeoutOperation;

    public ExoTimeoutException(int i10) {
        super(i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
        this.timeoutOperation = i10;
    }
}
