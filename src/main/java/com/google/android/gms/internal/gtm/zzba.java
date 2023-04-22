package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.HashMap;
import p8.q;

/* loaded from: classes.dex */
public final class zzba extends q<zzba> {
    public int zza;
    public int zzb;
    private String zzc;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.zzc);
        hashMap.put("screenColors", 0);
        hashMap.put("screenWidth", Integer.valueOf(this.zza));
        hashMap.put("screenHeight", Integer.valueOf(this.zzb));
        hashMap.put("viewportWidth", 0);
        hashMap.put("viewportHeight", 0);
        return q.zza(hashMap);
    }

    @Override // p8.q
    public final /* bridge */ /* synthetic */ void zzc(zzba zzbaVar) {
        zzba zzbaVar2 = zzbaVar;
        int i10 = this.zza;
        if (i10 != 0) {
            zzbaVar2.zza = i10;
        }
        int i11 = this.zzb;
        if (i11 != 0) {
            zzbaVar2.zzb = i11;
        }
        if (TextUtils.isEmpty(this.zzc)) {
            return;
        }
        zzbaVar2.zzc = this.zzc;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(String str) {
        this.zzc = str;
    }
}
