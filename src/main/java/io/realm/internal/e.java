package io.realm.internal;

import io.realm.log.RealmLog;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes2.dex */
public class e implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final ReferenceQueue<g> f10953c;

    public e(ReferenceQueue<g> referenceQueue) {
        this.f10953c = referenceQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                ((NativeObjectReference) this.f10953c.remove()).a();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                RealmLog.a(7, null, "The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore", new Object[0]);
                return;
            }
        }
    }
}
