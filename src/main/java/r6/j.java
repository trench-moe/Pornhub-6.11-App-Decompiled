package r6;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class j implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final ie.a<Context> f14710a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<m6.d> f14711b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<s6.d> f14712c;
    public final ie.a<m> d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a<Executor> f14713e;

    /* renamed from: f  reason: collision with root package name */
    public final ie.a<t6.a> f14714f;

    /* renamed from: g  reason: collision with root package name */
    public final ie.a<u6.a> f14715g;

    /* renamed from: h  reason: collision with root package name */
    public final ie.a<u6.a> f14716h;

    /* renamed from: i  reason: collision with root package name */
    public final ie.a<s6.c> f14717i;

    public j(ie.a<Context> aVar, ie.a<m6.d> aVar2, ie.a<s6.d> aVar3, ie.a<m> aVar4, ie.a<Executor> aVar5, ie.a<t6.a> aVar6, ie.a<u6.a> aVar7, ie.a<u6.a> aVar8, ie.a<s6.c> aVar9) {
        this.f14710a = aVar;
        this.f14711b = aVar2;
        this.f14712c = aVar3;
        this.d = aVar4;
        this.f14713e = aVar5;
        this.f14714f = aVar6;
        this.f14715g = aVar7;
        this.f14716h = aVar8;
        this.f14717i = aVar9;
    }

    @Override // ie.a
    public Object get() {
        return new i(this.f14710a.get(), this.f14711b.get(), this.f14712c.get(), this.d.get(), this.f14713e.get(), this.f14714f.get(), this.f14715g.get(), this.f14716h.get(), this.f14717i.get());
    }
}
