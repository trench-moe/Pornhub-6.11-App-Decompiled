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
public final class IncludeListFooterBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4701a;

    public IncludeListFooterBinding(LinearLayout linearLayout, Button button, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView) {
        this.f4701a = linearLayout;
    }

    public static IncludeListFooterBinding bind(View view) {
        int i10 = R.id.include_list_footer_btnRetry;
        Button button = (Button) b.t(view, R.id.include_list_footer_btnRetry);
        if (button != null) {
            i10 = R.id.include_list_footer_llyError;
            LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.include_list_footer_llyError);
            if (linearLayout != null) {
                i10 = R.id.include_list_footer_llyLoading;
                LinearLayout linearLayout2 = (LinearLayout) b.t(view, R.id.include_list_footer_llyLoading);
                if (linearLayout2 != null) {
                    i10 = R.id.include_list_footer_txtError;
                    TextView textView = (TextView) b.t(view, R.id.include_list_footer_txtError);
                    if (textView != null) {
                        return new IncludeListFooterBinding((LinearLayout) view, button, linearLayout, linearLayout2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IncludeListFooterBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.include_list_footer, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4701a;
    }
}
