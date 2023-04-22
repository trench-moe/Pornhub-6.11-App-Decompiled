package k5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k5.k;

/* loaded from: classes2.dex */
public class f<K extends k, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f11787a = new a<>(null);

    /* renamed from: b  reason: collision with root package name */
    public final Map<K, a<K, V>> f11788b = new HashMap();

    /* loaded from: classes2.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f11789a;

        /* renamed from: b  reason: collision with root package name */
        public List<V> f11790b;

        /* renamed from: c  reason: collision with root package name */
        public a<K, V> f11791c;
        public a<K, V> d;

        public a() {
            this(null);
        }

        public a(K k10) {
            this.d = this;
            this.f11791c = this;
            this.f11789a = k10;
        }

        public V a() {
            List<V> list = this.f11790b;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                return this.f11790b.remove(size - 1);
            }
            return null;
        }
    }

    public V a(K k10) {
        a<K, V> aVar = this.f11788b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f11788b.put(k10, aVar);
        } else {
            k10.a();
        }
        a<K, V> aVar2 = aVar.d;
        aVar2.f11791c = aVar.f11791c;
        aVar.f11791c.d = aVar2;
        a<K, V> aVar3 = this.f11787a;
        aVar.d = aVar3;
        a<K, V> aVar4 = aVar3.f11791c;
        aVar.f11791c = aVar4;
        aVar4.d = aVar;
        aVar.d.f11791c = aVar;
        return aVar.a();
    }

    public void b(K k10, V v2) {
        a<K, V> aVar = this.f11788b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            a<K, V> aVar2 = aVar.d;
            aVar2.f11791c = aVar.f11791c;
            aVar.f11791c.d = aVar2;
            a<K, V> aVar3 = this.f11787a;
            aVar.d = aVar3.d;
            aVar.f11791c = aVar3;
            aVar3.d = aVar;
            aVar.d.f11791c = aVar;
            this.f11788b.put(k10, aVar);
        } else {
            k10.a();
        }
        if (aVar.f11790b == null) {
            aVar.f11790b = new ArrayList();
        }
        aVar.f11790b.add(v2);
    }

    public V c() {
        for (a aVar = this.f11787a.d; !aVar.equals(this.f11787a); aVar = aVar.d) {
            V v2 = (V) aVar.a();
            if (v2 != null) {
                return v2;
            }
            a<K, V> aVar2 = aVar.d;
            aVar2.f11791c = aVar.f11791c;
            aVar.f11791c.d = aVar2;
            this.f11788b.remove(aVar.f11789a);
            ((k) aVar.f11789a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        boolean z10 = false;
        for (a aVar = this.f11787a.f11791c; !aVar.equals(this.f11787a); aVar = aVar.f11791c) {
            z10 = true;
            sb2.append('{');
            sb2.append(aVar.f11789a);
            sb2.append(':');
            List<V> list = aVar.f11790b;
            sb2.append(list != null ? list.size() : 0);
            sb2.append("}, ");
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
