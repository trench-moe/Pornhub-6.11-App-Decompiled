package vb;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class t implements ThreadFactory {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f16175c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AtomicLong f16176f;

    /* loaded from: classes2.dex */
    public class a extends c {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Runnable f16177c;

        public a(t tVar, Runnable runnable) {
            this.f16177c = runnable;
        }

        @Override // vb.c
        public void a() {
            this.f16177c.run();
        }
    }

    public t(String str, AtomicLong atomicLong) {
        this.f16175c = str;
        this.f16176f = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new a(this, runnable));
        newThread.setName(this.f16175c + this.f16176f.getAndIncrement());
        return newThread;
    }
}
