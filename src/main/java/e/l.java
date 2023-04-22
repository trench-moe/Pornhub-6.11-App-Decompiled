package e;

import android.view.View;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

/* loaded from: classes.dex */
public class l extends cb.e {
    public final /* synthetic */ androidx.appcompat.app.d P;

    public l(androidx.appcompat.app.d dVar) {
        this.P = dVar;
    }

    @Override // n0.b0
    public void d(View view) {
        this.P.E.setAlpha(1.0f);
        this.P.H.d(null);
        this.P.H = null;
    }

    @Override // cb.e, n0.b0
    public void l(View view) {
        this.P.E.setVisibility(0);
        if (this.P.E.getParent() instanceof View) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.h.c((View) this.P.E.getParent());
        }
    }
}
