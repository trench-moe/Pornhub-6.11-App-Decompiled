package e;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes.dex */
public class n extends androidx.fragment.app.l {
    @Override // androidx.fragment.app.l
    public Dialog M0(Bundle bundle) {
        return new m(q(), this.f2183s0);
    }

    @Override // androidx.fragment.app.l
    public void P0(Dialog dialog, int i10) {
        if (!(dialog instanceof m)) {
            super.P0(dialog, i10);
            return;
        }
        m mVar = (m) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            dialog.getWindow().addFlags(24);
        }
        mVar.c(1);
    }
}
