package q6;

import java.util.concurrent.Executor;
import r6.m;

/* loaded from: classes2.dex */
public final class d implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final ie.a<Executor> f14415a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<m6.d> f14416b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<m> f14417c;
    public final ie.a<s6.d> d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a<t6.a> f14418e;

    public d(ie.a<Executor> aVar, ie.a<m6.d> aVar2, ie.a<m> aVar3, ie.a<s6.d> aVar4, ie.a<t6.a> aVar5) {
        this.f14415a = aVar;
        this.f14416b = aVar2;
        this.f14417c = aVar3;
        this.d = aVar4;
        this.f14418e = aVar5;
    }

    @Override // ie.a
    public Object get() {
        return new c(this.f14415a.get(), this.f14416b.get(), this.f14417c.get(), this.d.get(), this.f14418e.get());
    }
}
