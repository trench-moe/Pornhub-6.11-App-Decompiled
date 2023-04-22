package kotlin.reflect.jvm.internal.pcollections;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class MapEntry<K, V> implements Serializable {
    public final K key;
    public final V value;

    public MapEntry(K k10, V v2) {
        this.key = k10;
        this.value = v2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof MapEntry) {
            MapEntry mapEntry = (MapEntry) obj;
            K k10 = this.key;
            if (k10 == null) {
                if (mapEntry.key != null) {
                    return false;
                }
            } else if (!k10.equals(mapEntry.key)) {
                return false;
            }
            V v2 = this.value;
            V v10 = mapEntry.value;
            if (v2 == null) {
                if (v10 != null) {
                    return false;
                }
            } else if (!v2.equals(v10)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        K k10 = this.key;
        int hashCode = k10 == null ? 0 : k10.hashCode();
        V v2 = this.value;
        return hashCode ^ (v2 != null ? v2.hashCode() : 0);
    }

    public String toString() {
        return this.key + "=" + this.value;
    }
}
