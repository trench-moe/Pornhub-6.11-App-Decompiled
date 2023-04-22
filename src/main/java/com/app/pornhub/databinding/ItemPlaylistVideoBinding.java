package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ItemPlaylistVideoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4761a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4762b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f4763c;
    public final ImageView d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f4764e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f4765f;

    /* renamed from: g  reason: collision with root package name */
    public final FrameLayout f4766g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f4767h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f4768i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f4769j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f4770k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f4771l;

    public ItemPlaylistVideoBinding(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, TextView textView, TextView textView2, FrameLayout frameLayout, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f4761a = constraintLayout;
        this.f4762b = imageView;
        this.f4763c = imageView2;
        this.d = imageView3;
        this.f4764e = imageView4;
        this.f4765f = textView2;
        this.f4766g = frameLayout;
        this.f4767h = textView3;
        this.f4768i = textView4;
        this.f4769j = textView5;
        this.f4770k = textView6;
        this.f4771l = textView7;
    }

    public static ItemPlaylistVideoBinding bind(View view) {
        int i10 = R.id.guide_end;
        Guideline guideline = (Guideline) b.t(view, R.id.guide_end);
        if (guideline != null) {
            i10 = R.id.guide_start;
            Guideline guideline2 = (Guideline) b.t(view, R.id.guide_start);
            if (guideline2 != null) {
                i10 = R.id.guide_video_width;
                Guideline guideline3 = (Guideline) b.t(view, R.id.guide_video_width);
                if (guideline3 != null) {
                    i10 = R.id.icPayVideo;
                    ImageView imageView = (ImageView) b.t(view, R.id.icPayVideo);
                    if (imageView != null) {
                        i10 = R.id.icPremium;
                        ImageView imageView2 = (ImageView) b.t(view, R.id.icPremium);
                        if (imageView2 != null) {
                            i10 = R.id.imageViewUploaderType;
                            ImageView imageView3 = (ImageView) b.t(view, R.id.imageViewUploaderType);
                            if (imageView3 != null) {
                                i10 = R.id.imgThumb;
                                ImageView imageView4 = (ImageView) b.t(view, R.id.imgThumb);
                                if (imageView4 != null) {
                                    i10 = R.id.pls_item_ic_rating;
                                    ImageView imageView5 = (ImageView) b.t(view, R.id.pls_item_ic_rating);
                                    if (imageView5 != null) {
                                        i10 = R.id.pls_item_video_count_text;
                                        TextView textView = (TextView) b.t(view, R.id.pls_item_video_count_text);
                                        if (textView != null) {
                                            i10 = R.id.plsThreeDot;
                                            TextView textView2 = (TextView) b.t(view, R.id.plsThreeDot);
                                            if (textView2 != null) {
                                                i10 = R.id.previewContainer;
                                                FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.previewContainer);
                                                if (frameLayout != null) {
                                                    i10 = R.id.rating;
                                                    TextView textView3 = (TextView) b.t(view, R.id.rating);
                                                    if (textView3 != null) {
                                                        i10 = R.id.videoLength;
                                                        TextView textView4 = (TextView) b.t(view, R.id.videoLength);
                                                        if (textView4 != null) {
                                                            i10 = R.id.videoTitle;
                                                            TextView textView5 = (TextView) b.t(view, R.id.videoTitle);
                                                            if (textView5 != null) {
                                                                i10 = R.id.videoType;
                                                                TextView textView6 = (TextView) b.t(view, R.id.videoType);
                                                                if (textView6 != null) {
                                                                    i10 = R.id.viewCount;
                                                                    TextView textView7 = (TextView) b.t(view, R.id.viewCount);
                                                                    if (textView7 != null) {
                                                                        return new ItemPlaylistVideoBinding((ConstraintLayout) view, guideline, guideline2, guideline3, imageView, imageView2, imageView3, imageView4, imageView5, textView, textView2, frameLayout, textView3, textView4, textView5, textView6, textView7);
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

    public static ItemPlaylistVideoBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_playlist_video, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4761a;
    }
}
