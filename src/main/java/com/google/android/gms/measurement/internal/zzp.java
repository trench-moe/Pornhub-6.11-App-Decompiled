package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import h9.o;
import i9.a;
import java.util.List;
import t9.k0;

/* loaded from: classes.dex */
public final class zzp extends a {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final long zze;
    public final long zzf;
    public final String zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final long zzj;
    public final String zzk;
    public final long zzl;
    public final long zzm;
    public final int zzn;
    public final boolean zzo;
    public final boolean zzp;
    public final String zzq;
    public final Boolean zzr;
    public final long zzs;
    public final List zzt;
    public final String zzu;
    public final String zzv;

    public zzp(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List list, String str8, String str9) {
        o.e(str);
        this.zza = str;
        this.zzb = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.zzc = str3;
        this.zzj = j10;
        this.zzd = str4;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = str5;
        this.zzh = z10;
        this.zzi = z11;
        this.zzk = str6;
        this.zzl = j13;
        this.zzm = j14;
        this.zzn = i10;
        this.zzo = z12;
        this.zzp = z13;
        this.zzq = str7;
        this.zzr = bool;
        this.zzs = j15;
        this.zzt = list;
        this.zzu = null;
        this.zzv = str9;
    }

    public zzp(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List list, String str8, String str9) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzj = j12;
        this.zzd = str4;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = str5;
        this.zzh = z10;
        this.zzi = z11;
        this.zzk = str6;
        this.zzl = j13;
        this.zzm = j14;
        this.zzn = i10;
        this.zzo = z12;
        this.zzp = z13;
        this.zzq = str7;
        this.zzr = bool;
        this.zzs = j15;
        this.zzt = list;
        this.zzu = str8;
        this.zzv = str9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        k0.r(parcel, 2, this.zza, false);
        k0.r(parcel, 3, this.zzb, false);
        k0.r(parcel, 4, this.zzc, false);
        k0.r(parcel, 5, this.zzd, false);
        long j10 = this.zze;
        parcel.writeInt(524294);
        parcel.writeLong(j10);
        long j11 = this.zzf;
        parcel.writeInt(524295);
        parcel.writeLong(j11);
        k0.r(parcel, 8, this.zzg, false);
        boolean z10 = this.zzh;
        parcel.writeInt(262153);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.zzi;
        parcel.writeInt(262154);
        parcel.writeInt(z11 ? 1 : 0);
        long j12 = this.zzj;
        parcel.writeInt(524299);
        parcel.writeLong(j12);
        k0.r(parcel, 12, this.zzk, false);
        long j13 = this.zzl;
        parcel.writeInt(524301);
        parcel.writeLong(j13);
        long j14 = this.zzm;
        parcel.writeInt(524302);
        parcel.writeLong(j14);
        int i11 = this.zzn;
        parcel.writeInt(262159);
        parcel.writeInt(i11);
        boolean z12 = this.zzo;
        parcel.writeInt(262160);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.zzp;
        parcel.writeInt(262162);
        parcel.writeInt(z13 ? 1 : 0);
        k0.r(parcel, 19, this.zzq, false);
        k0.k(parcel, 21, this.zzr, false);
        long j15 = this.zzs;
        parcel.writeInt(524310);
        parcel.writeLong(j15);
        k0.s(parcel, 23, this.zzt, false);
        k0.r(parcel, 24, this.zzu, false);
        k0.r(parcel, 25, this.zzv, false);
        k0.z(parcel, v2);
    }
}
