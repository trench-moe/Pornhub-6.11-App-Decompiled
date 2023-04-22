package com.google.android.gms.internal.cast;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdt extends zzdu {

    /* renamed from: j  reason: collision with root package name */
    public final transient int f6920j;

    /* renamed from: m  reason: collision with root package name */
    public final transient int f6921m;
    public final /* synthetic */ zzdu zzc;

    public zzdt(zzdu zzduVar, int i10, int i11) {
        this.zzc = zzduVar;
        this.f6920j = i10;
        this.f6921m = i11;
    }

    @Override // com.google.android.gms.internal.cast.zzdq
    public final int e() {
        return this.zzc.g() + this.f6920j + this.f6921m;
    }

    @Override // com.google.android.gms.internal.cast.zzdq
    public final int g() {
        return this.zzc.g() + this.f6920j;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        t3.a.B(i10, this.f6921m, "index");
        return this.zzc.get(i10 + this.f6920j);
    }

    @Override // com.google.android.gms.internal.cast.zzdq
    public final Object[] h() {
        return this.zzc.h();
    }

    @Override // com.google.android.gms.internal.cast.zzdu, java.util.List
    /* renamed from: j */
    public final zzdu subList(int i10, int i11) {
        t3.a.F(i10, i11, this.f6921m);
        zzdu zzduVar = this.zzc;
        int i12 = this.f6920j;
        return zzduVar.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6921m;
    }
}
