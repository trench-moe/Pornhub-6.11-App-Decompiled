package w7;

import android.net.Uri;
import java.util.Objects;
import w6.c0;
import w6.x0;

/* loaded from: classes2.dex */
public final class l extends x0 {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f16932g = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final long f16933b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16934c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final c0 f16935e;

    /* renamed from: f  reason: collision with root package name */
    public final c0.f f16936f;

    static {
        c0.c cVar = new c0.c();
        cVar.f16458a = "SinglePeriodTimeline";
        cVar.f16459b = Uri.EMPTY;
        cVar.a();
    }

    public l(long j10, boolean z10, boolean z11, boolean z12, Object obj, c0 c0Var) {
        c0.f fVar = z12 ? c0Var.f16454c : null;
        this.f16933b = j10;
        this.f16934c = j10;
        this.d = z10;
        Objects.requireNonNull(c0Var);
        this.f16935e = c0Var;
        this.f16936f = fVar;
    }

    @Override // w6.x0
    public int b(Object obj) {
        return f16932g.equals(obj) ? 0 : -1;
    }

    @Override // w6.x0
    public x0.b g(int i10, x0.b bVar, boolean z10) {
        k8.a.e(i10, 0, 1);
        Object obj = z10 ? f16932g : null;
        long j10 = this.f16933b;
        Objects.requireNonNull(bVar);
        bVar.f(null, obj, 0, j10, 0L, x7.a.f18048g, false);
        return bVar;
    }

    @Override // w6.x0
    public int i() {
        return 1;
    }

    @Override // w6.x0
    public Object m(int i10) {
        k8.a.e(i10, 0, 1);
        return f16932g;
    }

    @Override // w6.x0
    public x0.c o(int i10, x0.c cVar, long j10) {
        k8.a.e(i10, 0, 1);
        cVar.d(x0.c.f16845r, this.f16935e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.d, false, this.f16936f, 0L, this.f16934c, 0, 0, 0L);
        return cVar;
    }

    @Override // w6.x0
    public int p() {
        return 1;
    }
}
