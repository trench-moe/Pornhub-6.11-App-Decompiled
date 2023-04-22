package i2;

import android.graphics.Path;
import b2.l;

/* loaded from: classes2.dex */
public class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10481a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f10482b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10483c;
    public final h2.a d;

    /* renamed from: e  reason: collision with root package name */
    public final h2.d f10484e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10485f;

    public h(String str, boolean z10, Path.FillType fillType, h2.a aVar, h2.d dVar, boolean z11) {
        this.f10483c = str;
        this.f10481a = z10;
        this.f10482b = fillType;
        this.d = aVar;
        this.f10484e = dVar;
        this.f10485f = z11;
    }

    @Override // i2.b
    public d2.c a(l lVar, com.airbnb.lottie.model.layer.a aVar) {
        return new d2.g(lVar, aVar, this);
    }

    public String toString() {
        return a0.a.l(a1.a.m("ShapeFill{color=, fillEnabled="), this.f10481a, '}');
    }
}
