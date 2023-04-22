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
public final class FragmentCategoriesListSeparatorBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4562a;

    public FragmentCategoriesListSeparatorBinding(LinearLayout linearLayout, TextView textView) {
        this.f4562a = linearLayout;
    }

    public static FragmentCategoriesListSeparatorBinding bind(View view) {
        TextView textView = (TextView) b.t(view, R.id.fragment_category_list_separator_title);
        if (textView != null) {
            return new FragmentCategoriesListSeparatorBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.fragment_category_list_separator_title)));
    }

    public static FragmentCategoriesListSeparatorBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_categories_list_separator, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4562a;
    }
}
