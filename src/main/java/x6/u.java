package x6;

import k8.m;
import x6.c0;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements m.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18031c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c0.a f18032f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Exception f18033j;

    public /* synthetic */ u(c0.a aVar, Exception exc, int i10) {
        this.f18031c = i10;
        this.f18032f = aVar;
        this.f18033j = exc;
    }

    @Override // k8.m.a
    public final void invoke(Object obj) {
        switch (this.f18031c) {
            case 0:
                ((c0) obj).S(this.f18032f, this.f18033j);
                return;
            default:
                ((c0) obj).Z(this.f18032f, this.f18033j);
                return;
        }
    }
}
