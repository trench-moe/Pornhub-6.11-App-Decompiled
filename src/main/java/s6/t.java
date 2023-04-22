package s6;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class t implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final ie.a<u6.a> f14897a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<u6.a> f14898b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<e> f14899c;
    public final ie.a<z> d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a<String> f14900e;

    public t(ie.a<u6.a> aVar, ie.a<u6.a> aVar2, ie.a<e> aVar3, ie.a<z> aVar4, ie.a<String> aVar5) {
        this.f14897a = aVar;
        this.f14898b = aVar2;
        this.f14899c = aVar3;
        this.d = aVar4;
        this.f14900e = aVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [n6.a] */
    @Override // ie.a
    public Object get() {
        o6.a aVar;
        u6.a aVar2 = this.f14897a.get();
        u6.a aVar3 = this.f14898b.get();
        e eVar = this.f14899c.get();
        z zVar = this.d.get();
        ie.a<String> aVar4 = this.f14900e;
        Object obj = o6.a.f13601c;
        if (aVar4 instanceof n6.a) {
            aVar = (n6.a) aVar4;
        } else {
            Objects.requireNonNull(aVar4);
            aVar = new o6.a(aVar4);
        }
        return new s(aVar2, aVar3, eVar, zVar, aVar);
    }
}
