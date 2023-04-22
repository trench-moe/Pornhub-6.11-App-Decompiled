package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ExploreItemAlbumBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4508a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4509b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4510c;
    public final TextView d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f4511e;

    public ExploreItemAlbumBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3) {
        this.f4508a = constraintLayout;
        this.f4509b = imageView2;
        this.f4510c = textView;
        this.d = textView2;
        this.f4511e = textView3;
    }

    public static ExploreItemAlbumBinding bind(View view) {
        int i10 = R.id.imageViewGradient;
        ImageView imageView = (ImageView) b.t(view, R.id.imageViewGradient);
        if (imageView != null) {
            i10 = R.id.imageViewThumbnail;
            ImageView imageView2 = (ImageView) b.t(view, R.id.imageViewThumbnail);
            if (imageView2 != null) {
                i10 = R.id.textViewAlbumTitle;
                TextView textView = (TextView) b.t(view, R.id.textViewAlbumTitle);
                if (textView != null) {
                    i10 = R.id.textViewCount;
                    TextView textView2 = (TextView) b.t(view, R.id.textViewCount);
                    if (textView2 != null) {
                        i10 = R.id.textViewRating;
                        TextView textView3 = (TextView) b.t(view, R.id.textViewRating);
                        if (textView3 != null) {
                            return new ExploreItemAlbumBinding((ConstraintLayout) view, imageView, imageView2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ExploreItemAlbumBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.explore_item_album, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4508a;
    }
}
