package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes.dex */
public class k implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f7385c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f7386f;

    public k(MaterialCalendar materialCalendar, t tVar) {
        this.f7386f = materialCalendar;
        this.f7385c = tVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int X0 = this.f7386f.L0().X0() + 1;
        if (X0 < this.f7386f.f7340v0.getAdapter().a()) {
            this.f7386f.N0(this.f7385c.m(X0));
        }
    }
}
