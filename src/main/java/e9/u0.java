package e9;

import d9.a;
import e9.g;

/* loaded from: classes.dex */
public final class u0 extends r0<Void> {

    /* renamed from: c  reason: collision with root package name */
    public final j0 f9249c;

    public u0(j0 j0Var, ea.h<Void> hVar) {
        super(3, hVar);
        this.f9249c = j0Var;
    }

    @Override // e9.x0
    public final /* bridge */ /* synthetic */ void d(p pVar, boolean z10) {
    }

    @Override // e9.f0
    public final boolean f(z<?> zVar) {
        return this.f9249c.f9212a.f9211c;
    }

    @Override // e9.f0
    public final c9.d[] g(z<?> zVar) {
        return this.f9249c.f9212a.f9210b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e9.r0
    public final void h(z<?> zVar) {
        j<a.b, ?> jVar = this.f9249c.f9212a;
        ((l0) jVar).f9220e.f9215a.accept(zVar.f9260b, this.f9245b);
        g.a<?> aVar = this.f9249c.f9212a.f9209a.f9185b;
        if (aVar != null) {
            zVar.f9263f.put(aVar, this.f9249c);
        }
    }
}
