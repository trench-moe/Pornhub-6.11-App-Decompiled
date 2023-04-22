package v8;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.zzat;
import com.google.android.gms.common.api.ApiException;
import e9.m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.dataflow.qual.Pure;
import t9.f2;
import t9.v0;
import u8.e;
import u8.e1;

/* loaded from: classes2.dex */
public class d extends f {

    /* renamed from: m  reason: collision with root package name */
    public static final a9.b f16079m = new a9.b("CastSession");

    /* renamed from: c  reason: collision with root package name */
    public final Context f16080c;
    public final Set<e.c> d;

    /* renamed from: e  reason: collision with root package name */
    public final n0 f16081e;

    /* renamed from: f  reason: collision with root package name */
    public final c f16082f;

    /* renamed from: g  reason: collision with root package name */
    public final x8.k f16083g;

    /* renamed from: h  reason: collision with root package name */
    public e1 f16084h;

    /* renamed from: i  reason: collision with root package name */
    public w8.g f16085i;

    /* renamed from: j  reason: collision with root package name */
    public CastDevice f16086j;

    /* renamed from: k  reason: collision with root package name */
    public e.a f16087k;

    /* renamed from: l  reason: collision with root package name */
    public t9.g f16088l;

    public d(Context context, String str, String str2, c cVar, x8.k kVar) {
        super(context, str, str2);
        n0 O;
        this.d = new HashSet();
        this.f16080c = context.getApplicationContext();
        this.f16082f = cVar;
        this.f16083g = kVar;
        n9.a j10 = j();
        c0 c0Var = new c0(this);
        a9.b bVar = v0.f15359a;
        if (j10 != null) {
            try {
                O = v0.a(context).O(cVar, j10, c0Var);
            } catch (RemoteException | zzat e10) {
                v0.f15359a.b(e10, "Unable to call %s on %s.", "newCastSessionImpl", f2.class.getSimpleName());
            }
            this.f16081e = O;
        }
        O = null;
        this.f16081e = O;
    }

