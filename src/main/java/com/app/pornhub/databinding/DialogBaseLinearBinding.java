package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class DialogBaseLinearBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4496a;

    public DialogBaseLinearBinding(LinearLayout linearLayout, Button button, Button button2, LinearLayout linearLayout2, TextView textView) {
        this.f4496a = linearLayout;
    }

    public static DialogBaseLinearBinding bind(View view) {
        int i10 = R.id.dialog_btnCancel;
        Button button = (Button) b.t(view, R.id.dialog_btnCancel);
        if (button != null) {
            i10 = R.id.dialog_btnOk;
            Button button2 = (Button) b.t(view, R.id.dialog_btnOk);
            if (button2 != null) {
                i10 = R.id.dialog_llyContent;
                LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.dialog_llyContent);
                if (linearLayout != null) {
                    i10 = R.id.dialog_txtTitle;
                    TextView textView = (TextView) b.t(view, R.id.dialog_txtTitle);
                    if (textView != null) {
                        return new DialogBaseLinearBinding((LinearLayout) view, button, button2, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogBaseLinearBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.dialog_base_linear, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4496a;
    }
}
