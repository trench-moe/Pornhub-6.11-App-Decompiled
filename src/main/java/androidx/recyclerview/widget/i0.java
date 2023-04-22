package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final p.g<RecyclerView.z, a> f3023a = new p.g<>();

    /* renamed from: b  reason: collision with root package name */
    public final p.d<RecyclerView.z> f3024b = new p.d<>(10);

    /* loaded from: classes.dex */
    public static class a {
        public static m0.c<a> d = new m0.d(20);

        /* renamed from: a  reason: collision with root package name */
        public int f3025a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.i.c f3026b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.i.c f3027c;

        public static a a() {
            a aVar = (a) ((m0.d) d).b();
            if (aVar == null) {
                aVar = new a();
            }
            return aVar;
        }

        public static void b(a aVar) {
            aVar.f3025a = 0;
            aVar.f3026b = null;
            aVar.f3027c = null;
            ((m0.d) d).a(aVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public void a(RecyclerView.z zVar) {
        a orDefault = this.f3023a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f3023a.put(zVar, orDefault);
        }
        orDefault.f3025a |= 1;
    }

    public void b(RecyclerView.z zVar, RecyclerView.i.c cVar) {
        a orDefault = this.f3023a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f3023a.put(zVar, orDefault);
        }
        orDefault.f3027c = cVar;
        orDefault.f3025a |= 8;
    }

    public void c(RecyclerView.z zVar, RecyclerView.i.c cVar) {
        a orDefault = this.f3023a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f3023a.put(zVar, orDefault);
        }
        orDefault.f3026b = cVar;
        orDefault.f3025a |= 4;
    }

    public boolean d(RecyclerView.z zVar) {
        a orDefault = this.f3023a.getOrDefault(zVar, null);
        return (orDefault == null || (orDefault.f3025a & 1) == 0) ? false : true;
    }

    public final RecyclerView.i.c e(RecyclerView.z zVar, int i10) {
        a l10;
        RecyclerView.i.c cVar;
        int e10 = this.f3023a.e(zVar);
        if (e10 >= 0 && (l10 = this.f3023a.l(e10)) != null) {
            int i11 = l10.f3025a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                l10.f3025a = i12;
                if (i10 == 4) {
                    cVar = l10.f3026b;
                } else if (i10 != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                } else {
                    cVar = l10.f3027c;
                }
                if ((i12 & 12) == 0) {
                    this.f3023a.j(e10);
                    a.b(l10);
                }
                return cVar;
            }
        }
        return null;
    }

    public void f(RecyclerView.z zVar) {
        a orDefault = this.f3023a.getOrDefault(zVar, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f3025a &= -2;
    }

    public void g(RecyclerView.z zVar) {
        int k10 = this.f3024b.k() - 1;
        while (true) {
            if (k10 < 0) {
                break;
            } else if (zVar == this.f3024b.l(k10)) {
                p.d<RecyclerView.z> dVar = this.f3024b;
                Object[] objArr = dVar.f13747j;
                Object obj = objArr[k10];
                Object obj2 = p.d.n;
                if (obj != obj2) {
                    objArr[k10] = obj2;
                    dVar.f13745c = true;
                }
            } else {
                k10--;
            }
        }
        a remove = this.f3023a.remove(zVar);
        if (remove != null) {
            a.b(remove);
        }
    }
}
