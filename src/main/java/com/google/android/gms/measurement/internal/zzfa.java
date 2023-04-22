package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzfa {
    private final zza zza;

    /* loaded from: classes.dex */
    public interface zza {
        void doStartService(Context context, Intent intent);
    }

    public zzfa(zza zzaVar) {
        Objects.requireNonNull(zzaVar, "null reference");
        this.zza = zzaVar;
    }

    public final void zza(Context context, Intent intent) {
        zzfr zzp = zzfr.zzp(context, null, null);
        zzeh zzay = zzp.zzay();
        if (intent == null) {
            zzay.zzk().zza("Receiver called with null intent");
            return;
        }
        zzp.zzaw();
        String action = intent.getAction();
        zzay.zzj().zzb("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                zzay.zzk().zza("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        zzay.zzj().zza("Starting wakeful intent.");
        this.zza.doStartService(context, className);
    }
}
