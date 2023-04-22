package com.google.android.gms.internal.gtm;

import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p8.q;
import q8.a;
import q8.b;

/* loaded from: classes.dex */
public final class zzbb extends q<zzbb> {
    private final List<a> zza = new ArrayList();
    private final List<b> zzb = new ArrayList();
    private final Map<String, List<a>> zzc = new HashMap();

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.zza.isEmpty()) {
            hashMap.put("products", this.zza);
        }
        if (!this.zzb.isEmpty()) {
            hashMap.put("promotions", this.zzb);
        }
        if (!this.zzc.isEmpty()) {
            hashMap.put("impressions", this.zzc);
        }
        hashMap.put("productAction", null);
        return q.zza(hashMap);
    }

    @Override // p8.q
    public final /* bridge */ /* synthetic */ void zzc(zzbb zzbbVar) {
        zzbb zzbbVar2 = zzbbVar;
        zzbbVar2.zza.addAll(this.zza);
        zzbbVar2.zzb.addAll(this.zzb);
        for (Map.Entry<String, List<a>> entry : this.zzc.entrySet()) {
            String key = entry.getKey();
            while (true) {
                for (a aVar : entry.getValue()) {
                    if (aVar != null) {
                        String str = key == null ? BuildConfig.FLAVOR : key;
                        if (!zzbbVar2.zzc.containsKey(str)) {
                            zzbbVar2.zzc.put(str, new ArrayList());
                        }
                        zzbbVar2.zzc.get(str).add(aVar);
                    }
                }
            }
        }
    }

    public final List<a> zzd() {
        return Collections.unmodifiableList(this.zza);
    }

    public final List<b> zze() {
        return Collections.unmodifiableList(this.zzb);
    }

    public final Map<String, List<a>> zzf() {
        return this.zzc;
    }
}
