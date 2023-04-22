package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzkf extends zzke {
    private boolean zza;

    public zzkf(zzkp zzkpVar) {
        super(zzkpVar);
        this.zzf.zzL();
    }

    public final void zzW() {
        if (!zzY()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzX() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzb();
        this.zzf.zzG();
        this.zza = true;
    }

    public final boolean zzY() {
        return this.zza;
    }

    public abstract boolean zzb();
}
