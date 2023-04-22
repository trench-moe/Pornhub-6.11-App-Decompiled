package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p8.w;

/* loaded from: classes.dex */
public final class zzbq extends zzbs {
    private final zzck zza;

    public zzbq(zzbv zzbvVar, zzbw zzbwVar) {
        super(zzbvVar);
        Objects.requireNonNull(zzbwVar, "null reference");
        this.zza = new zzck(zzbvVar, zzbwVar);
    }

    public final long zza(zzbx zzbxVar) {
        zzW();
        Objects.requireNonNull(zzbxVar, "null reference");
        w.b();
        long zzb = this.zza.zzb(zzbxVar, true);
        if (zzb == 0) {
            this.zza.zzk(zzbxVar);
        }
        return zzb;
    }

    public final void zzc() {
        zzW();
        Context zzo = zzo();
        if (!zzfi.zza(zzo) || !zzfn.zzh(zzo)) {
            zze(null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsService"));
        zzo.startService(intent);
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        this.zza.zzX();
    }

    public final void zze(zzcz zzczVar) {
        zzW();
        zzq().c(new zzbo(this, zzczVar));
    }

    public final void zzh(zzex zzexVar) {
        Objects.requireNonNull(zzexVar, "null reference");
        zzW();
        zzG("Hit delivery requested", zzexVar);
        zzq().c(new zzbm(this, zzexVar));
    }

    public final void zzi() {
        w.b();
        this.zza.zzl();
    }

    public final void zzj() {
        w.b();
        this.zza.zzm();
    }

    public final void zzk() {
        zzW();
        w.b();
        zzck zzckVar = this.zza;
        w.b();
        zzckVar.zzW();
        zzckVar.zzO("Service disconnected");
    }

    public final void zzm() {
        this.zza.zzaa();
    }

    public final boolean zzn() {
        zzW();
        try {
            zzq().a(new zzbp(this)).get(4L, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e10) {
            zzS("syncDispatchLocalHits interrupted", e10);
            return false;
        } catch (ExecutionException e11) {
            zzK("syncDispatchLocalHits failed", e11);
            return false;
        } catch (TimeoutException e12) {
            zzS("syncDispatchLocalHits timed out", e12);
            return false;
        }
    }
}
