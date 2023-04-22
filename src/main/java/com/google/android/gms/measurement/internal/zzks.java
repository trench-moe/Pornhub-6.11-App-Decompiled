package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import h9.o;
import i9.a;

/* loaded from: classes.dex */
public final class zzks extends a {
    public static final Parcelable.Creator<zzks> CREATOR = new zzkt();
    public final int zza;
    public final String zzb;
    public final long zzc;
    public final Long zzd;
    public final String zze;
    public final String zzf;
    public final Double zzg;

    public zzks(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = j10;
        this.zzd = l10;
        if (i10 == 1) {
            this.zzg = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.zzg = d;
        }
        this.zze = str2;
        this.zzf = str3;
    }

    public zzks(zzku zzkuVar) {
        this(zzkuVar.zzc, zzkuVar.zzd, zzkuVar.zze, zzkuVar.zzb);
    }

    public zzks(String str, long j10, Object obj, String str2) {
        o.e(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j10;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof Long) {
            this.zzd = (Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String) obj;
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        } else {
            this.zzd = null;
            this.zzg = (Double) obj;
            this.zze = null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzkt.zza(this, parcel, i10);
    }

    public final Object zza() {
        Long l10 = this.zzd;
        if (l10 != null) {
            return l10;
        }
        Double d = this.zzg;
        if (d != null) {
            return d;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }
}
