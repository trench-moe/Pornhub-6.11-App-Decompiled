package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ItemOfflineVideoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4736a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4737b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f4738c;
    public final ImageView d;

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f4739e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f4740f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f4741g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f4742h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f4743i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f4744j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f4745k;

    public ItemOfflineVideoBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ProgressBar progressBar, TextView textView, ImageView imageView4, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f4736a = constraintLayout;
        this.f4737b = imageView;
        this.f4738c = imageView2;
        this.d = imageView3;
        this.f4739e = progressBar;
        this.f4740f = textView;
        this.f4741g = imageView4;
        this.f4742h = textView2;
        this.f4743i = textView3;
        this.f4744j = textView4;
        this.f4745k = textView5;
    }

    public static ItemOfflineVideoBinding bind(View view) {
        int i10 = R.id.icPremium;
        ImageView imageView = (ImageView) b.t(view, R.id.icPremium);
        if (imageView != null) {
            i10 = R.id.imageViewUploaderType;
            ImageView imageView2 = (ImageView) b.t(view, R.id.imageViewUploaderType);
            if (imageView2 != null) {
                i10 = R.id.imgThumb;
                ImageView imageView3 = (ImageView) b.t(view, R.id.imgThumb);
                if (imageView3 != null) {
                    i10 = R.id.progressBar;
                    ProgressBar progressBar = (ProgressBar) b.t(view, R.id.progressBar);
                    if (progressBar != null) {
                        i10 = R.id.progress_percent;
                        TextView textView = (TextView) b.t(view, R.id.progress_percent);
                        if (textView != null) {
                            i10 = R.id.statusOverlayImg;
                            ImageView imageView4 = (ImageView) b.t(view, R.id.statusOverlayImg);
                            if (imageView4 != null) {
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
                                                return new ItemOfflineVideoBinding((ConstraintLayout) view, imageView, imageView2, imageView3, progressBar, textView, imageView4, textView2, textView3, textView4, textView5);
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

    public static ItemOfflineVideoBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_offline_video, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4736a;
    }
}
