package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.helper.widget.MotionEffect;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.a;
import com.appsflyer.oaid.BuildConfig;
import e.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import n0.l;
import t9.j0;
import w.k;
import w.m;
import w.n;
import w.o;
import x.a;
import x.d;

/* loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements l {
    public static boolean Y0;
    public int A0;
    public float B0;
    public boolean C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public androidx.constraintlayout.motion.widget.a I;
    public int I0;
    public Interpolator J;
    public float J0;
    public Interpolator K;
    public p K0;
    public float L;
    public boolean L0;
    public int M;
    public h M0;
    public int N;
    public Runnable N0;
    public int O;
    public HashMap<View, Object> O0;
    public int P;
    public Rect P0;
    public int Q;
    public boolean Q0;
    public boolean R;
    public TransitionState R0;
    public HashMap<View, n> S;
    public e S0;
    public long T;
    public boolean T0;
    public float U;
    public RectF U0;
    public float V;
    public View V0;
    public float W;
    public Matrix W0;
    public ArrayList<Integer> X0;

    /* renamed from: a0  reason: collision with root package name */
    public long f1375a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f1376b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1377c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f1378d0;

    /* renamed from: e0  reason: collision with root package name */
    public i f1379e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f1380f0;

    /* renamed from: g0  reason: collision with root package name */
    public d f1381g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1382h0;

    /* renamed from: i0  reason: collision with root package name */
    public v.b f1383i0;

    /* renamed from: j0  reason: collision with root package name */
    public c f1384j0;

    /* renamed from: k0  reason: collision with root package name */
    public w.b f1385k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f1386l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f1387m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f1388n0;

    /* renamed from: o0  reason: collision with root package name */
    public float f1389o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f1390p0;

    /* renamed from: q0  reason: collision with root package name */
    public long f1391q0;

    /* renamed from: r0  reason: collision with root package name */
    public float f1392r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f1393s0;

    /* renamed from: t0  reason: collision with root package name */
    public ArrayList<MotionHelper> f1394t0;

    /* renamed from: u0  reason: collision with root package name */
    public ArrayList<MotionHelper> f1395u0;

    /* renamed from: v0  reason: collision with root package name */
    public ArrayList<MotionHelper> f1396v0;
    public CopyOnWriteArrayList<i> w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f1397x0;

    /* renamed from: y0  reason: collision with root package name */
    public long f1398y0;

    /* renamed from: z0  reason: collision with root package name */
    public float f1399z0;

    /* loaded from: classes.dex */
    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f1404c;

        public a(MotionLayout motionLayout, View view) {
            this.f1404c = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1404c.setNestedScrollingEnabled(true);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.M0.a();
        }
    }

    /* loaded from: classes.dex */
    public class c extends o {

        /* renamed from: a  reason: collision with root package name */
        public float f1406a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        public float f1407b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f1408c;

        public c() {
        }

        @Override // w.o
        public float a() {
            return MotionLayout.this.L;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = this.f1406a;
            if (f11 > 0.0f) {
                float f12 = this.f1408c;
                if (f11 / f12 < f10) {
                    f10 = f11 / f12;
                }
                MotionLayout.this.L = f11 - (f12 * f10);
                return ((f11 * f10) - (((f12 * f10) * f10) / 2.0f)) + this.f1407b;
            }
            float f13 = this.f1408c;
            if ((-f11) / f13 < f10) {
                f10 = (-f11) / f13;
            }
            MotionLayout.this.L = (f13 * f10) + f11;
            return (((f13 * f10) * f10) / 2.0f) + (f11 * f10) + this.f1407b;
        }
    }

    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public float[] f1409a;

        /* renamed from: b  reason: collision with root package name */
        public int[] f1410b;

        /* renamed from: c  reason: collision with root package name */
        public float[] f1411c;
        public Path d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f1412e;

        /* renamed from: f  reason: collision with root package name */
        public Paint f1413f;

        /* renamed from: g  reason: collision with root package name */
        public Paint f1414g;

        /* renamed from: h  reason: collision with root package name */
        public Paint f1415h;

        /* renamed from: i  reason: collision with root package name */
        public Paint f1416i;

        /* renamed from: j  reason: collision with root package name */
        public float[] f1417j;

        /* renamed from: k  reason: collision with root package name */
        public int f1418k;

        /* renamed from: l  reason: collision with root package name */
        public Rect f1419l = new Rect();

        /* renamed from: m  reason: collision with root package name */
        public int f1420m = 1;

        public d() {
            Paint paint = new Paint();
            this.f1412e = paint;
            paint.setAntiAlias(true);
            this.f1412e.setColor(-21965);
            this.f1412e.setStrokeWidth(2.0f);
            this.f1412e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f1413f = paint2;
            paint2.setAntiAlias(true);
            this.f1413f.setColor(-2067046);
            this.f1413f.setStrokeWidth(2.0f);
            this.f1413f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f1414g = paint3;
            paint3.setAntiAlias(true);
            this.f1414g.setColor(-13391360);
            this.f1414g.setStrokeWidth(2.0f);
            this.f1414g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f1415h = paint4;
            paint4.setAntiAlias(true);
            this.f1415h.setColor(-13391360);
            this.f1415h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f1417j = new float[8];
            Paint paint5 = new Paint();
            this.f1416i = paint5;
            paint5.setAntiAlias(true);
            this.f1414g.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
            this.f1411c = new float[100];
            this.f1410b = new int[50];
        }

        public void a(Canvas canvas, int i10, int i11, n nVar) {
            int i12;
            int i13;
            float f10;
            float f11;
            int i14;
            if (i10 == 4) {
                boolean z10 = false;
                boolean z11 = false;
                for (int i15 = 0; i15 < this.f1418k; i15++) {
                    int[] iArr = this.f1410b;
                    if (iArr[i15] == 1) {
                        z10 = true;
                    }
                    if (iArr[i15] == 0) {
                        z11 = true;
                    }
                }
                if (z10) {
                    d(canvas);
                }
                if (z11) {
                    b(canvas);
                }
            }
            if (i10 == 2) {
                d(canvas);
            }
            if (i10 == 3) {
                b(canvas);
            }
            canvas.drawLines(this.f1409a, this.f1412e);
            View view = nVar.f16327b;
            if (view != null) {
                i12 = view.getWidth();
                i13 = nVar.f16327b.getHeight();
            } else {
                i12 = 0;
                i13 = 0;
            }
            int i16 = 1;
            while (i16 < i11 - 1) {
                if (i10 == 4 && this.f1410b[i16 - 1] == 0) {
                    i14 = i16;
                } else {
                    float[] fArr = this.f1411c;
                    int i17 = i16 * 2;
                    float f12 = fArr[i17];
                    float f13 = fArr[i17 + 1];
                    this.d.reset();
                    this.d.moveTo(f12, f13 + 10.0f);
                    this.d.lineTo(f12 + 10.0f, f13);
                    this.d.lineTo(f12, f13 - 10.0f);
                    this.d.lineTo(f12 - 10.0f, f13);
                    this.d.close();
                    int i18 = i16 - 1;
                    nVar.f16344u.get(i18);
                    if (i10 == 4) {
                        int[] iArr2 = this.f1410b;
                        if (iArr2[i18] == 1) {
                            e(canvas, f12 - 0.0f, f13 - 0.0f);
                        } else if (iArr2[i18] == 0) {
                            c(canvas, f12 - 0.0f, f13 - 0.0f);
                        } else if (iArr2[i18] == 2) {
                            f10 = f13;
                            f11 = f12;
                            i14 = i16;
                            f(canvas, f12 - 0.0f, f13 - 0.0f, i12, i13);
                            canvas.drawPath(this.d, this.f1416i);
                        }
                        f10 = f13;
                        f11 = f12;
                        i14 = i16;
                        canvas.drawPath(this.d, this.f1416i);
                    } else {
                        f10 = f13;
                        f11 = f12;
                        i14 = i16;
                    }
                    if (i10 == 2) {
                        e(canvas, f11 - 0.0f, f10 - 0.0f);
                    }
                    if (i10 == 3) {
                        c(canvas, f11 - 0.0f, f10 - 0.0f);
                    }
                    if (i10 == 6) {
                        f(canvas, f11 - 0.0f, f10 - 0.0f, i12, i13);
                    }
                    canvas.drawPath(this.d, this.f1416i);
                }
                i16 = i14 + 1;
            }
            float[] fArr2 = this.f1409a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f1413f);
                float[] fArr3 = this.f1409a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f1413f);
            }
        }

        public final void b(Canvas canvas) {
            float[] fArr = this.f1409a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f10, f12), Math.max(f11, f13), Math.max(f10, f12), Math.max(f11, f13), this.f1414g);
            canvas.drawLine(Math.min(f10, f12), Math.min(f11, f13), Math.min(f10, f12), Math.max(f11, f13), this.f1414g);
        }

        public final void c(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f1409a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float min = Math.min(f12, f14);
            float max = Math.max(f13, f15);
            float min2 = f10 - Math.min(f12, f14);
            float max2 = Math.max(f13, f15) - f11;
            StringBuilder m10 = a1.a.m(BuildConfig.FLAVOR);
            m10.append(((int) (((min2 * 100.0f) / Math.abs(f14 - f12)) + 0.5d)) / 100.0f);
            String sb2 = m10.toString();
            g(sb2, this.f1415h);
            canvas.drawText(sb2, ((min2 / 2.0f) - (this.f1419l.width() / 2)) + min, f11 - 20.0f, this.f1415h);
            canvas.drawLine(f10, f11, Math.min(f12, f14), f11, this.f1414g);
            StringBuilder m11 = a1.a.m(BuildConfig.FLAVOR);
            m11.append(((int) (((max2 * 100.0f) / Math.abs(f15 - f13)) + 0.5d)) / 100.0f);
            String sb3 = m11.toString();
            g(sb3, this.f1415h);
            canvas.drawText(sb3, f10 + 5.0f, max - ((max2 / 2.0f) - (this.f1419l.height() / 2)), this.f1415h);
            canvas.drawLine(f10, f11, f10, Math.max(f13, f15), this.f1414g);
        }

        public final void d(Canvas canvas) {
            float[] fArr = this.f1409a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f1414g);
        }

        public final void e(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f1409a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f12 - f14, f13 - f15);
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            float f18 = (((f11 - f13) * f17) + ((f10 - f12) * f16)) / (hypot * hypot);
            float f19 = f12 + (f16 * f18);
            float f20 = f13 + (f18 * f17);
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f19, f20);
            float hypot2 = (float) Math.hypot(f19 - f10, f20 - f11);
            StringBuilder m10 = a1.a.m(BuildConfig.FLAVOR);
            m10.append(((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            String sb2 = m10.toString();
            g(sb2, this.f1415h);
            canvas.drawTextOnPath(sb2, path, (hypot2 / 2.0f) - (this.f1419l.width() / 2), -20.0f, this.f1415h);
            canvas.drawLine(f10, f11, f19, f20, this.f1414g);
        }

        public final void f(Canvas canvas, float f10, float f11, int i10, int i11) {
            StringBuilder m10 = a1.a.m(BuildConfig.FLAVOR);
            m10.append(((int) ((((f10 - (i10 / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i10)) + 0.5d)) / 100.0f);
            String sb2 = m10.toString();
            g(sb2, this.f1415h);
            canvas.drawText(sb2, ((f10 / 2.0f) - (this.f1419l.width() / 2)) + 0.0f, f11 - 20.0f, this.f1415h);
            canvas.drawLine(f10, f11, Math.min(0.0f, 1.0f), f11, this.f1414g);
            StringBuilder m11 = a1.a.m(BuildConfig.FLAVOR);
            m11.append(((int) ((((f11 - (i11 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i11)) + 0.5d)) / 100.0f);
            String sb3 = m11.toString();
            g(sb3, this.f1415h);
            canvas.drawText(sb3, f10 + 5.0f, 0.0f - ((f11 / 2.0f) - (this.f1419l.height() / 2)), this.f1415h);
            canvas.drawLine(f10, f11, f10, Math.max(0.0f, 1.0f), this.f1414g);
        }

        public void g(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f1419l);
        }
    }

    /* loaded from: classes.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.d f1421a = new androidx.constraintlayout.core.widgets.d();

        /* renamed from: b  reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.d f1422b = new androidx.constraintlayout.core.widgets.d();

        /* renamed from: c  reason: collision with root package name */
        public androidx.constraintlayout.widget.a f1423c = null;
        public androidx.constraintlayout.widget.a d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f1424e;

        /* renamed from: f  reason: collision with root package name */
        public int f1425f;

        public e() {
        }

        public void a() {
            int i10;
            SparseArray sparseArray;
            int[] iArr;
            String str;
            String str2;
            String str3;
            int i11;
            androidx.constraintlayout.widget.a aVar;
            Rect rect;
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.S.clear();
            SparseArray sparseArray2 = new SparseArray();
            int[] iArr2 = new int[childCount];
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = MotionLayout.this.getChildAt(i12);
                n nVar = new n(childAt);
                int id2 = childAt.getId();
                iArr2[i12] = id2;
                sparseArray2.put(id2, nVar);
                MotionLayout.this.S.put(childAt, nVar);
            }
            int i13 = 0;
            while (i13 < childCount) {
                View childAt2 = MotionLayout.this.getChildAt(i13);
                n nVar2 = MotionLayout.this.S.get(childAt2);
                if (nVar2 == null) {
                    i10 = childCount;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                } else {
                    if (this.f1423c != null) {
                        ConstraintWidget d = d(this.f1421a, childAt2);
                        if (d != null) {
                            Rect x10 = MotionLayout.x(MotionLayout.this, d);
                            androidx.constraintlayout.widget.a aVar2 = this.f1423c;
                            int width = MotionLayout.this.getWidth();
                            int height = MotionLayout.this.getHeight();
                            int i14 = aVar2.f1686c;
                            if (i14 != 0) {
                                i11 = i14;
                                aVar = aVar2;
                                sparseArray = sparseArray2;
                                rect = x10;
                                str = "MotionLayout";
                                iArr = iArr2;
                                str2 = "no widget for  ";
                                i10 = childCount;
                                str3 = " (";
                                nVar2.f(x10, nVar2.f16326a, i11, width, height);
                            } else {
                                i10 = childCount;
                                sparseArray = sparseArray2;
                                iArr = iArr2;
                                i11 = i14;
                                aVar = aVar2;
                                rect = x10;
                                str = "MotionLayout";
                                str2 = "no widget for  ";
                                str3 = " (";
                            }
                            w.p pVar = nVar2.f16330f;
                            pVar.f16351j = 0.0f;
                            pVar.f16352m = 0.0f;
                            nVar2.e(pVar);
                            nVar2.f16330f.e(rect.left, rect.top, rect.width(), rect.height());
                            a.C0022a j10 = aVar.j(nVar2.f16328c);
                            nVar2.f16330f.b(j10);
                            nVar2.f16336l = j10.d.f1753g;
                            nVar2.f16332h.e(rect, aVar, i11, nVar2.f16328c);
                            nVar2.C = j10.f1693f.f1772i;
                            a.c cVar = j10.d;
                            nVar2.E = cVar.f1757k;
                            nVar2.F = cVar.f1756j;
                            Context context = nVar2.f16327b.getContext();
                            a.c cVar2 = j10.d;
                            int i15 = cVar2.f1759m;
                            nVar2.G = i15 != -2 ? i15 != -1 ? i15 != 0 ? i15 != 1 ? i15 != 2 ? i15 != 4 ? i15 != 5 ? null : new OvershootInterpolator() : new BounceInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator() : new m(r.c.c(cVar2.f1758l)) : AnimationUtils.loadInterpolator(context, cVar2.n);
                        } else {
                            i10 = childCount;
                            sparseArray = sparseArray2;
                            iArr = iArr2;
                            str = "MotionLayout";
                            str2 = "no widget for  ";
                            str3 = " (";
                            if (MotionLayout.this.f1380f0 != 0) {
                                Log.e(str, w.a.b() + str2 + w.a.d(childAt2) + str3 + childAt2.getClass().getName() + ")");
                            }
                        }
                    } else {
                        i10 = childCount;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        str = "MotionLayout";
                        str2 = "no widget for  ";
                        str3 = " (";
                        Objects.requireNonNull(MotionLayout.this);
                    }
                    if (this.d != null) {
                        ConstraintWidget d10 = d(this.f1422b, childAt2);
                        if (d10 != null) {
                            Rect x11 = MotionLayout.x(MotionLayout.this, d10);
                            androidx.constraintlayout.widget.a aVar3 = this.d;
                            int width2 = MotionLayout.this.getWidth();
                            int height2 = MotionLayout.this.getHeight();
                            int i16 = aVar3.f1686c;
                            if (i16 != 0) {
                                nVar2.f(x11, nVar2.f16326a, i16, width2, height2);
                                x11 = nVar2.f16326a;
                            }
                            w.p pVar2 = nVar2.f16331g;
                            pVar2.f16351j = 1.0f;
                            pVar2.f16352m = 1.0f;
                            nVar2.e(pVar2);
                            nVar2.f16331g.e(x11.left, x11.top, x11.width(), x11.height());
                            nVar2.f16331g.b(aVar3.j(nVar2.f16328c));
                            nVar2.f16333i.e(x11, aVar3, i16, nVar2.f16328c);
                        } else if (MotionLayout.this.f1380f0 != 0) {
                            Log.e(str, w.a.b() + str2 + w.a.d(childAt2) + str3 + childAt2.getClass().getName() + ")");
                        }
                    }
                }
                i13++;
                childCount = i10;
                sparseArray2 = sparseArray;
                iArr2 = iArr;
            }
            SparseArray sparseArray3 = sparseArray2;
            int[] iArr3 = iArr2;
            int i17 = 0;
            while (i17 < childCount) {
                SparseArray sparseArray4 = sparseArray3;
                n nVar3 = (n) sparseArray4.get(iArr3[i17]);
                int i18 = nVar3.f16330f.A;
                if (i18 != -1) {
                    n nVar4 = (n) sparseArray4.get(i18);
                    nVar3.f16330f.g(nVar4, nVar4.f16330f);
                    nVar3.f16331g.g(nVar4, nVar4.f16331g);
                }
                i17++;
                sparseArray3 = sparseArray4;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(int r10, int r11) {
            /*
                r9 = this;
                androidx.constraintlayout.motion.widget.MotionLayout r0 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                int r0 = r0.getOptimizationLevel()
                androidx.constraintlayout.motion.widget.MotionLayout r1 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r2 = r1.N
                r6 = 3
                int r1 = r1.getStartState()
                if (r2 != r1) goto L56
                r8 = 1
                androidx.constraintlayout.motion.widget.MotionLayout r1 = androidx.constraintlayout.motion.widget.MotionLayout.this
                r7 = 4
                androidx.constraintlayout.core.widgets.d r2 = r9.f1422b
                androidx.constraintlayout.widget.a r3 = r9.d
                if (r3 == 0) goto L27
                r6 = 2
                int r4 = r3.f1686c
                if (r4 != 0) goto L24
                r6 = 4
                goto L28
            L24:
                r7 = 3
                r4 = r11
                goto L29
            L27:
                r6 = 3
            L28:
                r4 = r10
            L29:
                if (r3 == 0) goto L35
                r7 = 1
                int r3 = r3.f1686c
                r7 = 5
                if (r3 != 0) goto L33
                r8 = 2
                goto L36
            L33:
                r3 = r10
                goto L37
            L35:
                r8 = 5
            L36:
                r3 = r11
            L37:
                r1.u(r2, r0, r4, r3)
                androidx.constraintlayout.widget.a r1 = r9.f1423c
                r6 = 2
                if (r1 == 0) goto L8f
                androidx.constraintlayout.motion.widget.MotionLayout r2 = androidx.constraintlayout.motion.widget.MotionLayout.this
                r8 = 5
                androidx.constraintlayout.core.widgets.d r3 = r9.f1421a
                r7 = 5
                int r1 = r1.f1686c
                if (r1 != 0) goto L4c
                r7 = 7
                r4 = r10
                goto L4d
            L4c:
                r4 = r11
            L4d:
                if (r1 != 0) goto L51
                r6 = 6
                r10 = r11
            L51:
                r2.u(r3, r0, r4, r10)
                r6 = 7
                goto L90
            L56:
                r7 = 4
                androidx.constraintlayout.widget.a r1 = r9.f1423c
                if (r1 == 0) goto L71
                androidx.constraintlayout.motion.widget.MotionLayout r2 = androidx.constraintlayout.motion.widget.MotionLayout.this
                androidx.constraintlayout.core.widgets.d r3 = r9.f1421a
                int r1 = r1.f1686c
                if (r1 != 0) goto L66
                r6 = 2
                r4 = r10
                goto L68
            L66:
                r7 = 7
                r4 = r11
            L68:
                if (r1 != 0) goto L6d
                r8 = 7
                r1 = r11
                goto L6e
            L6d:
                r1 = r10
            L6e:
                r2.u(r3, r0, r4, r1)
            L71:
                r7 = 5
                androidx.constraintlayout.motion.widget.MotionLayout r1 = androidx.constraintlayout.motion.widget.MotionLayout.this
                androidx.constraintlayout.core.widgets.d r2 = r9.f1422b
                androidx.constraintlayout.widget.a r3 = r9.d
                r7 = 2
                if (r3 == 0) goto L82
                int r4 = r3.f1686c
                if (r4 != 0) goto L80
                goto L82
            L80:
                r4 = r11
                goto L83
            L82:
                r4 = r10
            L83:
                if (r3 == 0) goto L8a
                int r3 = r3.f1686c
                r7 = 3
                if (r3 != 0) goto L8b
            L8a:
                r10 = r11
            L8b:
                r8 = 1
                r1.u(r2, r0, r4, r10)
            L8f:
                r6 = 4
            L90:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.e.b(int, int):void");
        }

        public void c(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.core.widgets.d dVar2) {
            ArrayList<ConstraintWidget> arrayList = dVar.N0;
            HashMap<ConstraintWidget, ConstraintWidget> hashMap = new HashMap<>();
            hashMap.put(dVar, dVar2);
            dVar2.N0.clear();
            dVar2.k(dVar, hashMap);
            Iterator<ConstraintWidget> it = arrayList.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                ConstraintWidget aVar = next instanceof androidx.constraintlayout.core.widgets.a ? new androidx.constraintlayout.core.widgets.a() : next instanceof androidx.constraintlayout.core.widgets.f ? new androidx.constraintlayout.core.widgets.f() : next instanceof androidx.constraintlayout.core.widgets.e ? new androidx.constraintlayout.core.widgets.e() : next instanceof androidx.constraintlayout.core.widgets.h ? new androidx.constraintlayout.core.widgets.h() : next instanceof s.a ? new s.b() : new ConstraintWidget();
                dVar2.N0.add(aVar);
                ConstraintWidget constraintWidget = aVar.X;
                if (constraintWidget != null) {
                    ((s.c) constraintWidget).N0.remove(aVar);
                    aVar.K();
                }
                aVar.X = dVar2;
                hashMap.put(next, aVar);
            }
            Iterator<ConstraintWidget> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                hashMap.get(next2).k(next2, hashMap);
            }
        }

        public ConstraintWidget d(androidx.constraintlayout.core.widgets.d dVar, View view) {
            if (dVar.f1247n0 == view) {
                return dVar;
            }
            ArrayList<ConstraintWidget> arrayList = dVar.N0;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ConstraintWidget constraintWidget = arrayList.get(i10);
                if (constraintWidget.f1247n0 == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public void e(androidx.constraintlayout.widget.a aVar, androidx.constraintlayout.widget.a aVar2) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            this.f1423c = aVar;
            this.d = aVar2;
            this.f1421a = new androidx.constraintlayout.core.widgets.d();
            this.f1422b = new androidx.constraintlayout.core.widgets.d();
            androidx.constraintlayout.core.widgets.d dVar = this.f1421a;
            MotionLayout motionLayout = MotionLayout.this;
            boolean z10 = MotionLayout.Y0;
            dVar.m0(motionLayout.f1610j.R0);
            this.f1422b.m0(MotionLayout.this.f1610j.R0);
            this.f1421a.N0.clear();
            this.f1422b.N0.clear();
            c(MotionLayout.this.f1610j, this.f1421a);
            c(MotionLayout.this.f1610j, this.f1422b);
            if (MotionLayout.this.W > 0.5d) {
                if (aVar != null) {
                    g(this.f1421a, aVar);
                }
                g(this.f1422b, aVar2);
            } else {
                g(this.f1422b, aVar2);
                if (aVar != null) {
                    g(this.f1421a, aVar);
                }
            }
            this.f1421a.S0 = MotionLayout.this.r();
            androidx.constraintlayout.core.widgets.d dVar2 = this.f1421a;
            dVar2.O0.c(dVar2);
            this.f1422b.S0 = MotionLayout.this.r();
            androidx.constraintlayout.core.widgets.d dVar3 = this.f1422b;
            dVar3.O0.c(dVar3);
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    this.f1421a.W[0] = dimensionBehaviour;
                    this.f1422b.W[0] = dimensionBehaviour;
                }
                if (layoutParams.height == -2) {
                    this.f1421a.W[1] = dimensionBehaviour;
                    this.f1422b.W[1] = dimensionBehaviour;
                }
            }
        }

        public void f() {
            MotionLayout motionLayout = MotionLayout.this;
            int i10 = motionLayout.P;
            int i11 = motionLayout.Q;
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            MotionLayout motionLayout2 = MotionLayout.this;
            motionLayout2.H0 = mode;
            motionLayout2.I0 = mode2;
            motionLayout2.getOptimizationLevel();
            b(i10, i11);
            int i12 = 0;
            boolean z10 = true;
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                b(i10, i11);
                MotionLayout.this.D0 = this.f1421a.z();
                MotionLayout.this.E0 = this.f1421a.q();
                MotionLayout.this.F0 = this.f1422b.z();
                MotionLayout.this.G0 = this.f1422b.q();
                MotionLayout motionLayout3 = MotionLayout.this;
                motionLayout3.C0 = (motionLayout3.D0 == motionLayout3.F0 && motionLayout3.E0 == motionLayout3.G0) ? false : true;
            }
            MotionLayout motionLayout4 = MotionLayout.this;
            int i13 = motionLayout4.D0;
            int i14 = motionLayout4.E0;
            int i15 = motionLayout4.H0;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                i13 = (int) ((motionLayout4.J0 * (motionLayout4.F0 - i13)) + i13);
            }
            int i16 = motionLayout4.I0;
            if (i16 == Integer.MIN_VALUE || i16 == 0) {
                i14 = (int) ((motionLayout4.J0 * (motionLayout4.G0 - i14)) + i14);
            }
            int i17 = i14;
            androidx.constraintlayout.core.widgets.d dVar = this.f1421a;
            motionLayout4.t(i10, i11, i13, i17, dVar.b1 || this.f1422b.b1, dVar.f1327c1 || this.f1422b.f1327c1);
            MotionLayout motionLayout5 = MotionLayout.this;
            int childCount = motionLayout5.getChildCount();
            motionLayout5.S0.a();
            motionLayout5.f1378d0 = true;
            SparseArray sparseArray = new SparseArray();
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt = motionLayout5.getChildAt(i18);
                sparseArray.put(childAt.getId(), motionLayout5.S.get(childAt));
            }
            int width = motionLayout5.getWidth();
            int height = motionLayout5.getHeight();
            a.b bVar = motionLayout5.I.f1435c;
            int i19 = bVar != null ? bVar.f1464p : -1;
            if (i19 != -1) {
                for (int i20 = 0; i20 < childCount; i20++) {
                    n nVar = motionLayout5.S.get(motionLayout5.getChildAt(i20));
                    if (nVar != null) {
                        nVar.B = i19;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[motionLayout5.S.size()];
            int i21 = 0;
            for (int i22 = 0; i22 < childCount; i22++) {
                n nVar2 = motionLayout5.S.get(motionLayout5.getChildAt(i22));
                int i23 = nVar2.f16330f.A;
                if (i23 != -1) {
                    sparseBooleanArray.put(i23, true);
                    iArr[i21] = nVar2.f16330f.A;
                    i21++;
                }
            }
            if (motionLayout5.f1396v0 != null) {
                for (int i24 = 0; i24 < i21; i24++) {
                    n nVar3 = motionLayout5.S.get(motionLayout5.findViewById(iArr[i24]));
                    if (nVar3 != null) {
                        motionLayout5.I.g(nVar3);
                    }
                }
                Iterator<MotionHelper> it = motionLayout5.f1396v0.iterator();
                while (it.hasNext()) {
                    it.next().u(motionLayout5, motionLayout5.S);
                }
                for (int i25 = 0; i25 < i21; i25++) {
                    n nVar4 = motionLayout5.S.get(motionLayout5.findViewById(iArr[i25]));
                    if (nVar4 != null) {
                        nVar4.g(width, height, motionLayout5.getNanoTime());
                    }
                }
            } else {
                for (int i26 = 0; i26 < i21; i26++) {
                    n nVar5 = motionLayout5.S.get(motionLayout5.findViewById(iArr[i26]));
                    if (nVar5 != null) {
                        motionLayout5.I.g(nVar5);
                        nVar5.g(width, height, motionLayout5.getNanoTime());
                    }
                }
            }
            for (int i27 = 0; i27 < childCount; i27++) {
                View childAt2 = motionLayout5.getChildAt(i27);
                n nVar6 = motionLayout5.S.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId())) {
                    if (nVar6 != null) {
                        motionLayout5.I.g(nVar6);
                        nVar6.g(width, height, motionLayout5.getNanoTime());
                    }
                }
            }
            a.b bVar2 = motionLayout5.I.f1435c;
            float f10 = bVar2 != null ? bVar2.f1458i : 0.0f;
            if (f10 != 0.0f) {
                boolean z11 = ((double) f10) < 0.0d;
                float abs = Math.abs(f10);
                float f11 = -3.4028235E38f;
                float f12 = Float.MAX_VALUE;
                int i28 = 0;
                float f13 = Float.MAX_VALUE;
                float f14 = -3.4028235E38f;
                while (true) {
                    if (i28 >= childCount) {
                        z10 = false;
                        break;
                    }
                    n nVar7 = motionLayout5.S.get(motionLayout5.getChildAt(i28));
                    if (!Float.isNaN(nVar7.f16336l)) {
                        break;
                    }
                    w.p pVar = nVar7.f16331g;
                    float f15 = pVar.n;
                    float f16 = pVar.f16353t;
                    float f17 = z11 ? f16 - f15 : f16 + f15;
                    f13 = Math.min(f13, f17);
                    f14 = Math.max(f14, f17);
                    i28++;
                }
                if (z10) {
                    for (int i29 = 0; i29 < childCount; i29++) {
                        n nVar8 = motionLayout5.S.get(motionLayout5.getChildAt(i29));
                        if (!Float.isNaN(nVar8.f16336l)) {
                            f12 = Math.min(f12, nVar8.f16336l);
                            f11 = Math.max(f11, nVar8.f16336l);
                        }
                    }
                    while (i12 < childCount) {
                        n nVar9 = motionLayout5.S.get(motionLayout5.getChildAt(i12));
                        if (!Float.isNaN(nVar9.f16336l)) {
                            nVar9.n = 1.0f / (1.0f - abs);
                            if (z11) {
                                nVar9.f16337m = abs - (((f11 - nVar9.f16336l) / (f11 - f12)) * abs);
                            } else {
                                nVar9.f16337m = abs - (((nVar9.f16336l - f12) * abs) / (f11 - f12));
                            }
                        }
                        i12++;
                    }
                } else {
                    while (i12 < childCount) {
                        n nVar10 = motionLayout5.S.get(motionLayout5.getChildAt(i12));
                        w.p pVar2 = nVar10.f16331g;
                        float f18 = pVar2.n;
                        float f19 = pVar2.f16353t;
                        float f20 = z11 ? f19 - f18 : f19 + f18;
                        nVar10.n = 1.0f / (1.0f - abs);
                        nVar10.f16337m = abs - (((f20 - f13) * abs) / (f14 - f13));
                        i12++;
                    }
                }
            }
        }

        public final void g(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.a aVar) {
            a.C0022a c0022a;
            a.C0022a c0022a2;
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, dVar);
            sparseArray.put(MotionLayout.this.getId(), dVar);
            if (aVar != null && aVar.f1686c != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                androidx.constraintlayout.core.widgets.d dVar2 = this.f1422b;
                int optimizationLevel = motionLayout.getOptimizationLevel();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824);
                boolean z10 = MotionLayout.Y0;
                motionLayout.u(dVar2, optimizationLevel, makeMeasureSpec, makeMeasureSpec2);
            }
            Iterator<ConstraintWidget> it = dVar.N0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                sparseArray.put(((View) next.f1247n0).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = dVar.N0.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.f1247n0;
                int id2 = view.getId();
                if (aVar.f1688f.containsKey(Integer.valueOf(id2)) && (c0022a2 = aVar.f1688f.get(Integer.valueOf(id2))) != null) {
                    c0022a2.a(layoutParams);
                }
                next2.Y(aVar.j(view.getId()).f1692e.f1712c);
                next2.T(aVar.j(view.getId()).f1692e.d);
                if (view instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) view;
                    int id3 = constraintHelper.getId();
                    if (aVar.f1688f.containsKey(Integer.valueOf(id3)) && (c0022a = aVar.f1688f.get(Integer.valueOf(id3))) != null && (next2 instanceof s.b)) {
                        constraintHelper.o(c0022a, (s.b) next2, layoutParams, sparseArray);
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).t();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout motionLayout2 = MotionLayout.this;
                boolean z11 = MotionLayout.Y0;
                motionLayout2.f(false, view, next2, layoutParams, sparseArray);
                if (aVar.j(view.getId()).f1691c.f1762c == 1) {
                    next2.f1251p0 = view.getVisibility();
                } else {
                    next2.f1251p0 = aVar.j(view.getId()).f1691c.f1761b;
                }
            }
            Iterator<ConstraintWidget> it3 = dVar.N0.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof androidx.constraintlayout.core.widgets.i) {
                    s.a aVar2 = (s.a) next3;
                    ((ConstraintHelper) next3.f1247n0).s(dVar, aVar2, sparseArray);
                    ((androidx.constraintlayout.core.widgets.i) aVar2).c0();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    /* loaded from: classes.dex */
    public static class g implements f {

        /* renamed from: b  reason: collision with root package name */
        public static g f1427b = new g();

        /* renamed from: a  reason: collision with root package name */
        public VelocityTracker f1428a;

        public void a(int i10) {
            VelocityTracker velocityTracker = this.f1428a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i10);
            }
        }

        public float b() {
            VelocityTracker velocityTracker = this.f1428a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        public float c() {
            VelocityTracker velocityTracker = this.f1428a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }
    }

    /* loaded from: classes.dex */
    public class h {

        /* renamed from: a  reason: collision with root package name */
        public float f1429a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f1430b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public int f1431c = -1;
        public int d = -1;

        public h() {
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a() {
            /*
                Method dump skipped, instructions count: 189
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.h.a():void");
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(MotionLayout motionLayout, int i10, int i11, float f10);

        void b(MotionLayout motionLayout, int i10, int i11);

        void c(MotionLayout motionLayout, int i10, boolean z10, float f10);

        void d(MotionLayout motionLayout, int i10);
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = null;
        this.L = 0.0f;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = 0;
        this.Q = 0;
        this.R = true;
        this.S = new HashMap<>();
        this.T = 0L;
        this.U = 1.0f;
        this.V = 0.0f;
        this.W = 0.0f;
        this.f1376b0 = 0.0f;
        this.f1378d0 = false;
        this.f1380f0 = 0;
        this.f1382h0 = false;
        this.f1383i0 = new v.b();
        this.f1384j0 = new c();
        this.f1388n0 = false;
        this.f1393s0 = false;
        this.f1394t0 = null;
        this.f1395u0 = null;
        this.f1396v0 = null;
        this.w0 = null;
        this.f1397x0 = 0;
        this.f1398y0 = -1L;
        this.f1399z0 = 0.0f;
        this.A0 = 0;
        this.B0 = 0.0f;
        this.C0 = false;
        this.K0 = new p(1);
        this.L0 = false;
        this.N0 = null;
        this.O0 = new HashMap<>();
        this.P0 = new Rect();
        this.Q0 = false;
        this.R0 = TransitionState.UNDEFINED;
        this.S0 = new e();
        this.T0 = false;
        this.U0 = new RectF();
        this.V0 = null;
        this.W0 = null;
        this.X0 = new ArrayList<>();
        H(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.K = null;
        this.L = 0.0f;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = 0;
        this.Q = 0;
        this.R = true;
        this.S = new HashMap<>();
        this.T = 0L;
        this.U = 1.0f;
        this.V = 0.0f;
        this.W = 0.0f;
        this.f1376b0 = 0.0f;
        this.f1378d0 = false;
        this.f1380f0 = 0;
        this.f1382h0 = false;
        this.f1383i0 = new v.b();
        this.f1384j0 = new c();
        this.f1388n0 = false;
        this.f1393s0 = false;
        this.f1394t0 = null;
        this.f1395u0 = null;
        this.f1396v0 = null;
        this.w0 = null;
        this.f1397x0 = 0;
        this.f1398y0 = -1L;
        this.f1399z0 = 0.0f;
        this.A0 = 0;
        this.B0 = 0.0f;
        this.C0 = false;
        this.K0 = new p(1);
        this.L0 = false;
        this.N0 = null;
        this.O0 = new HashMap<>();
        this.P0 = new Rect();
        this.Q0 = false;
        this.R0 = TransitionState.UNDEFINED;
        this.S0 = new e();
        this.T0 = false;
        this.U0 = new RectF();
        this.V0 = null;
        this.W0 = null;
        this.X0 = new ArrayList<>();
        H(attributeSet);
    }

    public static Rect x(MotionLayout motionLayout, ConstraintWidget constraintWidget) {
        motionLayout.P0.top = constraintWidget.B();
        motionLayout.P0.left = constraintWidget.A();
        Rect rect = motionLayout.P0;
        int z10 = constraintWidget.z();
        Rect rect2 = motionLayout.P0;
        rect.right = z10 + rect2.left;
        int q10 = constraintWidget.q();
        Rect rect3 = motionLayout.P0;
        rect2.bottom = q10 + rect3.top;
        return rect3;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A(boolean r24) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.A(boolean):void");
    }

    public final void B() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if (this.f1379e0 == null && ((copyOnWriteArrayList = this.w0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        if (this.B0 != this.V) {
            if (this.A0 != -1) {
                i iVar = this.f1379e0;
                if (iVar != null) {
                    iVar.b(this, this.M, this.O);
                }
                CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.w0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<i> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().b(this, this.M, this.O);
                    }
                }
            }
            this.A0 = -1;
            float f10 = this.V;
            this.B0 = f10;
            i iVar2 = this.f1379e0;
            if (iVar2 != null) {
                iVar2.a(this, this.M, this.O, f10);
            }
            CopyOnWriteArrayList<i> copyOnWriteArrayList3 = this.w0;
            if (copyOnWriteArrayList3 != null) {
                Iterator<i> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, this.M, this.O, this.V);
                }
            }
        }
    }

    public void C() {
        int i10;
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if ((this.f1379e0 != null || ((copyOnWriteArrayList = this.w0) != null && !copyOnWriteArrayList.isEmpty())) && this.A0 == -1) {
            this.A0 = this.N;
            if (this.X0.isEmpty()) {
                i10 = -1;
            } else {
                ArrayList<Integer> arrayList = this.X0;
                i10 = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i11 = this.N;
            if (i10 != i11 && i11 != -1) {
                this.X0.add(Integer.valueOf(i11));
            }
        }
        J();
        Runnable runnable = this.N0;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void D(int i10, float f10, float f11, float f12, float[] fArr) {
        HashMap<View, n> hashMap = this.S;
        View view = this.f1608c.get(i10);
        n nVar = hashMap.get(view);
        if (nVar != null) {
            nVar.c(f10, f11, f12, fArr);
            view.getY();
            return;
        }
        String j10 = view == null ? a1.a.j(BuildConfig.FLAVOR, i10) : view.getContext().getResources().getResourceName(i10);
        Log.w("MotionLayout", "WARNING could not find view id " + j10);
    }

    public androidx.constraintlayout.widget.a E(int i10) {
        androidx.constraintlayout.motion.widget.a aVar = this.I;
        if (aVar == null) {
            return null;
        }
        return aVar.b(i10);
    }

    public a.b F(int i10) {
        Iterator<a.b> it = this.I.d.iterator();
        while (it.hasNext()) {
            a.b next = it.next();
            if (next.f1451a == i10) {
                return next;
            }
        }
        return null;
    }

    public final boolean G(float f10, float f11, View view, MotionEvent motionEvent) {
        boolean z10;
        boolean onTouchEvent;
        View childAt;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (G((childAt.getLeft() + f10) - view.getScrollX(), (childAt.getTop() + f11) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (!z10) {
            this.U0.set(f10, f11, (view.getRight() + f10) - view.getLeft(), (view.getBottom() + f11) - view.getTop());
            if (motionEvent.getAction() != 0 || this.U0.contains(motionEvent.getX(), motionEvent.getY())) {
                float f12 = -f10;
                float f13 = -f11;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f12, f13);
                    onTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f12, -f13);
                } else {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(f12, f13);
                    if (this.W0 == null) {
                        this.W0 = new Matrix();
                    }
                    matrix.invert(this.W0);
                    obtain.transform(this.W0);
                    onTouchEvent = view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (onTouchEvent) {
                    return true;
                }
            }
        }
        return z10;
    }

    public final void H(AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.a aVar;
        Y0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j0.S);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = 2;
                if (index == 2) {
                    this.I = new androidx.constraintlayout.motion.widget.a(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.N = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f1376b0 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f1378d0 = true;
                } else if (index == 0) {
                    z10 = obtainStyledAttributes.getBoolean(index, z10);
                } else if (index == 5) {
                    if (this.f1380f0 == 0) {
                        if (!obtainStyledAttributes.getBoolean(index, false)) {
                            i11 = 0;
                        }
                        this.f1380f0 = i11;
                    }
                } else if (index == 3) {
                    this.f1380f0 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.I == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z10) {
                this.I = null;
            }
        }
        if (this.f1380f0 != 0) {
            androidx.constraintlayout.motion.widget.a aVar2 = this.I;
            if (aVar2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
                if (this.N == -1 || (aVar = this.I) == null) {
                }
                this.N = aVar.i();
                this.M = this.I.i();
                this.O = this.I.d();
                return;
            }
            int i12 = aVar2.i();
            androidx.constraintlayout.motion.widget.a aVar3 = this.I;
            androidx.constraintlayout.widget.a b10 = aVar3.b(aVar3.i());
            String c10 = w.a.c(getContext(), i12);
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                int id2 = childAt.getId();
                if (id2 == -1) {
                    StringBuilder p10 = a1.a.p("CHECK: ", c10, " ALL VIEWS SHOULD HAVE ID's ");
                    p10.append(childAt.getClass().getName());
                    p10.append(" does not!");
                    Log.w("MotionLayout", p10.toString());
                }
                if (b10.k(id2) == null) {
                    StringBuilder p11 = a1.a.p("CHECK: ", c10, " NO CONSTRAINTS for ");
                    p11.append(w.a.d(childAt));
                    Log.w("MotionLayout", p11.toString());
                }
            }
            Integer[] numArr = (Integer[]) b10.f1688f.keySet().toArray(new Integer[0]);
            int length = numArr.length;
            int[] iArr = new int[length];
            for (int i14 = 0; i14 < length; i14++) {
                iArr[i14] = numArr[i14].intValue();
            }
            for (int i15 = 0; i15 < length; i15++) {
                int i16 = iArr[i15];
                String c11 = w.a.c(getContext(), i16);
                if (findViewById(iArr[i15]) == null) {
                    Log.w("MotionLayout", "CHECK: " + c10 + " NO View matches id " + c11);
                }
                if (b10.j(i16).f1692e.d == -1) {
                    Log.w("MotionLayout", "CHECK: " + c10 + "(" + c11 + ") no LAYOUT_HEIGHT");
                }
                if (b10.j(i16).f1692e.f1712c == -1) {
                    Log.w("MotionLayout", "CHECK: " + c10 + "(" + c11 + ") no LAYOUT_HEIGHT");
                }
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            Iterator<a.b> it = this.I.d.iterator();
            loop4: while (true) {
                while (it.hasNext()) {
                    a.b next = it.next();
                    if (next == this.I.f1435c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (next.d == next.f1453c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i17 = next.d;
                    int i18 = next.f1453c;
                    String c12 = w.a.c(getContext(), i17);
                    String c13 = w.a.c(getContext(), i18);
                    if (sparseIntArray.get(i17) == i18) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + c12 + "->" + c13);
                    }
                    if (sparseIntArray2.get(i18) == i17) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + c12 + "->" + c13);
                    }
                    sparseIntArray.put(i17, i18);
                    sparseIntArray2.put(i18, i17);
                    if (this.I.b(i17) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + c12);
                    }
                    if (this.I.b(i18) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + c12);
                    }
                }
            }
        }
        if (this.N == -1) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void I() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.I():void");
    }

    public final void J() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if (this.f1379e0 != null || ((copyOnWriteArrayList = this.w0) != null && !copyOnWriteArrayList.isEmpty())) {
            Iterator<Integer> it = this.X0.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                i iVar = this.f1379e0;
                if (iVar != null) {
                    iVar.d(this, next.intValue());
                }
                CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.w0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<i> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().d(this, next.intValue());
                    }
                }
            }
            this.X0.clear();
        }
    }

    public void K() {
        this.S0.f();
        invalidate();
    }

    public void L(int i10, int i11, int i12) {
        int a10;
        setState(TransitionState.SETUP);
        this.N = i10;
        this.M = -1;
        this.O = -1;
        x.a aVar = this.A;
        if (aVar == null) {
            androidx.constraintlayout.motion.widget.a aVar2 = this.I;
            if (aVar2 != null) {
                aVar2.b(i10).c(this, true);
                setConstraintSet(null);
                requestLayout();
            }
            return;
        }
        float f10 = i11;
        float f11 = i12;
        int i13 = aVar.f17602b;
        if (i13 == i10) {
            a.C0289a valueAt = i10 == -1 ? aVar.d.valueAt(0) : aVar.d.get(i13);
            int i14 = aVar.f17603c;
            if ((i14 == -1 || !valueAt.f17606b.get(i14).a(f10, f11)) && aVar.f17603c != (a10 = valueAt.a(f10, f11))) {
                androidx.constraintlayout.widget.a aVar3 = a10 != -1 ? valueAt.f17606b.get(a10).f17612f : null;
                if (a10 != -1) {
                    int i15 = valueAt.f17606b.get(a10).f17611e;
                }
                if (aVar3 == null) {
                    return;
                }
                aVar.f17603c = a10;
                aVar3.b(aVar.f17601a);
                return;
            }
            return;
        }
        aVar.f17602b = i10;
        a.C0289a c0289a = aVar.d.get(i10);
        int a11 = c0289a.a(f10, f11);
        androidx.constraintlayout.widget.a aVar4 = a11 == -1 ? c0289a.d : c0289a.f17606b.get(a11).f17612f;
        if (a11 != -1) {
            int i16 = c0289a.f17606b.get(a11).f17611e;
        }
        if (aVar4 != null) {
            aVar.f17603c = a11;
            aVar4.b(aVar.f17601a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
    }

    public void M(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.M0 == null) {
                this.M0 = new h();
            }
            h hVar = this.M0;
            hVar.f1431c = i10;
            hVar.d = i11;
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar = this.I;
        if (aVar != null) {
            this.M = i10;
            this.O = i11;
            aVar.o(i10, i11);
            this.S0.e(this.I.b(i10), this.I.b(i11));
            K();
            this.W = 0.0f;
            y(0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r15 != 7) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if ((((r17 * r6) - (((r3 * r6) * r6) / 2.0f)) + r1) > 1.0f) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if ((((((r3 * r6) * r6) / 2.0f) + (r17 * r6)) + r1) < 0.0f) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
        if (r2 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
        r1 = r14.f1384j0;
        r2 = r14.W;
        r3 = r14.I.h();
        r1.f1406a = r17;
        r1.f1407b = r2;
        r1.f1408c = r3;
        r14.J = r14.f1384j0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
        r1 = r14.f1383i0;
        r2 = r14.W;
        r5 = r14.U;
        r6 = r14.I.h();
        r3 = r14.I.f1435c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
        if (r3 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
        r3 = r3.f1461l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
        if (r3 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
        r7 = r3.f1486s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
        r7 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
        r1.b(r2, r16, r17, r5, r6, r7);
        r14.L = 0.0f;
        r1 = r14.N;
        r14.f1376b0 = r8;
        r14.N = r1;
        r14.J = r14.f1383i0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void N(int r15, float r16, float r17) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.N(int, float, float):void");
    }

    public void O() {
        y(1.0f);
        this.N0 = null;
    }

    public void P(int i10) {
        if (isAttachedToWindow()) {
            R(i10, -1, -1, -1);
            return;
        }
        if (this.M0 == null) {
            this.M0 = new h();
        }
        this.M0.d = i10;
    }

    public void Q(int i10, int i11) {
        if (isAttachedToWindow()) {
            R(i10, -1, -1, i11);
            return;
        }
        if (this.M0 == null) {
            this.M0 = new h();
        }
        this.M0.d = i10;
    }

    public void R(int i10, int i11, int i12, int i13) {
        x.d dVar;
        androidx.constraintlayout.motion.widget.a aVar = this.I;
        if (aVar != null && (dVar = aVar.f1434b) != null) {
            int i14 = this.N;
            float f10 = i11;
            float f11 = i12;
            d.a aVar2 = dVar.f17620b.get(i10);
            if (aVar2 == null) {
                i14 = i10;
            } else if (f10 != -1.0f && f11 != -1.0f) {
                Iterator<d.b> it = aVar2.f17622b.iterator();
                d.b bVar = null;
                loop0: while (true) {
                    while (true) {
                        if (it.hasNext()) {
                            d.b next = it.next();
                            if (next.a(f10, f11)) {
                                if (i14 == next.f17627e) {
                                    break loop0;
                                }
                                bVar = next;
                            }
                        } else {
                            i14 = bVar != null ? bVar.f17627e : aVar2.f17623c;
                        }
                    }
                }
            } else if (aVar2.f17623c != i14) {
                Iterator<d.b> it2 = aVar2.f17622b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (i14 == it2.next().f17627e) {
                            break;
                        }
                    } else {
                        i14 = aVar2.f17623c;
                        break;
                    }
                }
            }
            if (i14 != -1) {
                i10 = i14;
            }
        }
        int i15 = this.N;
        if (i15 == i10) {
            return;
        }
        if (this.M == i10) {
            y(0.0f);
            if (i13 > 0) {
                this.U = i13 / 1000.0f;
            }
        } else if (this.O == i10) {
            y(1.0f);
            if (i13 > 0) {
                this.U = i13 / 1000.0f;
            }
        } else {
            this.O = i10;
            if (i15 != -1) {
                M(i15, i10);
                y(1.0f);
                this.W = 0.0f;
                O();
                if (i13 > 0) {
                    this.U = i13 / 1000.0f;
                    return;
                }
                return;
            }
            this.f1382h0 = false;
            this.f1376b0 = 1.0f;
            this.V = 0.0f;
            this.W = 0.0f;
            this.f1375a0 = getNanoTime();
            this.T = getNanoTime();
            this.f1377c0 = false;
            this.J = null;
            if (i13 == -1) {
                this.U = this.I.c() / 1000.0f;
            }
            this.M = -1;
            this.I.o(-1, this.O);
            SparseArray sparseArray = new SparseArray();
            if (i13 == 0) {
                this.U = this.I.c() / 1000.0f;
            } else if (i13 > 0) {
                this.U = i13 / 1000.0f;
            }
            int childCount = getChildCount();
            this.S.clear();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                this.S.put(childAt, new n(childAt));
                sparseArray.put(childAt.getId(), this.S.get(childAt));
            }
            this.f1378d0 = true;
            this.S0.e(null, this.I.b(i10));
            K();
            this.S0.a();
            int childCount2 = getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                n nVar = this.S.get(childAt2);
                if (nVar != null) {
                    w.p pVar = nVar.f16330f;
                    pVar.f16351j = 0.0f;
                    pVar.f16352m = 0.0f;
                    pVar.e(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                    nVar.f16332h.f(childAt2);
                }
            }
            int width = getWidth();
            int height = getHeight();
            if (this.f1396v0 != null) {
                for (int i18 = 0; i18 < childCount; i18++) {
                    n nVar2 = this.S.get(getChildAt(i18));
                    if (nVar2 != null) {
                        this.I.g(nVar2);
                    }
                }
                Iterator<MotionHelper> it3 = this.f1396v0.iterator();
                while (it3.hasNext()) {
                    it3.next().u(this, this.S);
                }
                for (int i19 = 0; i19 < childCount; i19++) {
                    n nVar3 = this.S.get(getChildAt(i19));
                    if (nVar3 != null) {
                        nVar3.g(width, height, getNanoTime());
                    }
                }
            } else {
                for (int i20 = 0; i20 < childCount; i20++) {
                    n nVar4 = this.S.get(getChildAt(i20));
                    if (nVar4 != null) {
                        this.I.g(nVar4);
                        nVar4.g(width, height, getNanoTime());
                    }
                }
            }
            a.b bVar2 = this.I.f1435c;
            float f12 = bVar2 != null ? bVar2.f1458i : 0.0f;
            if (f12 != 0.0f) {
                float f13 = Float.MAX_VALUE;
                float f14 = -3.4028235E38f;
                for (int i21 = 0; i21 < childCount; i21++) {
                    w.p pVar2 = this.S.get(getChildAt(i21)).f16331g;
                    float f15 = pVar2.f16353t + pVar2.n;
                    f13 = Math.min(f13, f15);
                    f14 = Math.max(f14, f15);
                }
                for (int i22 = 0; i22 < childCount; i22++) {
                    n nVar5 = this.S.get(getChildAt(i22));
                    w.p pVar3 = nVar5.f16331g;
                    float f16 = pVar3.n;
                    float f17 = pVar3.f16353t;
                    nVar5.n = 1.0f / (1.0f - f12);
                    nVar5.f16337m = f12 - ((((f16 + f17) - f13) * f12) / (f14 - f13));
                }
            }
            this.V = 0.0f;
            this.W = 0.0f;
            this.f1378d0 = true;
            invalidate();
        }
    }

    public void S(int i10, androidx.constraintlayout.widget.a aVar) {
        androidx.constraintlayout.motion.widget.a aVar2 = this.I;
        if (aVar2 != null) {
            aVar2.f1438g.put(i10, aVar);
        }
        this.S0.e(this.I.b(this.M), this.I.b(this.O));
        K();
        if (this.N == i10) {
            aVar.c(this, true);
            setConstraintSet(null);
            requestLayout();
        }
    }

    public void T(int i10, View... viewArr) {
        androidx.constraintlayout.motion.widget.a aVar = this.I;
        if (aVar != null) {
            androidx.constraintlayout.motion.widget.d dVar = aVar.f1447q;
            Objects.requireNonNull(dVar);
            ArrayList arrayList = new ArrayList();
            Iterator<androidx.constraintlayout.motion.widget.c> it = dVar.f1525b.iterator();
            androidx.constraintlayout.motion.widget.c cVar = null;
            loop0: while (true) {
                while (it.hasNext()) {
                    androidx.constraintlayout.motion.widget.c next = it.next();
                    if (next.f1493a == i10) {
                        for (View view : viewArr) {
                            if (next.b(view)) {
                                arrayList.add(view);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                            int currentState = dVar.f1524a.getCurrentState();
                            if (next.f1496e == 2) {
                                next.a(dVar, dVar.f1524a, currentState, null, viewArr2);
                            } else if (currentState == -1) {
                                String str = dVar.d;
                                StringBuilder m10 = a1.a.m("No support for ViewTransition within transition yet. Currently: ");
                                m10.append(dVar.f1524a.toString());
                                Log.w(str, m10.toString());
                            } else {
                                androidx.constraintlayout.widget.a E = dVar.f1524a.E(currentState);
                                if (E != null) {
                                    next.a(dVar, dVar.f1524a, currentState, E, viewArr2);
                                }
                            }
                            arrayList.clear();
                        }
                        cVar = next;
                    }
                }
            }
            if (cVar == null) {
                Log.e(dVar.d, " Could not find ViewTransition");
            }
        } else {
            Log.e("MotionLayout", " no motionScene");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0556 A[ORIG_RETURN, RETURN] */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatchDraw(android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 1367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public int[] getConstraintSetIds() {
        androidx.constraintlayout.motion.widget.a aVar = this.I;
        if (aVar == null) {
            return null;
        }
        int size = aVar.f1438g.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = aVar.f1438g.keyAt(i10);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.N;
    }

    public ArrayList<a.b> getDefinedTransitions() {
        androidx.constraintlayout.motion.widget.a aVar = this.I;
        if (aVar == null) {
            return null;
        }
        return aVar.d;
    }

    public w.b getDesignTool() {
        if (this.f1385k0 == null) {
            this.f1385k0 = new w.b(this);
        }
        return this.f1385k0;
    }

    public int getEndState() {
        return this.O;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.W;
    }

    public androidx.constraintlayout.motion.widget.a getScene() {
        return this.I;
    }

    public int getStartState() {
        return this.M;
    }

    public float getTargetPosition() {
        return this.f1376b0;
    }

    public Bundle getTransitionState() {
        if (this.M0 == null) {
            this.M0 = new h();
        }
        h hVar = this.M0;
        MotionLayout motionLayout = MotionLayout.this;
        hVar.d = motionLayout.O;
        hVar.f1431c = motionLayout.M;
        hVar.f1430b = motionLayout.getVelocity();
        hVar.f1429a = MotionLayout.this.getProgress();
        h hVar2 = this.M0;
        Objects.requireNonNull(hVar2);
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", hVar2.f1429a);
        bundle.putFloat("motion.velocity", hVar2.f1430b);
        bundle.putInt("motion.StartState", hVar2.f1431c);
        bundle.putInt("motion.EndState", hVar2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        androidx.constraintlayout.motion.widget.a aVar = this.I;
        if (aVar != null) {
            this.U = aVar.c() / 1000.0f;
        }
        return this.U * 1000.0f;
    }

    public float getVelocity() {
        return this.L;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // n0.l
    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (!this.f1388n0) {
            if (i10 == 0) {
                if (i11 != 0) {
                }
                this.f1388n0 = false;
            }
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        this.f1388n0 = false;
    }

    @Override // n0.k
    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    @Override // n0.k
    public boolean l(View view, View view2, int i10, int i11) {
        a.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        androidx.constraintlayout.motion.widget.a aVar = this.I;
        return (aVar == null || (bVar = aVar.f1435c) == null || (bVar2 = bVar.f1461l) == null || (bVar2.f1490w & 2) != 0) ? false : true;
    }

    @Override // n0.k
    public void m(View view, View view2, int i10, int i11) {
        this.f1391q0 = getNanoTime();
        this.f1392r0 = 0.0f;
        this.f1389o0 = 0.0f;
        this.f1390p0 = 0.0f;
    }

    @Override // n0.k
    public void n(View view, int i10) {
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.a aVar = this.I;
        if (aVar != null) {
            float f10 = this.f1392r0;
            float f11 = 0.0f;
            if (f10 == 0.0f) {
                return;
            }
            float f12 = this.f1389o0 / f10;
            float f13 = this.f1390p0 / f10;
            a.b bVar2 = aVar.f1435c;
            if (bVar2 == null || (bVar = bVar2.f1461l) == null) {
                return;
            }
            bVar.f1481m = false;
            float progress = bVar.f1485r.getProgress();
            bVar.f1485r.D(bVar.d, progress, bVar.f1476h, bVar.f1475g, bVar.n);
            float f14 = bVar.f1479k;
            float[] fArr = bVar.n;
            float f15 = fArr[0];
            float f16 = bVar.f1480l;
            float f17 = fArr[1];
            float f18 = f14 != 0.0f ? (f12 * f14) / fArr[0] : (f13 * f16) / fArr[1];
            if (!Float.isNaN(f18)) {
                progress += f18 / 3.0f;
            }
            if (progress != 0.0f) {
                boolean z10 = progress != 1.0f;
                int i11 = bVar.f1472c;
                if ((i11 != 3) && z10) {
                    MotionLayout motionLayout = bVar.f1485r;
                    if (progress >= 0.5d) {
                        f11 = 1.0f;
                    }
                    motionLayout.N(i11, f11, f18);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // n0.k
    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        a.b bVar;
        boolean z10;
        ?? r1;
        androidx.constraintlayout.motion.widget.b bVar2;
        float f10;
        androidx.constraintlayout.motion.widget.b bVar3;
        androidx.constraintlayout.motion.widget.b bVar4;
        androidx.constraintlayout.motion.widget.b bVar5;
        int i13;
        androidx.constraintlayout.motion.widget.a aVar = this.I;
        if (aVar == null || (bVar = aVar.f1435c) == null || !(!bVar.f1463o)) {
            return;
        }
        int i14 = -1;
        if (!z10 || (bVar5 = bVar.f1461l) == null || (i13 = bVar5.f1473e) == -1 || view.getId() == i13) {
            a.b bVar6 = aVar.f1435c;
            if ((bVar6 == null || (bVar4 = bVar6.f1461l) == null) ? false : bVar4.f1488u) {
                androidx.constraintlayout.motion.widget.b bVar7 = bVar.f1461l;
                if (bVar7 != null && (bVar7.f1490w & 4) != 0) {
                    i14 = i11;
                }
                float f11 = this.V;
                if ((f11 == 1.0f || f11 == 0.0f) && view.canScrollVertically(i14)) {
                    return;
                }
            }
            androidx.constraintlayout.motion.widget.b bVar8 = bVar.f1461l;
            if (bVar8 != null && (bVar8.f1490w & 1) != 0) {
                float f12 = i10;
                float f13 = i11;
                a.b bVar9 = aVar.f1435c;
                if (bVar9 == null || (bVar3 = bVar9.f1461l) == null) {
                    f10 = 0.0f;
                } else {
                    bVar3.f1485r.D(bVar3.d, bVar3.f1485r.getProgress(), bVar3.f1476h, bVar3.f1475g, bVar3.n);
                    float f14 = bVar3.f1479k;
                    if (f14 != 0.0f) {
                        float[] fArr = bVar3.n;
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f10 = (f12 * f14) / fArr[0];
                    } else {
                        float[] fArr2 = bVar3.n;
                        if (fArr2[1] == 0.0f) {
                            fArr2[1] = 1.0E-7f;
                        }
                        f10 = (f13 * bVar3.f1480l) / fArr2[1];
                    }
                }
                float f15 = this.W;
                if ((f15 <= 0.0f && f10 < 0.0f) || (f15 >= 1.0f && f10 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new a(this, view));
                    return;
                }
            }
            float f16 = this.V;
            long nanoTime = getNanoTime();
            float f17 = i10;
            this.f1389o0 = f17;
            float f18 = i11;
            this.f1390p0 = f18;
            this.f1392r0 = (float) ((nanoTime - this.f1391q0) * 1.0E-9d);
            this.f1391q0 = nanoTime;
            a.b bVar10 = aVar.f1435c;
            if (bVar10 != null && (bVar2 = bVar10.f1461l) != null) {
                float progress = bVar2.f1485r.getProgress();
                if (!bVar2.f1481m) {
                    bVar2.f1481m = true;
                    bVar2.f1485r.setProgress(progress);
                }
                bVar2.f1485r.D(bVar2.d, progress, bVar2.f1476h, bVar2.f1475g, bVar2.n);
                float f19 = bVar2.f1479k;
                float[] fArr3 = bVar2.n;
                if (Math.abs((bVar2.f1480l * fArr3[1]) + (f19 * fArr3[0])) < 0.01d) {
                    float[] fArr4 = bVar2.n;
                    fArr4[0] = 0.01f;
                    fArr4[1] = 0.01f;
                }
                float f20 = bVar2.f1479k;
                float max = Math.max(Math.min(progress + (f20 != 0.0f ? (f17 * f20) / bVar2.n[0] : (f18 * bVar2.f1480l) / bVar2.n[1]), 1.0f), 0.0f);
                if (max != bVar2.f1485r.getProgress()) {
                    bVar2.f1485r.setProgress(max);
                }
            }
            if (f16 != this.V) {
                iArr[0] = i10;
                r1 = 1;
                iArr[1] = i11;
            } else {
                r1 = 1;
            }
            A(false);
            if (iArr[0] == 0 && iArr[r1] == 0) {
                return;
            }
            this.f1388n0 = r1;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        a.b bVar;
        int i10;
        boolean z10;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        androidx.constraintlayout.motion.widget.a aVar = this.I;
        if (aVar != null && (i10 = this.N) != -1) {
            androidx.constraintlayout.widget.a b10 = aVar.b(i10);
            androidx.constraintlayout.motion.widget.a aVar2 = this.I;
            int i11 = 0;
            while (true) {
                if (i11 >= aVar2.f1438g.size()) {
                    break;
                }
                int keyAt = aVar2.f1438g.keyAt(i11);
                int i12 = aVar2.f1440i.get(keyAt);
                int size = aVar2.f1440i.size();
                while (i12 > 0) {
                    if (i12 != keyAt) {
                        int i13 = size - 1;
                        if (size >= 0) {
                            i12 = aVar2.f1440i.get(i12);
                            size = i13;
                        }
                    }
                    z10 = true;
                    break;
                }
                z10 = false;
                if (z10) {
                    Log.e("MotionScene", "Cannot be derived from yourself");
                    break;
                } else {
                    aVar2.n(keyAt, this);
                    i11++;
                }
            }
            ArrayList<MotionHelper> arrayList = this.f1396v0;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    Objects.requireNonNull(it.next());
                }
            }
            if (b10 != null) {
                b10.c(this, true);
                setConstraintSet(null);
                requestLayout();
            }
            this.M = this.N;
        }
        I();
        h hVar = this.M0;
        if (hVar != null) {
            if (this.Q0) {
                post(new b());
                return;
            } else {
                hVar.a();
                return;
            }
        }
        androidx.constraintlayout.motion.widget.a aVar3 = this.I;
        if (aVar3 != null && (bVar = aVar3.f1435c) != null && bVar.n == 4) {
            O();
            setState(TransitionState.SETUP);
            setState(TransitionState.MOVING);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.b bVar;
        int i10;
        RectF b10;
        int currentState;
        androidx.constraintlayout.motion.widget.c cVar;
        androidx.constraintlayout.motion.widget.a aVar = this.I;
        if (aVar != null && this.R) {
            androidx.constraintlayout.motion.widget.d dVar = aVar.f1447q;
            if (dVar != null && (currentState = dVar.f1524a.getCurrentState()) != -1) {
                if (dVar.f1526c == null) {
                    dVar.f1526c = new HashSet<>();
                    Iterator<androidx.constraintlayout.motion.widget.c> it = dVar.f1525b.iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.motion.widget.c next = it.next();
                        int childCount = dVar.f1524a.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = dVar.f1524a.getChildAt(i11);
                            if (next.c(childAt)) {
                                childAt.getId();
                                dVar.f1526c.add(childAt);
                            }
                        }
                    }
                }
                float x10 = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList<c.a> arrayList = dVar.f1527e;
                int i12 = 2;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Iterator<c.a> it2 = dVar.f1527e.iterator();
                    while (it2.hasNext()) {
                        c.a next2 = it2.next();
                        Objects.requireNonNull(next2);
                        if (action != 1) {
                            if (action == 2) {
                                next2.f1514c.f16327b.getHitRect(next2.f1522l);
                                if (!next2.f1522l.contains((int) x10, (int) y) && !next2.f1518h) {
                                    next2.b(true);
                                }
                            }
                        } else if (!next2.f1518h) {
                            next2.b(true);
                        }
                    }
                }
                if (action == 0 || action == 1) {
                    androidx.constraintlayout.widget.a E = dVar.f1524a.E(currentState);
                    Iterator<androidx.constraintlayout.motion.widget.c> it3 = dVar.f1525b.iterator();
                    while (it3.hasNext()) {
                        androidx.constraintlayout.motion.widget.c next3 = it3.next();
                        int i13 = next3.f1494b;
                        if (i13 != 1 ? !(i13 != i12 ? !(i13 == 3 && action == 0) : action != 1) : action == 0) {
                            Iterator<View> it4 = dVar.f1526c.iterator();
                            while (it4.hasNext()) {
                                View next4 = it4.next();
                                if (next3.c(next4)) {
                                    next4.getHitRect(rect);
                                    if (rect.contains((int) x10, (int) y)) {
                                        cVar = next3;
                                        next3.a(dVar, dVar.f1524a, currentState, E, next4);
                                    } else {
                                        cVar = next3;
                                    }
                                    next3 = cVar;
                                    i12 = 2;
                                }
                            }
                        }
                    }
                }
            }
            a.b bVar2 = this.I.f1435c;
            if (bVar2 != null && (!bVar2.f1463o) && (bVar = bVar2.f1461l) != null && ((motionEvent.getAction() != 0 || (b10 = bVar.b(this, new RectF())) == null || b10.contains(motionEvent.getX(), motionEvent.getY())) && (i10 = bVar.f1473e) != -1)) {
                View view = this.V0;
                if (view == null || view.getId() != i10) {
                    this.V0 = findViewById(i10);
                }
                View view2 = this.V0;
                if (view2 != null) {
                    this.U0.set(view2.getLeft(), this.V0.getTop(), this.V0.getRight(), this.V0.getBottom());
                    if (this.U0.contains(motionEvent.getX(), motionEvent.getY()) && !G(this.V0.getLeft(), this.V0.getTop(), this.V0, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.L0 = true;
        try {
            if (this.I == null) {
                super.onLayout(z10, i10, i11, i12, i13);
                this.L0 = false;
                return;
            }
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (this.f1386l0 != i14 || this.f1387m0 != i15) {
                K();
                A(true);
            }
            this.f1386l0 = i14;
            this.f1387m0 = i15;
            this.L0 = false;
        } catch (Throwable th) {
            this.L0 = false;
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
        if (((r6 == r8.f1424e && r7 == r8.f1425f) ? false : true) != false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.a aVar = this.I;
        if (aVar != null) {
            boolean r10 = r();
            aVar.f1446p = r10;
            a.b bVar2 = aVar.f1435c;
            if (bVar2 == null || (bVar = bVar2.f1461l) == null) {
                return;
            }
            bVar.c(r10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0865 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r34) {
        /*
            Method dump skipped, instructions count: 2156
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.w0 == null) {
                this.w0 = new CopyOnWriteArrayList<>();
            }
            this.w0.add(motionHelper);
            if (motionHelper.y) {
                if (this.f1394t0 == null) {
                    this.f1394t0 = new ArrayList<>();
                }
                this.f1394t0.add(motionHelper);
            }
            if (motionHelper.f1374z) {
                if (this.f1395u0 == null) {
                    this.f1395u0 = new ArrayList<>();
                }
                this.f1395u0.add(motionHelper);
            }
            if (motionHelper instanceof MotionEffect) {
                if (this.f1396v0 == null) {
                    this.f1396v0 = new ArrayList<>();
                }
                this.f1396v0.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f1394t0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f1395u0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        androidx.constraintlayout.motion.widget.a aVar;
        a.b bVar;
        if (!this.C0 && this.N == -1 && (aVar = this.I) != null && (bVar = aVar.f1435c) != null) {
            int i10 = bVar.f1465q;
            if (i10 == 0) {
                return;
            }
            if (i10 == 2) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.S.get(getChildAt(i11)).d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void s(int i10) {
        this.A = null;
    }

    public void setDebugMode(int i10) {
        this.f1380f0 = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.Q0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.R = z10;
    }

    public void setInterpolatedProgress(float f10) {
        if (this.I != null) {
            setState(TransitionState.MOVING);
            Interpolator f11 = this.I.f();
            if (f11 != null) {
                setProgress(f11.getInterpolation(f10));
                return;
            }
        }
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<MotionHelper> arrayList = this.f1395u0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f1395u0.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<MotionHelper> arrayList = this.f1394t0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f1394t0.get(i10).setProgress(f10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setProgress(float r11) {
        /*
            Method dump skipped, instructions count: 179
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.setProgress(float):void");
    }

    public void setScene(androidx.constraintlayout.motion.widget.a aVar) {
        androidx.constraintlayout.motion.widget.b bVar;
        this.I = aVar;
        boolean r10 = r();
        aVar.f1446p = r10;
        a.b bVar2 = aVar.f1435c;
        if (bVar2 != null && (bVar = bVar2.f1461l) != null) {
            bVar.c(r10);
        }
        K();
    }

    public void setStartState(int i10) {
        if (isAttachedToWindow()) {
            this.N = i10;
            return;
        }
        if (this.M0 == null) {
            this.M0 = new h();
        }
        h hVar = this.M0;
        hVar.f1431c = i10;
        hVar.d = i10;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState == transitionState2 && this.N == -1) {
            return;
        }
        TransitionState transitionState3 = this.R0;
        this.R0 = transitionState;
        TransitionState transitionState4 = TransitionState.MOVING;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            B();
        }
        int ordinal = transitionState3.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 && transitionState == transitionState2) {
                C();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            B();
        }
        if (transitionState == transitionState2) {
            C();
        }
    }

    public void setTransition(int i10) {
        if (this.I != null) {
            a.b F = F(i10);
            this.M = F.d;
            this.O = F.f1453c;
            if (!isAttachedToWindow()) {
                if (this.M0 == null) {
                    this.M0 = new h();
                }
                h hVar = this.M0;
                hVar.f1431c = this.M;
                hVar.d = this.O;
                return;
            }
            float f10 = Float.NaN;
            int i11 = this.N;
            if (i11 == this.M) {
                f10 = 0.0f;
            } else if (i11 == this.O) {
                f10 = 1.0f;
            }
            androidx.constraintlayout.motion.widget.a aVar = this.I;
            aVar.f1435c = F;
            androidx.constraintlayout.motion.widget.b bVar = F.f1461l;
            if (bVar != null) {
                bVar.c(aVar.f1446p);
            }
            this.S0.e(this.I.b(this.M), this.I.b(this.O));
            K();
            if (this.W != f10) {
                if (f10 == 0.0f) {
                    z(true);
                    this.I.b(this.M).c(this, true);
                    setConstraintSet(null);
                    requestLayout();
                } else if (f10 == 1.0f) {
                    z(false);
                    this.I.b(this.O).c(this, true);
                    setConstraintSet(null);
                    requestLayout();
                }
            }
            this.W = Float.isNaN(f10) ? 0.0f : f10;
            if (!Float.isNaN(f10)) {
                setProgress(f10);
                return;
            }
            Log.v("MotionLayout", w.a.b() + " transitionToStart ");
            y(0.0f);
        }
    }

    public void setTransition(a.b bVar) {
        androidx.constraintlayout.motion.widget.b bVar2;
        androidx.constraintlayout.motion.widget.a aVar = this.I;
        aVar.f1435c = bVar;
        if (bVar != null && (bVar2 = bVar.f1461l) != null) {
            bVar2.c(aVar.f1446p);
        }
        setState(TransitionState.SETUP);
        if (this.N == this.I.d()) {
            this.W = 1.0f;
            this.V = 1.0f;
            this.f1376b0 = 1.0f;
        } else {
            this.W = 0.0f;
            this.V = 0.0f;
            this.f1376b0 = 0.0f;
        }
        this.f1375a0 = bVar.a(1) ? -1L : getNanoTime();
        int i10 = this.I.i();
        int d10 = this.I.d();
        if (i10 == this.M && d10 == this.O) {
            return;
        }
        this.M = i10;
        this.O = d10;
        this.I.o(i10, d10);
        this.S0.e(this.I.b(this.M), this.I.b(this.O));
        e eVar = this.S0;
        int i11 = this.M;
        int i12 = this.O;
        eVar.f1424e = i11;
        eVar.f1425f = i12;
        eVar.f();
        K();
    }

    public void setTransitionDuration(int i10) {
        androidx.constraintlayout.motion.widget.a aVar = this.I;
        if (aVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        a.b bVar = aVar.f1435c;
        if (bVar != null) {
            bVar.f1457h = Math.max(i10, 8);
        } else {
            aVar.f1441j = i10;
        }
    }

    public void setTransitionListener(i iVar) {
        this.f1379e0 = iVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.M0 == null) {
            this.M0 = new h();
        }
        h hVar = this.M0;
        Objects.requireNonNull(hVar);
        hVar.f1429a = bundle.getFloat("motion.progress");
        hVar.f1430b = bundle.getFloat("motion.velocity");
        hVar.f1431c = bundle.getInt("motion.StartState");
        hVar.d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.M0.a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return w.a.c(context, this.M) + "->" + w.a.c(context, this.O) + " (pos:" + this.W + " Dpos/Dt:" + this.L;
    }

    public void y(float f10) {
        androidx.constraintlayout.motion.widget.a aVar = this.I;
        if (aVar == null) {
            return;
        }
        float f11 = this.W;
        float f12 = this.V;
        if (f11 != f12 && this.f1377c0) {
            this.W = f12;
        }
        float f13 = this.W;
        if (f13 == f10) {
            return;
        }
        this.f1382h0 = false;
        this.f1376b0 = f10;
        this.U = aVar.c() / 1000.0f;
        setProgress(this.f1376b0);
        this.J = null;
        this.K = this.I.f();
        this.f1377c0 = false;
        this.T = getNanoTime();
        this.f1378d0 = true;
        this.V = f13;
        this.W = f13;
        invalidate();
    }

    public void z(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            n nVar = this.S.get(getChildAt(i10));
            if (nVar != null && "button".equals(w.a.d(nVar.f16327b)) && nVar.A != null) {
                int i11 = 0;
                while (true) {
                    k[] kVarArr = nVar.A;
                    if (i11 < kVarArr.length) {
                        kVarArr[i11].i(z10 ? -100.0f : 100.0f, nVar.f16327b);
                        i11++;
                    }
                }
            }
        }
    }
}
