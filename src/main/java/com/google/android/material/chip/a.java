package com.google.android.material.chip;

import ab.b;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import cb.g;
import com.appsflyer.oaid.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.KotlinVersion;
import ua.g;
import ua.n;
import za.d;

/* loaded from: classes.dex */
public class a extends g implements Drawable.Callback, g.b {
    public static final int[] Y0 = {16842910};
    public static final ShapeDrawable Z0 = new ShapeDrawable(new OvalShape());
    public final PointF A0;
    public final Path B0;
    public final ua.g C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public boolean J0;
    public int K0;
    public int L0;
    public ColorFilter M0;
    public PorterDuffColorFilter N0;
    public ColorStateList O0;
    public ColorStateList P;
    public PorterDuff.Mode P0;
    public ColorStateList Q;
    public int[] Q0;
    public float R;
    public boolean R0;
    public float S;
    public ColorStateList S0;
    public ColorStateList T;
    public WeakReference<InterfaceC0090a> T0;
    public float U;
    public TextUtils.TruncateAt U0;
    public ColorStateList V;
    public boolean V0;
    public CharSequence W;
    public int W0;
    public boolean X;
    public boolean X0;
    public Drawable Y;
    public ColorStateList Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f7292a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f7293b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f7294c0;

    /* renamed from: d0  reason: collision with root package name */
    public Drawable f7295d0;

    /* renamed from: e0  reason: collision with root package name */
    public Drawable f7296e0;

    /* renamed from: f0  reason: collision with root package name */
    public ColorStateList f7297f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f7298g0;

    /* renamed from: h0  reason: collision with root package name */
    public CharSequence f7299h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f7300i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f7301j0;

    /* renamed from: k0  reason: collision with root package name */
    public Drawable f7302k0;

    /* renamed from: l0  reason: collision with root package name */
    public ColorStateList f7303l0;

    /* renamed from: m0  reason: collision with root package name */
    public ga.g f7304m0;

    /* renamed from: n0  reason: collision with root package name */
    public ga.g f7305n0;

    /* renamed from: o0  reason: collision with root package name */
    public float f7306o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f7307p0;

    /* renamed from: q0  reason: collision with root package name */
    public float f7308q0;

    /* renamed from: r0  reason: collision with root package name */
    public float f7309r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f7310s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f7311t0;

    /* renamed from: u0  reason: collision with root package name */
    public float f7312u0;

    /* renamed from: v0  reason: collision with root package name */
    public float f7313v0;
    public final Context w0;

    /* renamed from: x0  reason: collision with root package name */
    public final Paint f7314x0;

    /* renamed from: y0  reason: collision with root package name */
    public final Paint.FontMetrics f7315y0;

