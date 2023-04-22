package e2;

import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes.dex */
public class l extends a<PointF, PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f9017i;

    /* renamed from: j  reason: collision with root package name */
    public final PointF f9018j;

    /* renamed from: k  reason: collision with root package name */
    public final a<Float, Float> f9019k;

    /* renamed from: l  reason: collision with root package name */
    public final a<Float, Float> f9020l;

    /* renamed from: m  reason: collision with root package name */
    public n2.c f9021m;
    public n2.c n;

    public l(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f9017i = new PointF();
        this.f9018j = new PointF();
        this.f9019k = aVar;
        this.f9020l = aVar2;
        i(this.d);
    }

    @Override // e2.a
    public PointF e() {
        return k(0.0f);
    }

    @Override // e2.a
    public /* bridge */ /* synthetic */ PointF f(n2.a<PointF> aVar, float f10) {
        return k(f10);
    }

    @Override // e2.a
    public void i(float f10) {
        this.f9019k.i(f10);
        this.f9020l.i(f10);
        this.f9017i.set(this.f9019k.e().floatValue(), this.f9020l.e().floatValue());
        for (int i10 = 0; i10 < this.f8994a.size(); i10++) {
            this.f8994a.get(i10).a();
        }
    }

    public PointF k(float f10) {
        Float f11;
        n2.a<Float> a10;
        n2.a<Float> a11;
        Float f12 = null;
        if (this.f9021m == null || (a11 = this.f9019k.a()) == null) {
            f11 = null;
        } else {
            float c10 = this.f9019k.c();
            Float f13 = a11.f13265h;
            n2.c cVar = this.f9021m;
            float f14 = a11.f13264g;
            f11 = (Float) cVar.a(f14, f13 == null ? f14 : f13.floatValue(), a11.f13260b, a11.f13261c, f10, f10, c10);
        }
        if (this.n != null && (a10 = this.f9020l.a()) != null) {
            float c11 = this.f9020l.c();
            Float f15 = a10.f13265h;
            n2.c cVar2 = this.n;
            float f16 = a10.f13264g;
            f12 = (Float) cVar2.a(f16, f15 == null ? f16 : f15.floatValue(), a10.f13260b, a10.f13261c, f10, f10, c11);
        }
        if (f11 == null) {
            this.f9018j.set(this.f9017i.x, 0.0f);
        } else {
            this.f9018j.set(f11.floatValue(), 0.0f);
        }
        if (f12 == null) {
            PointF pointF = this.f9018j;
            pointF.set(pointF.x, this.f9017i.y);
        } else {
            PointF pointF2 = this.f9018j;
            pointF2.set(pointF2.x, f12.floatValue());
        }
        return this.f9018j;
    }
}
