package w9;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class s1 extends u1 {
    public final /* synthetic */ a2 A;
    public final /* synthetic */ Long n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f17301t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f17302u;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Bundle f17303w;
    public final /* synthetic */ boolean y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f17304z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(a2 a2Var, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(a2Var, true);
        this.A = a2Var;
        this.n = l10;
        this.f17301t = str;
        this.f17302u = str2;
        this.f17303w = bundle;
        this.y = z10;
        this.f17304z = z11;
    }

    @Override // w9.u1
    public final void a() {
        Long l10 = this.n;
        long longValue = l10 == null ? this.f17312c : l10.longValue();
        p0 p0Var = this.A.f17064g;
        Objects.requireNonNull(p0Var, "null reference");
        p0Var.logEvent(this.f17301t, this.f17302u, this.f17303w, this.y, this.f17304z, longValue);
    }
}
