package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import com.app.pornhub.carouselview.CarouselView;
import com.app.pornhub.view.common.widget.VideoViewCustom;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityLockedVideoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4420a;

    /* renamed from: b  reason: collision with root package name */
    public final CarouselView f4421b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4422c;
    public final LinearLayout d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f4423e;

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f4424f;

    /* renamed from: g  reason: collision with root package name */
    public final ProgressBar f4425g;

    /* renamed from: h  reason: collision with root package name */
    public final ScrollView f4426h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f4427i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f4428j;

    /* renamed from: k  reason: collision with root package name */
    public final Toolbar f4429k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f4430l;

    /* renamed from: m  reason: collision with root package name */
    public final VideoViewCustom f4431m;

    public ActivityLockedVideoBinding(ConstraintLayout constraintLayout, CarouselView carouselView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, TextView textView, ImageView imageView6, LinearLayout linearLayout, TextView textView2, FrameLayout frameLayout, ProgressBar progressBar, ScrollView scrollView, TextView textView3, TextView textView4, Toolbar toolbar, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, VideoViewCustom videoViewCustom, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4) {
        this.f4420a = constraintLayout;
        this.f4421b = carouselView;
        this.f4422c = textView;
        this.d = linearLayout;
        this.f4423e = textView2;
        this.f4424f = frameLayout;
        this.f4425g = progressBar;
        this.f4426h = scrollView;
        this.f4427i = textView3;
        this.f4428j = textView4;
        this.f4429k = toolbar;
        this.f4430l = textView14;
        this.f4431m = videoViewCustom;
    }

    public static ActivityLockedVideoBinding bind(View view) {
        int i10 = R.id.carouselView;
        CarouselView carouselView = (CarouselView) b.t(view, R.id.carouselView);
        if (carouselView != null) {
            i10 = R.id.ivDiscreetBilling;
            ImageView imageView = (ImageView) b.t(view, R.id.ivDiscreetBilling);
            if (imageView != null) {
                i10 = R.id.ivFasterStreaming;
                ImageView imageView2 = (ImageView) b.t(view, R.id.ivFasterStreaming);
                if (imageView2 != null) {
                    i10 = R.id.ivNoAds;
                    ImageView imageView3 = (ImageView) b.t(view, R.id.ivNoAds);
                    if (imageView3 != null) {
                        i10 = R.id.ivPremiumLogo;
                        ImageView imageView4 = (ImageView) b.t(view, R.id.ivPremiumLogo);
                        if (imageView4 != null) {
                            i10 = R.id.ivUnlimitedDl;
                            ImageView imageView5 = (ImageView) b.t(view, R.id.ivUnlimitedDl);
                            if (imageView5 != null) {
                                i10 = R.id.moreVideos;
                                TextView textView = (TextView) b.t(view, R.id.moreVideos);
                                if (textView != null) {
                                    i10 = R.id.premium_icon;
                                    ImageView imageView6 = (ImageView) b.t(view, R.id.premium_icon);
                                    if (imageView6 != null) {
                                        i10 = R.id.relatedVideosContainer;
                                        LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.relatedVideosContainer);
                                        if (linearLayout != null) {
                                            i10 = R.id.relatedVideosError;
                                            TextView textView2 = (TextView) b.t(view, R.id.relatedVideosError);
                                            if (textView2 != null) {
                                                i10 = R.id.relatedVideosLayout;
                                                FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.relatedVideosLayout);
                                                if (frameLayout != null) {
                                                    i10 = R.id.relatedVideosProgressbar;
                                                    ProgressBar progressBar = (ProgressBar) b.t(view, R.id.relatedVideosProgressbar);
                                                    if (progressBar != null) {
                                                        i10 = R.id.scrollableContentContainer;
                                                        ScrollView scrollView = (ScrollView) b.t(view, R.id.scrollableContentContainer);
                                                        if (scrollView != null) {
                                                            i10 = R.id.startFreeWeekBottomButton;
                                                            TextView textView3 = (TextView) b.t(view, R.id.startFreeWeekBottomButton);
                                                            if (textView3 != null) {
                                                                i10 = R.id.startFreeWeekTopButton;
                                                                TextView textView4 = (TextView) b.t(view, R.id.startFreeWeekTopButton);
                                                                if (textView4 != null) {
                                                                    i10 = R.id.toolbar;
                                                                    Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
                                                                    if (toolbar != null) {
                                                                        i10 = R.id.toolbar_title;
                                                                        TextView textView5 = (TextView) b.t(view, R.id.toolbar_title);
                                                                        if (textView5 != null) {
                                                                            i10 = R.id.tvDiscreetBilling;
                                                                            TextView textView6 = (TextView) b.t(view, R.id.tvDiscreetBilling);
                                                                            if (textView6 != null) {
                                                                                i10 = R.id.tvFasterStreaming;
                                                                                TextView textView7 = (TextView) b.t(view, R.id.tvFasterStreaming);
                                                                                if (textView7 != null) {
                                                                                    i10 = R.id.tvFeaturesTitle;
                                                                                    TextView textView8 = (TextView) b.t(view, R.id.tvFeaturesTitle);
                                                                                    if (textView8 != null) {
                                                                                        i10 = R.id.tvNetworksPromoTitle;
                                                                                        TextView textView9 = (TextView) b.t(view, R.id.tvNetworksPromoTitle);
                                                                                        if (textView9 != null) {
                                                                                            i10 = R.id.tvNoAds;
                                                                                            TextView textView10 = (TextView) b.t(view, R.id.tvNoAds);
                                                                                            if (textView10 != null) {
                                                                                                i10 = R.id.tvRecommendedForYou;
                                                                                                TextView textView11 = (TextView) b.t(view, R.id.tvRecommendedForYou);
                                                                                                if (textView11 != null) {
                                                                                                    i10 = R.id.tvUnlimitedDl;
                                                                                                    TextView textView12 = (TextView) b.t(view, R.id.tvUnlimitedDl);
                                                                                                    if (textView12 != null) {
                                                                                                        i10 = R.id.tvUpgradeNow;
                                                                                                        TextView textView13 = (TextView) b.t(view, R.id.tvUpgradeNow);
                                                                                                        if (textView13 != null) {
                                                                                                            i10 = R.id.video_title;
                                                                                                            TextView textView14 = (TextView) b.t(view, R.id.video_title);
                                                                                                            if (textView14 != null) {
                                                                                                                i10 = R.id.videoView;
                                                                                                                VideoViewCustom videoViewCustom = (VideoViewCustom) b.t(view, R.id.videoView);
                                                                                                                if (videoViewCustom != null) {
                                                                                                                    i10 = R.id.viewLogoContainer;
                                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) b.t(view, R.id.viewLogoContainer);
                                                                                                                    if (constraintLayout != null) {
                                                                                                                        i10 = R.id.viewPremiumFeatures;
                                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) b.t(view, R.id.viewPremiumFeatures);
                                                                                                                        if (constraintLayout2 != null) {
                                                                                                                            i10 = R.id.viewVideosContainer;
                                                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) b.t(view, R.id.viewVideosContainer);
                                                                                                                            if (constraintLayout3 != null) {
                                                                                                                                return new ActivityLockedVideoBinding((ConstraintLayout) view, carouselView, imageView, imageView2, imageView3, imageView4, imageView5, textView, imageView6, linearLayout, textView2, frameLayout, progressBar, scrollView, textView3, textView4, toolbar, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, videoViewCustom, constraintLayout, constraintLayout2, constraintLayout3);
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

    public static ActivityLockedVideoBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_locked_video, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4420a;
    }
}
