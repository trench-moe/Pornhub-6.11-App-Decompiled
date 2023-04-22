package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentSplashscreenBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4645a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4646b;

    /* renamed from: c  reason: collision with root package name */
    public final ScrollView f4647c;
    public final TextView d;

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f4648e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f4649f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f4650g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f4651h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f4652i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f4653j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f4654k;

    /* renamed from: l  reason: collision with root package name */
    public final ProgressBar f4655l;

    public FragmentSplashscreenBinding(LinearLayout linearLayout, TextView textView, TextView textView2, ScrollView scrollView, TextView textView3, ProgressBar progressBar, LinearLayout linearLayout2, ImageView imageView, ImageView imageView2, TextView textView4, TextView textView5, TextView textView6, ProgressBar progressBar2) {
        this.f4645a = linearLayout;
        this.f4646b = textView;
        this.f4647c = scrollView;
        this.d = textView3;
        this.f4648e = progressBar;
        this.f4649f = linearLayout2;
        this.f4650g = imageView;
        this.f4651h = imageView2;
        this.f4652i = textView4;
        this.f4653j = textView5;
        this.f4654k = textView6;
        this.f4655l = progressBar2;
    }

    public static FragmentSplashscreenBinding bind(View view) {
        int i10 = R.id.actionButton;
        TextView textView = (TextView) b.t(view, R.id.actionButton);
        if (textView != null) {
            i10 = R.id.activity_splashscreen_txtChangelog;
            TextView textView2 = (TextView) b.t(view, R.id.activity_splashscreen_txtChangelog);
            if (textView2 != null) {
                i10 = R.id.changelogLayout;
                ScrollView scrollView = (ScrollView) b.t(view, R.id.changelogLayout);
                if (scrollView != null) {
                    i10 = R.id.labelOr;
                    TextView textView3 = (TextView) b.t(view, R.id.labelOr);
                    if (textView3 != null) {
                        i10 = R.id.loadingIndicator;
                        ProgressBar progressBar = (ProgressBar) b.t(view, R.id.loadingIndicator);
                        if (progressBar != null) {
                            i10 = R.id.offlineActionContainer;
                            LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.offlineActionContainer);
                            if (linearLayout != null) {
                                i10 = R.id.splashLogoLeft;
                                ImageView imageView = (ImageView) b.t(view, R.id.splashLogoLeft);
                                if (imageView != null) {
                                    i10 = R.id.splashLogoRight;
                                    ImageView imageView2 = (ImageView) b.t(view, R.id.splashLogoRight);
                                    if (imageView2 != null) {
                                        i10 = R.id.splashScreenMessage;
                                        TextView textView4 = (TextView) b.t(view, R.id.splashScreenMessage);
                                        if (textView4 != null) {
                                            i10 = R.id.updateAppButton;
                                            TextView textView5 = (TextView) b.t(view, R.id.updateAppButton);
                                            if (textView5 != null) {
                                                i10 = R.id.updateAppMessage;
                                                TextView textView6 = (TextView) b.t(view, R.id.updateAppMessage);
                                                if (textView6 != null) {
                                                    i10 = R.id.updateDownloadProgress;
                                                    ProgressBar progressBar2 = (ProgressBar) b.t(view, R.id.updateDownloadProgress);
                                                    if (progressBar2 != null) {
                                                        return new FragmentSplashscreenBinding((LinearLayout) view, textView, textView2, scrollView, textView3, progressBar, linearLayout, imageView, imageView2, textView4, textView5, textView6, progressBar2);
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

    public static FragmentSplashscreenBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_splashscreen, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4645a;
    }
}
