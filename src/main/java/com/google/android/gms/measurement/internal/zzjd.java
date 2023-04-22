package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjd implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzp zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ zzjk zzf;

    public zzjd(zzjk zzjkVar, AtomicReference atomicReference, String str, String str2, String str3, zzp zzpVar, boolean z10) {
        this.zzf = zzjkVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzpVar;
        this.zze = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjk zzjkVar;
        zzdx zzdxVar;
        synchronized (this.zza) {
            try {
                zzjkVar = this.zzf;
                zzdxVar = zzjkVar.zzb;
            } catch (RemoteException e10) {
                this.zzf.zzs.zzay().zzd().zzd("(legacy) Failed to get user properties; remote exception", null, this.zzb, e10);
                this.zza.set(Collections.emptyList());
                atomicReference = this.zza;
            }
            if (zzdxVar == null) {
                zzjkVar.zzs.zzay().zzd().zzd("(legacy) Failed to get user properties; not connected to service", null, this.zzb, this.zzc);
                this.zza.set(Collections.emptyList());
                this.zza.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Objects.requireNonNull(this.zzd, "null reference");
                this.zza.set(zzdxVar.zzh(this.zzb, this.zzc, this.zze, this.zzd));
            } else {
                this.zza.set(zzdxVar.zzi(null, this.zzb, this.zzc, this.zze));
            }
            this.zzf.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}
