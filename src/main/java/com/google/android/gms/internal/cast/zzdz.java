package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzdz<K, V> extends zzdw<Map.Entry<K, V>> {

    /* renamed from: j  reason: collision with root package name */
    public final transient Object[] f6929j;

    public zzdz(zzdv zzdvVar, Object[] objArr) {
        this.f6929j = objArr;
    }

    @Override // com.google.android.gms.internal.cast.zzdq
    public final int b(Object[] objArr, int i10) {
        zzdu zzduVar = this.f6926f;
        if (zzduVar == null) {
            zzduVar = new zzdy(this);
            this.f6926f = zzduVar;
        }
        return zzduVar.b(objArr, 0);
    }

    @Override // com.google.android.gms.internal.cast.zzdq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(null)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzdu zzduVar = this.f6926f;
        if (zzduVar == null) {
            zzduVar = new zzdy(this);
            this.f6926f = zzduVar;
        }
        return zzduVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
