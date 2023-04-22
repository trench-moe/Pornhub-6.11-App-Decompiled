package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.app.pornhub.R;
import com.google.android.material.textfield.TextInputLayout;
import gb.k;
import ua.i;

/* loaded from: classes.dex */
public class c extends k {

    /* renamed from: e  reason: collision with root package name */
    public final TextWatcher f7827e;

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.f f7828f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.g f7829g;

    /* loaded from: classes.dex */
    public class a extends i {
        public a() {
        }

        @Override // ua.i, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            c cVar = c.this;
            cVar.f9914c.setChecked(!c.d(cVar));
        }
    }

    /* loaded from: classes.dex */
    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            c cVar = c.this;
            cVar.f9914c.setChecked(!c.d(cVar));
            editText.removeTextChangedListener(c.this.f7827e);
            editText.addTextChangedListener(c.this.f7827e);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0099c implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.c$c$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ EditText f7833c;

            public a(EditText editText) {
                this.f7833c = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f7833c.removeTextChangedListener(c.this.f7827e);
            }
        }

        public C0099c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i10 == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new a(editText));
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = c.this.f9912a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (c.d(c.this)) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            c.this.f9912a.q();
        }
    }

    public c(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f7827e = new a();
        this.f7828f = new b();
        this.f7829g = new C0099c();
    }

    public static boolean d(c cVar) {
        EditText editText = cVar.f9912a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // gb.k
    public void a() {
        TextInputLayout textInputLayout = this.f9912a;
        int i10 = this.d;
        if (i10 == 0) {
            i10 = R.drawable.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f9912a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.password_toggle_content_description));
        this.f9912a.setEndIconOnClickListener(new d());
        this.f9912a.a(this.f7828f);
        this.f9912a.f7783z0.add(this.f7829g);
        EditText editText = this.f9912a.getEditText();
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
