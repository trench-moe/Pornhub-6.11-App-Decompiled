package cb;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import cb.l;
import cb.n;
import java.util.BitSet;
import java.util.Objects;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class g extends Drawable implements f0.d, o {
    public static final String N = g.class.getSimpleName();
    public static final Paint O;
    public final Region A;
    public final Region B;
    public k C;
    public final Paint D;
    public final Paint E;
    public final bb.a F;
    public final l.b G;
    public final l H;
    public PorterDuffColorFilter I;
    public PorterDuffColorFilter J;
    public int K;
    public final RectF L;
    public boolean M;

    /* renamed from: c  reason: collision with root package name */
    public b f3929c;

    /* renamed from: f  reason: collision with root package name */
    public final n.f[] f3930f;

    /* renamed from: j  reason: collision with root package name */
    public final n.f[] f3931j;

    /* renamed from: m  reason: collision with root package name */
    public final BitSet f3932m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public final Matrix f3933t;

    /* renamed from: u  reason: collision with root package name */
    public final Path f3934u;

    /* renamed from: w  reason: collision with root package name */
    public final Path f3935w;
    public final RectF y;

    /* renamed from: z  reason: collision with root package name */
    public final RectF f3936z;

    /* loaded from: classes.dex */
    public class a implements l.b {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public k f3938a;

        /* renamed from: b  reason: collision with root package name */
        public ra.a f3939b;

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f3940c;
        public ColorStateList d;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f3941e;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f3942f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f3943g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f3944h;

        /* renamed from: i  reason: collision with root package name */
        public Rect f3945i;

        /* renamed from: j  reason: collision with root package name */
        public float f3946j;

        /* renamed from: k  reason: collision with root package name */
        public float f3947k;

        /* renamed from: l  reason: collision with root package name */
        public float f3948l;

        /* renamed from: m  reason: collision with root package name */
        public int f3949m;
        public float n;

        /* renamed from: o  reason: collision with root package name */
        public float f3950o;

        /* renamed from: p  reason: collision with root package name */
        public float f3951p;

        /* renamed from: q  reason: collision with root package name */
        public int f3952q;

        /* renamed from: r  reason: collision with root package name */
        public int f3953r;

        /* renamed from: s  reason: collision with root package name */
        public int f3954s;

        /* renamed from: t  reason: collision with root package name */
        public int f3955t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f3956u;

        /* renamed from: v  reason: collision with root package name */
        public Paint.Style f3957v;

        public b(b bVar) {
            this.d = null;
            this.f3941e = null;
            this.f3942f = null;
            this.f3943g = null;
            this.f3944h = PorterDuff.Mode.SRC_IN;
            this.f3945i = null;
            this.f3946j = 1.0f;
            this.f3947k = 1.0f;
            this.f3949m = KotlinVersion.MAX_COMPONENT_VALUE;
            this.n = 0.0f;
            this.f3950o = 0.0f;
            this.f3951p = 0.0f;
            this.f3952q = 0;
            this.f3953r = 0;
            this.f3954s = 0;
            this.f3955t = 0;
            this.f3956u = false;
            this.f3957v = Paint.Style.FILL_AND_STROKE;
            this.f3938a = bVar.f3938a;
            this.f3939b = bVar.f3939b;
            this.f3948l = bVar.f3948l;
            this.f3940c = bVar.f3940c;
            this.d = bVar.d;
            this.f3941e = bVar.f3941e;
            this.f3944h = bVar.f3944h;
            this.f3943g = bVar.f3943g;
            this.f3949m = bVar.f3949m;
            this.f3946j = bVar.f3946j;
            this.f3954s = bVar.f3954s;
            this.f3952q = bVar.f3952q;
            this.f3956u = bVar.f3956u;
            this.f3947k = bVar.f3947k;
            this.n = bVar.n;
            this.f3950o = bVar.f3950o;
            this.f3951p = bVar.f3951p;
            this.f3953r = bVar.f3953r;
            this.f3955t = bVar.f3955t;
            this.f3942f = bVar.f3942f;
            this.f3957v = bVar.f3957v;
            if (bVar.f3945i != null) {
                this.f3945i = new Rect(bVar.f3945i);
            }
        }

        public b(k kVar, ra.a aVar) {
            this.d = null;
            this.f3941e = null;
            this.f3942f = null;
            this.f3943g = null;
            this.f3944h = PorterDuff.Mode.SRC_IN;
            this.f3945i = null;
            this.f3946j = 1.0f;
            this.f3947k = 1.0f;
            this.f3949m = KotlinVersion.MAX_COMPONENT_VALUE;
            this.n = 0.0f;
            this.f3950o = 0.0f;
            this.f3951p = 0.0f;
            this.f3952q = 0;
            this.f3953r = 0;
            this.f3954s = 0;
            this.f3955t = 0;
            this.f3956u = false;
            this.f3957v = Paint.Style.FILL_AND_STROKE;
            this.f3938a = kVar;
            this.f3939b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.n = true;
            return gVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        O = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.c(context, attributeSet, i10, i11).a());
    }

    public g(b bVar) {
        this.f3930f = new n.f[4];
        this.f3931j = new n.f[4];
        this.f3932m = new BitSet(8);
        this.f3933t = new Matrix();
        this.f3934u = new Path();
        this.f3935w = new Path();
        this.y = new RectF();
        this.f3936z = new RectF();
        this.A = new Region();
        this.B = new Region();
        Paint paint = new Paint(1);
        this.D = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new bb.a();
        this.H = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.a.f3993a : new l();
        this.L = new RectF();
        this.M = true;
        this.f3929c = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        B();
        A(getState());
        this.G = new a();
    }

    public g(k kVar) {
        this(new b(kVar, null));
    }

    public final boolean A(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f3929c.d == null || color2 == (colorForState2 = this.f3929c.d.getColorForState(iArr, (color2 = this.D.getColor())))) {
            z10 = false;
        } else {
            this.D.setColor(colorForState2);
            z10 = true;
        }
        if (this.f3929c.f3941e == null || color == (colorForState = this.f3929c.f3941e.getColorForState(iArr, (color = this.E.getColor())))) {
            return z10;
        }
        this.E.setColor(colorForState);
        return true;
    }

    public final boolean B() {
        PorterDuffColorFilter porterDuffColorFilter = this.I;
        PorterDuffColorFilter porterDuffColorFilter2 = this.J;
        b bVar = this.f3929c;
        boolean z10 = true;
        this.I = d(bVar.f3943g, bVar.f3944h, this.D, true);
        b bVar2 = this.f3929c;
        this.J = d(bVar2.f3942f, bVar2.f3944h, this.E, false);
        b bVar3 = this.f3929c;
        if (bVar3.f3956u) {
            this.F.a(bVar3.f3943g.getColorForState(getState(), 0));
        }
        if (Objects.equals(porterDuffColorFilter, this.I)) {
            if (!Objects.equals(porterDuffColorFilter2, this.J)) {
                return z10;
            }
            z10 = false;
        }
        return z10;
    }

    public final void C() {
        b bVar = this.f3929c;
        float f10 = bVar.f3950o + bVar.f3951p;
        bVar.f3953r = (int) Math.ceil(0.75f * f10);
        this.f3929c.f3954s = (int) Math.ceil(f10 * 0.25f);
        B();
        super.invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        c(rectF, path);
        if (this.f3929c.f3946j != 1.0f) {
            this.f3933t.reset();
            Matrix matrix = this.f3933t;
            float f10 = this.f3929c.f3946j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f3933t);
        }
        path.computeBounds(this.L, true);
    }

    public final void c(RectF rectF, Path path) {
        l lVar = this.H;
        b bVar = this.f3929c;
        lVar.b(bVar.f3938a, bVar.f3947k, rectF, this.G, path);
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z10) {
                colorForState = e(colorForState);
            }
            this.K = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z10) {
            int color = paint.getColor();
            int e10 = e(color);
            this.K = e10;
            if (e10 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(e10, PorterDuff.Mode.SRC_IN);
                return porterDuffColorFilter;
            }
        }
        porterDuffColorFilter = null;
        return porterDuffColorFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020f  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.g.draw(android.graphics.Canvas):void");
    }

    public int e(int i10) {
        b bVar = this.f3929c;
        float f10 = bVar.f3950o + bVar.f3951p + bVar.n;
        ra.a aVar = bVar.f3939b;
        return aVar != null ? aVar.a(i10, f10) : i10;
    }

    public final void f(Canvas canvas) {
        if (this.f3932m.cardinality() > 0) {
            Log.w(N, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f3929c.f3954s != 0) {
            canvas.drawPath(this.f3934u, this.F.f3630a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            n.f fVar = this.f3930f[i10];
            bb.a aVar = this.F;
            int i11 = this.f3929c.f3953r;
            Matrix matrix = n.f.f4015a;
            fVar.a(matrix, aVar, i11, canvas);
            this.f3931j[i10].a(matrix, this.F, this.f3929c.f3953r, canvas);
        }
        if (this.M) {
            int j10 = j();
            int k10 = k();
            canvas.translate(-j10, -k10);
            canvas.drawPath(this.f3934u, O);
            canvas.translate(j10, k10);
        }
    }

    public final void g(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.f(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float a10 = kVar.f3964f.a(rectF) * this.f3929c.f3947k;
        canvas.drawRoundRect(rectF, a10, a10, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f3929c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f3929c.f3952q == 2) {
            return;
        }
        if (p()) {
            outline.setRoundRect(getBounds(), m() * this.f3929c.f3947k);
            return;
        }
        b(i(), this.f3934u);
        if (!this.f3934u.isConvex() && Build.VERSION.SDK_INT < 29) {
            return;
        }
        try {
            outline.setConvexPath(this.f3934u);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f3929c.f3945i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.A.set(getBounds());
        b(i(), this.f3934u);
        this.B.setPath(this.f3934u, this.A);
        this.A.op(this.B, Region.Op.DIFFERENCE);
        return this.A;
    }

    public void h(Canvas canvas) {
        Paint paint = this.E;
        Path path = this.f3935w;
        k kVar = this.C;
        this.f3936z.set(i());
        float l10 = l();
        this.f3936z.inset(l10, l10);
        g(canvas, paint, path, kVar, this.f3936z);
    }

    public RectF i() {
        this.y.set(getBounds());
        return this.y;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.n = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        if (!super.isStateful() && (((colorStateList = this.f3929c.f3943g) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f3929c.f3942f) == null || !colorStateList2.isStateful()) && ((colorStateList3 = this.f3929c.f3941e) == null || !colorStateList3.isStateful())))) {
            ColorStateList colorStateList4 = this.f3929c.d;
            if (colorStateList4 == null || !colorStateList4.isStateful()) {
                return false;
            }
        }
        return true;
    }

    public int j() {
        b bVar = this.f3929c;
        return (int) (Math.sin(Math.toRadians(bVar.f3955t)) * bVar.f3954s);
    }

    public int k() {
        b bVar = this.f3929c;
        return (int) (Math.cos(Math.toRadians(bVar.f3955t)) * bVar.f3954s);
    }

    public final float l() {
        if (n()) {
            return this.E.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float m() {
        return this.f3929c.f3938a.f3963e.a(i());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f3929c = new b(this.f3929c);
        return this;
    }

    public final boolean n() {
        Paint.Style style = this.f3929c.f3957v;
        if (style != Paint.Style.FILL_AND_STROKE) {
            if (style == Paint.Style.STROKE) {
            }
            return false;
        }
        if (this.E.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public void o(Context context) {
        this.f3929c.f3939b = new ra.a(context);
        C();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.n = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10 = A(iArr) || B();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public boolean p() {
        return this.f3929c.f3938a.f(i());
    }

    public void q(float f10) {
        b bVar = this.f3929c;
        if (bVar.f3950o != f10) {
            bVar.f3950o = f10;
            C();
        }
    }

    public void r(ColorStateList colorStateList) {
        b bVar = this.f3929c;
        if (bVar.d != colorStateList) {
            bVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void s(float f10) {
        b bVar = this.f3929c;
        if (bVar.f3947k != f10) {
            bVar.f3947k = f10;
            this.n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        b bVar = this.f3929c;
        if (bVar.f3949m != i10) {
            bVar.f3949m = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3929c.f3940c = colorFilter;
        super.invalidateSelf();
    }

    @Override // cb.o
    public void setShapeAppearanceModel(k kVar) {
        this.f3929c.f3938a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f3929c.f3943g = colorStateList;
        B();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f3929c;
        if (bVar.f3944h != mode) {
            bVar.f3944h = mode;
            B();
            super.invalidateSelf();
        }
    }

    public void t(Paint.Style style) {
        this.f3929c.f3957v = style;
        super.invalidateSelf();
    }

    public void u(int i10) {
        this.F.a(i10);
        this.f3929c.f3956u = false;
        super.invalidateSelf();
    }

    public void v(int i10) {
        b bVar = this.f3929c;
        if (bVar.f3952q != i10) {
            bVar.f3952q = i10;
            super.invalidateSelf();
        }
    }

    public void w(float f10, int i10) {
        this.f3929c.f3948l = f10;
        invalidateSelf();
        y(ColorStateList.valueOf(i10));
    }

    public void x(float f10, ColorStateList colorStateList) {
        this.f3929c.f3948l = f10;
        invalidateSelf();
        y(colorStateList);
    }

    public void y(ColorStateList colorStateList) {
        b bVar = this.f3929c;
        if (bVar.f3941e != colorStateList) {
            bVar.f3941e = colorStateList;
            onStateChange(getState());
        }
    }

    public void z(float f10) {
        this.f3929c.f3948l = f10;
        invalidateSelf();
    }
}
