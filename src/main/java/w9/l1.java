package w9;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class l1 extends u1 {
    public final /* synthetic */ String n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f17219t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ boolean f17220u;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ l0 f17221w;
    public final /* synthetic */ a2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(a2 a2Var, String str, String str2, boolean z10, l0 l0Var) {
        super(a2Var, true);
        this.y = a2Var;
        this.n = str;
        this.f17219t = str2;
        this.f17220u = z10;
        this.f17221w = l0Var;
    }

    @Override // w9.u1
    public final void a() {
        p0 p0Var = this.y.f17064g;
        Objects.requireNonNull(p0Var, "null reference");
        p0Var.getUserProperties(this.n, this.f17219t, this.f17220u, this.f17221w);
    }

    @Override // w9.u1
    public final void b() {
        this.f17221w.m(null);
    }
}
