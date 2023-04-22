package w9;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class o1 implements ThreadFactory {

    /* renamed from: c  reason: collision with root package name */
    public final ThreadFactory f17264c = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f17264c.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
