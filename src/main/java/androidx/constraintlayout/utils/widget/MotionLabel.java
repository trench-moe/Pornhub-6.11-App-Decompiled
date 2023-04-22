package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewOutlineProvider;
import w.c;

/* loaded from: classes.dex */
public class MotionLabel extends View implements c {
    public float A;
    public int B;
    public int C;
    public float D;
    public String E;
    public boolean F;
    public Rect G;
    public int H;
    public int I;
    public int J;
    public int K;
    public String L;
    public int M;
    public int N;
    public boolean O;
    public float P;
    public float Q;
    public float R;
    public Drawable S;
    public Matrix T;
    public Bitmap U;
    public BitmapShader V;
    public Matrix W;

    /* renamed from: a0  reason: collision with root package name */
    public float f1563a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f1564b0;

    /* renamed from: c  reason: collision with root package name */
    public TextPaint f1565c;

    /* renamed from: c0  reason: collision with root package name */
    public float f1566c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f1567d0;

    /* renamed from: e0  reason: collision with root package name */
    public Paint f1568e0;

    /* renamed from: f  reason: collision with root package name */
    public Path f1569f;

    /* renamed from: f0  reason: collision with root package name */
    public int f1570f0;

    /* renamed from: g0  reason: collision with root package name */
    public Rect f1571g0;

    /* renamed from: h0  reason: collision with root package name */
    public Paint f1572h0;

    /* renamed from: i0  reason: collision with root package name */
    public float f1573i0;

    /* renamed from: j  reason: collision with root package name */
    public int f1574j;

    /* renamed from: j0  reason: collision with root package name */
    public float f1575j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f1576k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f1577l0;

    /* renamed from: m  reason: collision with root package name */
    public int f1578m;

    /* renamed from: m0  reason: collision with root package name */
    public float f1579m0;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public float f1580t;

    /* renamed from: u  reason: collision with root package name */
    public float f1581u;

    /* renamed from: w  reason: collision with root package name */
    public ViewOutlineProvider f1582w;
    public RectF y;

