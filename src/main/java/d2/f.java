package d2;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import e2.a;
import java.util.List;

/* loaded from: classes.dex */
public class f implements m, a.b, k {

    /* renamed from: b  reason: collision with root package name */
    public final String f8657b;

    /* renamed from: c  reason: collision with root package name */
    public final b2.l f8658c;
    public final e2.a<?, PointF> d;

    /* renamed from: e  reason: collision with root package name */
    public final e2.a<?, PointF> f8659e;

    /* renamed from: f  reason: collision with root package name */
    public final i2.a f8660f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8662h;

    /* renamed from: a  reason: collision with root package name */
    public final Path f8656a = new Path();

    /* renamed from: g  reason: collision with root package name */
    public b f8661g = new b();

    public f(b2.l lVar, com.airbnb.lottie.model.layer.a aVar, i2.a aVar2) {
        this.f8657b = aVar2.f10457a;
        this.f8658c = lVar;
        e2.a<PointF, PointF> a10 = aVar2.f10459c.a();
        this.d = a10;
        e2.a<PointF, PointF> a11 = aVar2.f10458b.a();
        this.f8659e = a11;
        this.f8660f = aVar2;
        aVar.e(a10);
        aVar.e(a11);
        a10.f8994a.add(this);
        a11.f8994a.add(this);
    }

    @Override // e2.a.b
    public void a() {
        this.f8662h = false;
        this.f8658c.invalidateSelf();
    }

    @Override // d2.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.f8744c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f8661g.f8645a.add(sVar);
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
        if (this.f8662h) {
            return this.f8656a;
        }
        this.f8656a.reset();
        if (this.f8660f.f10460e) {
            this.f8662h = true;
            return this.f8656a;
        }
        PointF e10 = this.d.e();
        float f10 = e10.x / 2.0f;
        float f11 = e10.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f8656a.reset();
        if (this.f8660f.d) {
            float f14 = -f11;
            this.f8656a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f8656a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.f8656a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.f8656a.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.f8656a.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.f8656a.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.f8656a.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.f8656a.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.f8656a.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.f8656a.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF e11 = this.f8659e.e();
        this.f8656a.offset(e11.x, e11.y);
        this.f8656a.close();
        this.f8661g.c(this.f8656a);
        this.f8662h = true;
        return this.f8656a;
    }

    @Override // d2.c
    public String getName() {
        return this.f8657b;
    }

    @Override // g2.e
    public <T> void h(T t2, n2.c cVar) {
        if (t2 == b2.q.f3524i) {
            this.d.j(cVar);
        } else if (t2 == b2.q.f3527l) {
            this.f8659e.j(cVar);
        }
    }
}
