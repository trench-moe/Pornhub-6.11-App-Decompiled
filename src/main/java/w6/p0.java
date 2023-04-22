package w6;

import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class p0 extends a {

    /* renamed from: e  reason: collision with root package name */
    public final int f16705e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16706f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f16707g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f16708h;

    /* renamed from: i  reason: collision with root package name */
    public final x0[] f16709i;

    /* renamed from: j  reason: collision with root package name */
    public final Object[] f16710j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap<Object, Integer> f16711k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Collection<? extends i0> collection, w7.k kVar) {
        super(false, kVar);
        int i10 = 0;
        int size = collection.size();
        this.f16707g = new int[size];
        this.f16708h = new int[size];
        this.f16709i = new x0[size];
        this.f16710j = new Object[size];
        this.f16711k = new HashMap<>();
        int i11 = 0;
        int i12 = 0;
        for (i0 i0Var : collection) {
            this.f16709i[i12] = i0Var.b();
            this.f16708h[i12] = i10;
            this.f16707g[i12] = i11;
            i10 += this.f16709i[i12].p();
            i11 += this.f16709i[i12].i();
            this.f16710j[i12] = i0Var.a();
            this.f16711k.put(this.f16710j[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f16705e = i10;
        this.f16706f = i11;
    }

    @Override // w6.x0
    public int i() {
        return this.f16706f;
    }

    @Override // w6.x0
    public int p() {
        return this.f16705e;
    }
}
