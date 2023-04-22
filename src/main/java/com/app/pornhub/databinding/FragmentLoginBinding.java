package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import com.google.android.material.textfield.TextInputLayout;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentLoginBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f4605a;

    /* renamed from: b  reason: collision with root package name */
    public final Button f4606b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f4607c;
    public final TextView d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f4608e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f4609f;

    /* renamed from: g  reason: collision with root package name */
    public final EditText f4610g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f4611h;

    /* renamed from: i  reason: collision with root package name */
    public final ConstraintLayout f4612i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f4613j;

    /* renamed from: k  reason: collision with root package name */
    public final ProgressBar f4614k;

    /* renamed from: l  reason: collision with root package name */
    public final Button f4615l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f4616m;
    public final ConstraintLayout n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f4617o;

    /* renamed from: p  reason: collision with root package name */
    public final ProgressBar f4618p;

    /* renamed from: q  reason: collision with root package name */
    public final Button f4619q;

    public FragmentLoginBinding(FrameLayout frameLayout, LinearLayout linearLayout, Button button, EditText editText, TextView textView, TextView textView2, TextView textView3, EditText editText2, EditText editText3, TextView textView4, ConstraintLayout constraintLayout, TextInputLayout textInputLayout, ImageView imageView, ProgressBar progressBar, Button button2, FrameLayout frameLayout2, TextView textView5, TextView textView6, ConstraintLayout constraintLayout2, TextView textView7, ProgressBar progressBar2, Button button3) {
        this.f4605a = frameLayout;
        this.f4606b = button;
        this.f4607c = editText;
        this.d = textView2;
        this.f4608e = textView3;
        this.f4609f = editText2;
        this.f4610g = editText3;
        this.f4611h = textView4;
        this.f4612i = constraintLayout;
        this.f4613j = imageView;
        this.f4614k = progressBar;
        this.f4615l = button2;
        this.f4616m = textView6;
        this.n = constraintLayout2;
        this.f4617o = textView7;
        this.f4618p = progressBar2;
        this.f4619q = button3;
    }

    public static FragmentLoginBinding bind(View view) {
        int i10 = R.id.button_container;
        LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.button_container);
        if (linearLayout != null) {
            i10 = R.id.cancel_login_button;
            Button button = (Button) b.t(view, R.id.cancel_login_button);
            if (button != null) {
                i10 = R.id.code_input;
                EditText editText = (EditText) b.t(view, R.id.code_input);
                if (editText != null) {
                    i10 = R.id.dont_have_account_text;
                    TextView textView = (TextView) b.t(view, R.id.dont_have_account_text);
                    if (textView != null) {
                        i10 = R.id.error_txt;
                        TextView textView2 = (TextView) b.t(view, R.id.error_txt);
                        if (textView2 != null) {
                            i10 = R.id.hint;
                            TextView textView3 = (TextView) b.t(view, R.id.hint);
                            if (textView3 != null) {
                                i10 = R.id.input_password;
                                EditText editText2 = (EditText) b.t(view, R.id.input_password);
                                if (editText2 != null) {
                                    i10 = R.id.input_username;
                                    EditText editText3 = (EditText) b.t(view, R.id.input_username);
                                    if (editText3 != null) {
                                        i10 = R.id.login_button;
                                        TextView textView4 = (TextView) b.t(view, R.id.login_button);
                                        if (textView4 != null) {
                                            i10 = R.id.login_container;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) b.t(view, R.id.login_container);
                                            if (constraintLayout != null) {
                                                i10 = R.id.pin_code_input_layout;
                                                TextInputLayout textInputLayout = (TextInputLayout) b.t(view, R.id.pin_code_input_layout);
                                                if (textInputLayout != null) {
                                                    i10 = R.id.premium_banner;
                                                    ImageView imageView = (ImageView) b.t(view, R.id.premium_banner);
                                                    if (imageView != null) {
                                                        i10 = R.id.progress_bar;
                                                        ProgressBar progressBar = (ProgressBar) b.t(view, R.id.progress_bar);
                                                        if (progressBar != null) {
                                                            i10 = R.id.resend_code_button;
                                                            Button button2 = (Button) b.t(view, R.id.resend_code_button);
                                                            if (button2 != null) {
                                                                FrameLayout frameLayout = (FrameLayout) view;
                                                                i10 = R.id.screen_title;
                                                                TextView textView5 = (TextView) b.t(view, R.id.screen_title);
                                                                if (textView5 != null) {
                                                                    i10 = R.id.signup_text;
                                                                    TextView textView6 = (TextView) b.t(view, R.id.signup_text);
                                                                    if (textView6 != null) {
                                                                        i10 = R.id.two_factor_auth_container;
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) b.t(view, R.id.two_factor_auth_container);
                                                                        if (constraintLayout2 != null) {
                                                                            i10 = R.id.verification_error;
                                                                            TextView textView7 = (TextView) b.t(view, R.id.verification_error);
                                                                            if (textView7 != null) {
                                                                                i10 = R.id.verification_progress_bar;
                                                                                ProgressBar progressBar2 = (ProgressBar) b.t(view, R.id.verification_progress_bar);
                                                                                if (progressBar2 != null) {
                                                                                    i10 = R.id.verify_code_button;
                                                                                    Button button3 = (Button) b.t(view, R.id.verify_code_button);
                                                                                    if (button3 != null) {
                                                                                        return new FragmentLoginBinding(frameLayout, linearLayout, button, editText, textView, textView2, textView3, editText2, editText3, textView4, constraintLayout, textInputLayout, imageView, progressBar, button2, frameLayout, textView5, textView6, constraintLayout2, textView7, progressBar2, button3);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentLoginBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_login, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4605a;
    }
}
