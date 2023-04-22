package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;
import java.io.IOException;
import pl.droidsonroids.gif.d;

/* loaded from: classes3.dex */
public class GifTextView extends TextView {

    /* renamed from: c  reason: collision with root package name */
    public d.b f14098c;

    public GifTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet, 0, 0);
    }

    public GifTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b(attributeSet, i10, 0);
    }

    private void setCompoundDrawablesVisible(boolean z10) {
        Drawable[] compoundDrawables;
        Drawable[] compoundDrawablesRelative;
        for (Drawable drawable : getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setVisible(z10, false);
            }
        }
        for (Drawable drawable2 : getCompoundDrawablesRelative()) {
            if (drawable2 != null) {
                drawable2.setVisible(z10, false);
            }
        }
    }

    public final Drawable a(int i10) {
        if (i10 == 0) {
            return null;
        }
        Resources resources = getResources();
        String resourceTypeName = resources.getResourceTypeName(i10);
        if (!isInEditMode() && d.f14124a.contains(resourceTypeName)) {
            try {
                return new b(resources, i10);
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return resources.getDrawable(i10, getContext().getTheme());
    }

    public final void b(AttributeSet attributeSet, int i10, int i11) {
        if (attributeSet != null) {
            Drawable a10 = a(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableLeft", 0));
            Drawable a11 = a(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableTop", 0));
            Drawable a12 = a(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableRight", 0));
            Drawable a13 = a(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableBottom", 0));
            Drawable a14 = a(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableStart", 0));
            Drawable a15 = a(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableEnd", 0));
            if (getLayoutDirection() == 0) {
                if (a14 != null) {
                    a10 = a14;
                }
                if (a15 == null) {
                    a15 = a12;
                }
            } else {
                if (a14 != null) {
                    a12 = a14;
                }
                if (a15 == null) {
                    a15 = a10;
                }
                a10 = a12;
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(a10, a11, a15, a13);
            setBackground(a(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "background", 0)));
            d.b bVar = new d.b(this, attributeSet, i10, i11);
            this.f14098c = bVar;
            if (bVar.f14127b >= 0) {
                for (Drawable drawable : getCompoundDrawables()) {
                    d.a(this.f14098c.f14127b, drawable);
                }
                for (Drawable drawable2 : getCompoundDrawablesRelative()) {
                    d.a(this.f14098c.f14127b, drawable2);
                }
                d.a(this.f14098c.f14127b, getBackground());
            }
        }
        this.f14098c = new d.b();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setCompoundDrawablesVisible(true);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setCompoundDrawablesVisible(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        Drawable[] compoundDrawables = getCompoundDrawables();
        cVar.a(compoundDrawables[0], 0);
        cVar.a(compoundDrawables[1], 1);
        cVar.a(compoundDrawables[2], 2);
        cVar.a(compoundDrawables[3], 3);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        cVar.a(compoundDrawablesRelative[0], 4);
        cVar.a(compoundDrawablesRelative[2], 5);
        cVar.a(getBackground(), 6);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Drawable[] drawableArr = new Drawable[7];
        if (this.f14098c.f14126a) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            System.arraycopy(compoundDrawables, 0, drawableArr, 0, compoundDrawables.length);
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            drawableArr[4] = compoundDrawablesRelative[0];
            drawableArr[5] = compoundDrawablesRelative[2];
            drawableArr[6] = getBackground();
        }
        return new c(super.onSaveInstanceState(), drawableArr);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        setBackground(a(i10));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(a(i10), a(i11), a(i12), a(i13));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        setCompoundDrawablesWithIntrinsicBounds(a(i10), a(i11), a(i12), a(i13));
    }

    public void setFreezesAnimation(boolean z10) {
        this.f14098c.f14126a = z10;
    }
}
