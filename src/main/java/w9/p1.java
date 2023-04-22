package w9;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class p1 extends u1 {
    public final /* synthetic */ String n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ l0 f17270t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a2 f17271u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(a2 a2Var, String str, l0 l0Var) {
        super(a2Var, true);
        this.f17271u = a2Var;
        this.n = str;
        this.f17270t = l0Var;
    }

    @Override // w9.u1
    public final void a() {
        p0 p0Var = this.f17271u.f17064g;
        Objects.requireNonNull(p0Var, "null reference");
        p0Var.getMaxUserProperties(this.n, this.f17270t);
    }

    @Override // w9.u1
    public final void b() {
        this.f17270t.m(null);
    }
}
