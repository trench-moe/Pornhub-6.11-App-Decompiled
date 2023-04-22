package com.google.android.gms.measurement.internal;

import java.util.Map;
import w9.s8;

/* loaded from: classes.dex */
final class zzfh implements s8 {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzfi zzb;

    public zzfh(zzfi zzfiVar, String str) {
        this.zzb = zzfiVar;
        this.zza = str;
    }

    @Override // w9.s8
    public final String zza(String str) {
        Map map;
        map = this.zzb.zze;
        Map map2 = (Map) map.get(this.zza);
        if (map2 != null && map2.containsKey(str)) {
            return (String) map2.get(str);
        }
        return null;
    }
}
