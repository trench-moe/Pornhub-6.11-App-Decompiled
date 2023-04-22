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
public final class LayoutOfflinePopupNavDrawerBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4879a;

    public LayoutOfflinePopupNavDrawerBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f4879a = constraintLayout;
    }

    public static LayoutOfflinePopupNavDrawerBinding bind(View view) {
        int i10 = R.id.accept_button;
        TextView textView = (TextView) b.t(view, R.id.accept_button);
        if (textView != null) {
            i10 = R.id.imageView;
            ImageView imageView = (ImageView) b.t(view, R.id.imageView);
            if (imageView != null) {
                i10 = R.id.txt_description;
                TextView textView2 = (TextView) b.t(view, R.id.txt_description);
                if (textView2 != null) {
                    return new LayoutOfflinePopupNavDrawerBinding((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutOfflinePopupNavDrawerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.layout_offline_popup_nav_drawer, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4879a;
    }
}
