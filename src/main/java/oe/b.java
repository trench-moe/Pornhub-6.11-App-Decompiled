package oe;

import b7.k;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* loaded from: classes3.dex */
public class b extends kotlinx.coroutines.e {

    /* renamed from: f  reason: collision with root package name */
    public final int f13640f;

    /* renamed from: j  reason: collision with root package name */
    public final int f13641j;

    /* renamed from: m  reason: collision with root package name */
    public final long f13642m;
    public final String n;

    /* renamed from: t  reason: collision with root package name */
    public CoroutineScheduler f13643t;

    public b(int i10, int i11, String str, int i12) {
        int i13 = (i12 & 1) != 0 ? i.f13654b : i10;
        int i14 = (i12 & 2) != 0 ? i.f13655c : i11;
        String str2 = (i12 & 4) != 0 ? "DefaultDispatcher" : null;
        long j10 = i.d;
        this.f13640f = i13;
        this.f13641j = i14;
        this.f13642m = j10;
        this.n = str2;
        this.f13643t = new CoroutineScheduler(i13, i14, j10, str2);
    }

    @Override // kotlinx.coroutines.b
    public void m(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            CoroutineScheduler coroutineScheduler = this.f13643t;
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f12124w;
            coroutineScheduler.e(runnable, k.Z, false);
        } catch (RejectedExecutionException unused) {
            kotlinx.coroutines.c.f12110u.P(runnable);
        }
    }
}
