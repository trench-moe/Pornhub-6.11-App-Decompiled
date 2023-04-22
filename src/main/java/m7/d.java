package m7;

import c7.u;
import c7.v;
import k8.c0;

/* loaded from: classes2.dex */
public final class d implements u {

    /* renamed from: a  reason: collision with root package name */
    public final b f12959a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12960b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12961c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12962e;

    public d(b bVar, int i10, long j10, long j11) {
        this.f12959a = bVar;
        this.f12960b = i10;
        this.f12961c = j10;
        long j12 = (j11 - j10) / bVar.d;
        this.d = j12;
        this.f12962e = a(j12);
    }

    public final long a(long j10) {
        return c0.D(j10 * this.f12960b, 1000000L, this.f12959a.f12954c);
    }

    @Override // c7.u
    public boolean d() {
        return true;
    }

    @Override // c7.u
    public u.a i(long j10) {
        long i10 = c0.i((this.f12959a.f12954c * j10) / (this.f12960b * 1000000), 0L, this.d - 1);
        long j11 = (this.f12959a.d * i10) + this.f12961c;
        long a10 = a(i10);
        v vVar = new v(a10, j11);
        if (a10 < j10 && i10 != this.d - 1) {
            long j12 = i10 + 1;
            return new u.a(vVar, new v(a(j12), (this.f12959a.d * j12) + this.f12961c));
        }
        return new u.a(vVar);
    }

    @Override // c7.u
    public long j() {
        return this.f12962e;
    }
}
