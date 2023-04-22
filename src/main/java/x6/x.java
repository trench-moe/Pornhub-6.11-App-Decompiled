package x6;

import k8.m;
import x6.c0;

/* loaded from: classes3.dex */
public final /* synthetic */ class x implements m.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18041c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c0.a f18042f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f18043j;

    public /* synthetic */ x(c0.a aVar, boolean z10, int i10) {
        this.f18041c = i10;
        this.f18042f = aVar;
        this.f18043j = z10;
    }

    @Override // k8.m.a
    public final void invoke(Object obj) {
        switch (this.f18041c) {
            case 0:
                ((c0) obj).F(this.f18042f, this.f18043j);
                return;
            default:
                ((c0) obj).X(this.f18042f, this.f18043j);
                return;
        }
    }
}
