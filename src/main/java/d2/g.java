package d2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import e2.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class g implements e, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    public final Path f8663a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f8664b;

    /* renamed from: c  reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f8665c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8666e;

    /* renamed from: f  reason: collision with root package name */
    public final List<m> f8667f;

    /* renamed from: g  reason: collision with root package name */
    public final e2.a<Integer, Integer> f8668g;

    /* renamed from: h  reason: collision with root package name */
    public final e2.a<Integer, Integer> f8669h;

    /* renamed from: i  reason: collision with root package name */
    public e2.a<ColorFilter, ColorFilter> f8670i;

    /* renamed from: j  reason: collision with root package name */
    public final b2.l f8671j;

    public g(b2.l lVar, com.airbnb.lottie.model.layer.a aVar, i2.h hVar) {
        Path path = new Path();
        this.f8663a = path;
        this.f8664b = new c2.a(1);
        this.f8667f = new ArrayList();
        this.f8665c = aVar;
        this.d = hVar.f10483c;
        this.f8666e = hVar.f10485f;
        this.f8671j = lVar;
        if (hVar.d == null || hVar.f10484e == null) {
            this.f8668g = null;
            this.f8669h = null;
            return;
        }
        path.setFillType(hVar.f10482b);
        e2.a<Integer, Integer> a10 = hVar.d.a();
        this.f8668g = a10;
        a10.f8994a.add(this);
        aVar.e(a10);
        e2.a<Integer, Integer> a11 = hVar.f10484e.a();
        this.f8669h = a11;
        a11.f8994a.add(this);
        aVar.e(a11);
    }

    @Override // e2.a.b
    public void a() {
        this.f8671j.invalidateSelf();
    }

    @Override // d2.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f8667f.add((m) cVar);
            }
        }
    }

    @Override // g2.e
    public void c(g2.d dVar, int i10, List<g2.d> list, g2.d dVar2) {
        m2.f.f(dVar, i10, list, dVar2, this);
    }

    @Override // d2.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f8663a.reset();
        for (int i10 = 0; i10 < this.f8667f.size(); i10++) {
            this.f8663a.addPath(this.f8667f.get(i10).g(), matrix);
        }
        this.f8663a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // d2.e
    public void f(Canvas canvas, Matrix matrix, int i10) {
        if (this.f8666e) {
            return;
        }
        Paint paint = this.f8664b;
        e2.b bVar = (e2.b) this.f8668g;
        paint.setColor(bVar.k(bVar.a(), bVar.c()));
        this.f8664b.setAlpha(m2.f.c((int) ((((i10 / 255.0f) * this.f8669h.e().intValue()) / 100.0f) * 255.0f), 0, KotlinVersion.MAX_COMPONENT_VALUE));
        e2.a<ColorFilter, ColorFilter> aVar = this.f8670i;
        if (aVar != null) {
            this.f8664b.setColorFilter(aVar.e());
        }
        this.f8663a.reset();
        for (int i11 = 0; i11 < this.f8667f.size(); i11++) {
            this.f8663a.addPath(this.f8667f.get(i11).g(), matrix);
        }
        canvas.drawPath(this.f8663a, this.f8664b);
        f1.a.b("FillContent#draw");
    }

    @Override // d2.c
    public String getName() {
        return this.d;
    }

    @Override // g2.e
    public <T> void h(T t2, n2.c cVar) {
        if (t2 == b2.q.f3517a) {
            this.f8668g.j(cVar);
        } else if (t2 == b2.q.d) {
            this.f8669h.j(cVar);
        } else if (t2 == b2.q.E) {
            e2.a<ColorFilter, ColorFilter> aVar = this.f8670i;
            if (aVar != null) {
                this.f8665c.f4234u.remove(aVar);
            }
            if (cVar == null) {
                this.f8670i = null;
                return;
            }
            e2.o oVar = new e2.o(cVar, null);
            this.f8670i = oVar;
            oVar.f8994a.add(this);
            this.f8665c.e(this.f8670i);
        }
    }
}
