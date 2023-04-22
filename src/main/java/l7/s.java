package l7;

import l7.d0;
import w6.y;

/* loaded from: classes2.dex */
public final class s implements x {

    /* renamed from: a  reason: collision with root package name */
    public w6.y f12600a;

    /* renamed from: b  reason: collision with root package name */
    public k8.a0 f12601b;

    /* renamed from: c  reason: collision with root package name */
    public c7.w f12602c;

    public s(String str) {
        y.b bVar = new y.b();
        bVar.f16879k = str;
        this.f12600a = bVar.a();
    }

    @Override // l7.x
    public void a(k8.a0 a0Var, c7.j jVar, d0.d dVar) {
        this.f12601b = a0Var;
        dVar.a();
        c7.w r10 = jVar.r(dVar.c(), 5);
        this.f12602c = r10;
        r10.d(this.f12600a);
    }

    @Override // l7.x
    public void b(k8.t tVar) {
        long c10;
        k8.a.g(this.f12601b);
        int i10 = k8.c0.f11939a;
        k8.a0 a0Var = this.f12601b;
        synchronized (a0Var) {
            try {
                long j10 = a0Var.f11932c;
                c10 = j10 != -9223372036854775807L ? j10 + a0Var.f11931b : a0Var.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        long d = this.f12601b.d();
        if (c10 != -9223372036854775807L) {
            if (d == -9223372036854775807L) {
                return;
            }
            w6.y yVar = this.f12600a;
            if (d != yVar.F) {
                y.b a10 = yVar.a();
                a10.f16882o = d;
                w6.y a11 = a10.a();
                this.f12600a = a11;
                this.f12602c.d(a11);
            }
            int a12 = tVar.a();
            this.f12602c.a(tVar, a12);
            this.f12602c.b(c10, 1, a12, 0, null);
        }
    }
}
