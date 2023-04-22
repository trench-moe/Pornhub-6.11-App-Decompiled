package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityAlbumdetailsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final RelativeLayout f4357a;

    public ActivityAlbumdetailsBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, TextView textView, Toolbar toolbar, TextView textView2) {
        this.f4357a = relativeLayout;
    }

    public static ActivityAlbumdetailsBinding bind(View view) {
        int i10 = R.id.activity_albumdetails_fragmentContainer;
        FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.activity_albumdetails_fragmentContainer);
        if (frameLayout != null) {
            i10 = R.id.fragment_album_txtTitle;
            TextView textView = (TextView) b.t(view, R.id.fragment_album_txtTitle);
            if (textView != null) {
                i10 = R.id.toolbar;
                Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
                if (toolbar != null) {
                    i10 = R.id.toolbar_title;
                    TextView textView2 = (TextView) b.t(view, R.id.toolbar_title);
                    if (textView2 != null) {
                        return new ActivityAlbumdetailsBinding((RelativeLayout) view, frameLayout, textView, toolbar, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityAlbumdetailsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_albumdetails, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4357a;
    }
}
