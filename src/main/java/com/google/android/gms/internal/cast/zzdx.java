package com.google.android.gms.internal.cast;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdx<E> extends zzdu<E> {
    public static final zzdu<Object> n = new zzdx(new Object[0], 0);

    /* renamed from: j  reason: collision with root package name */
    public final transient Object[] f6927j;

    /* renamed from: m  reason: collision with root package name */
    public final transient int f6928m;

    public zzdx(Object[] objArr, int i10) {
        this.f6927j = objArr;
        this.f6928m = i10;
    }

    @Override // com.google.android.gms.internal.cast.zzdu, com.google.android.gms.internal.cast.zzdq
    public final int b(Object[] objArr, int i10) {
        System.arraycopy(this.f6927j, 0, objArr, 0, this.f6928m);
        return this.f6928m;
    }

    @Override // com.google.android.gms.internal.cast.zzdq
    public final int e() {
        return this.f6928m;
    }

    @Override // com.google.android.gms.internal.cast.zzdq
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i10) {
        t3.a.B(i10, this.f6928m, "index");
        E e10 = (E) this.f6927j[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // com.google.android.gms.internal.cast.zzdq
    public final Object[] h() {
        return this.f6927j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6928m;
    }
}
