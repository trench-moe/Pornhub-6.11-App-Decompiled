package x6;

import k8.m;
import x6.c0;

/* loaded from: classes3.dex */
public final /* synthetic */ class w implements m.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18038c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c0.a f18039f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f18040j;

    public /* synthetic */ w(c0.a aVar, String str, int i10) {
        this.f18038c = i10;
        this.f18039f = aVar;
        this.f18040j = str;
    }

    @Override // k8.m.a
    public final void invoke(Object obj) {
        switch (this.f18038c) {
            case 0:
                ((c0) obj).k0(this.f18039f, this.f18040j);
                return;
            default:
                ((c0) obj).i0(this.f18039f, this.f18040j);
                return;
        }
    }
}
