package k8;

import w6.m0;

/* loaded from: classes2.dex */
public final class w implements o {

    /* renamed from: c  reason: collision with root package name */
    public final b f12026c;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12027f;

    /* renamed from: j  reason: collision with root package name */
    public long f12028j;

    /* renamed from: m  reason: collision with root package name */
    public long f12029m;
    public m0 n = m0.d;

    public w(b bVar) {
        this.f12026c = bVar;
    }

    public void a(long j10) {
        this.f12028j = j10;
        if (this.f12027f) {
            this.f12029m = this.f12026c.d();
        }
    }

    @Override // k8.o
    public void b(m0 m0Var) {
        if (this.f12027f) {
            a(n());
        }
        this.n = m0Var;
    }

    public void c() {
        if (this.f12027f) {
            return;
        }
        this.f12029m = this.f12026c.d();
        this.f12027f = true;
    }

    @Override // k8.o
    public m0 e() {
        return this.n;
    }

    @Override // k8.o
    public long n() {
        long j10 = this.f12028j;
        if (this.f12027f) {
            long d = this.f12026c.d() - this.f12029m;
            m0 m0Var = this.n;
            if (m0Var.f16678a == 1.0f) {
                return j10 + w6.g.b(d);
            }
            j10 += d * m0Var.f16680c;
        }
        return j10;
    }
}
