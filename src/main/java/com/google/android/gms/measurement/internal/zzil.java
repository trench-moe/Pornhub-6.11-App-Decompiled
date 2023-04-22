package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import java.util.Objects;
import w9.s0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzil implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzp zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ s0 zze;
    public final /* synthetic */ zzjk zzf;

    public zzil(zzjk zzjkVar, String str, String str2, zzp zzpVar, boolean z10, s0 s0Var) {
        this.zzf = zzjkVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzpVar;
        this.zzd = z10;
        this.zze = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e10;
        zzdx zzdxVar;
        Bundle bundle2 = new Bundle();
        try {
            zzjk zzjkVar = this.zzf;
            zzdxVar = zzjkVar.zzb;
            if (zzdxVar == null) {
                zzjkVar.zzs.zzay().zzd().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                this.zzf.zzs.zzv().zzQ(this.zze, bundle2);
                return;
            }
            Objects.requireNonNull(this.zzc, "null reference");
            List<zzks> zzh = zzdxVar.zzh(this.zza, this.zzb, this.zzd, this.zzc);
            bundle = new Bundle();
            if (zzh != null) {
                for (zzks zzksVar : zzh) {
                    String str = zzksVar.zze;
                    if (str != null) {
                        bundle.putString(zzksVar.zzb, str);
                    } else {
                        Long l10 = zzksVar.zzd;
                        if (l10 != null) {
                            bundle.putLong(zzksVar.zzb, l10.longValue());
                        } else {
                            Double d = zzksVar.zzg;
                            if (d != null) {
                                bundle.putDouble(zzksVar.zzb, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.zzf.zzQ();
                    this.zzf.zzs.zzv().zzQ(this.zze, bundle);
                } catch (Throwable th) {
                    th = th;
                    bundle2 = bundle;
                    this.zzf.zzs.zzv().zzQ(this.zze, bundle2);
                    throw th;
                }
            } catch (RemoteException e11) {
                e10 = e11;
                this.zzf.zzs.zzay().zzd().zzc("Failed to get user properties; remote exception", this.zza, e10);
                this.zzf.zzs.zzv().zzQ(this.zze, bundle);
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th2) {
            th = th2;
            this.zzf.zzs.zzv().zzQ(this.zze, bundle2);
            throw th;
        }
    }
}
