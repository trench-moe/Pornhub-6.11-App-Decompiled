package com.google.android.gms.internal.cast;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzeb extends zzdu<Object> {

    /* renamed from: j  reason: collision with root package name */
    public final transient Object[] f6931j;

    /* renamed from: m  reason: collision with root package name */
    public final transient int f6932m;

    public zzeb(Object[] objArr, int i10) {
        this.f6931j = objArr;
        this.f6932m = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        t3.a.B(i10, 0, "index");
        Object obj = this.f6931j[i10 + i10 + this.f6932m];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
