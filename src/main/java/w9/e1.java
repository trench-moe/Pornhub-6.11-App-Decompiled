package w9;

import android.app.Activity;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e1 extends u1 {
    public final /* synthetic */ Activity n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f17119t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f17120u;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ a2 f17121w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(a2 a2Var, Activity activity, String str, String str2) {
        super(a2Var, true);
        this.f17121w = a2Var;
        this.n = activity;
        this.f17119t = str;
        this.f17120u = str2;
    }

    @Override // w9.u1
    public final void a() {
        p0 p0Var = this.f17121w.f17064g;
        Objects.requireNonNull(p0Var, "null reference");
        p0Var.setCurrentScreen(new n9.b(this.n), this.f17119t, this.f17120u, this.f17312c);
    }
}
