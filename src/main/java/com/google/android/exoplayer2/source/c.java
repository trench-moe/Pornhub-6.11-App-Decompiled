package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import j8.t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import k8.c0;
import w6.x0;

/* loaded from: classes.dex */
public abstract class c<T> extends com.google.android.exoplayer2.source.a {

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<T, b<T>> f6295g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public Handler f6296h;

    /* renamed from: i  reason: collision with root package name */
    public t f6297i;

    /* loaded from: classes.dex */
    public final class a implements j, com.google.android.exoplayer2.drm.c {

        /* renamed from: c  reason: collision with root package name */
        public final T f6298c;

        /* renamed from: f  reason: collision with root package name */
        public j.a f6299f;

        /* renamed from: j  reason: collision with root package name */
        public c.a f6300j;

        public a(T t2) {
            this.f6299f = c.this.o(null);
            this.f6300j = c.this.d.g(0, null);
            this.f6298c = t2;
        }

        @Override // com.google.android.exoplayer2.source.j
        public void A(int i10, i.a aVar, w7.c cVar, w7.d dVar) {
            if (a(i10, aVar)) {
                this.f6299f.k(cVar, b(dVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public void B(int i10, i.a aVar, w7.c cVar, w7.d dVar) {
            if (a(i10, aVar)) {
                this.f6299f.g(cVar, b(dVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public void I(int i10, i.a aVar) {
            if (a(i10, aVar)) {
                this.f6300j.b();
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public /* synthetic */ void O(int i10, i.a aVar) {
        }

        @Override // com.google.android.exoplayer2.drm.c
        public void T(int i10, i.a aVar) {
            if (a(i10, aVar)) {
                this.f6300j.a();
            }
        }

        public final boolean a(int i10, i.a aVar) {
            i.a aVar2;
            c.a aVar3;
            if (aVar != null) {
                aVar2 = c.this.u(this.f6298c, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            Objects.requireNonNull(c.this);
            j.a aVar4 = this.f6299f;
            if (aVar4.f6334a == i10) {
                if (!c0.a(aVar4.f6335b, aVar2)) {
                }
                aVar3 = this.f6300j;
                if (aVar3.f6181a == i10 || !c0.a(aVar3.f6182b, aVar2)) {
                    this.f6300j = new c.a(c.this.d.f6183c, i10, aVar2);
                }
                return true;
            }
            this.f6299f = c.this.f6284c.l(i10, aVar2, 0L);
            aVar3 = this.f6300j;
            if (aVar3.f6181a == i10) {
            }
            this.f6300j = new c.a(c.this.d.f6183c, i10, aVar2);
            return true;
        }

        public final w7.d b(w7.d dVar) {
            c cVar = c.this;
            long j10 = dVar.f16910f;
            Objects.requireNonNull(cVar);
            c cVar2 = c.this;
            long j11 = dVar.f16911g;
            Objects.requireNonNull(cVar2);
            return (j10 == dVar.f16910f && j11 == dVar.f16911g) ? dVar : new w7.d(dVar.f16906a, dVar.f16907b, dVar.f16908c, dVar.d, dVar.f16909e, j10, j11);
        }

        @Override // com.google.android.exoplayer2.drm.c
        public void c0(int i10, i.a aVar, int i11) {
            if (a(i10, aVar)) {
                this.f6300j.d(i11);
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public void d0(int i10, i.a aVar) {
            if (a(i10, aVar)) {
                this.f6300j.f();
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public void h0(int i10, i.a aVar, w7.c cVar, w7.d dVar, IOException iOException, boolean z10) {
            if (a(i10, aVar)) {
                this.f6299f.i(cVar, b(dVar), iOException, z10);
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public void i0(int i10, i.a aVar, w7.c cVar, w7.d dVar) {
            if (a(i10, aVar)) {
                this.f6299f.e(cVar, b(dVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public void k0(int i10, i.a aVar) {
            if (a(i10, aVar)) {
                this.f6300j.c();
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public void r(int i10, i.a aVar, w7.d dVar) {
            if (a(i10, aVar)) {
                this.f6299f.c(b(dVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public void t(int i10, i.a aVar, Exception exc) {
            if (a(i10, aVar)) {
                this.f6300j.e(exc);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final i f6302a;

        /* renamed from: b  reason: collision with root package name */
        public final i.b f6303b;

        /* renamed from: c  reason: collision with root package name */
        public final c<T>.a f6304c;

        public b(i iVar, i.b bVar, c<T>.a aVar) {
            this.f6302a = iVar;
            this.f6303b = bVar;
            this.f6304c = aVar;
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public void i() {
        for (b<T> bVar : this.f6295g.values()) {
            bVar.f6302a.i();
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public void p() {
        for (b<T> bVar : this.f6295g.values()) {
            bVar.f6302a.e(bVar.f6303b);
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public void q() {
        for (b<T> bVar : this.f6295g.values()) {
            bVar.f6302a.n(bVar.f6303b);
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public void t() {
        for (b<T> bVar : this.f6295g.values()) {
            bVar.f6302a.b(bVar.f6303b);
            bVar.f6302a.d(bVar.f6304c);
            bVar.f6302a.h(bVar.f6304c);
        }
        this.f6295g.clear();
    }

    public i.a u(T t2, i.a aVar) {
        return aVar;
    }

    public abstract void v(T t2, i iVar, x0 x0Var);

    public final void w(final T t2, i iVar) {
        k8.a.c(!this.f6295g.containsKey(t2));
        i.b bVar = new i.b() { // from class: w7.a
            @Override // com.google.android.exoplayer2.source.i.b
            public final void a(com.google.android.exoplayer2.source.i iVar2, x0 x0Var) {
                com.google.android.exoplayer2.source.c.this.v(t2, iVar2, x0Var);
            }
        };
        a aVar = new a(t2);
        this.f6295g.put(t2, new b<>(iVar, bVar, aVar));
        Handler handler = this.f6296h;
        Objects.requireNonNull(handler);
        iVar.c(handler, aVar);
        Handler handler2 = this.f6296h;
        Objects.requireNonNull(handler2);
        iVar.g(handler2, aVar);
        iVar.m(bVar, this.f6297i);
        if (!this.f6283b.isEmpty()) {
            return;
        }
        iVar.e(bVar);
    }
}
