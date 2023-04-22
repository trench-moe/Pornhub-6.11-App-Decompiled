package d2;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import e2.a;
import java.util.List;

/* loaded from: classes.dex */
public class n implements m, a.b, k {

    /* renamed from: b  reason: collision with root package name */
    public final String f8703b;

    /* renamed from: c  reason: collision with root package name */
    public final b2.l f8704c;
    public final PolystarShape.Type d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8705e;

    /* renamed from: f  reason: collision with root package name */
    public final e2.a<?, Float> f8706f;

    /* renamed from: g  reason: collision with root package name */
    public final e2.a<?, PointF> f8707g;

    /* renamed from: h  reason: collision with root package name */
    public final e2.a<?, Float> f8708h;

    /* renamed from: i  reason: collision with root package name */
    public final e2.a<?, Float> f8709i;

    /* renamed from: j  reason: collision with root package name */
    public final e2.a<?, Float> f8710j;

    /* renamed from: k  reason: collision with root package name */
    public final e2.a<?, Float> f8711k;

    /* renamed from: l  reason: collision with root package name */
    public final e2.a<?, Float> f8712l;
    public boolean n;

    /* renamed from: a  reason: collision with root package name */
    public final Path f8702a = new Path();

    /* renamed from: m  reason: collision with root package name */
    public b f8713m = new b();

