package w9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class l implements o, k {

    /* renamed from: c  reason: collision with root package name */
    public final Map f17216c = new HashMap();

    @Override // w9.o
    public final Boolean b() {
        return Boolean.TRUE;
    }

    @Override // w9.o
    public final o c() {
        l lVar = new l();
        for (Map.Entry entry : this.f17216c.entrySet()) {
            if (entry.getValue() instanceof k) {
                lVar.f17216c.put((String) entry.getKey(), (o) entry.getValue());
            } else {
                lVar.f17216c.put((String) entry.getKey(), ((o) entry.getValue()).c());
            }
        }
        return lVar;
    }

    @Override // w9.k
    public final boolean e(String str) {
        return this.f17216c.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f17216c.equals(((l) obj).f17216c);
        }
        return false;
    }

    @Override // w9.k
    public final void g(String str, o oVar) {
        if (oVar == null) {
            this.f17216c.remove(str);
        } else {
            this.f17216c.put(str, oVar);
        }
    }

    @Override // w9.o
    public final Iterator h() {
        return new j(this.f17216c.keySet().iterator());
    }

    public final int hashCode() {
        return this.f17216c.hashCode();
    }

    @Override // w9.o
    public o j(String str, h2.h hVar, List list) {
        return "toString".equals(str) ? new s(toString()) : m9.a.J(this, new s(str), hVar, list);
    }

    @Override // w9.k
    public final o l(String str) {
        return this.f17216c.containsKey(str) ? (o) this.f17216c.get(str) : o.f17256k;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        if (!this.f17216c.isEmpty()) {
            for (String str : this.f17216c.keySet()) {
                sb2.append(String.format("%s: %s,", str, this.f17216c.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // w9.o
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // w9.o
    public final String zzi() {
        return "[object Object]";
    }
}
