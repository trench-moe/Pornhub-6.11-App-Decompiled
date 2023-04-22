package p8;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class t extends ThreadPoolExecutor {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w f13868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar) {
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.f13868c = wVar;
        setThreadFactory(new u());
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t2) {
        return new s(this, runnable, t2);
    }
}
