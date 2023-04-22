package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzip implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zzp zzb;
    public final /* synthetic */ zzjk zzc;

    public zzip(zzjk zzjkVar, AtomicReference atomicReference, zzp zzpVar) {
        this.zzc = zzjkVar;
        this.zza = atomicReference;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzdx zzdxVar;
        synchronized (this.zza) {
            try {
            } catch (RemoteException e10) {
                this.zzc.zzs.zzay().zzd().zzb("Failed to get app instance id", e10);
                atomicReference = this.zza;
            }
            if (!this.zzc.zzs.zzm().zzc().zzi(zzag.ANALYTICS_STORAGE)) {
                this.zzc.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zzs.zzq().zzO(null);
                this.zzc.zzs.zzm().zze.zzb(null);
                this.zza.set(null);
                this.zza.notify();
                return;
            }
            zzjk zzjkVar = this.zzc;
            zzdxVar = zzjkVar.zzb;
            if (zzdxVar == null) {
                zzjkVar.zzs.zzay().zzd().zza("Failed to get app instance id");
                this.zza.notify();
                return;
            }
            Objects.requireNonNull(this.zzb, "null reference");
            this.zza.set(zzdxVar.zzd(this.zzb));
            String str = (String) this.zza.get();
            if (str != null) {
                this.zzc.zzs.zzq().zzO(str);
                this.zzc.zzs.zzm().zze.zzb(str);
            }
            this.zzc.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}
