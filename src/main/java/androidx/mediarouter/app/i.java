package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;

/* loaded from: classes.dex */
public class i extends androidx.fragment.app.l {
    public boolean D0 = false;
    public Dialog E0;
    public j1.k F0;

    public i() {
        O0(true);
    }

    @Override // androidx.fragment.app.l
    public Dialog M0(Bundle bundle) {
        if (this.D0) {
            n nVar = new n(q());
            this.E0 = nVar;
            nVar.j(this.F0);
        } else {
            this.E0 = new f(q());
        }
        return this.E0;
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void j0() {
        super.j0();
        Dialog dialog = this.E0;
        if (dialog == null || this.D0) {
            return;
        }
        ((f) dialog).i(false);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.U = true;
        Dialog dialog = this.E0;
        if (dialog != null) {
            if (this.D0) {
                ((n) dialog).l();
                return;
            }
            ((f) dialog).x();
        }
    }
}
