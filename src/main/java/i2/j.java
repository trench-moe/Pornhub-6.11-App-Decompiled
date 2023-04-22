package i2;

import b2.l;
import d2.q;

/* loaded from: classes2.dex */
public class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f10489a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10490b;

    /* renamed from: c  reason: collision with root package name */
    public final h2.a f10491c;
    public final boolean d;

    public j(String str, int i10, h2.a aVar, boolean z10) {
        this.f10489a = str;
        this.f10490b = i10;
        this.f10491c = aVar;
        this.d = z10;
    }

    @Override // i2.b
    public d2.c a(l lVar, com.airbnb.lottie.model.layer.a aVar) {
        return new q(lVar, aVar, this);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("ShapePath{name=");
        m10.append(this.f10489a);
        m10.append(", index=");
        return android.support.v4.media.a.i(m10, this.f10490b, '}');
    }
}
