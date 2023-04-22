package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.app.pornhub.R;
import java.util.Objects;
import x1.a;

/* loaded from: classes.dex */
public final class RadiogroupPornstarFiltersBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final RadioGroup f4888a;

    public RadiogroupPornstarFiltersBinding(RadioGroup radioGroup) {
        this.f4888a = radioGroup;
    }

    public static RadiogroupPornstarFiltersBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new RadiogroupPornstarFiltersBinding((RadioGroup) view);
    }

    public static RadiogroupPornstarFiltersBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.radiogroup_pornstar_filters, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4888a;
    }
}
