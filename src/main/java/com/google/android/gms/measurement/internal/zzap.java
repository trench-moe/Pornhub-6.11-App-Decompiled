package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.support.v4.media.a;
import android.text.TextUtils;
import h9.o;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzap {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final long zzd;
    public final long zze;
    public final zzas zzf;

    public zzap(zzfr zzfrVar, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        zzas zzasVar;
        o.e(str2);
        o.e(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzfrVar.zzay().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzeh.zzn(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzasVar = new zzas(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzfrVar.zzay().zzd().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object zzA = zzfrVar.zzv().zzA(next, bundle2.get(next));
                    if (zzA == null) {
                        zzfrVar.zzay().zzk().zzb("Param value can't be null", zzfrVar.zzj().zze(next));
                        it.remove();
                    } else {
                        zzfrVar.zzv().zzN(bundle2, next, zzA);
                    }
                }
            }
            zzasVar = new zzas(bundle2);
        }
        this.zzf = zzasVar;
    }

    private zzap(zzfr zzfrVar, String str, String str2, String str3, long j10, long j11, zzas zzasVar) {
        o.e(str2);
        o.e(str3);
        Objects.requireNonNull(zzasVar, "null reference");
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzfrVar.zzay().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzeh.zzn(str2), zzeh.zzn(str3));
        }
        this.zzf = zzasVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String zzasVar = this.zzf.toString();
        int length = zzasVar.length();
        StringBuilder sb2 = new StringBuilder(length + String.valueOf(str).length() + 33 + String.valueOf(str2).length());
        a.o(sb2, "Event{appId='", str, "', name='", str2);
        sb2.append("', params=");
        sb2.append(zzasVar);
        sb2.append('}');
        return sb2.toString();
    }

    public final zzap zza(zzfr zzfrVar, long j10) {
        return new zzap(zzfrVar, this.zzc, this.zza, this.zzb, this.zzd, j10, this.zzf);
    }
}
