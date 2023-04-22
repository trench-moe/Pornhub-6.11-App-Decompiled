package o8;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class c extends Thread {

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<a> f13616c;

    /* renamed from: f  reason: collision with root package name */
    public final long f13617f;

    /* renamed from: j  reason: collision with root package name */
    public final CountDownLatch f13618j = new CountDownLatch(1);

    /* renamed from: m  reason: collision with root package name */
    public boolean f13619m = false;

    public c(a aVar, long j10) {
        this.f13616c = new WeakReference<>(aVar);
        this.f13617f = j10;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a aVar;
        try {
            if (!this.f13618j.await(this.f13617f, TimeUnit.MILLISECONDS) && (aVar = this.f13616c.get()) != null) {
                aVar.b();
                this.f13619m = true;
            }
        } catch (InterruptedException unused) {
            a aVar2 = this.f13616c.get();
            if (aVar2 != null) {
                aVar2.b();
                this.f13619m = true;
            }
        }
    }
}
