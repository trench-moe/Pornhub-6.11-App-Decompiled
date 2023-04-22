package com.google.android.gms.internal.gtm;

import android.os.Looper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcv implements Runnable {
    public final /* synthetic */ zzcw zza;

    public zzcv(zzcw zzcwVar) {
        this.zza = zzcwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbv zzbvVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzbvVar = this.zza.zzb;
            zzbvVar.zzd().c(this);
            return;
        }
        boolean zzh = this.zza.zzh();
        this.zza.zzd = 0L;
        if (zzh) {
            this.zza.zza();
        }
    }
}
