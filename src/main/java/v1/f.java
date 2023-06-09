package v1;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public abstract class f extends Drawable implements f0.d {

    /* renamed from: c  reason: collision with root package name */
    public Drawable f15937c;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.setLevel(i10) : super.onLevelChange(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.setChangingConfigurations(i10);
        } else {
            super.setChangingConfigurations(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.setColorFilter(i10, mode);
        } else {
            super.setColorFilter(i10, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.setFilterBitmap(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
