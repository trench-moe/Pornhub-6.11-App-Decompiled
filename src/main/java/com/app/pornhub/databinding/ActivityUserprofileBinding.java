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
public final class ActivityUserprofileBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final RelativeLayout f4480a;

    public ActivityUserprofileBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, Toolbar toolbar, TextView textView) {
        this.f4480a = relativeLayout;
    }

    public static ActivityUserprofileBinding bind(View view) {
        int i10 = R.id.activity_userprofile_fragmentContainer;
        FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.activity_userprofile_fragmentContainer);
        if (frameLayout != null) {
            i10 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
            if (toolbar != null) {
                i10 = R.id.toolbar_title;
                TextView textView = (TextView) b.t(view, R.id.toolbar_title);
                if (textView != null) {
                    return new ActivityUserprofileBinding((RelativeLayout) view, frameLayout, toolbar, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityUserprofileBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_userprofile, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4480a;
    }
}
