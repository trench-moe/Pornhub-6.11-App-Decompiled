package v8;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.zzat;
import t9.f2;
import t9.v0;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a9.b f16091b = new a9.b("Session");

    /* renamed from: a  reason: collision with root package name */
    public final r f16092a;

    public f(Context context, String str, String str2) {
        r rVar;
        y yVar = new y(this);
        a9.b bVar = v0.f15359a;
        try {
            rVar = v0.a(context).A0(str, str2, yVar);
        } catch (RemoteException | zzat e10) {
            v0.f15359a.b(e10, "Unable to call %s on %s.", "newSessionImpl", f2.class.getSimpleName());
            rVar = null;
        }
        this.f16092a = rVar;
    }

    public abstract void a(boolean z10);

    public long b() {
        h9.o.d("Must be called from the main thread.");
        return 0L;
    }

    public boolean c() {
        h9.o.d("Must be called from the main thread.");
        r rVar = this.f16092a;
        if (rVar != null) {
            try {
                return rVar.j();
            } catch (RemoteException e10) {
                f16091b.b(e10, "Unable to call %s on %s.", "isConnected", r.class.getSimpleName());
            }
        }
        return false;
    }

    public final void d(int i10) {
        r rVar = this.f16092a;
        if (rVar != null) {
            try {
                rVar.j0(i10);
            } catch (RemoteException e10) {
                f16091b.b(e10, "Unable to call %s on %s.", "notifySessionEnded", r.class.getSimpleName());
            }
        }
    }

    public void e(Bundle bundle) {
    }

    public void f(Bundle bundle) {
    }

    public abstract void g(Bundle bundle);

    public abstract void h(Bundle bundle);

    public void i(Bundle bundle) {
    }

    public final n9.a j() {
        r rVar = this.f16092a;
        if (rVar != null) {
            try {
                return rVar.b();
            } catch (RemoteException e10) {
                f16091b.b(e10, "Unable to call %s on %s.", "getWrappedObject", r.class.getSimpleName());
            }
        }
        return null;
    }
}
