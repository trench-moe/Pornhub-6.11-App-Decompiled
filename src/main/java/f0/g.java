package f0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: w  reason: collision with root package name */
    public static Method f9349w;

    public g(Drawable drawable) {
        super(drawable);
        e();
    }

    public g(h hVar, Resources resources) {
        super(hVar, resources);
        e();
    }

    @Override // f0.f
    public boolean c() {
        boolean z10 = false;
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.f9348t;
            if (!(drawable instanceof GradientDrawable)) {
                if (!(drawable instanceof DrawableContainer)) {
                    if (!(drawable instanceof InsetDrawable)) {
                        if (drawable instanceof RippleDrawable) {
                        }
                    }
                }
            }
            z10 = true;
        }
        return z10;
    }

    public final void e() {
        if (f9349w == null) {
            try {
                f9349w = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f9348t.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f9348t.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f9348t;
        if (drawable != null && (method = f9349w) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e10);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        this.f9348t.setHotspot(f10, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f9348t.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // f0.f, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // f0.f, android.graphics.drawable.Drawable
    public void setTint(int i10) {
        if (c()) {
            super.setTint(i10);
        } else {
            this.f9348t.setTint(i10);
        }
    }

    @Override // f0.f, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (!c()) {
            this.f9348t.setTintList(colorStateList);
            return;
        }
        this.f9347m.f9352c = colorStateList;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (!c()) {
            this.f9348t.setTintMode(mode);
            return;
        }
        this.f9347m.d = mode;
        d(getState());
    }
}
