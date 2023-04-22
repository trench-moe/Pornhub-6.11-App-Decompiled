package f0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable implements Drawable.Callback, e, d {

    /* renamed from: u  reason: collision with root package name */
    public static final PorterDuff.Mode f9343u = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public int f9344c;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f9345f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9346j;

    /* renamed from: m  reason: collision with root package name */
    public h f9347m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f9348t;

    public f(Drawable drawable) {
        this.f9347m = new h(this.f9347m);
        a(drawable);
    }

    public f(h hVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.f9347m = hVar;
        if (hVar == null || (constantState = hVar.f9351b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    @Override // f0.e
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f9348t;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9348t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            h hVar = this.f9347m;
            if (hVar != null) {
                hVar.f9351b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // f0.e
    public final Drawable b() {
        return this.f9348t;
    }

    public boolean c() {
        throw null;
    }

    public final boolean d(int[] iArr) {
        if (c()) {
            h hVar = this.f9347m;
            ColorStateList colorStateList = hVar.f9352c;
            PorterDuff.Mode mode = hVar.d;
            if (colorStateList == null || mode == null) {
                this.f9346j = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f9346j || colorForState != this.f9344c || mode != this.f9345f) {
                    setColorFilter(colorForState, mode);
                    this.f9344c = colorForState;
                    this.f9345f = mode;
                    this.f9346j = true;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f9348t.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        h hVar = this.f9347m;
        return changingConfigurations | (hVar != null ? hVar.getChangingConfigurations() : 0) | this.f9348t.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        h hVar = this.f9347m;
        if (hVar != null) {
            if (hVar.f9351b != null) {
                hVar.f9350a = getChangingConfigurations();
                return this.f9347m;
            }
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f9348t.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f9348t.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f9348t.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return a.b(this.f9348t);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f9348t.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f9348t.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f9348t.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f9348t.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f9348t.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f9348t.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f9348t.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList = (!c() || (hVar = this.f9347m) == null) ? null : hVar.f9352c;
        if (colorStateList != null) {
            if (!colorStateList.isStateful()) {
            }
        }
        return this.f9348t.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f9348t.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.n && super.mutate() == this) {
            this.f9347m = new h(this.f9347m);
            Drawable drawable = this.f9348t;
            if (drawable != null) {
                drawable.mutate();
            }
            h hVar = this.f9347m;
            if (hVar != null) {
                Drawable drawable2 = this.f9348t;
                hVar.f9351b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9348t;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return a.c(this.f9348t, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        return this.f9348t.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f9348t.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        this.f9348t.setAutoMirrored(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f9348t.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9348t.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f9348t.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f9348t.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return d(iArr) || this.f9348t.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f9348t.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
