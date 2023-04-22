package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k8.c0;
import w6.y;

/* loaded from: classes.dex */
public interface j {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f6334a;

        /* renamed from: b  reason: collision with root package name */
        public final i.a f6335b;

        /* renamed from: c  reason: collision with root package name */
        public final CopyOnWriteArrayList<C0084a> f6336c;
        public final long d;

        /* renamed from: com.google.android.exoplayer2.source.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0084a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f6337a;

            /* renamed from: b  reason: collision with root package name */
            public j f6338b;

            public C0084a(Handler handler, j jVar) {
                this.f6337a = handler;
                this.f6338b = jVar;
            }
        }

        public a() {
            this.f6336c = new CopyOnWriteArrayList<>();
            this.f6334a = 0;
            this.f6335b = null;
            this.d = 0L;
        }

        public a(CopyOnWriteArrayList<C0084a> copyOnWriteArrayList, int i10, i.a aVar, long j10) {
            this.f6336c = copyOnWriteArrayList;
            this.f6334a = i10;
            this.f6335b = aVar;
            this.d = j10;
        }

        public final long a(long j10) {
            long c10 = w6.g.c(j10);
            if (c10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.d + c10;
        }

        public void b(int i10, y yVar, int i11, Object obj, long j10) {
            c(new w7.d(1, i10, yVar, i11, null, a(j10), -9223372036854775807L));
        }

        public void c(w7.d dVar) {
            Iterator<C0084a> it = this.f6336c.iterator();
            while (it.hasNext()) {
                C0084a next = it.next();
                c0.C(next.f6337a, new androidx.emoji2.text.e(this, next.f6338b, dVar, 1));
            }
        }

        public void d(w7.c cVar, int i10, int i11, y yVar, int i12, Object obj, long j10, long j11) {
            e(cVar, new w7.d(i10, i11, null, i12, null, a(j10), a(j11)));
        }

        public void e(final w7.c cVar, final w7.d dVar) {
            Iterator<C0084a> it = this.f6336c.iterator();
            while (it.hasNext()) {
                C0084a next = it.next();
                final j jVar = next.f6338b;
                c0.C(next.f6337a, new Runnable() { // from class: w7.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.a aVar = j.a.this;
                        jVar.i0(aVar.f6334a, aVar.f6335b, cVar, dVar);
                    }
                });
            }
        }

        public void f(w7.c cVar, int i10, int i11, y yVar, int i12, Object obj, long j10, long j11) {
            g(cVar, new w7.d(i10, i11, yVar, i12, null, a(j10), a(j11)));
        }

        public void g(w7.c cVar, w7.d dVar) {
            Iterator<C0084a> it = this.f6336c.iterator();
            while (it.hasNext()) {
                C0084a next = it.next();
                c0.C(next.f6337a, new q6.a(this, next.f6338b, cVar, dVar, 1));
            }
        }

        public void h(w7.c cVar, int i10, int i11, y yVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            i(cVar, new w7.d(i10, i11, yVar, i12, null, a(j10), a(j11)), iOException, z10);
        }

        public void i(final w7.c cVar, final w7.d dVar, final IOException iOException, final boolean z10) {
            Iterator<C0084a> it = this.f6336c.iterator();
            while (it.hasNext()) {
                C0084a next = it.next();
                final j jVar = next.f6338b;
                c0.C(next.f6337a, new Runnable() { // from class: w7.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.a aVar = j.a.this;
                        jVar.h0(aVar.f6334a, aVar.f6335b, cVar, dVar, iOException, z10);
                    }
                });
            }
        }

        public void j(w7.c cVar, int i10, int i11, y yVar, int i12, Object obj, long j10, long j11) {
            k(cVar, new w7.d(i10, i11, yVar, i12, null, a(j10), a(j11)));
        }

        public void k(final w7.c cVar, final w7.d dVar) {
            Iterator<C0084a> it = this.f6336c.iterator();
            while (it.hasNext()) {
                C0084a next = it.next();
                final j jVar = next.f6338b;
                c0.C(next.f6337a, new Runnable() { // from class: w7.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.a aVar = j.a.this;
                        jVar.A(aVar.f6334a, aVar.f6335b, cVar, dVar);
                    }
                });
            }
        }

        public a l(int i10, i.a aVar, long j10) {
            return new a(this.f6336c, i10, aVar, j10);
        }
    }

    void A(int i10, i.a aVar, w7.c cVar, w7.d dVar);

    void B(int i10, i.a aVar, w7.c cVar, w7.d dVar);

    void h0(int i10, i.a aVar, w7.c cVar, w7.d dVar, IOException iOException, boolean z10);

    void i0(int i10, i.a aVar, w7.c cVar, w7.d dVar);

    void r(int i10, i.a aVar, w7.d dVar);
}
