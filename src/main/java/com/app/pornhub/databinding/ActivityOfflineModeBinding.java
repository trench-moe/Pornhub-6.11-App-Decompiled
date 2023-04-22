package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityOfflineModeBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4432a;

    /* renamed from: b  reason: collision with root package name */
    public final Toolbar f4433b;

    public ActivityOfflineModeBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, Toolbar toolbar, TextView textView) {
        this.f4432a = constraintLayout;
        this.f4433b = toolbar;
    }

    public static ActivityOfflineModeBinding bind(View view) {
        int i10 = R.id.expandablePanelContentContainer;
        FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.expandablePanelContentContainer);
        if (frameLayout != null) {
            i10 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
            if (toolbar != null) {
                i10 = R.id.toolbar_title;
                TextView textView = (TextView) b.t(view, R.id.toolbar_title);
                if (textView != null) {
                    return new ActivityOfflineModeBinding((ConstraintLayout) view, frameLayout, toolbar, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityOfflineModeBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_offline_mode, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4432a;
    }
}
