package d2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import e2.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d implements e, m, a.b, g2.e {

    /* renamed from: a  reason: collision with root package name */
    public Paint f8646a;

    /* renamed from: b  reason: collision with root package name */
    public RectF f8647b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f8648c;
    public final Path d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f8649e;

    /* renamed from: f  reason: collision with root package name */
    public final String f8650f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8651g;

    /* renamed from: h  reason: collision with root package name */
    public final List<c> f8652h;

    /* renamed from: i  reason: collision with root package name */
    public final b2.l f8653i;

    /* renamed from: j  reason: collision with root package name */
    public List<m> f8654j;

    /* renamed from: k  reason: collision with root package name */
    public e2.n f8655k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(b2.l r8, com.airbnb.lottie.model.layer.a r9, i2.i r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.f10486a
            boolean r4 = r10.f10488c
            java.util.List<i2.b> r0 = r10.f10487b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = 0
        L11:
            int r6 = r0.size()
            if (r2 >= r6) goto L29
            java.lang.Object r6 = r0.get(r2)
            i2.b r6 = (i2.b) r6
            d2.c r6 = r6.a(r8, r9)
            if (r6 == 0) goto L26
            r5.add(r6)
        L26:
            int r2 = r2 + 1
            goto L11
        L29:
            java.util.List<i2.b> r10 = r10.f10487b
        L2b:
            int r0 = r10.size()
            if (r1 >= r0) goto L42
            java.lang.Object r0 = r10.get(r1)
            i2.b r0 = (i2.b) r0
            boolean r2 = r0 instanceof h2.i
            if (r2 == 0) goto L3f
            h2.i r0 = (h2.i) r0
            r6 = r0
            goto L44
        L3f:
            int r1 = r1 + 1
            goto L2b
        L42:
            r10 = 0
            r6 = r10
        L44:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.d.<init>(b2.l, com.airbnb.lottie.model.layer.a, i2.i):void");
    }

    public d(b2.l lVar, com.airbnb.lottie.model.layer.a aVar, String str, boolean z10, List<c> list, h2.i iVar) {
        this.f8646a = new c2.a();
        this.f8647b = new RectF();
        this.f8648c = new Matrix();
        this.d = new Path();
        this.f8649e = new RectF();
        this.f8650f = str;
        this.f8653i = lVar;
        this.f8651g = z10;
        this.f8652h = list;
        if (iVar != null) {
            e2.n nVar = new e2.n(iVar);
            this.f8655k = nVar;
            nVar.a(aVar);
            this.f8655k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            }
            ((j) arrayList.get(size2)).e(list.listIterator(list.size()));
        }
    }

    @Override // e2.a.b
    public void a() {
        this.f8653i.invalidateSelf();
    }

    @Override // d2.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(this.f8652h.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.f8652h.size() - 1; size >= 0; size--) {
            c cVar = this.f8652h.get(size);
            cVar.b(arrayList, this.f8652h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // g2.e
    public void c(g2.d dVar, int i10, List<g2.d> list, g2.d dVar2) {
        if (dVar.e(this.f8650f, i10) || "__container".equals(this.f8650f)) {
            if (!"__container".equals(this.f8650f)) {
                dVar2 = dVar2.a(this.f8650f);
                if (dVar.c(this.f8650f, i10)) {
                    list.add(dVar2.g(this));
                }
            }
            if (dVar.f(this.f8650f, i10)) {
                int d = dVar.d(this.f8650f, i10) + i10;
                for (int i11 = 0; i11 < this.f8652h.size(); i11++) {
                    c cVar = this.f8652h.get(i11);
                    if (cVar instanceof g2.e) {
                        ((g2.e) cVar).c(dVar, d, list, dVar2);
                    }
                }
            }
        }
    }

    @Override // d2.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f8648c.set(matrix);
        e2.n nVar = this.f8655k;
        if (nVar != null) {
            this.f8648c.preConcat(nVar.e());
        }
        this.f8649e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f8652h.size() - 1; size >= 0; size--) {
            c cVar = this.f8652h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).d(this.f8649e, this.f8648c, z10);
                rectF.union(this.f8649e);
            }
        }
    }

    public List<m> e() {
        if (this.f8654j == null) {
            this.f8654j = new ArrayList();
            for (int i10 = 0; i10 < this.f8652h.size(); i10++) {
                c cVar = this.f8652h.get(i10);
                if (cVar instanceof m) {
                    this.f8654j.add((m) cVar);
                }
            }
        }
        return this.f8654j;
    }

    @Override // d2.e
    public void f(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        e2.a<Integer, Integer> aVar;
        if (this.f8651g) {
            return;
        }
        this.f8648c.set(matrix);
        e2.n nVar = this.f8655k;
        if (nVar != null) {
            this.f8648c.preConcat(nVar.e());
            i10 = (int) (((((this.f8655k.f9030j == null ? 100 : aVar.e().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z11 = false;
        if (this.f8653i.H) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= this.f8652h.size()) {
                    z10 = false;
                    break;
                } else if ((this.f8652h.get(i11) instanceof e) && (i12 = i12 + 1) >= 2) {
                    z10 = true;
                    break;
                } else {
                    i11++;
                }
            }
            if (z10 && i10 != 255) {
                z11 = true;
            }
        }
        if (z11) {
            this.f8647b.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(this.f8647b, this.f8648c, true);
            this.f8646a.setAlpha(i10);
            m2.g.f(canvas, this.f8647b, this.f8646a, 31);
        }
        if (z11) {
            i10 = 255;
        }
        for (int size = this.f8652h.size() - 1; size >= 0; size--) {
            c cVar = this.f8652h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).f(canvas, this.f8648c, i10);
            }
        }
        if (z11) {
            canvas.restore();
        }
    }

    @Override // d2.m
    public Path g() {
        this.f8648c.reset();
        e2.n nVar = this.f8655k;
        if (nVar != null) {
            this.f8648c.set(nVar.e());
        }
        this.d.reset();
        if (this.f8651g) {
            return this.d;
        }
        for (int size = this.f8652h.size() - 1; size >= 0; size--) {
            c cVar = this.f8652h.get(size);
            if (cVar instanceof m) {
                this.d.addPath(((m) cVar).g(), this.f8648c);
            }
        }
        return this.d;
    }

    @Override // d2.c
    public String getName() {
        return this.f8650f;
    }

    @Override // g2.e
    public <T> void h(T t2, n2.c cVar) {
        e2.n nVar = this.f8655k;
        if (nVar != null) {
            nVar.c(t2, cVar);
        }
    }
}
