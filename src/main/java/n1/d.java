package n1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import n1.h;
import n1.i;
import n1.k;

/* loaded from: classes2.dex */
public class d<K, V> extends i<V> implements k.a {
    public final n1.c<K, V> C;
    public int D;
    public int E;
    public int F;
    public int G;
    public h.a<V> H;

    /* loaded from: classes2.dex */
    public class a extends h.a<V> {
        public a() {
        }

        @Override // n1.h.a
        public void a(int i10, h<V> hVar) {
            ArrayList<List<T>> arrayList;
            Objects.requireNonNull(hVar);
            if (hVar == h.d) {
                d.this.g();
            } else if (d.this.o()) {
            } else {
                List<V> list = hVar.f13222a;
                if (i10 == 0) {
                    d dVar = d.this;
                    k<T> kVar = dVar.f13227m;
                    kVar.m(0, list, 0, hVar.f13223b);
                    dVar.x(kVar.size());
                    d dVar2 = d.this;
                    if (dVar2.n == -1) {
                        dVar2.n = (list.size() / 2) + hVar.f13223b + 0;
                    }
                } else {
                    d dVar3 = d.this;
                    int i11 = dVar3.n;
                    k<T> kVar2 = dVar3.f13227m;
                    int i12 = kVar2.f13238c;
                    int i13 = kVar2.f13242t / 2;
                    if (i10 == 1) {
                        Objects.requireNonNull(kVar2);
                        int size = list.size();
                        if (size == 0) {
                            dVar3.E = 2;
                        } else {
                            if (kVar2.f13243u > 0) {
                                int size2 = ((List) kVar2.f13239f.get(arrayList.size() - 1)).size();
                                int i14 = kVar2.f13243u;
                                if (size2 == i14) {
                                    if (size > i14) {
                                    }
                                }
                                kVar2.f13243u = -1;
                            }
                            kVar2.f13239f.add(list);
                            kVar2.n += size;
                            kVar2.f13242t += size;
                            int min = Math.min(kVar2.f13240j, size);
                            int i15 = size - min;
                            if (min != 0) {
                                kVar2.f13240j -= min;
                            }
                            kVar2.y += size;
                            dVar3.y((kVar2.f13238c + kVar2.f13242t) - size, min, i15);
                        }
                    } else if (i10 != 2) {
                        throw new IllegalArgumentException(a1.a.j("unexpected resultType ", i10));
                    } else {
                        Objects.requireNonNull(kVar2);
                        int size3 = list.size();
                        if (size3 == 0) {
                            dVar3.D = 2;
                        } else {
                            int i16 = kVar2.f13243u;
                            if (i16 > 0 && size3 != i16) {
                                if (kVar2.f13239f.size() != 1 || size3 <= kVar2.f13243u) {
                                    kVar2.f13243u = -1;
                                } else {
                                    kVar2.f13243u = size3;
                                }
                            }
                            kVar2.f13239f.add(0, list);
                            kVar2.n += size3;
                            kVar2.f13242t += size3;
                            int min2 = Math.min(kVar2.f13238c, size3);
                            int i17 = size3 - min2;
                            if (min2 != 0) {
                                kVar2.f13238c -= min2;
                            }
                            kVar2.f13241m -= i17;
                            kVar2.f13244w += size3;
                            dVar3.z(kVar2.f13238c, min2, i17);
                        }
                    }
                    Objects.requireNonNull(d.this);
                }
                Objects.requireNonNull(d.this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f13191c;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f13192f;

        public b(int i10, Object obj) {
            this.f13191c = i10;
            this.f13192f = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (d.this.o()) {
                return;
            }
            if (d.this.C.d()) {
                d.this.g();
                return;
            }
            d dVar = d.this;
            dVar.C.g(this.f13191c, this.f13192f, dVar.f13226j.f13232a, dVar.f13224c, dVar.H);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f13194c;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f13195f;

        public c(int i10, Object obj) {
            this.f13194c = i10;
            this.f13195f = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (d.this.o()) {
                return;
            }
            if (d.this.C.d()) {
                d.this.g();
                return;
            }
            d dVar = d.this;
            dVar.C.f(this.f13194c, this.f13195f, dVar.f13226j.f13232a, dVar.f13224c, dVar.H);
        }
    }

    public d(n1.c cVar, Executor executor, Executor executor2, i.b bVar, Object obj, int i10) {
        super(new k(), executor, executor2, bVar);
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = new a();
        this.C = cVar;
        this.n = i10;
        if (cVar.d()) {
            g();
        } else {
            i.b bVar2 = this.f13226j;
            cVar.h(obj, bVar2.d, bVar2.f13232a, bVar2.f13234c, this.f13224c, this.H);
        }
        if (cVar.j()) {
            Objects.requireNonNull(this.f13226j);
        }
    }

    public final void A() {
        if (this.E != 0) {
            return;
        }
        this.E = 1;
        k<T> kVar = this.f13227m;
        this.f13225f.execute(new c(((kVar.f13238c + kVar.f13242t) - 1) + kVar.f13241m, kVar.h()));
    }

    public final void B() {
        if (this.D != 0) {
            return;
        }
        this.D = 1;
        k<T> kVar = this.f13227m;
        this.f13225f.execute(new b(kVar.f13238c + kVar.f13241m, ((List) kVar.f13239f.get(0)).get(0)));
    }

    @Override // n1.k.a
    public void b(int i10, int i11) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    @Override // n1.i
    public void h(i<V> iVar, i.a aVar) {
        k<V> kVar = iVar.f13227m;
        k<T> kVar2 = this.f13227m;
        int i10 = kVar2.y - kVar.y;
        int i11 = kVar2.f13244w - kVar.f13244w;
        int i12 = kVar.f13240j;
        int i13 = kVar.f13238c;
        if (kVar.isEmpty() || i10 < 0 || i11 < 0 || this.f13227m.f13240j != Math.max(i12 - i10, 0) || this.f13227m.f13238c != Math.max(i13 - i11, 0) || this.f13227m.f13242t != kVar.f13242t + i10 + i11) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        if (i10 != 0) {
            int min = Math.min(i12, i10);
            int i14 = i10 - min;
            int i15 = kVar.f13238c + kVar.f13242t;
            if (min != 0) {
                aVar.a(i15, min);
            }
            if (i14 != 0) {
                aVar.b(i15 + min, i14);
            }
        }
        if (i11 != 0) {
            int min2 = Math.min(i13, i11);
            int i16 = i11 - min2;
            if (min2 != 0) {
                aVar.a(i13, min2);
            }
            if (i16 != 0) {
                aVar.b(0, i16);
            }
        }
    }

    @Override // n1.i
    public e<?, V> j() {
        return this.C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n1.i
    public Object l() {
        return this.C.i(this.n, this.f13228t);
    }

    @Override // n1.i
    public boolean m() {
        return true;
    }

    @Override // n1.i
    public void r(int i10) {
        int i11 = this.f13226j.f13233b;
        k<T> kVar = this.f13227m;
        int i12 = kVar.f13238c;
        int i13 = ((i10 + i11) + 1) - (i12 + kVar.f13242t);
        int max = Math.max(i11 - (i10 - i12), this.F);
        this.F = max;
        if (max > 0) {
            B();
        }
        int max2 = Math.max(i13, this.G);
        this.G = max2;
        if (max2 > 0) {
            A();
        }
    }

    public void x(int i10) {
        u(0, i10);
        int i11 = this.f13227m.f13238c;
    }

    public void y(int i10, int i11, int i12) {
        int i13 = (this.G - i11) - i12;
        this.G = i13;
        this.E = 0;
        if (i13 > 0) {
            A();
        }
        s(i10, i11);
        u(i10 + i11, i12);
    }

    public void z(int i10, int i11, int i12) {
        int i13 = (this.F - i11) - i12;
        this.F = i13;
        this.D = 0;
        if (i13 > 0) {
            B();
        }
        s(i10, i11);
        u(0, i12);
        this.n += i12;
        this.f13230w += i12;
        this.y += i12;
    }
}
