package s6;

import android.content.Context;

/* loaded from: classes2.dex */
public final class a0 implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final ie.a<Context> f14849a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<String> f14850b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<Integer> f14851c;

    public a0(ie.a<Context> aVar, ie.a<String> aVar2, ie.a<Integer> aVar3) {
        this.f14849a = aVar;
        this.f14850b = aVar2;
        this.f14851c = aVar3;
    }

    @Override // ie.a
    public Object get() {
        return new z(this.f14849a.get(), this.f14850b.get(), this.f14851c.get().intValue());
    }
}
