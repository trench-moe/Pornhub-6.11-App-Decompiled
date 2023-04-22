package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityPremiumUpsellLaunchBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4466a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4467b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4468c;

    public ActivityPremiumUpsellLaunchBinding(ConstraintLayout constraintLayout, Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f4466a = constraintLayout;
        this.f4467b = textView5;
        this.f4468c = textView7;
    }

    public static ActivityPremiumUpsellLaunchBinding bind(View view) {
        int i10 = R.id.guide_50;
        Guideline guideline = (Guideline) b.t(view, R.id.guide_50);
        if (guideline != null) {
            i10 = R.id.ivCancelAnyTime;
            ImageView imageView = (ImageView) b.t(view, R.id.ivCancelAnyTime);
            if (imageView != null) {
                i10 = R.id.ivHighQuality;
                ImageView imageView2 = (ImageView) b.t(view, R.id.ivHighQuality);
                if (imageView2 != null) {
                    i10 = R.id.ivNoAds;
                    ImageView imageView3 = (ImageView) b.t(view, R.id.ivNoAds);
                    if (imageView3 != null) {
                        i10 = R.id.ivPornhubLogo;
                        ImageView imageView4 = (ImageView) b.t(view, R.id.ivPornhubLogo);
                        if (imageView4 != null) {
                            i10 = R.id.ivPremiumContent;
                            ImageView imageView5 = (ImageView) b.t(view, R.id.ivPremiumContent);
                            if (imageView5 != null) {
                                i10 = R.id.ivTopBackground;
                                ImageView imageView6 = (ImageView) b.t(view, R.id.ivTopBackground);
                                if (imageView6 != null) {
                                    i10 = R.id.tvBannerTitle;
                                    TextView textView = (TextView) b.t(view, R.id.tvBannerTitle);
                                    if (textView != null) {
                                        i10 = R.id.tvCancelAnyTime;
                                        TextView textView2 = (TextView) b.t(view, R.id.tvCancelAnyTime);
                                        if (textView2 != null) {
                                            i10 = R.id.tvHighQuality;
                                            TextView textView3 = (TextView) b.t(view, R.id.tvHighQuality);
                                            if (textView3 != null) {
                                                i10 = R.id.tvNoAds;
                                                TextView textView4 = (TextView) b.t(view, R.id.tvNoAds);
                                                if (textView4 != null) {
                                                    i10 = R.id.tvNoThanks;
                                                    TextView textView5 = (TextView) b.t(view, R.id.tvNoThanks);
                                                    if (textView5 != null) {
                                                        i10 = R.id.tvPremiumContent;
                                                        TextView textView6 = (TextView) b.t(view, R.id.tvPremiumContent);
                                                        if (textView6 != null) {
                                                            i10 = R.id.tvStartFreeWeek;
                                                            TextView textView7 = (TextView) b.t(view, R.id.tvStartFreeWeek);
                                                            if (textView7 != null) {
                                                                return new ActivityPremiumUpsellLaunchBinding((ConstraintLayout) view, guideline, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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

    public static ActivityPremiumUpsellLaunchBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_premium_upsell_launch, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4466a;
    }
}
