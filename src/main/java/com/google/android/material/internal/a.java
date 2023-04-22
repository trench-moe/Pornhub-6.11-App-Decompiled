package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import java.util.WeakHashMap;
import l0.d;
import n0.a0;
import n0.x;
import za.a;

/* loaded from: classes.dex */
public final class a {
    public za.a A;
    public za.a B;
    public CharSequence C;
    public CharSequence D;
    public boolean E;
    public Bitmap G;
    public float H;
    public float I;
    public int[] J;
    public boolean K;
    public final TextPaint L;
    public final TextPaint M;
    public TimeInterpolator N;
    public TimeInterpolator O;
    public float P;
    public float Q;
    public float R;
    public ColorStateList S;
    public float T;
    public float U;
    public float V;
    public ColorStateList W;
    public float X;
    public float Y;
    public StaticLayout Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f7541a;

    /* renamed from: a0  reason: collision with root package name */
    public float f7542a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7543b;

    /* renamed from: b0  reason: collision with root package name */
    public float f7544b0;

    /* renamed from: c  reason: collision with root package name */
    public float f7545c;

    /* renamed from: c0  reason: collision with root package name */
    public float f7546c0;
    public boolean d;

    /* renamed from: d0  reason: collision with root package name */
    public float f7547d0;

    /* renamed from: e  reason: collision with root package name */
    public float f7548e;

    /* renamed from: e0  reason: collision with root package name */
    public CharSequence f7549e0;

    /* renamed from: f  reason: collision with root package name */
    public float f7550f;

    /* renamed from: g  reason: collision with root package name */
    public int f7552g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f7554h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f7556i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f7558j;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f7562o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f7563p;

    /* renamed from: q  reason: collision with root package name */
    public int f7564q;

    /* renamed from: r  reason: collision with root package name */
    public float f7565r;

    /* renamed from: s  reason: collision with root package name */
    public float f7566s;

    /* renamed from: t  reason: collision with root package name */
    public float f7567t;

    /* renamed from: u  reason: collision with root package name */
    public float f7568u;

    /* renamed from: v  reason: collision with root package name */
    public float f7569v;

    /* renamed from: w  reason: collision with root package name */
    public float f7570w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f7571x;
    public Typeface y;

    /* renamed from: z  reason: collision with root package name */
    public Typeface f7572z;

    /* renamed from: k  reason: collision with root package name */
    public int f7559k = 16;

    /* renamed from: l  reason: collision with root package name */
    public int f7560l = 16;

    /* renamed from: m  reason: collision with root package name */
    public float f7561m = 15.0f;
    public float n = 15.0f;
    public boolean F = true;

    /* renamed from: f0  reason: collision with root package name */
    public int f7551f0 = 1;

    /* renamed from: g0  reason: collision with root package name */
    public float f7553g0 = 0.0f;

    /* renamed from: h0  reason: collision with root package name */
    public float f7555h0 = 1.0f;

    /* renamed from: i0  reason: collision with root package name */
    public int f7557i0 = StaticLayoutBuilderCompat.f7526m;

    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0094a implements a.InterfaceC0320a {
        public C0094a() {
        }

        @Override // za.a.InterfaceC0320a
        public void a(Typeface typeface) {
            a.this.q(typeface);
        }
    }

    /* loaded from: classes.dex */
    public class b implements a.InterfaceC0320a {
        public b() {
        }

        @Override // za.a.InterfaceC0320a
        public void a(Typeface typeface) {
            a.this.u(typeface);
        }
    }

    public a(View view) {
        this.f7541a = view;
        TextPaint textPaint = new TextPaint(129);
        this.L = textPaint;
        this.M = new TextPaint(textPaint);
        this.f7556i = new Rect();
        this.f7554h = new Rect();
        this.f7558j = new RectF();
        float f10 = this.f7548e;
        this.f7550f = a0.a.b(1.0f, f10, 0.5f, f10);
    }

