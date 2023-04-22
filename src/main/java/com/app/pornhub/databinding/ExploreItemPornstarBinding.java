package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ExploreItemPornstarBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4525a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4526b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f4527c;
    public final ImageView d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatImageView f4528e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f4529f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f4530g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f4531h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f4532i;

    public ExploreItemPornstarBinding(ConstraintLayout constraintLayout, CardView cardView, ImageView imageView, ImageView imageView2, ImageView imageView3, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f4525a = constraintLayout;
        this.f4526b = imageView;
        this.f4527c = imageView2;
        this.d = imageView3;
        this.f4528e = appCompatImageView;
        this.f4529f = textView;
        this.f4530g = textView2;
        this.f4531h = textView3;
        this.f4532i = textView4;
    }

    public static ExploreItemPornstarBinding bind(View view) {
        int i10 = R.id.cardViewPornstarContainer;
        CardView cardView = (CardView) b.t(view, R.id.cardViewPornstarContainer);
        if (cardView != null) {
            i10 = R.id.imageViewIconAward;
            ImageView imageView = (ImageView) b.t(view, R.id.imageViewIconAward);
            if (imageView != null) {
                i10 = R.id.imageViewIconPremium;
                ImageView imageView2 = (ImageView) b.t(view, R.id.imageViewIconPremium);
                if (imageView2 != null) {
                    i10 = R.id.imageViewIconVerified;
                    ImageView imageView3 = (ImageView) b.t(view, R.id.imageViewIconVerified);
                    if (imageView3 != null) {
                        i10 = R.id.imageViewPornstarImage;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) b.t(view, R.id.imageViewPornstarImage);
                        if (appCompatImageView != null) {
                            i10 = R.id.textViewName;
                            TextView textView = (TextView) b.t(view, R.id.textViewName);
                            if (textView != null) {
                                i10 = R.id.textViewRankValue;
                                TextView textView2 = (TextView) b.t(view, R.id.textViewRankValue);
                                if (textView2 != null) {
                                    i10 = R.id.textViewVideosCount;
                                    TextView textView3 = (TextView) b.t(view, R.id.textViewVideosCount);
                                    if (textView3 != null) {
                                        i10 = R.id.textViewViewsCount;
                                        TextView textView4 = (TextView) b.t(view, R.id.textViewViewsCount);
                                        if (textView4 != null) {
                                            return new ExploreItemPornstarBinding((ConstraintLayout) view, cardView, imageView, imageView2, imageView3, appCompatImageView, textView, textView2, textView3, textView4);
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

    public static ExploreItemPornstarBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.explore_item_pornstar, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4525a;
    }
}
