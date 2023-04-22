package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewpager.widget.ViewPager;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.GifViewCustom;
import com.google.android.material.tabs.TabLayout;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityGifDetailsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4378a;

    /* renamed from: b  reason: collision with root package name */
    public final IncludeErrorBinding f4379b;

    /* renamed from: c  reason: collision with root package name */
    public final Group f4380c;
    public final ProgressBar d;

    /* renamed from: e  reason: collision with root package name */
    public final GifViewCustom f4381e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f4382f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f4383g;

    /* renamed from: h  reason: collision with root package name */
    public final FrameLayout f4384h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageButton f4385i;

    /* renamed from: j  reason: collision with root package name */
    public final TabLayout f4386j;

    /* renamed from: k  reason: collision with root package name */
    public final Toolbar f4387k;

    /* renamed from: l  reason: collision with root package name */
    public final ViewPager f4388l;

    public ActivityGifDetailsBinding(ConstraintLayout constraintLayout, IncludeErrorBinding includeErrorBinding, Group group, ProgressBar progressBar, GifViewCustom gifViewCustom, Guideline guideline, ImageView imageView, ImageView imageView2, FrameLayout frameLayout, ImageButton imageButton, TabLayout tabLayout, Toolbar toolbar, TextView textView, ViewPager viewPager) {
        this.f4378a = constraintLayout;
        this.f4379b = includeErrorBinding;
        this.f4380c = group;
        this.d = progressBar;
        this.f4381e = gifViewCustom;
        this.f4382f = imageView;
        this.f4383g = imageView2;
        this.f4384h = frameLayout;
        this.f4385i = imageButton;
        this.f4386j = tabLayout;
        this.f4387k = toolbar;
        this.f4388l = viewPager;
    }

    public static ActivityGifDetailsBinding bind(View view) {
        int i10 = R.id.error_view;
        View t2 = b.t(view, R.id.error_view);
        if (t2 != null) {
            IncludeErrorBinding bind = IncludeErrorBinding.bind(t2);
            i10 = R.id.gif_details_container;
            Group group = (Group) b.t(view, R.id.gif_details_container);
            if (group != null) {
                i10 = R.id.gifLoadingProgress;
                ProgressBar progressBar = (ProgressBar) b.t(view, R.id.gifLoadingProgress);
                if (progressBar != null) {
                    i10 = R.id.gifView;
                    GifViewCustom gifViewCustom = (GifViewCustom) b.t(view, R.id.gifView);
                    if (gifViewCustom != null) {
                        i10 = R.id.guideline_horizontal_05;
                        Guideline guideline = (Guideline) b.t(view, R.id.guideline_horizontal_05);
                        if (guideline != null) {
                            i10 = R.id.icon_next;
                            ImageView imageView = (ImageView) b.t(view, R.id.icon_next);
                            if (imageView != null) {
                                i10 = R.id.icon_prev;
                                ImageView imageView2 = (ImageView) b.t(view, R.id.icon_prev);
                                if (imageView2 != null) {
                                    i10 = R.id.loading_view;
                                    FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.loading_view);
                                    if (frameLayout != null) {
                                        i10 = R.id.play;
                                        ImageButton imageButton = (ImageButton) b.t(view, R.id.play);
                                        if (imageButton != null) {
                                            i10 = R.id.tablayout;
                                            TabLayout tabLayout = (TabLayout) b.t(view, R.id.tablayout);
                                            if (tabLayout != null) {
                                                i10 = R.id.toolbar;
                                                Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
                                                if (toolbar != null) {
                                                    i10 = R.id.toolbar_title;
                                                    TextView textView = (TextView) b.t(view, R.id.toolbar_title);
                                                    if (textView != null) {
                                                        i10 = R.id.viewpager;
                                                        ViewPager viewPager = (ViewPager) b.t(view, R.id.viewpager);
                                                        if (viewPager != null) {
                                                            return new ActivityGifDetailsBinding((ConstraintLayout) view, bind, group, progressBar, gifViewCustom, guideline, imageView, imageView2, frameLayout, imageButton, tabLayout, toolbar, textView, viewPager);
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

    public static ActivityGifDetailsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_gif_details, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4378a;
    }
}
