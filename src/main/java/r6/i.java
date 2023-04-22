package r6;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import l6.m;
import l6.o;
import l6.q;
import t6.a;
import x2.e1;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14702a;

    /* renamed from: b  reason: collision with root package name */
    public final m6.d f14703b;

    /* renamed from: c  reason: collision with root package name */
    public final s6.d f14704c;
    public final m d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f14705e;

    /* renamed from: f  reason: collision with root package name */
    public final t6.a f14706f;

    /* renamed from: g  reason: collision with root package name */
    public final u6.a f14707g;

    /* renamed from: h  reason: collision with root package name */
    public final u6.a f14708h;

    /* renamed from: i  reason: collision with root package name */
    public final s6.c f14709i;

    public i(Context context, m6.d dVar, s6.d dVar2, m mVar, Executor executor, t6.a aVar, u6.a aVar2, u6.a aVar3, s6.c cVar) {
        this.f14702a = context;
        this.f14703b = dVar;
        this.f14704c = dVar2;
        this.d = mVar;
        this.f14705e = executor;
        this.f14706f = aVar;
        this.f14707g = aVar2;
        this.f14708h = aVar3;
        this.f14709i = cVar;
    }

    public void a(final q qVar, int i10) {
        BackendResponse a10;
        m6.k kVar = this.f14703b.get(qVar.b());
        final long j10 = 0;
        while (((Boolean) this.f14706f.c(new s3.b(this, qVar))).booleanValue()) {
            final Iterable<s6.j> iterable = (Iterable) this.f14706f.c(new s3.a(this, qVar, 1));
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (kVar == null) {
                cb.e.y("Uploader", "Unknown backend for %s, deleting event batch for it...", qVar);
                a10 = BackendResponse.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (s6.j jVar : iterable) {
                    arrayList.add(jVar.a());
                }
                if (qVar.c() != null) {
                    t6.a aVar = this.f14706f;
                    s6.c cVar = this.f14709i;
                    Objects.requireNonNull(cVar);
                    p6.a aVar2 = (p6.a) aVar.c(new g4.f(cVar, 4));
                    m.a a11 = l6.m.a();
                    a11.e(this.f14707g.a());
                    a11.g(this.f14708h.a());
                    a11.f("GDT_CLIENT_METRICS");
                    i6.b bVar = new i6.b("proto");
                    Objects.requireNonNull(aVar2);
                    jc.e eVar = o.f12306a;
                    Objects.requireNonNull(eVar);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        eVar.a(aVar2, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    a11.d(new l6.l(bVar, byteArrayOutputStream.toByteArray()));
                    arrayList.add(kVar.b(a11.b()));
                }
                a10 = kVar.a(new m6.a(arrayList, qVar.c(), null));
            }
            if (a10.c() == BackendResponse.Status.TRANSIENT_ERROR) {
                this.f14706f.c(new a.InterfaceC0268a() { // from class: r6.e
                    @Override // t6.a.InterfaceC0268a
                    public final Object e() {
                        i iVar = i.this;
                        Iterable<s6.j> iterable2 = iterable;
                        q qVar2 = qVar;
                        long j11 = j10;
                        iVar.f14704c.h0(iterable2);
                        iVar.f14704c.y(qVar2, iVar.f14707g.a() + j11);
                        return null;
                    }
                });
                this.d.a(qVar, i10 + 1, true);
                return;
            }
            this.f14706f.c(new r3.b(this, iterable, 1));
            if (a10.c() == BackendResponse.Status.OK) {
                j10 = Math.max(j10, a10.b());
                if (qVar.c() != null) {
                    this.f14706f.c(new h(this, 1));
                }
            } else if (a10.c() == BackendResponse.Status.INVALID_PAYLOAD) {
                HashMap hashMap = new HashMap();
                for (s6.j jVar2 : iterable) {
                    String h10 = jVar2.a().h();
                    if (hashMap.containsKey(h10)) {
                        hashMap.put(h10, Integer.valueOf(((Integer) hashMap.get(h10)).intValue() + 1));
                    } else {
                        hashMap.put(h10, 1);
                    }
                }
                this.f14706f.c(new e1(this, hashMap, 3));
            }
        }
        this.f14706f.c(new a.InterfaceC0268a() { // from class: r6.f
            @Override // t6.a.InterfaceC0268a
            public final Object e() {
                i iVar = i.this;
                iVar.f14704c.y(qVar, iVar.f14707g.a() + j10);
                return null;
            }
        });
    }
}
