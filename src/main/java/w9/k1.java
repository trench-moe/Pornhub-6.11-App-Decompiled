package w9;

import android.app.Activity;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class k1 extends u1 {
    public final /* synthetic */ int n = 0;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f17211t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f17212u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(a2 a2Var, l0 l0Var) {
        super(a2Var, true);
        this.f17212u = a2Var;
        this.f17211t = l0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(z1 z1Var, Activity activity) {
        super(z1Var.f17388c, true);
        this.f17212u = z1Var;
        this.f17211t = activity;
    }

    @Override // w9.u1
    public final void a() {
        switch (this.n) {
            case 0:
                p0 p0Var = ((a2) this.f17212u).f17064g;
                Objects.requireNonNull(p0Var, "null reference");
                p0Var.getCurrentScreenName((l0) this.f17211t);
                return;
            default:
                p0 p0Var2 = ((z1) this.f17212u).f17388c.f17064g;
                Objects.requireNonNull(p0Var2, "null reference");
                p0Var2.onActivityPaused(new n9.b((Activity) this.f17211t), this.f17313f);
                return;
        }
    }

    @Override // w9.u1
    public void b() {
        switch (this.n) {
            case 0:
                ((l0) this.f17211t).m(null);
                return;
            default:
                return;
        }
    }
}
