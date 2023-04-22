package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import java.util.Objects;
import w9.y0;

/* loaded from: classes.dex */
public final class zzgu {
    public final Context zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public Boolean zze;
    public long zzf;
    public y0 zzg;
    public boolean zzh;
    public final Long zzi;
    public String zzj;

    public zzgu(Context context, y0 y0Var, Long l10) {
        this.zzh = true;
        Objects.requireNonNull(context, "null reference");
        Context applicationContext = context.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null reference");
        this.zza = applicationContext;
        this.zzi = l10;
        if (y0Var != null) {
            this.zzg = y0Var;
            this.zzb = y0Var.f17376t;
            this.zzc = y0Var.n;
            this.zzd = y0Var.f17375m;
            this.zzh = y0Var.f17374j;
            this.zzf = y0Var.f17373f;
            this.zzj = y0Var.f17378w;
            Bundle bundle = y0Var.f17377u;
            if (bundle != null) {
                this.zze = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
