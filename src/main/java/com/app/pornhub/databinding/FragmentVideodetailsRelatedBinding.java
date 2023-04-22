package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.widget.NestedScrollView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentVideodetailsRelatedBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final NestedScrollView f4694a;

    public FragmentVideodetailsRelatedBinding(NestedScrollView nestedScrollView, ListView listView, IncludeStatusSmallBinding includeStatusSmallBinding) {
        this.f4694a = nestedScrollView;
    }

    public static FragmentVideodetailsRelatedBinding bind(View view) {
        int i10 = R.id.fragment_videodetails_related_lst;
        ListView listView = (ListView) b.t(view, R.id.fragment_videodetails_related_lst);
        if (listView != null) {
            i10 = R.id.include_llyStatusSmall;
            View t2 = b.t(view, R.id.include_llyStatusSmall);
            if (t2 != null) {
                return new FragmentVideodetailsRelatedBinding((NestedScrollView) view, listView, IncludeStatusSmallBinding.bind(t2));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentVideodetailsRelatedBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_videodetails_related, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4694a;
    }
}
