package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ItemPornstarsAdditionalFiltersRadioSectionBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4780a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4781b;

    /* renamed from: c  reason: collision with root package name */
    public final RadioGroup f4782c;

    public ItemPornstarsAdditionalFiltersRadioSectionBinding(LinearLayout linearLayout, TextView textView, RadioGroup radioGroup) {
        this.f4780a = linearLayout;
        this.f4781b = textView;
        this.f4782c = radioGroup;
    }

    public static ItemPornstarsAdditionalFiltersRadioSectionBinding bind(View view) {
        int i10 = R.id.labelTitle;
        TextView textView = (TextView) b.t(view, R.id.labelTitle);
        if (textView != null) {
            i10 = R.id.radioGroup;
            RadioGroup radioGroup = (RadioGroup) b.t(view, R.id.radioGroup);
            if (radioGroup != null) {
                return new ItemPornstarsAdditionalFiltersRadioSectionBinding((LinearLayout) view, textView, radioGroup);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemPornstarsAdditionalFiltersRadioSectionBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_pornstars_additional_filters_radio_section, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4780a;
    }
}
