package q0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

/* loaded from: classes2.dex */
public abstract class a implements View.OnTouchListener {
    public static final int G = ViewConfiguration.getTapTimeout();
    public float[] A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;

    /* renamed from: c  reason: collision with root package name */
    public final C0246a f14139c;

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator f14140f;

    /* renamed from: j  reason: collision with root package name */
    public final View f14141j;

    /* renamed from: m  reason: collision with root package name */
    public Runnable f14142m;
    public float[] n;

    /* renamed from: t  reason: collision with root package name */
    public float[] f14143t;

    /* renamed from: u  reason: collision with root package name */
    public int f14144u;

    /* renamed from: w  reason: collision with root package name */
    public int f14145w;
    public float[] y;

    /* renamed from: z  reason: collision with root package name */
    public float[] f14146z;

    /* renamed from: q0.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0246a {

        /* renamed from: a  reason: collision with root package name */
        public int f14147a;

        /* renamed from: b  reason: collision with root package name */
        public int f14148b;

        /* renamed from: c  reason: collision with root package name */
        public float f14149c;
        public float d;

        /* renamed from: j  reason: collision with root package name */
        public float f14155j;

        /* renamed from: k  reason: collision with root package name */
        public int f14156k;

        /* renamed from: e  reason: collision with root package name */
        public long f14150e = Long.MIN_VALUE;

        /* renamed from: i  reason: collision with root package name */
        public long f14154i = -1;

        /* renamed from: f  reason: collision with root package name */
        public long f14151f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f14152g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f14153h = 0;

        public final float a(long j10) {
            long j11 = this.f14150e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f14154i;
            if (j12 >= 0 && j10 >= j12) {
                float f10 = this.f14155j;
                return (a.b(((float) (j10 - j12)) / this.f14156k, 0.0f, 1.0f) * f10) + (1.0f - f10);
            }
            return a.b(((float) (j10 - j11)) / this.f14147a, 0.0f, 1.0f) * 0.5f;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.E) {
                if (aVar.C) {
                    aVar.C = false;
                    C0246a c0246a = aVar.f14139c;
                    Objects.requireNonNull(c0246a);
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c0246a.f14150e = currentAnimationTimeMillis;
                    c0246a.f14154i = -1L;
                    c0246a.f14151f = currentAnimationTimeMillis;
                    c0246a.f14155j = 0.5f;
                    c0246a.f14152g = 0;
                    c0246a.f14153h = 0;
                }
                C0246a c0246a2 = a.this.f14139c;
                if ((c0246a2.f14154i > 0 && AnimationUtils.currentAnimationTimeMillis() > c0246a2.f14154i + ((long) c0246a2.f14156k)) || !a.this.e()) {
                    a.this.E = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.D) {
                    aVar2.D = false;
                    Objects.requireNonNull(aVar2);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar2.f14141j.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (c0246a2.f14151f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float a10 = c0246a2.a(currentAnimationTimeMillis2);
                c0246a2.f14151f = currentAnimationTimeMillis2;
                float f10 = ((float) (currentAnimationTimeMillis2 - c0246a2.f14151f)) * ((a10 * 4.0f) + ((-4.0f) * a10 * a10));
                c0246a2.f14152g = (int) (c0246a2.f14149c * f10);
                int i10 = (int) (f10 * c0246a2.d);
                c0246a2.f14153h = i10;
                ((f) a.this).H.scrollListBy(i10);
                View view = a.this.f14141j;
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.d.m(view, this);
            }
        }
    }

