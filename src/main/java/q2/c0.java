package q2;

import gf.c;
import gf.f;
import gf.u;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c0 implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final a0.b f14193a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<String> f14194b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<pe.t> f14195c;
    public final ie.a<f.a> d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a<c.a> f14196e;

    public c0(a0.b bVar, ie.a<String> aVar, ie.a<pe.t> aVar2, ie.a<f.a> aVar3, ie.a<c.a> aVar4) {
        this.f14193a = bVar;
        this.f14194b = aVar;
        this.f14195c = aVar2;
        this.d = aVar3;
        this.f14196e = aVar4;
    }

    @Override // ie.a
    public Object get() {
        a0.b bVar = this.f14193a;
        String targetUrl = this.f14194b.get();
        pe.t okHttpClient = this.f14195c.get();
        f.a converterFactory = this.d.get();
        c.a callAdapterFactory = this.f14196e.get();
        Objects.requireNonNull(bVar);
        Intrinsics.checkNotNullParameter(targetUrl, "targetUrl");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
        u.b bVar2 = new u.b();
        bVar2.a(targetUrl);
        bVar2.c(okHttpClient);
        List<f.a> list = bVar2.d;
        Objects.requireNonNull(converterFactory, "factory == null");
        list.add(converterFactory);
        List<c.a> list2 = bVar2.f10089e;
        Objects.requireNonNull(callAdapterFactory, "factory == null");
        list2.add(callAdapterFactory);
        Object b10 = bVar2.b().b(p2.d.class);
        Intrinsics.checkNotNullExpressionValue(b10, "Builder()\n            .b…TokenService::class.java)");
        p2.d dVar = (p2.d) b10;
        Objects.requireNonNull(dVar, "Cannot return null from a non-@Nullable @Provides method");
        return dVar;
    }
}
