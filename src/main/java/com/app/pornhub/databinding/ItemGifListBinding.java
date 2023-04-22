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
public final class ItemGifListBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4722a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4723b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4724c;

    public ItemGifListBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.f4722a = constraintLayout;
        this.f4723b = imageView;
        this.f4724c = textView;
    }

    public static ItemGifListBinding bind(View view) {
        int i10 = R.id.thumbnail;
        ImageView imageView = (ImageView) b.t(view, R.id.thumbnail);
        if (imageView != null) {
            i10 = R.id.title;
            TextView textView = (TextView) b.t(view, R.id.title);
            if (textView != null) {
                return new ItemGifListBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemGifListBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_gif_list, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4722a;
    }
}
