package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentGridWithSpinnerHeaderBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4604a;

    public FragmentGridWithSpinnerHeaderBinding(LinearLayout linearLayout, LinearLayout linearLayout2, Spinner spinner, Spinner spinner2, FragmentGridBinding fragmentGridBinding) {
        this.f4604a = linearLayout;
    }

    public static FragmentGridWithSpinnerHeaderBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i10 = R.id.spinner_1;
        Spinner spinner = (Spinner) b.t(view, R.id.spinner_1);
        if (spinner != null) {
            i10 = R.id.spinner_2;
            Spinner spinner2 = (Spinner) b.t(view, R.id.spinner_2);
            if (spinner2 != null) {
                i10 = R.id.video_container;
                View t2 = b.t(view, R.id.video_container);
                if (t2 != null) {
                    return new FragmentGridWithSpinnerHeaderBinding(linearLayout, linearLayout, spinner, spinner2, FragmentGridBinding.bind(t2));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentGridWithSpinnerHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_grid_with_spinner_header, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4604a;
    }
}
