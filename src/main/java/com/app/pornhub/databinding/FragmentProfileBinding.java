package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentProfileBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final CoordinatorLayout f4644a;

    public FragmentProfileBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, TextView textView, CoordinatorLayout coordinatorLayout2, RecyclerView recyclerView, TextView textView2) {
        this.f4644a = coordinatorLayout;
    }

    public static FragmentProfileBinding bind(View view) {
        int i10 = R.id.container_loading;
        FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.container_loading);
        if (frameLayout != null) {
            i10 = R.id.error_text;
            TextView textView = (TextView) b.t(view, R.id.error_text);
            if (textView != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                i10 = R.id.recyclerview;
                RecyclerView recyclerView = (RecyclerView) b.t(view, R.id.recyclerview);
                if (recyclerView != null) {
                    i10 = R.id.user_info_label_wall;
                    TextView textView2 = (TextView) b.t(view, R.id.user_info_label_wall);
                    if (textView2 != null) {
                        return new FragmentProfileBinding(coordinatorLayout, frameLayout, textView, coordinatorLayout, recyclerView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentProfileBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_profile, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4644a;
    }
}
