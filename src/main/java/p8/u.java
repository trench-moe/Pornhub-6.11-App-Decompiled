package p8;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class u implements ThreadFactory {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicInteger f13869c = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new v(runnable, android.support.v4.media.b.e(23, "measurement-", f13869c.incrementAndGet()));
    }
}
