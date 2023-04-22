package ea;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public final Handler f9300c = new z9.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9300c.post(runnable);
    }
}
