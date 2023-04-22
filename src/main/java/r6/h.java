package r6;

import android.util.Log;
import java.io.File;
import java.util.Objects;
import k8.m;
import l6.q;
import t6.a;
import vb.r;
import vb.z;
import w6.n0;
import w6.u;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements a.InterfaceC0268a, m.a, ea.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14700c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f14701f;

    public /* synthetic */ h(Object obj, int i10) {
        this.f14700c = i10;
        this.f14701f = obj;
    }

    @Override // t6.a.InterfaceC0268a
    public Object e() {
        switch (this.f14700c) {
            case 0:
                return Integer.valueOf(((s6.d) this.f14701f).o());
            case 1:
                ((i) this.f14701f).f14709i.a();
                return null;
            default:
                k kVar = (k) this.f14701f;
                for (q qVar : kVar.f14719b.G()) {
                    kVar.f14720c.b(qVar, 1);
                }
                return null;
        }
    }

    @Override // ea.a
    public Object f(ea.g gVar) {
        boolean z10;
        Objects.requireNonNull((z) this.f14701f);
        if (gVar.m()) {
            r rVar = (r) gVar.j();
            m9.a aVar = m9.a.A0;
            StringBuilder m10 = a1.a.m("Crashlytics report successfully enqueued to DataTransport: ");
            m10.append(rVar.c());
            aVar.o(m10.toString());
            File b10 = rVar.b();
            if (b10.delete()) {
                StringBuilder m11 = a1.a.m("Deleted report file: ");
                m11.append(b10.getPath());
                aVar.o(m11.toString());
            } else {
                StringBuilder m12 = a1.a.m("Crashlytics could not delete report file: ");
                m12.append(b10.getPath());
                aVar.G(m12.toString());
            }
            z10 = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", gVar.i());
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // k8.m.a
    public void invoke(Object obj) {
        ((n0.c) obj).g(((u) this.f14701f).C);
    }
}
