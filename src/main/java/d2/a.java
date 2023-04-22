package d2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import e2.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class a implements a.b, k, e {

    /* renamed from: e  reason: collision with root package name */
    public final b2.l f8634e;

    /* renamed from: f  reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f8635f;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f8637h;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f8638i;

    /* renamed from: j  reason: collision with root package name */
    public final e2.a<?, Float> f8639j;

    /* renamed from: k  reason: collision with root package name */
    public final e2.a<?, Integer> f8640k;

    /* renamed from: l  reason: collision with root package name */
    public final List<e2.a<?, Float>> f8641l;

    /* renamed from: m  reason: collision with root package name */
    public final e2.a<?, Float> f8642m;
    public e2.a<ColorFilter, ColorFilter> n;

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f8631a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    public final Path f8632b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f8633c = new Path();
    public final RectF d = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final List<b> f8636g = new ArrayList();

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final List<m> f8643a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final s f8644b;

        public b(s sVar, C0118a c0118a) {
            this.f8644b = sVar;
        }
    }

    public a(b2.l lVar, com.airbnb.lottie.model.layer.a aVar, Paint.Cap cap, Paint.Join join, float f10, h2.d dVar, h2.b bVar, List<h2.b> list, h2.b bVar2) {
        c2.a aVar2 = new c2.a(1);
        this.f8638i = aVar2;
        this.f8634e = lVar;
        this.f8635f = aVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f10);
        this.f8640k = dVar.a();
        this.f8639j = bVar.a();
        if (bVar2 == null) {
            this.f8642m = null;
        } else {
            this.f8642m = bVar2.a();
        }
        this.f8641l = new ArrayList(list.size());
        this.f8637h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f8641l.add(list.get(i10).a());
        }
        aVar.e(this.f8640k);
        aVar.e(this.f8639j);
        for (int i11 = 0; i11 < this.f8641l.size(); i11++) {
            aVar.e(this.f8641l.get(i11));
        }
        e2.a<?, Float> aVar3 = this.f8642m;
        if (aVar3 != null) {
            aVar.e(aVar3);
        }
        this.f8640k.f8994a.add(this);
        this.f8639j.f8994a.add(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f8641l.get(i12).f8994a.add(this);
        }
        e2.a<?, Float> aVar4 = this.f8642m;
        if (aVar4 != null) {
            aVar4.f8994a.add(this);
        }
    }

    @Override // e2.a.b
    public void a() {
        this.f8634e.invalidateSelf();
    }

    @Override // d2.c
    public void b(List<c> list, List<c> list2) {
        ShapeTrimPath.Type type = ShapeTrimPath.Type.INDIVIDUALLY;
        s sVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof s) {
                s sVar2 = (s) cVar;
                if (sVar2.f8744c == type) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.f8743b.add(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof s) {
                s sVar3 = (s) cVar2;
                if (sVar3.f8744c == type) {
                    if (bVar != null) {
                        this.f8636g.add(bVar);
                    }
                    bVar = new b(sVar3, null);
                    sVar3.f8743b.add(this);
                }
            }
            if (cVar2 instanceof m) {
                if (bVar == null) {
                    bVar = new b(sVar, null);
                }
                bVar.f8643a.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.f8636g.add(bVar);
        }
    }

    @Override // g2.e
    public void c(g2.d dVar, int i10, List<g2.d> list, g2.d dVar2) {
        m2.f.f(dVar, i10, list, dVar2, this);
    }

    @Override // d2.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f8632b.reset();
        for (int i10 = 0; i10 < this.f8636g.size(); i10++) {
            b bVar = this.f8636g.get(i10);
            for (int i11 = 0; i11 < bVar.f8643a.size(); i11++) {
                this.f8632b.addPath(bVar.f8643a.get(i11).g(), matrix);
            }
        }
        this.f8632b.computeBounds(this.d, false);
        float k10 = ((e2.c) this.f8639j).k();
        RectF rectF2 = this.d;
        float f10 = k10 / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        f1.a.b("StrokeContent#getBounds");
    }

    @Override // d2.e
    public void f(Canvas canvas, Matrix matrix, int i10) {
        float[] fArr = m2.g.d.get();
        boolean z10 = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            f1.a.b("StrokeContent#draw");
            return;
        }
        e2.e eVar = (e2.e) this.f8640k;
        float k10 = (i10 / 255.0f) * eVar.k(eVar.a(), eVar.c());
        float f10 = 100.0f;
        this.f8638i.setAlpha(m2.f.c((int) ((k10 / 100.0f) * 255.0f), 0, KotlinVersion.MAX_COMPONENT_VALUE));
        this.f8638i.setStrokeWidth(m2.g.d(matrix) * ((e2.c) this.f8639j).k());
        if (this.f8638i.getStrokeWidth() <= 0.0f) {
            f1.a.b("StrokeContent#draw");
            return;
        }
        float f11 = 1.0f;
        if (this.f8641l.isEmpty()) {
            f1.a.b("StrokeContent#applyDashPattern");
        } else {
            float d = m2.g.d(matrix);
            for (int i11 = 0; i11 < this.f8641l.size(); i11++) {
                this.f8637h[i11] = this.f8641l.get(i11).e().floatValue();
                if (i11 % 2 == 0) {
                    float[] fArr2 = this.f8637h;
                    if (fArr2[i11] < 1.0f) {
                        fArr2[i11] = 1.0f;
                    }
                } else {
                    float[] fArr3 = this.f8637h;
                    if (fArr3[i11] < 0.1f) {
                        fArr3[i11] = 0.1f;
                    }
                }
                float[] fArr4 = this.f8637h;
                fArr4[i11] = fArr4[i11] * d;
            }
            e2.a<?, Float> aVar = this.f8642m;
            this.f8638i.setPathEffect(new DashPathEffect(this.f8637h, aVar == null ? 0.0f : aVar.e().floatValue() * d));
            f1.a.b("StrokeContent#applyDashPattern");
        }
        e2.a<ColorFilter, ColorFilter> aVar2 = this.n;
        if (aVar2 != null) {
            this.f8638i.setColorFilter(aVar2.e());
        }
        int i12 = 0;
        while (i12 < this.f8636g.size()) {
            b bVar = this.f8636g.get(i12);
            s sVar = bVar.f8644b;
            if (sVar == null) {
                this.f8632b.reset();
                for (int size = bVar.f8643a.size() - 1; size >= 0; size--) {
                    this.f8632b.addPath(bVar.f8643a.get(size).g(), matrix);
                }
                f1.a.b("StrokeContent#buildPath");
                canvas.drawPath(this.f8632b, this.f8638i);
                f1.a.b("StrokeContent#drawPath");
            } else if (sVar == null) {
                f1.a.b("StrokeContent#applyTrimPath");
            } else {
                this.f8632b.reset();
                int size2 = bVar.f8643a.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    }
                    this.f8632b.addPath(bVar.f8643a.get(size2).g(), matrix);
                }
                this.f8631a.setPath(this.f8632b, z10);
                float length = this.f8631a.getLength();
                while (this.f8631a.nextContour()) {
                    length += this.f8631a.getLength();
                }
                float floatValue = (bVar.f8644b.f8746f.e().floatValue() * length) / 360.0f;
                float floatValue2 = ((bVar.f8644b.d.e().floatValue() * length) / f10) + floatValue;
                float floatValue3 = ((bVar.f8644b.f8745e.e().floatValue() * length) / f10) + floatValue;
                int size3 = bVar.f8643a.size() - 1;
                float f12 = 0.0f;
                while (size3 >= 0) {
                    this.f8633c.set(bVar.f8643a.get(size3).g());
                    this.f8633c.transform(matrix);
                    this.f8631a.setPath(this.f8633c, z10);
                    float length2 = this.f8631a.getLength();
                    if (floatValue3 > length) {
                        float f13 = floatValue3 - length;
                        if (f13 < f12 + length2 && f12 < f13) {
                            m2.g.a(this.f8633c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f13 / length2, f11), 0.0f);
                            canvas.drawPath(this.f8633c, this.f8638i);
                            f12 += length2;
                            size3--;
                            z10 = false;
                            f11 = 1.0f;
                        }
                    }
                    float f14 = f12 + length2;
                    if (f14 >= floatValue2 && f12 <= floatValue3) {
                        if (f14 > floatValue3 || floatValue2 >= f12) {
                            m2.g.a(this.f8633c, floatValue2 < f12 ? 0.0f : (floatValue2 - f12) / length2, floatValue3 > f14 ? 1.0f : (floatValue3 - f12) / length2, 0.0f);
                            canvas.drawPath(this.f8633c, this.f8638i);
                        } else {
                            canvas.drawPath(this.f8633c, this.f8638i);
                        }
                    }
                    f12 += length2;
                    size3--;
                    z10 = false;
                    f11 = 1.0f;
                }
                f1.a.b("StrokeContent#applyTrimPath");
            }
            i12++;
            z10 = false;
            f10 = 100.0f;
            f11 = 1.0f;
        }
        f1.a.b("StrokeContent#draw");
    }

    @Override // g2.e
    public <T> void h(T t2, n2.c cVar) {
        if (t2 == b2.q.d) {
            this.f8640k.j(cVar);
        } else if (t2 == b2.q.f3531q) {
            this.f8639j.j(cVar);
        } else {
            if (t2 == b2.q.E) {
                e2.a<ColorFilter, ColorFilter> aVar = this.n;
                if (aVar != null) {
                    this.f8635f.f4234u.remove(aVar);
                }
                if (cVar == null) {
                    this.n = null;
                    return;
                }
                e2.o oVar = new e2.o(cVar, null);
                this.n = oVar;
                oVar.f8994a.add(this);
                this.f8635f.e(this.n);
            }
        }
    }
}
