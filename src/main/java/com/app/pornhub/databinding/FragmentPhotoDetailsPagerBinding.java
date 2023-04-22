package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerTitleStrip;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.SimpleViewPager;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentPhotoDetailsPagerBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4639a;

    public FragmentPhotoDetailsPagerBinding(LinearLayout linearLayout, SimpleViewPager simpleViewPager, PagerTitleStrip pagerTitleStrip) {
        this.f4639a = linearLayout;
    }

    public static FragmentPhotoDetailsPagerBinding bind(View view) {
        int i10 = R.id.pager;
        SimpleViewPager simpleViewPager = (SimpleViewPager) b.t(view, R.id.pager);
        if (simpleViewPager != null) {
            i10 = R.id.pager_title_strip;
            PagerTitleStrip pagerTitleStrip = (PagerTitleStrip) b.t(view, R.id.pager_title_strip);
            if (pagerTitleStrip != null) {
                return new FragmentPhotoDetailsPagerBinding((LinearLayout) view, simpleViewPager, pagerTitleStrip);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentPhotoDetailsPagerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_photo_details_pager, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4639a;
    }
}
