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
public final class ExploreItemChannelBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4519a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4520b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4521c;

    public ExploreItemChannelBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.f4519a = constraintLayout;
        this.f4520b = imageView2;
        this.f4521c = textView;
    }

    public static ExploreItemChannelBinding bind(View view) {
        int i10 = R.id.imageViewGradient;
        ImageView imageView = (ImageView) b.t(view, R.id.imageViewGradient);
        if (imageView != null) {
            i10 = R.id.imageViewThumbnail;
            ImageView imageView2 = (ImageView) b.t(view, R.id.imageViewThumbnail);
            if (imageView2 != null) {
                i10 = R.id.textViewTitle;
                TextView textView = (TextView) b.t(view, R.id.textViewTitle);
                if (textView != null) {
                    return new ExploreItemChannelBinding((ConstraintLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ExploreItemChannelBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.explore_item_channel, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4519a;
    }
}
