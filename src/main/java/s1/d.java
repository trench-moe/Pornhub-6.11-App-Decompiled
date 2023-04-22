package s1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.Objects;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public class d extends Drawable implements Animatable {

    /* renamed from: u  reason: collision with root package name */
    public static final Interpolator f14782u = new LinearInterpolator();

    /* renamed from: w  reason: collision with root package name */
    public static final Interpolator f14783w = new c1.b();
    public static final int[] y = {-16777216};

    /* renamed from: c  reason: collision with root package name */
    public final a f14784c;

    /* renamed from: f  reason: collision with root package name */
    public float f14785f;

    /* renamed from: j  reason: collision with root package name */
    public Resources f14786j;

    /* renamed from: m  reason: collision with root package name */
    public Animator f14787m;
    public float n;

    /* renamed from: t  reason: collision with root package name */
    public boolean f14788t;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final RectF f14789a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        public final Paint f14790b;

        /* renamed from: c  reason: collision with root package name */
        public final Paint f14791c;
        public final Paint d;

        /* renamed from: e  reason: collision with root package name */
        public float f14792e;

        /* renamed from: f  reason: collision with root package name */
        public float f14793f;

        /* renamed from: g  reason: collision with root package name */
        public float f14794g;

        /* renamed from: h  reason: collision with root package name */
        public float f14795h;

        /* renamed from: i  reason: collision with root package name */
        public int[] f14796i;

        /* renamed from: j  reason: collision with root package name */
        public int f14797j;

        /* renamed from: k  reason: collision with root package name */
        public float f14798k;

        /* renamed from: l  reason: collision with root package name */
        public float f14799l;

        /* renamed from: m  reason: collision with root package name */
        public float f14800m;
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public Path f14801o;

        /* renamed from: p  reason: collision with root package name */
        public float f14802p;

        /* renamed from: q  reason: collision with root package name */
        public float f14803q;

        /* renamed from: r  reason: collision with root package name */
        public int f14804r;

        /* renamed from: s  reason: collision with root package name */
        public int f14805s;

        /* renamed from: t  reason: collision with root package name */
        public int f14806t;

        /* renamed from: u  reason: collision with root package name */
        public int f14807u;

        public a() {
            Paint paint = new Paint();
            this.f14790b = paint;
            Paint paint2 = new Paint();
            this.f14791c = paint2;
            Paint paint3 = new Paint();
            this.d = paint3;
            this.f14792e = 0.0f;
            this.f14793f = 0.0f;
            this.f14794g = 0.0f;
            this.f14795h = 5.0f;
            this.f14802p = 1.0f;
            this.f14806t = KotlinVersion.MAX_COMPONENT_VALUE;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void a(int i10) {
            this.f14797j = i10;
            this.f14807u = this.f14796i[i10];
        }

        public void b(boolean z10) {
            if (this.n != z10) {
                this.n = z10;
            }
        }
    }

    public d(Context context) {
        Objects.requireNonNull(context);
        this.f14786j = context.getResources();
        a aVar = new a();
        this.f14784c = aVar;
        aVar.f14796i = y;
        aVar.a(0);
        aVar.f14795h = 2.5f;
        aVar.f14790b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this, aVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f14782u);
        ofFloat.addListener(new c(this, aVar));
        this.f14787m = ofFloat;
    }

    public void a(float f10, a aVar, boolean z10) {
        float interpolation;
        float f11;
        if (this.f14788t) {
            d(f10, aVar);
            float floor = (float) (Math.floor(aVar.f14800m / 0.8f) + 1.0d);
            float f12 = aVar.f14798k;
            float f13 = aVar.f14799l;
            aVar.f14792e = (((f13 - 0.01f) - f12) * f10) + f12;
            aVar.f14793f = f13;
            float f14 = aVar.f14800m;
            aVar.f14794g = a0.a.b(floor, f14, f10, f14);
            return;
        }
        if (f10 == 1.0f) {
            if (z10) {
            }
        }
        float f15 = aVar.f14800m;
        if (f10 < 0.5f) {
            interpolation = aVar.f14798k;
            f11 = (((c1.d) f14783w).getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
        } else {
            float f16 = aVar.f14798k + 0.79f;
            interpolation = f16 - (((1.0f - ((c1.d) f14783w).getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            f11 = f16;
        }
        aVar.f14792e = interpolation;
        aVar.f14793f = f11;
        aVar.f14794g = (0.20999998f * f10) + f15;
        this.f14785f = (f10 + this.n) * 216.0f;
    }

    public final void b(float f10, float f11, float f12, float f13) {
        a aVar = this.f14784c;
        float f14 = this.f14786j.getDisplayMetrics().density;
        float f15 = f11 * f14;
        aVar.f14795h = f15;
        aVar.f14790b.setStrokeWidth(f15);
        aVar.f14803q = f10 * f14;
        aVar.a(0);
        aVar.f14804r = (int) (f12 * f14);
        aVar.f14805s = (int) (f13 * f14);
    }

    public void c(int i10) {
        if (i10 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public void d(float f10, a aVar) {
        if (f10 <= 0.75f) {
            aVar.f14807u = aVar.f14796i[aVar.f14797j];
            return;
        }
        float f11 = (f10 - 0.75f) / 0.25f;
        int[] iArr = aVar.f14796i;
        int i10 = aVar.f14797j;
        int i11 = iArr[i10];
        int i12 = iArr[(i10 + 1) % iArr.length];
        int i13 = (i11 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i14 = (i11 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i15 = (i11 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i16 = i11 & KotlinVersion.MAX_COMPONENT_VALUE;
        aVar.f14807u = ((i13 + ((int) ((((i12 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) - i13) * f11))) << 24) | ((i14 + ((int) ((((i12 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) - i14) * f11))) << 16) | ((i15 + ((int) ((((i12 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) - i15) * f11))) << 8) | (i16 + ((int) (f11 * ((i12 & KotlinVersion.MAX_COMPONENT_VALUE) - i16))));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f14785f, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f14784c;
        RectF rectF = aVar.f14789a;
        float f10 = aVar.f14803q;
        float f11 = (aVar.f14795h / 2.0f) + f10;
        if (f10 <= 0.0f) {
            f11 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((aVar.f14804r * aVar.f14802p) / 2.0f, aVar.f14795h / 2.0f);
        }
        rectF.set(bounds.centerX() - f11, bounds.centerY() - f11, bounds.centerX() + f11, bounds.centerY() + f11);
        float f12 = aVar.f14792e;
        float f13 = aVar.f14794g;
        float f14 = (f12 + f13) * 360.0f;
        float f15 = ((aVar.f14793f + f13) * 360.0f) - f14;
        aVar.f14790b.setColor(aVar.f14807u);
        aVar.f14790b.setAlpha(aVar.f14806t);
        float f16 = aVar.f14795h / 2.0f;
        rectF.inset(f16, f16);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.d);
        float f17 = -f16;
        rectF.inset(f17, f17);
        canvas.drawArc(rectF, f14, f15, false, aVar.f14790b);
        if (aVar.n) {
            Path path = aVar.f14801o;
            if (path == null) {
                Path path2 = new Path();
                aVar.f14801o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            aVar.f14801o.moveTo(0.0f, 0.0f);
            aVar.f14801o.lineTo(aVar.f14804r * aVar.f14802p, 0.0f);
            Path path3 = aVar.f14801o;
            float f18 = aVar.f14802p;
            path3.lineTo((aVar.f14804r * f18) / 2.0f, aVar.f14805s * f18);
            aVar.f14801o.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((aVar.f14804r * aVar.f14802p) / 2.0f), (aVar.f14795h / 2.0f) + rectF.centerY());
            aVar.f14801o.close();
            aVar.f14791c.setColor(aVar.f14807u);
            aVar.f14791c.setAlpha(aVar.f14806t);
            canvas.save();
            canvas.rotate(f14 + f15, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f14801o, aVar.f14791c);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f14784c.f14806t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f14787m.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f14784c.f14806t = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f14784c.f14790b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f14787m.cancel();
        a aVar = this.f14784c;
        float f10 = aVar.f14792e;
        aVar.f14798k = f10;
        float f11 = aVar.f14793f;
        aVar.f14799l = f11;
        aVar.f14800m = aVar.f14794g;
        if (f11 != f10) {
            this.f14788t = true;
            this.f14787m.setDuration(666L);
            this.f14787m.start();
            return;
        }
        aVar.a(0);
        a aVar2 = this.f14784c;
        aVar2.f14798k = 0.0f;
        aVar2.f14799l = 0.0f;
        aVar2.f14800m = 0.0f;
        aVar2.f14792e = 0.0f;
        aVar2.f14793f = 0.0f;
        aVar2.f14794g = 0.0f;
        this.f14787m.setDuration(1332L);
        this.f14787m.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f14787m.cancel();
        this.f14785f = 0.0f;
        this.f14784c.b(false);
        this.f14784c.a(0);
        a aVar = this.f14784c;
        aVar.f14798k = 0.0f;
        aVar.f14799l = 0.0f;
        aVar.f14800m = 0.0f;
        aVar.f14792e = 0.0f;
        aVar.f14793f = 0.0f;
        aVar.f14794g = 0.0f;
        invalidateSelf();
    }
}
