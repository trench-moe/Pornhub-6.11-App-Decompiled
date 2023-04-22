package w9;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class r1 extends u1 {
    public final /* synthetic */ boolean n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ a2 f17293t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(a2 a2Var, boolean z10) {
        super(a2Var, true);
        this.f17293t = a2Var;
        this.n = z10;
    }

    @Override // w9.u1
    public final void a() {
        p0 p0Var = this.f17293t.f17064g;
        Objects.requireNonNull(p0Var, "null reference");
        p0Var.setDataCollectionEnabled(this.n);
    }
}
