package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.app.pornhub.R;
import java.util.Objects;
import x1.a;

/* loaded from: classes.dex */
public final class SpinnerFiltersBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f4890a;

    public SpinnerFiltersBinding(TextView textView) {
        this.f4890a = textView;
    }

    public static SpinnerFiltersBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new SpinnerFiltersBinding((TextView) view);
    }

    public static SpinnerFiltersBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.spinner_filters, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4890a;
    }
}