    public n(b2.l lVar, com.airbnb.lottie.model.layer.a aVar, PolystarShape polystarShape) {
        this.f8704c = lVar;
        this.f8703b = polystarShape.f4147a;
        PolystarShape.Type type = polystarShape.f4148b;
        this.d = type;
        this.f8705e = polystarShape.f4155j;
        e2.a<Float, Float> a10 = polystarShape.f4149c.a();
        this.f8706f = a10;
        e2.a<PointF, PointF> a11 = polystarShape.d.a();
        this.f8707g = a11;
        e2.a<Float, Float> a12 = polystarShape.f4150e.a();
        this.f8708h = a12;
        e2.a<Float, Float> a13 = polystarShape.f4152g.a();
        this.f8710j = a13;
        e2.a<Float, Float> a14 = polystarShape.f4154i.a();
        this.f8712l = a14;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.f8709i = polystarShape.f4151f.a();
            this.f8711k = polystarShape.f4153h.a();
        } else {
            this.f8709i = null;
            this.f8711k = null;
        }
        aVar.e(a10);
        aVar.e(a11);
        aVar.e(a12);
        aVar.e(a13);
        aVar.e(a14);
        if (type == type2) {
            aVar.e(this.f8709i);
            aVar.e(this.f8711k);
        }
        a10.f8994a.add(this);
        a11.f8994a.add(this);
        a12.f8994a.add(this);
        a13.f8994a.add(this);
        a14.f8994a.add(this);
        if (type == type2) {
            this.f8709i.f8994a.add(this);
            this.f8711k.f8994a.add(this);
        }
    }

    @Override // e2.a.b
    public void a() {
        this.n = false;
        this.f8704c.invalidateSelf();
    }

    @Override // d2.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.f8744c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f8713m.f8645a.add(sVar);
                    sVar.f8743b.add(this);
                }
            }
        }
    }

    @Override // g2.e
    public void c(g2.d dVar, int i10, List<g2.d> list, g2.d dVar2) {
        m2.f.f(dVar, i10, list, dVar2, this);
    }

    @Override // d2.m
    public Path g() {
        e2.a<?, Float> aVar;
        float f10;
        float f11;
        float sin;
        double d;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        double d10;
        float f18;
        float f19;
        e2.a<?, Float> aVar2;
        double d11;
        double d12;
        double d13;
        if (this.n) {
            return this.f8702a;
        }
        this.f8702a.reset();
        if (this.f8705e) {
            this.n = true;
            return this.f8702a;
        }
        int ordinal = this.d.ordinal();
        if (ordinal == 0) {
            float floatValue = this.f8706f.e().floatValue();
            double radians = Math.toRadians((this.f8708h != null ? aVar.e().floatValue() : 0.0d) - 90.0d);
            double d14 = floatValue;
            float f20 = (float) (6.283185307179586d / d14);
            float f21 = f20 / 2.0f;
            float f22 = floatValue - ((int) floatValue);
            int i10 = (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1));
            if (i10 != 0) {
                radians += (1.0f - f22) * f21;
            }
            float floatValue2 = this.f8710j.e().floatValue();
            float floatValue3 = this.f8709i.e().floatValue();
            e2.a<?, Float> aVar3 = this.f8711k;
            float floatValue4 = aVar3 != null ? aVar3.e().floatValue() / 100.0f : 0.0f;
            e2.a<?, Float> aVar4 = this.f8712l;
            float floatValue5 = aVar4 != null ? aVar4.e().floatValue() / 100.0f : 0.0f;
            if (i10 != 0) {
                f13 = a0.a.b(floatValue2, floatValue3, f22, floatValue3);
                double d15 = f13;
                f10 = floatValue3;
                f11 = floatValue4;
                f12 = (float) (Math.cos(radians) * d15);
                sin = (float) (d15 * Math.sin(radians));
                this.f8702a.moveTo(f12, sin);
                d = radians + ((f20 * f22) / 2.0f);
            } else {
                f10 = floatValue3;
                f11 = floatValue4;
                double d16 = floatValue2;
                float cos = (float) (Math.cos(radians) * d16);
                sin = (float) (Math.sin(radians) * d16);
                this.f8702a.moveTo(cos, sin);
                d = radians + f21;
                f12 = cos;
                f13 = 0.0f;
            }
            double ceil = Math.ceil(d14) * 2.0d;
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                double d17 = i11;
                if (d17 >= ceil) {
                    break;
                }
                float f23 = z10 ? floatValue2 : f10;
                int i12 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
                if (i12 == 0 || d17 != ceil - 2.0d) {
                    f14 = f20;
                    f15 = f21;
                } else {
                    f14 = f20;
                    f15 = (f20 * f22) / 2.0f;
                }
                if (i12 == 0 || d17 != ceil - 1.0d) {
                    f16 = f13;
                    f13 = f23;
                    f17 = f15;
                } else {
                    f17 = f15;
                    f16 = f13;
                }
                double d18 = f13;
                float cos2 = (float) (Math.cos(d) * d18);
                float sin2 = (float) (d18 * Math.sin(d));
                if (f11 == 0.0f && floatValue5 == 0.0f) {
                    this.f8702a.lineTo(cos2, sin2);
                    f18 = sin2;
                    d10 = d;
                    f19 = floatValue5;
                } else {
                    d10 = d;
                    float f24 = sin;
                    double atan2 = (float) (Math.atan2(sin, f12) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f18 = sin2;
                    f19 = floatValue5;
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f25 = z10 ? f11 : f19;
                    float f26 = z10 ? f19 : f11;
                    float f27 = (z10 ? f10 : floatValue2) * f25 * 0.47829f;
                    float f28 = cos3 * f27;
                    float f29 = f27 * sin3;
                    float f30 = (z10 ? floatValue2 : f10) * f26 * 0.47829f;
                    float f31 = cos4 * f30;
                    float f32 = f30 * sin4;
                    if (i10 != 0) {
                        if (i11 == 0) {
                            f28 *= f22;
                            f29 *= f22;
                        } else if (d17 == ceil - 1.0d) {
                            f31 *= f22;
                            f32 *= f22;
                        }
                    }
                    this.f8702a.cubicTo(f12 - f28, f24 - f29, cos2 + f31, f18 + f32, cos2, f18);
                }
                d = d10 + f17;
                z10 = !z10;
                i11++;
                f12 = cos2;
                f13 = f16;
                f20 = f14;
                sin = f18;
                floatValue5 = f19;
            }
            PointF e10 = this.f8707g.e();
            this.f8702a.offset(e10.x, e10.y);
            this.f8702a.close();
        } else if (ordinal == 1) {
            int floor = (int) Math.floor(this.f8706f.e().floatValue());
            double radians2 = Math.toRadians((this.f8708h != null ? aVar2.e().floatValue() : 0.0d) - 90.0d);
            double d19 = floor;
            float floatValue6 = this.f8712l.e().floatValue() / 100.0f;
            float floatValue7 = this.f8710j.e().floatValue();
            double d20 = floatValue7;
            float cos5 = (float) (Math.cos(radians2) * d20);
            float sin5 = (float) (Math.sin(radians2) * d20);
            this.f8702a.moveTo(cos5, sin5);
            double d21 = (float) (6.283185307179586d / d19);
            double d22 = radians2 + d21;
            double ceil2 = Math.ceil(d19);
            int i13 = 0;
            while (i13 < ceil2) {
                float cos6 = (float) (Math.cos(d22) * d20);
                double d23 = ceil2;
                float sin6 = (float) (Math.sin(d22) * d20);
                if (floatValue6 != 0.0f) {
                    d12 = d20;
                    d11 = d22;
                    double atan23 = (float) (Math.atan2(sin5, cos5) - 1.5707963267948966d);
                    float cos7 = (float) Math.cos(atan23);
                    d13 = d21;
                    double atan24 = (float) (Math.atan2(sin6, cos6) - 1.5707963267948966d);
                    float f33 = floatValue7 * floatValue6 * 0.25f;
                    this.f8702a.cubicTo(cos5 - (cos7 * f33), sin5 - (((float) Math.sin(atan23)) * f33), cos6 + (((float) Math.cos(atan24)) * f33), sin6 + (f33 * ((float) Math.sin(atan24))), cos6, sin6);
                } else {
                    d11 = d22;
                    d12 = d20;
                    d13 = d21;
                    this.f8702a.lineTo(cos6, sin6);
                }
                d22 = d11 + d13;
                i13++;
                sin5 = sin6;
                cos5 = cos6;
                ceil2 = d23;
                d20 = d12;
                d21 = d13;
            }
            PointF e11 = this.f8707g.e();
            this.f8702a.offset(e11.x, e11.y);
            this.f8702a.close();
        }
        this.f8702a.close();
        this.f8713m.c(this.f8702a);
        this.n = true;
        return this.f8702a;
    }

    @Override // d2.c
    public String getName() {
        return this.f8703b;
    }

    @Override // g2.e
    public <T> void h(T t2, n2.c cVar) {
        e2.a<?, Float> aVar;
        e2.a<?, Float> aVar2;
        if (t2 == b2.q.f3535u) {
            this.f8706f.j(cVar);
        } else if (t2 == b2.q.f3536v) {
            this.f8708h.j(cVar);
        } else if (t2 == b2.q.f3527l) {
            this.f8707g.j(cVar);
        } else if (t2 == b2.q.f3537w && (aVar2 = this.f8709i) != null) {
            aVar2.j(cVar);
        } else if (t2 == b2.q.f3538x) {
            this.f8710j.j(cVar);
        } else if (t2 == b2.q.y && (aVar = this.f8711k) != null) {
            aVar.j(cVar);
        } else {
            if (t2 == b2.q.f3539z) {
                this.f8712l.j(cVar);
            }
        }
    }
}
