package w9;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class n1 extends u1 {
    public final /* synthetic */ Bundle n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ l0 f17244t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a2 f17245u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(a2 a2Var, Bundle bundle, l0 l0Var) {
        super(a2Var, true);
        this.f17245u = a2Var;
        this.n = bundle;
        this.f17244t = l0Var;
    }

    @Override // w9.u1
    public final void a() {
        p0 p0Var = this.f17245u.f17064g;
        Objects.requireNonNull(p0Var, "null reference");
        p0Var.performAction(this.n, this.f17244t, this.f17312c);
    }

    @Override // w9.u1
    public final void b() {
        this.f17244t.m(null);
    }
}
