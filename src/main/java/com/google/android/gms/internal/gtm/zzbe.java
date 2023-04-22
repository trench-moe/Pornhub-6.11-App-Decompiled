package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.HashMap;
import p8.q;

/* loaded from: classes.dex */
public final class zzbe extends q<zzbe> {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private boolean zze;
    private boolean zzf;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.zza);
        hashMap.put("clientId", this.zzb);
        hashMap.put("userId", this.zzc);
        hashMap.put("androidAdId", this.zzd);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.zze));
        hashMap.put("sessionControl", null);
        hashMap.put("nonInteraction", Boolean.valueOf(this.zzf));
        hashMap.put("sampleRate", Double.valueOf(0.0d));
        return q.zza(hashMap);
    }

    @Override // p8.q
    public final /* bridge */ /* synthetic */ void zzc(zzbe zzbeVar) {
        zzbe zzbeVar2 = zzbeVar;
        if (!TextUtils.isEmpty(this.zza)) {
            zzbeVar2.zza = this.zza;
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            zzbeVar2.zzb = this.zzb;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzbeVar2.zzc = this.zzc;
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            zzbeVar2.zzd = this.zzd;
        }
        if (this.zze) {
            zzbeVar2.zze = true;
        }
        TextUtils.isEmpty(null);
        if (this.zzf) {
            zzbeVar2.zzf = true;
        }
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzc;
    }

    public final void zzh(boolean z10) {
        this.zze = z10;
    }

    public final void zzi(String str) {
        this.zzd = str;
    }

    public final void zzj(String str) {
        this.zzb = str;
    }

    public final void zzk(String str) {
        this.zza = "data";
    }

    public final void zzl(boolean z10) {
        this.zzf = true;
    }

    public final void zzm(String str) {
        this.zzc = str;
    }

    public final boolean zzn() {
        return this.zze;
    }

    public final boolean zzo() {
        return this.zzf;
    }
}
