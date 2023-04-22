package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import w9.s0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zziv implements Runnable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ s0 zzc;
    public final /* synthetic */ zzjk zzd;

    public zziv(zzjk zzjkVar, zzau zzauVar, String str, s0 s0Var) {
        this.zzd = zzjkVar;
        this.zza = zzauVar;
        this.zzb = str;
        this.zzc = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfr zzfrVar;
        zzdx zzdxVar;
        byte[] bArr = null;
        try {
            try {
                zzjk zzjkVar = this.zzd;
                zzdxVar = zzjkVar.zzb;
                if (zzdxVar == null) {
                    zzjkVar.zzs.zzay().zzd().zza("Discarding data. Failed to send event to service to bundle");
                    zzfrVar = this.zzd.zzs;
                } else {
                    bArr = zzdxVar.zzu(this.zza, this.zzb);
                    this.zzd.zzQ();
                    zzfrVar = this.zzd.zzs;
                }
            } catch (RemoteException e10) {
                this.zzd.zzs.zzay().zzd().zzb("Failed to send event to the service to bundle", e10);
                zzfrVar = this.zzd.zzs;
            }
            zzfrVar.zzv().zzR(this.zzc, bArr);
        } catch (Throwable th) {
            this.zzd.zzs.zzv().zzR(this.zzc, bArr);
            throw th;
        }
    }
}
