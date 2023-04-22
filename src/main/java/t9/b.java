package t9;

import android.os.RemoteException;
import j1.l;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b extends l.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a9.b f15175b = new a9.b("MediaRouterCallback");

    /* renamed from: a  reason: collision with root package name */
    public final r3 f15176a;

    public b(r3 r3Var) {
        Objects.requireNonNull(r3Var, "null reference");
        this.f15176a = r3Var;
    }

    @Override // j1.l.b
    public final void d(j1.l lVar, l.i iVar) {
        try {
            this.f15176a.p0(iVar.f11332c, iVar.f11345r);
        } catch (RemoteException e10) {
            f15175b.b(e10, "Unable to call %s on %s.", "onRouteAdded", r3.class.getSimpleName());
        }
    }

    @Override // j1.l.b
    public final void e(j1.l lVar, l.i iVar) {
        try {
            this.f15176a.h0(iVar.f11332c, iVar.f11345r);
        } catch (RemoteException e10) {
            f15175b.b(e10, "Unable to call %s on %s.", "onRouteChanged", r3.class.getSimpleName());
        }
    }

    @Override // j1.l.b
    public final void f(j1.l lVar, l.i iVar) {
        try {
            this.f15176a.Z(iVar.f11332c, iVar.f11345r);
        } catch (RemoteException e10) {
            f15175b.b(e10, "Unable to call %s on %s.", "onRouteRemoved", r3.class.getSimpleName());
        }
    }

    @Override // j1.l.b
    public final void h(j1.l lVar, l.i iVar, int i10) {
        if (iVar.f11339k != 1) {
            return;
        }
        try {
            this.f15176a.M(iVar.f11332c, iVar.f11345r);
        } catch (RemoteException e10) {
            f15175b.b(e10, "Unable to call %s on %s.", "onRouteSelected", r3.class.getSimpleName());
        }
    }

    @Override // j1.l.b
    public final void j(j1.l lVar, l.i iVar, int i10) {
        if (iVar.f11339k != 1) {
            return;
        }
        try {
            this.f15176a.E0(iVar.f11332c, iVar.f11345r, i10);
        } catch (RemoteException e10) {
            f15175b.b(e10, "Unable to call %s on %s.", "onRouteUnselected", r3.class.getSimpleName());
        }
    }
}
