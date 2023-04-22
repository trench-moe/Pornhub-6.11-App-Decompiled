package com.app.pornhub.common.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.app.pornhub.R;
import com.app.pornhub.common.util.PasscodeConstants$SecurityMode;
import com.appsflyer.oaid.BuildConfig;

@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class PasscodeCheckActivity extends Activity {
    public ObjectAnimator A;

    /* renamed from: c  reason: collision with root package name */
    public EditText f4293c;

    /* renamed from: f  reason: collision with root package name */
    public EditText f4294f;

    /* renamed from: j  reason: collision with root package name */
    public EditText f4295j;

    /* renamed from: m  reason: collision with root package name */
    public EditText f4296m;
    public TextView n;

    /* renamed from: t  reason: collision with root package name */
    public TextView f4297t;

    /* renamed from: u  reason: collision with root package name */
    public ObjectAnimator f4298u;

    /* renamed from: w  reason: collision with root package name */
    public ObjectAnimator f4299w;
    public ObjectAnimator y;

    /* renamed from: z  reason: collision with root package name */
    public ObjectAnimator f4300z;

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence.length() != 0) {
                if (charSequence.length() > 1) {
                    PasscodeCheckActivity.this.f4293c.setText(charSequence.subSequence(0, 1));
                }
                if (PasscodeCheckActivity.a(PasscodeCheckActivity.this)) {
                    PasscodeCheckActivity.this.c();
                }
                PasscodeCheckActivity.this.f4294f.requestFocus();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence.length() != 0) {
                if (charSequence.length() > 1) {
                    PasscodeCheckActivity.this.f4294f.setText(charSequence.subSequence(0, 1));
                }
                if (PasscodeCheckActivity.a(PasscodeCheckActivity.this)) {
                    PasscodeCheckActivity.this.c();
                }
                PasscodeCheckActivity.this.f4295j.requestFocus();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence.length() != 0) {
                if (charSequence.length() > 1) {
                    PasscodeCheckActivity.this.f4295j.setText(charSequence.subSequence(0, 1));
                }
                if (PasscodeCheckActivity.a(PasscodeCheckActivity.this)) {
                    PasscodeCheckActivity.this.c();
                }
                PasscodeCheckActivity.this.f4296m.requestFocus();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence.length() != 0) {
                if (charSequence.length() > 1) {
                    PasscodeCheckActivity.this.f4296m.setText(charSequence.subSequence(0, 1));
                }
                if (PasscodeCheckActivity.a(PasscodeCheckActivity.this)) {
                    PasscodeCheckActivity.this.c();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnKeyListener {
        public e() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (i10 == 67 && PasscodeCheckActivity.this.f4293c.hasFocus()) {
                PasscodeCheckActivity.this.b();
                return true;
            }
            if (i10 == 66 && PasscodeCheckActivity.a(PasscodeCheckActivity.this)) {
                PasscodeCheckActivity.this.c();
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnKeyListener {
        public f() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (i10 == 67 && PasscodeCheckActivity.this.f4294f.hasFocus()) {
                PasscodeCheckActivity.this.b();
                return true;
            }
            if (i10 == 66 && PasscodeCheckActivity.a(PasscodeCheckActivity.this)) {
                PasscodeCheckActivity.this.c();
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (i10 == 67 && PasscodeCheckActivity.this.f4295j.hasFocus()) {
                PasscodeCheckActivity.this.b();
                return true;
            } else if (i10 == 66 && PasscodeCheckActivity.a(PasscodeCheckActivity.this)) {
                PasscodeCheckActivity.this.c();
                return false;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements View.OnKeyListener {
        public h() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (i10 == 67 && PasscodeCheckActivity.this.f4296m.hasFocus()) {
                PasscodeCheckActivity.this.b();
                return true;
            }
            if (i10 == 66 && PasscodeCheckActivity.a(PasscodeCheckActivity.this)) {
                PasscodeCheckActivity.this.c();
            }
            return false;
        }
    }

    public static boolean a(PasscodeCheckActivity passcodeCheckActivity) {
        return passcodeCheckActivity.f4293c.getText().length() > 0 && passcodeCheckActivity.f4294f.getText().length() > 0 && passcodeCheckActivity.f4295j.getText().length() > 0 && passcodeCheckActivity.f4296m.getText().length() > 0;
    }

    public final void b() {
        this.f4293c.setText(BuildConfig.FLAVOR);
        this.f4294f.setText(BuildConfig.FLAVOR);
        this.f4295j.setText(BuildConfig.FLAVOR);
        this.f4296m.setText(BuildConfig.FLAVOR);
        this.f4293c.requestFocus();
    }

    public void c() {
        this.f4297t.setVisibility(8);
        String str = this.f4293c.getText().toString() + this.f4294f.getText().toString() + this.f4295j.getText().toString() + this.f4296m.getText().toString();
        SharedPreferences sharedPreferences = getSharedPreferences("persistent_prefs", 0);
        if (Integer.parseInt(str) == sharedPreferences.getInt("passcodeLockValue", -1)) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            PasscodeConstants$SecurityMode passcodeConstants$SecurityMode = PasscodeConstants$SecurityMode.LOCKED;
            edit.putInt("security_mode", passcodeConstants$SecurityMode.b());
            edit.apply();
            Intent intent = new Intent();
            intent.putExtra("security_mode", passcodeConstants$SecurityMode.b());
            setResult(-1, intent);
            finish();
            return;
        }
        b();
        this.A.start();
        this.f4298u.start();
        this.f4299w.start();
        this.y.start();
        this.f4300z.start();
        this.f4293c.requestFocus();
        this.n.setText("Enter Passcode");
        this.f4297t.setText("Oops! The passcode is incorrect, please try again.");
        this.f4297t.setVisibility(0);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        startActivity(intent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_check_passcode);
        this.f4293c = (EditText) findViewById(R.id.editText1);
        this.f4294f = (EditText) findViewById(R.id.editText2);
        this.f4295j = (EditText) findViewById(R.id.editText3);
        this.f4296m = (EditText) findViewById(R.id.editText4);
        this.n = (TextView) findViewById(R.id.passcodeTitle);
        this.f4297t = (TextView) findViewById(R.id.error);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f4293c, "rotationY", 360.0f);
        this.f4298u = ofFloat;
        ofFloat.setDuration(800L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f4294f, "rotationY", 360.0f);
        this.f4299w = ofFloat2;
        ofFloat2.setDuration(800L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f4295j, "rotationY", 360.0f);
        this.y = ofFloat3;
        ofFloat3.setDuration(800L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f4296m, "rotationY", 360.0f);
        this.f4300z = ofFloat4;
        ofFloat4.setDuration(800L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.n, "rotationX", -360.0f);
        this.A = ofFloat5;
        ofFloat5.setDuration(1000L);
        this.f4293c.addTextChangedListener(new a());
        this.f4294f.addTextChangedListener(new b());
        this.f4295j.addTextChangedListener(new c());
        this.f4296m.addTextChangedListener(new d());
        this.f4293c.setOnKeyListener(new e());
        this.f4294f.setOnKeyListener(new f());
        this.f4295j.setOnKeyListener(new g());
        this.f4296m.setOnKeyListener(new h());
    }
}
