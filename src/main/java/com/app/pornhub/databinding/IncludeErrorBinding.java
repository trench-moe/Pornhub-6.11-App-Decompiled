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
public final class IncludeErrorBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4698a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4699b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4700c;

    public IncludeErrorBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, TextView textView) {
        this.f4698a = linearLayout;
        this.f4699b = imageView;
        this.f4700c = textView;
    }

    public static IncludeErrorBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i10 = R.id.error_segment_image;
        ImageView imageView = (ImageView) b.t(view, R.id.error_segment_image);
        if (imageView != null) {
            i10 = R.id.error_txtError;
            TextView textView = (TextView) b.t(view, R.id.error_txtError);
            if (textView != null) {
                return new IncludeErrorBinding(linearLayout, linearLayout, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IncludeErrorBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.include_error, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4698a;
    }
}
