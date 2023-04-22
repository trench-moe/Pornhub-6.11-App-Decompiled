package e;

import android.view.View;
import n0.d0;
import n0.x;

/* loaded from: classes.dex */
public class i implements n0.n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.d f8932a;

    public i(androidx.appcompat.app.d dVar) {
        this.f8932a = dVar;
    }

    @Override // n0.n
    public d0 a(View view, d0 d0Var) {
        int e10 = d0Var.e();
        int Z = this.f8932a.Z(d0Var, null);
        if (e10 != Z) {
            d0Var = d0Var.h(d0Var.c(), Z, d0Var.d(), d0Var.b());
        }
        return x.p(view, d0Var);
    }
}
