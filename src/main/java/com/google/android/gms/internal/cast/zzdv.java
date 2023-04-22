package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzdv<K, V> implements Map<K, V>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public transient zzdw<Map.Entry<K, V>> f6923c;

    /* renamed from: f  reason: collision with root package name */
    public transient zzdw<K> f6924f;

    /* renamed from: j  reason: collision with root package name */
    public transient zzdq<V> f6925j;

    @Override // java.util.Map
    /* renamed from: a */
    public final zzdq<V> values() {
        zzdq<V> zzdqVar = this.f6925j;
        if (zzdqVar == null) {
            zzeb zzebVar = new zzeb(((zzec) this).f6933m, 1);
            this.f6925j = zzebVar;
            return zzebVar;
        }
        return zzdqVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        zzdw<Map.Entry<K, V>> zzdwVar = this.f6923c;
        if (zzdwVar == null) {
            zzec zzecVar = (zzec) this;
            zzdz zzdzVar = new zzdz(zzecVar, zzecVar.f6933m);
            this.f6923c = zzdzVar;
            zzdwVar = zzdzVar;
        }
        return zzdwVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v2) {
        return v2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        zzdw<Map.Entry<K, V>> zzdwVar = this.f6923c;
        if (zzdwVar == null) {
            zzec zzecVar = (zzec) this;
            zzdz zzdzVar = new zzdz(zzecVar, zzecVar.f6933m);
            this.f6923c = zzdzVar;
            zzdwVar = zzdzVar;
        }
        return a0.b.j0(zzdwVar);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zzdw<K> zzdwVar = this.f6924f;
        if (zzdwVar == null) {
            zzec zzecVar = (zzec) this;
            zzea zzeaVar = new zzea(zzecVar, new zzeb(zzecVar.f6933m, 0));
            this.f6924f = zzeaVar;
            return zzeaVar;
        }
        return zzdwVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
            sb2.append('{');
            boolean z10 = true;
            for (Map.Entry<K, V> entry : entrySet()) {
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                sb2.append(entry.getValue());
                z10 = false;
            }
            sb2.append('}');
            return sb2.toString();
        }
        throw new IllegalArgumentException(android.support.v4.media.b.e(44, "size cannot be negative but was: ", size));
    }
}
