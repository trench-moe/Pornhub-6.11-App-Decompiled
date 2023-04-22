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
public final class FragmentGifsTileGridBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4602a;

    public FragmentGifsTileGridBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.f4602a = constraintLayout;
    }

    public static FragmentGifsTileGridBinding bind(View view) {
        int i10 = R.id.thumbnail;
        ImageView imageView = (ImageView) b.t(view, R.id.thumbnail);
        if (imageView != null) {
            i10 = R.id.title;
            TextView textView = (TextView) b.t(view, R.id.title);
            if (textView != null) {
                return new FragmentGifsTileGridBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentGifsTileGridBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_gifs_tile_grid, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4602a;
    }
}
