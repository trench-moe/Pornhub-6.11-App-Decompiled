package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class DialogfragmentDataUsageWarningBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4505a;

    public DialogfragmentDataUsageWarningBinding(ConstraintLayout constraintLayout, CheckBox checkBox, TextView textView) {
        this.f4505a = constraintLayout;
    }

    public static DialogfragmentDataUsageWarningBinding bind(View view) {
        int i10 = R.id.cb_do_not_show_again;
        CheckBox checkBox = (CheckBox) b.t(view, R.id.cb_do_not_show_again);
        if (checkBox != null) {
            i10 = R.id.tv_description;
            TextView textView = (TextView) b.t(view, R.id.tv_description);
            if (textView != null) {
                return new DialogfragmentDataUsageWarningBinding((ConstraintLayout) view, checkBox, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogfragmentDataUsageWarningBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.dialogfragment_data_usage_warning, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4505a;
    }
}