    /* renamed from: z  reason: collision with root package name */
    public float f1583z;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = MotionLabel.this.getWidth();
            int height = MotionLabel.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionLabel.this.f1580t) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f1581u);
        }
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1565c = new TextPaint();
        this.f1569f = new Path();
        this.f1574j = 65535;
        this.f1578m = 65535;
        this.n = false;
        this.f1580t = 0.0f;
        this.f1581u = Float.NaN;
        this.f1583z = 48.0f;
        this.A = Float.NaN;
        this.D = 0.0f;
        this.E = "Hello World";
        this.F = true;
        this.G = new Rect();
        this.H = 1;
        this.I = 1;
        this.J = 1;
        this.K = 1;
        this.M = 8388659;
        this.N = 0;
        this.O = false;
        this.f1563a0 = Float.NaN;
        this.f1564b0 = Float.NaN;
        this.f1566c0 = 0.0f;
        this.f1567d0 = 0.0f;
        this.f1568e0 = new Paint();
        this.f1570f0 = 0;
        this.f1575j0 = Float.NaN;
        this.f1576k0 = Float.NaN;
        this.f1577l0 = Float.NaN;
        this.f1579m0 = Float.NaN;
        c(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1565c = new TextPaint();
        this.f1569f = new Path();
        this.f1574j = 65535;
        this.f1578m = 65535;
        this.n = false;
        this.f1580t = 0.0f;
        this.f1581u = Float.NaN;
        this.f1583z = 48.0f;
        this.A = Float.NaN;
        this.D = 0.0f;
        this.E = "Hello World";
        this.F = true;
        this.G = new Rect();
        this.H = 1;
        this.I = 1;
        this.J = 1;
        this.K = 1;
        this.M = 8388659;
        this.N = 0;
        this.O = false;
        this.f1563a0 = Float.NaN;
        this.f1564b0 = Float.NaN;
        this.f1566c0 = 0.0f;
        this.f1567d0 = 0.0f;
        this.f1568e0 = new Paint();
        this.f1570f0 = 0;
        this.f1575j0 = Float.NaN;
        this.f1576k0 = Float.NaN;
        this.f1577l0 = Float.NaN;
        this.f1579m0 = Float.NaN;
        c(context, attributeSet);
    }

    private float getHorizontalOffset() {
        float f10 = Float.isNaN(this.A) ? 1.0f : this.f1583z / this.A;
        TextPaint textPaint = this.f1565c;
        String str = this.E;
        return ((this.f1566c0 + 1.0f) * ((((Float.isNaN(this.Q) ? getMeasuredWidth() : this.Q) - getPaddingLeft()) - getPaddingRight()) - (textPaint.measureText(str, 0, str.length()) * f10))) / 2.0f;
    }

    private float getVerticalOffset() {
        float f10 = Float.isNaN(this.A) ? 1.0f : this.f1583z / this.A;
        Paint.FontMetrics fontMetrics = this.f1565c.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.R) ? getMeasuredHeight() : this.R) - getPaddingTop()) - getPaddingBottom();
        float f11 = fontMetrics.descent;
        float f12 = fontMetrics.ascent;
        return (((1.0f - this.f1567d0) * (measuredHeight - ((f11 - f12) * f10))) / 2.0f) - (f10 * f12);
    }

    @Override // w.c
    public void a(float f10, float f11, float f12, float f13) {
        int i10 = (int) (f10 + 0.5f);
        this.P = f10 - i10;
        int i11 = (int) (f12 + 0.5f);
        int i12 = i11 - i10;
        int i13 = (int) (f13 + 0.5f);
        int i14 = (int) (0.5f + f11);
        int i15 = i13 - i14;
        float f14 = f12 - f10;
        this.Q = f14;
        float f15 = f13 - f11;
        this.R = f15;
        if (this.W != null) {
            this.Q = f14;
            this.R = f15;
            d();
        }
        if (getMeasuredHeight() == i15 && getMeasuredWidth() == i12) {
            super.layout(i10, i14, i11, i13);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
            super.layout(i10, i14, i11, i13);
        }
        if (this.O) {
            if (this.f1571g0 == null) {
                this.f1572h0 = new Paint();
                this.f1571g0 = new Rect();
                this.f1572h0.set(this.f1565c);
                this.f1573i0 = this.f1572h0.getTextSize();
            }
            this.Q = f14;
            this.R = f15;
            Paint paint = this.f1572h0;
            String str = this.E;
            paint.getTextBounds(str, 0, str.length(), this.f1571g0);
            float height = this.f1571g0.height() * 1.3f;
            float f16 = (f14 - this.I) - this.H;
            float f17 = (f15 - this.K) - this.J;
            float width = this.f1571g0.width();
            if (width * f17 > height * f16) {
                this.f1565c.setTextSize((this.f1573i0 * f16) / width);
            } else {
                this.f1565c.setTextSize((this.f1573i0 * f17) / height);
            }
            if (this.n || !Float.isNaN(this.A)) {
                b(Float.isNaN(this.A) ? 1.0f : this.f1583z / this.A);
            }
        }
    }

    public void b(float f10) {
        if (this.n || f10 != 1.0f) {
            this.f1569f.reset();
            String str = this.E;
            int length = str.length();
            this.f1565c.getTextBounds(str, 0, length, this.G);
            this.f1565c.getTextPath(str, 0, length, 0.0f, 0.0f, this.f1569f);
            if (f10 != 1.0f) {
                Log.v("MotionLabel", w.a.a() + " scale " + f10);
                Matrix matrix = new Matrix();
                matrix.postScale(f10, f10);
                this.f1569f.transform(matrix);
            }
            Rect rect = this.G;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.F = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.utils.widget.MotionLabel.c(android.content.Context, android.util.AttributeSet):void");
    }

    public final void d() {
        float f10 = 0.0f;
        float f11 = Float.isNaN(this.f1575j0) ? 0.0f : this.f1575j0;
        float f12 = Float.isNaN(this.f1576k0) ? 0.0f : this.f1576k0;
        float f13 = Float.isNaN(this.f1577l0) ? 1.0f : this.f1577l0;
        if (!Float.isNaN(this.f1579m0)) {
            f10 = this.f1579m0;
        }
        this.W.reset();
        float width = this.U.getWidth();
        float height = this.U.getHeight();
        float f14 = Float.isNaN(this.f1564b0) ? this.Q : this.f1564b0;
        float f15 = Float.isNaN(this.f1563a0) ? this.R : this.f1563a0;
        float f16 = f13 * (width * f15 < height * f14 ? f14 / width : f15 / height);
        this.W.postScale(f16, f16);
        float f17 = width * f16;
        float f18 = f14 - f17;
        float f19 = f16 * height;
        float f20 = f15 - f19;
        if (!Float.isNaN(this.f1563a0)) {
            f20 = this.f1563a0 / 2.0f;
        }
        if (!Float.isNaN(this.f1564b0)) {
            f18 = this.f1564b0 / 2.0f;
        }
        this.W.postTranslate((((f11 * f18) + f14) - f17) * 0.5f, (((f12 * f20) + f15) - f19) * 0.5f);
        this.W.postRotate(f10, f14 / 2.0f, f15 / 2.0f);
        this.V.setLocalMatrix(this.W);
    }

    public float getRound() {
        return this.f1581u;
    }

    public float getRoundPercent() {
        return this.f1580t;
    }

    public float getScaleFromTextSize() {
        return this.A;
    }

    public float getTextBackgroundPanX() {
        return this.f1575j0;
    }

    public float getTextBackgroundPanY() {
        return this.f1576k0;
    }

    public float getTextBackgroundRotate() {
        return this.f1579m0;
    }

    public float getTextBackgroundZoom() {
        return this.f1577l0;
    }

    public int getTextOutlineColor() {
        return this.f1578m;
    }

    public float getTextPanX() {
        return this.f1566c0;
    }

    public float getTextPanY() {
        return this.f1567d0;
    }

    public float getTextureHeight() {
        return this.f1563a0;
    }

    public float getTextureWidth() {
        return this.f1564b0;
    }

    public Typeface getTypeface() {
        return this.f1565c.getTypeface();
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        boolean isNaN = Float.isNaN(this.A);
        float f10 = isNaN ? 1.0f : this.f1583z / this.A;
        this.Q = i12 - i10;
        this.R = i13 - i11;
        if (this.O) {
            if (this.f1571g0 == null) {
                this.f1572h0 = new Paint();
                this.f1571g0 = new Rect();
                this.f1572h0.set(this.f1565c);
                this.f1573i0 = this.f1572h0.getTextSize();
            }
            Paint paint = this.f1572h0;
            String str = this.E;
            paint.getTextBounds(str, 0, str.length(), this.f1571g0);
            int width = this.f1571g0.width();
            int height = (int) (this.f1571g0.height() * 1.3f);
            float f11 = (this.Q - this.I) - this.H;
            float f12 = (this.R - this.K) - this.J;
            if (isNaN) {
                float f13 = width;
                float f14 = height;
                if (f13 * f12 > f14 * f11) {
                    this.f1565c.setTextSize((this.f1573i0 * f11) / f13);
                } else {
                    this.f1565c.setTextSize((this.f1573i0 * f12) / f14);
                }
            } else {
                float f15 = width;
                float f16 = height;
                f10 = f15 * f12 > f16 * f11 ? f11 / f15 : f12 / f16;
            }
        }
        if (!this.n && isNaN) {
            return;
        }
        float f17 = i10;
        float f18 = i11;
        float f19 = i12;
        float f20 = i13;
        if (this.W != null) {
            this.Q = f19 - f17;
            this.R = f20 - f18;
            d();
        }
        b(f10);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f10 = Float.isNaN(this.A) ? 1.0f : this.f1583z / this.A;
        super.onDraw(canvas);
        if (!this.n && f10 == 1.0f) {
            canvas.drawText(this.E, this.P + this.H + getHorizontalOffset(), this.J + getVerticalOffset(), this.f1565c);
            return;
        }
        if (this.F) {
            b(f10);
        }
        if (this.T == null) {
            this.T = new Matrix();
        }
        if (!this.n) {
            float horizontalOffset = this.H + getHorizontalOffset();
            float verticalOffset = this.J + getVerticalOffset();
            this.T.reset();
            this.T.preTranslate(horizontalOffset, verticalOffset);
            this.f1569f.transform(this.T);
            this.f1565c.setColor(this.f1574j);
            this.f1565c.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f1565c.setStrokeWidth(this.D);
            canvas.drawPath(this.f1569f, this.f1565c);
            this.T.reset();
            this.T.preTranslate(-horizontalOffset, -verticalOffset);
            this.f1569f.transform(this.T);
            return;
        }
        this.f1568e0.set(this.f1565c);
        this.T.reset();
        float horizontalOffset2 = this.H + getHorizontalOffset();
        float verticalOffset2 = this.J + getVerticalOffset();
        this.T.postTranslate(horizontalOffset2, verticalOffset2);
        this.T.preScale(f10, f10);
        this.f1569f.transform(this.T);
        if (this.V != null) {
            this.f1565c.setFilterBitmap(true);
            this.f1565c.setShader(this.V);
        } else {
            this.f1565c.setColor(this.f1574j);
        }
        this.f1565c.setStyle(Paint.Style.FILL);
        this.f1565c.setStrokeWidth(this.D);
        canvas.drawPath(this.f1569f, this.f1565c);
        if (this.V != null) {
            this.f1565c.setShader(null);
        }
        this.f1565c.setColor(this.f1578m);
        this.f1565c.setStyle(Paint.Style.STROKE);
        this.f1565c.setStrokeWidth(this.D);
        canvas.drawPath(this.f1569f, this.f1565c);
        this.T.reset();
        this.T.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f1569f.transform(this.T);
        this.f1565c.set(this.f1568e0);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.O = false;
        this.H = getPaddingLeft();
        this.I = getPaddingRight();
        this.J = getPaddingTop();
        this.K = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f1565c;
            String str = this.E;
            textPaint.getTextBounds(str, 0, str.length(), this.G);
            if (mode != 1073741824) {
                size = (int) (this.G.width() + 0.99999f);
            }
            size += this.H + this.I;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f1565c.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.J + this.K + fontMetricsInt;
            }
        } else if (this.N != 0) {
            this.O = true;
            setMeasuredDimension(size, size2);
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i10) {
        if ((i10 & 8388615) == 0) {
            i10 |= 8388611;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        if (i10 != this.M) {
            invalidate();
        }
        this.M = i10;
        int i11 = i10 & 112;
        if (i11 == 48) {
            this.f1567d0 = -1.0f;
        } else if (i11 != 80) {
            this.f1567d0 = 0.0f;
        } else {
            this.f1567d0 = 1.0f;
        }
        int i12 = i10 & 8388615;
        if (i12 != 3) {
            if (i12 != 5) {
                if (i12 != 8388611) {
                    if (i12 != 8388613) {
                        this.f1566c0 = 0.0f;
                        return;
                    }
                }
            }
            this.f1566c0 = 1.0f;
            return;
        }
        this.f1566c0 = -1.0f;
    }

    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f1581u = f10;
            float f11 = this.f1580t;
            this.f1580t = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f1581u != f10;
        this.f1581u = f10;
        if (f10 != 0.0f) {
            if (this.f1569f == null) {
                this.f1569f = new Path();
            }
            if (this.y == null) {
                this.y = new RectF();
            }
            if (this.f1582w == null) {
                b bVar = new b();
                this.f1582w = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.y.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f1569f.reset();
            Path path = this.f1569f;
            RectF rectF = this.y;
            float f12 = this.f1581u;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f10) {
        boolean z10 = this.f1580t != f10;
        this.f1580t = f10;
        if (f10 != 0.0f) {
            if (this.f1569f == null) {
                this.f1569f = new Path();
            }
            if (this.y == null) {
                this.y = new RectF();
            }
            if (this.f1582w == null) {
                a aVar = new a();
                this.f1582w = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f1580t) / 2.0f;
            this.y.set(0.0f, 0.0f, width, height);
            this.f1569f.reset();
            this.f1569f.addRoundRect(this.y, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f10) {
        this.A = f10;
    }

    public void setText(CharSequence charSequence) {
        this.E = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f10) {
        this.f1575j0 = f10;
        d();
        invalidate();
    }

    public void setTextBackgroundPanY(float f10) {
        this.f1576k0 = f10;
        d();
        invalidate();
    }

    public void setTextBackgroundRotate(float f10) {
        this.f1579m0 = f10;
        d();
        invalidate();
    }

    public void setTextBackgroundZoom(float f10) {
        this.f1577l0 = f10;
        d();
        invalidate();
    }

    public void setTextFillColor(int i10) {
        this.f1574j = i10;
        invalidate();
    }

    public void setTextOutlineColor(int i10) {
        this.f1578m = i10;
        this.n = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f10) {
        this.D = f10;
        this.n = true;
        if (Float.isNaN(f10)) {
            this.D = 1.0f;
            this.n = false;
        }
        invalidate();
    }

    public void setTextPanX(float f10) {
        this.f1566c0 = f10;
        invalidate();
    }

    public void setTextPanY(float f10) {
        this.f1567d0 = f10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f1583z = f10;
        Log.v("MotionLabel", w.a.a() + "  " + f10 + " / " + this.A);
        TextPaint textPaint = this.f1565c;
        if (!Float.isNaN(this.A)) {
            f10 = this.A;
        }
        textPaint.setTextSize(f10);
        b(Float.isNaN(this.A) ? 1.0f : this.f1583z / this.A);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f10) {
        this.f1563a0 = f10;
        d();
        invalidate();
    }

    public void setTextureWidth(float f10) {
        this.f1564b0 = f10;
        d();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f1565c.getTypeface() != typeface) {
            this.f1565c.setTypeface(typeface);
        }
    }
}
