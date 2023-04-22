package l8;

import k8.c0;
import l8.r;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r.a f12733c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f12734f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f12735j;

    public /* synthetic */ p(r.a aVar, Object obj, long j10) {
        this.f12733c = aVar;
        this.f12734f = obj;
        this.f12735j = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r.a aVar = this.f12733c;
        Object obj = this.f12734f;
        long j10 = this.f12735j;
        r rVar = aVar.f12741b;
        int i10 = c0.f11939a;
        rVar.K(obj, j10);
    }
}
