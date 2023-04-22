package u8;

import com.google.android.gms.common.api.Status;
import u8.e;

/* loaded from: classes2.dex */
public final class k0 extends a9.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l0 f15703a;

    public k0(l0 l0Var) {
        this.f15703a = l0Var;
    }

    @Override // a9.h
    public final void B0(String str, double d, boolean z10) {
        l0.G.a("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // a9.h
    public final void F0(String str, long j10) {
        l0.c(this.f15703a, j10, 0);
    }

    @Override // a9.h
    public final void H(String str, long j10, int i10) {
        l0.c(this.f15703a, j10, i10);
    }

    @Override // a9.h
    public final void J0(final int i10) {
        l0.m(this.f15703a).post(new Runnable() { // from class: u8.h0
            @Override // java.lang.Runnable
            public final void run() {
                k0 k0Var = k0.this;
                int i11 = i10;
                l0 l0Var = k0Var.f15703a;
                l0Var.F = 3;
                synchronized (l0Var.E) {
                    for (d1 d1Var : k0Var.f15703a.E) {
                        d1Var.c(i11);
                    }
                }
            }
        });
    }

    @Override // a9.h
    public final void P0(d dVar, String str, String str2, boolean z10) {
        l0 l0Var = this.f15703a;
        l0Var.f15720t = dVar;
        l0Var.f15721u = str;
        a9.z zVar = new a9.z(new Status(0, null), dVar, str, str2, z10);
        synchronized (l0Var.f15718r) {
            ea.h<e.a> hVar = l0Var.f15715o;
            if (hVar != null) {
                hVar.f9273a.p(zVar);
            }
            l0Var.f15715o = null;
        }
    }

    @Override // a9.h
    public final void T0(String str, byte[] bArr) {
        l0.G.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // a9.h
    public final void X0(a9.d0 d0Var) {
        l0.m(this.f15703a).post(new p8.r(this, d0Var));
    }

    @Override // a9.h
    public final void d0(final String str, final String str2) {
        l0.G.a("Receive (type=text, ns=%s) %s", str, str2);
        l0.m(this.f15703a).post(new Runnable() { // from class: u8.j0
            @Override // java.lang.Runnable
            public final void run() {
                e.d dVar;
                k0 k0Var = k0.this;
                String str3 = str;
                String str4 = str2;
                synchronized (k0Var.f15703a.C) {
                    try {
                        dVar = k0Var.f15703a.C.get(str3);
                    } finally {
                    }
                }
                if (dVar != null) {
                    dVar.a(k0Var.f15703a.A, str3, str4);
                } else {
                    l0.G.a("Discarded message for unknown namespace '%s'", str3);
                }
            }
        });
    }

    @Override // a9.h
    public final void i(final int i10) {
        l0.d(this.f15703a, i10);
        l0 l0Var = this.f15703a;
        if (l0Var.D != null) {
            l0.m(l0Var).post(new Runnable() { // from class: u8.e0
                @Override // java.lang.Runnable
                public final void run() {
                    k0 k0Var = k0.this;
                    k0Var.f15703a.D.b(i10);
                }
            });
        }
    }

    @Override // a9.h
    public final void k(int i10) {
        l0.d(this.f15703a, i10);
    }

    @Override // a9.h
    public final void l(final int i10) {
        l0.m(this.f15703a).post(new Runnable() { // from class: u8.g0
            @Override // java.lang.Runnable
            public final void run() {
                k0 k0Var = k0.this;
                int i11 = i10;
                l0 l0Var = k0Var.f15703a;
                l0Var.f15724x = -1;
                l0Var.y = -1;
                l0Var.f15720t = null;
                l0Var.f15721u = null;
                l0Var.f15722v = 0.0d;
                l0Var.l();
                l0Var.f15723w = false;
                l0Var.f15725z = null;
                l0 l0Var2 = k0Var.f15703a;
                l0Var2.F = 1;
                synchronized (l0Var2.E) {
                    for (d1 d1Var : k0Var.f15703a.E) {
                        d1Var.d(i11);
                    }
                }
                k0Var.f15703a.h();
                l0 l0Var3 = k0Var.f15703a;
                l0Var3.f(l0Var3.f15712k);
            }
        });
    }

    @Override // a9.h
    public final void u(a9.c cVar) {
        l0.m(this.f15703a).post(new i0(this, cVar));
    }

    @Override // a9.h
    public final void v0(final int i10) {
        l0.m(this.f15703a).post(new Runnable() { // from class: u8.f0
            /* JADX WARN: Finally extract failed */
            @Override // java.lang.Runnable
            public final void run() {
                k0 k0Var = k0.this;
                int i11 = i10;
                if (i11 == 0) {
                    l0 l0Var = k0Var.f15703a;
                    l0Var.F = 2;
                    l0Var.f15714m = true;
                    l0Var.n = true;
                    synchronized (l0Var.E) {
                        for (d1 d1Var : k0Var.f15703a.E) {
                            d1Var.a();
                        }
                    }
                    return;
                }
                l0 l0Var2 = k0Var.f15703a;
                l0Var2.F = 1;
                synchronized (l0Var2.E) {
                    try {
                        for (d1 d1Var2 : k0Var.f15703a.E) {
                            d1Var2.b(i11);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                k0Var.f15703a.h();
            }
        });
    }

    @Override // a9.h
    public final void zzc(int i10) {
        this.f15703a.j(i10);
    }

    @Override // a9.h
    public final void zzg(int i10) {
        l0.d(this.f15703a, i10);
    }
}
