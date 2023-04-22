package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes.dex */
public class n implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f7392c;

    public n(m mVar) {
        this.f7392c = mVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m mVar = this.f7392c;
        mVar.T0.setEnabled(mVar.R0().Z());
        this.f7392c.R0.toggle();
        m mVar2 = this.f7392c;
        mVar2.X0(mVar2.R0);
        this.f7392c.V0();
    }
}
