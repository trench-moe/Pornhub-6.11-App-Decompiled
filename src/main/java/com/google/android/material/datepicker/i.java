package com.google.android.material.datepicker;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public class i extends RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f7381a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f7382b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f7383c;

    public i(MaterialCalendar materialCalendar, t tVar, MaterialButton materialButton) {
        this.f7383c = materialCalendar;
        this.f7381a = tVar;
        this.f7382b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f7382b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e(RecyclerView recyclerView, int i10, int i11) {
        int X0 = i10 < 0 ? this.f7383c.L0().X0() : this.f7383c.L0().Y0();
        this.f7383c.f7336r0 = this.f7381a.m(X0);
        MaterialButton materialButton = this.f7382b;
        t tVar = this.f7381a;
        materialButton.setText(tVar.f7410e.f7350c.g(X0).f(tVar.d));
    }
}
