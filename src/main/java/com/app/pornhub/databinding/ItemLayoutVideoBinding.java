package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ItemLayoutVideoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4725a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4726b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f4727c;
    public final ImageView d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f4728e;

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f4729f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f4730g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f4731h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f4732i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f4733j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f4734k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f4735l;

    public ItemLayoutVideoBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f4725a = constraintLayout;
        this.f4726b = imageView2;
        this.f4727c = imageView3;
        this.d = imageView4;
        this.f4728e = imageView6;
        this.f4729f = frameLayout;
        this.f4730g = textView;
        this.f4731h = textView2;
        this.f4732i = textView3;
        this.f4733j = textView4;
        this.f4734k = textView5;
        this.f4735l = textView6;
    }

    public static ItemLayoutVideoBinding a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_layout_video, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemLayoutVideoBinding bind(View view) {
        int i10 = R.id.icPadlock;
        ImageView imageView = (ImageView) b.t(view, R.id.icPadlock);
        if (imageView != null) {
            i10 = R.id.icPayVideo;
            ImageView imageView2 = (ImageView) b.t(view, R.id.icPayVideo);
            if (imageView2 != null) {
                i10 = R.id.icPremium;
                ImageView imageView3 = (ImageView) b.t(view, R.id.icPremium);
                if (imageView3 != null) {
                    i10 = R.id.imageViewUploaderType;
                    ImageView imageView4 = (ImageView) b.t(view, R.id.imageViewUploaderType);
                    if (imageView4 != null) {
                        i10 = R.id.imgRating;
                        ImageView imageView5 = (ImageView) b.t(view, R.id.imgRating);
                        if (imageView5 != null) {
                            i10 = R.id.imgThumb;
                            ImageView imageView6 = (ImageView) b.t(view, R.id.imgThumb);
                            if (imageView6 != null) {
                                i10 = R.id.previewContainer;
                                FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.previewContainer);
                                if (frameLayout != null) {
                                    i10 = R.id.rating;
                                    TextView textView = (TextView) b.t(view, R.id.rating);
                                    if (textView != null) {
                                        i10 = R.id.userName;
                                        TextView textView2 = (TextView) b.t(view, R.id.userName);
                                        if (textView2 != null) {
                                            i10 = R.id.videoLength;
                                            TextView textView3 = (TextView) b.t(view, R.id.videoLength);
                                            if (textView3 != null) {
                                                i10 = R.id.videoTitle;
                                                TextView textView4 = (TextView) b.t(view, R.id.videoTitle);
                                                if (textView4 != null) {
                                                    i10 = R.id.videoType;
                                                    TextView textView5 = (TextView) b.t(view, R.id.videoType);
                                                    if (textView5 != null) {
                                                        i10 = R.id.viewCount;
                                                        TextView textView6 = (TextView) b.t(view, R.id.viewCount);
                                                        if (textView6 != null) {
                                                            i10 = R.id.viewCountLabel;
                                                            TextView textView7 = (TextView) b.t(view, R.id.viewCountLabel);
                                                            if (textView7 != null) {
                                                                return new ItemLayoutVideoBinding((ConstraintLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, frameLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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

    public static ItemLayoutVideoBinding inflate(LayoutInflater layoutInflater) {
        return a(layoutInflater, null, false);
    }

    @Override // x1.a
    public View b() {
        return this.f4725a;
    }
}
