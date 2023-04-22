package h9;

import com.google.android.gms.common.api.Status;
import d9.d;
import h9.n;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class f0 implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d9.d f10313a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ea.h f10314b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n.a f10315c;

    public f0(d9.d dVar, ea.h hVar, n.a aVar, r3.c cVar) {
        this.f10313a = dVar;
        this.f10314b = hVar;
        this.f10315c = aVar;
    }

    @Override // d9.d.a
    public final void a(Status status) {
        if (!status.p0()) {
            ea.h hVar = this.f10314b;
            hVar.f9273a.o(a0.b.v(status));
            return;
        }
        d9.f await = this.f10313a.await(0L, TimeUnit.MILLISECONDS);
        ea.h hVar2 = this.f10314b;
        k2.c cVar = ((g0) this.f10315c).f10319a;
        cVar.f11775f = await;
        hVar2.f9273a.p(cVar);
    }
}
