package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class QuickSeekOverlayContentBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4887a;

    public QuickSeekOverlayContentBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout2, TextView textView) {
        this.f4887a = linearLayout;
    }

    public static QuickSeekOverlayContentBinding bind(View view) {
        int i10 = R.id.icon_1;
        ImageView imageView = (ImageView) b.t(view, R.id.icon_1);
        if (imageView != null) {
            i10 = R.id.icon_2;
            ImageView imageView2 = (ImageView) b.t(view, R.id.icon_2);
            if (imageView2 != null) {
                i10 = R.id.icon_3;
                ImageView imageView3 = (ImageView) b.t(view, R.id.icon_3);
                if (imageView3 != null) {
                    i10 = R.id.triangle_container;
                    LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.triangle_container);
                    if (linearLayout != null) {
                        i10 = R.id.tv_seconds;
                        TextView textView = (TextView) b.t(view, R.id.tv_seconds);
                        if (textView != null) {
                            return new QuickSeekOverlayContentBinding((LinearLayout) view, imageView, imageView2, imageView3, linearLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static QuickSeekOverlayContentBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.quick_seek_overlay_content, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4887a;
    }
}
