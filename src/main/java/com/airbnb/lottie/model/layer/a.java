package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.fragment.app.h0;
import b2.l;
import b2.u;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import d2.e;
import e2.a;
import e2.c;
import e2.n;
import g2.d;
import h2.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class a implements e, a.b, g2.e {

    /* renamed from: a  reason: collision with root package name */
    public final Path f4216a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f4217b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    public final Paint f4218c = new c2.a(1);
    public final Paint d = new c2.a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: e  reason: collision with root package name */
    public final Paint f4219e = new c2.a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: f  reason: collision with root package name */
    public final Paint f4220f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f4221g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f4222h;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f4223i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f4224j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f4225k;

    /* renamed from: l  reason: collision with root package name */
    public final String f4226l;

    /* renamed from: m  reason: collision with root package name */
    public final Matrix f4227m;
    public final l n;

    /* renamed from: o  reason: collision with root package name */
    public final Layer f4228o;

    /* renamed from: p  reason: collision with root package name */
    public h0 f4229p;

    /* renamed from: q  reason: collision with root package name */
    public c f4230q;

    /* renamed from: r  reason: collision with root package name */
    public a f4231r;

    /* renamed from: s  reason: collision with root package name */
    public a f4232s;

    /* renamed from: t  reason: collision with root package name */
    public List<a> f4233t;

    /* renamed from: u  reason: collision with root package name */
    public final List<e2.a<?, ?>> f4234u;

    /* renamed from: v  reason: collision with root package name */
    public final n f4235v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4236w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4237x;
    public Paint y;

    public a(l lVar, Layer layer) {
        c2.a aVar = new c2.a(1);
        this.f4220f = aVar;
        this.f4221g = new c2.a(PorterDuff.Mode.CLEAR);
        this.f4222h = new RectF();
        this.f4223i = new RectF();
        this.f4224j = new RectF();
        this.f4225k = new RectF();
        this.f4227m = new Matrix();
        this.f4234u = new ArrayList();
        this.f4236w = true;
        this.n = lVar;
        this.f4228o = layer;
        this.f4226l = android.support.v4.media.b.m(new StringBuilder(), layer.f4191c, "#draw");
        if (layer.f4207u == Layer.MatteType.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        i iVar = layer.f4196i;
        Objects.requireNonNull(iVar);
        n nVar = new n(iVar);
        this.f4235v = nVar;
        nVar.b(this);
        List<Mask> list = layer.f4195h;
        if (list != null && !list.isEmpty()) {
            h0 h0Var = new h0(layer.f4195h);
            this.f4229p = h0Var;
            for (e2.a aVar2 : (List) h0Var.f2145f) {
                aVar2.f8994a.add(this);
            }
            for (e2.a<?, ?> aVar3 : (List) this.f4229p.f2146j) {
                e(aVar3);
                aVar3.f8994a.add(this);
            }
        }
        if (this.f4228o.f4206t.isEmpty()) {
            r(true);
            return;
        }
        c cVar = new c(this.f4228o.f4206t);
        this.f4230q = cVar;
        cVar.f8995b = true;
        cVar.f8994a.add(new j2.a(this));
        r(this.f4230q.e().floatValue() == 1.0f);
        e(this.f4230q);
    }

    @Override // e2.a.b
    public void a() {
        this.n.invalidateSelf();
    }

    @Override // d2.c
    public void b(List<d2.c> list, List<d2.c> list2) {
    }

    @Override // g2.e
    public void c(d dVar, int i10, List<d> list, d dVar2) {
        a aVar = this.f4231r;
        if (aVar != null) {
            d a10 = dVar2.a(aVar.f4228o.f4191c);
            if (dVar.c(this.f4231r.f4228o.f4191c, i10)) {
                list.add(a10.g(this.f4231r));
            }
            if (dVar.f(this.f4228o.f4191c, i10)) {
                this.f4231r.o(dVar, dVar.d(this.f4231r.f4228o.f4191c, i10) + i10, list, a10);
            }
        }
        if (dVar.e(this.f4228o.f4191c, i10)) {
            if (!"__container".equals(this.f4228o.f4191c)) {
                dVar2 = dVar2.a(this.f4228o.f4191c);
                if (dVar.c(this.f4228o.f4191c, i10)) {
                    list.add(dVar2.g(this));
                }
            }
            if (dVar.f(this.f4228o.f4191c, i10)) {
                o(dVar, dVar.d(this.f4228o.f4191c, i10) + i10, list, dVar2);
            }
        }
    }

    @Override // d2.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f4222h.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        this.f4227m.set(matrix);
        if (z10) {
            List<a> list = this.f4233t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f4227m.preConcat(this.f4233t.get(size).f4235v.e());
                }
            } else {
                a aVar = this.f4232s;
                if (aVar != null) {
                    this.f4227m.preConcat(aVar.f4235v.e());
                }
            }
        }
        this.f4227m.preConcat(this.f4235v.e());
    }

    public void e(e2.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f4234u.add(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x018b, code lost:
        r7 = 0.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x027d  */
    @Override // d2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.a.f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // d2.c
    public String getName() {
        return this.f4228o.f4191c;
    }

    @Override // g2.e
    public <T> void h(T t2, n2.c cVar) {
        this.f4235v.c(t2, cVar);
    }

    public final void i() {
        if (this.f4233t != null) {
            return;
        }
        if (this.f4232s == null) {
            this.f4233t = Collections.emptyList();
            return;
        }
        this.f4233t = new ArrayList();
        for (a aVar = this.f4232s; aVar != null; aVar = aVar.f4232s) {
            this.f4233t.add(aVar);
        }
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.f4222h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f4221g);
        f1.a.b("Layer#clearLayer");
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i10);

    public boolean l() {
        h0 h0Var = this.f4229p;
        return (h0Var == null || ((List) h0Var.f2145f).isEmpty()) ? false : true;
    }

    public boolean m() {
        return this.f4231r != null;
    }

    public final void n(float f10) {
        u uVar = this.n.f3479f.f3448a;
        String str = this.f4228o.f4191c;
        if (uVar.f3548a) {
            m2.e eVar = uVar.f3550c.get(str);
            if (eVar == null) {
                eVar = new m2.e();
                uVar.f3550c.put(str, eVar);
            }
            float f11 = eVar.f12874a + f10;
            eVar.f12874a = f11;
            int i10 = eVar.f12875b + 1;
            eVar.f12875b = i10;
            if (i10 == Integer.MAX_VALUE) {
                eVar.f12874a = f11 / 2.0f;
                eVar.f12875b = i10 / 2;
            }
            if (str.equals("__container")) {
                for (u.a aVar : uVar.f3549b) {
                    aVar.a(f10);
                }
            }
        }
    }

    public void o(d dVar, int i10, List<d> list, d dVar2) {
    }

    public void p(boolean z10) {
        if (z10 && this.y == null) {
            this.y = new c2.a();
        }
        this.f4237x = z10;
    }

    public void q(float f10) {
        n nVar = this.f4235v;
        e2.a<Integer, Integer> aVar = nVar.f9030j;
        if (aVar != null) {
            aVar.i(f10);
        }
        e2.a<?, Float> aVar2 = nVar.f9033m;
        if (aVar2 != null) {
            aVar2.i(f10);
        }
        e2.a<?, Float> aVar3 = nVar.n;
        if (aVar3 != null) {
            aVar3.i(f10);
        }
        e2.a<PointF, PointF> aVar4 = nVar.f9026f;
        if (aVar4 != null) {
            aVar4.i(f10);
        }
        e2.a<?, PointF> aVar5 = nVar.f9027g;
        if (aVar5 != null) {
            aVar5.i(f10);
        }
        e2.a<n2.d, n2.d> aVar6 = nVar.f9028h;
        if (aVar6 != null) {
            aVar6.i(f10);
        }
        e2.a<Float, Float> aVar7 = nVar.f9029i;
        if (aVar7 != null) {
            aVar7.i(f10);
        }
        c cVar = nVar.f9031k;
        if (cVar != null) {
            cVar.i(f10);
        }
        c cVar2 = nVar.f9032l;
        if (cVar2 != null) {
            cVar2.i(f10);
        }
        if (this.f4229p != null) {
            for (int i10 = 0; i10 < ((List) this.f4229p.f2145f).size(); i10++) {
                ((e2.a) ((List) this.f4229p.f2145f).get(i10)).i(f10);
            }
        }
        float f11 = this.f4228o.f4200m;
        if (f11 != 0.0f) {
            f10 /= f11;
        }
        c cVar3 = this.f4230q;
        if (cVar3 != null) {
            cVar3.i(f10 / f11);
        }
        a aVar8 = this.f4231r;
        if (aVar8 != null) {
            aVar8.q(aVar8.f4228o.f4200m * f10);
        }
        for (int i11 = 0; i11 < this.f4234u.size(); i11++) {
            this.f4234u.get(i11).i(f10);
        }
    }

    public final void r(boolean z10) {
        if (z10 != this.f4236w) {
            this.f4236w = z10;
            this.n.invalidateSelf();
        }
    }
}
