package a9;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import u8.e;

/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f251c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f252f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f253j;

    public /* synthetic */ a0(Object obj, ea.g gVar, int i10) {
        this.f251c = i10;
        this.f253j = obj;
        this.f252f = gVar;
    }

    public /* synthetic */ a0(Object obj, Object obj2, int i10) {
        this.f251c = i10;
        this.f252f = obj;
        this.f253j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f251c) {
            case 0:
                b0 b0Var = (b0) this.f252f;
                d0 d0Var = (d0) this.f253j;
                b bVar = b0.f257k;
                u8.d dVar = d0Var.f275m;
                if (!a.h(dVar, b0Var.f260c)) {
                    b0Var.f260c = dVar;
                    b0Var.d.c(dVar);
                }
                double d = d0Var.f272c;
                if (Double.isNaN(d) || Math.abs(d - b0Var.f263g) <= 1.0E-7d) {
                    z10 = false;
                } else {
                    b0Var.f263g = d;
                    z10 = true;
                }
                boolean z13 = d0Var.f273f;
                if (z13 != b0Var.f261e) {
                    b0Var.f261e = z13;
                    z10 = true;
                }
                Double.isNaN(d0Var.f277u);
                b bVar2 = b0.f257k;
                bVar2.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(b0Var.f262f));
                e.c cVar = b0Var.d;
                if (cVar != null && (z10 || b0Var.f262f)) {
                    cVar.f();
                }
                int i10 = d0Var.f274j;
                if (i10 != b0Var.f265i) {
                    b0Var.f265i = i10;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar2.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(b0Var.f262f));
                e.c cVar2 = b0Var.d;
                if (cVar2 != null && (z11 || b0Var.f262f)) {
                    cVar2.a(b0Var.f265i);
                }
                int i11 = d0Var.n;
                if (i11 != b0Var.f266j) {
                    b0Var.f266j = i11;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(b0Var.f262f));
                e.c cVar3 = b0Var.d;
                if (cVar3 != null && (z12 || b0Var.f262f)) {
                    cVar3.e(b0Var.f266j);
                }
                if (!a.h(b0Var.f264h, d0Var.f276t)) {
                    b0Var.f264h = d0Var.f276t;
                }
                b0Var.f262f = false;
                return;
            case 1:
                if (((ea.g) this.f252f).k()) {
                    ((ea.u) ((ea.l) this.f253j).f9286m).q();
                    return;
                }
                try {
                    ((ea.u) ((ea.l) this.f253j).f9286m).p(((ea.a) ((ea.l) this.f253j).f9285j).f((ea.g) this.f252f));
                    return;
                } catch (RuntimeExecutionException e10) {
                    if (e10.getCause() instanceof Exception) {
                        ((ea.u) ((ea.l) this.f253j).f9286m).o((Exception) e10.getCause());
                        return;
                    } else {
                        ((ea.u) ((ea.l) this.f253j).f9286m).o(e10);
                        return;
                    }
                } catch (Exception e11) {
                    ((ea.u) ((ea.l) this.f253j).f9286m).o(e11);
                    return;
                }
            case 2:
                synchronized (((ea.l) this.f253j).f9285j) {
                    Object obj = ((ea.l) this.f253j).f9286m;
                    if (((ea.c) obj) != null) {
                        ((ea.c) obj).g((ea.g) this.f252f);
                    }
                }
                return;
            case 3:
                try {
                    ea.g a10 = ((ea.f) ((ea.l) this.f253j).f9285j).a(((ea.g) this.f252f).j());
                    if (a10 == null) {
                        ((ea.u) ((ea.l) this.f253j).f9286m).o(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    Executor executor = ea.i.f9275b;
                    a10.e(executor, (ea.l) this.f253j);
                    a10.c(executor, (ea.l) this.f253j);
                    a10.a(executor, (ea.l) this.f253j);
                    return;
                } catch (RuntimeExecutionException e12) {
                    if (e12.getCause() instanceof Exception) {
                        ((ea.l) this.f253j).q((Exception) e12.getCause());
                        return;
                    } else {
                        ((ea.u) ((ea.l) this.f253j).f9286m).o(e12);
                        return;
                    }
                } catch (CancellationException unused) {
                    ((ea.u) ((ea.l) this.f253j).f9286m).q();
                    return;
                } catch (Exception e13) {
                    ((ea.u) ((ea.l) this.f253j).f9286m).o(e13);
                    return;
                }
            default:
                try {
                    ((ea.u) this.f252f).p(((Callable) this.f253j).call());
                    return;
                } catch (Exception e14) {
                    ((ea.u) this.f252f).o(e14);
                    return;
                } catch (Throwable th) {
                    ((ea.u) this.f252f).o(new RuntimeException(th));
                    return;
                }
        }
    }
}
