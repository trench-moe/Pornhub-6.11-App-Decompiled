package vb;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class u extends c {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f16178c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f16179f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f16180j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f16181m;

    public u(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        this.f16178c = str;
        this.f16179f = executorService;
        this.f16180j = j10;
        this.f16181m = timeUnit;
    }

    @Override // vb.c
    public void a() {
        boolean z10 = false;
        try {
            String str = "Executing shutdown hook for " + this.f16178c;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            this.f16179f.shutdown();
            if (this.f16179f.awaitTermination(this.f16180j, this.f16181m)) {
                return;
            }
            String str2 = this.f16178c + " did not shut down in the allocated time. Requesting immediate shutdown.";
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            this.f16179f.shutdownNow();
        } catch (InterruptedException unused) {
            String format = String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f16178c);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                z10 = true;
            }
            if (z10) {
                Log.d("FirebaseCrashlytics", format, null);
            }
            this.f16179f.shutdownNow();
        }
    }
}
