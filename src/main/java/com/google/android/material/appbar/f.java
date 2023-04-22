package com.google.android.material.appbar;

import android.view.View;
import n0.x;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final View f7159a;

    /* renamed from: b  reason: collision with root package name */
    public int f7160b;

    /* renamed from: c  reason: collision with root package name */
    public int f7161c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f7162e;

    public f(View view) {
        this.f7159a = view;
    }

    public void a() {
        View view = this.f7159a;
        x.o(view, this.d - (view.getTop() - this.f7160b));
        View view2 = this.f7159a;
        x.n(view2, this.f7162e - (view2.getLeft() - this.f7161c));
    }

    public boolean b(int i10) {
        if (this.d != i10) {
            this.d = i10;
            a();
            return true;
        }
        return false;
    }
}
