package e9;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import d9.a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v0<ResultT> extends f0 {

    /* renamed from: b  reason: collision with root package name */
    public final m<a.b, ResultT> f9251b;

    /* renamed from: c  reason: collision with root package name */
    public final ea.h<ResultT> f9252c;
    public final x.c d;

    public v0(int i10, m<a.b, ResultT> mVar, ea.h<ResultT> hVar, x.c cVar) {
        super(i10);
        this.f9252c = hVar;
        this.f9251b = mVar;
        this.d = cVar;
        if (i10 == 2 && mVar.f9222b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // e9.x0
    public final void a(Status status) {
        ea.h<ResultT> hVar = this.f9252c;
        Objects.requireNonNull(this.d);
        hVar.a(a0.b.v(status));
    }

    @Override // e9.x0
    public final void b(Exception exc) {
        this.f9252c.a(exc);
    }

    @Override // e9.x0
    public final void c(z<?> zVar) {
        try {
            m<a.b, ResultT> mVar = this.f9251b;
            ((q0) mVar).d.f9224a.accept(zVar.f9260b, this.f9252c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            Status e12 = x0.e(e11);
            ea.h<ResultT> hVar = this.f9252c;
            Objects.requireNonNull(this.d);
            hVar.a(a0.b.v(e12));
        } catch (RuntimeException e13) {
            this.f9252c.a(e13);
        }
    }

    @Override // e9.x0
    public final void d(p pVar, boolean z10) {
        ea.h<ResultT> hVar = this.f9252c;
        pVar.f9235b.put(hVar, Boolean.valueOf(z10));
        hVar.f9273a.b(new y5.c(pVar, (ea.h) hVar));
    }

    @Override // e9.f0
    public final boolean f(z<?> zVar) {
        return this.f9251b.f9222b;
    }

    @Override // e9.f0
    public final c9.d[] g(z<?> zVar) {
        return this.f9251b.f9221a;
    }
}
