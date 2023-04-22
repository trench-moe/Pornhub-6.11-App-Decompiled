package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* loaded from: classes.dex */
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f6728u = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: c  reason: collision with root package name */
    public final Handler f6729c;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f6730f = new int[1];

    /* renamed from: j  reason: collision with root package name */
    public EGLDisplay f6731j;

    /* renamed from: m  reason: collision with root package name */
    public EGLContext f6732m;
    public EGLSurface n;

    /* renamed from: t  reason: collision with root package name */
    public SurfaceTexture f6733t;

    /* loaded from: classes.dex */
    public static final class GlException extends RuntimeException {
        public GlException(String str, a aVar) {
            super(str);
        }
    }

    public EGLSurfaceTexture(Handler handler) {
        this.f6729c = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f6729c.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        SurfaceTexture surfaceTexture = this.f6733t;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
