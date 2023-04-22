package w9;

import android.app.Activity;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class f1 extends u1 {
    public final /* synthetic */ int n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f17131t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f17132u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(a2 a2Var, Object obj, int i10) {
        super(a2Var, true);
        this.n = i10;
        this.f17131t = a2Var;
        this.f17132u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(z1 z1Var, Activity activity) {
        super(z1Var.f17388c, true);
        this.n = 3;
        this.f17131t = z1Var;
        this.f17132u = activity;
    }

    @Override // w9.u1
    public final void a() {
        switch (this.n) {
            case 0:
                if (((Boolean) this.f17132u) != null) {
                    p0 p0Var = ((a2) this.f17131t).f17064g;
                    Objects.requireNonNull(p0Var, "null reference");
                    p0Var.setMeasurementEnabled(((Boolean) this.f17132u).booleanValue(), this.f17312c);
                    return;
                }
                p0 p0Var2 = ((a2) this.f17131t).f17064g;
                Objects.requireNonNull(p0Var2, "null reference");
                p0Var2.clearMeasurementEnabled(this.f17312c);
                return;
            case 1:
                p0 p0Var3 = ((a2) this.f17131t).f17064g;
                Objects.requireNonNull(p0Var3, "null reference");
                p0Var3.getCachedAppInstanceId((l0) this.f17132u);
                return;
            case 2:
                p0 p0Var4 = ((a2) this.f17131t).f17064g;
                Objects.requireNonNull(p0Var4, "null reference");
                p0Var4.registerOnMeasurementEventListener((w1) this.f17132u);
                return;
            default:
                p0 p0Var5 = ((z1) this.f17131t).f17388c.f17064g;
                Objects.requireNonNull(p0Var5, "null reference");
                p0Var5.onActivityStarted(new n9.b((Activity) this.f17132u), this.f17313f);
                return;
        }
    }

    @Override // w9.u1
    public void b() {
        switch (this.n) {
            case 1:
                ((l0) this.f17132u).m(null);
                return;
            default:
                return;
        }
    }
}
