package w9;

import android.app.Activity;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class i1 extends u1 {
    public final /* synthetic */ int n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f17189t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f17190u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(a2 a2Var, d0 d0Var, int i10) {
        super(a2Var, true);
        this.n = i10;
        this.f17189t = a2Var;
        this.f17190u = d0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(z1 z1Var, Activity activity) {
        super(z1Var.f17388c, true);
        this.n = 2;
        this.f17189t = z1Var;
        this.f17190u = activity;
    }

    @Override // w9.u1
    public final void a() {
        switch (this.n) {
            case 0:
                p0 p0Var = ((a2) this.f17189t).f17064g;
                Objects.requireNonNull(p0Var, "null reference");
                p0Var.getGmpAppId((l0) this.f17190u);
                return;
            case 1:
                p0 p0Var2 = ((a2) this.f17189t).f17064g;
                Objects.requireNonNull(p0Var2, "null reference");
                p0Var2.setEventInterceptor((v1) this.f17190u);
                return;
            default:
                p0 p0Var3 = ((z1) this.f17189t).f17388c.f17064g;
                Objects.requireNonNull(p0Var3, "null reference");
                p0Var3.onActivityDestroyed(new n9.b((Activity) this.f17190u), this.f17313f);
                return;
        }
    }

    @Override // w9.u1
    public void b() {
        switch (this.n) {
            case 0:
                ((l0) this.f17190u).m(null);
                return;
            default:
                return;
        }
    }
}
