package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfn;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AnalyticsJobService extends JobService implements zzfm {

    /* renamed from: c  reason: collision with root package name */
    public zzfn<AnalyticsJobService> f6770c;

    public final zzfn<AnalyticsJobService> a() {
        if (this.f6770c == null) {
            this.f6770c = new zzfn<>(this);
        }
        return this.f6770c;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    public boolean callServiceStopSelfResult(int i10) {
        return stopSelfResult(i10);
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

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        a().zzi(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    @TargetApi(24)
    public final void zza(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }
}
