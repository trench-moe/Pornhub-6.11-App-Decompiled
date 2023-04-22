package d2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.airbnb.lottie.model.content.ShapeStroke;

/* loaded from: classes.dex */
public class r extends a {

    /* renamed from: o  reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f8737o;

    /* renamed from: p  reason: collision with root package name */
    public final String f8738p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f8739q;

    /* renamed from: r  reason: collision with root package name */
    public final e2.a<Integer, Integer> f8740r;

    /* renamed from: s  reason: collision with root package name */
    public e2.a<ColorFilter, ColorFilter> f8741s;

    public r(b2.l lVar, com.airbnb.lottie.model.layer.a aVar, ShapeStroke shapeStroke) {
        super(lVar, aVar, shapeStroke.f4163g.b(), shapeStroke.f4164h.b(), shapeStroke.f4165i, shapeStroke.f4161e, shapeStroke.f4162f, shapeStroke.f4160c, shapeStroke.f4159b);
        this.f8737o = aVar;
        this.f8738p = shapeStroke.f4158a;
        this.f8739q = shapeStroke.f4166j;
        e2.a<Integer, Integer> a10 = shapeStroke.d.a();
        this.f8740r = a10;
        a10.f8994a.add(this);
        aVar.e(a10);
    }

    @Override // d2.a, d2.e
    public void f(Canvas canvas, Matrix matrix, int i10) {
        if (this.f8739q) {
            return;
        }
        Paint paint = this.f8638i;
        e2.b bVar = (e2.b) this.f8740r;
        paint.setColor(bVar.k(bVar.a(), bVar.c()));
        e2.a<ColorFilter, ColorFilter> aVar = this.f8741s;
        if (aVar != null) {
            this.f8638i.setColorFilter(aVar.e());
        }
        super.f(canvas, matrix, i10);
    }

    @Override // d2.c
    public String getName() {
        return this.f8738p;
    }

    @Override // d2.a, g2.e
    public <T> void h(T t2, n2.c cVar) {
        super.h(t2, cVar);
        if (t2 == b2.q.f3518b) {
            this.f8740r.j(cVar);
            return;
        }
        if (t2 == b2.q.E) {
            e2.a<ColorFilter, ColorFilter> aVar = this.f8741s;
            if (aVar != null) {
                this.f8737o.f4234u.remove(aVar);
            }
            if (cVar == null) {
                this.f8741s = null;
                return;
            }
            e2.o oVar = new e2.o(cVar, null);
            this.f8741s = oVar;
            oVar.f8994a.add(this);
            this.f8737o.e(this.f8740r);
        }
    }
}
