package l8;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import java.util.Objects;
import k8.c0;

/* loaded from: classes2.dex */
public final class d extends Surface {

    /* renamed from: m  reason: collision with root package name */
    public static int f12656m;
    public static boolean n;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12657c;

    /* renamed from: f  reason: collision with root package name */
    public final b f12658f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12659j;

    /* loaded from: classes2.dex */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: c  reason: collision with root package name */
        public EGLSurfaceTexture f12660c;

        /* renamed from: f  reason: collision with root package name */
        public Handler f12661f;

        /* renamed from: j  reason: collision with root package name */
        public Error f12662j;

        /* renamed from: m  reason: collision with root package name */
        public RuntimeException f12663m;
        public d n;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        public final void a(int i10) {
            EGLSurface eglCreatePbufferSurface;
            Objects.requireNonNull(this.f12660c);
            EGLSurfaceTexture eGLSurfaceTexture = this.f12660c;
            Objects.requireNonNull(eGLSurfaceTexture);
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (eglGetDisplay == null) {
                throw new EGLSurfaceTexture.GlException("eglGetDisplay failed", null);
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                throw new EGLSurfaceTexture.GlException("eglInitialize failed", null);
            }
            eGLSurfaceTexture.f6731j = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, EGLSurfaceTexture.f6728u, 0, eGLConfigArr, 0, 1, iArr2, 0);
            if (!eglChooseConfig || iArr2[0] <= 0 || eGLConfigArr[0] == null) {
                throw new EGLSurfaceTexture.GlException(c0.k("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), null);
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLSurfaceTexture.f6731j, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            if (eglCreateContext == null) {
                throw new EGLSurfaceTexture.GlException("eglCreateContext failed", null);
            }
            eGLSurfaceTexture.f6732m = eglCreateContext;
            EGLDisplay eGLDisplay = eGLSurfaceTexture.f6731j;
            if (i10 == 1) {
                eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                if (eglCreatePbufferSurface == null) {
                    throw new EGLSurfaceTexture.GlException("eglCreatePbufferSurface failed", null);
                }
            }
            if (!EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                throw new EGLSurfaceTexture.GlException("eglMakeCurrent failed", null);
            }
            eGLSurfaceTexture.n = eglCreatePbufferSurface;
            GLES20.glGenTextures(1, eGLSurfaceTexture.f6730f, 0);
            a0.b.k();
            SurfaceTexture surfaceTexture = new SurfaceTexture(eGLSurfaceTexture.f6730f[0]);
            eGLSurfaceTexture.f6733t = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(eGLSurfaceTexture);
            SurfaceTexture surfaceTexture2 = this.f12660c.f6733t;
            Objects.requireNonNull(surfaceTexture2);
            this.n = new d(this, surfaceTexture2, i10 != 0, null);
        }

        /* JADX WARN: Finally extract failed */
        public final void b() {
            Objects.requireNonNull(this.f12660c);
            EGLSurfaceTexture eGLSurfaceTexture = this.f12660c;
            eGLSurfaceTexture.f6729c.removeCallbacks(eGLSurfaceTexture);
            try {
                SurfaceTexture surfaceTexture = eGLSurfaceTexture.f6733t;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, eGLSurfaceTexture.f6730f, 0);
                }
                EGLDisplay eGLDisplay = eGLSurfaceTexture.f6731j;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = eGLSurfaceTexture.f6731j;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = eGLSurfaceTexture.n;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(eGLSurfaceTexture.f6731j, eGLSurfaceTexture.n);
                }
                EGLContext eGLContext = eGLSurfaceTexture.f6732m;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLSurfaceTexture.f6731j, eGLContext);
                }
                if (c0.f11939a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = eGLSurfaceTexture.f6731j;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(eGLSurfaceTexture.f6731j);
                }
                eGLSurfaceTexture.f6731j = null;
                eGLSurfaceTexture.f6732m = null;
                eGLSurfaceTexture.n = null;
                eGLSurfaceTexture.f6733t = null;
            } catch (Throwable th) {
                EGLDisplay eGLDisplay4 = eGLSurfaceTexture.f6731j;
                if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay5 = eGLSurfaceTexture.f6731j;
                    EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface4 = eGLSurfaceTexture.n;
                if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(eGLSurfaceTexture.f6731j, eGLSurfaceTexture.n);
                }
                EGLContext eGLContext2 = eGLSurfaceTexture.f6732m;
                if (eGLContext2 != null) {
                    EGL14.eglDestroyContext(eGLSurfaceTexture.f6731j, eGLContext2);
                }
                if (c0.f11939a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay6 = eGLSurfaceTexture.f6731j;
                if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(eGLSurfaceTexture.f6731j);
                }
                eGLSurfaceTexture.f6731j = null;
                eGLSurfaceTexture.f6732m = null;
                eGLSurfaceTexture.n = null;
                eGLSurfaceTexture.f6733t = null;
                throw th;
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                r3 = r7
                int r0 = r8.what
                r6 = 2
                r1 = 1
                r6 = 2
                if (r0 == r1) goto L28
                r5 = 2
                r8 = r5
                if (r0 == r8) goto Le
                r6 = 3
                return r1
            Le:
                r6 = 4
                r3.b()     // Catch: java.lang.Throwable -> L16
            L12:
                r3.quit()
                goto L21
            L16:
                r8 = move-exception
                java.lang.String r6 = "DummySurface"
                r0 = r6
                java.lang.String r2 = "Failed to release dummy surface"
                r5 = 6
                k8.a.i(r0, r2, r8)     // Catch: java.lang.Throwable -> L22
                goto L12
            L21:
                return r1
            L22:
                r8 = move-exception
                r3.quit()
                throw r8
                r6 = 4
            L28:
                int r8 = r8.arg1     // Catch: java.lang.Throwable -> L3a java.lang.Error -> L3c java.lang.RuntimeException -> L53
                r6 = 3
                r3.a(r8)     // Catch: java.lang.Throwable -> L3a java.lang.Error -> L3c java.lang.RuntimeException -> L53
                monitor-enter(r3)
                r6 = 3
                r3.notify()     // Catch: java.lang.Throwable -> L36
                r6 = 6
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
                goto L67
            L36:
                r8 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
                throw r8
                r6 = 4
            L3a:
                r8 = move-exception
                goto L6c
            L3c:
                r8 = move-exception
                r5 = 1
                java.lang.String r6 = "DummySurface"
                r0 = r6
                java.lang.String r6 = "Failed to initialize dummy surface"
                r2 = r6
                k8.a.i(r0, r2, r8)     // Catch: java.lang.Throwable -> L3a
                r3.f12662j = r8     // Catch: java.lang.Throwable -> L3a
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L50
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L50
                r5 = 7
                goto L67
            L50:
                r8 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L50
                throw r8
            L53:
                r8 = move-exception
                r6 = 7
                java.lang.String r6 = "DummySurface"
                r0 = r6
                java.lang.String r2 = "Failed to initialize dummy surface"
                k8.a.i(r0, r2, r8)     // Catch: java.lang.Throwable -> L3a
                r5 = 3
                r3.f12663m = r8     // Catch: java.lang.Throwable -> L3a
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L68
                r5 = 6
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L68
                r5 = 5
            L67:
                return r1
            L68:
                r8 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L68
                throw r8
                r5 = 6
            L6c:
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L74
                r5 = 6
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L74
                throw r8
                r5 = 4
            L74:
                r8 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L74
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: l8.d.b.handleMessage(android.os.Message):boolean");
        }
    }

    public d(b bVar, SurfaceTexture surfaceTexture, boolean z10, a aVar) {
        super(surfaceTexture);
        this.f12658f = bVar;
        this.f12657c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.content.Context r11) {
        /*
            int r0 = k8.c0.f11939a
            java.lang.String r10 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r1 = 24
            r2 = 12373(0x3055, float:1.7338E-41)
            r8 = 3
            r3 = 1
            r10 = 1
            r4 = 0
            if (r0 >= r1) goto Lf
            goto L5e
        Lf:
            r8 = 2
            r1 = 26
            r8 = 3
            if (r0 >= r1) goto L31
            java.lang.String r5 = k8.c0.f11941c
            r10 = 7
            java.lang.String r7 = "samsung"
            r6 = r7
            boolean r7 = r6.equals(r5)
            r5 = r7
            if (r5 != 0) goto L5e
            r10 = 2
            java.lang.String r5 = k8.c0.d
            r9 = 3
            java.lang.String r7 = "XT1650"
            r6 = r7
            boolean r7 = r6.equals(r5)
            r5 = r7
            if (r5 == 0) goto L31
            goto L5e
        L31:
            r9 = 3
            if (r0 >= r1) goto L46
            r10 = 5
            android.content.pm.PackageManager r7 = r11.getPackageManager()
            r11 = r7
            java.lang.String r7 = "android.hardware.vr.high_performance"
            r1 = r7
            boolean r7 = r11.hasSystemFeature(r1)
            r11 = r7
            if (r11 != 0) goto L46
            r8 = 4
            goto L5e
        L46:
            r9 = 5
            android.opengl.EGLDisplay r7 = android.opengl.EGL14.eglGetDisplay(r4)
            r11 = r7
            java.lang.String r11 = android.opengl.EGL14.eglQueryString(r11, r2)
            if (r11 == 0) goto L5e
            java.lang.String r1 = "EGL_EXT_protected_content"
            boolean r7 = r11.contains(r1)
            r11 = r7
            if (r11 == 0) goto L5e
            r7 = 1
            r11 = r7
            goto L60
        L5e:
            r7 = 0
            r11 = r7
        L60:
            if (r11 == 0) goto L8a
            r9 = 3
            r11 = 17
            r10 = 4
            if (r0 >= r11) goto L6a
            r8 = 3
            goto L84
        L6a:
            r8 = 1
            android.opengl.EGLDisplay r11 = android.opengl.EGL14.eglGetDisplay(r4)
            java.lang.String r7 = android.opengl.EGL14.eglQueryString(r11, r2)
            r11 = r7
            if (r11 == 0) goto L83
            r9 = 6
            java.lang.String r7 = "EGL_KHR_surfaceless_context"
            r0 = r7
            boolean r11 = r11.contains(r0)
            if (r11 == 0) goto L83
            r10 = 1
            r4 = 1
            r10 = 6
        L83:
            r10 = 4
        L84:
            if (r4 == 0) goto L88
            r8 = 4
            return r3
        L88:
            r11 = 2
            return r11
        L8a:
            r10 = 5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.d.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (d.class) {
            z10 = true;
            if (!n) {
                f12656m = a(context);
                n = true;
            }
            if (f12656m == 0) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static l8.d c(android.content.Context r7, boolean r8) {
        /*
            r0 = 0
            r5 = 4
            r4 = 1
            r1 = r4
            if (r8 == 0) goto L11
            boolean r7 = b(r7)
            if (r7 == 0) goto Le
            r5 = 7
            goto L12
        Le:
            r7 = 0
            r5 = 1
            goto L14
        L11:
            r6 = 7
        L12:
            r4 = 1
            r7 = r4
        L14:
            k8.a.f(r7)
            l8.d$b r7 = new l8.d$b
            r6 = 2
            r7.<init>()
            r6 = 6
            if (r8 == 0) goto L23
            int r8 = l8.d.f12656m
            goto L25
        L23:
            r8 = 0
            r6 = 1
        L25:
            r7.start()
            r6 = 2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r4 = r7.getLooper()
            r3 = r4
            r2.<init>(r3, r7)
            r6 = 6
            r7.f12661f = r2
            com.google.android.exoplayer2.util.EGLSurfaceTexture r3 = new com.google.android.exoplayer2.util.EGLSurfaceTexture
            r6 = 7
            r3.<init>(r2)
            r5 = 4
            r7.f12660c = r3
            r6 = 5
            monitor-enter(r7)
            r6 = 5
            android.os.Handler r2 = r7.f12661f     // Catch: java.lang.Throwable -> L83
            android.os.Message r8 = r2.obtainMessage(r1, r8, r0)     // Catch: java.lang.Throwable -> L83
            r8.sendToTarget()     // Catch: java.lang.Throwable -> L83
            r6 = 6
        L4c:
            l8.d r8 = r7.n     // Catch: java.lang.Throwable -> L83
            if (r8 != 0) goto L61
            r6 = 4
            java.lang.RuntimeException r8 = r7.f12663m     // Catch: java.lang.Throwable -> L83
            r6 = 7
            if (r8 != 0) goto L61
            java.lang.Error r8 = r7.f12662j     // Catch: java.lang.Throwable -> L83
            if (r8 != 0) goto L61
            r5 = 5
            r7.wait()     // Catch: java.lang.InterruptedException -> L5f java.lang.Throwable -> L83
            goto L4c
        L5f:
            r0 = 1
            goto L4c
        L61:
            r5 = 6
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L6e
            r6 = 6
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r8 = r4
            r8.interrupt()
        L6e:
            r6 = 6
            java.lang.RuntimeException r8 = r7.f12663m
            if (r8 != 0) goto L81
            r6 = 2
            java.lang.Error r8 = r7.f12662j
            r5 = 3
            if (r8 != 0) goto L80
            r6 = 3
            l8.d r7 = r7.n
            java.util.Objects.requireNonNull(r7)
            return r7
        L80:
            throw r8
        L81:
            r6 = 1
            throw r8
        L83:
            r8 = move-exception
            r5 = 6
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L83
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.d.c(android.content.Context, boolean):l8.d");
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f12658f) {
            if (!this.f12659j) {
                b bVar = this.f12658f;
                Objects.requireNonNull(bVar.f12661f);
                bVar.f12661f.sendEmptyMessage(2);
                this.f12659j = true;
            }
        }
    }
}
