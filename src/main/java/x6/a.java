package x6;

import k8.m;
import w6.l0;
import w6.n0;
import x6.c0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements m.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17947c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17948f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f17949j;

    public /* synthetic */ a(Object obj, int i10, int i11) {
        this.f17947c = i11;
        this.f17948f = obj;
        this.f17949j = i10;
    }

    @Override // k8.m.a
    public final void invoke(Object obj) {
        switch (this.f17947c) {
            case 0:
                ((c0) obj).J((c0.a) this.f17948f, this.f17949j);
                return;
            case 1:
                c0.a aVar = (c0.a) this.f17948f;
                int i10 = this.f17949j;
                c0 c0Var = (c0) obj;
                c0Var.b(aVar);
                c0Var.f0(aVar, i10);
                return;
            case 2:
                ((c0) obj).e((c0.a) this.f17948f, this.f17949j);
                return;
            default:
                ((n0.c) obj).e(((l0) this.f17948f).f16659a, this.f17949j);
                return;
        }
    }
}
