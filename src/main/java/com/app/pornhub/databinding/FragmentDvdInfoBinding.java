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
public final class FragmentDvdInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4568a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f4569b;

    /* renamed from: c  reason: collision with root package name */
    public final IncludeErrorBinding f4570c;
    public final TextView d;

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f4571e;

    public FragmentDvdInfoBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, IncludeErrorBinding includeErrorBinding, TextView textView, RecyclerView recyclerView) {
        this.f4568a = constraintLayout;
        this.f4569b = frameLayout;
        this.f4570c = includeErrorBinding;
        this.d = textView;
        this.f4571e = recyclerView;
    }

    public static FragmentDvdInfoBinding bind(View view) {
        int i10 = R.id.container_loading;
        FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.container_loading);
        if (frameLayout != null) {
            i10 = R.id.errorView;
            View t2 = b.t(view, R.id.errorView);
            if (t2 != null) {
                IncludeErrorBinding bind = IncludeErrorBinding.bind(t2);
                i10 = R.id.generic_title;
                TextView textView = (TextView) b.t(view, R.id.generic_title);
                if (textView != null) {
                    i10 = R.id.recyclerview;
                    RecyclerView recyclerView = (RecyclerView) b.t(view, R.id.recyclerview);
                    if (recyclerView != null) {
                        return new FragmentDvdInfoBinding((ConstraintLayout) view, frameLayout, bind, textView, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentDvdInfoBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_dvd_info, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4568a;
    }
}
