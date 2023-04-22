package e9;

import d9.a;
import e9.g;

/* loaded from: classes.dex */
public final class w0 extends r0<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final g.a<?> f9255c;

    public w0(g.a<?> aVar, ea.h<Boolean> hVar) {
        super(4, hVar);
        this.f9255c = aVar;
    }

    @Override // e9.x0
    public final /* bridge */ /* synthetic */ void d(p pVar, boolean z10) {
    }

    @Override // e9.f0
    public final boolean f(z<?> zVar) {
        j0 j0Var = zVar.f9263f.get(this.f9255c);
        return j0Var != null && j0Var.f9212a.f9211c;
    }

    @Override // e9.f0
    public final c9.d[] g(z<?> zVar) {
        j0 j0Var = zVar.f9263f.get(this.f9255c);
        if (j0Var == null) {
            return null;
        }
        return j0Var.f9212a.f9210b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e9.r0
    public final void h(z<?> zVar) {
        j0 remove = zVar.f9263f.remove(this.f9255c);
        if (remove == null) {
            this.f9245b.b(Boolean.FALSE);
            return;
        }
        n<a.b, ?> nVar = remove.f9213b;
        ((m0) nVar).f9227b.f9216b.accept(zVar.f9260b, this.f9245b);
        remove.f9212a.f9209a.f9185b = null;
    }
}
