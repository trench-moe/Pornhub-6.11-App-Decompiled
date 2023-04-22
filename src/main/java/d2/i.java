package d2;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.model.content.GradientType;

/* loaded from: classes.dex */
public class i extends a {

    /* renamed from: o  reason: collision with root package name */
    public final String f8688o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f8689p;

    /* renamed from: q  reason: collision with root package name */
    public final p.d<LinearGradient> f8690q;

    /* renamed from: r  reason: collision with root package name */
    public final p.d<RadialGradient> f8691r;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f8692s;

    /* renamed from: t  reason: collision with root package name */
    public final GradientType f8693t;

    /* renamed from: u  reason: collision with root package name */
    public final int f8694u;

    /* renamed from: v  reason: collision with root package name */
    public final e2.a<i2.c, i2.c> f8695v;

    /* renamed from: w  reason: collision with root package name */
    public final e2.a<PointF, PointF> f8696w;

    /* renamed from: x  reason: collision with root package name */
    public final e2.a<PointF, PointF> f8697x;
    public e2.o y;

    public i(b2.l lVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.a aVar2) {
        super(lVar, aVar, aVar2.f4183h.b(), aVar2.f4184i.b(), aVar2.f4185j, aVar2.d, aVar2.f4182g, aVar2.f4186k, aVar2.f4187l);
        this.f8690q = new p.d<>(10);
        this.f8691r = new p.d<>(10);
        this.f8692s = new RectF();
        this.f8688o = aVar2.f4177a;
        this.f8693t = aVar2.f4178b;
        this.f8689p = aVar2.f4188m;
        this.f8694u = (int) (lVar.f3479f.b() / 32.0f);
        e2.a<i2.c, i2.c> a10 = aVar2.f4179c.a();
        this.f8695v = a10;
        a10.f8994a.add(this);
        aVar.e(a10);
        e2.a<PointF, PointF> a11 = aVar2.f4180e.a();
        this.f8696w = a11;
        a11.f8994a.add(this);
        aVar.e(a11);
        e2.a<PointF, PointF> a12 = aVar2.f4181f.a();
        this.f8697x = a12;
        a12.f8994a.add(this);
        aVar.e(a12);
    }

    public final int[] e(int[] iArr) {
        e2.o oVar = this.y;
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
    @Override // d2.a, d2.e
    public void f(Canvas canvas, Matrix matrix, int i10) {
        RadialGradient f10;
        float f11;
        float f12;
        if (this.f8689p) {
            return;
        }
        d(this.f8692s, matrix, false);
        if (this.f8693t == GradientType.LINEAR) {
            long i11 = i();
            f10 = this.f8690q.f(i11);
            if (f10 == null) {
                PointF e10 = this.f8696w.e();
                PointF e11 = this.f8697x.e();
                i2.c e12 = this.f8695v.e();
                f10 = new LinearGradient(e10.x, e10.y, e11.x, e11.y, e(e12.f10462b), e12.f10461a, Shader.TileMode.CLAMP);
                this.f8690q.j(i11, f10);
            }
        } else {
            long i12 = i();
            f10 = this.f8691r.f(i12);
            if (f10 == null) {
                PointF e13 = this.f8696w.e();
                PointF e14 = this.f8697x.e();
                i2.c e15 = this.f8695v.e();
                int[] e16 = e(e15.f10462b);
                float[] fArr = e15.f10461a;
                f10 = new RadialGradient(e13.x, e13.y, (float) Math.hypot(e14.x - f11, e14.y - f12), e16, fArr, Shader.TileMode.CLAMP);
                this.f8691r.j(i12, f10);
            }
        }
        f10.setLocalMatrix(matrix);
        this.f8638i.setShader(f10);
        super.f(canvas, matrix, i10);
    }

    @Override // d2.c
    public String getName() {
        return this.f8688o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d2.a, g2.e
    public <T> void h(T t2, n2.c cVar) {
        super.h(t2, cVar);
        if (t2 == b2.q.F) {
            e2.o oVar = this.y;
            if (oVar != null) {
                this.f8635f.f4234u.remove(oVar);
            }
            if (cVar == null) {
                this.y = null;
                return;
            }
            e2.o oVar2 = new e2.o(cVar, null);
            this.y = oVar2;
            oVar2.f8994a.add(this);
            this.f8635f.e(this.y);
        }
    }

    public final int i() {
        int round = Math.round(this.f8696w.d * this.f8694u);
        int round2 = Math.round(this.f8697x.d * this.f8694u);
        int round3 = Math.round(this.f8695v.d * this.f8694u);
        int i10 = 17;
        if (round != 0) {
            i10 = 527 * round;
        }
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        if (round3 != 0) {
            i10 = i10 * 31 * round3;
        }
        return i10;
    }
}
