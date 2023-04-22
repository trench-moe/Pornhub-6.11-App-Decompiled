package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzef {
    public final /* synthetic */ zzeh zza;
    private final int zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzef(zzeh zzehVar, int i10, boolean z10, boolean z11) {
        this.zza = zzehVar;
        this.zzb = i10;
        this.zzc = z10;
        this.zzd = z11;
    }

    public final void zza(String str) {
        this.zza.zzt(this.zzb, this.zzc, this.zzd, str, null, null, null);
    }

    public final void zzb(String str, Object obj) {
        this.zza.zzt(this.zzb, this.zzc, this.zzd, str, obj, null, null);
    }

    public final void zzc(String str, Object obj, Object obj2) {
        this.zza.zzt(this.zzb, this.zzc, this.zzd, str, obj, obj2, null);
    }

    public final void zzd(String str, Object obj, Object obj2, Object obj3) {
        this.zza.zzt(this.zzb, this.zzc, this.zzd, str, obj, obj2, obj3);
    }
}
