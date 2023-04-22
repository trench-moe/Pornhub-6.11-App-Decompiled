package w6;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.source.g;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import w7.k;

/* loaded from: classes2.dex */
public final class k0 {
    public final d d;

    /* renamed from: e  reason: collision with root package name */
    public final j.a f16635e;

    /* renamed from: f  reason: collision with root package name */
    public final c.a f16636f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<c, b> f16637g;

    /* renamed from: h  reason: collision with root package name */
    public final Set<c> f16638h;

    /* renamed from: j  reason: collision with root package name */
    public boolean f16640j;

    /* renamed from: k  reason: collision with root package name */
    public j8.t f16641k;

    /* renamed from: i  reason: collision with root package name */
    public w7.k f16639i = new k.a(0, new Random());

    /* renamed from: b  reason: collision with root package name */
    public final IdentityHashMap<com.google.android.exoplayer2.source.h, c> f16633b = new IdentityHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Object, c> f16634c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f16632a = new ArrayList();

    /* loaded from: classes2.dex */
    public final class a implements com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.drm.c {

        /* renamed from: c  reason: collision with root package name */
        public final c f16642c;

        /* renamed from: f  reason: collision with root package name */
        public j.a f16643f;

        /* renamed from: j  reason: collision with root package name */
        public c.a f16644j;

        public a(c cVar) {
            this.f16643f = k0.this.f16635e;
            this.f16644j = k0.this.f16636f;
            this.f16642c = cVar;
        }

