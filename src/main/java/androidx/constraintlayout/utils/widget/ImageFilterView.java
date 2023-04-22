package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
import t9.j0;

/* loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {
    public Path A;
    public ViewOutlineProvider B;
    public RectF C;
    public Drawable[] D;
    public LayerDrawable E;
    public float F;
    public float G;
    public float H;
    public float I;

    /* renamed from: m  reason: collision with root package name */
    public c f1536m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f1537t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f1538u;

    /* renamed from: w  reason: collision with root package name */
    public float f1539w;
    public float y;

    /* renamed from: z  reason: collision with root package name */
    public float f1540z;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterView.this.y) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f1540z);
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public float[] f1543a = new float[20];

        /* renamed from: b  reason: collision with root package name */
        public ColorMatrix f1544b = new ColorMatrix();

        /* renamed from: c  reason: collision with root package name */
        public ColorMatrix f1545c = new ColorMatrix();
        public float d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1546e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1547f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f1548g = 1.0f;

        public void a(ImageView imageView) {
            float f10;
            boolean z10;
            float f11;
            float log;
            float f12;
            this.f1544b.reset();
            float f13 = this.f1546e;
            boolean z11 = true;
            if (f13 != 1.0f) {
                float f14 = 1.0f - f13;
                float f15 = 0.2999f * f14;
                float f16 = 0.587f * f14;
                float f17 = f14 * 0.114f;
                float[] fArr = this.f1543a;
                fArr[0] = f15 + f13;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = f15;
                fArr[6] = f16 + f13;
                fArr[7] = f17;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = f15;
                fArr[11] = f16;
                fArr[12] = f17 + f13;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                f10 = 1.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                this.f1544b.set(fArr);
                z10 = true;
            } else {
                f10 = 1.0f;
                z10 = false;
            }
            float f18 = this.f1547f;
            if (f18 != f10) {
                this.f1545c.setScale(f18, f18, f18, f10);
                this.f1544b.postConcat(this.f1545c);
                z10 = true;
            }
            float f19 = this.f1548g;
            if (f19 != f10) {
                if (f19 <= 0.0f) {
                    f19 = 0.01f;
                }
                float f20 = (5000.0f / f19) / 100.0f;
                if (f20 > 66.0f) {
                    double d = f20 - 60.0f;
                    log = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
                    f12 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                } else {
                    log = (((float) Math.log(f20)) * 99.4708f) - 161.11957f;
                    f12 = 255.0f;
                }
                float log2 = f20 < 66.0f ? f20 > 19.0f ? (((float) Math.log(f20 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
                float min = Math.min(255.0f, Math.max(f12, 0.0f));
                float min2 = Math.min(255.0f, Math.max(log, 0.0f));
                float min3 = Math.min(255.0f, Math.max(log2, 0.0f));
                float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
                float min5 = Math.min(255.0f, Math.max((((float) Math.log(50.0f)) * 99.4708f) - 161.11957f, 0.0f));
                float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log(40.0f)) * 138.51773f) - 305.0448f, 0.0f));
                float[] fArr2 = this.f1543a;
                fArr2[0] = min / min4;
                fArr2[1] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[3] = 0.0f;
                fArr2[4] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[6] = min2 / min5;
                fArr2[7] = 0.0f;
                fArr2[8] = 0.0f;
                fArr2[9] = 0.0f;
                fArr2[10] = 0.0f;
                fArr2[11] = 0.0f;
                fArr2[12] = min6;
                fArr2[13] = 0.0f;
                fArr2[14] = 0.0f;
                fArr2[15] = 0.0f;
                fArr2[16] = 0.0f;
                fArr2[17] = 0.0f;
                f11 = 1.0f;
                fArr2[18] = 1.0f;
                fArr2[19] = 0.0f;
                this.f1545c.set(fArr2);
                this.f1544b.postConcat(this.f1545c);
                z10 = true;
            } else {
                f11 = 1.0f;
            }
            float f21 = this.d;
            if (f21 != f11) {
                float[] fArr3 = this.f1543a;
                fArr3[0] = f21;
                fArr3[1] = 0.0f;
                fArr3[2] = 0.0f;
                fArr3[3] = 0.0f;
                fArr3[4] = 0.0f;
                fArr3[5] = 0.0f;
                fArr3[6] = f21;
                fArr3[7] = 0.0f;
                fArr3[8] = 0.0f;
                fArr3[9] = 0.0f;
                fArr3[10] = 0.0f;
                fArr3[11] = 0.0f;
                fArr3[12] = f21;
                fArr3[13] = 0.0f;
                fArr3[14] = 0.0f;
                fArr3[15] = 0.0f;
                fArr3[16] = 0.0f;
                fArr3[17] = 0.0f;
                fArr3[18] = 1.0f;
                fArr3[19] = 0.0f;
                this.f1545c.set(fArr3);
                this.f1544b.postConcat(this.f1545c);
            } else {
                z11 = z10;
            }
            if (z11) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f1544b));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1536m = new c();
        this.n = true;
        this.f1537t = null;
        this.f1538u = null;
        this.f1539w = 0.0f;
        this.y = 0.0f;
        this.f1540z = Float.NaN;
        this.D = new Drawable[2];
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        i(attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1536m = new c();
        this.n = true;
        this.f1537t = null;
        this.f1538u = null;
        this.f1539w = 0.0f;
        this.y = 0.0f;
        this.f1540z = Float.NaN;
        this.D = new Drawable[2];
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        i(attributeSet);
    }

    private void setOverlay(boolean z10) {
        this.n = z10;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.f1536m.d;
    }

    public float getContrast() {
        return this.f1536m.f1547f;
    }

    public float getCrossfade() {
        return this.f1539w;
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
        return this.f1540z;
    }

    public float getRoundPercent() {
        return this.y;
    }

    public float getSaturation() {
        return this.f1536m.f1546e;
    }

    public float getWarmth() {
        return this.f1536m.f1548g;
    }

    public final void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j0.G);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f1537t = obtainStyledAttributes.getDrawable(0);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 4) {
                    this.f1539w = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == 13) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 12) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 3) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 2) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 10) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 11) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 9) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.n));
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
            this.f1538u = drawable;
            if (this.f1537t == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f1538u = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.D;
                    Drawable mutate = drawable2.mutate();
                    this.f1538u = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.D;
            Drawable mutate2 = getDrawable().mutate();
            this.f1538u = mutate2;
            drawableArr2[0] = mutate2;
            this.D[1] = this.f1537t.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.D);
            this.E = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f1539w * 255.0f));
            if (!this.n) {
                this.E.getDrawable(0).setAlpha((int) ((1.0f - this.f1539w) * 255.0f));
            }
            super.setImageDrawable(this.E);
        }
    }

    public final void j() {
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

    public final void k() {
        if (Float.isNaN(this.F) && Float.isNaN(this.G) && Float.isNaN(this.H) && Float.isNaN(this.I)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            j();
        }
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        j();
    }

    public void setAltImageResource(int i10) {
        Drawable mutate = f.a.a(getContext(), i10).mutate();
        this.f1537t = mutate;
        Drawable[] drawableArr = this.D;
        drawableArr[0] = this.f1538u;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.D);
        this.E = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f1539w);
    }

    public void setBrightness(float f10) {
        c cVar = this.f1536m;
        cVar.d = f10;
        cVar.a(this);
    }

    public void setContrast(float f10) {
        c cVar = this.f1536m;
        cVar.f1547f = f10;
        cVar.a(this);
    }

    public void setCrossfade(float f10) {
        this.f1539w = f10;
        if (this.D != null) {
            if (!this.n) {
                this.E.getDrawable(0).setAlpha((int) ((1.0f - this.f1539w) * 255.0f));
            }
            this.E.getDrawable(1).setAlpha((int) (this.f1539w * 255.0f));
            super.setImageDrawable(this.E);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f1537t == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f1538u = mutate;
        Drawable[] drawableArr = this.D;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f1537t;
        LayerDrawable layerDrawable = new LayerDrawable(this.D);
        this.E = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f1539w);
    }

    public void setImagePanX(float f10) {
        this.F = f10;
        k();
    }

    public void setImagePanY(float f10) {
        this.G = f10;
        k();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.f1537t == null) {
            super.setImageResource(i10);
            return;
        }
        Drawable mutate = f.a.a(getContext(), i10).mutate();
        this.f1538u = mutate;
        Drawable[] drawableArr = this.D;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f1537t;
        LayerDrawable layerDrawable = new LayerDrawable(this.D);
        this.E = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f1539w);
    }

    public void setImageRotate(float f10) {
        this.I = f10;
        k();
    }

    public void setImageZoom(float f10) {
        this.H = f10;
        k();
    }

    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f1540z = f10;
            float f11 = this.y;
            this.y = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f1540z != f10;
        this.f1540z = f10;
        if (f10 != 0.0f) {
            if (this.A == null) {
                this.A = new Path();
            }
            if (this.C == null) {
                this.C = new RectF();
            }
            if (this.B == null) {
                b bVar = new b();
                this.B = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.C.set(0.0f, 0.0f, getWidth(), getHeight());
            this.A.reset();
            Path path = this.A;
            RectF rectF = this.C;
            float f12 = this.f1540z;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f10) {
        boolean z10 = this.y != f10;
        this.y = f10;
        if (f10 != 0.0f) {
            if (this.A == null) {
                this.A = new Path();
            }
            if (this.C == null) {
                this.C = new RectF();
            }
            if (this.B == null) {
                a aVar = new a();
                this.B = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.y) / 2.0f;
            this.C.set(0.0f, 0.0f, width, height);
            this.A.reset();
            this.A.addRoundRect(this.C, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f10) {
        c cVar = this.f1536m;
        cVar.f1546e = f10;
        cVar.a(this);
    }

    public void setWarmth(float f10) {
        c cVar = this.f1536m;
        cVar.f1548g = f10;
        cVar.a(this);
    }
}
