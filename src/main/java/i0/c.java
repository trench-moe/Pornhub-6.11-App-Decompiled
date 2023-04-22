package i0;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public class c implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public final Handler f10450c;

    public c(Handler handler) {
        Objects.requireNonNull(handler);
        this.f10450c = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Handler handler = this.f10450c;
        Objects.requireNonNull(runnable);
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(this.f10450c + " is shutting down");
    }
}
