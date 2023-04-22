package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzea<K> extends zzdw<K> {

    /* renamed from: j  reason: collision with root package name */
    public final transient zzdu<K> f6930j;

    public zzea(zzdv<K, ?> zzdvVar, zzdu<K> zzduVar) {
        this.f6930j = zzduVar;
    }

    @Override // com.google.android.gms.internal.cast.zzdq
    public final int b(Object[] objArr, int i10) {
        return this.f6930j.b(objArr, 0);
    }

    @Override // com.google.android.gms.internal.cast.zzdq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f6930j.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
