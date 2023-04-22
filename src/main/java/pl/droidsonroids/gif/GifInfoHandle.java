package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.os.Build;
import android.system.Os;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class GifInfoHandle {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f14096b = 0;

    /* renamed from: a  reason: collision with root package name */
    public volatile long f14097a;

    static {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            if (ef.e.f9327a == null) {
                try {
                    ef.e.f9327a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception e10) {
                    throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e10);
                }
            }
            new ff.e().c(ef.e.f9327a, "pl_droidsonroids_gif", null, null);
        }
    }

    public GifInfoHandle() {
    }

    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) {
        int extractNativeFileDescriptor;
        try {
            FileDescriptor fileDescriptor = assetFileDescriptor.getFileDescriptor();
            long startOffset = assetFileDescriptor.getStartOffset();
            if (Build.VERSION.SDK_INT > 27) {
                extractNativeFileDescriptor = createTempNativeFileDescriptor();
                Os.dup2(fileDescriptor, extractNativeFileDescriptor);
            } else {
                extractNativeFileDescriptor = extractNativeFileDescriptor(fileDescriptor, false);
            }
            this.f14097a = openNativeFileDescriptor(extractNativeFileDescriptor, startOffset);
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public GifInfoHandle(String str) {
        this.f14097a = openFile(str);
    }

    private static native void bindSurface(long j10, Surface surface, long[] jArr);

    public static native int createTempNativeFileDescriptor();

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z10);

    private static native void free(long j10);

    private static native int getCurrentFrameIndex(long j10);

    private static native int getCurrentLoop(long j10);

    private static native int getCurrentPosition(long j10);

    private static native int getDuration(long j10);

    private static native int getHeight(long j10);

    private static native int getLoopCount(long j10);

    private static native int getNativeErrorCode(long j10);

    private static native int getNumberOfFrames(long j10);

    private static native long[] getSavedState(long j10);

    private static native int getWidth(long j10);

    private static native boolean isOpaque(long j10);

    public static native long openFile(String str);

    public static native long openNativeFileDescriptor(int i10, long j10);

    private static native void postUnbindSurface(long j10);

    private static native long renderFrame(long j10, Bitmap bitmap);

    private static native boolean reset(long j10);

    private static native long restoreRemainder(long j10);

    private static native int restoreSavedState(long j10, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j10);

    private static native void seekToTime(long j10, int i10, Bitmap bitmap);

    private static native void setLoopCount(long j10, char c10);

    private static native void setOptions(long j10, char c10, boolean z10);

    private static native void setSpeedFactor(long j10, float f10);

    public void a(Surface surface, long[] jArr) {
        bindSurface(this.f14097a, surface, jArr);
    }

    public synchronized int b() {
        return getCurrentFrameIndex(this.f14097a);
    }

    public synchronized int c() {
        return getCurrentLoop(this.f14097a);
    }

    public synchronized int d() {
        return getCurrentPosition(this.f14097a);
    }

    public synchronized int e() {
        return getDuration(this.f14097a);
    }

    public synchronized int f() {
        return getHeight(this.f14097a);
    }

    public void finalize() {
        try {
            o();
        } finally {
            super.finalize();
        }
    }

    public synchronized int g() {
        return getLoopCount(this.f14097a);
    }

    public synchronized int h() {
        return getNativeErrorCode(this.f14097a);
    }

    public synchronized int i() {
        return getNumberOfFrames(this.f14097a);
    }

    public synchronized long[] j() {
        return getSavedState(this.f14097a);
    }

    public synchronized int k() {
        return getWidth(this.f14097a);
    }

    public synchronized boolean l() {
        return isOpaque(this.f14097a);
    }

    public synchronized boolean m() {
        return this.f14097a == 0;
    }

    public synchronized void n() {
        postUnbindSurface(this.f14097a);
    }

    public synchronized void o() {
        free(this.f14097a);
        this.f14097a = 0L;
    }

    public synchronized long p(Bitmap bitmap) {
        return renderFrame(this.f14097a, bitmap);
    }

    public synchronized boolean q() {
        return reset(this.f14097a);
    }

    public synchronized long r() {
        return restoreRemainder(this.f14097a);
    }

    public synchronized int s(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f14097a, jArr, bitmap);
    }

    public synchronized void t() {
        saveRemainder(this.f14097a);
    }

    public synchronized void u(int i10, Bitmap bitmap) {
        seekToTime(this.f14097a, i10, bitmap);
    }

    public void v(int i10) {
        if (i10 < 0 || i10 > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f14097a, (char) i10);
        }
    }

    public void w(char c10, boolean z10) {
        setOptions(this.f14097a, c10, z10);
    }

    public void x(float f10) {
        if (f10 <= 0.0f || Float.isNaN(f10)) {
            throw new IllegalArgumentException("Speed factor is not positive");
        }
        if (f10 < 4.656613E-10f) {
            f10 = 4.656613E-10f;
        }
        synchronized (this) {
            setSpeedFactor(this.f14097a, f10);
        }
    }
}
