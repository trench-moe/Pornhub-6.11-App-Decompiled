package w9;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class c1 extends u1 {
    public final /* synthetic */ String n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f17091t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ l0 f17092u;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ a2 f17093w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(a2 a2Var, String str, String str2, l0 l0Var) {
        super(a2Var, true);
        this.f17093w = a2Var;
        this.n = str;
        this.f17091t = str2;
        this.f17092u = l0Var;
    }

    @Override // w9.u1
    public final void a() {
        p0 p0Var = this.f17093w.f17064g;
        Objects.requireNonNull(p0Var, "null reference");
        p0Var.getConditionalUserProperties(this.n, this.f17091t, this.f17092u);
    }

    @Override // w9.u1
    public final void b() {
        this.f17092u.m(null);
    }
}
