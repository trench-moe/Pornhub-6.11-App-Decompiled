package w9;

import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class q2 {

    /* renamed from: a  reason: collision with root package name */
    public final y5.c f17287a;

    /* renamed from: b  reason: collision with root package name */
    public final h2.h f17288b;

    /* renamed from: c  reason: collision with root package name */
    public final h2.h f17289c;
    public final d3.d d;

    public q2() {
        y5.c cVar = new y5.c(4);
        this.f17287a = cVar;
        h2.h hVar = new h2.h(null, cVar);
        this.f17289c = hVar;
        this.f17288b = hVar.a();
        d3.d dVar = new d3.d(9);
        this.d = dVar;
        hVar.f("require", new ba(dVar));
        ((Map) dVar.f8752f).put("internal.platform", new Callable() { // from class: w9.x1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ca();
            }
        });
        hVar.f("runtime.counter", new h(Double.valueOf(0.0d)));
    }

    public final o a(h2.h hVar, b4... b4VarArr) {
        o oVar = o.f17256k;
        for (b4 b4Var : b4VarArr) {
            oVar = a0.b.l0(b4Var);
            a0.b.p0(this.f17289c);
            int i10 = ((oVar instanceof p) || (oVar instanceof n)) ? 0 : i10 + 1;
            oVar = this.f17287a.d(hVar, oVar);
        }
        return oVar;
    }
}
