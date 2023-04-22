package d2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import e2.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class p implements e, m, j, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f8723a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Path f8724b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final b2.l f8725c;
    public final com.airbnb.lottie.model.layer.a d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8726e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8727f;

    /* renamed from: g  reason: collision with root package name */
    public final e2.a<Float, Float> f8728g;

    /* renamed from: h  reason: collision with root package name */
    public final e2.a<Float, Float> f8729h;

    /* renamed from: i  reason: collision with root package name */
    public final e2.n f8730i;

    /* renamed from: j  reason: collision with root package name */
    public d f8731j;

    public p(b2.l lVar, com.airbnb.lottie.model.layer.a aVar, i2.f fVar) {
        this.f8725c = lVar;
        this.d = aVar;
        this.f8726e = fVar.f10474a;
        this.f8727f = fVar.f10477e;
        e2.a<Float, Float> a10 = fVar.f10475b.a();
        this.f8728g = a10;
        aVar.e(a10);
        a10.f8994a.add(this);
        e2.a<Float, Float> a11 = fVar.f10476c.a();
        this.f8729h = a11;
        aVar.e(a11);
        a11.f8994a.add(this);
        h2.i iVar = fVar.d;
        Objects.requireNonNull(iVar);
        e2.n nVar = new e2.n(iVar);
        this.f8730i = nVar;
        nVar.a(aVar);
        nVar.b(this);
    }

    @Override // e2.a.b
    public void a() {
        this.f8725c.invalidateSelf();
    }

    @Override // d2.c
    public void b(List<c> list, List<c> list2) {
        this.f8731j.b(list, list2);
    }

    @Override // g2.e
    public void c(g2.d dVar, int i10, List<g2.d> list, g2.d dVar2) {
        m2.f.f(dVar, i10, list, dVar2, this);
    }

    @Override // d2.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f8731j.d(rectF, matrix, z10);
    }

    @Override // d2.j
    public void e(ListIterator<c> listIterator) {
        if (this.f8731j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f8731j = new d(this.f8725c, this.d, "Repeater", this.f8727f, arrayList, null);
    }

    @Override // d2.e
    public void f(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = this.f8728g.e().floatValue();
        float floatValue2 = this.f8729h.e().floatValue();
        float floatValue3 = this.f8730i.f9033m.e().floatValue() / 100.0f;
        float floatValue4 = this.f8730i.n.e().floatValue() / 100.0f;
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            this.f8723a.set(matrix);
            float f10 = i11;
            this.f8723a.preConcat(this.f8730i.f(f10 + floatValue2));
            this.f8731j.f(canvas, this.f8723a, (int) (m2.f.e(floatValue3, floatValue4, f10 / floatValue) * i10));
        }
    }

    @Override // d2.m
    public Path g() {
        Path g10 = this.f8731j.g();
        this.f8724b.reset();
        float floatValue = this.f8728g.e().floatValue();
        float floatValue2 = this.f8729h.e().floatValue();
        for (int i10 = ((int) floatValue) - 1; i10 >= 0; i10--) {
            this.f8723a.set(this.f8730i.f(i10 + floatValue2));
            this.f8724b.addPath(g10, this.f8723a);
        }
        return this.f8724b;
    }

    @Override // d2.c
    public String getName() {
        return this.f8726e;
    }

    @Override // g2.e
    public <T> void h(T t2, n2.c cVar) {
        if (this.f8730i.c(t2, cVar)) {
            return;
        }
        if (t2 == b2.q.f3533s) {
            this.f8728g.j(cVar);
        } else if (t2 == b2.q.f3534t) {
            this.f8729h.j(cVar);
        }
    }
}
