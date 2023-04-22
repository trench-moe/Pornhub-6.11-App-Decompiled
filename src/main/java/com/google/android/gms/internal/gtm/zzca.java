package com.google.android.gms.internal.gtm;

import android.content.ComponentName;

/* loaded from: classes.dex */
final class zzca implements Runnable {
    public final /* synthetic */ ComponentName zza;
    public final /* synthetic */ zzcb zzb;

    public zzca(zzcb zzcbVar, ComponentName componentName) {
        this.zzb = zzcbVar;
        this.zza = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcc.zzb(this.zzb.zza, this.zza);
    }
}
