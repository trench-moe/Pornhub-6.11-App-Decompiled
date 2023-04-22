package w9;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class t1 extends u1 {
    public final /* synthetic */ String n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f17305t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f17306u;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f17307w;
    public final /* synthetic */ a2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(a2 a2Var, String str, String str2, Object obj, boolean z10) {
        super(a2Var, true);
        this.y = a2Var;
        this.n = str;
        this.f17305t = str2;
        this.f17306u = obj;
        this.f17307w = z10;
    }

    @Override // w9.u1
    public final void a() {
        p0 p0Var = this.y.f17064g;
        Objects.requireNonNull(p0Var, "null reference");
        p0Var.setUserProperty(this.n, this.f17305t, new n9.b(this.f17306u), this.f17307w, this.f17312c);
    }
}
