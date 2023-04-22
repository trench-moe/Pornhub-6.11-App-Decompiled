package com.app.pornhub.common.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
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
import java.util.Date;

/* loaded from: classes.dex */
public class PasscodeSetterActivity extends Activity {
    public ObjectAnimator A;
    public ObjectAnimator B;

    /* renamed from: c  reason: collision with root package name */
    public EditText f4309c;

    /* renamed from: f  reason: collision with root package name */
    public EditText f4310f;

    /* renamed from: j  reason: collision with root package name */
    public EditText f4311j;

    /* renamed from: m  reason: collision with root package name */
    public EditText f4312m;
    public TextView n;

    /* renamed from: t  reason: collision with root package name */
    public TextView f4313t;

    /* renamed from: u  reason: collision with root package name */
    public int f4314u = -1;

    /* renamed from: w  reason: collision with root package name */
    public ObjectAnimator f4315w;
    public ObjectAnimator y;

    /* renamed from: z  reason: collision with root package name */
    public ObjectAnimator f4316z;

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
                    PasscodeSetterActivity.this.f4309c.setText(charSequence.subSequence(0, 1));
                }
                if (PasscodeSetterActivity.a(PasscodeSetterActivity.this)) {
                    PasscodeSetterActivity.this.c();
                }
                PasscodeSetterActivity.this.f4310f.requestFocus();
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
                    PasscodeSetterActivity.this.f4310f.setText(charSequence.subSequence(0, 1));
                }
                if (PasscodeSetterActivity.a(PasscodeSetterActivity.this)) {
                    PasscodeSetterActivity.this.c();
                }
                PasscodeSetterActivity.this.f4311j.requestFocus();
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
                    PasscodeSetterActivity.this.f4311j.setText(charSequence.subSequence(0, 1));
                }
                if (PasscodeSetterActivity.a(PasscodeSetterActivity.this)) {
                    PasscodeSetterActivity.this.c();
                }
                PasscodeSetterActivity.this.f4312m.requestFocus();
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
                    PasscodeSetterActivity.this.f4312m.setText(charSequence.subSequence(0, 1));
                }
                if (PasscodeSetterActivity.a(PasscodeSetterActivity.this)) {
                    PasscodeSetterActivity.this.c();
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
            if (i10 == 67 && PasscodeSetterActivity.this.f4309c.hasFocus()) {
                PasscodeSetterActivity.this.b();
                return true;
            }
            if (i10 == 66 && PasscodeSetterActivity.a(PasscodeSetterActivity.this)) {
                PasscodeSetterActivity.this.c();
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
            if (i10 == 67 && PasscodeSetterActivity.this.f4310f.hasFocus()) {
                PasscodeSetterActivity.this.b();
                return true;
            }
            if (i10 == 66 && PasscodeSetterActivity.a(PasscodeSetterActivity.this)) {
                PasscodeSetterActivity.this.c();
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
            if (i10 == 67 && PasscodeSetterActivity.this.f4311j.hasFocus()) {
                PasscodeSetterActivity.this.b();
                return true;
            }
            if (i10 == 66 && PasscodeSetterActivity.a(PasscodeSetterActivity.this)) {
                PasscodeSetterActivity.this.c();
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class h implements View.OnKeyListener {
        public h() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (i10 == 67 && PasscodeSetterActivity.this.f4312m.hasFocus()) {
                PasscodeSetterActivity.this.b();
                return true;
            }
            if (i10 == 66 && PasscodeSetterActivity.a(PasscodeSetterActivity.this)) {
                PasscodeSetterActivity.this.c();
            }
            return false;
        }
    }

    public static boolean a(PasscodeSetterActivity passcodeSetterActivity) {
        return passcodeSetterActivity.f4309c.getText().length() > 0 && passcodeSetterActivity.f4310f.getText().length() > 0 && passcodeSetterActivity.f4311j.getText().length() > 0 && passcodeSetterActivity.f4312m.getText().length() > 0;
    }

    public final void b() {
        this.f4309c.setText(BuildConfig.FLAVOR);
        this.f4310f.setText(BuildConfig.FLAVOR);
        this.f4311j.setText(BuildConfig.FLAVOR);
        this.f4312m.setText(BuildConfig.FLAVOR);
        this.f4309c.requestFocus();
    }

    public void c() {
        this.n.setVisibility(8);
        String str = this.f4309c.getText().toString() + this.f4310f.getText().toString() + this.f4311j.getText().toString() + this.f4312m.getText().toString();
        if (this.f4314u == -1) {
            this.f4314u = Integer.parseInt(str);
            d();
            this.f4313t.setText("Confirm Passcode");
            return;
        }
        if (this.f4314u != Integer.parseInt(str)) {
            this.f4314u = -1;
            d();
            this.f4313t.setText("Enter Passcode");
            this.n.setText("Oops! The passcode and the confimation are not the same, please enter the passcode again.");
            this.n.setVisibility(0);
            return;
        }
        SharedPreferences.Editor edit = getSharedPreferences("persistent_prefs", 0).edit();
        edit.putInt("passcodeLockValue", this.f4314u);
        edit.putInt("security_mode", PasscodeConstants$SecurityMode.LOCKED.b());
        edit.putLong("time_name", new Date().getTime());
        edit.apply();
        setResult(-1);
        finish();
    }

    @SuppressLint({"NewApi"})
    public final void d() {
        b();
        this.B.start();
        this.f4315w.start();
        this.y.start();
        this.f4316z.start();
        this.A.start();
        this.f4309c.requestFocus();
    }

    @Override // android.app.Activity
    @SuppressLint({"NewApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_passcode_setter);
        this.f4309c = (EditText) findViewById(R.id.editText1);
        this.f4310f = (EditText) findViewById(R.id.editText2);
        this.f4311j = (EditText) findViewById(R.id.editText3);
        this.f4312m = (EditText) findViewById(R.id.editText4);
        this.f4313t = (TextView) findViewById(R.id.passcodeTitle);
        this.n = (TextView) findViewById(R.id.error);
        ((TextView) findViewById(R.id.description)).setText(R.string.passcodeDescription);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f4309c, "rotationY", 360.0f);
        this.f4315w = ofFloat;
        ofFloat.setDuration(800L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f4310f, "rotationY", 360.0f);
        this.y = ofFloat2;
        ofFloat2.setDuration(800L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f4311j, "rotationY", 360.0f);
        this.f4316z = ofFloat3;
        ofFloat3.setDuration(800L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f4312m, "rotationY", 360.0f);
        this.A = ofFloat4;
        ofFloat4.setDuration(800L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f4313t, "rotationX", -360.0f);
        this.B = ofFloat5;
        ofFloat5.setDuration(1000L);
        this.f4309c.addTextChangedListener(new a());
        this.f4310f.addTextChangedListener(new b());
        this.f4311j.addTextChangedListener(new c());
        this.f4312m.addTextChangedListener(new d());
        this.f4309c.setOnKeyListener(new e());
        this.f4310f.setOnKeyListener(new f());
        this.f4311j.setOnKeyListener(new g());
        this.f4312m.setOnKeyListener(new h());
    }
}
