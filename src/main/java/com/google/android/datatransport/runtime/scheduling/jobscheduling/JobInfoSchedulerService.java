package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import l6.i;
import l6.q;
import l6.v;
import r6.c;
import r6.d;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f5971c = 0;

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        v.b(getApplicationContext());
        q.a a10 = q.a();
        a10.b(string);
        a10.c(v6.a.b(i10));
        if (string2 != null) {
            ((i.b) a10).f12293b = Base64.decode(string2, 0);
        }
        r6.i iVar = v.a().d;
        iVar.f14705e.execute(new d(iVar, a10.a(), i11, new c(this, jobParameters, 0)));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
