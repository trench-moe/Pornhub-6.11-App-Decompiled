package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzgl extends zzgk {
    private boolean zza;

    public zzgl(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzs.zzD();
    }

    public void zzaA() {
    }

    public abstract boolean zzf();

    public final void zzu() {
        if (!zzx()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzv() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zzf()) {
            return;
        }
        this.zzs.zzB();
        this.zza = true;
    }

    public final void zzw() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzaA();
        this.zzs.zzB();
        this.zza = true;
    }

    public final boolean zzx() {
        return this.zza;
    }
}
