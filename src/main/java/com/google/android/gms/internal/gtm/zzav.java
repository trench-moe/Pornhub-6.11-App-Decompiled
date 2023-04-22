package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.HashMap;
import p8.q;

/* loaded from: classes.dex */
public final class zzav extends q<zzav> {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.zza);
        hashMap.put("appVersion", this.zzb);
        hashMap.put("appId", this.zzc);
        hashMap.put("appInstallerId", this.zzd);
        return q.zza(hashMap);
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzb;
    }

    @Override // p8.q
    /* renamed from: zzh */
    public final void zzc(zzav zzavVar) {
        if (!TextUtils.isEmpty(this.zza)) {
            zzavVar.zza = this.zza;
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            zzavVar.zzb = this.zzb;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzavVar.zzc = this.zzc;
        }
        if (TextUtils.isEmpty(this.zzd)) {
            return;
        }
        zzavVar.zzd = this.zzd;
    }

    public final void zzi(String str) {
        this.zzc = str;
    }

    public final void zzj(String str) {
        this.zzd = str;
    }

    public final void zzk(String str) {
        this.zza = str;
    }

    public final void zzl(String str) {
        this.zzb = str;
    }
}
