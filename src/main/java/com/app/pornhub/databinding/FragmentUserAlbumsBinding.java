package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerTabStrip;
import androidx.viewpager.widget.ViewPager;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentUserAlbumsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4656a;

    public FragmentUserAlbumsBinding(LinearLayout linearLayout, ViewPager viewPager, PagerTabStrip pagerTabStrip) {
        this.f4656a = linearLayout;
    }

    public static FragmentUserAlbumsBinding bind(View view) {
        int i10 = R.id.pager;
        ViewPager viewPager = (ViewPager) b.t(view, R.id.pager);
        if (viewPager != null) {
            i10 = R.id.pager_title_strip;
            PagerTabStrip pagerTabStrip = (PagerTabStrip) b.t(view, R.id.pager_title_strip);
            if (pagerTabStrip != null) {
                return new FragmentUserAlbumsBinding((LinearLayout) view, viewPager, pagerTabStrip);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentUserAlbumsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_user_albums, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4656a;
    }
}
