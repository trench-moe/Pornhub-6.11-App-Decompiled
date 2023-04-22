package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.app.pornhub.R;
import java.util.Objects;
import x1.a;

/* loaded from: classes.dex */
public final class LayoutSpinnerHeaderBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4883a;

    public LayoutSpinnerHeaderBinding(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.f4883a = linearLayout;
    }

    public static LayoutSpinnerHeaderBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        LinearLayout linearLayout = (LinearLayout) view;
        return new LayoutSpinnerHeaderBinding(linearLayout, linearLayout);
    }

    public static LayoutSpinnerHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.layout_spinner_header, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4883a;
    }
}
