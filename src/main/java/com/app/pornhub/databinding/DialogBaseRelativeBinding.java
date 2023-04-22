package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class DialogBaseRelativeBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final RelativeLayout f4497a;

    public DialogBaseRelativeBinding(RelativeLayout relativeLayout, Button button, Button button2, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, View view, View view2) {
        this.f4497a = relativeLayout;
    }

    public static DialogBaseRelativeBinding bind(View view) {
        int i10 = R.id.dialog_btnCancel;
        Button button = (Button) b.t(view, R.id.dialog_btnCancel);
        if (button != null) {
            i10 = R.id.dialog_btnOk;
            Button button2 = (Button) b.t(view, R.id.dialog_btnOk);
            if (button2 != null) {
                i10 = R.id.dialog_llyButtons;
                LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.dialog_llyButtons);
                if (linearLayout != null) {
                    i10 = R.id.dialog_llyContent;
                    LinearLayout linearLayout2 = (LinearLayout) b.t(view, R.id.dialog_llyContent);
                    if (linearLayout2 != null) {
                        i10 = R.id.dialog_txtTitle;
                        TextView textView = (TextView) b.t(view, R.id.dialog_txtTitle);
                        if (textView != null) {
                            i10 = R.id.dialog_vSeparatorContent;
                            View t2 = b.t(view, R.id.dialog_vSeparatorContent);
                            if (t2 != null) {
                                i10 = R.id.dialog_vSeparatorTitle;
                                View t8 = b.t(view, R.id.dialog_vSeparatorTitle);
                                if (t8 != null) {
                                    return new DialogBaseRelativeBinding((RelativeLayout) view, button, button2, linearLayout, linearLayout2, textView, t2, t8);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogBaseRelativeBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.dialog_base_relative, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4497a;
    }
}
