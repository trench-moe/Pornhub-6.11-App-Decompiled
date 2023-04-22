package d2;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import e2.a;
import java.util.List;

/* loaded from: classes.dex */
public class o implements a.b, k, m {

    /* renamed from: c  reason: collision with root package name */
    public final String f8716c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final b2.l f8717e;

    /* renamed from: f  reason: collision with root package name */
    public final e2.a<?, PointF> f8718f;

    /* renamed from: g  reason: collision with root package name */
    public final e2.a<?, PointF> f8719g;

    /* renamed from: h  reason: collision with root package name */
    public final e2.a<?, Float> f8720h;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8722j;

    /* renamed from: a  reason: collision with root package name */
    public final Path f8714a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f8715b = new RectF();

    /* renamed from: i  reason: collision with root package name */
    public b f8721i = new b();

    public o(b2.l lVar, com.airbnb.lottie.model.layer.a aVar, i2.e eVar) {
        this.f8716c = eVar.f10470a;
        this.d = eVar.f10473e;
        this.f8717e = lVar;
        e2.a<PointF, PointF> a10 = eVar.f10471b.a();
        this.f8718f = a10;
        e2.a<PointF, PointF> a11 = eVar.f10472c.a();
        this.f8719g = a11;
        e2.a<Float, Float> a12 = eVar.d.a();
        this.f8720h = a12;
        aVar.e(a10);
        aVar.e(a11);
        aVar.e(a12);
        a10.f8994a.add(this);
        a11.f8994a.add(this);
        a12.f8994a.add(this);
    }

    @Override // e2.a.b
    public void a() {
        this.f8722j = false;
        this.f8717e.invalidateSelf();
    }

    @Override // d2.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.f8744c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f8721i.f8645a.add(sVar);
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
        if (this.f8722j) {
            return this.f8714a;
        }
        this.f8714a.reset();
        if (this.d) {
            this.f8722j = true;
            return this.f8714a;
        }
        PointF e10 = this.f8719g.e();
        float f10 = e10.x / 2.0f;
        float f11 = e10.y / 2.0f;
        e2.a<?, Float> aVar = this.f8720h;
        float k10 = aVar == null ? 0.0f : ((e2.c) aVar).k();
        float min = Math.min(f10, f11);
        if (k10 > min) {
            k10 = min;
        }
        PointF e11 = this.f8718f.e();
        this.f8714a.moveTo(e11.x + f10, (e11.y - f11) + k10);
        this.f8714a.lineTo(e11.x + f10, (e11.y + f11) - k10);
        int i10 = (k10 > 0.0f ? 1 : (k10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            RectF rectF = this.f8715b;
            float f12 = e11.x;
            float f13 = k10 * 2.0f;
            float f14 = e11.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.f8714a.arcTo(this.f8715b, 0.0f, 90.0f, false);
        }
        this.f8714a.lineTo((e11.x - f10) + k10, e11.y + f11);
        if (i10 > 0) {
            RectF rectF2 = this.f8715b;
            float f15 = e11.x;
            float f16 = e11.y;
            float f17 = k10 * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.f8714a.arcTo(this.f8715b, 90.0f, 90.0f, false);
        }
        this.f8714a.lineTo(e11.x - f10, (e11.y - f11) + k10);
        if (i10 > 0) {
            RectF rectF3 = this.f8715b;
            float f18 = e11.x;
            float f19 = e11.y;
            float f20 = k10 * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.f8714a.arcTo(this.f8715b, 180.0f, 90.0f, false);
        }
        this.f8714a.lineTo((e11.x + f10) - k10, e11.y - f11);
        if (i10 > 0) {
            RectF rectF4 = this.f8715b;
            float f21 = e11.x;
            float f22 = k10 * 2.0f;
            float f23 = e11.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.f8714a.arcTo(this.f8715b, 270.0f, 90.0f, false);
        }
        this.f8714a.close();
        this.f8721i.c(this.f8714a);
        this.f8722j = true;
        return this.f8714a;
    }

    @Override // d2.c
    public String getName() {
        return this.f8716c;
    }

    @Override // g2.e
    public <T> void h(T t2, n2.c cVar) {
        if (t2 == b2.q.f3525j) {
            this.f8719g.j(cVar);
        } else if (t2 == b2.q.f3527l) {
            this.f8718f.j(cVar);
        } else if (t2 == b2.q.f3526k) {
            this.f8720h.j(cVar);
        }
    }
}
