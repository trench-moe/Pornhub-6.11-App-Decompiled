package com.google.android.exoplayer2.source;

import android.os.Handler;
import j8.t;
import w6.c0;
import w6.x0;

/* loaded from: classes.dex */
public interface i {

    /* loaded from: classes.dex */
    public static final class a extends w7.e {
        public a(Object obj) {
            super(obj);
        }

        public a(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public a(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public a(w7.e eVar) {
            super(eVar);
        }

        public a b(Object obj) {
            return new a(this.f16912a.equals(obj) ? this : new w7.e(obj, this.f16913b, this.f16914c, this.d, this.f16915e));
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(i iVar, x0 x0Var);
    }

    h a(a aVar, j8.i iVar, long j10);

    void b(b bVar);

    void c(Handler handler, j jVar);

    void d(j jVar);

    void e(b bVar);

    c0 f();

    void g(Handler handler, com.google.android.exoplayer2.drm.c cVar);

    void h(com.google.android.exoplayer2.drm.c cVar);

    void i();

    boolean j();

    void k(h hVar);

    x0 l();

    void m(b bVar, t tVar);

    void n(b bVar);
}
