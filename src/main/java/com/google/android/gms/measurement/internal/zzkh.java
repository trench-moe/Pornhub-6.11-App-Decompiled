package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkh implements Runnable {
    public final /* synthetic */ zzkq zza;
    public final /* synthetic */ zzkp zzb;

    public zzkh(zzkp zzkpVar, zzkq zzkqVar) {
        this.zzb = zzkpVar;
        this.zza = zzkqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp.zzy(this.zzb, this.zza);
        this.zzb.zzR();
    }
}
