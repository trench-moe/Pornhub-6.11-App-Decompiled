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
public final class DialogfragmentPremiumUpsellBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4506a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4507b;

    public DialogfragmentPremiumUpsellBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3) {
        this.f4506a = constraintLayout;
        this.f4507b = textView2;
    }

    public static DialogfragmentPremiumUpsellBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.iv_logo;
        ImageView imageView = (ImageView) b.t(view, R.id.iv_logo);
        if (imageView != null) {
            i10 = R.id.iv_title_star_left;
            ImageView imageView2 = (ImageView) b.t(view, R.id.iv_title_star_left);
            if (imageView2 != null) {
                i10 = R.id.iv_title_star_right;
                ImageView imageView3 = (ImageView) b.t(view, R.id.iv_title_star_right);
                if (imageView3 != null) {
                    i10 = R.id.tv_description;
                    TextView textView = (TextView) b.t(view, R.id.tv_description);
                    if (textView != null) {
                        i10 = R.id.tv_join;
                        TextView textView2 = (TextView) b.t(view, R.id.tv_join);
                        if (textView2 != null) {
                            i10 = R.id.tv_title;
                            TextView textView3 = (TextView) b.t(view, R.id.tv_title);
                            if (textView3 != null) {
                                return new DialogfragmentPremiumUpsellBinding(constraintLayout, constraintLayout, imageView, imageView2, imageView3, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogfragmentPremiumUpsellBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.dialogfragment_premium_upsell, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4506a;
    }
}
