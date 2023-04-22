package e9;

import d9.a;
import d9.a.b;

/* loaded from: classes.dex */
public abstract class m<A extends a.b, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    public final c9.d[] f9221a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9222b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9223c;

    /* loaded from: classes.dex */
    public static class a<A extends a.b, ResultT> {

        /* renamed from: a  reason: collision with root package name */
        public l<A, ea.h<ResultT>> f9224a;

        /* renamed from: c  reason: collision with root package name */
        public c9.d[] f9226c;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9225b = true;
        public int d = 0;

        public m<A, ResultT> a() {
            h9.o.b(this.f9224a != null, "execute parameter required");
            return new q0(this, this.f9226c, this.f9225b, this.d);
        }
    }

    public m(c9.d[] dVarArr, boolean z10, int i10) {
        this.f9221a = dVarArr;
        this.f9222b = dVarArr != null && z10;
        this.f9223c = i10;
    }
}
