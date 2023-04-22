package i7;

import c7.u;
import c7.v;
import k8.c0;
import k8.n;

/* loaded from: classes2.dex */
public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final long f10545a;

    /* renamed from: b  reason: collision with root package name */
    public final n f10546b;

    /* renamed from: c  reason: collision with root package name */
    public final n f10547c;
    public long d;

    public b(long j10, long j11, long j12) {
        this.d = j10;
        this.f10545a = j12;
        n nVar = new n();
        this.f10546b = nVar;
        n nVar2 = new n();
        this.f10547c = nVar2;
        nVar.a(0L);
        nVar2.a(j11);
    }

    public boolean a(long j10) {
        n nVar = this.f10546b;
        return j10 - nVar.b(nVar.f11976a - 1) < 100000;
    }

    @Override // i7.e
    public long b() {
        return this.f10545a;
    }

    @Override // c7.u
    public boolean d() {
        return true;
    }

    @Override // i7.e
    public long e(long j10) {
        return this.f10546b.b(c0.c(this.f10547c, j10, true, true));
    }

    @Override // c7.u
    public u.a i(long j10) {
        int c10 = c0.c(this.f10546b, j10, true, true);
        long b10 = this.f10546b.b(c10);
        v vVar = new v(b10, this.f10547c.b(c10));
        if (b10 != j10) {
            n nVar = this.f10546b;
            if (c10 != nVar.f11976a - 1) {
                int i10 = c10 + 1;
                return new u.a(vVar, new v(nVar.b(i10), this.f10547c.b(i10)));
            }
        }
        return new u.a(vVar);
    }

    @Override // c7.u
    public long j() {
        return this.d;
    }
}
