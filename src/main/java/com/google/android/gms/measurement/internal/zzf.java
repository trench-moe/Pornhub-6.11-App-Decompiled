package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzf extends zze {
    private boolean zza;

    public zzf(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzs.zzD();
    }

    public final void zza() {
        if (!zze()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzb() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (!zzf()) {
            this.zzs.zzB();
            this.zza = true;
        }
    }

    public final void zzc() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzd();
        this.zzs.zzB();
        this.zza = true;
    }

    public void zzd() {
    }

    public final boolean zze() {
        return this.zza;
    }

    public abstract boolean zzf();
}
