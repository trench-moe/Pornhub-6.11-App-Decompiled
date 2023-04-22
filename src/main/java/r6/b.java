package r6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import l6.q;

/* loaded from: classes2.dex */
public class b implements m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14680a;

    /* renamed from: b  reason: collision with root package name */
    public final s6.d f14681b;

    /* renamed from: c  reason: collision with root package name */
    public final SchedulerConfig f14682c;

    public b(Context context, s6.d dVar, SchedulerConfig schedulerConfig) {
        this.f14680a = context;
        this.f14681b = dVar;
        this.f14682c = schedulerConfig;
    }

    @Override // r6.m
    public void a(q qVar, int i10, boolean z10) {
        boolean z11;
        ComponentName componentName = new ComponentName(this.f14680a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f14680a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.f14680a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(qVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(v6.a.a(qVar.d())).array());
        if (qVar.c() != null) {
            adler32.update(qVar.c());
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        z11 = true;
                    }
                }
            }
            z11 = false;
            if (z11) {
                cb.e.y("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", qVar);
                return;
            }
        }
        long H = this.f14681b.H(qVar);
        SchedulerConfig schedulerConfig = this.f14682c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        Priority d = qVar.d();
        builder.setMinimumLatency(schedulerConfig.b(d, H, i10));
        Set<SchedulerConfig.Flag> c10 = schedulerConfig.c().get(d).c();
        if (c10.contains(SchedulerConfig.Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (c10.contains(SchedulerConfig.Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (c10.contains(SchedulerConfig.Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", qVar.b());
        persistableBundle.putInt("priority", v6.a.a(qVar.d()));
        if (qVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(qVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        cb.e.A("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", qVar, Integer.valueOf(value), Long.valueOf(this.f14682c.b(qVar.d(), H, i10)), Long.valueOf(H), Integer.valueOf(i10));
        jobScheduler.schedule(builder.build());
    }

    @Override // r6.m
    public void b(q qVar, int i10) {
        a(qVar, i10, false);
    }
}
