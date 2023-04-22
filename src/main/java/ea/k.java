package ea;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class k implements e, d, b {

    /* renamed from: c  reason: collision with root package name */
    public final Object f9276c = new Object();

    /* renamed from: f  reason: collision with root package name */
    public final int f9277f;

    /* renamed from: j  reason: collision with root package name */
    public final u<Void> f9278j;

    /* renamed from: m  reason: collision with root package name */
    public int f9279m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public int f9280t;

    /* renamed from: u  reason: collision with root package name */
    public Exception f9281u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f9282w;

    public k(int i10, u<Void> uVar) {
        this.f9277f = i10;
        this.f9278j = uVar;
    }

    public final void a() {
        if (this.f9279m + this.n + this.f9280t == this.f9277f) {
            if (this.f9281u != null) {
                u<Void> uVar = this.f9278j;
                int i10 = this.n;
                int i11 = this.f9277f;
                StringBuilder sb2 = new StringBuilder(54);
                sb2.append(i10);
                sb2.append(" out of ");
                sb2.append(i11);
                sb2.append(" underlying tasks failed");
                uVar.o(new ExecutionException(sb2.toString(), this.f9281u));
            } else if (this.f9282w) {
                this.f9278j.q();
            } else {
                this.f9278j.p(null);
            }
        }
    }

    @Override // ea.b
    public final void l() {
        synchronized (this.f9276c) {
            this.f9280t++;
            this.f9282w = true;
            a();
        }
    }

    @Override // ea.e
    public final void onSuccess(Object obj) {
        synchronized (this.f9276c) {
            this.f9279m++;
            a();
        }
    }

    @Override // ea.d
    public final void q(Exception exc) {
        synchronized (this.f9276c) {
            this.n++;
            this.f9281u = exc;
            a();
        }
    }
}
