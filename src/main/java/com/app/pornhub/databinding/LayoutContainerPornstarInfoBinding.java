package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.PerformerBannerView;
import x1.a;

/* loaded from: classes.dex */
public final class LayoutContainerPornstarInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4841a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4842b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f4843c;
    public final ImageView d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f4844e;

    /* renamed from: f  reason: collision with root package name */
    public final PerformerBannerView f4845f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f4846g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f4847h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f4848i;

    public LayoutContainerPornstarInfoBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, PerformerBannerView performerBannerView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f4841a = constraintLayout;
        this.f4842b = imageView;
        this.f4843c = imageView2;
        this.d = imageView3;
        this.f4844e = textView;
        this.f4845f = performerBannerView;
        this.f4846g = textView3;
        this.f4847h = textView5;
        this.f4848i = textView7;
    }

    public static LayoutContainerPornstarInfoBinding bind(View view) {
        int i10 = R.id.icon_next;
        ImageView imageView = (ImageView) b.t(view, R.id.icon_next);
        if (imageView != null) {
            i10 = R.id.icon_prev;
            ImageView imageView2 = (ImageView) b.t(view, R.id.icon_prev);
            if (imageView2 != null) {
                i10 = R.id.imageViewVerified;
                ImageView imageView3 = (ImageView) b.t(view, R.id.imageViewVerified);
                if (imageView3 != null) {
                    i10 = R.id.name;
                    TextView textView = (TextView) b.t(view, R.id.name);
                    if (textView != null) {
                        i10 = R.id.pornstar_cover;
                        PerformerBannerView performerBannerView = (PerformerBannerView) b.t(view, R.id.pornstar_cover);
                        if (performerBannerView != null) {
                            i10 = R.id.rank;
                            TextView textView2 = (TextView) b.t(view, R.id.rank);
                            if (textView2 != null) {
                                i10 = R.id.rank_value;
                                TextView textView3 = (TextView) b.t(view, R.id.rank_value);
                                if (textView3 != null) {
                                    i10 = R.id.subscribers;
                                    TextView textView4 = (TextView) b.t(view, R.id.subscribers);
                                    if (textView4 != null) {
                                        i10 = R.id.subscribers_value;
                                        TextView textView5 = (TextView) b.t(view, R.id.subscribers_value);
                                        if (textView5 != null) {
                                            i10 = R.id.views;
                                            TextView textView6 = (TextView) b.t(view, R.id.views);
                                            if (textView6 != null) {
                                                i10 = R.id.views_value;
                                                TextView textView7 = (TextView) b.t(view, R.id.views_value);
                                                if (textView7 != null) {
                                                    return new LayoutContainerPornstarInfoBinding((ConstraintLayout) view, imageView, imageView2, imageView3, textView, performerBannerView, textView2, textView3, textView4, textView5, textView6, textView7);
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

    public static LayoutContainerPornstarInfoBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.layout_container_pornstar_info, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4841a;
    }
}
