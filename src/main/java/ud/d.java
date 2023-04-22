package ud;

import md.q;

/* loaded from: classes2.dex */
public class d extends e implements md.g {

    /* renamed from: e  reason: collision with root package name */
    public pd.a f15856e;

    public d(q qVar) {
        super(qVar);
    }

    @Override // md.g
    public pd.a b() {
        return this.f15856e;
    }

    @Override // md.g
    public void c(pd.a aVar) {
        this.f15856e = aVar;
    }

    @Override // md.g
    public boolean d() {
        md.d c10 = this.f15849a.c("Expect");
        return c10 != null && "100-continue".equalsIgnoreCase(c10.getValue());
    }
}
