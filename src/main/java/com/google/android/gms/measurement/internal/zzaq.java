package com.google.android.gms.measurement.internal;

import h9.o;

/* loaded from: classes.dex */
final class zzaq {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final Long zzh;
    public final Long zzi;
    public final Long zzj;
    public final Boolean zzk;

    public zzaq(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        o.e(str);
        o.e(str2);
        o.a(j10 >= 0);
        o.a(j11 >= 0);
        o.a(j12 >= 0);
        o.a(j14 >= 0);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = j14;
        this.zzh = l10;
        this.zzi = l11;
        this.zzj = l12;
        this.zzk = bool;
    }

    public final zzaq zza(Long l10, Long l11, Boolean bool) {
        return new zzaq(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public final zzaq zzb(long j10, long j11) {
        return new zzaq(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j10, Long.valueOf(j11), this.zzi, this.zzj, this.zzk);
    }

    public final zzaq zzc(long j10) {
        return new zzaq(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j10, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }
}