    public a(View view) {
        C0246a c0246a = new C0246a();
        this.f14139c = c0246a;
        this.f14140f = new AccelerateInterpolator();
        this.n = new float[]{0.0f, 0.0f};
        this.f14143t = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.y = new float[]{0.0f, 0.0f};
        this.f14146z = new float[]{0.0f, 0.0f};
        this.A = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f14141j = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.A;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr[0] = f11;
        fArr[1] = f11;
        float[] fArr2 = this.f14146z;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f12;
        fArr2[1] = f12;
        this.f14144u = 1;
        float[] fArr3 = this.f14143t;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.n;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.y;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f14145w = G;
        c0246a.f14147a = 500;
        c0246a.f14148b = 500;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r3 = r6
            float[] r0 = r3.n
            r0 = r0[r7]
            float[] r1 = r3.f14143t
            r5 = 1
            r1 = r1[r7]
            r5 = 7
            float r0 = r0 * r9
            r5 = 0
            r2 = r5
            float r5 = b(r0, r2, r1)
            r0 = r5
            float r1 = r3.c(r8, r0)
            float r9 = r9 - r8
            float r5 = r3.c(r9, r0)
            r8 = r5
            float r8 = r8 - r1
            int r9 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r9 >= 0) goto L2f
            r5 = 5
            android.view.animation.Interpolator r9 = r3.f14140f
            float r8 = -r8
            r5 = 6
            float r8 = r9.getInterpolation(r8)
            float r8 = -r8
            r5 = 1
            goto L3d
        L2f:
            r5 = 1
            int r9 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r5 = 2
            if (r9 <= 0) goto L49
            android.view.animation.Interpolator r9 = r3.f14140f
            r5 = 6
            float r5 = r9.getInterpolation(r8)
            r8 = r5
        L3d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = r5
            r0 = 1065353216(0x3f800000, float:1.0)
            r5 = 2
            float r5 = b(r8, r9, r0)
            r8 = r5
            goto L4a
        L49:
            r8 = 0
        L4a:
            int r9 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r5 = 7
            if (r9 != 0) goto L50
            return r2
        L50:
            r5 = 6
            float[] r0 = r3.y
            r5 = 4
            r0 = r0[r7]
            r5 = 7
            float[] r1 = r3.f14146z
            r5 = 4
            r1 = r1[r7]
            r5 = 6
            float[] r2 = r3.A
            r7 = r2[r7]
            float r0 = r0 * r10
            if (r9 <= 0) goto L6e
            r5 = 2
            float r8 = r8 * r0
            float r5 = b(r8, r1, r7)
            r7 = r5
            return r7
        L6e:
            float r8 = -r8
            float r8 = r8 * r0
            r5 = 5
            float r7 = b(r8, r1, r7)
            float r7 = -r7
            r5 = 2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.a(int, float, float, float):float");
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f14144u;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.E && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.C) {
            this.E = false;
            return;
        }
        C0246a c0246a = this.f14139c;
        Objects.requireNonNull(c0246a);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (currentAnimationTimeMillis - c0246a.f14150e);
        int i12 = c0246a.f14148b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        c0246a.f14156k = i10;
        c0246a.f14155j = c0246a.a(currentAnimationTimeMillis);
        c0246a.f14154i = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e() {
        /*
            r12 = this;
            r9 = r12
            q0.a$a r0 = r9.f14139c
            float r1 = r0.d
            float r11 = java.lang.Math.abs(r1)
            r2 = r11
            float r1 = r1 / r2
            int r1 = (int) r1
            r11 = 1
            float r0 = r0.f14149c
            r11 = 2
            float r11 = java.lang.Math.abs(r0)
            r2 = r11
            float r0 = r0 / r2
            r11 = 6
            int r0 = (int) r0
            r11 = 6
            r11 = 1
            r2 = r11
            r11 = 0
            r3 = r11
            if (r1 == 0) goto L6d
            r11 = 6
            r4 = r9
            q0.f r4 = (q0.f) r4
            r11 = 1
            android.widget.ListView r4 = r4.H
            int r5 = r4.getCount()
            if (r5 != 0) goto L30
            r11 = 5
        L2d:
            r11 = 0
            r1 = r11
            goto L6a
        L30:
            r11 = 3
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L55
            r11 = 1
            if (r8 < r5) goto L68
            r11 = 3
            int r6 = r6 - r2
            r11 = 6
            android.view.View r11 = r4.getChildAt(r6)
            r1 = r11
            int r11 = r1.getBottom()
            r1 = r11
            int r11 = r4.getHeight()
            r4 = r11
            if (r1 > r4) goto L68
            goto L2d
        L55:
            r11 = 3
            if (r1 >= 0) goto L2d
            if (r7 > 0) goto L68
            android.view.View r11 = r4.getChildAt(r3)
            r1 = r11
            int r11 = r1.getTop()
            r1 = r11
            if (r1 < 0) goto L68
            r11 = 1
            goto L2d
        L68:
            r1 = 1
            r11 = 5
        L6a:
            if (r1 != 0) goto L6e
            r11 = 7
        L6d:
            r2 = 0
        L6e:
            r11 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.e():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
        if (r0 != 3) goto L14;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            boolean r0 = r9.F
            r6 = 6
            r1 = 0
            if (r0 != 0) goto L8
            r7 = 2
            return r1
        L8:
            r6 = 5
            int r0 = r11.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L20
            r7 = 3
            if (r0 == r2) goto L1c
            r5 = 2
            r3 = r5
            if (r0 == r3) goto L26
            r10 = 3
            r7 = 2
            if (r0 == r10) goto L1c
            goto L98
        L1c:
            r9.d()
            goto L98
        L20:
            r9.D = r2
            r8 = 1
            r9.B = r1
            r8 = 2
        L26:
            float r0 = r11.getX()
            int r5 = r10.getWidth()
            r3 = r5
            float r3 = (float) r3
            r7 = 3
            android.view.View r4 = r9.f14141j
            r8 = 2
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r9.a(r1, r0, r3, r4)
            float r11 = r11.getY()
            int r5 = r10.getHeight()
            r10 = r5
            float r10 = (float) r10
            r6 = 4
            android.view.View r3 = r9.f14141j
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r10 = r9.a(r2, r11, r10, r3)
            q0.a$a r11 = r9.f14139c
            r7 = 6
            r11.f14149c = r0
            r11.d = r10
            boolean r10 = r9.E
            if (r10 != 0) goto L98
            r7 = 6
            boolean r10 = r9.e()
            if (r10 == 0) goto L98
            java.lang.Runnable r10 = r9.f14142m
            if (r10 != 0) goto L72
            q0.a$b r10 = new q0.a$b
            r10.<init>()
            r6 = 2
            r9.f14142m = r10
            r7 = 4
        L72:
            r6 = 6
            r9.E = r2
            r7 = 6
            r9.C = r2
            boolean r10 = r9.B
            if (r10 != 0) goto L8f
            r6 = 5
            int r10 = r9.f14145w
            r6 = 4
            if (r10 <= 0) goto L8f
            r7 = 6
            android.view.View r11 = r9.f14141j
            r6 = 4
            java.lang.Runnable r0 = r9.f14142m
            long r3 = (long) r10
            java.util.WeakHashMap<android.view.View, n0.a0> r10 = n0.x.f13156a
            n0.x.d.n(r11, r0, r3)
            goto L95
        L8f:
            r8 = 7
            java.lang.Runnable r10 = r9.f14142m
            r10.run()
        L95:
            r9.B = r2
            r7 = 3
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
