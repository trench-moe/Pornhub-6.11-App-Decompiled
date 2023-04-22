package io.realm.internal;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final ReferenceQueue<g> f10954a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f10955b;

    static {
        ReferenceQueue<g> referenceQueue = new ReferenceQueue<>();
        f10954a = referenceQueue;
        Thread thread = new Thread(new e(referenceQueue));
        f10955b = new f();
        thread.setName("RealmFinalizingDaemon");
        thread.start();
    }

    public void a(g gVar) {
        new NativeObjectReference(this, gVar, f10954a);
    }
}