        @Override // com.google.android.exoplayer2.source.j
        public void A(int i10, i.a aVar, w7.c cVar, w7.d dVar) {
            if (a(i10, aVar)) {
                this.f16643f.k(cVar, dVar);
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public void B(int i10, i.a aVar, w7.c cVar, w7.d dVar) {
            if (a(i10, aVar)) {
                this.f16643f.g(cVar, dVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public void I(int i10, i.a aVar) {
            if (a(i10, aVar)) {
                this.f16644j.b();
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public /* synthetic */ void O(int i10, i.a aVar) {
        }

        @Override // com.google.android.exoplayer2.drm.c
        public void T(int i10, i.a aVar) {
            if (a(i10, aVar)) {
                this.f16644j.a();
            }
        }

        public final boolean a(int i10, i.a aVar) {
            c.a aVar2;
            i.a aVar3 = null;
            if (aVar != null) {
                c cVar = this.f16642c;
                int i11 = 0;
                while (true) {
                    if (i11 >= cVar.f16651c.size()) {
                        break;
                    } else if (cVar.f16651c.get(i11).d == aVar.d) {
                        aVar3 = aVar.b(Pair.create(cVar.f16650b, aVar.f16912a));
                        break;
                    } else {
                        i11++;
                    }
                }
                if (aVar3 == null) {
                    return false;
                }
            }
            int i12 = i10 + this.f16642c.d;
            j.a aVar4 = this.f16643f;
            if (aVar4.f6334a == i12) {
                if (!k8.c0.a(aVar4.f6335b, aVar3)) {
                }
                aVar2 = this.f16644j;
                if (aVar2.f6181a == i12 || !k8.c0.a(aVar2.f6182b, aVar3)) {
                    this.f16644j = k0.this.f16636f.g(i12, aVar3);
                }
                return true;
            }
            this.f16643f = k0.this.f16635e.l(i12, aVar3, 0L);
            aVar2 = this.f16644j;
            if (aVar2.f6181a == i12) {
            }
            this.f16644j = k0.this.f16636f.g(i12, aVar3);
            return true;
        }

        @Override // com.google.android.exoplayer2.drm.c
        public void c0(int i10, i.a aVar, int i11) {
            if (a(i10, aVar)) {
                this.f16644j.d(i11);
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public void d0(int i10, i.a aVar) {
            if (a(i10, aVar)) {
                this.f16644j.f();
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public void h0(int i10, i.a aVar, w7.c cVar, w7.d dVar, IOException iOException, boolean z10) {
            if (a(i10, aVar)) {
                this.f16643f.i(cVar, dVar, iOException, z10);
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public void i0(int i10, i.a aVar, w7.c cVar, w7.d dVar) {
            if (a(i10, aVar)) {
                this.f16643f.e(cVar, dVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public void k0(int i10, i.a aVar) {
            if (a(i10, aVar)) {
                this.f16644j.c();
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public void r(int i10, i.a aVar, w7.d dVar) {
            if (a(i10, aVar)) {
                this.f16643f.c(dVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public void t(int i10, i.a aVar, Exception exc) {
            if (a(i10, aVar)) {
                this.f16644j.e(exc);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final com.google.android.exoplayer2.source.i f16646a;

        /* renamed from: b  reason: collision with root package name */
        public final i.b f16647b;

        /* renamed from: c  reason: collision with root package name */
        public final a f16648c;

        public b(com.google.android.exoplayer2.source.i iVar, i.b bVar, a aVar) {
            this.f16646a = iVar;
            this.f16647b = bVar;
            this.f16648c = aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements i0 {

        /* renamed from: a  reason: collision with root package name */
        public final com.google.android.exoplayer2.source.g f16649a;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f16652e;

        /* renamed from: c  reason: collision with root package name */
        public final List<i.a> f16651c = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Object f16650b = new Object();

        public c(com.google.android.exoplayer2.source.i iVar, boolean z10) {
            this.f16649a = new com.google.android.exoplayer2.source.g(iVar, z10);
        }

        @Override // w6.i0
        public Object a() {
            return this.f16650b;
        }

        @Override // w6.i0
        public x0 b() {
            return this.f16649a.n;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
    }

    public k0(d dVar, x6.b0 b0Var, Handler handler) {
        this.d = dVar;
        j.a aVar = new j.a();
        this.f16635e = aVar;
        c.a aVar2 = new c.a();
        this.f16636f = aVar2;
        this.f16637g = new HashMap<>();
        this.f16638h = new HashSet();
        if (b0Var != null) {
            aVar.f6336c.add(new j.a.C0084a(handler, b0Var));
            aVar2.f6183c.add(new c.a.C0081a(handler, b0Var));
        }
    }

    public x0 a(int i10, List<c> list, w7.k kVar) {
        if (!list.isEmpty()) {
            this.f16639i = kVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f16632a.get(i11 - 1);
                    g.a aVar = cVar2.f16649a.n;
                    cVar.d = aVar.p() + cVar2.d;
                    cVar.f16652e = false;
                    cVar.f16651c.clear();
                } else {
                    cVar.d = 0;
                    cVar.f16652e = false;
                    cVar.f16651c.clear();
                }
                b(i11, cVar.f16649a.n.p());
                this.f16632a.add(i11, cVar);
                this.f16634c.put(cVar.f16650b, cVar);
                if (this.f16640j) {
                    g(cVar);
                    if (this.f16633b.isEmpty()) {
                        this.f16638h.add(cVar);
                    } else {
                        b bVar = this.f16637g.get(cVar);
                        if (bVar != null) {
                            bVar.f16646a.e(bVar.f16647b);
                        }
                    }
                }
            }
        }
        return c();
    }

    public final void b(int i10, int i11) {
        while (i10 < this.f16632a.size()) {
            this.f16632a.get(i10).d += i11;
            i10++;
        }
    }

    public x0 c() {
        if (this.f16632a.isEmpty()) {
            return x0.f16838a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f16632a.size(); i11++) {
            c cVar = this.f16632a.get(i11);
            cVar.d = i10;
            i10 += cVar.f16649a.n.p();
        }
        return new p0(this.f16632a, this.f16639i);
    }

    public final void d() {
        Iterator<c> it = this.f16638h.iterator();
        while (true) {
            while (it.hasNext()) {
                c next = it.next();
                if (next.f16651c.isEmpty()) {
                    b bVar = this.f16637g.get(next);
                    if (bVar != null) {
                        bVar.f16646a.e(bVar.f16647b);
                    }
                    it.remove();
                }
            }
            return;
        }
    }

    public int e() {
        return this.f16632a.size();
    }

    public final void f(c cVar) {
        if (cVar.f16652e && cVar.f16651c.isEmpty()) {
            b remove = this.f16637g.remove(cVar);
            Objects.requireNonNull(remove);
            remove.f16646a.b(remove.f16647b);
            remove.f16646a.d(remove.f16648c);
            remove.f16646a.h(remove.f16648c);
            this.f16638h.remove(cVar);
        }
    }

    public final void g(c cVar) {
        com.google.android.exoplayer2.source.g gVar = cVar.f16649a;
        i.b bVar = new i.b() { // from class: w6.j0
            @Override // com.google.android.exoplayer2.source.i.b
            public final void a(com.google.android.exoplayer2.source.i iVar, x0 x0Var) {
                ((w) k0.this.d).f16803u.e(22);
            }
        };
        a aVar = new a(cVar);
        this.f16637g.put(cVar, new b(gVar, bVar, aVar));
        Handler handler = new Handler(k8.c0.o(), null);
        Objects.requireNonNull(gVar);
        j.a aVar2 = gVar.f6284c;
        Objects.requireNonNull(aVar2);
        aVar2.f6336c.add(new j.a.C0084a(handler, aVar));
        Handler handler2 = new Handler(k8.c0.o(), null);
        c.a aVar3 = gVar.d;
        Objects.requireNonNull(aVar3);
        aVar3.f6183c.add(new c.a.C0081a(handler2, aVar));
        gVar.m(bVar, this.f16641k);
    }

    public void h(com.google.android.exoplayer2.source.h hVar) {
        c remove = this.f16633b.remove(hVar);
        Objects.requireNonNull(remove);
        remove.f16649a.k(hVar);
        remove.f16651c.remove(((com.google.android.exoplayer2.source.f) hVar).f6316c);
        if (!this.f16633b.isEmpty()) {
            d();
        }
        f(remove);
    }

    public final void i(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c remove = this.f16632a.remove(i12);
            this.f16634c.remove(remove.f16650b);
            b(i12, -remove.f16649a.n.p());
            remove.f16652e = true;
            if (this.f16640j) {
                f(remove);
            }
        }
    }
}
