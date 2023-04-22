package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.support.v4.media.b;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h9.o;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhg implements Runnable {
    public final /* synthetic */ Bundle zza;
    public final /* synthetic */ zzhw zzb;

    public zzhg(zzhw zzhwVar, Bundle bundle) {
        this.zzb = zzhwVar;
        this.zza = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhw zzhwVar = this.zzb;
        Bundle bundle = this.zza;
        zzhwVar.zzg();
        zzhwVar.zza();
        Objects.requireNonNull(bundle, "null reference");
        String string = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        o.e(string);
        if (!zzhwVar.zzs.zzJ()) {
            b.s(zzhwVar.zzs, "Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzhwVar.zzs.zzt().zzE(new zzab(bundle.getString("app_id"), BuildConfig.FLAVOR, new zzks(string, 0L, null, BuildConfig.FLAVOR), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzhwVar.zzs.zzv().zzz(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), BuildConfig.FLAVOR, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
