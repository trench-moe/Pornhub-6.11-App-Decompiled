package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes.dex */
public class z implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f7421c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a0 f7422f;

    public z(a0 a0Var, int i10) {
        this.f7422f = a0Var;
        this.f7421c = i10;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        q c10 = q.c(this.f7421c, this.f7422f.d.f7336r0.f7398f);
        a aVar = this.f7422f.d.f7335q0;
        if (c10.compareTo(aVar.f7350c) < 0) {
            c10 = aVar.f7350c;
        } else if (c10.compareTo(aVar.f7351f) > 0) {
            c10 = aVar.f7351f;
        }
        this.f7422f.d.N0(c10);
        this.f7422f.d.O0(MaterialCalendar.CalendarSelector.DAY);
    }
}
