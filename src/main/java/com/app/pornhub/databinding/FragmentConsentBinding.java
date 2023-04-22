package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentConsentBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4563a;

    public FragmentConsentBinding(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f4563a = constraintLayout;
    }

    public static FragmentConsentBinding bind(View view) {
        int i10 = R.id.accept_button;
        TextView textView = (TextView) b.t(view, R.id.accept_button);
        if (textView != null) {
            i10 = R.id.description_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) b.t(view, R.id.description_container);
            if (constraintLayout != null) {
                i10 = R.id.gdpr_policy;
                TextView textView2 = (TextView) b.t(view, R.id.gdpr_policy);
                if (textView2 != null) {
                    i10 = R.id.header_image;
                    ImageView imageView = (ImageView) b.t(view, R.id.header_image);
                    if (imageView != null) {
                        i10 = R.id.manage_data_button;
                        TextView textView3 = (TextView) b.t(view, R.id.manage_data_button);
                        if (textView3 != null) {
                            i10 = R.id.show_policy_button;
                            TextView textView4 = (TextView) b.t(view, R.id.show_policy_button);
                            if (textView4 != null) {
                                i10 = R.id.subtitle;
                                TextView textView5 = (TextView) b.t(view, R.id.subtitle);
                                if (textView5 != null) {
                                    i10 = R.id.title;
                                    TextView textView6 = (TextView) b.t(view, R.id.title);
                                    if (textView6 != null) {
                                        return new FragmentConsentBinding((ConstraintLayout) view, textView, constraintLayout, textView2, imageView, textView3, textView4, textView5, textView6);
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

    public static FragmentConsentBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_consent, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4563a;
    }
}
