package vb;

import android.app.ActivityManager;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import xb.k;

/* loaded from: classes2.dex */
public class i implements Callable<ea.g<Void>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f16134c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Throwable f16135f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Thread f16136j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ cc.c f16137m;
    public final /* synthetic */ com.google.firebase.crashlytics.internal.common.d n;

    public i(com.google.firebase.crashlytics.internal.common.d dVar, long j10, Throwable th, Thread thread, cc.c cVar) {
        this.n = dVar;
        this.f16134c = j10;
        this.f16135f = th;
        this.f16136j = thread;
        this.f16137m = cVar;
    }

    @Override // java.util.concurrent.Callable
    public ea.g<Void> call() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        long j10 = this.f16134c / 1000;
        String f10 = this.n.f();
        if (f10 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return ea.j.d(null);
        }
        this.n.f8007c.a();
        z zVar = this.n.f8014k;
        Throwable th = this.f16135f;
        Thread thread = this.f16136j;
        Objects.requireNonNull(zVar);
        String str = "Persisting fatal event for session " + f10;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        q qVar = zVar.f16191a;
        int i10 = qVar.f16166a.getResources().getConfiguration().orientation;
        z.a aVar = new z.a(th, qVar.d);
        k.b bVar = new k.b();
        bVar.e(AppMeasurement.CRASH_ORIGIN);
        bVar.f18277a = Long.valueOf(j10);
        String str2 = qVar.f16168c.d;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) qVar.f16166a.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                runningAppProcessInfo = it.next();
                if (runningAppProcessInfo.processName.equals(str2)) {
                    break;
                }
            }
        }
        runningAppProcessInfo = null;
        Boolean valueOf = runningAppProcessInfo != null ? Boolean.valueOf(runningAppProcessInfo.importance != 100) : null;
        Integer valueOf2 = Integer.valueOf(i10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(qVar.f(thread, (StackTraceElement[]) aVar.f18663c, 4));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            if (!key.equals(thread)) {
                arrayList.add(qVar.f(key, qVar.d.a(entry.getValue()), 0));
            }
        }
        xb.m mVar = new xb.m(new xb.b0(arrayList), qVar.c(aVar, 4, 8, 0), null, qVar.e(), qVar.a(), null);
        String str3 = valueOf2 == null ? " uiOrientation" : BuildConfig.FLAVOR;
        if (str3.isEmpty()) {
            bVar.b(new xb.l(mVar, null, null, valueOf, valueOf2.intValue(), null));
            bVar.c(qVar.b(i10));
            zVar.f16192b.d(zVar.a(bVar.a(), zVar.d, zVar.f16194e), f10, true);
            this.n.d(this.f16134c);
            this.n.c(false, this.f16137m);
            com.google.firebase.crashlytics.internal.common.d dVar = this.n;
            new d(this.n.f8008e);
            com.google.firebase.crashlytics.internal.common.d.a(dVar, d.f16123b);
            if (this.n.f8006b.a()) {
                Executor executor = this.n.d.f16124a;
                return ((cc.b) this.f16137m).f4024i.get().f9273a.n(executor, new h(this, executor));
            }
            return ea.j.d(null);
        }
        throw new IllegalStateException(a1.a.l("Missing required properties:", str3));
    }
}
