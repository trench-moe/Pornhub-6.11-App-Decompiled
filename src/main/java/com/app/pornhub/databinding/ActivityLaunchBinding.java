package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.app.pornhub.R;
import java.util.Objects;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityLaunchBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f4406a;

    public ActivityLaunchBinding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f4406a = frameLayout;
    }

    public static ActivityLaunchBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        FrameLayout frameLayout = (FrameLayout) view;
        return new ActivityLaunchBinding(frameLayout, frameLayout);
    }

    public static ActivityLaunchBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_launch, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4406a;
    }
}
