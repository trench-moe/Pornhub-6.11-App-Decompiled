package com.google.android.gms.measurement;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzfr;
import com.google.android.gms.measurement.internal.zzgr;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzhw;
import com.google.android.gms.measurement.internal.zzks;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p.a;
import r3.c;

/* loaded from: classes.dex */
final class zza extends zzd {
    private final zzfr zza;
    private final zzhw zzb;

    public zza(zzfr zzfrVar) {
        super(null);
        Objects.requireNonNull(zzfrVar, "null reference");
        this.zza = zzfrVar;
        this.zzb = zzfrVar.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final int zza(String str) {
        this.zzb.zzh(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final long zzb() {
        return this.zza.zzv().zzq();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Boolean zzc() {
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Double zzd() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Integer zze() {
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Long zzf() {
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final Object zzg(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? this.zzb.zzi() : this.zzb.zzl() : this.zzb.zzj() : this.zzb.zzm() : this.zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final String zzh() {
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final String zzi() {
        return this.zzb.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final String zzj() {
        return this.zzb.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final String zzk() {
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final String zzl() {
        return this.zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final List zzm(String str, String str2) {
        return this.zzb.zzs(str, str2);
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Map zzn(boolean z10) {
        List<zzks> zzt = this.zzb.zzt(z10);
        a aVar = new a(zzt.size());
        for (zzks zzksVar : zzt) {
            Object zza = zzksVar.zza();
            if (zza != null) {
                aVar.put(zzksVar.zzb, zza);
            }
        }
        return aVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final Map zzo(String str, String str2, boolean z10) {
        return this.zzb.zzu(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzp(String str) {
        com.google.android.gms.measurement.internal.zzd zzd = this.zza.zzd();
        Objects.requireNonNull((c) this.zza.zzav());
        zzd.zzd(str, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzq(String str, String str2, Bundle bundle) {
        this.zza.zzq().zzz(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzr(String str) {
        com.google.android.gms.measurement.internal.zzd zzd = this.zza.zzd();
        Objects.requireNonNull((c) this.zza.zzav());
        zzd.zze(str, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzs(String str, String str2, Bundle bundle) {
        this.zzb.zzD(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzt(String str, String str2, Bundle bundle, long j10) {
        this.zzb.zzE(str, str2, bundle, true, false, j10);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzu(zzgs zzgsVar) {
        this.zzb.zzJ(zzgsVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzv(Bundle bundle) {
        this.zzb.zzP(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzw(zzgr zzgrVar) {
        this.zzb.zzU(zzgrVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzx(zzgs zzgsVar) {
        this.zzb.zzaa(zzgsVar);
    }
}
