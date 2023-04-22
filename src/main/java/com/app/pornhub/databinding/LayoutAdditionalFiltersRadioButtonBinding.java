package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.app.pornhub.R;
import java.util.Objects;
import x1.a;

/* loaded from: classes.dex */
public final class LayoutAdditionalFiltersRadioButtonBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final RadioButton f4823a;

    public LayoutAdditionalFiltersRadioButtonBinding(RadioButton radioButton) {
        this.f4823a = radioButton;
    }

    public static LayoutAdditionalFiltersRadioButtonBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new LayoutAdditionalFiltersRadioButtonBinding((RadioButton) view);
    }

    public static LayoutAdditionalFiltersRadioButtonBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.layout_additional_filters_radio_button, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4823a;
    }
}
