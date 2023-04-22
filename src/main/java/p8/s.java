package p8;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
public final class s extends FutureTask {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f13867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f13867c = tVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f13867c.f13868c.f13874e;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 37);
            sb2.append("MeasurementExecutor: job failed with ");
            sb2.append(valueOf);
            Log.e("GAv4", sb2.toString());
        }
        super.setException(th);
    }
}
