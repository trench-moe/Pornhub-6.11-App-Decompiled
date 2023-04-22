package m6;

import android.content.Context;

/* loaded from: classes2.dex */
public final class h implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final ie.a<Context> f12919a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<u6.a> f12920b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<u6.a> f12921c;

    public h(ie.a<Context> aVar, ie.a<u6.a> aVar2, ie.a<u6.a> aVar3) {
        this.f12919a = aVar;
        this.f12920b = aVar2;
        this.f12921c = aVar3;
    }

    @Override // ie.a
    public Object get() {
        return new g(this.f12919a.get(), this.f12920b.get(), this.f12921c.get());
    }
}
