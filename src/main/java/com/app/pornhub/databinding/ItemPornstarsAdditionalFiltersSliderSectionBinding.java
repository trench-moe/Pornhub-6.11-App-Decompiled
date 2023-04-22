package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import com.google.android.material.slider.RangeSlider;
import x1.a;

/* loaded from: classes.dex */
public final class ItemPornstarsAdditionalFiltersSliderSectionBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4783a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4784b;

    /* renamed from: c  reason: collision with root package name */
    public final RangeSlider f4785c;
    public final LinearLayout d;

    public ItemPornstarsAdditionalFiltersSliderSectionBinding(LinearLayout linearLayout, TextView textView, RangeSlider rangeSlider, LinearLayout linearLayout2) {
        this.f4783a = linearLayout;
        this.f4784b = textView;
        this.f4785c = rangeSlider;
        this.d = linearLayout2;
    }

    public static ItemPornstarsAdditionalFiltersSliderSectionBinding bind(View view) {
        int i10 = R.id.labelTitle;
        TextView textView = (TextView) b.t(view, R.id.labelTitle);
        if (textView != null) {
            i10 = R.id.rangeSlider;
            RangeSlider rangeSlider = (RangeSlider) b.t(view, R.id.rangeSlider);
            if (rangeSlider != null) {
                i10 = R.id.rangeValues;
                LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.rangeValues);
                if (linearLayout != null) {
                    return new ItemPornstarsAdditionalFiltersSliderSectionBinding((LinearLayout) view, textView, rangeSlider, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemPornstarsAdditionalFiltersSliderSectionBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_pornstars_additional_filters_slider_section, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4783a;
    }
}
