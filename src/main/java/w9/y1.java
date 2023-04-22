package w9;

import android.app.Activity;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class y1 extends u1 {
    public final /* synthetic */ Activity n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ l0 f17379t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ z1 f17380u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var, Activity activity, l0 l0Var) {
        super(z1Var.f17388c, true);
        this.f17380u = z1Var;
        this.n = activity;
        this.f17379t = l0Var;
    }

    @Override // w9.u1
    public final void a() {
        p0 p0Var = this.f17380u.f17388c.f17064g;
        Objects.requireNonNull(p0Var, "null reference");
        p0Var.onActivitySaveInstanceState(new n9.b(this.n), this.f17379t, this.f17313f);
    }
}
