package t9;

import java.util.Map;

/* loaded from: classes2.dex */
public final class z2 implements Map.Entry, Comparable<z2> {

    /* renamed from: c */
    public final Comparable f15379c;

    /* renamed from: f */
    public Object f15380f;

    /* renamed from: j */
    public final /* synthetic */ c3 f15381j;

    public z2(c3 c3Var, Comparable comparable, Object obj) {
        this.f15381j = c3Var;
        this.f15379c = comparable;
        this.f15380f = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(z2 z2Var) {
        return this.f15379c.compareTo(z2Var.f15379c);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Comparable comparable = this.f15379c;
            Object key = entry.getKey();
            if (comparable == null ? key == null : comparable.equals(key)) {
                Object obj2 = this.f15380f;
                Object value = entry.getValue();
                if (obj2 == null ? value == null : obj2.equals(value)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f15379c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15380f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f15379c;
        int i10 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f15380f;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        c3 c3Var = this.f15381j;
        int i10 = c3.f15195u;
        c3Var.h();
        Object obj2 = this.f15380f;
        this.f15380f = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15379c);
        String valueOf2 = String.valueOf(this.f15380f);
        return android.support.v4.media.b.n(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
