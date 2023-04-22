package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import h9.o;

/* loaded from: classes.dex */
public final class zzes {
    public final /* synthetic */ zzew zza;
    private final String zzb;
    private final long zzc;
    private boolean zzd;
    private long zze;

    public zzes(zzew zzewVar, String str, long j10) {
        this.zza = zzewVar;
        o.e(str);
        this.zzb = str;
        this.zzc = j10;
    }

    public final long zza() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zza().getLong(this.zzb, this.zzc);
        }
        return this.zze;
    }

    public final void zzb(long j10) {
        SharedPreferences.Editor edit = this.zza.zza().edit();
        edit.putLong(this.zzb, j10);
        edit.apply();
        this.zze = j10;
    }
}