    public static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), (int) ((Color.red(i11) * f10) + (Color.red(i10) * f11)), (int) ((Color.green(i11) * f10) + (Color.green(i10) * f11)), (int) ((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static float j(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return ga.a.a(f10, f11, f12);
    }

    public static boolean m(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    public void A(Typeface typeface) {
        boolean z10;
        za.a aVar = this.B;
        boolean z11 = true;
        if (aVar != null) {
            aVar.f21919c = true;
        }
        if (this.f7571x != typeface) {
            this.f7571x = typeface;
            z10 = true;
        } else {
            z10 = false;
        }
        za.a aVar2 = this.A;
        if (aVar2 != null) {
            aVar2.f21919c = true;
        }
        if (this.y != typeface) {
            this.y = typeface;
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            return;
        }
        l(false);
    }

    public final boolean B() {
        return this.f7551f0 > 1 && (!this.E || this.d);
    }

    public final boolean b(CharSequence charSequence) {
        View view = this.f7541a;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        boolean z10 = true;
        if (x.e.d(view) != 1) {
            z10 = false;
        }
        if (this.F) {
            z10 = ((d.c) (z10 ? d.d : d.f12171c)).b(charSequence, 0, charSequence.length());
        }
        return z10;
    }

    public final void c(float f10) {
        float f11;
        if (this.d) {
            this.f7558j.set(f10 < this.f7550f ? this.f7554h : this.f7556i);
        } else {
            this.f7558j.left = j(this.f7554h.left, this.f7556i.left, f10, this.N);
            this.f7558j.top = j(this.f7565r, this.f7566s, f10, this.N);
            this.f7558j.right = j(this.f7554h.right, this.f7556i.right, f10, this.N);
            this.f7558j.bottom = j(this.f7554h.bottom, this.f7556i.bottom, f10, this.N);
        }
        if (!this.d) {
            this.f7569v = j(this.f7567t, this.f7568u, f10, this.N);
            this.f7570w = j(this.f7565r, this.f7566s, f10, this.N);
            w(j(this.f7561m, this.n, f10, this.O));
            f11 = f10;
        } else if (f10 < this.f7550f) {
            this.f7569v = this.f7567t;
            this.f7570w = this.f7565r;
            w(this.f7561m);
            f11 = 0.0f;
        } else {
            this.f7569v = this.f7568u;
            this.f7570w = this.f7566s - Math.max(0, this.f7552g);
            w(this.n);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = ga.a.f9887b;
        this.f7544b0 = 1.0f - j(0.0f, 1.0f, 1.0f - f10, timeInterpolator);
        View view = this.f7541a;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.k(view);
        this.f7546c0 = j(1.0f, 0.0f, f10, timeInterpolator);
        x.d.k(this.f7541a);
        ColorStateList colorStateList = this.f7563p;
        ColorStateList colorStateList2 = this.f7562o;
        if (colorStateList != colorStateList2) {
            this.L.setColor(a(i(colorStateList2), h(), f11));
        } else {
            this.L.setColor(h());
        }
        float f12 = this.X;
        float f13 = this.Y;
        if (f12 != f13) {
            this.L.setLetterSpacing(j(f13, f12, f10, timeInterpolator));
        } else {
            this.L.setLetterSpacing(f12);
        }
        this.L.setShadowLayer(j(this.T, this.P, f10, null), j(this.U, this.Q, f10, null), j(this.V, this.R, f10, null), a(i(this.W), i(this.S), f10));
        if (this.d) {
            int alpha = this.L.getAlpha();
            float f14 = this.f7550f;
            this.L.setAlpha((int) ((f10 <= f14 ? ga.a.b(1.0f, 0.0f, this.f7548e, f14, f10) : ga.a.b(0.0f, 1.0f, f14, 1.0f, f10)) * alpha));
        }
        x.d.k(this.f7541a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:6|(1:8)(1:67)|9|(2:11|(1:13)(1:47))(9:48|(1:50)(1:66)|51|(1:53)(1:65)|(1:55)(1:64)|56|(2:63|60)|59|60)|14|(4:16|(2:23|24)|25|24)|26|(4:28|(1:30)|31|32)|33|(1:35)(1:46)|36|(1:38)|39|40|41|42|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012c, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012d, code lost:
        android.util.Log.e("CollapsingTextHelper", r13.getCause().getMessage(), r13);
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(float r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.d(float, boolean):void");
    }

    public final void e() {
        Bitmap bitmap = this.G;
        if (bitmap != null) {
            bitmap.recycle();
            this.G = null;
        }
    }

    public void f(Canvas canvas) {
        int save = canvas.save();
        if (this.D != null && this.f7543b) {
            float lineStart = (this.f7569v + (this.f7551f0 > 1 ? this.Z.getLineStart(0) : this.Z.getLineLeft(0))) - (this.f7547d0 * 2.0f);
            this.L.setTextSize(this.I);
            float f10 = this.f7569v;
            float f11 = this.f7570w;
            float f12 = this.H;
            if (f12 != 1.0f && !this.d) {
                canvas.scale(f12, f12, f10, f11);
            }
            if (!B() || (this.d && this.f7545c <= this.f7550f)) {
                canvas.translate(f10, f11);
                this.Z.draw(canvas);
            } else {
                int alpha = this.L.getAlpha();
                canvas.translate(lineStart, f11);
                float f13 = alpha;
                this.L.setAlpha((int) (this.f7546c0 * f13));
                this.Z.draw(canvas);
                this.L.setAlpha((int) (this.f7544b0 * f13));
                int lineBaseline = this.Z.getLineBaseline(0);
                CharSequence charSequence = this.f7549e0;
                float f14 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f14, this.L);
                if (!this.d) {
                    String trim = this.f7549e0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    this.L.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.Z.getLineEnd(0), str.length()), 0.0f, f14, (Paint) this.L);
                }
            }
            canvas.restoreToCount(save);
        }
    }

    public float g() {
        TextPaint textPaint = this.M;
        textPaint.setTextSize(this.n);
        textPaint.setTypeface(this.f7571x);
        textPaint.setLetterSpacing(this.X);
        return -this.M.ascent();
    }

    public int h() {
        return i(this.f7563p);
    }

    public final int i(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.J;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public void k() {
        this.f7543b = this.f7556i.width() > 0 && this.f7556i.height() > 0 && this.f7554h.width() > 0 && this.f7554h.height() > 0;
    }

    public void l(boolean z10) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if ((this.f7541a.getHeight() > 0 && this.f7541a.getWidth() > 0) || z10) {
            float f10 = this.I;
            d(this.n, z10);
            CharSequence charSequence = this.D;
            if (charSequence != null && (staticLayout2 = this.Z) != null) {
                this.f7549e0 = TextUtils.ellipsize(charSequence, this.L, staticLayout2.getWidth(), TextUtils.TruncateAt.END);
            }
            if (this.f7549e0 != null) {
                TextPaint textPaint = new TextPaint(this.L);
                textPaint.setLetterSpacing(this.X);
                CharSequence charSequence2 = this.f7549e0;
                this.f7542a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.f7542a0 = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f7560l, this.E ? 1 : 0);
            int i10 = absoluteGravity & 112;
            if (i10 == 48) {
                this.f7566s = this.f7556i.top;
            } else if (i10 != 80) {
                this.f7566s = this.f7556i.centerY() - ((this.L.descent() - this.L.ascent()) / 2.0f);
            } else {
                this.f7566s = this.L.ascent() + this.f7556i.bottom;
            }
            int i11 = absoluteGravity & 8388615;
            if (i11 == 1) {
                this.f7568u = this.f7556i.centerX() - (this.f7542a0 / 2.0f);
            } else if (i11 != 5) {
                this.f7568u = this.f7556i.left;
            } else {
                this.f7568u = this.f7556i.right - this.f7542a0;
            }
            d(this.f7561m, z10);
            float height = this.Z != null ? staticLayout.getHeight() : 0.0f;
            StaticLayout staticLayout3 = this.Z;
            this.f7564q = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
            CharSequence charSequence3 = this.D;
            float measureText = charSequence3 != null ? this.L.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
            StaticLayout staticLayout4 = this.Z;
            if (staticLayout4 != null && this.f7551f0 > 1) {
                measureText = staticLayout4.getWidth();
            }
            StaticLayout staticLayout5 = this.Z;
            this.f7547d0 = staticLayout5 != null ? this.f7551f0 > 1 ? staticLayout5.getLineStart(0) : staticLayout5.getLineLeft(0) : 0.0f;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f7559k, this.E ? 1 : 0);
            int i12 = absoluteGravity2 & 112;
            if (i12 == 48) {
                this.f7565r = this.f7554h.top;
            } else if (i12 != 80) {
                this.f7565r = this.f7554h.centerY() - (height / 2.0f);
            } else {
                this.f7565r = this.L.descent() + (this.f7554h.bottom - height);
            }
            int i13 = absoluteGravity2 & 8388615;
            if (i13 == 1) {
                this.f7567t = this.f7554h.centerX() - (measureText / 2.0f);
            } else if (i13 != 5) {
                this.f7567t = this.f7554h.left;
            } else {
                this.f7567t = this.f7554h.right - measureText;
            }
            e();
            w(f10);
            c(this.f7545c);
        }
    }

    public void n(int i10) {
        za.d dVar = new za.d(this.f7541a.getContext(), i10);
        ColorStateList colorStateList = dVar.f21928j;
        if (colorStateList != null) {
            this.f7563p = colorStateList;
        }
        float f10 = dVar.f21929k;
        if (f10 != 0.0f) {
            this.n = f10;
        }
        ColorStateList colorStateList2 = dVar.f21920a;
        if (colorStateList2 != null) {
            this.S = colorStateList2;
        }
        this.Q = dVar.f21923e;
        this.R = dVar.f21924f;
        this.P = dVar.f21925g;
        this.X = dVar.f21927i;
        za.a aVar = this.B;
        if (aVar != null) {
            aVar.f21919c = true;
        }
        C0094a c0094a = new C0094a();
        dVar.a();
        this.B = new za.a(c0094a, dVar.n);
        dVar.c(this.f7541a.getContext(), this.B);
        l(false);
    }

    public void o(ColorStateList colorStateList) {
        if (this.f7563p != colorStateList) {
            this.f7563p = colorStateList;
            l(false);
        }
    }

    public void p(int i10) {
        if (this.f7560l != i10) {
            this.f7560l = i10;
            l(false);
        }
    }

    public void q(Typeface typeface) {
        za.a aVar = this.B;
        boolean z10 = true;
        if (aVar != null) {
            aVar.f21919c = true;
        }
        if (this.f7571x != typeface) {
            this.f7571x = typeface;
        } else {
            z10 = false;
        }
        if (z10) {
            l(false);
        }
    }

    public void r(int i10) {
        za.d dVar = new za.d(this.f7541a.getContext(), i10);
        ColorStateList colorStateList = dVar.f21928j;
        if (colorStateList != null) {
            this.f7562o = colorStateList;
        }
        float f10 = dVar.f21929k;
        if (f10 != 0.0f) {
            this.f7561m = f10;
        }
        ColorStateList colorStateList2 = dVar.f21920a;
        if (colorStateList2 != null) {
            this.W = colorStateList2;
        }
        this.U = dVar.f21923e;
        this.V = dVar.f21924f;
        this.T = dVar.f21925g;
        this.Y = dVar.f21927i;
        za.a aVar = this.A;
        if (aVar != null) {
            aVar.f21919c = true;
        }
        b bVar = new b();
        dVar.a();
        this.A = new za.a(bVar, dVar.n);
        dVar.c(this.f7541a.getContext(), this.A);
        l(false);
    }

    public void s(ColorStateList colorStateList) {
        if (this.f7562o != colorStateList) {
            this.f7562o = colorStateList;
            l(false);
        }
    }

    public void t(int i10) {
        if (this.f7559k != i10) {
            this.f7559k = i10;
            l(false);
        }
    }

    public void u(Typeface typeface) {
        za.a aVar = this.A;
        boolean z10 = true;
        if (aVar != null) {
            aVar.f21919c = true;
        }
        if (this.y != typeface) {
            this.y = typeface;
        } else {
            z10 = false;
        }
        if (z10) {
            l(false);
        }
    }

    public void v(float f10) {
        float e10 = t3.a.e(f10, 0.0f, 1.0f);
        if (e10 != this.f7545c) {
            this.f7545c = e10;
            c(e10);
        }
    }

    public final void w(float f10) {
        d(f10, false);
        View view = this.f7541a;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.k(view);
    }

    public void x(TimeInterpolator timeInterpolator) {
        this.N = timeInterpolator;
        l(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean y(int[] r7) {
        /*
            r6 = this;
            r6.J = r7
            android.content.res.ColorStateList r7 = r6.f7563p
            r3 = 4
            r0 = 1
            r4 = 5
            r2 = 0
            r1 = r2
            if (r7 == 0) goto L12
            r4 = 6
            boolean r7 = r7.isStateful()
            if (r7 != 0) goto L20
        L12:
            r4 = 2
            android.content.res.ColorStateList r7 = r6.f7562o
            if (r7 == 0) goto L23
            r4 = 6
            boolean r2 = r7.isStateful()
            r7 = r2
            if (r7 == 0) goto L23
            r5 = 2
        L20:
            r4 = 6
            r7 = 1
            goto L25
        L23:
            r2 = 0
            r7 = r2
        L25:
            if (r7 == 0) goto L2c
            r6.l(r1)
            r3 = 4
            return r0
        L2c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.y(int[]):boolean");
    }

    public void z(CharSequence charSequence) {
        if (charSequence != null) {
            if (!TextUtils.equals(this.C, charSequence)) {
            }
        }
        this.C = charSequence;
        this.D = null;
        e();
        l(false);
    }
}
