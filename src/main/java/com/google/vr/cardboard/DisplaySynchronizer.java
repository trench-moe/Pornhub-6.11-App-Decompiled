package com.google.vr.cardboard;

import android.view.Choreographer;

/* loaded from: classes.dex */
public class DisplaySynchronizer implements Choreographer.FrameCallback {

    /* renamed from: c  reason: collision with root package name */
    public Choreographer f8105c;

    /* renamed from: f  reason: collision with root package name */
    public final long f8106f = nativeInit(16666666);

    public DisplaySynchronizer() {
        Choreographer choreographer = Choreographer.getInstance();
        this.f8105c = choreographer;
        choreographer.postFrameCallback(this);
    }

    private native void nativeAddSyncTime(long j10, long j11);

    private native void nativeDestroy(long j10);

    private native long nativeInit(long j10);

    private native long nativeRetainNativeDisplaySynchronizer(long j10);

    private native long nativeSyncToNextVsync(long j10);

    public long a() {
        return nativeRetainNativeDisplaySynchronizer(this.f8106f);
    }

    public long b() {
        return nativeSyncToNextVsync(this.f8106f);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        nativeAddSyncTime(this.f8106f, j10);
        this.f8105c.postFrameCallback(this);
    }

    public void finalize() {
        try {
            nativeDestroy(this.f8106f);
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
