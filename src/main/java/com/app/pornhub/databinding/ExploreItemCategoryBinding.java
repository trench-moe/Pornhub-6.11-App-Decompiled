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
public final class ExploreItemCategoryBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final CardView f4516a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4517b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4518c;
    public final TextView d;

    public ExploreItemCategoryBinding(CardView cardView, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.f4516a = cardView;
        this.f4517b = imageView;
        this.f4518c = textView;
        this.d = textView2;
    }

    public static ExploreItemCategoryBinding bind(View view) {
        int i10 = R.id.imageViewCardBackground;
        ImageView imageView = (ImageView) b.t(view, R.id.imageViewCardBackground);
        if (imageView != null) {
            i10 = R.id.imageViewGradient;
            ImageView imageView2 = (ImageView) b.t(view, R.id.imageViewGradient);
            if (imageView2 != null) {
                i10 = R.id.textViewCategoryName;
                TextView textView = (TextView) b.t(view, R.id.textViewCategoryName);
                if (textView != null) {
                    i10 = R.id.textViewVideosCount;
                    TextView textView2 = (TextView) b.t(view, R.id.textViewVideosCount);
                    if (textView2 != null) {
                        return new ExploreItemCategoryBinding((CardView) view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ExploreItemCategoryBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.explore_item_category, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4516a;
    }
}
