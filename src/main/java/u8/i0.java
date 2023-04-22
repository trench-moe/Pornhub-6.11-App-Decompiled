package u8;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.Objects;
import java.util.concurrent.Executor;
import u8.e;

/* loaded from: classes2.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15689c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f15690f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f15691j;

    public /* synthetic */ i0(Object obj, ea.g gVar, int i10) {
        this.f15689c = i10;
        this.f15691j = obj;
        this.f15690f = gVar;
    }

    public /* synthetic */ i0(k0 k0Var, a9.c cVar) {
        this.f15689c = 0;
        this.f15690f = k0Var;
        this.f15691j = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.f15689c) {
            case 0:
                l0 l0Var = ((k0) this.f15690f).f15703a;
                a9.b bVar = l0.G;
                String str = ((a9.c) this.f15691j).f267c;
                if (a9.a.h(str, l0Var.f15721u)) {
                    z10 = false;
                } else {
                    l0Var.f15721u = str;
                    z10 = true;
                }
                l0.G.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(l0Var.n));
                e.c cVar = l0Var.D;
                if (cVar != null && (z10 || l0Var.n)) {
                    cVar.d();
                }
                l0Var.n = false;
                return;
            case 1:
                try {
                    ea.g gVar = (ea.g) ((ea.a) ((ea.m) this.f15691j).f9289j).f((ea.g) this.f15690f);
                    if (gVar == null) {
                        ((ea.u) ((ea.m) this.f15691j).f9290m).o(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    Executor executor = ea.i.f9275b;
                    gVar.e(executor, (ea.m) this.f15691j);
                    gVar.c(executor, (ea.m) this.f15691j);
                    gVar.a(executor, (ea.m) this.f15691j);
                    return;
                } catch (RuntimeExecutionException e10) {
                    if (e10.getCause() instanceof Exception) {
                        ((ea.u) ((ea.m) this.f15691j).f9290m).o((Exception) e10.getCause());
                        return;
                    } else {
                        ((ea.u) ((ea.m) this.f15691j).f9290m).o(e10);
                        return;
                    }
                } catch (Exception e11) {
                    ((ea.u) ((ea.m) this.f15691j).f9290m).o(e11);
                    return;
                }
            default:
                synchronized (((ea.m) this.f15691j).f9289j) {
                    Object obj = ((ea.m) this.f15691j).f9290m;
                    if (((ea.d) obj) != null) {
                        Exception i10 = ((ea.g) this.f15690f).i();
                        Objects.requireNonNull(i10, "null reference");
                        ((ea.d) obj).q(i10);
                    }
                }
                return;
        }
    }
}
