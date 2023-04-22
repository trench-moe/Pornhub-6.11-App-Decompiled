package w9;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a1 extends u1 {
    public final /* synthetic */ int n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Bundle f17056t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a2 f17057u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(a2 a2Var, Bundle bundle, int i10) {
        super(a2Var, true);
        this.n = i10;
        this.f17057u = a2Var;
        this.f17056t = bundle;
    }

    @Override // w9.u1
    public final void a() {
        switch (this.n) {
            case 0:
                p0 p0Var = this.f17057u.f17064g;
                Objects.requireNonNull(p0Var, "null reference");
                p0Var.setConditionalUserProperty(this.f17056t, this.f17312c);
                return;
            default:
                p0 p0Var2 = this.f17057u.f17064g;
                Objects.requireNonNull(p0Var2, "null reference");
                p0Var2.setConsent(this.f17056t, this.f17312c);
                return;
        }
    }
}
