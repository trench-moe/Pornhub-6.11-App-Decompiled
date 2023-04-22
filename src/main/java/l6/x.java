package l6;

/* loaded from: classes2.dex */
public final class x implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final ie.a<u6.a> f12328a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<u6.a> f12329b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<q6.e> f12330c;
    public final ie.a<r6.i> d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a<r6.k> f12331e;

    public x(ie.a<u6.a> aVar, ie.a<u6.a> aVar2, ie.a<q6.e> aVar3, ie.a<r6.i> aVar4, ie.a<r6.k> aVar5) {
        this.f12328a = aVar;
        this.f12329b = aVar2;
        this.f12330c = aVar3;
        this.d = aVar4;
        this.f12331e = aVar5;
    }

    @Override // ie.a
    public Object get() {
        return new v(this.f12328a.get(), this.f12329b.get(), this.f12330c.get(), this.d.get(), this.f12331e.get());
    }
}
