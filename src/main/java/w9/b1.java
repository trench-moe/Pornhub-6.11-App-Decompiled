package w9;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b1 extends u1 {
    public final /* synthetic */ String n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f17075t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Bundle f17076u;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ a2 f17077w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(a2 a2Var, String str, String str2, Bundle bundle) {
        super(a2Var, true);
        this.f17077w = a2Var;
        this.n = str;
        this.f17075t = str2;
        this.f17076u = bundle;
    }

    @Override // w9.u1
    public final void a() {
        p0 p0Var = this.f17077w.f17064g;
        Objects.requireNonNull(p0Var, "null reference");
        p0Var.clearConditionalUserProperty(this.n, this.f17075t, this.f17076u);
    }
}
