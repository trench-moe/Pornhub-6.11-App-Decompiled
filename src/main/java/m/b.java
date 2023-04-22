package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    public c<K, V> f12843c;

    /* renamed from: f  reason: collision with root package name */
    public c<K, V> f12844f;

    /* renamed from: j  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f12845j = new WeakHashMap<>();

    /* renamed from: m  reason: collision with root package name */
    public int f12846m = 0;

    /* loaded from: classes2.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f12850m;
        }

        @Override // m.b.e
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f12849j;
        }
    }

    /* renamed from: m.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0204b<K, V> extends e<K, V> {
        public C0204b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f12849j;
        }

        @Override // m.b.e
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f12850m;
        }
    }

    /* loaded from: classes2.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: c  reason: collision with root package name */
        public final K f12847c;

        /* renamed from: f  reason: collision with root package name */
        public final V f12848f;

        /* renamed from: j  reason: collision with root package name */
        public c<K, V> f12849j;

        /* renamed from: m  reason: collision with root package name */
        public c<K, V> f12850m;

        public c(K k10, V v2) {
            this.f12847c = k10;
            this.f12848f = v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f12847c.equals(cVar.f12847c) && this.f12848f.equals(cVar.f12848f);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f12847c;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f12848f;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f12847c.hashCode() ^ this.f12848f.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f12847c + "=" + this.f12848f;
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: c  reason: collision with root package name */
        public c<K, V> f12851c;

        /* renamed from: f  reason: collision with root package name */
        public boolean f12852f = true;

        public d() {
        }

        @Override // m.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f12851c;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f12850m;
                this.f12851c = cVar3;
                this.f12852f = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12852f) {
                return b.this.f12843c != null;
            }
            c<K, V> cVar = this.f12851c;
            return (cVar == null || cVar.f12849j == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f12852f) {
                this.f12852f = false;
                this.f12851c = b.this.f12843c;
            } else {
                c<K, V> cVar = this.f12851c;
                this.f12851c = cVar != null ? cVar.f12849j : null;
            }
            return this.f12851c;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: c  reason: collision with root package name */
        public c<K, V> f12854c;

        /* renamed from: f  reason: collision with root package name */
        public c<K, V> f12855f;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f12854c = cVar2;
            this.f12855f = cVar;
        }

        @Override // m.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f12854c == cVar && cVar == this.f12855f) {
                this.f12855f = null;
                this.f12854c = null;
            }
            c<K, V> cVar3 = this.f12854c;
            if (cVar3 == cVar) {
                this.f12854c = c(cVar3);
            }
            c<K, V> cVar4 = this.f12855f;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f12854c;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = d(cVar4);
                }
                this.f12855f = cVar2;
            }
        }

        public abstract c<K, V> c(c<K, V> cVar);

        public abstract c<K, V> d(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12855f != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar;
            c<K, V> cVar2 = this.f12855f;
            c<K, V> cVar3 = this.f12854c;
            if (cVar2 != cVar3 && cVar3 != null) {
                cVar = d(cVar2);
                this.f12855f = cVar;
                return cVar2;
            }
            cVar = null;
            this.f12855f = cVar;
            return cVar2;
        }
    }

    /* loaded from: classes2.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> b(K k10) {
        c<K, V> cVar = this.f12843c;
        while (cVar != null && !cVar.f12847c.equals(k10)) {
            cVar = cVar.f12849j;
        }
        return cVar;
    }

    public b<K, V>.d e() {
        b<K, V>.d dVar = new d();
        this.f12845j.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            r6 = r9
            r8 = 1
            r0 = r8
            if (r10 != r6) goto L6
            return r0
        L6:
            r8 = 4
            boolean r1 = r10 instanceof m.b
            r8 = 4
            r2 = 0
            if (r1 != 0) goto Lf
            r8 = 6
            return r2
        Lf:
            r8 = 2
            m.b r10 = (m.b) r10
            int r1 = r6.f12846m
            r8 = 5
            int r3 = r10.f12846m
            r8 = 3
            if (r1 == r3) goto L1c
            r8 = 1
            return r2
        L1c:
            r8 = 5
            java.util.Iterator r8 = r6.iterator()
            r1 = r8
            java.util.Iterator r8 = r10.iterator()
            r10 = r8
        L27:
            r3 = r1
            m.b$e r3 = (m.b.e) r3
            r8 = 7
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L56
            r8 = 3
            r4 = r10
            m.b$e r4 = (m.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L56
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r8 = r4.next()
            r4 = r8
            if (r3 != 0) goto L4b
            r8 = 1
            if (r4 != 0) goto L55
        L4b:
            if (r3 == 0) goto L27
            r8 = 2
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L27
            r8 = 6
        L55:
            return r2
        L56:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L65
            m.b$e r10 = (m.b.e) r10
            boolean r10 = r10.hasNext()
            if (r10 != 0) goto L65
            goto L68
        L65:
            r8 = 4
            r8 = 0
            r0 = r8
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.b.equals(java.lang.Object):boolean");
    }

    public c<K, V> g(K k10, V v2) {
        c<K, V> cVar = new c<>(k10, v2);
        this.f12846m++;
        c<K, V> cVar2 = this.f12844f;
        if (cVar2 == null) {
            this.f12843c = cVar;
            this.f12844f = cVar;
            return cVar;
        }
        cVar2.f12849j = cVar;
        cVar.f12850m = cVar2;
        this.f12844f = cVar;
        return cVar;
    }

    public V h(K k10, V v2) {
        c<K, V> b10 = b(k10);
        if (b10 != null) {
            return b10.f12848f;
        }
        g(k10, v2);
        return null;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i10;
            }
            i10 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f12843c, this.f12844f);
        this.f12845j.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V j(K k10) {
        c<K, V> b10 = b(k10);
        if (b10 == null) {
            return null;
        }
        this.f12846m--;
        if (!this.f12845j.isEmpty()) {
            for (f<K, V> fVar : this.f12845j.keySet()) {
                fVar.a(b10);
            }
        }
        c<K, V> cVar = b10.f12850m;
        if (cVar != null) {
            cVar.f12849j = b10.f12849j;
        } else {
            this.f12843c = b10.f12849j;
        }
        c<K, V> cVar2 = b10.f12849j;
        if (cVar2 != null) {
            cVar2.f12850m = cVar;
        } else {
            this.f12844f = cVar;
        }
        b10.f12849j = null;
        b10.f12850m = null;
        return b10.f12848f;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            while (true) {
                e eVar = (e) it;
                if (!eVar.hasNext()) {
                    m10.append("]");
                    return m10.toString();
                }
                m10.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    m10.append(", ");
                }
            }
        }
    }
}
