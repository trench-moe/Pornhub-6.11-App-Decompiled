package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import com.google.android.material.switchmaterial.SwitchMaterial;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentDataSettingsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4564a;

    public FragmentDataSettingsBinding(ConstraintLayout constraintLayout, TextView textView, View view, TextView textView2, TextView textView3, SwitchMaterial switchMaterial, TextView textView4, Toolbar toolbar, TextView textView5, View view2) {
        this.f4564a = constraintLayout;
    }

    public static FragmentDataSettingsBinding bind(View view) {
        int i10 = R.id.accept_button;
        TextView textView = (TextView) b.t(view, R.id.accept_button);
        if (textView != null) {
            i10 = R.id.accept_button_background;
            View t2 = b.t(view, R.id.accept_button_background);
            if (t2 != null) {
                i10 = R.id.manage_priv_sett_desc;
                TextView textView2 = (TextView) b.t(view, R.id.manage_priv_sett_desc);
                if (textView2 != null) {
                    i10 = R.id.manage_priv_sett_title;
                    TextView textView3 = (TextView) b.t(view, R.id.manage_priv_sett_title);
                    if (textView3 != null) {
                        i10 = R.id.setting_switch;
                        SwitchMaterial switchMaterial = (SwitchMaterial) b.t(view, R.id.setting_switch);
                        if (switchMaterial != null) {
                            i10 = R.id.setting_title;
                            TextView textView4 = (TextView) b.t(view, R.id.setting_title);
                            if (textView4 != null) {
                                i10 = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
                                if (toolbar != null) {
                                    i10 = R.id.toolbar_title;
                                    TextView textView5 = (TextView) b.t(view, R.id.toolbar_title);
                                    if (textView5 != null) {
                                        i10 = R.id.view;
                                        View t8 = b.t(view, R.id.view);
                                        if (t8 != null) {
                                            return new FragmentDataSettingsBinding((ConstraintLayout) view, textView, t2, textView2, textView3, switchMaterial, textView4, toolbar, textView5, t8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentDataSettingsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_data_settings, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4564a;
    }
}
