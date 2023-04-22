package w9;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class q1 extends u1 {
    public final /* synthetic */ l0 n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f17285t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a2 f17286u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(a2 a2Var, l0 l0Var, int i10) {
        super(a2Var, true);
        this.f17286u = a2Var;
        this.n = l0Var;
        this.f17285t = i10;
    }

    @Override // w9.u1
    public final void a() {
        p0 p0Var = this.f17286u.f17064g;
        Objects.requireNonNull(p0Var, "null reference");
        p0Var.getTestFlag(this.n, this.f17285t);
    }

    @Override // w9.u1
    public final void b() {
        this.n.m(null);
    }
}
