package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.app.pornhub.R;
import com.google.android.material.textfield.TextInputLayout;
import gb.k;

/* loaded from: classes.dex */
public class a extends k {

    /* renamed from: e  reason: collision with root package name */
    public final TextWatcher f7792e;

    /* renamed from: f  reason: collision with root package name */
    public final View.OnFocusChangeListener f7793f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.f f7794g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout.g f7795h;

    /* renamed from: i  reason: collision with root package name */
    public AnimatorSet f7796i;

    /* renamed from: j  reason: collision with root package name */
    public ValueAnimator f7797j;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0095a implements TextWatcher {
        public C0095a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.f9912a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.e(a.d(aVar));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            a aVar = a.this;
            aVar.e(a.d(aVar));
        }
    }

    /* loaded from: classes.dex */
    public class c implements TextInputLayout.f {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.d(a.this));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(a.this.f7793f);
            a aVar = a.this;
            aVar.f9914c.setOnFocusChangeListener(aVar.f7793f);
            editText.removeTextChangedListener(a.this.f7792e);
            editText.addTextChangedListener(a.this.f7792e);
        }
    }

    /* loaded from: classes.dex */
    public class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0096a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ EditText f7802c;

            public RunnableC0096a(EditText editText) {
                this.f7802c = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f7802c.removeTextChangedListener(a.this.f7792e);
            }
        }

        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i10 == 2) {
                editText.post(new RunnableC0096a(editText));
                if (editText.getOnFocusChangeListener() == a.this.f7793f) {
                    editText.setOnFocusChangeListener(null);
                }
                View.OnFocusChangeListener onFocusChangeListener = a.this.f9914c.getOnFocusChangeListener();
                a aVar = a.this;
                if (onFocusChangeListener == aVar.f7793f) {
                    aVar.f9914c.setOnFocusChangeListener(null);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f9912a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f9912a.q();
        }
    }

    public a(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f7792e = new C0095a();
        this.f7793f = new b();
        this.f7794g = new c();
        this.f7795h = new d();
    }

    public static boolean d(a aVar) {
        EditText editText = aVar.f9912a.getEditText();
        if (editText != null) {
            if (!editText.hasFocus()) {
                if (aVar.f9914c.hasFocus()) {
                }
            }
            if (editText.getText().length() > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // gb.k
    public void a() {
        TextInputLayout textInputLayout = this.f9912a;
        int i10 = this.d;
        if (i10 == 0) {
            i10 = R.drawable.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f9912a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.f9912a.setEndIconOnClickListener(new e());
        this.f9912a.a(this.f7794g);
        this.f9912a.f7783z0.add(this.f7795h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(ga.a.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new gb.d(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = ga.a.f9886a;
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new gb.c(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7796i = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f7796i.addListener(new gb.a(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new gb.c(this));
        this.f7797j = ofFloat3;
        ofFloat3.addListener(new gb.b(this));
    }

    @Override // gb.k
    public void c(boolean z10) {
        if (this.f9912a.getSuffixText() == null) {
            return;
        }
        e(z10);
    }

    public final void e(boolean z10) {
        boolean z11 = this.f9912a.m() == z10;
        if (z10 && !this.f7796i.isRunning()) {
            this.f7797j.cancel();
            this.f7796i.start();
            if (z11) {
                this.f7796i.end();
            }
        } else if (z10) {
        } else {
            this.f7796i.cancel();
            this.f7797j.start();
            if (z11) {
                this.f7797j.end();
            }
        }
    }
}
