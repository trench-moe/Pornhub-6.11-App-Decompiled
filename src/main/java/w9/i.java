package w9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class i implements o, k {

    /* renamed from: c  reason: collision with root package name */
    public final String f17186c;

    /* renamed from: f  reason: collision with root package name */
    public final Map f17187f = new HashMap();

    public i(String str) {
        this.f17186c = str;
    }

    public abstract o a(h2.h hVar, List list);

    @Override // w9.o
    public final Boolean b() {
        return Boolean.TRUE;
    }

    @Override // w9.o
    public o c() {
        return this;
    }

    @Override // w9.k
    public final boolean e(String str) {
        return this.f17187f.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String str = this.f17186c;
            if (str != null) {
                return str.equals(iVar.f17186c);
            }
            return false;
        }
        return false;
    }

    @Override // w9.k
    public final void g(String str, o oVar) {
        if (oVar == null) {
            this.f17187f.remove(str);
        } else {
            this.f17187f.put(str, oVar);
        }
    }

    @Override // w9.o
    public final Iterator h() {
        return new j(this.f17187f.keySet().iterator());
    }

    public final int hashCode() {
        String str = this.f17186c;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // w9.o
    public final o j(String str, h2.h hVar, List list) {
        return "toString".equals(str) ? new s(this.f17186c) : m9.a.J(this, new s(str), hVar, list);
    }

    @Override // w9.k
    public final o l(String str) {
        return this.f17187f.containsKey(str) ? (o) this.f17187f.get(str) : o.f17256k;
    }

    @Override // w9.o
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // w9.o
    public final String zzi() {
        return this.f17186c;
    }
}
