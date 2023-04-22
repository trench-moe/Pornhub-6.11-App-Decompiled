package r6;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class l implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final ie.a<Executor> f14721a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<s6.d> f14722b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<m> f14723c;
    public final ie.a<t6.a> d;

    public l(ie.a<Executor> aVar, ie.a<s6.d> aVar2, ie.a<m> aVar3, ie.a<t6.a> aVar4) {
        this.f14721a = aVar;
        this.f14722b = aVar2;
        this.f14723c = aVar3;
        this.d = aVar4;
    }

    @Override // ie.a
    public Object get() {
        return new k(this.f14721a.get(), this.f14722b.get(), this.f14723c.get(), this.d.get());
    }
}
