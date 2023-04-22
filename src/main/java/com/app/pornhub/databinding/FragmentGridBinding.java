package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentGridBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4603a;

    public FragmentGridBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, TextView textView, FrameLayout frameLayout2, IncludeErrorBinding includeErrorBinding, FrameLayout frameLayout3, ImageView imageView, RecyclerView recyclerView, ConstraintLayout constraintLayout2, RecyclerView recyclerView2) {
        this.f4603a = constraintLayout;
    }

    public static FragmentGridBinding bind(View view) {
        int i10 = R.id.container_loading;
        FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.container_loading);
        if (frameLayout != null) {
            i10 = R.id.empty_content_msg;
            TextView textView = (TextView) b.t(view, R.id.empty_content_msg);
            if (textView != null) {
                i10 = R.id.empty_content_msg_container;
                FrameLayout frameLayout2 = (FrameLayout) b.t(view, R.id.empty_content_msg_container);
                if (frameLayout2 != null) {
                    i10 = R.id.errorView;
                    View t2 = b.t(view, R.id.errorView);
                    if (t2 != null) {
                        IncludeErrorBinding bind = IncludeErrorBinding.bind(t2);
                        i10 = R.id.overlay_container;
                        FrameLayout frameLayout3 = (FrameLayout) b.t(view, R.id.overlay_container);
                        if (frameLayout3 != null) {
                            i10 = R.id.overlay_container_background;
                            ImageView imageView = (ImageView) b.t(view, R.id.overlay_container_background);
                            if (imageView != null) {
                                i10 = R.id.recyclerview;
                                RecyclerView recyclerView = (RecyclerView) b.t(view, R.id.recyclerview);
                                if (recyclerView != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                    i10 = R.id.sorting_options_recyclerview;
                                    RecyclerView recyclerView2 = (RecyclerView) b.t(view, R.id.sorting_options_recyclerview);
                                    if (recyclerView2 != null) {
                                        return new FragmentGridBinding(constraintLayout, frameLayout, textView, frameLayout2, bind, frameLayout3, imageView, recyclerView, constraintLayout, recyclerView2);
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

    public static FragmentGridBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_grid, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4603a;
    }
}
