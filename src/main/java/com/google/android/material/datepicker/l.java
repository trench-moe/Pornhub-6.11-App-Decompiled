package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes.dex */
public class l implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f7387c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f7388f;

    public l(MaterialCalendar materialCalendar, t tVar) {
        this.f7388f = materialCalendar;
        this.f7387c = tVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int Y0 = this.f7388f.L0().Y0() - 1;
        if (Y0 >= 0) {
            this.f7388f.N0(this.f7387c.m(Y0));
        }
    }
}
