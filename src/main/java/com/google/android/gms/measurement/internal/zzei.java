package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.support.v4.media.a;
import android.support.v4.media.b;

/* loaded from: classes.dex */
public final class zzei {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final Bundle zzd;

    public zzei(String str, String str2, Bundle bundle, long j10) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j10;
    }

    public static zzei zzb(zzau zzauVar) {
        return new zzei(zzauVar.zza, zzauVar.zzc, zzauVar.zzb.zzc(), zzauVar.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zza;
        String obj = this.zzd.toString();
        StringBuilder sb2 = new StringBuilder(obj.length() + String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        a.o(sb2, "origin=", str, ",name=", str2);
        return b.m(sb2, ",params=", obj);
    }

    public final zzau zza() {
        return new zzau(this.zza, new zzas(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
