package com.app.pornhub.view.login;

import a1.a;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import b3.e;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivitySignupBinding;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.login.SignupActivity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.snackbar.Snackbar;
import f3.f;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function3;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.c;
import kotlin.jvm.internal.Intrinsics;
import q3.d;
import v3.b;
import x2.a0;
import x2.h;
import x2.j;
import x2.k;
import x2.k0;
import x2.n;

/* loaded from: classes.dex */
public class SignupActivity extends b {
    public static final /* synthetic */ int S = 0;
    public c K;
    public d L;
    public f M;
    public ActivitySignupBinding N;
    public ProgressDialog O;
    public Disposable P;
    public CompositeDisposable Q;
    public final Pattern R = Pattern.compile("(.)\\1+");

    public static Intent D(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, SignupActivity.class);
        return intent;
    }

    public final String C() {
        return a.i(this.N.f4472e);
    }

    public final String E() {
        return a.i(this.N.f4476i);
    }

    public final String F() {
        return a.i(this.N.f4477j);
    }

    public final void G(String str) {
        if (str.equals(getString(R.string.error_email_taken))) {
            this.N.f4473f.setError(str);
            this.N.f4472e.requestFocus();
        } else if (str.equals(getString(R.string.error_username_taken))) {
            this.N.f4474g.setError(str);
            this.N.f4476i.requestFocus();
        } else if (!str.equals(getString(R.string.error_password_format))) {
            Snackbar.l(this.N.d, str, 0).n();
        } else {
            this.N.f4475h.setError(str);
            this.N.f4477j.requestFocus();
        }
    }

    public final void H(String str) {
        if (I() && J() && K()) {
            this.N.d.clearFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(this.N.d.getWindowToken(), 0);
            }
            c cVar = this.K;
            String username = E();
            String password = F();
            String email = C();
            Objects.requireNonNull(cVar);
            Intrinsics.checkNotNullParameter(username, "username");
            Intrinsics.checkNotNullParameter(password, "password");
            Intrinsics.checkNotNullParameter(email, "email");
            Observable startWith = ((e) cVar.f11775f).r(username, password, email, str).toObservable().map(a0.f17677z).onErrorReturn(k0.f17769t).startWith((Observable) UseCaseResult.a.f4910a);
            Intrinsics.checkNotNullExpressionValue(startWith, "currentUserRepository.si…th(UseCaseResult.Loading)");
            this.Q.add(startWith.subscribe(new h(this, 12)));
        }
    }

    public final boolean I() {
        String C = C();
        if (C.isEmpty()) {
            this.N.f4473f.setError(getString(R.string.email_required));
            this.N.f4472e.requestFocus();
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(C).matches()) {
            this.N.f4473f.setError(getString(R.string.enter_valid_email));
            this.N.f4472e.requestFocus();
            return false;
        } else if (C.length() <= 50) {
            this.N.f4473f.setError(null);
            return true;
        } else {
            this.N.f4473f.setError(getString(R.string.email_too_long));
            this.N.f4472e.requestFocus();
            return false;
        }
    }

    public final boolean J() {
        String E = E();
        if (!E.isEmpty() && E.length() >= 3) {
            if (E.length() <= 18) {
                this.N.f4474g.setError(null);
                return true;
            }
            this.N.f4474g.setError(getString(R.string.username_too_long));
            this.N.f4476i.requestFocus();
            return false;
        }
        this.N.f4474g.setError(String.format(getString(R.string.at_least_x_chars), 3));
        this.N.f4476i.requestFocus();
        return false;
    }

    public final boolean K() {
        boolean z10;
        String F = F();
        if (!F.isEmpty() && F.length() >= 6) {
            Matcher matcher = this.R.matcher(F);
            while (true) {
                if (!matcher.find()) {
                    z10 = false;
                    break;
                } else if (matcher.group().length() >= 3) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                this.N.f4475h.setError(getString(R.string.three_identical_chars_in_row));
                this.N.f4477j.requestFocus();
                return false;
            } else if (F.length() <= 40) {
                this.N.f4475h.setError(null);
                return true;
            } else {
                this.N.f4475h.setError(getString(R.string.password_too_long));
                this.N.f4477j.requestFocus();
                return false;
            }
        }
        this.N.f4475h.setError(String.format(getString(R.string.at_least_x_chars), 6));
        this.N.f4477j.requestFocus();
        return false;
    }

    @Override // v3.b, y4.a
    public void i() {
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivitySignupBinding inflate = ActivitySignupBinding.inflate(getLayoutInflater());
        this.N = inflate;
        setContentView(inflate.f4469a);
        if (bundle != null) {
            this.N.f4476i.setText(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
            this.N.f4472e.setText(bundle.getString("email"));
            this.N.f4477j.setText(bundle.getString("passwd"));
        }
        this.N.f4471c.setOnClickListener(new u3.a(this, 14));
        this.N.f4470b.setOnClickListener(new b4.b(this, 11));
        this.N.f4479l.setOnClickListener(new x3.a(this, 9));
        this.N.f4478k.setOnClickListener(new x3.b(this, 11));
        this.N.d.setOnClickListener(new u3.b(this, 9));
        this.N.f4477j.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: w4.c
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                SignupActivity signupActivity = SignupActivity.this;
                int i11 = SignupActivity.S;
                Objects.requireNonNull(signupActivity);
                kf.a.f12078a.c("AKLSDNAKJSNDJKASDBL %s", Integer.valueOf(i10));
                if (i10 == 6) {
                    signupActivity.H(null);
                    return true;
                }
                return false;
            }
        });
        this.P = Observable.combineLatest(new wc.a(this.N.f4476i).skip(1L).map(new n(this, 7)), new wc.a(this.N.f4472e).skip(1L).map(new j(this, 5)), new wc.a(this.N.f4477j).skip(1L).map(new k(this, 8)), new Function3() { // from class: w4.f
            @Override // io.reactivex.functions.Function3
            public final Object apply(Object obj, Object obj2, Object obj3) {
                SignupActivity signupActivity = SignupActivity.this;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                Boolean bool3 = (Boolean) obj3;
                boolean z10 = true;
                signupActivity.N.d.setEnabled(bool.booleanValue() && bool2.booleanValue() && bool3.booleanValue());
                int b10 = c0.a.b(signupActivity, (bool.booleanValue() & bool2.booleanValue()) & bool3.booleanValue() ? R.color.orange : R.color.pornhub_grey_light);
                int b11 = c0.a.b(signupActivity, (bool.booleanValue() & bool2.booleanValue()) & bool3.booleanValue() ? R.color.black : R.color.pornhub_txt_grey);
                signupActivity.N.d.setBackgroundColor(b10);
                signupActivity.N.d.setTextColor(b11);
                return Boolean.valueOf((bool.booleanValue() && bool2.booleanValue() && bool3.booleanValue()) ? false : false);
            }
        }).subscribe();
        this.Q = new CompositeDisposable();
    }

    @Override // y4.b, e.g, androidx.fragment.app.o, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ProgressDialog progressDialog = this.O;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.O.dismiss();
        }
        this.P.dispose();
        this.Q.clear();
    }

    @Override // y4.b, androidx.fragment.app.o, android.app.Activity
    public void onResume() {
        super.onResume();
        this.Q.add(this.M.f9375a.n().subscribe(new Action() { // from class: w4.d
            @Override // io.reactivex.functions.Action
            public final void run() {
                int i10 = SignupActivity.S;
                kf.a.f12078a.c("Fresh signup token obtained", new Object[0]);
            }
        }, new Consumer() { // from class: w4.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                int i10 = SignupActivity.S;
                kf.a.f12078a.d((Throwable) obj, "Error obtaining sugnup token!", new Object[0]);
            }
        }));
    }

    @Override // androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, E());
        bundle.putString("email", C());
        bundle.putString("passwd", F());
    }
}
