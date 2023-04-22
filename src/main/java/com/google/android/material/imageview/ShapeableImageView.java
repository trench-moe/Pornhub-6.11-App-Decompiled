package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import cb.g;
import cb.k;
import cb.l;
import cb.o;
import kotlin.jvm.internal.IntCompanionObject;
import za.c;

/* loaded from: classes.dex */
public class ShapeableImageView extends AppCompatImageView implements o {
    public g A;
    public k B;
    public float C;
    public Path D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;

    /* renamed from: m  reason: collision with root package name */
    public final l f7505m;
    public final RectF n;

    /* renamed from: t  reason: collision with root package name */
    public final RectF f7506t;

    /* renamed from: u  reason: collision with root package name */
    public final Paint f7507u;

    /* renamed from: w  reason: collision with root package name */
    public final Paint f7508w;
    public final Path y;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f7509z;

    @TargetApi(21)
    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f7510a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.B == null) {
                return;
            }
            if (shapeableImageView.A == null) {
                shapeableImageView.A = new g(ShapeableImageView.this.B);
            }
            ShapeableImageView.this.n.round(this.f7510a);
            ShapeableImageView.this.A.setBounds(this.f7510a);
            ShapeableImageView.this.A.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 2132018263), attributeSet, i10);
        this.f7505m = l.a.f3993a;
        this.y = new Path();
        this.K = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f7508w = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.n = new RectF();
        this.f7506t = new RectF();
        this.D = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, m9.a.f13018p0, i10, 2132018263);
        this.f7509z = c.a(context2, obtainStyledAttributes, 9);
        this.C = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.E = dimensionPixelSize;
        this.F = dimensionPixelSize;
        this.G = dimensionPixelSize;
        this.H = dimensionPixelSize;
        this.E = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.F = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.G = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.H = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.I = obtainStyledAttributes.getDimensionPixelSize(5, IntCompanionObject.MIN_VALUE);
        this.J = obtainStyledAttributes.getDimensionPixelSize(2, IntCompanionObject.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f7507u = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.B = k.c(context2, attributeSet, i10, 2132018263).a();
        setOutlineProvider(new a());
    }

    public int getContentPaddingBottom() {
        return this.H;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.J;
        return i10 != Integer.MIN_VALUE ? i10 : j() ? this.E : this.G;
    }

    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (i()) {
            if (j() && (i11 = this.J) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!j() && (i10 = this.I) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.E;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (i()) {
            if (j() && (i11 = this.I) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!j() && (i10 = this.J) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.G;
    }

    public final int getContentPaddingStart() {
        int i10 = this.I;
        return i10 != Integer.MIN_VALUE ? i10 : j() ? this.G : this.E;
    }

    public int getContentPaddingTop() {
        return this.F;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public k getShapeAppearanceModel() {
        return this.B;
    }

    public ColorStateList getStrokeColor() {
        return this.f7509z;
    }

    public float getStrokeWidth() {
        return this.C;
    }

    public final boolean i() {
        if (this.I == Integer.MIN_VALUE && this.J == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        return getLayoutDirection() == 1;
    }

    public final void k(int i10, int i11) {
        this.n.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        this.f7505m.a(this.B, 1.0f, this.n, this.y);
        this.D.rewind();
        this.D.addPath(this.y);
        this.f7506t.set(0.0f, 0.0f, i10, i11);
        this.D.addRect(this.f7506t, Path.Direction.CCW);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.D, this.f7508w);
        if (this.f7509z == null) {
            return;
        }
        this.f7507u.setStrokeWidth(this.C);
        int colorForState = this.f7509z.getColorForState(getDrawableState(), this.f7509z.getDefaultColor());
        if (this.C <= 0.0f || colorForState == 0) {
            return;
        }
        this.f7507u.setColor(colorForState);
        canvas.drawPath(this.y, this.f7507u);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.K && isLayoutDirectionResolved()) {
            this.K = true;
            if (!isPaddingRelative() && !i()) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
                return;
            }
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        k(i10, i11);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(getContentPaddingLeft() + i10, getContentPaddingTop() + i11, getContentPaddingRight() + i12, getContentPaddingBottom() + i13);
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(getContentPaddingStart() + i10, getContentPaddingTop() + i11, getContentPaddingEnd() + i12, getContentPaddingBottom() + i13);
    }

    @Override // cb.o
    public void setShapeAppearanceModel(k kVar) {
        this.B = kVar;
        g gVar = this.A;
        if (gVar != null) {
            gVar.f3929c.f3938a = kVar;
            gVar.invalidateSelf();
        }
        k(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f7509z = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(c0.a.c(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.C != f10) {
            this.C = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }
}