    /* renamed from: z0  reason: collision with root package name */
    public final RectF f7316z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0090a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.S = -1.0f;
        this.f7314x0 = new Paint(1);
        this.f7315y0 = new Paint.FontMetrics();
        this.f7316z0 = new RectF();
        this.A0 = new PointF();
        this.B0 = new Path();
        this.L0 = KotlinVersion.MAX_COMPONENT_VALUE;
        this.P0 = PorterDuff.Mode.SRC_IN;
        this.T0 = new WeakReference<>(null);
        this.f3929c.f3939b = new ra.a(context);
        C();
        this.w0 = context;
        ua.g gVar = new ua.g(this);
        this.C0 = gVar;
        this.W = BuildConfig.FLAVOR;
        gVar.f15809a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = Y0;
        setState(iArr);
        j0(iArr);
        this.V0 = true;
        int[] iArr2 = b.f340a;
        Z0.setTint(-1);
    }

    public static boolean M(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean N(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void D(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        f0.a.c(drawable, f0.a.b(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f7295d0) {
            if (drawable.isStateful()) {
                drawable.setState(this.Q0);
            }
            drawable.setTintList(this.f7297f0);
            return;
        }
        Drawable drawable2 = this.Y;
        if (drawable == drawable2 && this.f7293b0) {
            drawable2.setTintList(this.Z);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void E(Rect rect, RectF rectF) {
        float f10;
        rectF.setEmpty();
        if (u0() || t0()) {
            float f11 = this.f7306o0 + this.f7307p0;
            float L = L();
            if (f0.a.b(this) == 0) {
                float f12 = rect.left + f11;
                rectF.left = f12;
                rectF.right = f12 + L;
            } else {
                float f13 = rect.right - f11;
                rectF.right = f13;
                rectF.left = f13 - L;
            }
            Drawable drawable = this.J0 ? this.f7302k0 : this.Y;
            float f14 = this.f7292a0;
            if (f14 <= 0.0f && drawable != null) {
                f14 = (float) Math.ceil(n.b(this.w0, 24));
                if (drawable.getIntrinsicHeight() <= f14) {
                    f10 = drawable.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f10 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f10;
                }
            }
            f10 = f14;
            float exactCenterY2 = rect.exactCenterY() - (f10 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f10;
        }
    }

    public float F() {
        if (!u0() && !t0()) {
            return 0.0f;
        }
        return L() + this.f7307p0 + this.f7308q0;
    }

    public final void G(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (v0()) {
            float f10 = this.f7313v0 + this.f7312u0;
            if (f0.a.b(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f7298g0;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f7298g0;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.f7298g0;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    public final void H(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (v0()) {
            float f10 = this.f7313v0 + this.f7312u0 + this.f7298g0 + this.f7311t0 + this.f7310s0;
            if (f0.a.b(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public float I() {
        if (v0()) {
            return this.f7311t0 + this.f7298g0 + this.f7312u0;
        }
        return 0.0f;
    }

    public float J() {
        return this.X0 ? m() : this.S;
    }

    public Drawable K() {
        Drawable drawable = this.f7295d0;
        if (drawable != null) {
            return f0.a.g(drawable);
        }
        return null;
    }

    public final float L() {
        Drawable drawable = this.J0 ? this.f7302k0 : this.Y;
        float f10 = this.f7292a0;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    public void O() {
        InterfaceC0090a interfaceC0090a = this.T0.get();
        if (interfaceC0090a != null) {
            interfaceC0090a.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean P(int[] r12, int[] r13) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.P(int[], int[]):boolean");
    }

    public void Q(boolean z10) {
        if (this.f7300i0 != z10) {
            this.f7300i0 = z10;
            float F = F();
            if (!z10 && this.J0) {
                this.J0 = false;
            }
            float F2 = F();
            invalidateSelf();
            if (F != F2) {
                O();
            }
        }
    }

    public void R(Drawable drawable) {
        if (this.f7302k0 != drawable) {
            float F = F();
            this.f7302k0 = drawable;
            float F2 = F();
            w0(this.f7302k0);
            D(this.f7302k0);
            invalidateSelf();
            if (F != F2) {
                O();
            }
        }
    }

    public void S(ColorStateList colorStateList) {
        if (this.f7303l0 != colorStateList) {
            this.f7303l0 = colorStateList;
            if (this.f7301j0 && this.f7302k0 != null && this.f7300i0) {
                this.f7302k0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void T(boolean z10) {
        if (this.f7301j0 != z10) {
            boolean t02 = t0();
            this.f7301j0 = z10;
            boolean t03 = t0();
            if (t02 != t03) {
                if (t03) {
                    D(this.f7302k0);
                } else {
                    w0(this.f7302k0);
                }
                invalidateSelf();
                O();
            }
        }
    }

    public void U(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    public void V(float f10) {
        if (this.S != f10) {
            this.S = f10;
            this.f3929c.f3938a = this.f3929c.f3938a.g(f10);
            invalidateSelf();
        }
    }

    public void W(float f10) {
        if (this.f7313v0 != f10) {
            this.f7313v0 = f10;
            invalidateSelf();
            O();
        }
    }

    public void X(Drawable drawable) {
        Drawable drawable2 = this.Y;
        Drawable g10 = drawable2 != null ? f0.a.g(drawable2) : null;
        if (g10 != drawable) {
            float F = F();
            this.Y = drawable != null ? f0.a.h(drawable).mutate() : null;
            float F2 = F();
            w0(g10);
            if (u0()) {
                D(this.Y);
            }
            invalidateSelf();
            if (F != F2) {
                O();
            }
        }
    }

    public void Y(float f10) {
        if (this.f7292a0 != f10) {
            float F = F();
            this.f7292a0 = f10;
            float F2 = F();
            invalidateSelf();
            if (F != F2) {
                O();
            }
        }
    }

    public void Z(ColorStateList colorStateList) {
        this.f7293b0 = true;
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            if (u0()) {
                this.Y.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // ua.g.b
    public void a() {
        O();
        invalidateSelf();
    }

    public void a0(boolean z10) {
        if (this.X != z10) {
            boolean u02 = u0();
            this.X = z10;
            boolean u03 = u0();
            if (u02 != u03) {
                if (u03) {
                    D(this.Y);
                } else {
                    w0(this.Y);
                }
                invalidateSelf();
                O();
            }
        }
    }

    public void b0(float f10) {
        if (this.R != f10) {
            this.R = f10;
            invalidateSelf();
            O();
        }
    }

    public void c0(float f10) {
        if (this.f7306o0 != f10) {
            this.f7306o0 = f10;
            invalidateSelf();
            O();
        }
    }

    public void d0(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (this.X0) {
                y(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // cb.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i10 = this.L0) == 0) {
            return;
        }
        if (i10 < 255) {
            float f10 = bounds.left;
            float f11 = bounds.top;
            float f12 = bounds.right;
            float f13 = bounds.bottom;
            i11 = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f10, f11, f12, f13, i10) : canvas.saveLayerAlpha(f10, f11, f12, f13, i10, 31);
        } else {
            i11 = 0;
        }
        if (!this.X0) {
            this.f7314x0.setColor(this.D0);
            this.f7314x0.setStyle(Paint.Style.FILL);
            this.f7316z0.set(bounds);
            canvas.drawRoundRect(this.f7316z0, J(), J(), this.f7314x0);
        }
        if (!this.X0) {
            this.f7314x0.setColor(this.E0);
            this.f7314x0.setStyle(Paint.Style.FILL);
            Paint paint = this.f7314x0;
            ColorFilter colorFilter = this.M0;
            if (colorFilter == null) {
                colorFilter = this.N0;
            }
            paint.setColorFilter(colorFilter);
            this.f7316z0.set(bounds);
            canvas.drawRoundRect(this.f7316z0, J(), J(), this.f7314x0);
        }
        if (this.X0) {
            super.draw(canvas);
        }
        if (this.U > 0.0f && !this.X0) {
            this.f7314x0.setColor(this.G0);
            this.f7314x0.setStyle(Paint.Style.STROKE);
            if (!this.X0) {
                Paint paint2 = this.f7314x0;
                ColorFilter colorFilter2 = this.M0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.N0;
                }
                paint2.setColorFilter(colorFilter2);
            }
            RectF rectF = this.f7316z0;
            float f14 = this.U / 2.0f;
            rectF.set(bounds.left + f14, bounds.top + f14, bounds.right - f14, bounds.bottom - f14);
            float f15 = this.S - (this.U / 2.0f);
            canvas.drawRoundRect(this.f7316z0, f15, f15, this.f7314x0);
        }
        this.f7314x0.setColor(this.H0);
        this.f7314x0.setStyle(Paint.Style.FILL);
        this.f7316z0.set(bounds);
        if (this.X0) {
            c(new RectF(bounds), this.B0);
            i12 = 0;
            g(canvas, this.f7314x0, this.B0, this.f3929c.f3938a, i());
        } else {
            canvas.drawRoundRect(this.f7316z0, J(), J(), this.f7314x0);
            i12 = 0;
        }
        if (u0()) {
            E(bounds, this.f7316z0);
            RectF rectF2 = this.f7316z0;
            float f16 = rectF2.left;
            float f17 = rectF2.top;
            canvas.translate(f16, f17);
            this.Y.setBounds(i12, i12, (int) this.f7316z0.width(), (int) this.f7316z0.height());
            this.Y.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (t0()) {
            E(bounds, this.f7316z0);
            RectF rectF3 = this.f7316z0;
            float f18 = rectF3.left;
            float f19 = rectF3.top;
            canvas.translate(f18, f19);
            this.f7302k0.setBounds(i12, i12, (int) this.f7316z0.width(), (int) this.f7316z0.height());
            this.f7302k0.draw(canvas);
            canvas.translate(-f18, -f19);
        }
        if (!this.V0 || this.W == null) {
            i13 = i11;
            i14 = KotlinVersion.MAX_COMPONENT_VALUE;
            i15 = 0;
        } else {
            PointF pointF = this.A0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.W != null) {
                float F = F() + this.f7306o0 + this.f7309r0;
                if (f0.a.b(this) == 0) {
                    pointF.x = bounds.left + F;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - F;
                    align = Paint.Align.RIGHT;
                }
                this.C0.f15809a.getFontMetrics(this.f7315y0);
                Paint.FontMetrics fontMetrics = this.f7315y0;
                pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            RectF rectF4 = this.f7316z0;
            rectF4.setEmpty();
            if (this.W != null) {
                float F2 = F() + this.f7306o0 + this.f7309r0;
                float I = I() + this.f7313v0 + this.f7310s0;
                if (f0.a.b(this) == 0) {
                    rectF4.left = bounds.left + F2;
                    rectF4.right = bounds.right - I;
                } else {
                    rectF4.left = bounds.left + I;
                    rectF4.right = bounds.right - F2;
                }
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            ua.g gVar = this.C0;
            if (gVar.f15813f != null) {
                gVar.f15809a.drawableState = getState();
                ua.g gVar2 = this.C0;
                gVar2.f15813f.e(this.w0, gVar2.f15809a, gVar2.f15810b);
            }
            this.C0.f15809a.setTextAlign(align);
            boolean z10 = Math.round(this.C0.a(this.W.toString())) > Math.round(this.f7316z0.width());
            if (z10) {
                i16 = canvas.save();
                canvas.clipRect(this.f7316z0);
            } else {
                i16 = 0;
            }
            CharSequence charSequence = this.W;
            if (z10 && this.U0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.C0.f15809a, this.f7316z0.width(), this.U0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF2 = this.A0;
            float f20 = pointF2.x;
            float f21 = pointF2.y;
            TextPaint textPaint = this.C0.f15809a;
            i15 = 0;
            i14 = KotlinVersion.MAX_COMPONENT_VALUE;
            i13 = i11;
            canvas.drawText(charSequence2, 0, length, f20, f21, textPaint);
            if (z10) {
                canvas.restoreToCount(i16);
            }
        }
        if (v0()) {
            G(bounds, this.f7316z0);
            RectF rectF5 = this.f7316z0;
            float f22 = rectF5.left;
            float f23 = rectF5.top;
            canvas.translate(f22, f23);
            this.f7295d0.setBounds(i15, i15, (int) this.f7316z0.width(), (int) this.f7316z0.height());
            int[] iArr = b.f340a;
            this.f7296e0.setBounds(this.f7295d0.getBounds());
            this.f7296e0.jumpToCurrentState();
            this.f7296e0.draw(canvas);
            canvas.translate(-f22, -f23);
        }
        if (this.L0 < i14) {
            canvas.restoreToCount(i13);
        }
    }

    public void e0(float f10) {
        if (this.U != f10) {
            this.U = f10;
            this.f7314x0.setStrokeWidth(f10);
            if (this.X0) {
                this.f3929c.f3948l = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public void f0(Drawable drawable) {
        Drawable K = K();
        if (K != drawable) {
            float I = I();
            this.f7295d0 = drawable != null ? f0.a.h(drawable).mutate() : null;
            int[] iArr = b.f340a;
            this.f7296e0 = new RippleDrawable(b.c(this.V), this.f7295d0, Z0);
            float I2 = I();
            w0(K);
            if (v0()) {
                D(this.f7295d0);
            }
            invalidateSelf();
            if (I != I2) {
                O();
            }
        }
    }

    public void g0(float f10) {
        if (this.f7312u0 != f10) {
            this.f7312u0 = f10;
            invalidateSelf();
            if (v0()) {
                O();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.L0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.M0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.R;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(I() + this.C0.a(this.W.toString()) + F() + this.f7306o0 + this.f7309r0 + this.f7310s0 + this.f7313v0), this.W0);
    }

    @Override // cb.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // cb.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.X0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.R, this.S);
        } else {
            outline.setRoundRect(bounds, this.S);
        }
        outline.setAlpha(this.L0 / 255.0f);
    }

    public void h0(float f10) {
        if (this.f7298g0 != f10) {
            this.f7298g0 = f10;
            invalidateSelf();
            if (v0()) {
                O();
            }
        }
    }

    public void i0(float f10) {
        if (this.f7311t0 != f10) {
            this.f7311t0 = f10;
            invalidateSelf();
            if (v0()) {
                O();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // cb.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        boolean z10 = true;
        if (!M(this.P) && !M(this.Q) && !M(this.T) && (!this.R0 || !M(this.S0))) {
            d dVar = this.C0.f15813f;
            if (!((dVar == null || (colorStateList = dVar.f21928j) == null || !colorStateList.isStateful()) ? false : true)) {
                if (!(this.f7301j0 && this.f7302k0 != null && this.f7300i0) && !N(this.Y) && !N(this.f7302k0)) {
                    if (!M(this.O0)) {
                        z10 = false;
                    }
                    return z10;
                }
            }
        }
        return z10;
    }

    public boolean j0(int[] iArr) {
        if (!Arrays.equals(this.Q0, iArr)) {
            this.Q0 = iArr;
            if (v0()) {
                return P(getState(), iArr);
            }
        }
        return false;
    }

    public void k0(ColorStateList colorStateList) {
        if (this.f7297f0 != colorStateList) {
            this.f7297f0 = colorStateList;
            if (v0()) {
                this.f7295d0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void l0(boolean z10) {
        if (this.f7294c0 != z10) {
            boolean v02 = v0();
            this.f7294c0 = z10;
            boolean v03 = v0();
            if (v02 != v03) {
                if (v03) {
                    D(this.f7295d0);
                } else {
                    w0(this.f7295d0);
                }
                invalidateSelf();
                O();
            }
        }
    }

    public void m0(float f10) {
        if (this.f7308q0 != f10) {
            float F = F();
            this.f7308q0 = f10;
            float F2 = F();
            invalidateSelf();
            if (F != F2) {
                O();
            }
        }
    }

    public void n0(float f10) {
        if (this.f7307p0 != f10) {
            float F = F();
            this.f7307p0 = f10;
            float F2 = F();
            invalidateSelf();
            if (F != F2) {
                O();
            }
        }
    }

    public void o0(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            this.S0 = this.R0 ? b.c(colorStateList) : null;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (u0()) {
            onLayoutDirectionChanged |= f0.a.c(this.Y, i10);
        }
        if (t0()) {
            onLayoutDirectionChanged |= f0.a.c(this.f7302k0, i10);
        }
        if (v0()) {
            onLayoutDirectionChanged |= f0.a.c(this.f7295d0, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (u0()) {
            onLevelChange |= this.Y.setLevel(i10);
        }
        if (t0()) {
            onLevelChange |= this.f7302k0.setLevel(i10);
        }
        if (v0()) {
            onLevelChange |= this.f7295d0.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // cb.g, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.X0) {
            super.onStateChange(iArr);
        }
        return P(iArr, this.Q0);
    }

    public void p0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (TextUtils.equals(this.W, charSequence)) {
            return;
        }
        this.W = charSequence;
        this.C0.d = true;
        invalidateSelf();
        O();
    }

    public void q0(float f10) {
        if (this.f7310s0 != f10) {
            this.f7310s0 = f10;
            invalidateSelf();
            O();
        }
    }

    public void r0(float f10) {
        if (this.f7309r0 != f10) {
            this.f7309r0 = f10;
            invalidateSelf();
            O();
        }
    }

    public void s0(boolean z10) {
        if (this.R0 != z10) {
            this.R0 = z10;
            this.S0 = z10 ? b.c(this.V) : null;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // cb.g, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.L0 != i10) {
            this.L0 = i10;
            invalidateSelf();
        }
    }

    @Override // cb.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.M0 != colorFilter) {
            this.M0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // cb.g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.O0 != colorStateList) {
            this.O0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // cb.g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.P0 != mode) {
            this.P0 = mode;
            this.N0 = qa.a.a(this, this.O0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (u0()) {
            visible |= this.Y.setVisible(z10, z11);
        }
        if (t0()) {
            visible |= this.f7302k0.setVisible(z10, z11);
        }
        if (v0()) {
            visible |= this.f7295d0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final boolean t0() {
        return this.f7301j0 && this.f7302k0 != null && this.J0;
    }

    public final boolean u0() {
        return this.X && this.Y != null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean v0() {
        return this.f7294c0 && this.f7295d0 != null;
    }

    public final void w0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }
}
