package v8;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: c  reason: collision with root package name */
    public static final a9.b f16095c = new a9.b("SessionManager");

    /* renamed from: a  reason: collision with root package name */
    public final t f16096a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f16097b;

    public g(t tVar, Context context) {
        this.f16096a = tVar;
        this.f16097b = context;
    }

    public <T extends f> void a(h<T> hVar, Class<T> cls) {
        Objects.requireNonNull(hVar, "SessionManagerListener can't be null");
        h9.o.d("Must be called from the main thread.");
        try {
            this.f16096a.Q0(new z(hVar, cls));
        } catch (RemoteException e10) {
            f16095c.b(e10, "Unable to call %s on %s.", "addSessionManagerListener", t.class.getSimpleName());
        }
    }

    public void b(boolean z10) {
        h9.o.d("Must be called from the main thread.");
        try {
            a9.b bVar = f16095c;
            Log.i(bVar.f254a, bVar.e("End session for %s", this.f16097b.getPackageName()));
            this.f16096a.C(true, z10);
        } catch (RemoteException e10) {
            f16095c.b(e10, "Unable to call %s on %s.", "endCurrentSession", t.class.getSimpleName());
        }
    }

    public d c() {
        h9.o.d("Must be called from the main thread.");
        f d = d();
        if (d == null || !(d instanceof d)) {
            return null;
        }
        return (d) d;
    }

    public f d() {
        h9.o.d("Must be called from the main thread.");
        try {
            return (f) n9.b.c1(this.f16096a.e());
        } catch (RemoteException e10) {
            f16095c.b(e10, "Unable to call %s on %s.", "getWrappedCurrentSession", t.class.getSimpleName());
            return null;
        }
    }

    public <T extends f> void e(h<T> hVar, Class cls) {
        h9.o.d("Must be called from the main thread.");
        if (hVar == null) {
            return;
        }
        try {
            this.f16096a.Q(new z(hVar, cls));
        } catch (RemoteException e10) {
            f16095c.b(e10, "Unable to call %s on %s.", "removeSessionManagerListener", t.class.getSimpleName());
        }
    }
}
