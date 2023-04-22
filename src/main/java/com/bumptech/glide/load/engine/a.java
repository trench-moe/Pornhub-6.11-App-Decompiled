package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.h;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5738a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<h5.b, b> f5739b;

    /* renamed from: c  reason: collision with root package name */
    public final ReferenceQueue<h<?>> f5740c;
    public h.a d;

    /* renamed from: com.bumptech.glide.load.engine.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ThreadFactoryC0071a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0072a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ Runnable f5741c;

            public RunnableC0072a(ThreadFactoryC0071a threadFactoryC0071a, Runnable runnable) {
                this.f5741c = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f5741c.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0072a(this, runnable), "glide-active-resources");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends WeakReference<h<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final h5.b f5742a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5743b;

        /* renamed from: c  reason: collision with root package name */
        public j5.i<?> f5744c;

        public b(h5.b bVar, h<?> hVar, ReferenceQueue<? super h<?>> referenceQueue, boolean z10) {
            super(hVar, referenceQueue);
            j5.i<?> iVar;
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.f5742a = bVar;
            if (hVar.f5810c && z10) {
                iVar = hVar.f5812j;
                Objects.requireNonNull(iVar, "Argument must not be null");
            } else {
                iVar = null;
            }
            this.f5744c = iVar;
            this.f5743b = hVar.f5810c;
        }
    }

    public a(boolean z10) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0071a());
        this.f5739b = new HashMap();
        this.f5740c = new ReferenceQueue<>();
        this.f5738a = z10;
        newSingleThreadExecutor.execute(new j5.a(this));
    }

    public synchronized void a(h5.b bVar, h<?> hVar) {
        b put = this.f5739b.put(bVar, new b(bVar, hVar, this.f5740c, this.f5738a));
        if (put != null) {
            put.f5744c = null;
            put.clear();
        }
    }

    public void b(b bVar) {
        j5.i<?> iVar;
        synchronized (this) {
            this.f5739b.remove(bVar.f5742a);
            if (bVar.f5743b && (iVar = bVar.f5744c) != null) {
                this.d.a(bVar.f5742a, new h<>(iVar, true, false, bVar.f5742a, this.d));
            }
        }
    }
}
