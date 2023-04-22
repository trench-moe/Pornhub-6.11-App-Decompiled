package e2;

import android.graphics.Matrix;
import android.graphics.PointF;
import b2.q;
import e2.a;
import java.util.Collections;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f9022a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f9023b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f9024c;
    public final Matrix d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f9025e;

    /* renamed from: f  reason: collision with root package name */
    public a<PointF, PointF> f9026f;

    /* renamed from: g  reason: collision with root package name */
    public a<?, PointF> f9027g;

    /* renamed from: h  reason: collision with root package name */
    public a<n2.d, n2.d> f9028h;

    /* renamed from: i  reason: collision with root package name */
    public a<Float, Float> f9029i;

    /* renamed from: j  reason: collision with root package name */
    public a<Integer, Integer> f9030j;

    /* renamed from: k  reason: collision with root package name */
    public c f9031k;

    /* renamed from: l  reason: collision with root package name */
    public c f9032l;

    /* renamed from: m  reason: collision with root package name */
    public a<?, Float> f9033m;
    public a<?, Float> n;

    public n(h2.i iVar) {
        d2.b bVar = iVar.f10100a;
        this.f9026f = bVar == null ? null : bVar.a();
        h2.j<PointF, PointF> jVar = iVar.f10101b;
        this.f9027g = jVar == null ? null : jVar.a();
        h2.f fVar = iVar.f10102c;
        this.f9028h = fVar == null ? null : fVar.a();
        h2.b bVar2 = iVar.d;
        this.f9029i = bVar2 == null ? null : bVar2.a();
        h2.b bVar3 = iVar.f10104f;
        c cVar = bVar3 == null ? null : (c) bVar3.a();
        this.f9031k = cVar;
        if (cVar != null) {
            this.f9023b = new Matrix();
            this.f9024c = new Matrix();
            this.d = new Matrix();
            this.f9025e = new float[9];
        } else {
            this.f9023b = null;
            this.f9024c = null;
            this.d = null;
            this.f9025e = null;
        }
        h2.b bVar4 = iVar.f10105g;
        this.f9032l = bVar4 == null ? null : (c) bVar4.a();
        h2.d dVar = iVar.f10103e;
        if (dVar != null) {
            this.f9030j = dVar.a();
        }
        h2.b bVar5 = iVar.f10106h;
        if (bVar5 != null) {
            this.f9033m = bVar5.a();
        } else {
            this.f9033m = null;
        }
        h2.b bVar6 = iVar.f10107i;
        if (bVar6 != null) {
            this.n = bVar6.a();
        } else {
            this.n = null;
        }
    }

    public void a(com.airbnb.lottie.model.layer.a aVar) {
        aVar.e(this.f9030j);
        aVar.e(this.f9033m);
        aVar.e(this.n);
        aVar.e(this.f9026f);
        aVar.e(this.f9027g);
        aVar.e(this.f9028h);
        aVar.e(this.f9029i);
        aVar.e(this.f9031k);
        aVar.e(this.f9032l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f9030j;
        if (aVar != null) {
            aVar.f8994a.add(bVar);
        }
        a<?, Float> aVar2 = this.f9033m;
        if (aVar2 != null) {
            aVar2.f8994a.add(bVar);
        }
        a<?, Float> aVar3 = this.n;
        if (aVar3 != null) {
            aVar3.f8994a.add(bVar);
        }
        a<PointF, PointF> aVar4 = this.f9026f;
        if (aVar4 != null) {
            aVar4.f8994a.add(bVar);
        }
        a<?, PointF> aVar5 = this.f9027g;
        if (aVar5 != null) {
            aVar5.f8994a.add(bVar);
        }
        a<n2.d, n2.d> aVar6 = this.f9028h;
        if (aVar6 != null) {
            aVar6.f8994a.add(bVar);
        }
        a<Float, Float> aVar7 = this.f9029i;
        if (aVar7 != null) {
            aVar7.f8994a.add(bVar);
        }
        c cVar = this.f9031k;
        if (cVar != null) {
            cVar.f8994a.add(bVar);
        }
        c cVar2 = this.f9032l;
        if (cVar2 != null) {
            cVar2.f8994a.add(bVar);
        }
    }

    public <T> boolean c(T t2, n2.c cVar) {
        c cVar2;
        c cVar3;
        a<?, Float> aVar;
        a<?, Float> aVar2;
        if (t2 == q.f3520e) {
            a<PointF, PointF> aVar3 = this.f9026f;
            if (aVar3 == null) {
                this.f9026f = new o(cVar, new PointF());
            } else {
                aVar3.j(cVar);
            }
        } else if (t2 == q.f3521f) {
            a<?, PointF> aVar4 = this.f9027g;
            if (aVar4 == null) {
                this.f9027g = new o(cVar, new PointF());
            } else {
                aVar4.j(cVar);
            }
        } else {
            if (t2 == q.f3522g) {
                a<?, PointF> aVar5 = this.f9027g;
                if (aVar5 instanceof l) {
                    l lVar = (l) aVar5;
                    n2.c cVar4 = lVar.f9021m;
                    if (cVar4 != null) {
                        cVar4.f13277j = null;
                    }
                    lVar.f9021m = cVar;
                    if (cVar != null) {
                        cVar.f13277j = lVar;
                    }
                }
            }
            if (t2 == q.f3523h) {
                a<?, PointF> aVar6 = this.f9027g;
                if (aVar6 instanceof l) {
                    l lVar2 = (l) aVar6;
                    n2.c cVar5 = lVar2.n;
                    if (cVar5 != null) {
                        cVar5.f13277j = null;
                    }
                    lVar2.n = cVar;
                    if (cVar != null) {
                        cVar.f13277j = lVar2;
                    }
                }
            }
            if (t2 == q.f3528m) {
                a<n2.d, n2.d> aVar7 = this.f9028h;
                if (aVar7 == null) {
                    this.f9028h = new o(cVar, new n2.d());
                } else {
                    aVar7.j(cVar);
                }
            } else if (t2 == q.n) {
                a<Float, Float> aVar8 = this.f9029i;
                if (aVar8 == null) {
                    this.f9029i = new o(cVar, Float.valueOf(0.0f));
                } else {
                    aVar8.j(cVar);
                }
            } else if (t2 == q.f3519c) {
                a<Integer, Integer> aVar9 = this.f9030j;
                if (aVar9 == null) {
                    this.f9030j = new o(cVar, 100);
                } else {
                    aVar9.j(cVar);
                }
            } else if (t2 != q.A || (aVar2 = this.f9033m) == null) {
                if (t2 != q.B || (aVar = this.n) == null) {
                    if (t2 == q.f3529o && (cVar3 = this.f9031k) != null) {
                        if (cVar3 == null) {
                            this.f9031k = new c(Collections.singletonList(new n2.a(Float.valueOf(0.0f))));
                        }
                        this.f9031k.j(cVar);
                    } else if (t2 != q.f3530p || (cVar2 = this.f9032l) == null) {
                        return false;
                    } else {
                        if (cVar2 == null) {
                            this.f9032l = new c(Collections.singletonList(new n2.a(Float.valueOf(0.0f))));
                        }
                        this.f9032l.j(cVar);
                    }
                } else if (aVar == null) {
                    this.n = new o(cVar, 100);
                } else {
                    aVar.j(cVar);
                }
            } else if (aVar2 == null) {
                this.f9033m = new o(cVar, 100);
            } else {
                aVar2.j(cVar);
            }
        }
        return true;
    }

    public final void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f9025e[i10] = 0.0f;
        }
    }

    public Matrix e() {
        this.f9022a.reset();
        a<?, PointF> aVar = this.f9027g;
        if (aVar != null) {
            PointF e10 = aVar.e();
            float f10 = e10.x;
            if (f10 == 0.0f) {
                if (e10.y != 0.0f) {
                }
            }
            this.f9022a.preTranslate(f10, e10.y);
        }
        a<Float, Float> aVar2 = this.f9029i;
        if (aVar2 != null) {
            float floatValue = aVar2 instanceof o ? aVar2.e().floatValue() : ((c) aVar2).k();
            if (floatValue != 0.0f) {
                this.f9022a.preRotate(floatValue);
            }
        }
        if (this.f9031k != null) {
            c cVar = this.f9032l;
            float cos = cVar == null ? 0.0f : (float) Math.cos(Math.toRadians((-cVar.k()) + 90.0f));
            c cVar2 = this.f9032l;
            float sin = cVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((-cVar2.k()) + 90.0f));
            d();
            float[] fArr = this.f9025e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f11 = -sin;
            fArr[3] = f11;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f9023b.setValues(fArr);
            d();
            float[] fArr2 = this.f9025e;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) Math.tan(Math.toRadians(this.f9031k.k()));
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f9024c.setValues(fArr2);
            d();
            float[] fArr3 = this.f9025e;
            fArr3[0] = cos;
            fArr3[1] = f11;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.d.setValues(fArr3);
            this.f9024c.preConcat(this.f9023b);
            this.d.preConcat(this.f9024c);
            this.f9022a.preConcat(this.d);
        }
        a<n2.d, n2.d> aVar3 = this.f9028h;
        if (aVar3 != null) {
            n2.d e11 = aVar3.e();
            float f12 = e11.f13279a;
            if (f12 == 1.0f) {
                if (e11.f13280b != 1.0f) {
                }
            }
            this.f9022a.preScale(f12, e11.f13280b);
        }
        a<PointF, PointF> aVar4 = this.f9026f;
        if (aVar4 != null) {
            PointF e12 = aVar4.e();
            float f13 = e12.x;
            if (f13 == 0.0f) {
                if (e12.y != 0.0f) {
                }
            }
            this.f9022a.preTranslate(-f13, -e12.y);
        }
        return this.f9022a;
    }

    public Matrix f(float f10) {
        a<?, PointF> aVar = this.f9027g;
        PointF pointF = null;
        PointF e10 = aVar == null ? null : aVar.e();
        a<n2.d, n2.d> aVar2 = this.f9028h;
        n2.d e11 = aVar2 == null ? null : aVar2.e();
        this.f9022a.reset();
        if (e10 != null) {
            this.f9022a.preTranslate(e10.x * f10, e10.y * f10);
        }
        if (e11 != null) {
            double d = f10;
            this.f9022a.preScale((float) Math.pow(e11.f13279a, d), (float) Math.pow(e11.f13280b, d));
        }
        a<Float, Float> aVar3 = this.f9029i;
        if (aVar3 != null) {
            float floatValue = aVar3.e().floatValue();
            a<PointF, PointF> aVar4 = this.f9026f;
            if (aVar4 != null) {
                pointF = aVar4.e();
            }
            Matrix matrix = this.f9022a;
            float f11 = floatValue * f10;
            float f12 = 0.0f;
            float f13 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f12 = pointF.y;
            }
            matrix.preRotate(f11, f13, f12);
        }
        return this.f9022a;
    }
}
