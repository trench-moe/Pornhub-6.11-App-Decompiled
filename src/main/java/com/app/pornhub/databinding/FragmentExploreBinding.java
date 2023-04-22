package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.simform.refresh.SSPullToRefreshLayout;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentExploreBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f4572a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4573b;

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f4574c;
    public final FrameLayout d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f4575e;

    /* renamed from: f  reason: collision with root package name */
    public final IncludeErrorBinding f4576f;

    /* renamed from: g  reason: collision with root package name */
    public final RecyclerView f4577g;

    /* renamed from: h  reason: collision with root package name */
    public final SSPullToRefreshLayout f4578h;

    public FragmentExploreBinding(FrameLayout frameLayout, TextView textView, FrameLayout frameLayout2, FrameLayout frameLayout3, TextView textView2, IncludeErrorBinding includeErrorBinding, RecyclerView recyclerView, SSPullToRefreshLayout sSPullToRefreshLayout) {
        this.f4572a = frameLayout;
        this.f4573b = textView;
        this.f4574c = frameLayout2;
        this.d = frameLayout3;
        this.f4575e = textView2;
        this.f4576f = includeErrorBinding;
        this.f4577g = recyclerView;
        this.f4578h = sSPullToRefreshLayout;
    }

    public static FragmentExploreBinding bind(View view) {
        int i10 = R.id.btnSeeNewVideos;
        TextView textView = (TextView) b.t(view, R.id.btnSeeNewVideos);
        if (textView != null) {
            i10 = R.id.containerEmptyContentMessage;
            FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.containerEmptyContentMessage);
            if (frameLayout != null) {
                i10 = R.id.containerLoading;
                FrameLayout frameLayout2 = (FrameLayout) b.t(view, R.id.containerLoading);
                if (frameLayout2 != null) {
                    i10 = R.id.empty_content_msg;
                    TextView textView2 = (TextView) b.t(view, R.id.empty_content_msg);
                    if (textView2 != null) {
                        i10 = R.id.error_container;
                        View t2 = b.t(view, R.id.error_container);
                        if (t2 != null) {
                            IncludeErrorBinding bind = IncludeErrorBinding.bind(t2);
                            i10 = R.id.recyclerViewExplore;
                            RecyclerView recyclerView = (RecyclerView) b.t(view, R.id.recyclerViewExplore);
                            if (recyclerView != null) {
                                i10 = R.id.swipeRefresh;
                                SSPullToRefreshLayout sSPullToRefreshLayout = (SSPullToRefreshLayout) b.t(view, R.id.swipeRefresh);
                                if (sSPullToRefreshLayout != null) {
                                    return new FragmentExploreBinding((FrameLayout) view, textView, frameLayout, frameLayout2, textView2, bind, recyclerView, sSPullToRefreshLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentExploreBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_explore, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4572a;
    }
}
