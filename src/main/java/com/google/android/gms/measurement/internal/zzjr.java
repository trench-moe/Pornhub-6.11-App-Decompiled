package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzjr {
    private final Context zza;

    public zzjr(Context context) {
        Objects.requireNonNull(context, "null reference");
        this.zza = context;
    }

    private final zzeh zzk() {
        return zzfr.zzp(this.zza, null, null).zzay();
    }

    public final int zza(final Intent intent, int i10, final int i11) {
        zzfr zzp = zzfr.zzp(this.zza, null, null);
        final zzeh zzay = zzp.zzay();
        if (intent == null) {
            zzay.zzk().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzp.zzaw();
        zzay.zzj().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjn
                @Override // java.lang.Runnable
                public final void run() {
                    zzjr.this.zzc(i11, zzay, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder zzb(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgj(zzkp.zzt(this.zza), null);
        }
        zzk().zzk().zzb("onBind received unknown action", action);
        return null;
    }

    public final /* synthetic */ void zzc(int i10, zzeh zzehVar, Intent intent) {
        if (((zzjq) this.zza).zzc(i10)) {
            zzehVar.zzj().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            zzk().zzj().zza("Completed wakeful intent.");
            ((zzjq) this.zza).zza(intent);
        }
    }

    public final /* synthetic */ void zzd(zzeh zzehVar, JobParameters jobParameters) {
        zzehVar.zzj().zza("AppMeasurementJobService processed last upload request.");
        ((zzjq) this.zza).zzb(jobParameters, false);
    }

    public final void zze() {
        zzfr zzp = zzfr.zzp(this.zza, null, null);
        zzeh zzay = zzp.zzay();
        zzp.zzaw();
        zzay.zzj().zza("Local AppMeasurementService is starting up");
    }

    public final void zzf() {
        zzfr zzp = zzfr.zzp(this.zza, null, null);
        zzeh zzay = zzp.zzay();
        zzp.zzaw();
        zzay.zzj().zza("Local AppMeasurementService is shutting down");
    }

    public final void zzg(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onRebind called with null intent");
            return;
        }
        zzk().zzj().zzb("onRebind called. action", intent.getAction());
    }

    public final void zzh(Runnable runnable) {
        zzkp zzt = zzkp.zzt(this.zza);
        zzt.zzaz().zzp(new zzjp(this, zzt, runnable));
    }

    @TargetApi(24)
    public final boolean zzi(final JobParameters jobParameters) {
        zzfr zzp = zzfr.zzp(this.zza, null, null);
        final zzeh zzay = zzp.zzay();
        String string = jobParameters.getExtras().getString("action");
        zzp.zzaw();
        zzay.zzj().zzb("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjo
                @Override // java.lang.Runnable
                public final void run() {
                    zzjr.this.zzd(zzay, jobParameters);
                }
            });
        }
        return true;
    }

    public final boolean zzj(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onUnbind called with null intent");
            return true;
        }
        zzk().zzj().zzb("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
