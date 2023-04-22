package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.app.pornhub.R;
import java.util.Objects;

/* loaded from: classes.dex */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView {

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f783m = {16843126};

    /* renamed from: c  reason: collision with root package name */
    public final e f784c;

    /* renamed from: f  reason: collision with root package name */
    public final q f785f;

    /* renamed from: j  reason: collision with root package name */
    public final i f786j;

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m0.a(context);
        k0.a(this, getContext());
        p0 r10 = p0.r(getContext(), attributeSet, f783m, i10, 0);
        if (r10.p(0)) {
            setDropDownBackgroundDrawable(r10.g(0));
        }
        r10.f1055b.recycle();
        e eVar = new e(this);
        this.f784c = eVar;
        eVar.d(attributeSet, i10);
        q qVar = new q(this);
        this.f785f = qVar;
        qVar.e(attributeSet, i10);
        qVar.b();
        i iVar = new i(this);
        this.f786j = iVar;
        iVar.i(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        Objects.requireNonNull(iVar);
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener h10 = iVar.h(keyListener);
            if (h10 == keyListener) {
                return;
            }
            super.setKeyListener(h10);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f784c;
        if (eVar != null) {
            eVar.a();
        }
        q qVar = this.f785f;
        if (qVar != null) {
            qVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f784c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f784c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        cb.e.X(onCreateInputConnection, editorInfo, this);
        return this.f786j.j(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f784c;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f784c;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(f.a.a(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        ((z0.a) this.f786j.f1018f).f18666a.c(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f786j.h(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f784c;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f784c;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        q qVar = this.f785f;
        if (qVar != null) {
            qVar.f(context, i10);
        }
    }
}
