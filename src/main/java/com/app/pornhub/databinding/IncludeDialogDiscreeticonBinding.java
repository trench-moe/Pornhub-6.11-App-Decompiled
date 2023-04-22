package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class IncludeDialogDiscreeticonBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4696a;

    public IncludeDialogDiscreeticonBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RadioButton radioButton, RadioButton radioButton2) {
        this.f4696a = linearLayout;
    }

    public static IncludeDialogDiscreeticonBinding bind(View view) {
        int i10 = R.id.dialog_discreeticon_llyDiscreet;
        LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.dialog_discreeticon_llyDiscreet);
        if (linearLayout != null) {
            i10 = R.id.dialog_discreeticon_llyNormal;
            LinearLayout linearLayout2 = (LinearLayout) b.t(view, R.id.dialog_discreeticon_llyNormal);
            if (linearLayout2 != null) {
                i10 = R.id.dialog_discreeticon_radioDiscreet;
                RadioButton radioButton = (RadioButton) b.t(view, R.id.dialog_discreeticon_radioDiscreet);
                if (radioButton != null) {
                    i10 = R.id.dialog_discreeticon_radioNormal;
                    RadioButton radioButton2 = (RadioButton) b.t(view, R.id.dialog_discreeticon_radioNormal);
                    if (radioButton2 != null) {
                        return new IncludeDialogDiscreeticonBinding((LinearLayout) view, linearLayout, linearLayout2, radioButton, radioButton2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IncludeDialogDiscreeticonBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.include_dialog_discreeticon, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4696a;
    }
}
