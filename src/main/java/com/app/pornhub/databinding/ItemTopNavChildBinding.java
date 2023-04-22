package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ItemTopNavChildBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f4798a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4799b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f4800c;
    public final TextView d;

    public ItemTopNavChildBinding(FrameLayout frameLayout, ImageView imageView, ConstraintLayout constraintLayout, TextView textView) {
        this.f4798a = frameLayout;
        this.f4799b = imageView;
        this.f4800c = constraintLayout;
        this.d = textView;
    }

    public static ItemTopNavChildBinding bind(View view) {
        int i10 = R.id.expandIcon;
        ImageView imageView = (ImageView) b.t(view, R.id.expandIcon);
        if (imageView != null) {
            i10 = R.id.mainContainer;
            ConstraintLayout constraintLayout = (ConstraintLayout) b.t(view, R.id.mainContainer);
            if (constraintLayout != null) {
                i10 = R.id.text;
                TextView textView = (TextView) b.t(view, R.id.text);
                if (textView != null) {
                    return new ItemTopNavChildBinding((FrameLayout) view, imageView, constraintLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemTopNavChildBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_top_nav_child, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4798a;
    }
}
