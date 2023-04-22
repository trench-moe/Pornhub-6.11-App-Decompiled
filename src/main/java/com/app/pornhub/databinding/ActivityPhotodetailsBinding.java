package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.app.pornhub.R;
import java.util.Objects;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityPhotodetailsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f4451a;

    public ActivityPhotodetailsBinding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f4451a = frameLayout;
    }

    public static ActivityPhotodetailsBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        FrameLayout frameLayout = (FrameLayout) view;
        return new ActivityPhotodetailsBinding(frameLayout, frameLayout);
    }

    public static ActivityPhotodetailsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_photodetails, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4451a;
    }
}
