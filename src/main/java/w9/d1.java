package w9;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class d1 extends u1 {
    public final /* synthetic */ int n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f17100t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a2 f17101u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(a2 a2Var, String str, int i10) {
        super(a2Var, true);
        this.n = i10;
        this.f17101u = a2Var;
        this.f17100t = str;
    }

    @Override // w9.u1
    public final void a() {
        switch (this.n) {
            case 0:
                p0 p0Var = this.f17101u.f17064g;
                Objects.requireNonNull(p0Var, "null reference");
                p0Var.setUserId(this.f17100t, this.f17312c);
                return;
            default:
                p0 p0Var2 = this.f17101u.f17064g;
                Objects.requireNonNull(p0Var2, "null reference");
                p0Var2.endAdUnitExposure(this.f17100t, this.f17313f);
                return;
        }
    }
}
