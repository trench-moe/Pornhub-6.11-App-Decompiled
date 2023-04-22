package w9;

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
public class l7 extends AbstractMap {

    /* renamed from: u */
    public static final /* synthetic */ int f17224u = 0;

    /* renamed from: c */
    public final int f17225c;

    /* renamed from: m */
    public boolean f17228m;
    public volatile k7 n;

    /* renamed from: f */
    public List f17226f = Collections.emptyList();

    /* renamed from: j */
    public Map f17227j = Collections.emptyMap();

    /* renamed from: t */
    public Map f17229t = Collections.emptyMap();

    public void a() {
        if (this.f17228m) {
            return;
        }
        this.f17227j = this.f17227j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f17227j);
        this.f17229t = this.f17229t.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f17229t);
        this.f17228m = true;
    }

    public final int b() {
        return this.f17226f.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int e10 = e(comparable);
        if (e10 >= 0) {
            i7 i7Var = (i7) this.f17226f.get(e10);
            i7Var.f17197j.h();
            Object obj2 = i7Var.f17196f;
            i7Var.f17196f = obj;
            return obj2;
        }
        h();
        if (this.f17226f.isEmpty() && !(this.f17226f instanceof ArrayList)) {
            this.f17226f = new ArrayList(this.f17225c);
        }
        int i10 = -(e10 + 1);
        if (i10 >= this.f17225c) {
            return g().put(comparable, obj);
        }
        int size = this.f17226f.size();
        int i11 = this.f17225c;
        if (size == i11) {
            i7 i7Var2 = (i7) this.f17226f.remove(i11 - 1);
            g().put(i7Var2.f17195c, i7Var2.f17196f);
        }
        this.f17226f.add(i10, new i7(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (!this.f17226f.isEmpty()) {
            this.f17226f.clear();
        }
        if (this.f17227j.isEmpty()) {
            return;
        }
        this.f17227j.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (e(comparable) < 0 && !this.f17227j.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Map.Entry d(int i10) {
        return (Map.Entry) this.f17226f.get(i10);
    }

    public final int e(Comparable comparable) {
        int size = this.f17226f.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((i7) this.f17226f.get(size)).f17195c);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = comparable.compareTo(((i7) this.f17226f.get(i11)).f17195c);
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
    public final Set entrySet() {
        if (this.n == null) {
            this.n = new k7(this);
        }
        return this.n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l7) {
            l7 l7Var = (l7) obj;
            int size = size();
            if (size != l7Var.size()) {
                return false;
            }
            int b10 = b();
            if (b10 != l7Var.b()) {
                return ((AbstractSet) entrySet()).equals(l7Var.entrySet());
            }
            for (int i10 = 0; i10 < b10; i10++) {
                if (!d(i10).equals(l7Var.d(i10))) {
                    return false;
                }
            }
            if (b10 != size) {
                return this.f17227j.equals(l7Var.f17227j);
            }
            return true;
        }
        return super.equals(obj);
    }

    public final Object f(int i10) {
        h();
        Object obj = ((i7) this.f17226f.remove(i10)).f17196f;
        if (!this.f17227j.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            List list = this.f17226f;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new i7(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final SortedMap g() {
        h();
        if (this.f17227j.isEmpty() && !(this.f17227j instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f17227j = treeMap;
            this.f17229t = treeMap.descendingMap();
        }
        return (SortedMap) this.f17227j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e10 = e(comparable);
        return e10 >= 0 ? ((i7) this.f17226f.get(e10)).f17196f : this.f17227j.get(comparable);
    }

    public final void h() {
        if (this.f17228m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b10 = b();
        int i10 = 0;
        for (int i11 = 0; i11 < b10; i11++) {
            i10 += ((i7) this.f17226f.get(i11)).hashCode();
        }
        return this.f17227j.size() > 0 ? this.f17227j.hashCode() + i10 : i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int e10 = e(comparable);
        if (e10 >= 0) {
            return f(e10);
        }
        if (this.f17227j.isEmpty()) {
            return null;
        }
        return this.f17227j.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f17227j.size() + this.f17226f.size();
    }
}
