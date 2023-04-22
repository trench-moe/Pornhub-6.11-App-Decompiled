package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityBaseContainerBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4358a;

    public ActivityBaseContainerBinding(LinearLayout linearLayout, FrameLayout frameLayout, Toolbar toolbar, TextView textView) {
        this.f4358a = linearLayout;
    }

    public static ActivityBaseContainerBinding bind(View view) {
        int i10 = R.id.container_main;
        FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.container_main);
        if (frameLayout != null) {
            i10 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
            if (toolbar != null) {
                i10 = R.id.toolbar_title;
                TextView textView = (TextView) b.t(view, R.id.toolbar_title);
                if (textView != null) {
                    return new ActivityBaseContainerBinding((LinearLayout) view, frameLayout, toolbar, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityBaseContainerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_base_container, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4358a;
    }
}
