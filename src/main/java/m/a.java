package m;

import java.util.HashMap;
import m.b;

/* loaded from: classes2.dex */
public class a<K, V> extends b<K, V> {
    public HashMap<K, b.c<K, V>> n = new HashMap<>();

    @Override // m.b
    public b.c<K, V> b(K k10) {
        return this.n.get(k10);
    }

    public boolean contains(K k10) {
        return this.n.containsKey(k10);
    }

    @Override // m.b
    public V h(K k10, V v2) {
        b.c<K, V> cVar = this.n.get(k10);
        if (cVar != null) {
            return cVar.f12848f;
        }
        this.n.put(k10, g(k10, v2));
        return null;
    }

    @Override // m.b
    public V j(K k10) {
        V v2 = (V) super.j(k10);
        this.n.remove(k10);
        return v2;
    }
}
