package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i9.a;
import java.util.Objects;
import t9.k0;

/* loaded from: classes.dex */
public final class zzab extends a {
    public static final Parcelable.Creator<zzab> CREATOR = new zzac();
    public String zza;
    public String zzb;
    public zzks zzc;
    public long zzd;
    public boolean zze;
    public String zzf;
    public final zzau zzg;
    public long zzh;
    public zzau zzi;
    public final long zzj;
    public final zzau zzk;

    public zzab(zzab zzabVar) {
        Objects.requireNonNull(zzabVar, "null reference");
        this.zza = zzabVar.zza;
        this.zzb = zzabVar.zzb;
        this.zzc = zzabVar.zzc;
        this.zzd = zzabVar.zzd;
        this.zze = zzabVar.zze;
        this.zzf = zzabVar.zzf;
        this.zzg = zzabVar.zzg;
        this.zzh = zzabVar.zzh;
        this.zzi = zzabVar.zzi;
        this.zzj = zzabVar.zzj;
        this.zzk = zzabVar.zzk;
    }

    public zzab(String str, String str2, zzks zzksVar, long j10, boolean z10, String str3, zzau zzauVar, long j11, zzau zzauVar2, long j12, zzau zzauVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzksVar;
        this.zzd = j10;
        this.zze = z10;
        this.zzf = str3;
        this.zzg = zzauVar;
        this.zzh = j11;
        this.zzi = zzauVar2;
        this.zzj = j12;
        this.zzk = zzauVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        k0.r(parcel, 2, this.zza, false);
        k0.r(parcel, 3, this.zzb, false);
        k0.q(parcel, 4, this.zzc, i10, false);
        long j10 = this.zzd;
        parcel.writeInt(524293);
        parcel.writeLong(j10);
        boolean z10 = this.zze;
        parcel.writeInt(262150);
        parcel.writeInt(z10 ? 1 : 0);
        k0.r(parcel, 7, this.zzf, false);
        k0.q(parcel, 8, this.zzg, i10, false);
        long j11 = this.zzh;
        parcel.writeInt(524297);
        parcel.writeLong(j11);
        k0.q(parcel, 10, this.zzi, i10, false);
        long j12 = this.zzj;
        parcel.writeInt(524299);
        parcel.writeLong(j12);
        k0.q(parcel, 12, this.zzk, i10, false);
        k0.z(parcel, v2);
    }
}
