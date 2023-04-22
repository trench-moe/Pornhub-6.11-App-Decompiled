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
public final class LayoutOfflinePopupBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4878a;

    public LayoutOfflinePopupBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        this.f4878a = constraintLayout;
    }

    public static LayoutOfflinePopupBinding bind(View view) {
        int i10 = R.id.accept_button;
        TextView textView = (TextView) b.t(view, R.id.accept_button);
        if (textView != null) {
            i10 = R.id.imageView;
            ImageView imageView = (ImageView) b.t(view, R.id.imageView);
            if (imageView != null) {
                i10 = R.id.txt_description;
                TextView textView2 = (TextView) b.t(view, R.id.txt_description);
                if (textView2 != null) {
                    i10 = R.id.txt_download;
                    TextView textView3 = (TextView) b.t(view, R.id.txt_download);
                    if (textView3 != null) {
                        return new LayoutOfflinePopupBinding((ConstraintLayout) view, textView, imageView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutOfflinePopupBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.layout_offline_popup, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4878a;
    }
}
