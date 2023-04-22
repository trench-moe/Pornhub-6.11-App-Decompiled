package x6;

import k8.m;
import x6.c0;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements m.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18029c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c0.a f18030f;

    public /* synthetic */ t(c0.a aVar, int i10) {
        this.f18029c = i10;
        this.f18030f = aVar;
    }

    @Override // k8.m.a
    public final void invoke(Object obj) {
        switch (this.f18029c) {
            case 0:
                ((c0) obj).e0(this.f18030f);
                return;
            case 1:
                ((c0) obj).p0(this.f18030f);
                return;
            default:
                ((c0) obj).y(this.f18030f);
                return;
        }
    }
}
