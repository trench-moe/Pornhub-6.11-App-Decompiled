package r6;

import k8.m;
import l6.q;
import t6.a;
import x6.c0;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements a.InterfaceC0268a, m.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14697c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f14698f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f14699j;

    public /* synthetic */ g(Object obj, Object obj2, int i10) {
        this.f14698f = obj;
        this.f14699j = obj2;
        this.f14697c = i10;
    }

    @Override // t6.a.InterfaceC0268a
    public Object e() {
        int i10 = this.f14697c;
        ((i) this.f14698f).d.b((q) this.f14699j, i10 + 1);
        return null;
    }

    @Override // k8.m.a
    public void invoke(Object obj) {
        ((c0) obj).M((c0.a) this.f14698f, (w6.c0) this.f14699j, this.f14697c);
    }
}
