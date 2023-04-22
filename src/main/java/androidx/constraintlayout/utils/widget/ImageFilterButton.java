package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import t9.j0;

/* loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {
    public Drawable[] A;
    public LayerDrawable B;
    public boolean C;
    public Drawable D;
    public Drawable E;
    public float F;
    public float G;
    public float H;
    public float I;

    /* renamed from: m  reason: collision with root package name */
    public ImageFilterView.c f1529m;
    public float n;

    /* renamed from: t  reason: collision with root package name */
    public float f1530t;

    /* renamed from: u  reason: collision with root package name */
    public float f1531u;

    /* renamed from: w  reason: collision with root package name */
    public Path f1532w;
    public ViewOutlineProvider y;

    /* renamed from: z  reason: collision with root package name */
    public RectF f1533z;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterButton.this.f1530t) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f1531u);
        }
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1529m = new ImageFilterView.c();
        this.n = 0.0f;
        this.f1530t = 0.0f;
        this.f1531u = Float.NaN;
        this.A = new Drawable[2];
        this.C = true;
        this.D = null;
        this.E = null;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        a(attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1529m = new ImageFilterView.c();
        this.n = 0.0f;
        this.f1530t = 0.0f;
        this.f1531u = Float.NaN;
        this.A = new Drawable[2];
        this.C = true;
        this.D = null;
        this.E = null;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        a(attributeSet);
    }

    private void setOverlay(boolean z10) {
        this.C = z10;
    }

    public final void a(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j0.G);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.D = obtainStyledAttributes.getDrawable(0);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 4) {
                    this.n = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == 13) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 12) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 3) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 10) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 11) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 9) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.C));
                } else if (index == 5) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.F));
                } else if (index == 6) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.G));
                } else if (index == 7) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.I));
                } else if (index == 8) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.H));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.E = drawable;
            if (this.D == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.E = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.A;
                    Drawable mutate = drawable2.mutate();
                    this.E = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.A;
            Drawable mutate2 = getDrawable().mutate();
            this.E = mutate2;
            drawableArr2[0] = mutate2;
            this.A[1] = this.D.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.A);
            this.B = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.n * 255.0f));
            if (!this.C) {
                this.B.getDrawable(0).setAlpha((int) ((1.0f - this.n) * 255.0f));
            }
            super.setImageDrawable(this.B);
        }
    }

    public final void b() {
        if (Float.isNaN(this.F) && Float.isNaN(this.G) && Float.isNaN(this.H) && Float.isNaN(this.I)) {
            return;
        }
        float f10 = 0.0f;
        float f11 = Float.isNaN(this.F) ? 0.0f : this.F;
        float f12 = Float.isNaN(this.G) ? 0.0f : this.G;
        float f13 = Float.isNaN(this.H) ? 1.0f : this.H;
        if (!Float.isNaN(this.I)) {
            f10 = this.I;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f14 = f13 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f14, f14);
        float f15 = intrinsicWidth * f14;
        float f16 = f14 * intrinsicHeight;
        matrix.postTranslate(((((width - f15) * f11) + width) - f15) * 0.5f, ((((height - f16) * f12) + height) - f16) * 0.5f);
        matrix.postRotate(f10, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void c() {
        if (Float.isNaN(this.F) && Float.isNaN(this.G) && Float.isNaN(this.H) && Float.isNaN(this.I)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            b();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.f1529m.f1547f;
    }

    public float getCrossfade() {
        return this.n;
    }

    public float getImagePanX() {
        return this.F;
    }

    public float getImagePanY() {
        return this.G;
    }

    public float getImageRotate() {
        return this.I;
    }

    public float getImageZoom() {
        return this.H;
    }

    public float getRound() {
        return this.f1531u;
    }

    public float getRoundPercent() {
        return this.f1530t;
    }

    public float getSaturation() {
        return this.f1529m.f1546e;
    }

    public float getWarmth() {
        return this.f1529m.f1548g;
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        b();
    }

    public void setAltImageResource(int i10) {
        Drawable mutate = f.a.a(getContext(), i10).mutate();
        this.D = mutate;
        Drawable[] drawableArr = this.A;
        drawableArr[0] = this.E;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.A);
        this.B = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.n);
    }

    public void setBrightness(float f10) {
        ImageFilterView.c cVar = this.f1529m;
        cVar.d = f10;
        cVar.a(this);
    }

    public void setContrast(float f10) {
        ImageFilterView.c cVar = this.f1529m;
        cVar.f1547f = f10;
        cVar.a(this);
    }

    public void setCrossfade(float f10) {
        this.n = f10;
        if (this.A != null) {
            if (!this.C) {
                this.B.getDrawable(0).setAlpha((int) ((1.0f - this.n) * 255.0f));
            }
            this.B.getDrawable(1).setAlpha((int) (this.n * 255.0f));
            super.setImageDrawable(this.B);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.D == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.E = mutate;
        Drawable[] drawableArr = this.A;
        drawableArr[0] = mutate;
        drawableArr[1] = this.D;
        LayerDrawable layerDrawable = new LayerDrawable(this.A);
        this.B = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.n);
    }

    public void setImagePanX(float f10) {
        this.F = f10;
        c();
    }

    public void setImagePanY(float f10) {
        this.G = f10;
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.D == null) {
            super.setImageResource(i10);
            return;
        }
        Drawable mutate = f.a.a(getContext(), i10).mutate();
        this.E = mutate;
        Drawable[] drawableArr = this.A;
        drawableArr[0] = mutate;
        drawableArr[1] = this.D;
        LayerDrawable layerDrawable = new LayerDrawable(this.A);
        this.B = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.n);
    }

    public void setImageRotate(float f10) {
        this.I = f10;
        c();
    }

    public void setImageZoom(float f10) {
        this.H = f10;
        c();
    }

    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f1531u = f10;
            float f11 = this.f1530t;
            this.f1530t = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f1531u != f10;
        this.f1531u = f10;
        if (f10 != 0.0f) {
            if (this.f1532w == null) {
                this.f1532w = new Path();
            }
            if (this.f1533z == null) {
                this.f1533z = new RectF();
            }
            if (this.y == null) {
                b bVar = new b();
                this.y = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f1533z.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f1532w.reset();
            Path path = this.f1532w;
            RectF rectF = this.f1533z;
            float f12 = this.f1531u;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f10) {
        boolean z10 = this.f1530t != f10;
        this.f1530t = f10;
        if (f10 != 0.0f) {
            if (this.f1532w == null) {
                this.f1532w = new Path();
            }
            if (this.f1533z == null) {
                this.f1533z = new RectF();
            }
            if (this.y == null) {
                a aVar = new a();
                this.y = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f1530t) / 2.0f;
            this.f1533z.set(0.0f, 0.0f, width, height);
            this.f1532w.reset();
            this.f1532w.addRoundRect(this.f1533z, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f10) {
        ImageFilterView.c cVar = this.f1529m;
        cVar.f1546e = f10;
        cVar.a(this);
    }

    public void setWarmth(float f10) {
        ImageFilterView.c cVar = this.f1529m;
        cVar.f1548g = f10;
        cVar.a(this);
    }
}
