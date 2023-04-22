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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewpager.widget.ViewPager;
import com.app.pornhub.R;
import com.google.android.material.tabs.TabLayout;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityVideodetailsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4481a;

    /* renamed from: b  reason: collision with root package name */
    public final LayoutPlaylistExpandablePanelBinding f4482b;

    /* renamed from: c  reason: collision with root package name */
    public final TabLayout f4483c;
    public final ViewPager d;

    /* renamed from: e  reason: collision with root package name */
    public final LayoutContainerVideoBinding f4484e;

    /* renamed from: f  reason: collision with root package name */
    public final IncludeErrorBinding f4485f;

    /* renamed from: g  reason: collision with root package name */
    public final ConstraintLayout f4486g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f4487h;

    /* renamed from: i  reason: collision with root package name */
    public final FrameLayout f4488i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f4489j;

    /* renamed from: k  reason: collision with root package name */
    public final ConstraintLayout f4490k;

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f4491l;

    /* renamed from: m  reason: collision with root package name */
    public final Toolbar f4492m;
    public final TextView n;

    /* renamed from: o  reason: collision with root package name */
    public final ConstraintLayout f4493o;

    public ActivityVideodetailsBinding(ConstraintLayout constraintLayout, Group group, LayoutPlaylistExpandablePanelBinding layoutPlaylistExpandablePanelBinding, TabLayout tabLayout, ViewPager viewPager, LayoutContainerVideoBinding layoutContainerVideoBinding, IncludeErrorBinding includeErrorBinding, ConstraintLayout constraintLayout2, LinearLayout linearLayout, FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, ConstraintLayout constraintLayout3, ImageView imageView2, Toolbar toolbar, TextView textView, ConstraintLayout constraintLayout4) {
        this.f4481a = constraintLayout;
        this.f4482b = layoutPlaylistExpandablePanelBinding;
        this.f4483c = tabLayout;
        this.d = viewPager;
        this.f4484e = layoutContainerVideoBinding;
        this.f4485f = includeErrorBinding;
        this.f4486g = constraintLayout2;
        this.f4487h = linearLayout;
        this.f4488i = frameLayout;
        this.f4489j = imageView;
        this.f4490k = constraintLayout3;
        this.f4491l = imageView2;
        this.f4492m = toolbar;
        this.n = textView;
        this.f4493o = constraintLayout4;
    }

    public static ActivityVideodetailsBinding bind(View view) {
        int i10 = R.id.activity_details_info_group;
        Group group = (Group) b.t(view, R.id.activity_details_info_group);
        if (group != null) {
            i10 = R.id.activity_video_details_playlist_panel;
            View t2 = b.t(view, R.id.activity_video_details_playlist_panel);
            if (t2 != null) {
                LayoutPlaylistExpandablePanelBinding bind = LayoutPlaylistExpandablePanelBinding.bind(t2);
                i10 = R.id.activity_videodetails_tablayout;
                TabLayout tabLayout = (TabLayout) b.t(view, R.id.activity_videodetails_tablayout);
                if (tabLayout != null) {
                    i10 = R.id.activity_videodetails_viewpager;
                    ViewPager viewPager = (ViewPager) b.t(view, R.id.activity_videodetails_viewpager);
                    if (viewPager != null) {
                        i10 = R.id.appbar_video_container;
                        View t8 = b.t(view, R.id.appbar_video_container);
                        if (t8 != null) {
                            LayoutContainerVideoBinding bind2 = LayoutContainerVideoBinding.bind(t8);
                            i10 = R.id.error_view;
                            View t10 = b.t(view, R.id.error_view);
                            if (t10 != null) {
                                IncludeErrorBinding bind3 = IncludeErrorBinding.bind(t10);
                                i10 = R.id.expandablePanelContentContainer;
                                ConstraintLayout constraintLayout = (ConstraintLayout) b.t(view, R.id.expandablePanelContentContainer);
                                if (constraintLayout != null) {
                                    i10 = R.id.layoutTopContainer;
                                    LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.layoutTopContainer);
                                    if (linearLayout != null) {
                                        i10 = R.id.loading_view;
                                        FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.loading_view);
                                        if (frameLayout != null) {
                                            i10 = R.id.pep_videos_fragment_container;
                                            FrameLayout frameLayout2 = (FrameLayout) b.t(view, R.id.pep_videos_fragment_container);
                                            if (frameLayout2 != null) {
                                                i10 = R.id.repeatPlaylistButton;
                                                ImageView imageView = (ImageView) b.t(view, R.id.repeatPlaylistButton);
                                                if (imageView != null) {
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                                    i10 = R.id.shufflePlaylistButton;
                                                    ImageView imageView2 = (ImageView) b.t(view, R.id.shufflePlaylistButton);
                                                    if (imageView2 != null) {
                                                        i10 = R.id.toolbar;
                                                        Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
                                                        if (toolbar != null) {
                                                            i10 = R.id.toolbar_title;
                                                            TextView textView = (TextView) b.t(view, R.id.toolbar_title);
                                                            if (textView != null) {
                                                                i10 = R.id.video_details_container;
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) b.t(view, R.id.video_details_container);
                                                                if (constraintLayout3 != null) {
                                                                    return new ActivityVideodetailsBinding(constraintLayout2, group, bind, tabLayout, viewPager, bind2, bind3, constraintLayout, linearLayout, frameLayout, frameLayout2, imageView, constraintLayout2, imageView2, toolbar, textView, constraintLayout3);
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

    public static ActivityVideodetailsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_videodetails, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4481a;
    }
}
