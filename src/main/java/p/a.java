package p;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p.f;

/* loaded from: classes.dex */
public class a<K, V> extends g<K, V> implements Map<K, V> {

    /* renamed from: w  reason: collision with root package name */
    public f<K, V> f13736w;

    /* renamed from: p.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0241a extends f<K, V> {
        public C0241a() {
        }

        @Override // p.f
        public void a() {
            a.this.clear();
        }

        @Override // p.f
        public Object b(int i10, int i11) {
            return a.this.f13767f[(i10 << 1) + i11];
        }

        @Override // p.f
        public Map<K, V> c() {
            return a.this;
        }

        @Override // p.f
        public int d() {
            return a.this.f13768j;
        }

        @Override // p.f
        public int e(Object obj) {
            return a.this.e(obj);
        }

        @Override // p.f
        public int f(Object obj) {
            return a.this.g(obj);
        }

        @Override // p.f
        public void g(K k10, V v2) {
            a.this.put(k10, v2);
        }

        @Override // p.f
        public void h(int i10) {
            a.this.j(i10);
        }

        @Override // p.f
        public V i(int i10, V v2) {
            return a.this.k(i10, v2);
        }
    }

    public a() {
    }

    public a(int i10) {
        super(i10);
    }

    public a(g gVar) {
        if (gVar != null) {
            i(gVar);
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        f<K, V> m10 = m();
        if (m10.f13749a == null) {
            m10.f13749a = new f.b();
        }
        return m10.f13749a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        f<K, V> m10 = m();
        if (m10.f13750b == null) {
            m10.f13750b = new f.c();
        }
        return m10.f13750b;
    }

    public final f<K, V> m() {
        if (this.f13736w == null) {
            this.f13736w = new C0241a();
        }
        return this.f13736w;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f13768j);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        f<K, V> m10 = m();
        if (m10.f13751c == null) {
            m10.f13751c = new f.e();
        }
        return m10.f13751c;
    }
}
