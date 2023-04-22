package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.app.pornhub.R;
import com.google.android.material.textfield.TextInputLayout;
import x1.a;

/* loaded from: classes.dex */
public final class ActivitySignupBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4469a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f4470b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4471c;
    public final TextView d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f4472e;

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout f4473f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout f4474g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f4475h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f4476i;

    /* renamed from: j  reason: collision with root package name */
    public final EditText f4477j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f4478k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f4479l;

    public ActivitySignupBinding(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, EditText editText, Guideline guideline, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, EditText editText2, EditText editText3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        this.f4469a = constraintLayout;
        this.f4470b = linearLayout;
        this.f4471c = textView2;
        this.d = textView3;
        this.f4472e = editText;
        this.f4473f = textInputLayout;
        this.f4474g = textInputLayout2;
        this.f4475h = textInputLayout3;
        this.f4476i = editText2;
        this.f4477j = editText3;
        this.f4478k = textView4;
        this.f4479l = textView6;
    }

    public static ActivitySignupBinding bind(View view) {
        int i10 = R.id.agree_by_sign_up;
        TextView textView = (TextView) b.t(view, R.id.agree_by_sign_up);
        if (textView != null) {
            i10 = R.id.button_get_premium;
            LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.button_get_premium);
            if (linearLayout != null) {
                i10 = R.id.button_login;
                TextView textView2 = (TextView) b.t(view, R.id.button_login);
                if (textView2 != null) {
                    i10 = R.id.button_sign_up;
                    TextView textView3 = (TextView) b.t(view, R.id.button_sign_up);
                    if (textView3 != null) {
                        i10 = R.id.email;
                        EditText editText = (EditText) b.t(view, R.id.email);
                        if (editText != null) {
                            i10 = R.id.guideline_vertical_05;
                            Guideline guideline = (Guideline) b.t(view, R.id.guideline_vertical_05);
                            if (guideline != null) {
                                i10 = R.id.input_layout_email;
                                TextInputLayout textInputLayout = (TextInputLayout) b.t(view, R.id.input_layout_email);
                                if (textInputLayout != null) {
                                    i10 = R.id.input_layout_name;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) b.t(view, R.id.input_layout_name);
                                    if (textInputLayout2 != null) {
                                        i10 = R.id.input_layout_password;
                                        TextInputLayout textInputLayout3 = (TextInputLayout) b.t(view, R.id.input_layout_password);
                                        if (textInputLayout3 != null) {
                                            i10 = R.id.iv_upsell_dl_and_watch;
                                            ImageView imageView = (ImageView) b.t(view, R.id.iv_upsell_dl_and_watch);
                                            if (imageView != null) {
                                                i10 = R.id.iv_upsell_faster_streaming;
                                                ImageView imageView2 = (ImageView) b.t(view, R.id.iv_upsell_faster_streaming);
                                                if (imageView2 != null) {
                                                    i10 = R.id.iv_upsell_no_ads;
                                                    ImageView imageView3 = (ImageView) b.t(view, R.id.iv_upsell_no_ads);
                                                    if (imageView3 != null) {
                                                        i10 = R.id.iv_upsell_vr;
                                                        ImageView imageView4 = (ImageView) b.t(view, R.id.iv_upsell_vr);
                                                        if (imageView4 != null) {
                                                            i10 = R.id.name;
                                                            EditText editText2 = (EditText) b.t(view, R.id.name);
                                                            if (editText2 != null) {
                                                                i10 = R.id.password;
                                                                EditText editText3 = (EditText) b.t(view, R.id.password);
                                                                if (editText3 != null) {
                                                                    i10 = R.id.resend_email;
                                                                    TextView textView4 = (TextView) b.t(view, R.id.resend_email);
                                                                    if (textView4 != null) {
                                                                        i10 = R.id.subtitle;
                                                                        TextView textView5 = (TextView) b.t(view, R.id.subtitle);
                                                                        if (textView5 != null) {
                                                                            i10 = R.id.terms_and_conditions;
                                                                            TextView textView6 = (TextView) b.t(view, R.id.terms_and_conditions);
                                                                            if (textView6 != null) {
                                                                                i10 = R.id.title;
                                                                                TextView textView7 = (TextView) b.t(view, R.id.title);
                                                                                if (textView7 != null) {
                                                                                    i10 = R.id.tv_upsell;
                                                                                    TextView textView8 = (TextView) b.t(view, R.id.tv_upsell);
                                                                                    if (textView8 != null) {
                                                                                        i10 = R.id.tv_upsell_bottom_caption;
                                                                                        TextView textView9 = (TextView) b.t(view, R.id.tv_upsell_bottom_caption);
                                                                                        if (textView9 != null) {
                                                                                            i10 = R.id.tv_upsell_prefix;
                                                                                            TextView textView10 = (TextView) b.t(view, R.id.tv_upsell_prefix);
                                                                                            if (textView10 != null) {
                                                                                                i10 = R.id.tv_upsell_suffix;
                                                                                                TextView textView11 = (TextView) b.t(view, R.id.tv_upsell_suffix);
                                                                                                if (textView11 != null) {
                                                                                                    i10 = R.id.txt_or;
                                                                                                    TextView textView12 = (TextView) b.t(view, R.id.txt_or);
                                                                                                    if (textView12 != null) {
                                                                                                        return new ActivitySignupBinding((ConstraintLayout) view, textView, linearLayout, textView2, textView3, editText, guideline, textInputLayout, textInputLayout2, textInputLayout3, imageView, imageView2, imageView3, imageView4, editText2, editText3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivitySignupBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_signup, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4469a;
    }
}
