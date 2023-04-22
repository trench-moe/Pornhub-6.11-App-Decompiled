package i2;

import android.graphics.PointF;
import b2.l;
import d2.o;

/* loaded from: classes2.dex */
public class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f10470a;

    /* renamed from: b  reason: collision with root package name */
    public final h2.j<PointF, PointF> f10471b;

    /* renamed from: c  reason: collision with root package name */
    public final h2.j<PointF, PointF> f10472c;
    public final h2.b d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10473e;

    public e(String str, h2.j<PointF, PointF> jVar, h2.j<PointF, PointF> jVar2, h2.b bVar, boolean z10) {
        this.f10470a = str;
        this.f10471b = jVar;
        this.f10472c = jVar2;
        this.d = bVar;
        this.f10473e = z10;
    }

    @Override // i2.b
    public d2.c a(l lVar, com.airbnb.lottie.model.layer.a aVar) {
        return new o(lVar, aVar, this);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("RectangleShape{position=");
        m10.append(this.f10471b);
        m10.append(", size=");
        m10.append(this.f10472c);
        m10.append('}');
        return m10.toString();
    }
}
