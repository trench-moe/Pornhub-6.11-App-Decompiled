package d2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.model.content.GradientType;
import e2.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class h implements e, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    public final String f8672a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8673b;

    /* renamed from: c  reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f8674c;
    public final p.d<LinearGradient> d = new p.d<>(10);

    /* renamed from: e  reason: collision with root package name */
    public final p.d<RadialGradient> f8675e = new p.d<>(10);

    /* renamed from: f  reason: collision with root package name */
    public final Path f8676f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f8677g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f8678h;

    /* renamed from: i  reason: collision with root package name */
    public final List<m> f8679i;

    /* renamed from: j  reason: collision with root package name */
    public final GradientType f8680j;

    /* renamed from: k  reason: collision with root package name */
    public final e2.a<i2.c, i2.c> f8681k;

    /* renamed from: l  reason: collision with root package name */
    public final e2.a<Integer, Integer> f8682l;

    /* renamed from: m  reason: collision with root package name */
    public final e2.a<PointF, PointF> f8683m;
    public final e2.a<PointF, PointF> n;

    /* renamed from: o  reason: collision with root package name */
    public e2.a<ColorFilter, ColorFilter> f8684o;

    /* renamed from: p  reason: collision with root package name */
    public e2.o f8685p;

    /* renamed from: q  reason: collision with root package name */
    public final b2.l f8686q;

    /* renamed from: r  reason: collision with root package name */
    public final int f8687r;

    public h(b2.l lVar, com.airbnb.lottie.model.layer.a aVar, i2.d dVar) {
        Path path = new Path();
        this.f8676f = path;
        this.f8677g = new c2.a(1);
        this.f8678h = new RectF();
        this.f8679i = new ArrayList();
        this.f8674c = aVar;
        this.f8672a = dVar.f10468g;
        this.f8673b = dVar.f10469h;
        this.f8686q = lVar;
        this.f8680j = dVar.f10463a;
        path.setFillType(dVar.f10464b);
        this.f8687r = (int) (lVar.f3479f.b() / 32.0f);
        e2.a<i2.c, i2.c> a10 = dVar.f10465c.a();
        this.f8681k = a10;
        a10.f8994a.add(this);
        aVar.e(a10);
        e2.a<Integer, Integer> a11 = dVar.d.a();
        this.f8682l = a11;
        a11.f8994a.add(this);
        aVar.e(a11);
        e2.a<PointF, PointF> a12 = dVar.f10466e.a();
        this.f8683m = a12;
        a12.f8994a.add(this);
        aVar.e(a12);
        e2.a<PointF, PointF> a13 = dVar.f10467f.a();
        this.n = a13;
        a13.f8994a.add(this);
        aVar.e(a13);
    }

    @Override // e2.a.b
    public void a() {
        this.f8686q.invalidateSelf();
    }

    @Override // d2.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f8679i.add((m) cVar);
            }
        }
    }

    @Override // g2.e
    public void c(g2.d dVar, int i10, List<g2.d> list, g2.d dVar2) {
        m2.f.f(dVar, i10, list, dVar2, this);
    }

    @Override // d2.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f8676f.reset();
        for (int i10 = 0; i10 < this.f8679i.size(); i10++) {
            this.f8676f.addPath(this.f8679i.get(i10).g(), matrix);
        }
        this.f8676f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final int[] e(int[] iArr) {
        e2.o oVar = this.f8685p;
        if (oVar != null) {
            Integer[] numArr = (Integer[]) oVar.e();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d2.e
    public void f(Canvas canvas, Matrix matrix, int i10) {
        RadialGradient f10;
        if (this.f8673b) {
            return;
        }
        this.f8676f.reset();
        for (int i11 = 0; i11 < this.f8679i.size(); i11++) {
            this.f8676f.addPath(this.f8679i.get(i11).g(), matrix);
        }
        this.f8676f.computeBounds(this.f8678h, false);
        if (this.f8680j == GradientType.LINEAR) {
            long i12 = i();
            f10 = this.d.f(i12);
            if (f10 == null) {
                PointF e10 = this.f8683m.e();
                PointF e11 = this.n.e();
                i2.c e12 = this.f8681k.e();
                LinearGradient linearGradient = new LinearGradient(e10.x, e10.y, e11.x, e11.y, e(e12.f10462b), e12.f10461a, Shader.TileMode.CLAMP);
                this.d.j(i12, linearGradient);
                f10 = linearGradient;
            }
        } else {
            long i13 = i();
            f10 = this.f8675e.f(i13);
            if (f10 == null) {
                PointF e13 = this.f8683m.e();
                PointF e14 = this.n.e();
                i2.c e15 = this.f8681k.e();
                int[] e16 = e(e15.f10462b);
                float[] fArr = e15.f10461a;
                float f11 = e13.x;
                float f12 = e13.y;
                float hypot = (float) Math.hypot(e14.x - f11, e14.y - f12);
                f10 = new RadialGradient(f11, f12, hypot <= 0.0f ? 0.001f : hypot, e16, fArr, Shader.TileMode.CLAMP);
                this.f8675e.j(i13, f10);
            }
        }
        f10.setLocalMatrix(matrix);
        this.f8677g.setShader(f10);
        e2.a<ColorFilter, ColorFilter> aVar = this.f8684o;
        if (aVar != null) {
            this.f8677g.setColorFilter(aVar.e());
        }
        this.f8677g.setAlpha(m2.f.c((int) ((((i10 / 255.0f) * this.f8682l.e().intValue()) / 100.0f) * 255.0f), 0, KotlinVersion.MAX_COMPONENT_VALUE));
        canvas.drawPath(this.f8676f, this.f8677g);
        f1.a.b("GradientFillContent#draw");
    }

    @Override // d2.c
    public String getName() {
        return this.f8672a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g2.e
    public <T> void h(T t2, n2.c cVar) {
        if (t2 == b2.q.d) {
            this.f8682l.j(cVar);
        } else if (t2 == b2.q.E) {
            e2.a<ColorFilter, ColorFilter> aVar = this.f8684o;
            if (aVar != null) {
                this.f8674c.f4234u.remove(aVar);
            }
            if (cVar == null) {
                this.f8684o = null;
                return;
            }
            e2.o oVar = new e2.o(cVar, null);
            this.f8684o = oVar;
            oVar.f8994a.add(this);
            this.f8674c.e(this.f8684o);
        } else {
            if (t2 == b2.q.F) {
                e2.o oVar2 = this.f8685p;
                if (oVar2 != null) {
                    this.f8674c.f4234u.remove(oVar2);
                }
                if (cVar == null) {
                    this.f8685p = null;
                    return;
                }
                this.d.b();
                this.f8675e.b();
                e2.o oVar3 = new e2.o(cVar, null);
                this.f8685p = oVar3;
                oVar3.f8994a.add(this);
                this.f8674c.e(this.f8685p);
            }
        }
    }

    public final int i() {
        int round = Math.round(this.f8683m.d * this.f8687r);
        int round2 = Math.round(this.n.d * this.f8687r);
        int round3 = Math.round(this.f8681k.d * this.f8687r);
        int i10 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }
}
