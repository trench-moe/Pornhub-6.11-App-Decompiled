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
public final class ItemPornstarBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4773a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4774b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f4775c;
    public final AppCompatImageView d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f4776e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f4777f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f4778g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f4779h;

    public ItemPornstarBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, AppCompatImageView appCompatImageView, CardView cardView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f4773a = constraintLayout;
        this.f4774b = imageView;
        this.f4775c = imageView2;
        this.d = appCompatImageView;
        this.f4776e = textView;
        this.f4777f = textView2;
        this.f4778g = textView3;
        this.f4779h = textView4;
    }

    public static ItemPornstarBinding bind(View view) {
        int i10 = R.id.ic_award;
        ImageView imageView = (ImageView) b.t(view, R.id.ic_award);
        if (imageView != null) {
            i10 = R.id.ic_checkmark;
            ImageView imageView2 = (ImageView) b.t(view, R.id.ic_checkmark);
            if (imageView2 != null) {
                i10 = R.id.pornstar_image;
                AppCompatImageView appCompatImageView = (AppCompatImageView) b.t(view, R.id.pornstar_image);
                if (appCompatImageView != null) {
                    i10 = R.id.pornstar_image_container;
                    CardView cardView = (CardView) b.t(view, R.id.pornstar_image_container);
                    if (cardView != null) {
                        i10 = R.id.pornstar_name;
                        TextView textView = (TextView) b.t(view, R.id.pornstar_name);
                        if (textView != null) {
                            i10 = R.id.rank_value;
                            TextView textView2 = (TextView) b.t(view, R.id.rank_value);
                            if (textView2 != null) {
                                i10 = R.id.videos_count;
                                TextView textView3 = (TextView) b.t(view, R.id.videos_count);
                                if (textView3 != null) {
                                    i10 = R.id.views_count;
                                    TextView textView4 = (TextView) b.t(view, R.id.views_count);
                                    if (textView4 != null) {
                                        return new ItemPornstarBinding((ConstraintLayout) view, imageView, imageView2, appCompatImageView, cardView, textView, textView2, textView3, textView4);
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

    public static ItemPornstarBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_pornstar, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4773a;
    }
}
