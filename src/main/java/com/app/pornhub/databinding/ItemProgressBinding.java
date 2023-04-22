package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ItemProgressBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f4786a;

    public ItemProgressBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ProgressBar progressBar) {
        this.f4786a = frameLayout;
    }

    public static ItemProgressBinding bind(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        ProgressBar progressBar = (ProgressBar) b.t(view, R.id.progressBar);
        if (progressBar != null) {
            return new ItemProgressBinding(frameLayout, frameLayout, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.progressBar)));
    }

    public static ItemProgressBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_progress, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4786a;
    }
}
