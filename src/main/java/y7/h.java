package y7;

import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class h extends z6.f implements d {

    /* renamed from: j  reason: collision with root package name */
    public d f18543j;

    /* renamed from: m  reason: collision with root package name */
    public long f18544m;

    @Override // y7.d
    public int b(long j10) {
        d dVar = this.f18543j;
        Objects.requireNonNull(dVar);
        return dVar.b(j10 - this.f18544m);
    }

    @Override // y7.d
    public long c(int i10) {
        d dVar = this.f18543j;
        Objects.requireNonNull(dVar);
        return dVar.c(i10) + this.f18544m;
    }

    @Override // y7.d
    public List<a> d(long j10) {
        d dVar = this.f18543j;
        Objects.requireNonNull(dVar);
        return dVar.d(j10 - this.f18544m);
    }

    @Override // y7.d
    public int e() {
        d dVar = this.f18543j;
        Objects.requireNonNull(dVar);
        return dVar.e();
    }

    public void m() {
        this.f21800c = 0;
        this.f18543j = null;
    }

    public void n(long j10, d dVar, long j11) {
        this.f21826f = j10;
        this.f18543j = dVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f18544m = j10;
    }
}
