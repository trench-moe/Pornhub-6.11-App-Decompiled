package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class g implements SwipeDismissBehavior.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f7672a;

    public g(BaseTransientBottomBar baseTransientBottomBar) {
        this.f7672a = baseTransientBottomBar;
    }

    public void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f7672a.b(0);
    }
}
