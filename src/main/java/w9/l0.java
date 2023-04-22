package w9;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class l0 extends r0 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f17217a = new AtomicReference();

    /* renamed from: b  reason: collision with root package name */
    public boolean f17218b;

    public static final Object c1(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e10);
            throw e10;
        }
    }

    public final Bundle a1(long j10) {
        Bundle bundle;
        synchronized (this.f17217a) {
            if (!this.f17218b) {
                try {
                    this.f17217a.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f17217a.get();
        }
        return bundle;
    }

    public final String b1(long j10) {
        return (String) c1(a1(j10), String.class);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // w9.s0
    public final void m(android.os.Bundle r5) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r4.f17217a
            monitor-enter(r0)
            r3 = 6
            java.util.concurrent.atomic.AtomicReference r1 = r4.f17217a     // Catch: java.lang.Throwable -> L17
            r3 = 2
            r1.set(r5)     // Catch: java.lang.Throwable -> L17
            r2 = 1
            r5 = r2
            r4.f17218b = r5     // Catch: java.lang.Throwable -> L17
            r3 = 6
            java.util.concurrent.atomic.AtomicReference r5 = r4.f17217a     // Catch: java.lang.Throwable -> L21
            r3 = 1
            r5.notify()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L17:
            r5 = move-exception
            java.util.concurrent.atomic.AtomicReference r1 = r4.f17217a     // Catch: java.lang.Throwable -> L21
            r3 = 3
            r1.notify()     // Catch: java.lang.Throwable -> L21
            r3 = 6
            throw r5     // Catch: java.lang.Throwable -> L21
            r3 = 5
        L21:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r5
            r3 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.l0.m(android.os.Bundle):void");
    }
}
