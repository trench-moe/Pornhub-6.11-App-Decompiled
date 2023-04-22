package w9;

import java.util.Map;

/* loaded from: classes2.dex */
public final class i7 implements Map.Entry, Comparable {

    /* renamed from: c  reason: collision with root package name */
    public final Comparable f17195c;

    /* renamed from: f  reason: collision with root package name */
    public Object f17196f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l7 f17197j;

    public i7(l7 l7Var, Comparable comparable, Object obj) {
        this.f17197j = l7Var;
        this.f17195c = comparable;
        this.f17196f = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f17195c.compareTo(((i7) obj).f17195c);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Comparable comparable = this.f17195c;
            Object key = entry.getKey();
            if (comparable == null ? key == null : comparable.equals(key)) {
                Object obj2 = this.f17196f;
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
        return this.f17195c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f17196f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f17195c;
        int i10 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f17196f;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        l7 l7Var = this.f17197j;
        int i10 = l7.f17224u;
        l7Var.h();
        Object obj2 = this.f17196f;
        this.f17196f = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f17195c);
        String valueOf2 = String.valueOf(this.f17196f);
        return android.support.v4.media.b.n(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
