package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* renamed from: c  reason: collision with root package name */
    public final e f780c;

    /* renamed from: f  reason: collision with root package name */
    public final k f781f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f782j;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m0.a(context);
        this.f782j = false;
        k0.a(this, getContext());
        e eVar = new e(this);
        this.f780c = eVar;
        eVar.d(attributeSet, i10);
        k kVar = new k(this);
        this.f781f = kVar;
        kVar.b(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f780c;
        if (eVar != null) {
            eVar.a();
        }
        k kVar = this.f781f;
        if (kVar != null) {
            kVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f780c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f780c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        n0 n0Var;
        k kVar = this.f781f;
        if (kVar == null || (n0Var = kVar.f1030b) == null) {
            return null;
        }
        return n0Var.f1047a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        n0 n0Var;
        k kVar = this.f781f;
        if (kVar == null || (n0Var = kVar.f1030b) == null) {
            return null;
        }
        return n0Var.f1048b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.f781f.f1029a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f780c;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f780c;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        k kVar = this.f781f;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        k kVar = this.f781f;
        if (kVar != null && drawable != null && !this.f782j) {
            kVar.d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        k kVar2 = this.f781f;
        if (kVar2 != null) {
            kVar2.a();
            if (this.f782j) {
                return;
            }
            k kVar3 = this.f781f;
            if (kVar3.f1029a.getDrawable() != null) {
                kVar3.f1029a.getDrawable().setLevel(kVar3.d);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f782j = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        k kVar = this.f781f;
        if (kVar != null) {
            kVar.c(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        k kVar = this.f781f;
        if (kVar != null) {
            kVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f780c;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f780c;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        k kVar = this.f781f;
        if (kVar != null) {
            kVar.d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        k kVar = this.f781f;
        if (kVar != null) {
            kVar.e(mode);
        }
    }
}
