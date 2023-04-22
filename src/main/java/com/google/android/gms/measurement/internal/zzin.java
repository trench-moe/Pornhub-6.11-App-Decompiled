package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzin implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zzp zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ zzjk zzd;

    public zzin(zzjk zzjkVar, AtomicReference atomicReference, zzp zzpVar, boolean z10) {
        this.zzd = zzjkVar;
        this.zza = atomicReference;
        this.zzb = zzpVar;
        this.zzc = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjk zzjkVar;
        zzdx zzdxVar;
        synchronized (this.zza) {
            try {
                zzjkVar = this.zzd;
                zzdxVar = zzjkVar.zzb;
            } catch (RemoteException e10) {
                this.zzd.zzs.zzay().zzd().zzb("Failed to get all user properties; remote exception", e10);
                atomicReference = this.zza;
            }
            if (zzdxVar == null) {
                zzjkVar.zzs.zzay().zzd().zza("Failed to get all user properties; not connected to service");
                this.zza.notify();
                return;
            }
            Objects.requireNonNull(this.zzb, "null reference");
            this.zza.set(zzdxVar.zze(this.zzb, this.zzc));
            this.zzd.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}
