package com.google.android.gms.internal.gtm;

import h9.o;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p8.q;

/* loaded from: classes.dex */
public final class zzaz extends q<zzaz> {
    private final Map<String, Object> zza = new HashMap();

    public final String toString() {
        return q.zza(this.zza);
    }

    @Override // p8.q
    public final void zzc(zzaz zzazVar) {
        zzaz zzazVar2 = zzazVar;
        Objects.requireNonNull(zzazVar2, "null reference");
        zzazVar2.zza.putAll(this.zza);
    }

    public final Map<String, Object> zzd() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final void zze(String str, String str2) {
        o.e(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        o.f(str, "Name can not be empty or \"&\"");
        this.zza.put(str, str2);
    }
}
