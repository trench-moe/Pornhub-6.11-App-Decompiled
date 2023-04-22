package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.b;
import i9.a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzau extends a {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();
    public final String zza;
    public final zzas zzb;
    public final String zzc;
    public final long zzd;

    public zzau(zzau zzauVar, long j10) {
        Objects.requireNonNull(zzauVar, "null reference");
        this.zza = zzauVar.zza;
        this.zzb = zzauVar.zzb;
        this.zzc = zzauVar.zzc;
        this.zzd = j10;
    }

    public zzau(String str, zzas zzasVar, String str2, long j10) {
        this.zza = str;
        this.zzb = zzasVar;
        this.zzc = str2;
        this.zzd = j10;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 21 + String.valueOf(str2).length() + valueOf.length());
        android.support.v4.media.a.o(sb2, "origin=", str, ",name=", str2);
        return b.m(sb2, ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzav.zza(this, parcel, i10);
    }
}
