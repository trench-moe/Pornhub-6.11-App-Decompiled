package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentDeterrenceMessageBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4565a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4566b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4567c;
    public final TextView d;

    public FragmentDeterrenceMessageBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, Guideline guideline, LinearLayout linearLayout, TextView textView2) {
        this.f4565a = constraintLayout;
        this.f4566b = imageView;
        this.f4567c = textView;
        this.d = textView2;
    }

    public static FragmentDeterrenceMessageBinding bind(View view) {
        int i10 = R.id.bannerImage;
        ImageView imageView = (ImageView) b.t(view, R.id.bannerImage);
        if (imageView != null) {
            i10 = R.id.explanation;
            TextView textView = (TextView) b.t(view, R.id.explanation);
            if (textView != null) {
                i10 = R.id.top_guideline;
                Guideline guideline = (Guideline) b.t(view, R.id.top_guideline);
                if (guideline != null) {
                    i10 = R.id.warning_block;
                    LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.warning_block);
                    if (linearLayout != null) {
                        i10 = R.id.warning_title;
                        TextView textView2 = (TextView) b.t(view, R.id.warning_title);
                        if (textView2 != null) {
                            return new FragmentDeterrenceMessageBinding((ConstraintLayout) view, imageView, textView, guideline, linearLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentDeterrenceMessageBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_deterrence_message, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4565a;
    }
}
