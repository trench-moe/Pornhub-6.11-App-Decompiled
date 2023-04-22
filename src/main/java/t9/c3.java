package t9;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class c3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: u */
    public static final /* synthetic */ int f15195u = 0;

    /* renamed from: c */
    public final int f15196c;

    /* renamed from: m */
    public boolean f15199m;
    public volatile b3 n;

    /* renamed from: f */
    public List<z2> f15197f = Collections.emptyList();

    /* renamed from: j */
    public Map<K, V> f15198j = Collections.emptyMap();

    /* renamed from: t */
    public Map<K, V> f15200t = Collections.emptyMap();

    public void a() {
        if (this.f15199m) {
            return;
        }
        this.f15198j = this.f15198j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f15198j);
        this.f15200t = this.f15200t.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f15200t);
        this.f15199m = true;
    }

    public final int b() {
        return this.f15197f.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c */
    public final V put(K k10, V v2) {
        h();
        int e10 = e(k10);
        if (e10 >= 0) {
            z2 z2Var = this.f15197f.get(e10);
            z2Var.f15381j.h();
            V v10 = (V) z2Var.f15380f;
            z2Var.f15380f = v2;
            return v10;
        }
        h();
        if (this.f15197f.isEmpty() && !(this.f15197f instanceof ArrayList)) {
            this.f15197f = new ArrayList(this.f15196c);
        }
        int i10 = -(e10 + 1);
        if (i10 >= this.f15196c) {
            return g().put(k10, v2);
        }
        int size = this.f15197f.size();
        int i11 = this.f15196c;
        if (size == i11) {
            z2 remove = this.f15197f.remove(i11 - 1);
            g().put((K) remove.f15379c, (V) remove.f15380f);
        }
        this.f15197f.add(i10, new z2(this, k10, v2));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (!this.f15197f.isEmpty()) {
            this.f15197f.clear();
        }
        if (!this.f15198j.isEmpty()) {
            this.f15198j.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (e(comparable) < 0 && !this.f15198j.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Map.Entry<K, V> d(int i10) {
        return this.f15197f.get(i10);
    }

    public final int e(K k10) {
        int size = this.f15197f.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f15197f.get(size).f15379c);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f15197f.get(i11).f15379c);
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.n == null) {
            this.n = new b3(this);
        }
        return this.n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c3) {
            c3 c3Var = (c3) obj;
            int size = size();
            if (size != c3Var.size()) {
                return false;
            }
            int b10 = b();
            if (b10 != c3Var.b()) {
                return ((AbstractSet) entrySet()).equals(c3Var.entrySet());
            }
            for (int i10 = 0; i10 < b10; i10++) {
                if (!d(i10).equals(c3Var.d(i10))) {
                    return false;
                }
            }
            if (b10 != size) {
                return this.f15198j.equals(c3Var.f15198j);
            }
            return true;
        }
        return super.equals(obj);
    }

    public final V f(int i10) {
        h();
        V v2 = (V) this.f15197f.remove(i10).f15380f;
        if (!this.f15198j.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            List<z2> list = this.f15197f;
            Map.Entry<K, V> next = it.next();
            list.add(new z2(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v2;
    }

    public final SortedMap<K, V> g() {
        h();
        if (this.f15198j.isEmpty() && !(this.f15198j instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f15198j = treeMap;
            this.f15200t = treeMap.descendingMap();
        }
        return (SortedMap) this.f15198j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e10 = e(comparable);
        return e10 >= 0 ? (V) this.f15197f.get(e10).f15380f : this.f15198j.get(comparable);
    }

    public final void h() {
        if (this.f15199m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b10 = b();
        int i10 = 0;
        for (int i11 = 0; i11 < b10; i11++) {
            i10 += this.f15197f.get(i11).hashCode();
        }
        return this.f15198j.size() > 0 ? this.f15198j.hashCode() + i10 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int e10 = e(comparable);
        if (e10 >= 0) {
            return (V) f(e10);
        }
        if (this.f15198j.isEmpty()) {
            return null;
        }
        return this.f15198j.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f15198j.size() + this.f15197f.size();
    }
}
