package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import l0.b;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements q0.j, q0.b {

    /* renamed from: c  reason: collision with root package name */
    public final e f812c;

    /* renamed from: f  reason: collision with root package name */
    public final q f813f;

    /* renamed from: j  reason: collision with root package name */
    public final p f814j;

    /* renamed from: m  reason: collision with root package name */
    public j f815m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public Future<l0.b> f816t;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m0.a(context);
        this.n = false;
        k0.a(this, getContext());
        e eVar = new e(this);
        this.f812c = eVar;
        eVar.d(attributeSet, i10);
        q qVar = new q(this);
        this.f813f = qVar;
        qVar.e(attributeSet, i10);
        qVar.b();
        this.f814j = new p(this);
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    private j getEmojiTextViewHelper() {
        if (this.f815m == null) {
            this.f815m = new j(this);
        }
        return this.f815m;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f812c;
        if (eVar != null) {
            eVar.a();
        }
        q qVar = this.f813f;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (q0.b.f14158i) {
            return super.getAutoSizeMaxTextSize();
        }
        q qVar = this.f813f;
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
        q qVar = this.f813f;
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
        q qVar = this.f813f;
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
        q qVar = this.f813f;
        return qVar != null ? qVar.f1064i.f1085f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        int i10 = 0;
        if (q0.b.f14158i) {
            if (super.getAutoSizeTextType() == 1) {
                i10 = 1;
            }
            return i10;
        }
        q qVar = this.f813f;
        if (qVar != null) {
            return qVar.f1064i.f1081a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return q0.h.g(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f812c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f812c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        n0 n0Var = this.f813f.f1063h;
        if (n0Var != null) {
            return n0Var.f1047a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        n0 n0Var = this.f813f.f1063h;
        if (n0Var != null) {
            return n0Var.f1048b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<l0.b> future = this.f816t;
        if (future != null) {
            try {
                this.f816t = null;
                q0.h.e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        p pVar;
        if (Build.VERSION.SDK_INT < 28 && (pVar = this.f814j) != null) {
            return pVar.d();
        }
        return super.getTextClassifier();
    }

    public b.a getTextMetricsParamsCompat() {
        return q0.h.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f813f.g(this, onCreateInputConnection, editorInfo);
        cb.e.X(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        q qVar = this.f813f;
        if (qVar != null && !q0.b.f14158i) {
            qVar.f1064i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Future<l0.b> future = this.f816t;
        if (future != null) {
            try {
                this.f816t = null;
                q0.h.e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        q qVar = this.f813f;
        if (qVar != null && !q0.b.f14158i && qVar.d()) {
            this.f813f.f1064i.a();
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
        q qVar = this.f813f;
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
        q qVar = this.f813f;
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
        q qVar = this.f813f;
        if (qVar != null) {
            qVar.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f812c;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f812c;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f813f;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f813f;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? f.a.a(context, i10) : null, i11 != 0 ? f.a.a(context, i11) : null, i12 != 0 ? f.a.a(context, i12) : null, i13 != 0 ? f.a.a(context, i13) : null);
        q qVar = this.f813f;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f813f;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a10 = i10 != 0 ? f.a.a(context, i10) : null;
        Drawable a11 = i11 != 0 ? f.a.a(context, i11) : null;
        Drawable a12 = i12 != 0 ? f.a.a(context, i12) : null;
        if (i13 != 0) {
            drawable = f.a.a(context, i13);
        }
        setCompoundDrawablesWithIntrinsicBounds(a10, a11, a12, drawable);
        q qVar = this.f813f;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f813f;
        if (qVar != null) {
            qVar.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            q0.h.b(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            q0.h.c(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        q0.h.d(this, i10);
    }

    public void setPrecomputedText(l0.b bVar) {
        q0.h.e(this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f812c;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f812c;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // q0.j
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f813f.k(colorStateList);
        this.f813f.b();
    }

    @Override // q0.j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f813f.l(mode);
        this.f813f.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        q qVar = this.f813f;
        if (qVar != null) {
            qVar.f(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        p pVar;
        if (Build.VERSION.SDK_INT < 28 && (pVar = this.f814j) != null) {
            pVar.f1053b = textClassifier;
            return;
        }
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<l0.b> future) {
        this.f816t = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f12167b;
        int i11 = 1;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i11 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i11 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i11 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i11 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i11 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i11 = 7;
            }
        }
        setTextDirection(i11);
        if (i10 >= 23) {
            getPaint().set(aVar.f12166a);
            setBreakStrategy(aVar.f12168c);
            setHyphenationFrequency(aVar.d);
            return;
        }
        float textScaleX = aVar.f12166a.getTextScaleX();
        getPaint().set(aVar.f12166a);
        if (textScaleX == getTextScaleX()) {
            setTextScaleX((textScaleX / 2.0f) + 1.0f);
        }
        setTextScaleX(textScaleX);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        boolean z10 = q0.b.f14158i;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        q qVar = this.f813f;
        if (qVar != null && !z10 && !qVar.d()) {
            qVar.f1064i.f(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.n) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i10 > 0) {
            Context context = getContext();
            e0.k kVar = e0.e.f8973a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i10);
        }
        this.n = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.n = false;
        }
    }
}
