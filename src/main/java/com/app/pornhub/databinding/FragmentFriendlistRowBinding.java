package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentFriendlistRowBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4581a;

    public FragmentFriendlistRowBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, TextView textView) {
        this.f4581a = linearLayout;
    }

    public static FragmentFriendlistRowBinding bind(View view) {
        int i10 = R.id.fragment_friendlist_row_imgUser;
        ImageView imageView = (ImageView) b.t(view, R.id.fragment_friendlist_row_imgUser);
        if (imageView != null) {
            i10 = R.id.fragment_friendlist_row_imgUserAdd;
            ImageView imageView2 = (ImageView) b.t(view, R.id.fragment_friendlist_row_imgUserAdd);
            if (imageView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i10 = R.id.fragment_friendlist_row_txtUser;
                TextView textView = (TextView) b.t(view, R.id.fragment_friendlist_row_txtUser);
                if (textView != null) {
                    return new FragmentFriendlistRowBinding(linearLayout, imageView, imageView2, linearLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentFriendlistRowBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_friendlist_row, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4581a;
    }
}
