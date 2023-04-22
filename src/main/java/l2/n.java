package l2;

import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: b  reason: collision with root package name */
    public static p.h<WeakReference<Interpolator>> f12201b;

    /* renamed from: a  reason: collision with root package name */
    public static final Interpolator f12200a = new LinearInterpolator();

    /* renamed from: c  reason: collision with root package name */
    public static JsonReader.a f12202c = JsonReader.a.a("t", "s", "e", "o", "i", "h", "to", "ti");
    public static JsonReader.a d = JsonReader.a.a("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        Interpolator interpolator;
        WeakReference<Interpolator> f10;
        pointF.x = m2.f.b(pointF.x, -1.0f, 1.0f);
        pointF.y = m2.f.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = m2.f.b(pointF2.x, -1.0f, 1.0f);
        float b10 = m2.f.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        float f11 = pointF.x;
        float f12 = pointF.y;
        float f13 = pointF2.x;
        ThreadLocal<PathMeasure> threadLocal = m2.g.f12877a;
        int i10 = f11 != 0.0f ? (int) (527 * f11) : 17;
        if (f12 != 0.0f) {
            i10 = (int) (i10 * 31 * f12);
        }
        if (f13 != 0.0f) {
            i10 = (int) (i10 * 31 * f13);
        }
        if (b10 != 0.0f) {
            i10 = (int) (i10 * 31 * b10);
        }
        synchronized (n.class) {
            if (f12201b == null) {
                f12201b = new p.h<>();
            }
            interpolator = null;
            f10 = f12201b.f(i10, null);
        }
        if (f10 != null) {
            interpolator = f10.get();
        }
        if (f10 == null || interpolator == null) {
            try {
                interpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e10) {
                interpolator = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            try {
                WeakReference<Interpolator> weakReference = new WeakReference<>(interpolator);
                synchronized (n.class) {
                    f12201b.i(i10, weakReference);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return interpolator;
        }
        return interpolator;
    }

    public static <T> n2.a<T> b(JsonReader jsonReader, b2.f fVar, float f10, d0<T> d0Var, boolean z10, boolean z11) {
        Interpolator a10;
        T t2;
        Interpolator interpolator;
        Interpolator a11;
        T t8;
        Interpolator interpolator2;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        T t10;
        PointF pointF4;
        T t11;
        if (!z10 || !z11) {
            if (z10) {
                jsonReader.c();
                PointF pointF5 = null;
                PointF pointF6 = null;
                PointF pointF7 = null;
                PointF pointF8 = null;
                T t12 = null;
                boolean z12 = false;
                float f11 = 0.0f;
                T t13 = null;
                while (jsonReader.h()) {
                    switch (jsonReader.w(f12202c)) {
                        case 0:
                            f11 = (float) jsonReader.k();
                            break;
                        case 1:
                            t12 = d0Var.j(jsonReader, f10);
                            break;
                        case 2:
                            t13 = d0Var.j(jsonReader, f10);
                            break;
                        case 3:
                            pointF8 = m.b(jsonReader, 1.0f);
                            break;
                        case 4:
                            pointF5 = m.b(jsonReader, 1.0f);
                            break;
                        case 5:
                            if (jsonReader.m() != 1) {
                                z12 = false;
                                break;
                            } else {
                                z12 = true;
                                break;
                            }
                        case 6:
                            pointF6 = m.b(jsonReader, f10);
                            break;
                        case 7:
                            pointF7 = m.b(jsonReader, f10);
                            break;
                        default:
                            jsonReader.F();
                            break;
                    }
                }
                jsonReader.e();
                if (z12) {
                    a10 = f12200a;
                    t2 = t12;
                } else {
                    a10 = (pointF8 == null || pointF5 == null) ? f12200a : a(pointF8, pointF5);
                    t2 = t13;
                }
                n2.a<T> aVar = new n2.a<>(fVar, t12, t2, a10, f11, null);
                aVar.f13271o = pointF6;
                aVar.f13272p = pointF7;
                return aVar;
            }
            return new n2.a<>(d0Var.j(jsonReader, f10));
        }
        JsonReader.Token token = JsonReader.Token.BEGIN_OBJECT;
        JsonReader.Token token2 = JsonReader.Token.NUMBER;
        jsonReader.c();
        PointF pointF9 = null;
        PointF pointF10 = null;
        PointF pointF11 = null;
        PointF pointF12 = null;
        boolean z13 = false;
        PointF pointF13 = null;
        PointF pointF14 = null;
        PointF pointF15 = null;
        T t14 = null;
        PointF pointF16 = null;
        T t15 = null;
        float f12 = 0.0f;
        while (jsonReader.h()) {
            switch (jsonReader.w(f12202c)) {
                case 0:
                    pointF = pointF11;
                    pointF2 = pointF12;
                    pointF3 = pointF15;
                    t14 = t14;
                    f12 = (float) jsonReader.k();
                    pointF15 = pointF3;
                    break;
                case 1:
                    pointF = pointF11;
                    pointF2 = pointF12;
                    t14 = d0Var.j(jsonReader, f10);
                    break;
                case 2:
                    pointF = pointF11;
                    pointF2 = pointF12;
                    t15 = d0Var.j(jsonReader, f10);
                    break;
                case 3:
                    pointF = pointF11;
                    pointF2 = pointF12;
                    pointF3 = pointF15;
                    T t16 = t14;
                    if (jsonReader.t() != token) {
                        t14 = t16;
                        pointF13 = m.b(jsonReader, f10);
                        pointF15 = pointF3;
                        break;
                    } else {
                        jsonReader.c();
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        float f15 = 0.0f;
                        float f16 = 0.0f;
                        while (jsonReader.h()) {
                            int w10 = jsonReader.w(d);
                            if (w10 != 0) {
                                if (w10 != 1) {
                                    jsonReader.F();
                                } else if (jsonReader.t() == token2) {
                                    f14 = (float) jsonReader.k();
                                    f16 = f14;
                                } else {
                                    jsonReader.a();
                                    f14 = (float) jsonReader.k();
                                    f16 = jsonReader.t() == token2 ? (float) jsonReader.k() : f14;
                                    jsonReader.d();
                                }
                            } else if (jsonReader.t() == token2) {
                                f13 = (float) jsonReader.k();
                                f15 = f13;
                            } else {
                                jsonReader.a();
                                f13 = (float) jsonReader.k();
                                f15 = jsonReader.t() == token2 ? (float) jsonReader.k() : f13;
                                jsonReader.d();
                            }
                        }
                        PointF pointF17 = new PointF(f13, f14);
                        PointF pointF18 = new PointF(f15, f16);
                        jsonReader.e();
                        pointF15 = pointF18;
                        pointF16 = pointF17;
                        t14 = t16;
                        break;
                    }
                case 4:
                    if (jsonReader.t() == token) {
                        jsonReader.c();
                        pointF2 = pointF12;
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        float f19 = 0.0f;
                        float f20 = 0.0f;
                        while (jsonReader.h()) {
                            PointF pointF19 = pointF11;
                            int w11 = jsonReader.w(d);
                            if (w11 != 0) {
                                t11 = t14;
                                if (w11 != 1) {
                                    jsonReader.F();
                                    pointF4 = pointF15;
                                } else if (jsonReader.t() == token2) {
                                    pointF4 = pointF15;
                                    f18 = (float) jsonReader.k();
                                    f20 = f18;
                                } else {
                                    pointF4 = pointF15;
                                    jsonReader.a();
                                    f18 = (float) jsonReader.k();
                                    f20 = jsonReader.t() == token2 ? (float) jsonReader.k() : f18;
                                    jsonReader.d();
                                }
                            } else {
                                pointF4 = pointF15;
                                t11 = t14;
                                if (jsonReader.t() == token2) {
                                    f17 = (float) jsonReader.k();
                                    f19 = f17;
                                } else {
                                    jsonReader.a();
                                    f17 = (float) jsonReader.k();
                                    f19 = jsonReader.t() == token2 ? (float) jsonReader.k() : f17;
                                    jsonReader.d();
                                }
                            }
                            t14 = t11;
                            pointF15 = pointF4;
                            pointF11 = pointF19;
                        }
                        pointF = pointF11;
                        pointF3 = pointF15;
                        PointF pointF20 = new PointF(f17, f18);
                        PointF pointF21 = new PointF(f19, f20);
                        jsonReader.e();
                        pointF10 = pointF21;
                        pointF9 = pointF20;
                        pointF15 = pointF3;
                        break;
                    } else {
                        pointF = pointF11;
                        pointF2 = pointF12;
                        pointF3 = pointF15;
                        t10 = t14;
                        pointF14 = m.b(jsonReader, f10);
                        t14 = t10;
                        pointF15 = pointF3;
                    }
                case 5:
                    pointF = pointF11;
                    pointF2 = pointF12;
                    pointF3 = pointF15;
                    t10 = t14;
                    z13 = jsonReader.m() == 1;
                    t14 = t10;
                    pointF15 = pointF3;
                    break;
                case 6:
                    pointF = m.b(jsonReader, f10);
                    pointF2 = pointF12;
                    pointF3 = pointF15;
                    t10 = t14;
                    t14 = t10;
                    pointF15 = pointF3;
                    break;
                case 7:
                    pointF12 = m.b(jsonReader, f10);
                    continue;
                default:
                    pointF = pointF11;
                    pointF2 = pointF12;
                    jsonReader.F();
                    break;
            }
            pointF11 = pointF;
            pointF12 = pointF2;
        }
        PointF pointF22 = pointF11;
        PointF pointF23 = pointF12;
        PointF pointF24 = pointF15;
        T t17 = t14;
        jsonReader.e();
        if (z13) {
            interpolator = f12200a;
            t15 = t17;
        } else if (pointF13 != null && pointF14 != null) {
            interpolator = a(pointF13, pointF14);
        } else if (pointF16 != null && pointF24 != null && pointF9 != null && pointF10 != null) {
            Interpolator a12 = a(pointF16, pointF9);
            a11 = a(pointF24, pointF10);
            t8 = t15;
            interpolator2 = a12;
            interpolator = null;
            n2.a<T> aVar2 = (interpolator2 != null || a11 == null) ? new n2.a<>(fVar, t17, t8, interpolator, f12, null) : new n2.a<>(fVar, t17, t8, interpolator2, a11, f12, null);
            aVar2.f13271o = pointF22;
            aVar2.f13272p = pointF23;
            return aVar2;
        } else {
            interpolator = f12200a;
        }
        t8 = t15;
        interpolator2 = null;
        a11 = null;
        if (interpolator2 != null) {
        }
        aVar2.f13271o = pointF22;
        aVar2.f13272p = pointF23;
        return aVar2;
    }
}
