package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityHomeBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final CoordinatorLayout f4389a;

    /* renamed from: b  reason: collision with root package name */
    public final BottomNavigationView f4390b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4391c;
    public final FrameLayout d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f4392e;

    /* renamed from: f  reason: collision with root package name */
    public final AppBarLayout f4393f;

    /* renamed from: g  reason: collision with root package name */
    public final CoordinatorLayout f4394g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f4395h;

    /* renamed from: i  reason: collision with root package name */
    public final FrameLayout f4396i;

    /* renamed from: j  reason: collision with root package name */
    public final RecyclerView f4397j;

    /* renamed from: k  reason: collision with root package name */
    public final RecyclerView f4398k;

    /* renamed from: l  reason: collision with root package name */
    public final ConstraintLayout f4399l;

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f4400m;
    public final ImageView n;

    /* renamed from: o  reason: collision with root package name */
    public final ConstraintLayout f4401o;

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f4402p;

    /* renamed from: q  reason: collision with root package name */
    public final FrameLayout f4403q;

    /* renamed from: r  reason: collision with root package name */
    public final RecyclerView f4404r;

    /* renamed from: s  reason: collision with root package name */
    public final Toolbar f4405s;

    public ActivityHomeBinding(CoordinatorLayout coordinatorLayout, BottomNavigationView bottomNavigationView, TextView textView, FrameLayout frameLayout, ImageView imageView, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout2, ConstraintLayout constraintLayout, ImageView imageView2, FrameLayout frameLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, ConstraintLayout constraintLayout2, ImageView imageView3, ImageView imageView4, FragmentContainerView fragmentContainerView, ConstraintLayout constraintLayout3, ImageView imageView5, FrameLayout frameLayout3, RecyclerView recyclerView3, Toolbar toolbar) {
        this.f4389a = coordinatorLayout;
        this.f4390b = bottomNavigationView;
        this.f4391c = textView;
        this.d = frameLayout;
        this.f4392e = imageView;
        this.f4393f = appBarLayout;
        this.f4394g = coordinatorLayout2;
        this.f4395h = imageView2;
        this.f4396i = frameLayout2;
        this.f4397j = recyclerView;
        this.f4398k = recyclerView2;
        this.f4399l = constraintLayout2;
        this.f4400m = imageView3;
        this.n = imageView4;
        this.f4401o = constraintLayout3;
        this.f4402p = imageView5;
        this.f4403q = frameLayout3;
        this.f4404r = recyclerView3;
        this.f4405s = toolbar;
    }

    public static ActivityHomeBinding bind(View view) {
        int i10 = R.id.bottom_navigation;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) b.t(view, R.id.bottom_navigation);
        if (bottomNavigationView != null) {
            i10 = R.id.homeAdditionalFiltersBadge;
            TextView textView = (TextView) b.t(view, R.id.homeAdditionalFiltersBadge);
            if (textView != null) {
                i10 = R.id.homeAdditionalFiltersContainer;
                FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.homeAdditionalFiltersContainer);
                if (frameLayout != null) {
                    i10 = R.id.homeAdditionalFiltersIcon;
                    ImageView imageView = (ImageView) b.t(view, R.id.homeAdditionalFiltersIcon);
                    if (imageView != null) {
                        i10 = R.id.homeAppBarLayout;
                        AppBarLayout appBarLayout = (AppBarLayout) b.t(view, R.id.homeAppBarLayout);
                        if (appBarLayout != null) {
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                            i10 = R.id.homeMainContainer;
                            ConstraintLayout constraintLayout = (ConstraintLayout) b.t(view, R.id.homeMainContainer);
                            if (constraintLayout != null) {
                                i10 = R.id.homeOverlayBackground;
                                ImageView imageView2 = (ImageView) b.t(view, R.id.homeOverlayBackground);
                                if (imageView2 != null) {
                                    i10 = R.id.homeOverlayContainer;
                                    FrameLayout frameLayout2 = (FrameLayout) b.t(view, R.id.homeOverlayContainer);
                                    if (frameLayout2 != null) {
                                        i10 = R.id.homeOverlayRecyclerView;
                                        RecyclerView recyclerView = (RecyclerView) b.t(view, R.id.homeOverlayRecyclerView);
                                        if (recyclerView != null) {
                                            i10 = R.id.homeTopNavRecyclerView;
                                            RecyclerView recyclerView2 = (RecyclerView) b.t(view, R.id.homeTopNavRecyclerView);
                                            if (recyclerView2 != null) {
                                                i10 = R.id.homeTopNavigation;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) b.t(view, R.id.homeTopNavigation);
                                                if (constraintLayout2 != null) {
                                                    i10 = R.id.imagePromoBanner;
                                                    ImageView imageView3 = (ImageView) b.t(view, R.id.imagePromoBanner);
                                                    if (imageView3 != null) {
                                                        i10 = R.id.imageViewDismissBanner;
                                                        ImageView imageView4 = (ImageView) b.t(view, R.id.imageViewDismissBanner);
                                                        if (imageView4 != null) {
                                                            i10 = R.id.nav_host_fragment;
                                                            FragmentContainerView fragmentContainerView = (FragmentContainerView) b.t(view, R.id.nav_host_fragment);
                                                            if (fragmentContainerView != null) {
                                                                i10 = R.id.promoBannerContainer;
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) b.t(view, R.id.promoBannerContainer);
                                                                if (constraintLayout3 != null) {
                                                                    i10 = R.id.searchOverlayBackground;
                                                                    ImageView imageView5 = (ImageView) b.t(view, R.id.searchOverlayBackground);
                                                                    if (imageView5 != null) {
                                                                        i10 = R.id.searchOverlayContainer;
                                                                        FrameLayout frameLayout3 = (FrameLayout) b.t(view, R.id.searchOverlayContainer);
                                                                        if (frameLayout3 != null) {
                                                                            i10 = R.id.searchOverlayRecyclerView;
                                                                            RecyclerView recyclerView3 = (RecyclerView) b.t(view, R.id.searchOverlayRecyclerView);
                                                                            if (recyclerView3 != null) {
                                                                                i10 = R.id.toolbar;
                                                                                Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
                                                                                if (toolbar != null) {
                                                                                    return new ActivityHomeBinding(coordinatorLayout, bottomNavigationView, textView, frameLayout, imageView, appBarLayout, coordinatorLayout, constraintLayout, imageView2, frameLayout2, recyclerView, recyclerView2, constraintLayout2, imageView3, imageView4, fragmentContainerView, constraintLayout3, imageView5, frameLayout3, recyclerView3, toolbar);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityHomeBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_home, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4389a;
    }
}
