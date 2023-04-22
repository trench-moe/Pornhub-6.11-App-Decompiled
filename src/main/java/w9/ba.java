package w9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ba extends i {

    /* renamed from: j  reason: collision with root package name */
    public final d3.d f17087j;

    /* renamed from: m  reason: collision with root package name */
    public final Map f17088m;

    public ba(d3.d dVar) {
        super("require");
        this.f17088m = new HashMap();
        this.f17087j = dVar;
    }

    @Override // w9.i
    public final o a(h2.h hVar, List list) {
        o oVar;
        a0.b.u0("require", 1, list);
        String zzi = hVar.b((o) list.get(0)).zzi();
        if (this.f17088m.containsKey(zzi)) {
            return (o) this.f17088m.get(zzi);
        }
        d3.d dVar = this.f17087j;
        if (((Map) dVar.f8752f).containsKey(zzi)) {
            try {
                oVar = (o) ((Callable) ((Map) dVar.f8752f).get(zzi)).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(zzi);
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            oVar = o.f17256k;
        }
        if (oVar instanceof i) {
            this.f17088m.put(zzi, (i) oVar);
        }
        return oVar;
    }
}
