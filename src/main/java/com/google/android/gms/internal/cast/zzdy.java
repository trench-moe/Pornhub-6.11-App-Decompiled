package com.google.android.gms.internal.cast;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzdy extends zzdu<Map.Entry> {
    public final /* synthetic */ zzdz zza;

    public zzdy(zzdz zzdzVar) {
        this.zza = zzdzVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        t3.a.B(i10, 0, "index");
        int i11 = i10 + i10;
        Object obj = this.zza.f6929j[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.f6929j[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
