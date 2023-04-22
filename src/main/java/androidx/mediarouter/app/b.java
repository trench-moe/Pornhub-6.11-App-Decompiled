package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;

/* loaded from: classes.dex */
public class b extends androidx.fragment.app.l {
    public boolean D0 = false;
    public Dialog E0;
    public j1.k F0;

    public b() {
        O0(true);
    }

    @Override // androidx.fragment.app.l
    public Dialog M0(Bundle bundle) {
        if (this.D0) {
            l lVar = new l(q());
            this.E0 = lVar;
            R0();
            lVar.e(this.F0);
        } else {
            a aVar = new a(q());
            this.E0 = aVar;
            R0();
            aVar.e(this.F0);
        }
        return this.E0;
    }

    public final void R0() {
        if (this.F0 == null) {
            Bundle bundle = this.f2019u;
            if (bundle != null) {
                this.F0 = j1.k.b(bundle.getBundle("selector"));
            }
            if (this.F0 == null) {
                this.F0 = j1.k.f11274c;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.U = true;
        Dialog dialog = this.E0;
        if (dialog == null) {
            return;
        }
        if (this.D0) {
            ((l) dialog).f();
            return;
        }
        a aVar = (a) dialog;
        aVar.getWindow().setLayout(k.a(aVar.getContext()), -2);
    }
}
