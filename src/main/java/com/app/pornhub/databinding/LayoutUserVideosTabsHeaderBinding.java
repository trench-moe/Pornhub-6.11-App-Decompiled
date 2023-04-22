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
public final class LayoutUserVideosTabsHeaderBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4884a;

    public LayoutUserVideosTabsHeaderBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, LinearLayout linearLayout3, LinearLayout linearLayout4) {
        this.f4884a = linearLayout;
    }

    public static LayoutUserVideosTabsHeaderBinding bind(View view) {
        int i10 = R.id.fragment_user_videos_llyTabs;
        LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.fragment_user_videos_llyTabs);
        if (linearLayout != null) {
            i10 = R.id.fragment_user_videos_tab_txtFavorites;
            TextView textView = (TextView) b.t(view, R.id.fragment_user_videos_tab_txtFavorites);
            if (textView != null) {
                i10 = R.id.fragment_user_videos_tab_txtHistory;
                TextView textView2 = (TextView) b.t(view, R.id.fragment_user_videos_tab_txtHistory);
                if (textView2 != null) {
                    i10 = R.id.fragment_user_videos_tabs_container;
                    LinearLayout linearLayout2 = (LinearLayout) b.t(view, R.id.fragment_user_videos_tabs_container);
                    if (linearLayout2 != null) {
                        LinearLayout linearLayout3 = (LinearLayout) view;
                        return new LayoutUserVideosTabsHeaderBinding(linearLayout3, linearLayout, textView, textView2, linearLayout2, linearLayout3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutUserVideosTabsHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.layout_user_videos_tabs_header, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4884a;
    }
}
