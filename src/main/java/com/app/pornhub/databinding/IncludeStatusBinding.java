package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class IncludeStatusBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4702a;

    public IncludeStatusBinding(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.f4702a = linearLayout;
    }

    public static IncludeStatusBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.status_llyLoading);
        if (linearLayout != null) {
            return new IncludeStatusBinding((LinearLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.status_llyLoading)));
    }

    public static IncludeStatusBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.include_status, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4702a;
    }
}
