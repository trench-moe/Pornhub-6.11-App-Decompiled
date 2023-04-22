package t0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.Objects;
import n0.x;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: x  reason: collision with root package name */
    public static final Interpolator f15076x = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f15077a;

    /* renamed from: b  reason: collision with root package name */
    public int f15078b;
    public float[] d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f15080e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f15081f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f15082g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f15083h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f15084i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f15085j;

    /* renamed from: k  reason: collision with root package name */
    public int f15086k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f15087l;

    /* renamed from: m  reason: collision with root package name */
    public float f15088m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public int f15089o;

    /* renamed from: p  reason: collision with root package name */
    public final int f15090p;

    /* renamed from: q  reason: collision with root package name */
    public int f15091q;

    /* renamed from: r  reason: collision with root package name */
    public OverScroller f15092r;

    /* renamed from: s  reason: collision with root package name */
    public final AbstractC0267c f15093s;

    /* renamed from: t  reason: collision with root package name */
    public View f15094t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f15095u;

    /* renamed from: v  reason: collision with root package name */
    public final ViewGroup f15096v;

    /* renamed from: c  reason: collision with root package name */
    public int f15079c = -1;

    /* renamed from: w  reason: collision with root package name */
    public final Runnable f15097w = new b();

    /* loaded from: classes2.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.w(0);
        }
    }

    /* renamed from: t0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0267c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int c(View view) {
            return 0;
        }

        public int d(View view) {
            return 0;
        }

        public void e(int i10, int i11) {
        }

        public void f(int i10, int i11) {
        }

        public void g(View view, int i10) {
        }

        public abstract void h(int i10);

        public abstract void i(View view, int i10, int i11, int i12, int i13);

        public abstract void j(View view, float f10, float f11);

        public abstract boolean k(View view, int i10);
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0267c abstractC0267c) {
        if (abstractC0267c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f15096v = viewGroup;
        this.f15093s = abstractC0267c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f15090p = i10;
        this.f15089o = i10;
        this.f15078b = viewConfiguration.getScaledTouchSlop();
        this.f15088m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f15092r = new OverScroller(context, f15076x);
    }

    public static c k(ViewGroup viewGroup, float f10, AbstractC0267c abstractC0267c) {
        c cVar = new c(viewGroup.getContext(), viewGroup, abstractC0267c);
        cVar.f15078b = (int) ((1.0f / f10) * cVar.f15078b);
        return cVar;
    }

    public boolean A(View view, int i10) {
        if (view == this.f15094t && this.f15079c == i10) {
            return true;
        }
        if (view == null || !this.f15093s.k(view, i10)) {
            return false;
        }
        this.f15079c = i10;
        c(view, i10);
        return true;
    }

    public void a() {
        b();
        if (this.f15077a == 2) {
            int currX = this.f15092r.getCurrX();
            int currY = this.f15092r.getCurrY();
            this.f15092r.abortAnimation();
            int currX2 = this.f15092r.getCurrX();
            int currY2 = this.f15092r.getCurrY();
            this.f15093s.i(this.f15094t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        w(0);
    }

    public void b() {
        this.f15079c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f15080e, 0.0f);
            Arrays.fill(this.f15081f, 0.0f);
            Arrays.fill(this.f15082g, 0.0f);
            Arrays.fill(this.f15083h, 0);
            Arrays.fill(this.f15084i, 0);
            Arrays.fill(this.f15085j, 0);
            this.f15086k = 0;
        }
        VelocityTracker velocityTracker = this.f15087l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f15087l = null;
        }
    }

    public void c(View view, int i10) {
        if (view.getParent() != this.f15096v) {
            StringBuilder m10 = a1.a.m("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            m10.append(this.f15096v);
            m10.append(")");
            throw new IllegalArgumentException(m10.toString());
        }
        this.f15094t = view;
        this.f15079c = i10;
        this.f15093s.g(view, i10);
        w(1);
    }

    public final boolean d(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        boolean z10 = false;
        if ((this.f15083h[i10] & i11) == i11 && (this.f15091q & i11) != 0 && (this.f15085j[i10] & i11) != i11 && (this.f15084i[i10] & i11) != i11) {
            int i12 = this.f15078b;
            if (abs > i12 || abs2 > i12) {
                if (abs < abs2 * 0.5f) {
                    Objects.requireNonNull(this.f15093s);
                }
                if ((this.f15084i[i10] & i11) == 0 && abs > this.f15078b) {
                    z10 = true;
                }
            }
            return z10;
        }
        return z10;
    }

    public final boolean e(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f15093s.c(view) > 0;
        boolean z11 = this.f15093s.d(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f15078b) : z11 && Math.abs(f11) > ((float) this.f15078b);
        }
        float f12 = f11 * f11;
        int i10 = this.f15078b;
        return f12 + (f10 * f10) > ((float) (i10 * i10));
    }

    public final float f(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        return abs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    public final int g(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        return abs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    public final void h(int i10) {
        if (this.d != null && o(i10)) {
            this.d[i10] = 0.0f;
            this.f15080e[i10] = 0.0f;
            this.f15081f[i10] = 0.0f;
            this.f15082g[i10] = 0.0f;
            this.f15083h[i10] = 0;
            this.f15084i[i10] = 0;
            this.f15085j[i10] = 0;
            this.f15086k = (~(1 << i10)) & this.f15086k;
        }
    }

    public final int i(int i10, int i11, int i12) {
        int width;
        if (i10 == 0) {
            return 0;
        }
        float width2 = this.f15096v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs = Math.abs(i11);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public boolean j(boolean z10) {
        if (this.f15077a == 2) {
            boolean computeScrollOffset = this.f15092r.computeScrollOffset();
            int currX = this.f15092r.getCurrX();
            int currY = this.f15092r.getCurrY();
            int left = currX - this.f15094t.getLeft();
            int top = currY - this.f15094t.getTop();
            if (left != 0) {
                x.n(this.f15094t, left);
            }
            if (top != 0) {
                x.o(this.f15094t, top);
            }
            if (left != 0 || top != 0) {
                this.f15093s.i(this.f15094t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f15092r.getFinalX() && currY == this.f15092r.getFinalY()) {
                this.f15092r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z10) {
                    this.f15096v.post(this.f15097w);
                } else {
                    w(0);
                }
            }
        }
        return this.f15077a == 2;
    }

    public final void l(float f10, float f11) {
        this.f15095u = true;
        this.f15093s.j(this.f15094t, f10, f11);
        this.f15095u = false;
        if (this.f15077a == 1) {
            w(0);
        }
    }

    public View m(int i10, int i11) {
        for (int childCount = this.f15096v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f15096v;
            Objects.requireNonNull(this.f15093s);
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean n(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f15094t.getLeft();
        int top = this.f15094t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f15092r.abortAnimation();
            w(0);
            return false;
        }
        View view = this.f15094t;
        int g10 = g(i12, (int) this.n, (int) this.f15088m);
        int g11 = g(i13, (int) this.n, (int) this.f15088m);
        int abs = Math.abs(i14);
        int abs2 = Math.abs(i15);
        int abs3 = Math.abs(g10);
        int abs4 = Math.abs(g11);
        int i16 = abs3 + abs4;
        int i17 = abs + abs2;
        if (g10 != 0) {
            f10 = abs3;
            f11 = i16;
        } else {
            f10 = abs;
            f11 = i17;
        }
        float f14 = f10 / f11;
        if (g11 != 0) {
            f12 = abs4;
            f13 = i16;
        } else {
            f12 = abs2;
            f13 = i17;
        }
        int i18 = i(i14, g10, this.f15093s.c(view));
        this.f15092r.startScroll(left, top, i14, i15, (int) ((i(i15, g11, this.f15093s.d(view)) * (f12 / f13)) + (i18 * f14)));
        w(2);
        return true;
    }

    public boolean o(int i10) {
        return ((1 << i10) & this.f15086k) != 0;
    }

    public final boolean p(int i10) {
        if (o(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean q(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void r(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f15087l == null) {
            this.f15087l = VelocityTracker.obtain();
        }
        this.f15087l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m10 = m((int) x10, (int) y);
            u(x10, y, pointerId);
            A(m10, pointerId);
            int i12 = this.f15083h[pointerId];
            int i13 = this.f15091q;
            if ((i12 & i13) != 0) {
                this.f15093s.f(i12 & i13, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f15077a == 1) {
                s();
            }
            b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f15077a == 1) {
                    l(0.0f, 0.0f);
                }
                b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y10 = motionEvent.getY(actionIndex);
                u(x11, y10, pointerId2);
                if (this.f15077a != 0) {
                    if (q(this.f15094t, (int) x11, (int) y10)) {
                        A(this.f15094t, pointerId2);
                        return;
                    }
                    return;
                }
                A(m((int) x11, (int) y10), pointerId2);
                int i14 = this.f15083h[pointerId2];
                int i15 = this.f15091q;
                if ((i14 & i15) != 0) {
                    this.f15093s.f(i14 & i15, pointerId2);
                }
            } else if (actionMasked != 6) {
            } else {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f15077a == 1 && pointerId3 == this.f15079c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i11 >= pointerCount) {
                            i10 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i11);
                        if (pointerId4 != this.f15079c) {
                            View m11 = m((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                            View view = this.f15094t;
                            if (m11 == view && A(view, pointerId4)) {
                                i10 = this.f15079c;
                                break;
                            }
                        }
                        i11++;
                    }
                    if (i10 == -1) {
                        s();
                    }
                }
                h(pointerId3);
            }
        } else if (this.f15077a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i11 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i11);
                if (p(pointerId5)) {
                    float x12 = motionEvent.getX(i11);
                    float y11 = motionEvent.getY(i11);
                    float f10 = x12 - this.d[pointerId5];
                    float f11 = y11 - this.f15080e[pointerId5];
                    t(f10, f11, pointerId5);
                    if (this.f15077a != 1) {
                        View m12 = m((int) x12, (int) y11);
                        if (e(m12, f10, f11) && A(m12, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            v(motionEvent);
        } else if (p(this.f15079c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f15079c);
            float x13 = motionEvent.getX(findPointerIndex);
            float y12 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f15081f;
            int i16 = this.f15079c;
            int i17 = (int) (x13 - fArr[i16]);
            int i18 = (int) (y12 - this.f15082g[i16]);
            int left = this.f15094t.getLeft() + i17;
            int top = this.f15094t.getTop() + i18;
            int left2 = this.f15094t.getLeft();
            int top2 = this.f15094t.getTop();
            if (i17 != 0) {
                left = this.f15093s.a(this.f15094t, left, i17);
                x.n(this.f15094t, left - left2);
            }
            int i19 = left;
            if (i18 != 0) {
                top = this.f15093s.b(this.f15094t, top, i18);
                x.o(this.f15094t, top - top2);
            }
            int i20 = top;
            if (i17 != 0 || i18 != 0) {
                this.f15093s.i(this.f15094t, i19, i20, i19 - left2, i20 - top2);
            }
            v(motionEvent);
        }
    }

    public final void s() {
        this.f15087l.computeCurrentVelocity(1000, this.f15088m);
        l(f(this.f15087l.getXVelocity(this.f15079c), this.n, this.f15088m), f(this.f15087l.getYVelocity(this.f15079c), this.n, this.f15088m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3, types: [t0.c$c] */
    public final void t(float f10, float f11, int i10) {
        boolean d = d(f10, f11, i10, 1);
        boolean z10 = d;
        if (d(f11, f10, i10, 4)) {
            z10 = d | true;
        }
        boolean z11 = z10;
        if (d(f10, f11, i10, 2)) {
            z11 = (z10 ? 1 : 0) | true;
        }
        ?? r02 = z11;
        if (d(f11, f10, i10, 8)) {
            r02 = (z11 ? 1 : 0) | true;
        }
        if (r02 != 0) {
            int[] iArr = this.f15084i;
            iArr[i10] = iArr[i10] | r02;
            this.f15093s.e(r02, i10);
        }
    }

    public final void u(float f10, float f11, int i10) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f15080e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f15081f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f15082g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f15083h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f15084i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f15085j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.f15080e = fArr3;
            this.f15081f = fArr4;
            this.f15082g = fArr5;
            this.f15083h = iArr;
            this.f15084i = iArr2;
            this.f15085j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f15081f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f15080e;
        this.f15082g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f15083h;
        int i12 = (int) f10;
        int i13 = (int) f11;
        int i14 = i12 < this.f15096v.getLeft() + this.f15089o ? 1 : 0;
        if (i13 < this.f15096v.getTop() + this.f15089o) {
            i14 |= 4;
        }
        if (i12 > this.f15096v.getRight() - this.f15089o) {
            i14 |= 2;
        }
        if (i13 > this.f15096v.getBottom() - this.f15089o) {
            i14 |= 8;
        }
        iArr7[i10] = i14;
        this.f15086k |= 1 << i10;
    }

    public final void v(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (p(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y = motionEvent.getY(i10);
                this.f15081f[pointerId] = x10;
                this.f15082g[pointerId] = y;
            }
        }
    }

    public void w(int i10) {
        this.f15096v.removeCallbacks(this.f15097w);
        if (this.f15077a != i10) {
            this.f15077a = i10;
            this.f15093s.h(i10);
            if (this.f15077a == 0) {
                this.f15094t = null;
            }
        }
    }

    public boolean x(int i10, int i11) {
        if (this.f15095u) {
            return n(i10, i11, (int) this.f15087l.getXVelocity(this.f15079c), (int) this.f15087l.getYVelocity(this.f15079c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e2, code lost:
        if (r12 != r11) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean y(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.c.y(android.view.MotionEvent):boolean");
    }

    public boolean z(View view, int i10, int i11) {
        this.f15094t = view;
        this.f15079c = -1;
        boolean n = n(i10, i11, 0, 0);
        if (!n && this.f15077a == 0 && this.f15094t != null) {
            this.f15094t = null;
        }
        return n;
    }
}
