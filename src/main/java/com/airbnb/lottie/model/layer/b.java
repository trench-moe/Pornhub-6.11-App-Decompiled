package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import b2.f;
import b2.l;
import b2.q;
import e2.o;
import j2.c;
import j2.e;
import java.util.ArrayList;
import java.util.List;
import m2.g;
import p.d;

/* loaded from: classes.dex */
public class b extends a {
    public final List<a> A;
    public final RectF B;
    public final RectF C;
    public Paint D;

    /* renamed from: z  reason: collision with root package name */
    public e2.a<Float, Float> f4238z;

    public b(l lVar, Layer layer, List<Layer> list, f fVar) {
        super(lVar, layer);
        int i10;
        a aVar;
        a bVar;
        this.A = new ArrayList();
        this.B = new RectF();
        this.C = new RectF();
        this.D = new Paint();
        h2.b bVar2 = layer.f4205s;
        if (bVar2 != null) {
            e2.a<Float, Float> a10 = bVar2.a();
            this.f4238z = a10;
            e(a10);
            this.f4238z.f8994a.add(this);
        } else {
            this.f4238z = null;
        }
        d dVar = new d(fVar.f3455i.size());
        int size = list.size() - 1;
        a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            int ordinal = layer2.f4192e.ordinal();
            if (ordinal == 0) {
                bVar = new b(lVar, layer2, fVar.f3450c.get(layer2.f4194g), fVar);
            } else if (ordinal == 1) {
                bVar = new e(lVar, layer2);
            } else if (ordinal == 2) {
                bVar = new j2.b(lVar, layer2);
            } else if (ordinal == 3) {
                bVar = new c(lVar, layer2);
            } else if (ordinal == 4) {
                bVar = new j2.d(lVar, layer2);
            } else if (ordinal != 5) {
                StringBuilder m10 = a1.a.m("Unknown layer type ");
                m10.append(layer2.f4192e);
                m2.c.a(m10.toString());
                bVar = null;
            } else {
                bVar = new j2.f(lVar, layer2);
            }
            if (bVar != null) {
                dVar.j(bVar.f4228o.d, bVar);
                if (aVar2 != null) {
                    aVar2.f4231r = bVar;
                    aVar2 = null;
                } else {
                    this.A.add(0, bVar);
                    int ordinal2 = layer2.f4207u.ordinal();
                    if (ordinal2 == 1 || ordinal2 == 2) {
                        aVar2 = bVar;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < dVar.k(); i10++) {
            a aVar3 = (a) dVar.f(dVar.i(i10));
            if (aVar3 != null && (aVar = (a) dVar.f(aVar3.f4228o.f4193f)) != null) {
                aVar3.f4232s = aVar;
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, d2.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        for (int size = this.A.size() - 1; size >= 0; size--) {
            this.B.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.A.get(size).d(this.B, this.f4227m, true);
            rectF.union(this.B);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, g2.e
    public <T> void h(T t2, n2.c cVar) {
        this.f4235v.c(t2, cVar);
        if (t2 == q.C) {
            if (cVar == null) {
                e2.a<Float, Float> aVar = this.f4238z;
                if (aVar != null) {
                    aVar.j(null);
                }
            } else {
                o oVar = new o(cVar, null);
                this.f4238z = oVar;
                oVar.f8994a.add(this);
                e(this.f4238z);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void k(Canvas canvas, Matrix matrix, int i10) {
        RectF rectF = this.C;
        Layer layer = this.f4228o;
        rectF.set(0.0f, 0.0f, layer.f4201o, layer.f4202p);
        matrix.mapRect(this.C);
        boolean z10 = this.n.H && this.A.size() > 1 && i10 != 255;
        if (z10) {
            this.D.setAlpha(i10);
            g.f(canvas, this.C, this.D, 31);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.A.size() - 1; size >= 0; size--) {
            if (!this.C.isEmpty() ? canvas.clipRect(this.C) : true) {
                this.A.get(size).f(canvas, matrix, i10);
            }
        }
        canvas.restore();
        f1.a.b("CompositionLayer#draw");
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void o(g2.d dVar, int i10, List<g2.d> list, g2.d dVar2) {
        for (int i11 = 0; i11 < this.A.size(); i11++) {
            this.A.get(i11).c(dVar, i10, list, dVar2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void p(boolean z10) {
        if (z10 && this.y == null) {
            this.y = new c2.a();
        }
        this.f4237x = z10;
        for (a aVar : this.A) {
            aVar.p(z10);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void q(float f10) {
        super.q(f10);
        if (this.f4238z != null) {
            f10 = ((this.f4238z.e().floatValue() * this.f4228o.f4190b.f3459m) - this.f4228o.f4190b.f3457k) / (this.n.f3479f.c() + 0.01f);
        }
        if (this.f4238z == null) {
            Layer layer = this.f4228o;
            f10 -= layer.n / layer.f4190b.c();
        }
        float f11 = this.f4228o.f4200m;
        if (f11 != 0.0f) {
            f10 /= f11;
        }
        int size = this.A.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            this.A.get(size).q(f10);
        }
    }
}
