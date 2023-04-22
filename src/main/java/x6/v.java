package x6;

import k8.m;
import x6.c0;

/* loaded from: classes3.dex */
public final /* synthetic */ class v implements m.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18034c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c0.a f18035f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f18036j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Object f18037m;

    public /* synthetic */ v(c0.a aVar, Object obj, Object obj2, int i10) {
        this.f18034c = i10;
        this.f18035f = aVar;
        this.f18036j = obj;
        this.f18037m = obj2;
    }

    @Override // k8.m.a
    public final void invoke(Object obj) {
        switch (this.f18034c) {
            case 0:
                c0.a aVar = this.f18035f;
                w6.y yVar = (w6.y) this.f18036j;
                c0 c0Var = (c0) obj;
                c0Var.K(aVar, yVar);
                c0Var.W(aVar, yVar, (z6.e) this.f18037m);
                c0Var.G(aVar, 2, yVar);
                return;
            default:
                ((c0) obj).v(this.f18035f, (w7.c) this.f18036j, (w7.d) this.f18037m);
                return;
        }
    }
}
