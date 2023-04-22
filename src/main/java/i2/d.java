package i2;

import android.graphics.Path;
import b2.l;
import com.airbnb.lottie.model.content.GradientType;

/* loaded from: classes2.dex */
public class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final GradientType f10463a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f10464b;

    /* renamed from: c  reason: collision with root package name */
    public final h2.c f10465c;
    public final h2.d d;

    /* renamed from: e  reason: collision with root package name */
    public final h2.e f10466e;

    /* renamed from: f  reason: collision with root package name */
    public final h2.e f10467f;

    /* renamed from: g  reason: collision with root package name */
    public final String f10468g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10469h;

    public d(String str, GradientType gradientType, Path.FillType fillType, h2.c cVar, h2.d dVar, h2.e eVar, h2.e eVar2, h2.b bVar, h2.b bVar2, boolean z10) {
        this.f10463a = gradientType;
        this.f10464b = fillType;
        this.f10465c = cVar;
        this.d = dVar;
        this.f10466e = eVar;
        this.f10467f = eVar2;
        this.f10468g = str;
        this.f10469h = z10;
    }

    @Override // i2.b
    public d2.c a(l lVar, com.airbnb.lottie.model.layer.a aVar) {
        return new d2.h(lVar, aVar, this);
    }
}
