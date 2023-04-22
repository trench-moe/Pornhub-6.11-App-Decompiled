package m6;

import android.content.Context;

/* loaded from: classes2.dex */
public final class j implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final ie.a<Context> f12927a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<g> f12928b;

    public j(ie.a<Context> aVar, ie.a<g> aVar2) {
        this.f12927a = aVar;
        this.f12928b = aVar2;
    }

    @Override // ie.a
    public Object get() {
        return new i(this.f12927a.get(), this.f12928b.get());
    }
}
