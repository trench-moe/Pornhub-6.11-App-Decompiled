package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfn;

/* loaded from: classes.dex */
public final class AnalyticsService extends Service implements zzfm {

    /* renamed from: c  reason: collision with root package name */
    public zzfn<AnalyticsService> f6772c;

    public final zzfn<AnalyticsService> a() {
        if (this.f6772c == null) {
            this.f6772c = new zzfn<>(this);
        }
        return this.f6772c;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    public boolean callServiceStopSelfResult(int i10) {
        return stopSelfResult(i10);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        a();
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        a().zze();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        a().zza(intent, i10, i11);
        return 2;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    public final void zza(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }
}
