package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.SimpleViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityChannelBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final CoordinatorLayout f4360a;

    /* renamed from: b  reason: collision with root package name */
    public final LayoutChannelInfoHeaderBinding f4361b;

    /* renamed from: c  reason: collision with root package name */
    public final CollapsingToolbarLayout f4362c;
    public final IncludeErrorBinding d;

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f4363e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f4364f;

    /* renamed from: g  reason: collision with root package name */
    public final SimpleViewPager f4365g;

    /* renamed from: h  reason: collision with root package name */
    public final TabLayout f4366h;

    /* renamed from: i  reason: collision with root package name */
    public final Toolbar f4367i;

    public ActivityChannelBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, LayoutChannelInfoHeaderBinding layoutChannelInfoHeaderBinding, CollapsingToolbarLayout collapsingToolbarLayout, CoordinatorLayout coordinatorLayout2, IncludeErrorBinding includeErrorBinding, FrameLayout frameLayout, LinearLayout linearLayout, SimpleViewPager simpleViewPager, TabLayout tabLayout, Toolbar toolbar, TextView textView) {
        this.f4360a = coordinatorLayout;
        this.f4361b = layoutChannelInfoHeaderBinding;
        this.f4362c = collapsingToolbarLayout;
        this.d = includeErrorBinding;
        this.f4363e = frameLayout;
        this.f4364f = linearLayout;
        this.f4365g = simpleViewPager;
        this.f4366h = tabLayout;
        this.f4367i = toolbar;
    }

    public static ActivityChannelBinding bind(View view) {
        int i10 = R.id.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) b.t(view, R.id.appBar);
        if (appBarLayout != null) {
            i10 = R.id.appbar_header_container;
            View t2 = b.t(view, R.id.appbar_header_container);
            if (t2 != null) {
                LayoutChannelInfoHeaderBinding bind = LayoutChannelInfoHeaderBinding.bind(t2);
                i10 = R.id.collapsingToolbar;
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) b.t(view, R.id.collapsingToolbar);
                if (collapsingToolbarLayout != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                    i10 = R.id.error_view;
                    View t8 = b.t(view, R.id.error_view);
                    if (t8 != null) {
                        IncludeErrorBinding bind2 = IncludeErrorBinding.bind(t8);
                        i10 = R.id.loading_view;
                        FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.loading_view);
                        if (frameLayout != null) {
                            i10 = R.id.main_content_container;
                            LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.main_content_container);
                            if (linearLayout != null) {
                                i10 = R.id.pager;
                                SimpleViewPager simpleViewPager = (SimpleViewPager) b.t(view, R.id.pager);
                                if (simpleViewPager != null) {
                                    i10 = R.id.tab_layout;
                                    TabLayout tabLayout = (TabLayout) b.t(view, R.id.tab_layout);
                                    if (tabLayout != null) {
                                        i10 = R.id.toolbar;
                                        Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
                                        if (toolbar != null) {
                                            i10 = R.id.toolbar_title;
                                            TextView textView = (TextView) b.t(view, R.id.toolbar_title);
                                            if (textView != null) {
                                                return new ActivityChannelBinding(coordinatorLayout, appBarLayout, bind, collapsingToolbarLayout, coordinatorLayout, bind2, frameLayout, linearLayout, simpleViewPager, tabLayout, toolbar, textView);
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

    public static ActivityChannelBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_channel, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4360a;
    }
}
