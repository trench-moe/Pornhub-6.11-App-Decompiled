package w6;

import com.google.android.exoplayer2.source.i;
import com.google.common.collect.ImmutableList;
import java.util.Objects;
import l8.r;
import x6.b0;

/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f16592c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f16593f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f16594j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Object f16595m;

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, int i10) {
        this.f16592c = i10;
        this.f16593f = obj;
        this.f16594j = obj2;
        this.f16595m = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16592c) {
            case 0:
                i.a aVar = (i.a) this.f16595m;
                x6.b0 b0Var = ((h0) this.f16593f).f16598c;
                ImmutableList c10 = ((ImmutableList.a) this.f16594j).c();
                b0.a aVar2 = b0Var.f17958m;
                n0 n0Var = b0Var.f17960u;
                Objects.requireNonNull(n0Var);
                Objects.requireNonNull(aVar2);
                aVar2.f17963b = ImmutableList.r(c10);
                if (!c10.isEmpty()) {
                    aVar2.f17965e = (i.a) c10.get(0);
                    Objects.requireNonNull(aVar);
                    aVar2.f17966f = aVar;
                }
                if (aVar2.d == null) {
                    aVar2.d = b0.a.b(n0Var, aVar2.f17963b, aVar2.f17965e, aVar2.f17962a);
                }
                aVar2.d(n0Var.M());
                return;
            default:
                r.a aVar3 = (r.a) this.f16593f;
                y yVar = (y) this.f16594j;
                l8.r rVar = aVar3.f12741b;
                int i10 = k8.c0.f11939a;
                rVar.q(yVar);
                aVar3.f12741b.k(yVar, (z6.e) this.f16595m);
                return;
        }
    }
}
