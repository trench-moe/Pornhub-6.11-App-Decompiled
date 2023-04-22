package q2;

import gf.c;
import gf.f;
import gf.u;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final x.c f14231a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<pe.t> f14232b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<String> f14233c;
    public final ie.a<f.a> d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a<c.a> f14234e;

    public h(x.c cVar, ie.a<pe.t> aVar, ie.a<String> aVar2, ie.a<f.a> aVar3, ie.a<c.a> aVar4) {
        this.f14231a = cVar;
        this.f14232b = aVar;
        this.f14233c = aVar2;
        this.d = aVar3;
        this.f14234e = aVar4;
    }

    @Override // ie.a
    public Object get() {
        x.c cVar = this.f14231a;
        pe.t tVar = this.f14232b.get();
        String str = this.f14233c.get();
        f.a aVar = this.d.get();
        c.a aVar2 = this.f14234e.get();
        u.b g10 = a0.a.g(cVar, tVar, "okHttpClient", str, "targetUrl", aVar, "converterFactory", aVar2, "callAdapterFactory", str);
        List<f.a> list = g10.d;
        Objects.requireNonNull(aVar, "factory == null");
        list.add(aVar);
        Object f10 = a1.a.f(aVar2, "factory == null", g10.f10089e, aVar2, g10, tVar, w2.h.class);
        Intrinsics.checkNotNullExpressionValue(f10, "Builder()\n            .b…(GifsService::class.java)");
        w2.h hVar = (w2.h) f10;
        Objects.requireNonNull(hVar, "Cannot return null from a non-@Nullable @Provides method");
        return hVar;
    }
}
