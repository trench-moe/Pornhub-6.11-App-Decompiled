package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class DialogShareBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4500a;

    public DialogShareBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4) {
        this.f4500a = linearLayout;
    }

    public static DialogShareBinding bind(View view) {
        int i10 = R.id.dialog_share_llyEmail;
        LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.dialog_share_llyEmail);
        if (linearLayout != null) {
            i10 = R.id.dialog_share_llyGoogleplus;
            LinearLayout linearLayout2 = (LinearLayout) b.t(view, R.id.dialog_share_llyGoogleplus);
            if (linearLayout2 != null) {
                i10 = R.id.dialog_share_llyTwitter;
                LinearLayout linearLayout3 = (LinearLayout) b.t(view, R.id.dialog_share_llyTwitter);
                if (linearLayout3 != null) {
                    return new DialogShareBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogShareBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.dialog_share, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4500a;
    }
}
