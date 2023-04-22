package q2;

import gf.c;
import gf.f;
import gf.u;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final x.c f14272a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<pe.t> f14273b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<f.a> f14274c;
    public final ie.a<c.a> d;

    public l(x.c cVar, ie.a<pe.t> aVar, ie.a<f.a> aVar2, ie.a<c.a> aVar3) {
        this.f14272a = cVar;
        this.f14273b = aVar;
        this.f14274c = aVar2;
        this.d = aVar3;
    }

    @Override // ie.a
    public Object get() {
        x.c cVar = this.f14272a;
        pe.t okHttpClient = this.f14273b.get();
        f.a converterFactory = this.f14274c.get();
        c.a callAdapterFactory = this.d.get();
        Objects.requireNonNull(cVar);
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
        u.b bVar = new u.b();
        bVar.a("https://api.pronstore.com/sites/1/applications/1/");
        List<f.a> list = bVar.d;
        Objects.requireNonNull(converterFactory, "factory == null");
        list.add(converterFactory);
        Object f10 = a1.a.f(callAdapterFactory, "factory == null", bVar.f10089e, callAdapterFactory, bVar, okHttpClient, w2.l.class);
        Intrinsics.checkNotNullExpressionValue(f10, "Builder()\n            .b…StoreService::class.java)");
        w2.l lVar = (w2.l) f10;
        Objects.requireNonNull(lVar, "Cannot return null from a non-@Nullable @Provides method");
        return lVar;
    }
}
