package x6;

import k8.m;
import x6.c0;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements m.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18007c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c0.a f18008f;

    public /* synthetic */ l(c0.a aVar, int i10) {
        this.f18007c = i10;
        this.f18008f = aVar;
    }

    @Override // k8.m.a
    public final void invoke(Object obj) {
        switch (this.f18007c) {
            case 0:
                ((c0) obj).E(this.f18008f);
                return;
            default:
                ((c0) obj).b0(this.f18008f);
                return;
        }
    }
}
