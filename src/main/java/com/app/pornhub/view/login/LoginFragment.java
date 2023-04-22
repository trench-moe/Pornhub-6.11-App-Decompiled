package com.app.pornhub.view.login;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.app.pornhub.R;
import com.app.pornhub.databinding.FragmentLoginBinding;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.view.login.LoginFragment;
import com.appsflyer.oaid.BuildConfig;
import com.bumptech.glide.f;
import com.bumptech.glide.g;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.mixpanel.android.mpmetrics.k;
import f3.p;
import h4.h;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import q3.d;
import q5.m;
import v3.c;
import x2.b;
import x2.e;
import x2.n;

/* loaded from: classes.dex */
public class LoginFragment extends c {

    /* renamed from: u0  reason: collision with root package name */
    public static final /* synthetic */ int f5386u0 = 0;

    /* renamed from: p0  reason: collision with root package name */
    public d f5387p0;

    /* renamed from: q0  reason: collision with root package name */
    public LoginViewModel f5388q0;

    /* renamed from: r0  reason: collision with root package name */
    public FragmentLoginBinding f5389r0;

    /* renamed from: s0  reason: collision with root package name */
    public k f5390s0;

    /* renamed from: t0  reason: collision with root package name */
    public Disposable f5391t0;

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
            LoginFragment loginFragment = LoginFragment.this;
            LoginViewModel loginViewModel = loginFragment.f5388q0;
            String pinCode = charSequence.toString().trim();
            Objects.requireNonNull(loginViewModel);
            Intrinsics.checkNotNullParameter(pinCode, "pinCode");
            boolean matches = new Regex("[0-9]{7}").matches(pinCode);
            loginFragment.f5389r0.f4619q.setEnabled(matches);
            loginFragment.f5389r0.f4619q.setTextColor(loginFragment.E().getColor(matches ? R.color.ph_orange : R.color.grey_2));
        }
    }

    public LoginFragment() {
        super(R.layout.fragment_login);
    }

    public final void M0(String token) {
        ((InputMethodManager) q().getSystemService("input_method")).hideSoftInputFromWindow(this.f5389r0.f4609f.getWindowToken(), 0);
        LoginViewModel loginViewModel = this.f5388q0;
        String username = a1.a.i(this.f5389r0.f4610g);
        String password = this.f5389r0.f4609f.getText().toString().trim();
        Objects.requireNonNull(loginViewModel);
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(token, "token");
        p pVar = loginViewModel.d;
        Objects.requireNonNull(pVar);
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(token, "token");
        Disposable subscribe = pVar.a(pVar.f9385a.t(username, password, token)).subscribe(new b(loginViewModel, 13));
        Intrinsics.checkNotNullExpressionValue(subscribe, "logInUseCase.execute(\n  …}\n            }\n        }");
        DisposableKt.addTo(subscribe, loginViewModel.f16001c);
    }

    public final void N0(String str) {
        if (this.f5389r0.n.getVisibility() == 0) {
            this.f5389r0.f4617o.setText(str);
            this.f5389r0.f4617o.setVisibility(0);
            this.f5389r0.f4618p.setVisibility(8);
            return;
        }
        this.f5389r0.f4614k.setVisibility(8);
        this.f5389r0.d.setVisibility(0);
        this.f5389r0.d.setText(str);
        this.f5389r0.f4611h.setEnabled(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View W = super.W(layoutInflater, viewGroup, bundle);
        this.f5389r0 = FragmentLoginBinding.bind(W);
        LoginViewModel loginViewModel = (LoginViewModel) new z(j(), this.f16000o0).a(LoginViewModel.class);
        this.f5388q0 = loginViewModel;
        loginViewModel.f5400l.f(K(), new h(this, 4));
        this.f5389r0.f4609f.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: w4.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                LoginFragment loginFragment = LoginFragment.this;
                int i11 = LoginFragment.f5386u0;
                Objects.requireNonNull(loginFragment);
                if (keyEvent == null || keyEvent.getAction() == 0) {
                    if (i10 == 2 || keyEvent == null || keyEvent.getKeyCode() == 66) {
                        loginFragment.M0(BuildConfig.FLAVOR);
                        return true;
                    }
                    return false;
                }
                return false;
            }
        });
        this.f5389r0.f4611h.setOnClickListener(new b4.b(this, 10));
        this.f5389r0.f4613j.setOnClickListener(new x3.a(this, 8));
        this.f5389r0.f4616m.setOnClickListener(new x3.b(this, 10));
        this.f5389r0.f4606b.setOnClickListener(new u3.b(this, 8));
        this.f5389r0.f4615l.setOnClickListener(new u3.c(this, 10));
        this.f5389r0.f4619q.setOnClickListener(new u3.a(this, 13));
        this.f5389r0.f4607c.addTextChangedListener(new a());
        g g10 = com.bumptech.glide.b.c(q()).g(this);
        LoginViewModel loginViewModel2 = this.f5388q0;
        Objects.requireNonNull(loginViewModel2);
        f<Drawable> n = g10.n(Integer.valueOf(android.support.v4.media.a.p(loginViewModel2.f5396h, UsersConfig.Companion) ? R.drawable.banner_login_gay : R.drawable.banner_login_straight));
        Objects.requireNonNull(n);
        f q10 = n.q(DownsampleStrategy.f5838a, new m());
        q10.O = true;
        q10.A(this.f5389r0.f4613j);
        this.f5390s0 = k.k(q(), "738e4e063d964109c0489d980822dc2a");
        this.f5391t0 = Observable.combineLatest(new wc.a(this.f5389r0.f4610g).map(new e(this, 7)), new wc.a(this.f5389r0.f4609f).map(new n(this, 6)), new j4.a(this, 1)).subscribe();
        return W;
    }

    @Override // v3.c, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        Disposable disposable = this.f5391t0;
        if (disposable != null && !disposable.isDisposed()) {
            this.f5391t0.dispose();
        }
        this.f5390s0.f();
        this.f5389r0 = null;
    }
}