    public static void o(d dVar, int i10) {
        x8.k kVar = dVar.f16083g;
        if (kVar.B) {
            kVar.B = false;
            w8.g gVar = kVar.y;
            if (gVar != null) {
                h9.o.d("Must be called from the main thread.");
                gVar.f17013g.remove(kVar);
            }
            kVar.f18077j.b1(null);
            kVar.n.a();
            x8.b bVar = kVar.f18079t;
            if (bVar != null) {
                bVar.a();
            }
            MediaSessionCompat mediaSessionCompat = kVar.A;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.f399a.c(null);
                kVar.A.e(null, null);
                MediaSessionCompat mediaSessionCompat2 = kVar.A;
                mediaSessionCompat2.f399a.h(new MediaMetadataCompat(new Bundle()));
                kVar.n(0, null);
                kVar.A.d(false);
                kVar.A.f399a.a();
                kVar.A = null;
            }
            kVar.y = null;
            kVar.f18082z = null;
            kVar.k();
            if (i10 == 0) {
                kVar.l();
            }
        }
        e1 e1Var = dVar.f16084h;
        if (e1Var != null) {
            ((u8.l0) e1Var).k();
            dVar.f16084h = null;
        }
        dVar.f16086j = null;
        w8.g gVar2 = dVar.f16085i;
        if (gVar2 != null) {
            gVar2.y(null);
            dVar.f16085i = null;
        }
    }

    public static void p(d dVar, String str, ea.g gVar) {
        if (dVar.f16081e == null) {
            return;
        }
        try {
            if (gVar.m()) {
                e.a aVar = (e.a) gVar.j();
                dVar.f16087k = aVar;
                if (aVar.V() != null && aVar.V().p0()) {
                    f16079m.a("%s() -> success result", str);
                    w8.g gVar2 = new w8.g(new a9.m(null));
                    dVar.f16085i = gVar2;
                    gVar2.y(dVar.f16084h);
                    dVar.f16085i.x();
                    dVar.f16083g.a(dVar.f16085i, dVar.k());
                    n0 n0Var = dVar.f16081e;
                    u8.d S = aVar.S();
                    Objects.requireNonNull(S, "null reference");
                    String h10 = aVar.h();
                    String g02 = aVar.g0();
                    Objects.requireNonNull(g02, "null reference");
                    n0Var.T(S, h10, g02, aVar.e());
                    return;
                } else if (aVar.V() != null) {
                    f16079m.a("%s() -> failure result", str);
                    dVar.f16081e.zzg(aVar.V().f6859f);
                    return;
                }
            } else {
                Exception i10 = gVar.i();
                if (i10 instanceof ApiException) {
                    dVar.f16081e.zzg(((ApiException) i10).mStatus.f6859f);
                    return;
                }
            }
            dVar.f16081e.zzg(2476);
        } catch (RemoteException e10) {
            f16079m.b(e10, "Unable to call %s on %s.", "methods", n0.class.getSimpleName());
        }
    }

    @Override // v8.f
    public void a(boolean z10) {
        int i10;
        d c10;
        n0 n0Var = this.f16081e;
        if (n0Var != null) {
            try {
                n0Var.V0(z10, 0);
            } catch (RemoteException e10) {
                f16079m.b(e10, "Unable to call %s on %s.", "disconnectFromDevice", n0.class.getSimpleName());
            }
            d(0);
            t9.g gVar = this.f16088l;
            if (gVar != null && (i10 = gVar.f15214b) != 0 && gVar.f15216e != null) {
                t9.g.f15212f.a("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i10), gVar.f15216e);
                Iterator it = new HashSet(gVar.f15213a).iterator();
                while (it.hasNext()) {
                    Objects.requireNonNull((j) it.next());
                }
                gVar.f15214b = 0;
                gVar.f15216e = null;
                g gVar2 = gVar.f15215c;
                if (gVar2 == null || (c10 = gVar2.c()) == null) {
                    return;
                }
                c10.f16088l = null;
            }
        }
    }

    @Override // v8.f
    public long b() {
        h9.o.d("Must be called from the main thread.");
        w8.g gVar = this.f16085i;
        if (gVar == null) {
            return 0L;
        }
        return gVar.i() - this.f16085i.c();
    }

    @Override // v8.f
    public void e(Bundle bundle) {
        this.f16086j = CastDevice.p0(bundle);
    }

    @Override // v8.f
    public void f(Bundle bundle) {
        this.f16086j = CastDevice.p0(bundle);
    }

    @Override // v8.f
    public void g(Bundle bundle) {
        q(bundle);
    }

    @Override // v8.f
    public void h(Bundle bundle) {
        q(bundle);
    }

    @Override // v8.f
    public final void i(Bundle bundle) {
        this.f16086j = CastDevice.p0(bundle);
    }

    @Pure
    public CastDevice k() {
        h9.o.d("Must be called from the main thread.");
        return this.f16086j;
    }

    public w8.g l() {
        h9.o.d("Must be called from the main thread.");
        return this.f16085i;
    }

    public boolean m() {
        h9.o.d("Must be called from the main thread.");
        e1 e1Var = this.f16084h;
        if (e1Var != null) {
            u8.l0 l0Var = (u8.l0) e1Var;
            l0Var.g();
            if (l0Var.f15723w) {
                return true;
            }
        }
        return false;
    }

    public void n(final boolean z10) {
        h9.o.d("Must be called from the main thread.");
        e1 e1Var = this.f16084h;
        if (e1Var != null) {
            m.a aVar = new m.a();
            final u8.l0 l0Var = (u8.l0) e1Var;
            aVar.f9224a = new e9.l() { // from class: u8.a0
                @Override // e9.l
                public final void accept(Object obj, Object obj2) {
                    l0 l0Var2 = l0.this;
                    boolean z11 = z10;
                    Objects.requireNonNull(l0Var2);
                    a9.f fVar = (a9.f) ((a9.c0) obj).getService();
                    double d = l0Var2.f15722v;
                    boolean z12 = l0Var2.f15723w;
                    Parcel a12 = fVar.a1();
                    int i10 = t9.v.f15358a;
                    a12.writeInt(z11 ? 1 : 0);
                    a12.writeDouble(d);
                    a12.writeInt(z12 ? 1 : 0);
                    fVar.d1(8, a12);
                    ((ea.h) obj2).f9273a.p(null);
                }
            };
            aVar.d = 8412;
            l0Var.b(1, aVar.a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.d.q(android.os.Bundle):void");
    }
}
