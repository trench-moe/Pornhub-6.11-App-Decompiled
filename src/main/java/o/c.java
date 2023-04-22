package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class c extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f13465a;

    /* renamed from: c  reason: collision with root package name */
    public final RectF f13467c;
    public final Rect d;

    /* renamed from: e  reason: collision with root package name */
    public float f13468e;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f13471h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuffColorFilter f13472i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f13473j;

    /* renamed from: f  reason: collision with root package name */
    public boolean f13469f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f13470g = true;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f13474k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f13466b = new Paint(5);

    public c(ColorStateList colorStateList, float f10) {
        this.f13465a = f10;
        b(colorStateList);
        this.f13467c = new RectF();
        this.d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f13471h = colorStateList;
        this.f13466b.setColor(colorStateList.getColorForState(getState(), this.f13471h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f13467c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.d.set(rect);
        if (this.f13469f) {
            float b10 = d.b(this.f13468e, this.f13465a, this.f13470g);
            this.d.inset((int) Math.ceil(d.a(this.f13468e, this.f13465a, this.f13470g)), (int) Math.ceil(b10));
            this.f13467c.set(this.d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f13466b;
        if (this.f13472i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f13472i);
            z10 = true;
        }
        RectF rectF = this.f13467c;
        float f10 = this.f13465a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.d, this.f13465a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f13473j;
        if (colorStateList != null) {
            if (!colorStateList.isStateful()) {
            }
        }
        ColorStateList colorStateList2 = this.f13471h;
        if (colorStateList2 != null) {
            if (!colorStateList2.isStateful()) {
            }
        }
        return super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f13471h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f13466b.getColor();
        if (z10) {
            this.f13466b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f13473j;
        if (colorStateList2 == null || (mode = this.f13474k) == null) {
            return z10;
        }
        this.f13472i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f13466b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f13466b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f13473j = colorStateList;
        this.f13472i = a(colorStateList, this.f13474k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f13474k = mode;
        this.f13472i = a(this.f13473j, mode);
        invalidateSelf();
    }
}
