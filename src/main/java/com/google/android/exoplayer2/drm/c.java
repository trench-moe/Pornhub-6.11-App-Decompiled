package com.google.android.exoplayer2.drm;

import android.os.Handler;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.source.i;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k8.c0;
import w.s;

/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f6181a;

        /* renamed from: b  reason: collision with root package name */
        public final i.a f6182b;

        /* renamed from: c  reason: collision with root package name */
        public final CopyOnWriteArrayList<C0081a> f6183c;

        /* renamed from: com.google.android.exoplayer2.drm.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0081a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f6184a;

            /* renamed from: b  reason: collision with root package name */
            public c f6185b;

            public C0081a(Handler handler, c cVar) {
                this.f6184a = handler;
                this.f6185b = cVar;
            }
        }

        public a() {
            this.f6183c = new CopyOnWriteArrayList<>();
            this.f6181a = 0;
            this.f6182b = null;
        }

        public a(CopyOnWriteArrayList<C0081a> copyOnWriteArrayList, int i10, i.a aVar) {
            this.f6183c = copyOnWriteArrayList;
            this.f6181a = i10;
            this.f6182b = aVar;
        }

        public void a() {
            Iterator<C0081a> it = this.f6183c.iterator();
            while (it.hasNext()) {
                C0081a next = it.next();
                c0.C(next.f6184a, new r6.c(this, next.f6185b, 1));
            }
        }

        public void b() {
            Iterator<C0081a> it = this.f6183c.iterator();
            while (it.hasNext()) {
                C0081a next = it.next();
                c0.C(next.f6184a, new k0.b(this, next.f6185b, 5));
            }
        }

        public void c() {
            Iterator<C0081a> it = this.f6183c.iterator();
            while (it.hasNext()) {
                C0081a next = it.next();
                c0.C(next.f6184a, new s(this, next.f6185b, 2));
            }
        }

        public void d(final int i10) {
            Iterator<C0081a> it = this.f6183c.iterator();
            while (it.hasNext()) {
                C0081a next = it.next();
                final c cVar = next.f6185b;
                c0.C(next.f6184a, new Runnable() { // from class: b7.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.a aVar = c.a.this;
                        com.google.android.exoplayer2.drm.c cVar2 = cVar;
                        int i11 = i10;
                        cVar2.O(aVar.f6181a, aVar.f6182b);
                        cVar2.c0(aVar.f6181a, aVar.f6182b, i11);
                    }
                });
            }
        }

        public void e(final Exception exc) {
            Iterator<C0081a> it = this.f6183c.iterator();
            while (it.hasNext()) {
                C0081a next = it.next();
                final c cVar = next.f6185b;
                c0.C(next.f6184a, new Runnable() { // from class: b7.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.a aVar = c.a.this;
                        cVar.t(aVar.f6181a, aVar.f6182b, exc);
                    }
                });
            }
        }

        public void f() {
            Iterator<C0081a> it = this.f6183c.iterator();
            while (it.hasNext()) {
                C0081a next = it.next();
                c0.C(next.f6184a, new s4.e(this, next.f6185b, 2));
            }
        }

        public a g(int i10, i.a aVar) {
            return new a(this.f6183c, i10, aVar);
        }
    }

    void I(int i10, i.a aVar);

    @Deprecated
    void O(int i10, i.a aVar);

    void T(int i10, i.a aVar);

    void c0(int i10, i.a aVar, int i11);

    void d0(int i10, i.a aVar);

    void k0(int i10, i.a aVar);

    void t(int i10, i.a aVar, Exception exc);
}
