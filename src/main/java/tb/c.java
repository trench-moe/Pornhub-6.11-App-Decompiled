package tb;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c implements b, a {

    /* renamed from: c  reason: collision with root package name */
    public final k2.c f15405c;

    /* renamed from: f  reason: collision with root package name */
    public final Object f15406f = new Object();

    /* renamed from: j  reason: collision with root package name */
    public CountDownLatch f15407j;

    public c(k2.c cVar, int i10, TimeUnit timeUnit) {
        this.f15405c = cVar;
    }

    @Override // tb.b
    public void c(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f15407j;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // tb.a
    public void f(String str, Bundle bundle) {
        synchronized (this.f15406f) {
            m9.a aVar = m9.a.A0;
            aVar.E("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f15407j = new CountDownLatch(1);
            ((ob.a) this.f15405c.f11775f).b("clx", str, bundle);
            aVar.E("Awaiting app exception callback from Analytics...");
            try {
                if (this.f15407j.await(500, TimeUnit.MILLISECONDS)) {
                    aVar.E("App exception callback received from Analytics listener.");
                } else {
                    aVar.G("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.f15407j = null;
        }
    }
}
