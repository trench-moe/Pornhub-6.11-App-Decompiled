package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.IconTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityPerformerBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final CoordinatorLayout f4442a;

    /* renamed from: b  reason: collision with root package name */
    public final LayoutContainerPornstarInfoBinding f4443b;

    /* renamed from: c  reason: collision with root package name */
    public final IncludeErrorBinding f4444c;
    public final FrameLayout d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f4445e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewPager f4446f;

    /* renamed from: g  reason: collision with root package name */
    public final FrameLayout f4447g;

    /* renamed from: h  reason: collision with root package name */
    public final RecyclerView f4448h;

    /* renamed from: i  reason: collision with root package name */
    public final IconTabLayout f4449i;

    /* renamed from: j  reason: collision with root package name */
    public final Toolbar f4450j;

    public ActivityPerformerBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, LayoutContainerPornstarInfoBinding layoutContainerPornstarInfoBinding, CollapsingToolbarLayout collapsingToolbarLayout, IncludeErrorBinding includeErrorBinding, FrameLayout frameLayout, LinearLayout linearLayout, ViewPager viewPager, CoordinatorLayout coordinatorLayout2, FrameLayout frameLayout2, ImageView imageView, RecyclerView recyclerView, IconTabLayout iconTabLayout, Toolbar toolbar, TextView textView) {
        this.f4442a = coordinatorLayout;
        this.f4443b = layoutContainerPornstarInfoBinding;
        this.f4444c = includeErrorBinding;
        this.d = frameLayout;
        this.f4445e = linearLayout;
        this.f4446f = viewPager;
        this.f4447g = frameLayout2;
        this.f4448h = recyclerView;
        this.f4449i = iconTabLayout;
        this.f4450j = toolbar;
    }

    public static ActivityPerformerBinding bind(View view) {
        int i10 = R.id.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) b.t(view, R.id.appBar);
        if (appBarLayout != null) {
            i10 = R.id.appbar_header_container;
            View t2 = b.t(view, R.id.appbar_header_container);
            if (t2 != null) {
                LayoutContainerPornstarInfoBinding bind = LayoutContainerPornstarInfoBinding.bind(t2);
                i10 = R.id.collapsingToolbar;
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) b.t(view, R.id.collapsingToolbar);
                if (collapsingToolbarLayout != null) {
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
                                ViewPager viewPager = (ViewPager) b.t(view, R.id.pager);
                                if (viewPager != null) {
                                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                                    i10 = R.id.sortingOptionsContainer;
                                    FrameLayout frameLayout2 = (FrameLayout) b.t(view, R.id.sortingOptionsContainer);
                                    if (frameLayout2 != null) {
                                        i10 = R.id.sortingOptionsContainerBackground;
                                        ImageView imageView = (ImageView) b.t(view, R.id.sortingOptionsContainerBackground);
                                        if (imageView != null) {
                                            i10 = R.id.sorting_options_recyclerview;
                                            RecyclerView recyclerView = (RecyclerView) b.t(view, R.id.sorting_options_recyclerview);
                                            if (recyclerView != null) {
                                                i10 = R.id.tab_layout;
                                                IconTabLayout iconTabLayout = (IconTabLayout) b.t(view, R.id.tab_layout);
                                                if (iconTabLayout != null) {
                                                    i10 = R.id.toolbar;
                                                    Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
                                                    if (toolbar != null) {
                                                        i10 = R.id.toolbar_title;
                                                        TextView textView = (TextView) b.t(view, R.id.toolbar_title);
                                                        if (textView != null) {
                                                            return new ActivityPerformerBinding(coordinatorLayout, appBarLayout, bind, collapsingToolbarLayout, bind2, frameLayout, linearLayout, viewPager, coordinatorLayout, frameLayout2, imageView, recyclerView, iconTabLayout, toolbar, textView);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityPerformerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_performer, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4442a;
    }
}
