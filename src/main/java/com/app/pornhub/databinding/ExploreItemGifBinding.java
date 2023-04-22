package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ExploreItemGifBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final CardView f4522a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4523b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4524c;

    public ExploreItemGifBinding(CardView cardView, ImageView imageView, ImageView imageView2, TextView textView) {
        this.f4522a = cardView;
        this.f4523b = imageView;
        this.f4524c = textView;
    }

    public static ExploreItemGifBinding bind(View view) {
        int i10 = R.id.imageViewGifThumbnail;
        ImageView imageView = (ImageView) b.t(view, R.id.imageViewGifThumbnail);
        if (imageView != null) {
            i10 = R.id.imageViewGradient;
            ImageView imageView2 = (ImageView) b.t(view, R.id.imageViewGradient);
            if (imageView2 != null) {
                i10 = R.id.textViewGifTitle;
                TextView textView = (TextView) b.t(view, R.id.textViewGifTitle);
                if (textView != null) {
                    return new ExploreItemGifBinding((CardView) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ExploreItemGifBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.explore_item_gif, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4522a;
    }
}
