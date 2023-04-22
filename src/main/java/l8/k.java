package l8;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Surface;
import android.view.WindowManager;
import java.util.Objects;
import k8.c0;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final e f12703a = new e();

    /* renamed from: b  reason: collision with root package name */
    public final a f12704b;

    /* renamed from: c  reason: collision with root package name */
    public final d f12705c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public Surface f12706e;

    /* renamed from: f  reason: collision with root package name */
    public float f12707f;

    /* renamed from: g  reason: collision with root package name */
    public float f12708g;

    /* renamed from: h  reason: collision with root package name */
    public float f12709h;

    /* renamed from: i  reason: collision with root package name */
    public float f12710i;

    /* renamed from: j  reason: collision with root package name */
    public long f12711j;

    /* renamed from: k  reason: collision with root package name */
    public long f12712k;

    /* renamed from: l  reason: collision with root package name */
    public long f12713l;

    /* renamed from: m  reason: collision with root package name */
    public long f12714m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public long f12715o;

    /* renamed from: p  reason: collision with root package name */
    public long f12716p;

    /* loaded from: classes2.dex */
    public interface a {

        /* renamed from: l8.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0202a {
        }

        void a();

        void b(InterfaceC0202a interfaceC0202a);
    }

    /* loaded from: classes2.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final WindowManager f12717a;

        public b(WindowManager windowManager) {
            this.f12717a = windowManager;
        }

        @Override // l8.k.a
        public void a() {
        }

        @Override // l8.k.a
        public void b(a.InterfaceC0202a interfaceC0202a) {
            ((g4.n) interfaceC0202a).e(this.f12717a.getDefaultDisplay());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements a, DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayManager f12718a;

        /* renamed from: b  reason: collision with root package name */
        public a.InterfaceC0202a f12719b;

        public c(DisplayManager displayManager) {
            this.f12718a = displayManager;
        }

        @Override // l8.k.a
        public void a() {
            this.f12718a.unregisterDisplayListener(this);
            this.f12719b = null;
        }

        @Override // l8.k.a
        public void b(a.InterfaceC0202a interfaceC0202a) {
            this.f12719b = interfaceC0202a;
            this.f12718a.registerDisplayListener(this, c0.j());
            ((g4.n) interfaceC0202a).e(this.f12718a.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            a.InterfaceC0202a interfaceC0202a = this.f12719b;
            if (interfaceC0202a != null && i10 == 0) {
                ((g4.n) interfaceC0202a).e(this.f12718a.getDisplay(0));
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements Choreographer.FrameCallback, Handler.Callback {
        public static final d n = new d();

        /* renamed from: c  reason: collision with root package name */
        public volatile long f12720c = -9223372036854775807L;

        /* renamed from: f  reason: collision with root package name */
        public final Handler f12721f;

        /* renamed from: j  reason: collision with root package name */
        public Choreographer f12722j;

        /* renamed from: m  reason: collision with root package name */
        public int f12723m;

        public d() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i10 = c0.f11939a;
            Handler handler = new Handler(looper, this);
            this.f12721f = handler;
            handler.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f12720c = j10;
            Choreographer choreographer = this.f12722j;
            Objects.requireNonNull(choreographer);
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                this.f12722j = Choreographer.getInstance();
                return true;
            } else if (i10 == 1) {
                int i11 = this.f12723m + 1;
                this.f12723m = i11;
                if (i11 == 1) {
                    Choreographer choreographer = this.f12722j;
                    Objects.requireNonNull(choreographer);
                    choreographer.postFrameCallback(this);
                }
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                int i12 = this.f12723m - 1;
                this.f12723m = i12;
                if (i12 == 0) {
                    Choreographer choreographer2 = this.f12722j;
                    Objects.requireNonNull(choreographer2);
                    choreographer2.removeFrameCallback(this);
                    this.f12720c = -9223372036854775807L;
                }
                return true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            l8.e r0 = new l8.e
            r0.<init>()
            r3.f12703a = r0
            r0 = 0
            if (r4 == 0) goto L3a
            android.content.Context r4 = r4.getApplicationContext()
            int r1 = k8.c0.f11939a
            r2 = 17
            if (r1 < r2) goto L27
            java.lang.String r1 = "display"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            if (r1 == 0) goto L27
            l8.k$c r2 = new l8.k$c
            r2.<init>(r1)
            goto L28
        L27:
            r2 = r0
        L28:
            if (r2 != 0) goto L3b
            java.lang.String r1 = "window"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 == 0) goto L3a
            l8.k$b r2 = new l8.k$b
            r2.<init>(r4)
            goto L3b
        L3a:
            r2 = r0
        L3b:
            r3.f12704b = r2
            if (r2 == 0) goto L41
            l8.k$d r0 = l8.k.d.n
        L41:
            r3.f12705c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f12711j = r0
            r3.f12712k = r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f12707f = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f12710i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.k.<init>(android.content.Context):void");
    }

    public static void c(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            k8.a.i("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }

    public final void a() {
        Surface surface;
        if (c0.f11939a >= 30 && (surface = this.f12706e) != null && this.f12709h != 0.0f) {
            this.f12709h = 0.0f;
            c(surface, 0.0f);
        }
    }

    public final void b() {
        this.f12713l = 0L;
        this.f12715o = -1L;
        this.f12714m = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
        if (java.lang.Math.abs(r0 - r14.f12708g) < (!r1 ? 0.02f : 1.0f)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
        if (r14.f12703a.f12667e >= 30) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.k.d():void");
    }

    public final void e(boolean z10) {
        if (c0.f11939a >= 30) {
            Surface surface = this.f12706e;
            if (surface == null) {
                return;
            }
            float f10 = 0.0f;
            if (this.d) {
                float f11 = this.f12708g;
                if (f11 != -1.0f) {
                    f10 = this.f12710i * f11;
                }
            }
            if (!z10 && this.f12709h == f10) {
                return;
            }
            this.f12709h = f10;
            c(surface, f10);
        }
    }
}
