package j1;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Handler f11133c;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f11133c.post(runnable);
    }
}
