package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import e.n;

/* loaded from: classes.dex */
public class b extends n {
    @Override // androidx.fragment.app.l
    public void K0() {
        Dialog dialog = this.f2188y0;
        if (dialog instanceof a) {
            a aVar = (a) dialog;
            if (aVar.f7243j == null) {
                aVar.d();
            }
            boolean z10 = aVar.f7243j.D;
        }
        L0(false, false);
    }

    @Override // e.n, androidx.fragment.app.l
    public Dialog M0(Bundle bundle) {
        return new a(q(), this.f2183s0);
    }
}
