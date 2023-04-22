package com.google.android.gms.internal.gtm;

import android.support.v4.media.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p8.q;

/* loaded from: classes.dex */
public final class zzay extends q<zzay> {
    private final Map<Integer, Double> zza = new HashMap(4);

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Integer, Double> entry : this.zza.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            hashMap.put(b.m(new StringBuilder(valueOf.length() + 6), "metric", valueOf), entry.getValue());
        }
        return q.zza(hashMap);
    }

    @Override // p8.q
    public final /* bridge */ /* synthetic */ void zzc(zzay zzayVar) {
        zzayVar.zza.putAll(this.zza);
    }

    public final Map<Integer, Double> zzd() {
        return Collections.unmodifiableMap(this.zza);
    }
}
