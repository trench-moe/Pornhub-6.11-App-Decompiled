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
public final class FragmentFriendlistSeparatorBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4582a;

    public FragmentFriendlistSeparatorBinding(LinearLayout linearLayout, TextView textView) {
        this.f4582a = linearLayout;
    }

    public static FragmentFriendlistSeparatorBinding bind(View view) {
        TextView textView = (TextView) b.t(view, R.id.fragment_friendlist_separator_txtTitle);
        if (textView != null) {
            return new FragmentFriendlistSeparatorBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.fragment_friendlist_separator_txtTitle)));
    }

    public static FragmentFriendlistSeparatorBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_friendlist_separator, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4582a;
    }
}
