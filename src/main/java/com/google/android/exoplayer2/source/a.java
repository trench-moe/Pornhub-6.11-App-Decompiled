package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import j8.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import w6.x0;

/* loaded from: classes.dex */
public abstract class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<i.b> f6282a = new ArrayList<>(1);

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<i.b> f6283b = new HashSet<>(1);

    /* renamed from: c  reason: collision with root package name */
    public final j.a f6284c = new j.a();
    public final c.a d = new c.a();

    /* renamed from: e  reason: collision with root package name */
    public Looper f6285e;

    /* renamed from: f  reason: collision with root package name */
    public x0 f6286f;

    @Override // com.google.android.exoplayer2.source.i
    public final void b(i.b bVar) {
        this.f6282a.remove(bVar);
        if (!this.f6282a.isEmpty()) {
            e(bVar);
            return;
        }
        this.f6285e = null;
        this.f6286f = null;
        this.f6283b.clear();
        t();
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void c(Handler handler, j jVar) {
        j.a aVar = this.f6284c;
        Objects.requireNonNull(aVar);
        aVar.f6336c.add(new j.a.C0084a(handler, jVar));
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void d(j jVar) {
        j.a aVar = this.f6284c;
        Iterator<j.a.C0084a> it = aVar.f6336c.iterator();
        while (true) {
            while (it.hasNext()) {
                j.a.C0084a next = it.next();
                if (next.f6338b == jVar) {
                    aVar.f6336c.remove(next);
                }
            }
            return;
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void e(i.b bVar) {
        boolean z10 = !this.f6283b.isEmpty();
        this.f6283b.remove(bVar);
        if (z10 && this.f6283b.isEmpty()) {
            p();
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void g(Handler handler, com.google.android.exoplayer2.drm.c cVar) {
        c.a aVar = this.d;
        Objects.requireNonNull(aVar);
        aVar.f6183c.add(new c.a.C0081a(handler, cVar));
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void h(com.google.android.exoplayer2.drm.c cVar) {
        c.a aVar = this.d;
        Iterator<c.a.C0081a> it = aVar.f6183c.iterator();
        while (it.hasNext()) {
            c.a.C0081a next = it.next();
            if (next.f6185b == cVar) {
                aVar.f6183c.remove(next);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // com.google.android.exoplayer2.source.i
    public /* synthetic */ x0 l() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    @Override // com.google.android.exoplayer2.source.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(com.google.android.exoplayer2.source.i.b r8, j8.t r9) {
        /*
            r7 = this;
            android.os.Looper r3 = android.os.Looper.myLooper()
            r0 = r3
            android.os.Looper r1 = r7.f6285e
            r6 = 2
            if (r1 == 0) goto L12
            r5 = 7
            if (r1 != r0) goto Le
            goto L13
        Le:
            r5 = 6
            r1 = 0
            r5 = 5
            goto L15
        L12:
            r6 = 5
        L13:
            r3 = 1
            r1 = r3
        L15:
            k8.a.c(r1)
            w6.x0 r1 = r7.f6286f
            java.util.ArrayList<com.google.android.exoplayer2.source.i$b> r2 = r7.f6282a
            r6 = 1
            r2.add(r8)
            android.os.Looper r2 = r7.f6285e
            r4 = 1
            if (r2 != 0) goto L32
            r7.f6285e = r0
            r6 = 5
            java.util.HashSet<com.google.android.exoplayer2.source.i$b> r0 = r7.f6283b
            r0.add(r8)
            r7.r(r9)
            r4 = 1
            goto L3d
        L32:
            if (r1 == 0) goto L3c
            r7.n(r8)
            r4 = 4
            r8.a(r7, r1)
            r4 = 4
        L3c:
            r5 = 6
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.a.m(com.google.android.exoplayer2.source.i$b, j8.t):void");
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void n(i.b bVar) {
        Objects.requireNonNull(this.f6285e);
        boolean isEmpty = this.f6283b.isEmpty();
        this.f6283b.add(bVar);
        if (isEmpty) {
            q();
        }
    }

    public final j.a o(i.a aVar) {
        return this.f6284c.l(0, null, 0L);
    }

    public void p() {
    }

    public void q() {
    }

    public abstract void r(t tVar);

    public final void s(x0 x0Var) {
        this.f6286f = x0Var;
        Iterator<i.b> it = this.f6282a.iterator();
        while (it.hasNext()) {
            it.next().a(this, x0Var);
        }
    }

    public abstract void t();
}
