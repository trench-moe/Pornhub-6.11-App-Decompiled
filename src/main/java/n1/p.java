package n1;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import n1.h;
import n1.i;
import n1.k;

/* loaded from: classes2.dex */
public class p<T> extends i<T> implements k.a {
    public final n<T> C;
    public h.a<T> D;

    /* loaded from: classes2.dex */
    public class a extends h.a<T> {
        public a() {
        }

        @Override // n1.h.a
        public void a(int i10, h<T> hVar) {
            Objects.requireNonNull(hVar);
            if (hVar == h.d) {
                p.this.g();
            } else if (p.this.o()) {
            } else {
                if (i10 != 0 && i10 != 3) {
                    throw new IllegalArgumentException(a1.a.j("unexpected resultType", i10));
                }
                List<T> list = hVar.f13222a;
                if (p.this.f13227m.j() == 0) {
                    p pVar = p.this;
                    k<T> kVar = pVar.f13227m;
                    int i11 = hVar.f13223b;
                    int i12 = pVar.f13226j.f13232a;
                    Objects.requireNonNull(kVar);
                    int size = ((i12 - 1) + list.size()) / i12;
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = i13 * i12;
                        int i15 = i13 + 1;
                        List<T> subList = list.subList(i14, Math.min(list.size(), i15 * i12));
                        if (i13 == 0) {
                            kVar.m(0, subList, (list.size() + 0) - subList.size(), i11);
                        } else {
                            kVar.o(i14 + 0, subList, null);
                        }
                        i13 = i15;
                    }
                    pVar.u(0, kVar.size());
                } else {
                    p pVar2 = p.this;
                    k<T> kVar2 = pVar2.f13227m;
                    int i16 = hVar.f13223b;
                    Objects.requireNonNull(pVar2.f13226j);
                    p pVar3 = p.this;
                    int i17 = pVar3.f13229u;
                    int i18 = kVar2.f13238c;
                    int i19 = kVar2.f13242t / 2;
                    kVar2.o(i16, list, pVar3);
                }
                Objects.requireNonNull(p.this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f13257c;

        public b(int i10) {
            this.f13257c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (p.this.o()) {
                return;
            }
            p pVar = p.this;
            int i10 = pVar.f13226j.f13232a;
            if (pVar.C.d()) {
                p.this.g();
                return;
            }
            int i11 = this.f13257c * i10;
            int min = Math.min(i10, p.this.f13227m.size() - i11);
            p pVar2 = p.this;
            pVar2.C.g(3, i11, min, pVar2.f13224c, pVar2.D);
        }
    }

    public p(n nVar, Executor executor, Executor executor2, i.b bVar, int i10) {
        super(new k(), executor, executor2, bVar);
        this.D = new a();
        this.C = nVar;
        int i11 = this.f13226j.f13232a;
        this.n = i10;
        if (nVar.d()) {
            g();
            return;
        }
        int max = Math.max(this.f13226j.d / i11, 2) * i11;
        nVar.f(true, Math.max(0, ((i10 - (max / 2)) / i11) * i11), max, i11, this.f13224c, this.D);
    }

    @Override // n1.k.a
    public void b(int i10, int i11) {
        s(i10, i11);
    }

    @Override // n1.i
    public void h(i<T> iVar, i.a aVar) {
        k<T> kVar = iVar.f13227m;
        if (kVar.isEmpty() || this.f13227m.size() != kVar.size()) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        int i10 = this.f13226j.f13232a;
        k<T> kVar2 = this.f13227m;
        int i11 = kVar2.f13238c / i10;
        int j10 = kVar2.j();
        int i12 = 0;
        while (i12 < j10) {
            int i13 = i12 + i11;
            int i14 = 0;
            while (i14 < this.f13227m.j()) {
                int i15 = i13 + i14;
                if (!this.f13227m.l(i10, i15) || kVar.l(i10, i15)) {
                    break;
                }
                i14++;
            }
            if (i14 > 0) {
                aVar.a(i13 * i10, i10 * i14);
                i12 += i14 - 1;
            }
            i12++;
        }
    }

    @Override // n1.i
    public e<?, T> j() {
        return this.C;
    }

    @Override // n1.i
    public Object l() {
        return Integer.valueOf(this.n);
    }

    @Override // n1.i
    public boolean m() {
        return false;
    }

    @Override // n1.i
    public void r(int i10) {
        k<T> kVar = this.f13227m;
        i.b bVar = this.f13226j;
        int i11 = bVar.f13233b;
        int i12 = bVar.f13232a;
        int i13 = kVar.f13243u;
        if (i12 != i13) {
            if (i12 < i13) {
                throw new IllegalArgumentException("Page size cannot be reduced");
            }
            if (kVar.f13239f.size() != 1 || kVar.f13240j != 0) {
                throw new IllegalArgumentException("Page size can change only if last page is only one present");
            }
            kVar.f13243u = i12;
        }
        int size = kVar.size();
        int i14 = kVar.f13243u;
        int i15 = ((size + i14) - 1) / i14;
        int max = Math.max((i10 - i11) / i14, 0);
        int min = Math.min((i10 + i11) / kVar.f13243u, i15 - 1);
        kVar.b(max, min);
        int i16 = kVar.f13238c / kVar.f13243u;
        while (max <= min) {
            int i17 = max - i16;
            if (kVar.f13239f.get(i17) == null) {
                kVar.f13239f.set(i17, k.f13237z);
                x(max);
            }
            max++;
        }
    }

    public void x(int i10) {
        this.f13225f.execute(new b(i10));
    }
}
