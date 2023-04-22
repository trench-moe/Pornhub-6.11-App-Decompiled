package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class LayoutCommentsFilterBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4840a;

    public LayoutCommentsFilterBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f4840a = linearLayout;
    }

    public static LayoutCommentsFilterBinding bind(View view) {
        int i10 = R.id.text1;
        TextView textView = (TextView) b.t(view, R.id.text1);
        if (textView != null) {
            i10 = R.id.text2;
            TextView textView2 = (TextView) b.t(view, R.id.text2);
            if (textView2 != null) {
                return new LayoutCommentsFilterBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutCommentsFilterBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.layout_comments_filter, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4840a;
    }
}
