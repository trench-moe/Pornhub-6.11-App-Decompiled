package f0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class c extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f9331a;

    /* renamed from: b  reason: collision with root package name */
    public int f9332b;

    /* renamed from: e  reason: collision with root package name */
    public final BitmapShader f9334e;

    /* renamed from: g  reason: collision with root package name */
    public float f9336g;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9340k;

    /* renamed from: l  reason: collision with root package name */
    public int f9341l;

    /* renamed from: m  reason: collision with root package name */
    public int f9342m;

    /* renamed from: c  reason: collision with root package name */
    public int f9333c = 119;
    public final Paint d = new Paint(3);

    /* renamed from: f  reason: collision with root package name */
    public final Matrix f9335f = new Matrix();

    /* renamed from: h  reason: collision with root package name */
    public final Rect f9337h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    public final RectF f9338i = new RectF();

    /* renamed from: j  reason: collision with root package name */
    public boolean f9339j = true;

    public c(Resources resources, Bitmap bitmap) {
        this.f9332b = 160;
        if (resources != null) {
            this.f9332b = resources.getDisplayMetrics().densityDpi;
        }
        this.f9331a = bitmap;
        if (bitmap == null) {
            this.f9342m = -1;
            this.f9341l = -1;
            this.f9334e = null;
            return;
        }
        this.f9341l = bitmap.getScaledWidth(this.f9332b);
        this.f9342m = bitmap.getScaledHeight(this.f9332b);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f9334e = new BitmapShader(bitmap, tileMode, tileMode);
    }

    public abstract void a(int i10, int i11, int i12, Rect rect, Rect rect2);

    public void b(float f10) {
        if (this.f9336g == f10) {
            return;
        }
        this.f9340k = false;
        if (f10 > 0.05f) {
            this.d.setShader(this.f9334e);
        } else {
            this.d.setShader(null);
        }
        this.f9336g = f10;
        invalidateSelf();
    }

    public void c() {
        if (this.f9339j) {
            if (this.f9340k) {
                int min = Math.min(this.f9341l, this.f9342m);
                a(this.f9333c, min, min, getBounds(), this.f9337h);
                int min2 = Math.min(this.f9337h.width(), this.f9337h.height());
                this.f9337h.inset(Math.max(0, (this.f9337h.width() - min2) / 2), Math.max(0, (this.f9337h.height() - min2) / 2));
                this.f9336g = min2 * 0.5f;
            } else {
                a(this.f9333c, this.f9341l, this.f9342m, getBounds(), this.f9337h);
            }
            this.f9338i.set(this.f9337h);
            if (this.f9334e != null) {
                Matrix matrix = this.f9335f;
                RectF rectF = this.f9338i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f9335f.preScale(this.f9338i.width() / this.f9331a.getWidth(), this.f9338i.height() / this.f9331a.getHeight());
                this.f9334e.setLocalMatrix(this.f9335f);
                this.d.setShader(this.f9334e);
            }
            this.f9339j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f9331a;
        if (bitmap == null) {
            return;
        }
        c();
        if (this.d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f9337h, this.d);
            return;
        }
        RectF rectF = this.f9338i;
        float f10 = this.f9336g;
        canvas.drawRoundRect(rectF, f10, f10, this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f9342m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f9341l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f9333c == 119) {
            if (!this.f9340k) {
                Bitmap bitmap = this.f9331a;
                if (bitmap != null && !bitmap.hasAlpha() && this.d.getAlpha() >= 255) {
                    if (!(this.f9336g > 0.05f)) {
                        return -1;
                    }
                }
            }
            return -3;
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f9340k) {
            this.f9336g = Math.min(this.f9342m, this.f9341l) / 2;
        }
        this.f9339j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.d.getAlpha()) {
            this.d.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.d.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.d.setFilterBitmap(z10);
        invalidateSelf();
    }
}
