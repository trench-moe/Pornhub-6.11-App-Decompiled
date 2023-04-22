package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox {

    /* renamed from: c  reason: collision with root package name */
    public final g f765c;

    /* renamed from: f  reason: collision with root package name */
    public final e f766f;

    /* renamed from: j  reason: collision with root package name */
    public final q f767j;

    /* renamed from: m  reason: collision with root package name */
    public j f768m;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m0.a(context);
        k0.a(this, getContext());
        g gVar = new g(this);
        this.f765c = gVar;
        gVar.b(attributeSet, i10);
        e eVar = new e(this);
        this.f766f = eVar;
        eVar.d(attributeSet, i10);
        q qVar = new q(this);
        this.f767j = qVar;
        qVar.e(attributeSet, i10);
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    private j getEmojiTextViewHelper() {
        if (this.f768m == null) {
            this.f768m = new j(this);
        }
        return this.f768m;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f766f;
        if (eVar != null) {
            eVar.a();
        }
        q qVar = this.f767j;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f766f;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f766f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        g gVar = this.f765c;
        if (gVar != null) {
            return gVar.f998b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        g gVar = this.f765c;
        if (gVar != null) {
            return gVar.f999c;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().f1024b.f18680a.c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f766f;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f766f;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(f.a.a(getContext(), i10));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        g gVar = this.f765c;
        if (gVar != null) {
            if (gVar.f1001f) {
                gVar.f1001f = false;
            } else {
                gVar.f1001f = true;
                gVar.a();
            }
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().f1024b.f18680a.d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1024b.f18680a.a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f766f;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f766f;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        g gVar = this.f765c;
        if (gVar != null) {
            gVar.f998b = colorStateList;
            gVar.d = true;
            gVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        g gVar = this.f765c;
        if (gVar != null) {
            gVar.f999c = mode;
            gVar.f1000e = true;
            gVar.a();
        }
    }
}
