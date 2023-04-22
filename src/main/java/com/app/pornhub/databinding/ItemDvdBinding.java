package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.DvdCoverView;
import x1.a;

/* loaded from: classes.dex */
public final class ItemDvdBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4715a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4716b;

    /* renamed from: c  reason: collision with root package name */
    public final DvdCoverView f4717c;
    public final TextView d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f4718e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f4719f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f4720g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f4721h;

    public ItemDvdBinding(ConstraintLayout constraintLayout, TextView textView, DvdCoverView dvdCoverView, TextView textView2, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView3, TextView textView4, TextView textView5) {
        this.f4715a = constraintLayout;
        this.f4716b = textView;
        this.f4717c = dvdCoverView;
        this.d = textView2;
        this.f4718e = imageView3;
        this.f4719f = textView3;
        this.f4720g = textView4;
        this.f4721h = textView5;
    }

    public static ItemDvdBinding bind(View view) {
        int i10 = R.id.channel_title;
        TextView textView = (TextView) b.t(view, R.id.channel_title);
        if (textView != null) {
            i10 = R.id.dvd_cover;
            DvdCoverView dvdCoverView = (DvdCoverView) b.t(view, R.id.dvd_cover);
            if (dvdCoverView != null) {
                i10 = R.id.dvd_title;
                TextView textView2 = (TextView) b.t(view, R.id.dvd_title);
                if (textView2 != null) {
                    i10 = R.id.image_camcoder;
                    ImageView imageView = (ImageView) b.t(view, R.id.image_camcoder);
                    if (imageView != null) {
                        i10 = R.id.image_views;
                        ImageView imageView2 = (ImageView) b.t(view, R.id.image_views);
                        if (imageView2 != null) {
                            i10 = R.id.premium_icon;
                            ImageView imageView3 = (ImageView) b.t(view, R.id.premium_icon);
                            if (imageView3 != null) {
                                i10 = R.id.video_quality_text;
                                TextView textView3 = (TextView) b.t(view, R.id.video_quality_text);
                                if (textView3 != null) {
                                    i10 = R.id.videos_count;
                                    TextView textView4 = (TextView) b.t(view, R.id.videos_count);
                                    if (textView4 != null) {
                                        i10 = R.id.views_count;
                                        TextView textView5 = (TextView) b.t(view, R.id.views_count);
                                        if (textView5 != null) {
                                            return new ItemDvdBinding((ConstraintLayout) view, textView, dvdCoverView, textView2, imageView, imageView2, imageView3, textView3, textView4, textView5);
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

    public static ItemDvdBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_dvd, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4715a;
    }
}
