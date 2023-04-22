package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements q0.b, q0.j {

    /* renamed from: c  reason: collision with root package name */
    public final e f762c;

    /* renamed from: f  reason: collision with root package name */
    public final q f763f;

    /* renamed from: j  reason: collision with root package name */
    public j f764j;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m0.a(context);
        k0.a(this, getContext());
        e eVar = new e(this);
        this.f762c = eVar;
        eVar.d(attributeSet, i10);
        q qVar = new q(this);
        this.f763f = qVar;
        qVar.e(attributeSet, i10);
        qVar.b();
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    private j getEmojiTextViewHelper() {
        if (this.f764j == null) {
            this.f764j = new j(this);
        }
        return this.f764j;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f762c;
        if (eVar != null) {
            eVar.a();
        }
        q qVar = this.f763f;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (q0.b.f14158i) {
            return super.getAutoSizeMaxTextSize();
        }
        q qVar = this.f763f;
        if (qVar != null) {
            return Math.round(qVar.f1064i.f1084e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (q0.b.f14158i) {
            return super.getAutoSizeMinTextSize();
        }
        q qVar = this.f763f;
        if (qVar != null) {
            return Math.round(qVar.f1064i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (q0.b.f14158i) {
            return super.getAutoSizeStepGranularity();
        }
        q qVar = this.f763f;
        if (qVar != null) {
            return Math.round(qVar.f1064i.f1083c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (q0.b.f14158i) {
            return super.getAutoSizeTextAvailableSizes();
        }
        q qVar = this.f763f;
        return qVar != null ? qVar.f1064i.f1085f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (q0.b.f14158i) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        q qVar = this.f763f;
        if (qVar != null) {
            return qVar.f1064i.f1081a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return q0.h.g(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f762c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f762c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        n0 n0Var = this.f763f.f1063h;
        if (n0Var != null) {
            return n0Var.f1047a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        n0 n0Var = this.f763f.f1063h;
        if (n0Var != null) {
            return n0Var.f1048b;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        q qVar = this.f763f;
        if (qVar != null && !q0.b.f14158i) {
            qVar.f1064i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        q qVar = this.f763f;
        if (qVar != null && !q0.b.f14158i && qVar.d()) {
            this.f763f.f1064i.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().f1024b.f18680a.c(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (q0.b.f14158i) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        q qVar = this.f763f;
        if (qVar != null) {
            qVar.h(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (q0.b.f14158i) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        q qVar = this.f763f;
        if (qVar != null) {
            qVar.i(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (q0.b.f14158i) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        q qVar = this.f763f;
        if (qVar != null) {
            qVar.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f762c;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f762c;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(q0.h.h(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().f1024b.f18680a.d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1024b.f18680a.a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        q qVar = this.f763f;
        if (qVar != null) {
            qVar.f1057a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f762c;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f762c;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // q0.j
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f763f.k(colorStateList);
        this.f763f.b();
    }

    @Override // q0.j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f763f.l(mode);
        this.f763f.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        q qVar = this.f763f;
        if (qVar != null) {
            qVar.f(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        boolean z10 = q0.b.f14158i;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        q qVar = this.f763f;
        if (qVar != null && !z10 && !qVar.d()) {
            qVar.f1064i.f(i10, f10);
        }
    }
}
