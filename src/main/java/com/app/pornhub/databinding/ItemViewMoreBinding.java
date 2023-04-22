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
public final class ItemViewMoreBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4822a;

    public ItemViewMoreBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.f4822a = constraintLayout;
    }

    public static ItemViewMoreBinding a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_view_more, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemViewMoreBinding bind(View view) {
        int i10 = R.id.imageView;
        ImageView imageView = (ImageView) b.t(view, R.id.imageView);
        if (imageView != null) {
            i10 = R.id.textView;
            TextView textView = (TextView) b.t(view, R.id.textView);
            if (textView != null) {
                return new ItemViewMoreBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemViewMoreBinding inflate(LayoutInflater layoutInflater) {
        return a(layoutInflater, null, false);
    }

    @Override // x1.a
    public View b() {
        return this.f4822a;
    }
}
