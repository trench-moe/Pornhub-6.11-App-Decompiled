package i2;

import b2.l;
import d2.p;

/* loaded from: classes2.dex */
public class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f10474a;

    /* renamed from: b  reason: collision with root package name */
    public final h2.b f10475b;

    /* renamed from: c  reason: collision with root package name */
    public final h2.b f10476c;
    public final h2.i d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10477e;

    public f(String str, h2.b bVar, h2.b bVar2, h2.i iVar, boolean z10) {
        this.f10474a = str;
        this.f10475b = bVar;
        this.f10476c = bVar2;
        this.d = iVar;
        this.f10477e = z10;
    }

    @Override // i2.b
    public d2.c a(l lVar, com.airbnb.lottie.model.layer.a aVar) {
        return new p(lVar, aVar, this);
    }
}
