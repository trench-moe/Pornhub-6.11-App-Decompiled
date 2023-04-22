package e9;

import android.util.Log;
import d9.a;

/* loaded from: classes.dex */
public final class b0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c9.b f9157c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c0 f9158f;

    public b0(c0 c0Var, c9.b bVar) {
        this.f9158f = c0Var;
        this.f9157c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h9.h hVar;
        c0 c0Var = this.f9158f;
        z<?> zVar = c0Var.f9165f.f9176z.get(c0Var.f9162b);
        if (zVar == null) {
            return;
        }
        if (!this.f9157c.q0()) {
            zVar.q(this.f9157c, null);
            return;
        }
        c0 c0Var2 = this.f9158f;
        c0Var2.f9164e = true;
        if (c0Var2.f9161a.requiresSignIn()) {
            c0 c0Var3 = this.f9158f;
            if (!c0Var3.f9164e || (hVar = c0Var3.f9163c) == null) {
                return;
            }
            c0Var3.f9161a.getRemoteService(hVar, c0Var3.d);
            return;
        }
        try {
            a.f fVar = this.f9158f.f9161a;
            fVar.getRemoteService(null, fVar.a());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            this.f9158f.f9161a.disconnect("Failed to get service from broker.");
            zVar.q(new c9.b(10), null);
        }
    }
}
