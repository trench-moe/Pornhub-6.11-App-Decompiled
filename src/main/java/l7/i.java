package l7;

import java.util.Collections;
import java.util.List;
import l7.d0;
import w6.y;

/* loaded from: classes2.dex */
public final class i implements j {

    /* renamed from: a  reason: collision with root package name */
    public final List<d0.a> f12447a;

    /* renamed from: b  reason: collision with root package name */
    public final c7.w[] f12448b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12449c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f12450e;

    /* renamed from: f  reason: collision with root package name */
    public long f12451f;

    public i(List<d0.a> list) {
        this.f12447a = list;
        this.f12448b = new c7.w[list.size()];
    }

    public final boolean a(k8.t tVar, int i10) {
        if (tVar.a() == 0) {
            return false;
        }
        if (tVar.s() != i10) {
            this.f12449c = false;
        }
        this.d--;
        return this.f12449c;
    }

    @Override // l7.j
    public void b(k8.t tVar) {
        c7.w[] wVarArr;
        if (this.f12449c) {
            if (this.d == 2 && !a(tVar, 32)) {
                return;
            }
            if (this.d == 1 && !a(tVar, 0)) {
                return;
            }
            int i10 = tVar.f12010b;
            int a10 = tVar.a();
            for (c7.w wVar : this.f12448b) {
                tVar.D(i10);
                wVar.a(tVar, a10);
            }
            this.f12450e += a10;
        }
    }

    @Override // l7.j
    public void c() {
        this.f12449c = false;
    }

    @Override // l7.j
    public void d(c7.j jVar, d0.d dVar) {
        for (int i10 = 0; i10 < this.f12448b.length; i10++) {
            d0.a aVar = this.f12447a.get(i10);
            dVar.a();
            c7.w r10 = jVar.r(dVar.c(), 3);
            y.b bVar = new y.b();
            bVar.f16870a = dVar.b();
            bVar.f16879k = "application/dvbsubs";
            bVar.f16881m = Collections.singletonList(aVar.f12396b);
            bVar.f16872c = aVar.f12395a;
            r10.d(bVar.a());
            this.f12448b[i10] = r10;
        }
    }

    @Override // l7.j
    public void e() {
        if (this.f12449c) {
            for (c7.w wVar : this.f12448b) {
                wVar.b(this.f12451f, 1, this.f12450e, 0, null);
            }
            this.f12449c = false;
        }
    }

    @Override // l7.j
    public void f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f12449c = true;
        this.f12451f = j10;
        this.f12450e = 0;
        this.d = 2;
    }
}
