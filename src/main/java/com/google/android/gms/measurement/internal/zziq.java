package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;
import w9.s0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zziq implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ s0 zzb;
    public final /* synthetic */ zzjk zzc;

    public zziq(zzjk zzjkVar, zzp zzpVar, s0 s0Var) {
        this.zzc = zzjkVar;
        this.zza = zzpVar;
        this.zzb = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfr zzfrVar;
        zzdx zzdxVar;
        String str = null;
        try {
            try {
                if (this.zzc.zzs.zzm().zzc().zzi(zzag.ANALYTICS_STORAGE)) {
                    zzjk zzjkVar = this.zzc;
                    zzdxVar = zzjkVar.zzb;
                    if (zzdxVar == null) {
                        zzjkVar.zzs.zzay().zzd().zza("Failed to get app instance id");
                        zzfrVar = this.zzc.zzs;
                    } else {
                        Objects.requireNonNull(this.zza, "null reference");
                        str = zzdxVar.zzd(this.zza);
                        if (str != null) {
                            this.zzc.zzs.zzq().zzO(str);
                            this.zzc.zzs.zzm().zze.zzb(str);
                        }
                        this.zzc.zzQ();
                        zzfrVar = this.zzc.zzs;
                    }
                } else {
                    this.zzc.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    this.zzc.zzs.zzq().zzO(null);
                    this.zzc.zzs.zzm().zze.zzb(null);
                    zzfrVar = this.zzc.zzs;
                }
            } catch (RemoteException e10) {
                this.zzc.zzs.zzay().zzd().zzb("Failed to get app instance id", e10);
                zzfrVar = this.zzc.zzs;
            }
            zzfrVar.zzv().zzU(this.zzb, str);
        } catch (Throwable th) {
            this.zzc.zzs.zzv().zzU(this.zzb, null);
            throw th;
        }
    }
}
