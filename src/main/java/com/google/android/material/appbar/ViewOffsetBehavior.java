package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a  reason: collision with root package name */
    public f f7145a;

    /* renamed from: b  reason: collision with root package name */
    public int f7146b;

    public ViewOffsetBehavior() {
        this.f7146b = 0;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7146b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean h(CoordinatorLayout coordinatorLayout, V v2, int i10) {
        t(coordinatorLayout, v2, i10);
        if (this.f7145a == null) {
            this.f7145a = new f(v2);
        }
        f fVar = this.f7145a;
        fVar.f7160b = fVar.f7159a.getTop();
        fVar.f7161c = fVar.f7159a.getLeft();
        this.f7145a.a();
        int i11 = this.f7146b;
        if (i11 != 0) {
            this.f7145a.b(i11);
            this.f7146b = 0;
        }
        return true;
    }

    public int s() {
        f fVar = this.f7145a;
        if (fVar != null) {
            return fVar.d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, V v2, int i10) {
        coordinatorLayout.w(v2, i10);
    }

    public boolean u(int i10) {
        f fVar = this.f7145a;
        if (fVar != null) {
            return fVar.b(i10);
        }
        this.f7146b = i10;
        return false;
    }
}
