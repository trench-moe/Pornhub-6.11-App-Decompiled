package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentPerformersFiltersBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4634a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4635b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4636c;
    public final ImageView d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f4637e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f4638f;

    public FragmentPerformersFiltersBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, ImageView imageView, LinearLayout linearLayout, ImageView imageView2, TextView textView3) {
        this.f4634a = constraintLayout;
        this.f4635b = textView;
        this.f4636c = textView2;
        this.d = imageView;
        this.f4637e = linearLayout;
        this.f4638f = imageView2;
    }

    public static FragmentPerformersFiltersBinding bind(View view) {
        int i10 = R.id.bottomControlsContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) b.t(view, R.id.bottomControlsContainer);
        if (constraintLayout != null) {
            i10 = R.id.btnApply;
            TextView textView = (TextView) b.t(view, R.id.btnApply);
            if (textView != null) {
                i10 = R.id.btnClear;
                TextView textView2 = (TextView) b.t(view, R.id.btnClear);
                if (textView2 != null) {
                    i10 = R.id.btnClose;
                    ImageView imageView = (ImageView) b.t(view, R.id.btnClose);
                    if (imageView != null) {
                        i10 = R.id.contentContainer;
                        LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.contentContainer);
                        if (linearLayout != null) {
                            i10 = R.id.imgBackground;
                            ImageView imageView2 = (ImageView) b.t(view, R.id.imgBackground);
                            if (imageView2 != null) {
                                i10 = R.id.title;
                                TextView textView3 = (TextView) b.t(view, R.id.title);
                                if (textView3 != null) {
                                    return new FragmentPerformersFiltersBinding((ConstraintLayout) view, constraintLayout, textView, textView2, imageView, linearLayout, imageView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentPerformersFiltersBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_performers_filters, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4634a;
    }
}
