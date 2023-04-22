package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.b;
import androidx.databinding.d;
import com.app.pornhub.R;
import com.app.pornhub.carouselview.CarouselView;
import com.app.pornhub.view.common.widget.VideoViewCustom;

/* loaded from: classes.dex */
public abstract class ActivityLockedPayVideoBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final VideoViewCustom E;
    public final ConstraintLayout F;
    public final ConstraintLayout G;

    /* renamed from: l  reason: collision with root package name */
    public final CarouselView f4407l;

    /* renamed from: m  reason: collision with root package name */
    public final FrameLayout f4408m;
    public final ImageView n;

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f4409o;

    /* renamed from: p  reason: collision with root package name */
    public final ItemLayoutVideoBinding f4410p;

    /* renamed from: q  reason: collision with root package name */
    public final ItemLayoutVideoBinding f4411q;

    /* renamed from: r  reason: collision with root package name */
    public final ItemLayoutVideoBinding f4412r;

    /* renamed from: s  reason: collision with root package name */
    public final ItemLayoutVideoBinding f4413s;

    /* renamed from: t  reason: collision with root package name */
    public final ProgressBar f4414t;

    /* renamed from: u  reason: collision with root package name */
    public final ConstraintLayout f4415u;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f4416v;

    /* renamed from: w  reason: collision with root package name */
    public final Toolbar f4417w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f4418x;
    public final TextView y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f4419z;

    public ActivityLockedPayVideoBinding(Object obj, View view, int i10, CarouselView carouselView, FrameLayout frameLayout, Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, ItemLayoutVideoBinding itemLayoutVideoBinding, ItemLayoutVideoBinding itemLayoutVideoBinding2, ItemLayoutVideoBinding itemLayoutVideoBinding3, ItemLayoutVideoBinding itemLayoutVideoBinding4, ProgressBar progressBar, ImageView imageView4, ConstraintLayout constraintLayout, ImageView imageView5, ScrollView scrollView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, VideoViewCustom videoViewCustom, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4) {
        super(obj, view, i10);
        this.f4407l = carouselView;
        this.f4408m = frameLayout;
        this.n = imageView;
        this.f4409o = imageView2;
        this.f4410p = itemLayoutVideoBinding;
        this.f4411q = itemLayoutVideoBinding2;
        this.f4412r = itemLayoutVideoBinding3;
        this.f4413s = itemLayoutVideoBinding4;
        this.f4414t = progressBar;
        this.f4415u = constraintLayout;
        this.f4416v = imageView5;
        this.f4417w = toolbar;
        this.f4418x = textView3;
        this.y = textView5;
        this.f4419z = textView7;
        this.A = textView8;
        this.B = textView9;
        this.C = textView10;
        this.D = textView11;
        this.E = videoViewCustom;
        this.F = constraintLayout2;
        this.G = constraintLayout4;
    }

    public static ActivityLockedPayVideoBinding bind(View view) {
        b bVar = d.f1907a;
        return (ActivityLockedPayVideoBinding) ViewDataBinding.c(null, view, R.layout.activity_locked_pay_video);
    }

    public static ActivityLockedPayVideoBinding inflate(LayoutInflater layoutInflater) {
        b bVar = d.f1907a;
        return (ActivityLockedPayVideoBinding) ViewDataBinding.h(layoutInflater, R.layout.activity_locked_pay_video, null, false, null);
    }
}
