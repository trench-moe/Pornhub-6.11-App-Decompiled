package q2;

import gf.c;
import gf.f;
import gf.u;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final x.c f14279a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<pe.t> f14280b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<f.a> f14281c;
    public final ie.a<c.a> d;

    public n(x.c cVar, ie.a<pe.t> aVar, ie.a<f.a> aVar2, ie.a<c.a> aVar3) {
        this.f14279a = cVar;
        this.f14280b = aVar;
        this.f14281c = aVar2;
        this.d = aVar3;
    }

    @Override // ie.a
    public Object get() {
        x.c cVar = this.f14279a;
        pe.t okHttpClient = this.f14280b.get();
        f.a converterFactory = this.f14281c.get();
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
        Object f10 = a1.a.f(callAdapterFactory, "factory == null", bVar.f10089e, callAdapterFactory, bVar, okHttpClient, w2.n.class);
        Intrinsics.checkNotNullExpressionValue(f10, "Builder()\n            .b…nloadService::class.java)");
        w2.n nVar = (w2.n) f10;
        Objects.requireNonNull(nVar, "Cannot return null from a non-@Nullable @Provides method");
        return nVar;
    }
}
