package w9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class n extends i {

    /* renamed from: j  reason: collision with root package name */
    public final List f17242j;

    /* renamed from: m  reason: collision with root package name */
    public final List f17243m;
    public h2.h n;

    public n(String str, List list, List list2, h2.h hVar) {
        super(str);
        this.f17242j = new ArrayList();
        this.n = hVar;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f17242j.add(((o) it.next()).zzi());
            }
        }
        this.f17243m = new ArrayList(list2);
    }

    public n(n nVar) {
        super(nVar.f17186c);
        ArrayList arrayList = new ArrayList(nVar.f17242j.size());
        this.f17242j = arrayList;
        arrayList.addAll(nVar.f17242j);
        ArrayList arrayList2 = new ArrayList(nVar.f17243m.size());
        this.f17243m = arrayList2;
        arrayList2.addAll(nVar.f17243m);
        this.n = nVar.n;
    }

    @Override // w9.i
    public final o a(h2.h hVar, List list) {
        h2.h a10 = this.n.a();
        for (int i10 = 0; i10 < this.f17242j.size(); i10++) {
            if (i10 < list.size()) {
                a10.e((String) this.f17242j.get(i10), hVar.b((o) list.get(i10)));
            } else {
                a10.e((String) this.f17242j.get(i10), o.f17256k);
            }
        }
        for (o oVar : this.f17243m) {
            o b10 = a10.b(oVar);
            if (b10 instanceof p) {
                b10 = a10.b(oVar);
            }
            if (b10 instanceof g) {
                return ((g) b10).f17159c;
            }
        }
        return o.f17256k;
    }

    @Override // w9.i, w9.o
    public final o c() {
        return new n(this);
    }
}
