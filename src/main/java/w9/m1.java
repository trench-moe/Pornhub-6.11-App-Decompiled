package w9;

import android.app.Activity;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class m1 extends u1 {
    public final /* synthetic */ int n = 0;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f17236t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f17237u;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f17238w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(a2 a2Var, String str, Object obj) {
        super(a2Var, false);
        this.f17238w = a2Var;
        this.f17236t = str;
        this.f17237u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(z1 z1Var, Bundle bundle, Activity activity) {
        super(z1Var.f17388c, true);
        this.f17238w = z1Var;
        this.f17236t = bundle;
        this.f17237u = activity;
    }

    @Override // w9.u1
    public final void a() {
        Bundle bundle = null;
        switch (this.n) {
            case 0:
                p0 p0Var = ((a2) this.f17238w).f17064g;
                Objects.requireNonNull(p0Var, "null reference");
                p0Var.logHealthData(5, (String) this.f17236t, new n9.b(this.f17237u), new n9.b(null), new n9.b(null));
                return;
            default:
                if (((Bundle) this.f17236t) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.f17236t).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.f17236t).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                p0 p0Var2 = ((z1) this.f17238w).f17388c.f17064g;
                Objects.requireNonNull(p0Var2, "null reference");
                p0Var2.onActivityCreated(new n9.b((Activity) this.f17237u), bundle, this.f17313f);
                return;
        }
    }
}
