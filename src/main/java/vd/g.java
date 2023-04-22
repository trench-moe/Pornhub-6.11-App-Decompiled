package vd;

import java.util.List;
import md.k;
import md.l;
import md.n;

/* loaded from: classes2.dex */
public final class g implements d {

    /* renamed from: a  reason: collision with root package name */
    public final k[] f16201a;

    /* renamed from: b  reason: collision with root package name */
    public final n[] f16202b;

    public g(List<k> list, List<n> list2) {
        if (list != null) {
            this.f16201a = (k[]) list.toArray(new k[list.size()]);
        } else {
            this.f16201a = new k[0];
        }
        if (list2 != null) {
            this.f16202b = (n[]) list2.toArray(new n[list2.size()]);
        } else {
            this.f16202b = new n[0];
        }
    }

    @Override // md.k
    public void a(md.i iVar, a aVar) {
        for (k kVar : this.f16201a) {
            kVar.a(iVar, aVar);
        }
    }

    @Override // md.n
    public void b(l lVar, a aVar) {
        for (n nVar : this.f16202b) {
            nVar.b(lVar, aVar);
        }
    }
}
