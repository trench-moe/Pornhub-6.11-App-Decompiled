package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class LayoutCombineImagesHorizontalBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4839a;

    public LayoutCombineImagesHorizontalBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2) {
        this.f4839a = constraintLayout;
    }

    public static LayoutCombineImagesHorizontalBinding bind(View view) {
        int i10 = R.id.image1;
        ImageView imageView = (ImageView) b.t(view, R.id.image1);
        if (imageView != null) {
            i10 = R.id.image2;
            ImageView imageView2 = (ImageView) b.t(view, R.id.image2);
            if (imageView2 != null) {
                return new LayoutCombineImagesHorizontalBinding((ConstraintLayout) view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutCombineImagesHorizontalBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.layout_combine_images_horizontal, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4839a;
    }
}
