package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.app.pornhub.R;
import java.util.Objects;
import x1.a;

/* loaded from: classes.dex */
public final class LayoutAdditionalFiltersSlideTextBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f4824a;

    public LayoutAdditionalFiltersSlideTextBinding(TextView textView) {
        this.f4824a = textView;
    }

    public static LayoutAdditionalFiltersSlideTextBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new LayoutAdditionalFiltersSlideTextBinding((TextView) view);
    }

    public static LayoutAdditionalFiltersSlideTextBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.layout_additional_filters_slide_text, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4824a;
    }
}
