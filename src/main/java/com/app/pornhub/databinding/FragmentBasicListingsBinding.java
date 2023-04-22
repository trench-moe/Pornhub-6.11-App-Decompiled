package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentBasicListingsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4553a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f4554b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4555c;
    public final FrameLayout d;

    /* renamed from: e  reason: collision with root package name */
    public final IncludeErrorBinding f4556e;

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f4557f;

    /* renamed from: g  reason: collision with root package name */
    public final ConstraintLayout f4558g;

    public FragmentBasicListingsBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, TextView textView, FrameLayout frameLayout2, IncludeErrorBinding includeErrorBinding, RecyclerView recyclerView, ConstraintLayout constraintLayout2) {
        this.f4553a = constraintLayout;
        this.f4554b = frameLayout;
        this.f4555c = textView;
        this.d = frameLayout2;
        this.f4556e = includeErrorBinding;
        this.f4557f = recyclerView;
        this.f4558g = constraintLayout2;
    }

    public static FragmentBasicListingsBinding bind(View view) {
        int i10 = R.id.container_loading;
        FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.container_loading);
        if (frameLayout != null) {
            i10 = R.id.empty_content_msg;
            TextView textView = (TextView) b.t(view, R.id.empty_content_msg);
            if (textView != null) {
                i10 = R.id.empty_content_msg_container;
                FrameLayout frameLayout2 = (FrameLayout) b.t(view, R.id.empty_content_msg_container);
                if (frameLayout2 != null) {
                    i10 = R.id.error_container;
                    View t2 = b.t(view, R.id.error_container);
                    if (t2 != null) {
                        IncludeErrorBinding bind = IncludeErrorBinding.bind(t2);
                        i10 = R.id.recyclerview;
                        RecyclerView recyclerView = (RecyclerView) b.t(view, R.id.recyclerview);
                        if (recyclerView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            return new FragmentBasicListingsBinding(constraintLayout, frameLayout, textView, frameLayout2, bind, recyclerView, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentBasicListingsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_basic_listings, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4553a;
    }
}
