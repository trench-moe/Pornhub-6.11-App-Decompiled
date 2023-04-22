package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityAdBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final RelativeLayout f4356a;

    public ActivityAdBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, ProgressBar progressBar, Toolbar toolbar, RelativeLayout relativeLayout2, TextView textView) {
        this.f4356a = relativeLayout;
    }

    public static ActivityAdBinding bind(View view) {
        int i10 = R.id.activity_ad_fragmentContainer;
        FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.activity_ad_fragmentContainer);
        if (frameLayout != null) {
            i10 = R.id.progress;
            ProgressBar progressBar = (ProgressBar) b.t(view, R.id.progress);
            if (progressBar != null) {
                i10 = R.id.toolbar;
                Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
                if (toolbar != null) {
                    i10 = R.id.toolbar_container;
                    RelativeLayout relativeLayout = (RelativeLayout) b.t(view, R.id.toolbar_container);
                    if (relativeLayout != null) {
                        i10 = R.id.toolbar_title;
                        TextView textView = (TextView) b.t(view, R.id.toolbar_title);
                        if (textView != null) {
                            return new ActivityAdBinding((RelativeLayout) view, frameLayout, progressBar, toolbar, relativeLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityAdBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_ad, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4356a;
    }
}
