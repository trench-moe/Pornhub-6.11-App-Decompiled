package w6;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class l implements k8.o {

    /* renamed from: c  reason: collision with root package name */
    public final k8.w f16653c;

    /* renamed from: f  reason: collision with root package name */
    public final a f16654f;

    /* renamed from: j  reason: collision with root package name */
    public q0 f16655j;

    /* renamed from: m  reason: collision with root package name */
    public k8.o f16656m;
    public boolean n = true;

    /* renamed from: t  reason: collision with root package name */
    public boolean f16657t;

    /* loaded from: classes2.dex */
    public interface a {
    }

    public l(a aVar, k8.b bVar) {
        this.f16654f = aVar;
        this.f16653c = new k8.w(bVar);
    }

    @Override // k8.o
    public void b(m0 m0Var) {
        k8.o oVar = this.f16656m;
        if (oVar != null) {
            oVar.b(m0Var);
            m0Var = this.f16656m.e();
        }
        this.f16653c.b(m0Var);
    }

    @Override // k8.o
    public m0 e() {
        k8.o oVar = this.f16656m;
        return oVar != null ? oVar.e() : this.f16653c.n;
    }

    @Override // k8.o
    public long n() {
        if (this.n) {
            return this.f16653c.n();
        }
        k8.o oVar = this.f16656m;
        Objects.requireNonNull(oVar);
        return oVar.n();
    }
}
