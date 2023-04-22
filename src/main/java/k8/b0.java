package k8;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class b0 implements ThreadFactory {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11934c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f11935f;

    public /* synthetic */ b0(Object obj, int i10) {
        this.f11934c = i10;
        this.f11935f = obj;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f11934c) {
            case 0:
                return new Thread(runnable, (String) this.f11935f);
            default:
                kotlinx.coroutines.a aVar = kotlinx.coroutines.a.f12107f;
                Thread thread = new Thread(runnable, Intrinsics.stringPlus("CommonPool-worker-", Integer.valueOf(((AtomicInteger) this.f11935f).incrementAndGet())));
                thread.setDaemon(true);
                return thread;
        }
    }
}
