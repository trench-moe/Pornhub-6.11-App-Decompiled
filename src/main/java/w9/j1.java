package w9;

import android.app.Activity;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class j1 extends u1 {
    public final /* synthetic */ int n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f17202t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f17203u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(a2 a2Var, d0 d0Var, int i10) {
        super(a2Var, true);
        this.n = i10;
        this.f17202t = a2Var;
        this.f17203u = d0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(z1 z1Var, Activity activity) {
        super(z1Var.f17388c, true);
        this.n = 2;
        this.f17202t = z1Var;
        this.f17203u = activity;
    }

    @Override // w9.u1
    public final void a() {
        switch (this.n) {
            case 0:
                p0 p0Var = ((a2) this.f17202t).f17064g;
                Objects.requireNonNull(p0Var, "null reference");
                p0Var.generateEventId((l0) this.f17203u);
                return;
            case 1:
                p0 p0Var2 = ((a2) this.f17202t).f17064g;
                Objects.requireNonNull(p0Var2, "null reference");
                p0Var2.unregisterOnMeasurementEventListener((w1) this.f17203u);
                return;
            default:
                p0 p0Var3 = ((z1) this.f17202t).f17388c.f17064g;
                Objects.requireNonNull(p0Var3, "null reference");
                p0Var3.onActivityResumed(new n9.b((Activity) this.f17203u), this.f17313f);
                return;
        }
    }

    @Override // w9.u1
    public void b() {
        switch (this.n) {
            case 0:
                ((l0) this.f17203u).m(null);
                return;
            default:
                return;
        }
    }
}
