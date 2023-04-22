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
import com.app.pornhub.view.common.widget.DvdCoverView;
import x1.a;

/* loaded from: classes.dex */
public final class LayoutDvdInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4872a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4873b;

    /* renamed from: c  reason: collision with root package name */
    public final DvdCoverView f4874c;
    public final TextView d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f4875e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f4876f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f4877g;

    public LayoutDvdInfoBinding(ConstraintLayout constraintLayout, TextView textView, DvdCoverView dvdCoverView, TextView textView2, Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f4872a = constraintLayout;
        this.f4873b = textView;
        this.f4874c = dvdCoverView;
        this.d = textView2;
        this.f4875e = textView4;
        this.f4876f = textView5;
        this.f4877g = textView6;
    }

    public static LayoutDvdInfoBinding bind(View view) {
        int i10 = R.id.description;
        TextView textView = (TextView) b.t(view, R.id.description);
        if (textView != null) {
            i10 = R.id.dvd_cover;
            DvdCoverView dvdCoverView = (DvdCoverView) b.t(view, R.id.dvd_cover);
            if (dvdCoverView != null) {
                i10 = R.id.from;
                TextView textView2 = (TextView) b.t(view, R.id.from);
                if (textView2 != null) {
                    i10 = R.id.guideline;
                    Guideline guideline = (Guideline) b.t(view, R.id.guideline);
                    if (guideline != null) {
                        i10 = R.id.ic_videos_count;
                        ImageView imageView = (ImageView) b.t(view, R.id.ic_videos_count);
                        if (imageView != null) {
                            i10 = R.id.icon_length;
                            ImageView imageView2 = (ImageView) b.t(view, R.id.icon_length);
                            if (imageView2 != null) {
                                i10 = R.id.icon_views_count;
                                ImageView imageView3 = (ImageView) b.t(view, R.id.icon_views_count);
                                if (imageView3 != null) {
                                    i10 = R.id.text_from;
                                    TextView textView3 = (TextView) b.t(view, R.id.text_from);
                                    if (textView3 != null) {
                                        i10 = R.id.video_length;
                                        TextView textView4 = (TextView) b.t(view, R.id.video_length);
                                        if (textView4 != null) {
                                            i10 = R.id.videos_count;
                                            TextView textView5 = (TextView) b.t(view, R.id.videos_count);
                                            if (textView5 != null) {
                                                i10 = R.id.views_count;
                                                TextView textView6 = (TextView) b.t(view, R.id.views_count);
                                                if (textView6 != null) {
                                                    return new LayoutDvdInfoBinding((ConstraintLayout) view, textView, dvdCoverView, textView2, guideline, imageView, imageView2, imageView3, textView3, textView4, textView5, textView6);
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

    public static LayoutDvdInfoBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.layout_dvd_info, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4872a;
    }
}
