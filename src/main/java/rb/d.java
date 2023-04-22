package rb;

import ea.h;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import vb.a0;
import vb.b0;
import vb.n;
import vb.o;

/* loaded from: classes2.dex */
public class d implements Callable<Void> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f14749c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o f14750f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ cc.b f14751j;

    public d(boolean z10, o oVar, cc.b bVar) {
        this.f14749c = z10;
        this.f14750f = oVar;
        this.f14751j = bVar;
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        if (this.f14749c) {
            o oVar = this.f14750f;
            cc.b bVar = this.f14751j;
            ExecutorService executorService = oVar.f16157k;
            n nVar = new n(oVar, bVar);
            ExecutorService executorService2 = b0.f16121a;
            executorService.execute(new a0(nVar, new h()));
            return null;
        }
        return null;
    }
}
