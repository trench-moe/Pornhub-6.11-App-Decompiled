package e9;

import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class n0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9229c = 0;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f9230f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f9231j;

    public n0(p0 p0Var, ca.k kVar) {
        this.f9231j = p0Var;
        this.f9230f = kVar;
    }

    public /* synthetic */ n0(t9.f fVar, j1.k kVar) {
        this.f9230f = fVar;
        this.f9231j = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9229c) {
            case 0:
                p0 p0Var = (p0) this.f9231j;
                ca.k kVar = (ca.k) this.f9230f;
                c9.b bVar = kVar.f3916f;
                if (bVar.q0()) {
                    h9.j0 j0Var = kVar.f3917j;
                    Objects.requireNonNull(j0Var, "null reference");
                    c9.b bVar2 = j0Var.f10337j;
                    if (!bVar2.q0()) {
                        String valueOf = String.valueOf(bVar2);
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                        ((c0) p0Var.f9242g).b(bVar2);
                        ((h9.b) p0Var.f9241f).disconnect();
                        return;
                    }
                    o0 o0Var = p0Var.f9242g;
                    h9.h p02 = j0Var.p0();
                    Set<Scope> set = p0Var.d;
                    c0 c0Var = (c0) o0Var;
                    Objects.requireNonNull(c0Var);
                    if (p02 != null && set != null) {
                        c0Var.f9163c = p02;
                        c0Var.d = set;
                        if (c0Var.f9164e) {
                            c0Var.f9161a.getRemoteService(p02, set);
                        }
                    }
                    Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                    c0Var.b(new c9.b(4));
                } else {
                    ((c0) p0Var.f9242g).b(bVar);
                }
                ((h9.b) p0Var.f9241f).disconnect();
                return;
            default:
                ((t9.f) this.f9230f).d1((j1.k) this.f9231j);
                return;
        }
    }
}
