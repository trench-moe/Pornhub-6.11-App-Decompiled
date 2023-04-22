package com.google.android.gms.internal.gtm;

import android.support.v4.media.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p8.q;

/* loaded from: classes.dex */
public final class zzax extends q<zzax> {
    private final Map<Integer, String> zza = new HashMap(4);

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Integer, String> entry : this.zza.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            hashMap.put(b.m(new StringBuilder(valueOf.length() + 9), "dimension", valueOf), entry.getValue());
        }
        return q.zza(hashMap);
    }

    @Override // p8.q
    public final /* bridge */ /* synthetic */ void zzc(zzax zzaxVar) {
        zzaxVar.zza.putAll(this.zza);
    }

    public final Map<Integer, String> zzd() {
        return Collections.unmodifiableMap(this.zza);
    }
}
