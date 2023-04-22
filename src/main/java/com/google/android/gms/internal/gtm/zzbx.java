package com.google.android.gms.internal.gtm;

import h9.o;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbx {
    private final String zza;
    private final String zzb;
    private final boolean zzc;
    private long zzd;
    private final Map<String, String> zze;

    public zzbx(long j10, String str, String str2, boolean z10, long j11, Map<String, String> map) {
        o.e(str);
        o.e(str2);
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = j11;
        if (map != null) {
            this.zze = new HashMap(map);
        } else {
            this.zze = Collections.emptyMap();
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final Map<String, String> zzd() {
        return this.zze;
    }

    public final void zze(long j10) {
        this.zzd = j10;
    }

    public final boolean zzf() {
        return this.zzc;
    }
}
