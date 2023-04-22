package w9;

import android.app.Activity;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class h1 extends u1 {
    public final /* synthetic */ int n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f17171t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f17172u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(a2 a2Var, Object obj, int i10) {
        super(a2Var, true);
        this.n = i10;
        this.f17171t = a2Var;
        this.f17172u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(z1 z1Var, Activity activity) {
        super(z1Var.f17388c, true);
        this.n = 2;
        this.f17171t = z1Var;
        this.f17172u = activity;
    }

    @Override // w9.u1
    public final void a() {
        switch (this.n) {
            case 0:
                p0 p0Var = ((a2) this.f17171t).f17064g;
                Objects.requireNonNull(p0Var, "null reference");
                p0Var.beginAdUnitExposure((String) this.f17172u, this.f17313f);
                return;
            case 1:
                p0 p0Var2 = ((a2) this.f17171t).f17064g;
                Objects.requireNonNull(p0Var2, "null reference");
                p0Var2.getCurrentScreenClass((l0) this.f17172u);
                return;
            default:
                p0 p0Var3 = ((z1) this.f17171t).f17388c.f17064g;
                Objects.requireNonNull(p0Var3, "null reference");
                p0Var3.onActivityStopped(new n9.b((Activity) this.f17172u), this.f17313f);
                return;
        }
    }

    @Override // w9.u1
    public void b() {
        switch (this.n) {
            case 1:
                ((l0) this.f17172u).m(null);
                return;
            default:
                return;
        }
    }
}
