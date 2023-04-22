package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.i;
import j8.t;
import k8.c0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import w6.x0;

/* loaded from: classes.dex */
public final class g extends c<Void> {

    /* renamed from: j  reason: collision with root package name */
    public final i f6323j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f6324k;

    /* renamed from: l  reason: collision with root package name */
    public final x0.c f6325l;

    /* renamed from: m  reason: collision with root package name */
    public final x0.b f6326m;
    public a n;

    /* renamed from: o  reason: collision with root package name */
    public f f6327o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6328p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6329q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6330r;

    /* loaded from: classes.dex */
    public static final class a extends w7.b {

        /* renamed from: e  reason: collision with root package name */
        public static final Object f6331e = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final Object f6332c;
        public final Object d;

        public a(x0 x0Var, Object obj, Object obj2) {
            super(x0Var);
            this.f6332c = obj;
            this.d = obj2;
        }

        @Override // w7.b, w6.x0
        public int b(Object obj) {
            Object obj2;
            x0 x0Var = this.f16903b;
            if (f6331e.equals(obj) && (obj2 = this.d) != null) {
                obj = obj2;
            }
            return x0Var.b(obj);
        }

        @Override // w7.b, w6.x0
        public x0.b g(int i10, x0.b bVar, boolean z10) {
            this.f16903b.g(i10, bVar, z10);
            if (c0.a(bVar.f16840b, this.d) && z10) {
                bVar.f16840b = f6331e;
            }
            return bVar;
        }

        @Override // w7.b, w6.x0
        public Object m(int i10) {
            Object m10 = this.f16903b.m(i10);
            return c0.a(m10, this.d) ? f6331e : m10;
        }

        @Override // w7.b, w6.x0
        public x0.c o(int i10, x0.c cVar, long j10) {
            this.f16903b.o(i10, cVar, j10);
            if (c0.a(cVar.f16847a, this.f6332c)) {
                cVar.f16847a = x0.c.f16845r;
            }
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends x0 {

        /* renamed from: b  reason: collision with root package name */
        public final w6.c0 f6333b;

        public b(w6.c0 c0Var) {
            this.f6333b = c0Var;
        }

        @Override // w6.x0
        public int b(Object obj) {
            return obj == a.f6331e ? 0 : -1;
        }

        @Override // w6.x0
        public x0.b g(int i10, x0.b bVar, boolean z10) {
            Object obj = null;
            Integer num = z10 ? 0 : null;
            if (z10) {
                obj = a.f6331e;
            }
            bVar.f(num, obj, 0, -9223372036854775807L, 0L, x7.a.f18048g, true);
            return bVar;
        }

        @Override // w6.x0
        public int i() {
            return 1;
        }

        @Override // w6.x0
        public Object m(int i10) {
            return a.f6331e;
        }

        @Override // w6.x0
        public x0.c o(int i10, x0.c cVar, long j10) {
            cVar.d(x0.c.f16845r, this.f6333b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f16857l = true;
            return cVar;
        }

        @Override // w6.x0
        public int p() {
            return 1;
        }
    }

    public g(i iVar, boolean z10) {
        this.f6323j = iVar;
        this.f6324k = z10 && iVar.j();
        this.f6325l = new x0.c();
        this.f6326m = new x0.b();
        x0 l10 = iVar.l();
        if (l10 == null) {
            this.n = new a(new b(iVar.f()), x0.c.f16845r, a.f6331e);
            return;
        }
        this.n = new a(l10, null, null);
        this.f6330r = true;
    }

    @Override // com.google.android.exoplayer2.source.i
    public w6.c0 f() {
        return this.f6323j.f();
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.i
    public void i() {
    }

    @Override // com.google.android.exoplayer2.source.i
    public void k(h hVar) {
        ((f) hVar).l();
        if (hVar == this.f6327o) {
            this.f6327o = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public void r(t tVar) {
        this.f6297i = tVar;
        this.f6296h = c0.j();
        if (!this.f6324k) {
            this.f6328p = true;
            w(null, this.f6323j);
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void t() {
        this.f6329q = false;
        this.f6328p = false;
        super.t();
    }

    @Override // com.google.android.exoplayer2.source.c
    public i.a u(Void r52, i.a aVar) {
        Object obj = aVar.f16912a;
        Object obj2 = this.n.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.f6331e;
        }
        return aVar.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v(java.lang.Void r12, com.google.android.exoplayer2.source.i r13, w6.x0 r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.g.v(java.lang.Object, com.google.android.exoplayer2.source.i, w6.x0):void");
    }

    @Override // com.google.android.exoplayer2.source.i
    /* renamed from: x */
    public f a(i.a aVar, j8.i iVar, long j10) {
        f fVar = new f(aVar, iVar, j10);
        fVar.q(this.f6323j);
        if (this.f6329q) {
            Object obj = aVar.f16912a;
            if (this.n.d != null && obj.equals(a.f6331e)) {
                obj = this.n.d;
            }
            fVar.i(aVar.b(obj));
        } else {
            this.f6327o = fVar;
            if (!this.f6328p) {
                this.f6328p = true;
                w(null, this.f6323j);
            }
        }
        return fVar;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    public final void y(long j10) {
        f fVar = this.f6327o;
        int b10 = this.n.b(fVar.f6316c.f16912a);
        if (b10 == -1) {
            return;
        }
        long j11 = this.n.f(b10, this.f6326m).d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        fVar.y = j10;
    }
}
