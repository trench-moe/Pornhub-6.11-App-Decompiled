package ta;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import cb.k;
import cb.l;

/* loaded from: classes2.dex */
public class b extends Drawable {

    /* renamed from: b  reason: collision with root package name */
    public final Paint f15389b;

    /* renamed from: h  reason: collision with root package name */
    public float f15394h;

    /* renamed from: i  reason: collision with root package name */
    public int f15395i;

    /* renamed from: j  reason: collision with root package name */
    public int f15396j;

    /* renamed from: k  reason: collision with root package name */
    public int f15397k;

    /* renamed from: l  reason: collision with root package name */
    public int f15398l;

    /* renamed from: m  reason: collision with root package name */
    public int f15399m;

    /* renamed from: o  reason: collision with root package name */
    public k f15400o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f15401p;

    /* renamed from: a  reason: collision with root package name */
    public final l f15388a = l.a.f3993a;

    /* renamed from: c  reason: collision with root package name */
    public final Path f15390c = new Path();
    public final Rect d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f15391e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final RectF f15392f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final C0271b f15393g = new C0271b(null);
    public boolean n = true;

    /* renamed from: ta.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0271b extends Drawable.ConstantState {
        public C0271b(a aVar) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return b.this;
        }
    }

    public b(k kVar) {
        this.f15400o = kVar;
        Paint paint = new Paint(1);
        this.f15389b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public RectF a() {
        this.f15392f.set(getBounds());
        return this.f15392f;
    }

    public void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f15399m = colorStateList.getColorForState(getState(), this.f15399m);
        }
        this.f15401p = colorStateList;
        this.n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.n) {
            Paint paint = this.f15389b;
            Rect rect = this.d;
            copyBounds(rect);
            float height = this.f15394h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{e0.a.f(this.f15395i, this.f15399m), e0.a.f(this.f15396j, this.f15399m), e0.a.f(e0.a.j(this.f15396j, 0), this.f15399m), e0.a.f(e0.a.j(this.f15398l, 0), this.f15399m), e0.a.f(this.f15398l, this.f15399m), e0.a.f(this.f15397k, this.f15399m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.n = false;
        }
        float strokeWidth = this.f15389b.getStrokeWidth() / 2.0f;
        copyBounds(this.d);
        this.f15391e.set(this.d);
        float min = Math.min(this.f15400o.f3963e.a(a()), this.f15391e.width() / 2.0f);
        if (this.f15400o.f(a())) {
            this.f15391e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f15391e, min, min, this.f15389b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f15393g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f15394h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f15400o.f(a())) {
            outline.setRoundRect(getBounds(), this.f15400o.f3963e.a(a()));
            return;
        }
        copyBounds(this.d);
        this.f15391e.set(this.d);
        this.f15388a.a(this.f15400o, 1.0f, this.f15391e, this.f15390c);
        if (this.f15390c.isConvex()) {
            outline.setConvexPath(this.f15390c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.f15400o.f(a())) {
            int round = Math.round(this.f15394h);
            rect.set(round, round, round, round);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f15401p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f15401p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f15399m)) != this.f15399m) {
            this.n = true;
            this.f15399m = colorForState;
        }
        if (this.n) {
            invalidateSelf();
        }
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f15389b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15389b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
