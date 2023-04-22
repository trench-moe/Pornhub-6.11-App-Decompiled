package v8;

import android.os.RemoteException;
import u8.d1;

/* loaded from: classes2.dex */
public final class e0 extends d1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f16090a;

    public /* synthetic */ e0(d dVar) {
        this.f16090a = dVar;
    }

    @Override // u8.d1
    public final void a() {
        d dVar = this.f16090a;
        if (dVar.f16081e == null) {
            return;
        }
        try {
            w8.g gVar = dVar.f16085i;
            if (gVar != null) {
                gVar.x();
            }
            this.f16090a.f16081e.S0(null);
        } catch (RemoteException e10) {
            d.f16079m.b(e10, "Unable to call %s on %s.", "onConnected", n0.class.getSimpleName());
        }
    }

    @Override // u8.d1
    public final void b(int i10) {
        n0 n0Var = this.f16090a.f16081e;
        if (n0Var == null) {
            return;
        }
        try {
            n0Var.i0(new c9.b(i10));
        } catch (RemoteException e10) {
            d.f16079m.b(e10, "Unable to call %s on %s.", "onConnectionFailed", n0.class.getSimpleName());
        }
    }

    @Override // u8.d1
    public final void c(int i10) {
        n0 n0Var = this.f16090a.f16081e;
        if (n0Var == null) {
            return;
        }
        try {
            n0Var.p(i10);
        } catch (RemoteException e10) {
            d.f16079m.b(e10, "Unable to call %s on %s.", "onConnectionSuspended", n0.class.getSimpleName());
        }
    }

    @Override // u8.d1
    public final void d(int i10) {
        n0 n0Var = this.f16090a.f16081e;
        if (n0Var == null) {
            return;
        }
        try {
            n0Var.i0(new c9.b(i10));
        } catch (RemoteException e10) {
            d.f16079m.b(e10, "Unable to call %s on %s.", "onDisconnected", n0.class.getSimpleName());
        }
    }
}
