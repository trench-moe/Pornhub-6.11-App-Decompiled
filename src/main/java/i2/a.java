package i2;

import android.graphics.PointF;
import b2.l;

/* loaded from: classes2.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f10457a;

    /* renamed from: b  reason: collision with root package name */
    public final h2.j<PointF, PointF> f10458b;

    /* renamed from: c  reason: collision with root package name */
    public final h2.e f10459c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10460e;

    public a(String str, h2.j<PointF, PointF> jVar, h2.e eVar, boolean z10, boolean z11) {
        this.f10457a = str;
        this.f10458b = jVar;
        this.f10459c = eVar;
        this.d = z10;
        this.f10460e = z11;
    }

    @Override // i2.b
    public d2.c a(l lVar, com.airbnb.lottie.model.layer.a aVar) {
        return new d2.f(lVar, aVar, this);
    }
}
