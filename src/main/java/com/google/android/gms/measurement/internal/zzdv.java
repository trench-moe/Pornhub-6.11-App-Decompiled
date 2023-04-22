package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import w9.c0;
import w9.e0;

/* loaded from: classes.dex */
public final class zzdv extends c0 implements zzdx {
    public zzdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final String zzd(zzp zzpVar) {
        Parcel zza = zza();
        e0.b(zza, zzpVar);
        Parcel zzb = zzb(11, zza);
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List zze(zzp zzpVar, boolean z10) {
        Parcel zza = zza();
        e0.b(zza, zzpVar);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzb = zzb(7, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzks.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List zzf(String str, String str2, zzp zzpVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        e0.b(zza, zzpVar);
        Parcel zzb = zzb(16, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzab.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List zzg(String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzb = zzb(17, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzab.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List zzh(String str, String str2, boolean z10, zzp zzpVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        ClassLoader classLoader = e0.f17118a;
        zza.writeInt(z10 ? 1 : 0);
        e0.b(zza, zzpVar);
        Parcel zzb = zzb(14, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzks.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List zzi(String str, String str2, String str3, boolean z10) {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        ClassLoader classLoader = e0.f17118a;
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzb = zzb(15, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzks.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzj(zzp zzpVar) {
        Parcel zza = zza();
        e0.b(zza, zzpVar);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzk(zzau zzauVar, zzp zzpVar) {
        Parcel zza = zza();
        e0.b(zza, zzauVar);
        e0.b(zza, zzpVar);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzl(zzau zzauVar, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzm(zzp zzpVar) {
        Parcel zza = zza();
        e0.b(zza, zzpVar);
        zzc(18, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzn(zzab zzabVar, zzp zzpVar) {
        Parcel zza = zza();
        e0.b(zza, zzabVar);
        e0.b(zza, zzpVar);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzo(zzab zzabVar) {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzp(zzp zzpVar) {
        Parcel zza = zza();
        e0.b(zza, zzpVar);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzq(long j10, String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeLong(j10);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzr(Bundle bundle, zzp zzpVar) {
        Parcel zza = zza();
        e0.b(zza, bundle);
        e0.b(zza, zzpVar);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzs(zzp zzpVar) {
        Parcel zza = zza();
        e0.b(zza, zzpVar);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzt(zzks zzksVar, zzp zzpVar) {
        Parcel zza = zza();
        e0.b(zza, zzksVar);
        e0.b(zza, zzpVar);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final byte[] zzu(zzau zzauVar, String str) {
        Parcel zza = zza();
        e0.b(zza, zzauVar);
        zza.writeString(str);
        Parcel zzb = zzb(9, zza);
        byte[] createByteArray = zzb.createByteArray();
        zzb.recycle();
        return createByteArray;
    }
}
