package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Objects;
import w9.s0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjc implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzp zzc;
    public final /* synthetic */ s0 zzd;
    public final /* synthetic */ zzjk zze;

    public zzjc(zzjk zzjkVar, String str, String str2, zzp zzpVar, s0 s0Var) {
        this.zze = zzjkVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzpVar;
        this.zzd = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfr zzfrVar;
        zzdx zzdxVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzjk zzjkVar = this.zze;
                zzdxVar = zzjkVar.zzb;
                if (zzdxVar == null) {
                    zzjkVar.zzs.zzay().zzd().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                    zzfrVar = this.zze.zzs;
                } else {
                    Objects.requireNonNull(this.zzc, "null reference");
                    arrayList = zzkw.zzG(zzdxVar.zzf(this.zza, this.zzb, this.zzc));
                    this.zze.zzQ();
                    zzfrVar = this.zze.zzs;
                }
            } catch (RemoteException e10) {
                this.zze.zzs.zzay().zzd().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e10);
                zzfrVar = this.zze.zzs;
            }
            zzfrVar.zzv().zzP(this.zzd, arrayList);
        } catch (Throwable th) {
            this.zze.zzs.zzv().zzP(this.zzd, arrayList);
            throw th;
        }
    }
}
