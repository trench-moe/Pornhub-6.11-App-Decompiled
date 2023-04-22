package x6;

import android.util.SparseArray;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.source.i;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import j1.g0;
import j8.b;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import k8.m;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import w6.d0;
import w6.m0;
import w6.n0;
import w6.x0;
import x2.e1;
import x6.c0;

/* loaded from: classes2.dex */
public class b0 implements n0.e, com.google.android.exoplayer2.audio.a, l8.r, com.google.android.exoplayer2.source.j, b.a, com.google.android.exoplayer2.drm.c {

    /* renamed from: c  reason: collision with root package name */
    public final k8.b f17955c;

    /* renamed from: f  reason: collision with root package name */
    public final x0.b f17956f;

    /* renamed from: j  reason: collision with root package name */
    public final x0.c f17957j;

    /* renamed from: m  reason: collision with root package name */
    public final a f17958m;
    public final SparseArray<c0.a> n;

    /* renamed from: t  reason: collision with root package name */
    public k8.m<c0> f17959t;

    /* renamed from: u  reason: collision with root package name */
    public n0 f17960u;

    /* renamed from: w  reason: collision with root package name */
    public k8.i f17961w;
    public boolean y;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final x0.b f17962a;

        /* renamed from: b  reason: collision with root package name */
        public ImmutableList<i.a> f17963b = ImmutableList.w();

        /* renamed from: c  reason: collision with root package name */
        public ImmutableMap<i.a, x0> f17964c = ImmutableMap.g();
        public i.a d;

        /* renamed from: e  reason: collision with root package name */
        public i.a f17965e;

        /* renamed from: f  reason: collision with root package name */
        public i.a f17966f;

        public a(x0.b bVar) {
            this.f17962a = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.google.android.exoplayer2.source.i.a b(w6.n0 r11, com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.i.a> r12, com.google.android.exoplayer2.source.i.a r13, w6.x0.b r14) {
            /*
                w6.x0 r0 = r11.M()
                int r10 = r11.r()
                r1 = r10
                boolean r2 = r0.q()
                r3 = 0
                java.lang.String r10 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                if (r2 == 0) goto L14
                r2 = r3
                goto L19
            L14:
                r10 = 1
                java.lang.Object r2 = r0.m(r1)
            L19:
                boolean r4 = r11.a()
                if (r4 != 0) goto L3d
                boolean r10 = r0.q()
                r4 = r10
                if (r4 == 0) goto L28
                r10 = 4
                goto L3e
            L28:
                r10 = 4
                w6.x0$b r0 = r0.f(r1, r14)
                long r4 = r11.getCurrentPosition()
                long r4 = w6.g.b(r4)
                long r6 = r14.f16842e
                long r4 = r4 - r6
                int r14 = r0.b(r4)
                goto L40
            L3d:
                r10 = 4
            L3e:
                r10 = -1
                r14 = r10
            L40:
                r10 = 0
                r0 = r10
            L42:
                int r1 = r12.size()
                if (r0 >= r1) goto L6e
                r10 = 6
                java.lang.Object r10 = r12.get(r0)
                r1 = r10
                com.google.android.exoplayer2.source.i$a r1 = (com.google.android.exoplayer2.source.i.a) r1
                r10 = 1
                boolean r10 = r11.a()
                r6 = r10
                int r10 = r11.G()
                r7 = r10
                int r10 = r11.w()
                r8 = r10
                r4 = r1
                r5 = r2
                r9 = r14
                boolean r4 = c(r4, r5, r6, r7, r8, r9)
                if (r4 == 0) goto L6a
                return r1
            L6a:
                r10 = 2
                int r0 = r0 + 1
                goto L42
            L6e:
                r10 = 1
                boolean r10 = r12.isEmpty()
                r12 = r10
                if (r12 == 0) goto L92
                r10 = 7
                if (r13 == 0) goto L92
                r10 = 2
                boolean r10 = r11.a()
                r6 = r10
                int r7 = r11.G()
                int r8 = r11.w()
                r4 = r13
                r5 = r2
                r9 = r14
                boolean r10 = c(r4, r5, r6, r7, r8, r9)
                r11 = r10
                if (r11 == 0) goto L92
                return r13
            L92:
                r10 = 3
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: x6.b0.a.b(w6.n0, com.google.common.collect.ImmutableList, com.google.android.exoplayer2.source.i$a, w6.x0$b):com.google.android.exoplayer2.source.i$a");
        }

        public static boolean c(i.a aVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (aVar.f16912a.equals(obj)) {
                if (z10) {
                    if (aVar.f16913b == i10) {
                        if (aVar.f16914c != i11) {
                        }
                        return true;
                    }
                }
                if (z10 || aVar.f16913b != -1 || aVar.f16915e != i12) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final void a(ImmutableMap.a<i.a, x0> aVar, i.a aVar2, x0 x0Var) {
            if (aVar2 == null) {
                return;
            }
            if (x0Var.b(aVar2.f16912a) != -1) {
                aVar.c(aVar2, x0Var);
                return;
            }
            x0 x0Var2 = this.f17964c.get(aVar2);
            if (x0Var2 != null) {
                aVar.c(aVar2, x0Var2);
            }
        }

        public final void d(x0 x0Var) {
            ImmutableMap.a<i.a, x0> aVar = new ImmutableMap.a<>(4);
            if (this.f17963b.isEmpty()) {
                a(aVar, this.f17965e, x0Var);
                if (!jb.d.a(this.f17966f, this.f17965e)) {
                    a(aVar, this.f17966f, x0Var);
                }
                if (!jb.d.a(this.d, this.f17965e) && !jb.d.a(this.d, this.f17966f)) {
                    a(aVar, this.d, x0Var);
                    this.f17964c = aVar.a();
                }
            } else {
                for (int i10 = 0; i10 < this.f17963b.size(); i10++) {
                    a(aVar, this.f17963b.get(i10), x0Var);
                }
                if (!this.f17963b.contains(this.d)) {
                    a(aVar, this.d, x0Var);
                }
            }
            this.f17964c = aVar.a();
        }
    }

    public b0(k8.b bVar) {
        this.f17955c = bVar;
        this.f17959t = new k8.m<>(new CopyOnWriteArraySet(), k8.c0.o(), bVar, k0.c.y);
        x0.b bVar2 = new x0.b();
        this.f17956f = bVar2;
        this.f17957j = new x0.c();
        this.f17958m = new a(bVar2);
        this.n = new SparseArray<>();
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void A(int i10, i.a aVar, w7.c cVar, w7.d dVar) {
        c0.a p02 = p0(i10, aVar);
        v vVar = new v(p02, cVar, dVar, 1);
        this.n.put(1000, p02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1000, vVar);
        mVar.a();
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void B(int i10, i.a aVar, w7.c cVar, w7.d dVar) {
        c0.a p02 = p0(i10, aVar);
        q6.b bVar = new q6.b(p02, cVar, dVar, 4);
        this.n.put(1001, p02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1001, bVar);
        mVar.a();
    }

    @Override // w6.n0.c
    public /* synthetic */ void C(n0 n0Var, n0.d dVar) {
    }

    @Override // l8.r
    public final void D(final int i10, final long j10) {
        final c0.a q02 = q0();
        m.a<c0> aVar = new m.a() { // from class: x6.c
            @Override // k8.m.a
            public final void invoke(Object obj) {
                ((c0) obj).u(c0.a.this, i10, j10);
            }
        };
        this.n.put(1023, q02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1023, aVar);
        mVar.a();
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void E(z6.d dVar) {
        c0.a q02 = q0();
        s3.b bVar = new s3.b(q02, dVar);
        this.n.put(1014, q02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1014, bVar);
        mVar.a();
    }

    @Override // a7.b
    public /* synthetic */ void F(int i10, boolean z10) {
    }

    @Override // w6.n0.c
    public final void G(final boolean z10, final int i10) {
        final c0.a m02 = m0();
        m.a<c0> aVar = new m.a() { // from class: x6.r
            @Override // k8.m.a
            public final void invoke(Object obj) {
                ((c0) obj).c(c0.a.this, z10, i10);
            }
        };
        this.n.put(-1, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(-1, aVar);
        mVar.a();
    }

    @Override // l8.r
    public final void H(z6.d dVar) {
        c0.a r02 = r0();
        s3.a aVar = new s3.a(r02, dVar, 3);
        this.n.put(1020, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1020, aVar);
        mVar.a();
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final void I(int i10, i.a aVar) {
        c0.a p02 = p0(i10, aVar);
        s4.f fVar = new s4.f(p02, 9);
        this.n.put(1034, p02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1034, fVar);
        mVar.a();
    }

    @Override // l8.l
    public /* synthetic */ void J(int i10, int i11, int i12, float f10) {
    }

    @Override // l8.r
    public final void K(final Object obj, final long j10) {
        final c0.a r02 = r0();
        m.a<c0> aVar = new m.a() { // from class: x6.i
            @Override // k8.m.a
            public final void invoke(Object obj2) {
                ((c0) obj2).g0(c0.a.this, obj, j10);
            }
        };
        this.n.put(1027, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1027, aVar);
        mVar.a();
    }

    @Override // w6.n0.c
    public final void L(int i10) {
        c0.a m02 = m0();
        x6.a aVar = new x6.a(m02, i10, 2);
        this.n.put(9, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(9, aVar);
        mVar.a();
    }

    @Override // a7.b
    public /* synthetic */ void M(a7.a aVar) {
    }

    @Override // l8.l
    public /* synthetic */ void N() {
    }

    @Override // com.google.android.exoplayer2.drm.c
    public /* synthetic */ void O(int i10, i.a aVar) {
    }

    @Override // w6.n0.c
    public void P(n0.b bVar) {
        c0.a m02 = m0();
        s6.r rVar = new s6.r(m02, bVar, 3);
        this.n.put(14, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(14, rVar);
        mVar.a();
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void Q(Exception exc) {
        c0.a r02 = r0();
        u uVar = new u(r02, exc, 1);
        this.n.put(1018, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1018, uVar);
        mVar.a();
    }

    @Override // y7.i
    public /* synthetic */ void R(List list) {
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void S(final long j10) {
        final c0.a r02 = r0();
        m.a<c0> aVar = new m.a() { // from class: x6.g
            @Override // k8.m.a
            public final void invoke(Object obj) {
                ((c0) obj).l(c0.a.this, j10);
            }
        };
        this.n.put(1011, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1011, aVar);
        mVar.a();
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final void T(int i10, i.a aVar) {
        c0.a p02 = p0(i10, aVar);
        t tVar = new t(p02, 2);
        this.n.put(1031, p02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1031, tVar);
        mVar.a();
    }

    @Override // l8.r
    public final void U(z6.d dVar) {
        c0.a q02 = q0();
        e1 e1Var = new e1(q02, dVar, 7);
        this.n.put(1025, q02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1025, e1Var);
        mVar.a();
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void V(Exception exc) {
        c0.a r02 = r0();
        s3.a aVar = new s3.a(r02, exc, 2);
        this.n.put(1037, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1037, aVar);
        mVar.a();
    }

    @Override // w6.n0.c
    public final void W(w7.o oVar, i8.j jVar) {
        c0.a m02 = m0();
        q6.b bVar = new q6.b(m02, oVar, jVar, 3);
        this.n.put(2, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(2, bVar);
        mVar.a();
    }

    @Override // l8.r
    public final void X(Exception exc) {
        c0.a r02 = r0();
        u uVar = new u(r02, exc, 0);
        this.n.put(1038, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1038, uVar);
        mVar.a();
    }

    @Override // w6.n0.c
    public final void Y(final boolean z10, final int i10) {
        final c0.a m02 = m0();
        m.a<c0> aVar = new m.a() { // from class: x6.s
            @Override // k8.m.a
            public final void invoke(Object obj) {
                ((c0) obj).r(c0.a.this, z10, i10);
            }
        };
        this.n.put(6, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(6, aVar);
        mVar.a();
    }

    @Override // w6.n0.c
    public final void Z(m0 m0Var) {
        c0.a m02 = m0();
        r3.b bVar = new r3.b(m02, m0Var, 3);
        this.n.put(13, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(13, bVar);
        mVar.a();
    }

    @Override // y6.f
    public final void a(final boolean z10) {
        final c0.a r02 = r0();
        m.a<c0> aVar = new m.a() { // from class: x6.p
            @Override // k8.m.a
            public final void invoke(Object obj) {
                ((c0) obj).a0(c0.a.this, z10);
            }
        };
        this.n.put(1017, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1017, aVar);
        mVar.a();
    }

    @Override // com.google.android.exoplayer2.audio.a
    public /* synthetic */ void a0(w6.y yVar) {
    }

    @Override // l8.l
    public final void b(l8.s sVar) {
        c0.a r02 = r0();
        e1 e1Var = new e1(r02, sVar, 5);
        this.n.put(1028, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1028, e1Var);
        mVar.a();
    }

    @Override // l8.l
    public void b0(final int i10, final int i11) {
        final c0.a r02 = r0();
        m.a<c0> aVar = new m.a() { // from class: x6.b
            @Override // k8.m.a
            public final void invoke(Object obj) {
                ((c0) obj).q(c0.a.this, i10, i11);
            }
        };
        this.n.put(1029, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1029, aVar);
        mVar.a();
    }

    @Override // l8.r
    public final void c(String str) {
        c0.a r02 = r0();
        w wVar = new w(r02, str, 0);
        this.n.put(1024, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1024, wVar);
        mVar.a();
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final void c0(int i10, i.a aVar, int i11) {
        c0.a p02 = p0(i10, aVar);
        x6.a aVar2 = new x6.a(p02, i11, 1);
        this.n.put(1030, p02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1030, aVar2);
        mVar.a();
    }

    @Override // w6.n0.c
    public final void d(final int i10) {
        final c0.a m02 = m0();
        m.a<c0> aVar = new m.a() { // from class: x6.a0
            @Override // k8.m.a
            public final void invoke(Object obj) {
                ((c0) obj).l0(c0.a.this, i10);
            }
        };
        this.n.put(7, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(7, aVar);
        mVar.a();
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final void d0(int i10, i.a aVar) {
        c0.a p02 = p0(i10, aVar);
        t tVar = new t(p02, 1);
        this.n.put(1035, p02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1035, tVar);
        mVar.a();
    }

    @Override // w6.n0.c
    public final void e(x0 x0Var, int i10) {
        a aVar = this.f17958m;
        n0 n0Var = this.f17960u;
        Objects.requireNonNull(n0Var);
        aVar.d = a.b(n0Var, aVar.f17963b, aVar.f17965e, aVar.f17962a);
        aVar.d(n0Var.M());
        c0.a m02 = m0();
        x6.a aVar2 = new x6.a(m02, i10, 0);
        this.n.put(0, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(0, aVar2);
        mVar.a();
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void e0(z6.d dVar) {
        c0.a r02 = r0();
        g0 g0Var = new g0(r02, dVar, 5);
        this.n.put(1008, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1008, g0Var);
        mVar.a();
    }

    @Override // w6.n0.c
    public /* synthetic */ void f(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void f0(final int i10, final long j10, final long j11) {
        final c0.a r02 = r0();
        m.a<c0> aVar = new m.a() { // from class: x6.d
            @Override // k8.m.a
            public final void invoke(Object obj) {
                ((c0) obj).T(c0.a.this, i10, j10, j11);
            }
        };
        this.n.put(1012, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1012, aVar);
        mVar.a();
    }

    @Override // w6.n0.c
    public void g(d0 d0Var) {
        c0.a m02 = m0();
        s6.r rVar = new s6.r(m02, d0Var, 2);
        this.n.put(15, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(15, rVar);
        mVar.a();
    }

    @Override // w6.n0.c
    public /* synthetic */ void g0(PlaybackException playbackException) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void h(int i10) {
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void h0(int i10, i.a aVar, final w7.c cVar, final w7.d dVar, final IOException iOException, final boolean z10) {
        final c0.a p02 = p0(i10, aVar);
        m.a<c0> aVar2 = new m.a() { // from class: x6.o
            @Override // k8.m.a
            public final void invoke(Object obj) {
                ((c0) obj).m0(c0.a.this, cVar, dVar, iOException, z10);
            }
        };
        this.n.put(1003, p02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1003, aVar2);
        mVar.a();
    }

    @Override // w6.n0.c
    @Deprecated
    public final void i(List<o7.a> list) {
        c0.a m02 = m0();
        g0 g0Var = new g0(m02, list, 4);
        this.n.put(3, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(3, g0Var);
        mVar.a();
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void i0(int i10, i.a aVar, final w7.c cVar, final w7.d dVar) {
        final c0.a p02 = p0(i10, aVar);
        m.a<c0> aVar2 = new m.a() { // from class: x6.n
            @Override // k8.m.a
            public final void invoke(Object obj) {
                ((c0) obj).L(c0.a.this, cVar, dVar);
            }
        };
        this.n.put(1002, p02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1002, aVar2);
        mVar.a();
    }

    @Override // o7.e
    public final void j(o7.a aVar) {
        c0.a m02 = m0();
        r3.b bVar = new r3.b(m02, aVar, 2);
        this.n.put(1007, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1007, bVar);
        mVar.a();
    }

    @Override // l8.r
    public final void j0(final long j10, final int i10) {
        final c0.a q02 = q0();
        m.a<c0> aVar = new m.a() { // from class: x6.h
            @Override // k8.m.a
            public final void invoke(Object obj) {
                ((c0) obj).P(c0.a.this, j10, i10);
            }
        };
        this.n.put(1026, q02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1026, aVar);
        mVar.a();
    }

    @Override // l8.r
    public final void k(w6.y yVar, z6.e eVar) {
        c0.a r02 = r0();
        v vVar = new v(r02, yVar, eVar, 0);
        this.n.put(1022, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1022, vVar);
        mVar.a();
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final void k0(int i10, i.a aVar) {
        c0.a p02 = p0(i10, aVar);
        f4.i iVar = new f4.i(p02, 6);
        this.n.put(1033, p02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1033, iVar);
        mVar.a();
    }

    @Override // l8.r
    public final void l(final String str, final long j10, final long j11) {
        final c0.a r02 = r0();
        m.a<c0> aVar = new m.a() { // from class: x6.k
            @Override // k8.m.a
            public final void invoke(Object obj) {
                c0.a aVar2 = c0.a.this;
                String str2 = str;
                long j12 = j11;
                long j13 = j10;
                c0 c0Var = (c0) obj;
                c0Var.k(aVar2, str2, j12);
                c0Var.t(aVar2, str2, j13, j12);
                c0Var.w(aVar2, 2, str2, j12);
            }
        };
        this.n.put(1021, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1021, aVar);
        mVar.a();
    }

    @Override // w6.n0.c
    public void l0(boolean z10) {
        c0.a m02 = m0();
        x xVar = new x(m02, z10, 0);
        this.n.put(8, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(8, xVar);
        mVar.a();
    }

    @Override // w6.n0.c
    public final void m(final boolean z10) {
        final c0.a m02 = m0();
        m.a<c0> aVar = new m.a() { // from class: x6.q
            @Override // k8.m.a
            public final void invoke(Object obj) {
                c0.a aVar2 = c0.a.this;
                boolean z11 = z10;
                c0 c0Var = (c0) obj;
                c0Var.d0(aVar2, z11);
                c0Var.N(aVar2, z11);
            }
        };
        this.n.put(4, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(4, aVar);
        mVar.a();
    }

    public final c0.a m0() {
        return n0(this.f17958m.d);
    }

    @Override // w6.n0.c
    public final void n() {
        c0.a m02 = m0();
        l lVar = new l(m02, 1);
        this.n.put(-1, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(-1, lVar);
        mVar.a();
    }

    public final c0.a n0(i.a aVar) {
        Objects.requireNonNull(this.f17960u);
        x0 x0Var = aVar == null ? null : this.f17958m.f17964c.get(aVar);
        if (aVar != null && x0Var != null) {
            return o0(x0Var, x0Var.h(aVar.f16912a, this.f17956f).f16841c, aVar);
        }
        int z10 = this.f17960u.z();
        x0 M = this.f17960u.M();
        if (!(z10 < M.p())) {
            M = x0.f16838a;
        }
        return o0(M, z10, null);
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void o(final w6.y yVar, final z6.e eVar) {
        final c0.a r02 = r0();
        m.a<c0> aVar = new m.a() { // from class: x6.m
            @Override // k8.m.a
            public final void invoke(Object obj) {
                c0.a aVar2 = c0.a.this;
                w6.y yVar2 = yVar;
                z6.e eVar2 = eVar;
                c0 c0Var = (c0) obj;
                c0Var.x(aVar2, yVar2);
                c0Var.R(aVar2, yVar2, eVar2);
                c0Var.G(aVar2, 1, yVar2);
            }
        };
        this.n.put(1010, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1010, aVar);
        mVar.a();
    }

    @RequiresNonNull({"player"})
    public final c0.a o0(x0 x0Var, int i10, i.a aVar) {
        long E;
        i.a aVar2 = x0Var.q() ? null : aVar;
        long d = this.f17955c.d();
        boolean z10 = false;
        boolean z11 = x0Var.equals(this.f17960u.M()) && i10 == this.f17960u.z();
        long j10 = 0;
        if (aVar2 != null && aVar2.a()) {
            if (z11 && this.f17960u.G() == aVar2.f16913b && this.f17960u.w() == aVar2.f16914c) {
                z10 = true;
            }
            if (z10) {
                j10 = this.f17960u.getCurrentPosition();
            }
        } else if (z11) {
            E = this.f17960u.E();
            return new c0.a(d, x0Var, i10, aVar2, E, this.f17960u.M(), this.f17960u.z(), this.f17958m.d, this.f17960u.getCurrentPosition(), this.f17960u.c());
        } else if (!x0Var.q()) {
            j10 = x0Var.o(i10, this.f17957j, 0L).a();
        }
        E = j10;
        return new c0.a(d, x0Var, i10, aVar2, E, this.f17960u.M(), this.f17960u.z(), this.f17958m.d, this.f17960u.getCurrentPosition(), this.f17960u.c());
    }

    @Override // w6.n0.c
    public final void p(PlaybackException playbackException) {
        w7.e eVar;
        c0.a n02 = (!(playbackException instanceof ExoPlaybackException) || (eVar = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? null : n0(new i.a(eVar));
        if (n02 == null) {
            n02 = m0();
        }
        g0 g0Var = new g0(n02, playbackException, 3);
        this.n.put(11, n02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(11, g0Var);
        mVar.a();
    }

    public final c0.a p0(int i10, i.a aVar) {
        Objects.requireNonNull(this.f17960u);
        boolean z10 = false;
        if (aVar != null) {
            if (this.f17958m.f17964c.get(aVar) != null) {
                z10 = true;
            }
            return z10 ? n0(aVar) : o0(x0.f16838a, i10, aVar);
        }
        x0 M = this.f17960u.M();
        if (i10 < M.p()) {
            z10 = true;
        }
        if (!z10) {
            M = x0.f16838a;
        }
        return o0(M, i10, null);
    }

    @Override // l8.r
    public /* synthetic */ void q(w6.y yVar) {
    }

    public final c0.a q0() {
        return n0(this.f17958m.f17965e);
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void r(int i10, i.a aVar, w7.d dVar) {
        c0.a p02 = p0(i10, aVar);
        e1 e1Var = new e1(p02, dVar, 8);
        this.n.put(1004, p02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1004, e1Var);
        mVar.a();
    }

    public final c0.a r0() {
        return n0(this.f17958m.f17966f);
    }

    @Override // w6.n0.c
    public final void s(w6.c0 c0Var, int i10) {
        c0.a m02 = m0();
        r6.g gVar = new r6.g(m02, c0Var, i10);
        this.n.put(1, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1, gVar);
        mVar.a();
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final void t(int i10, i.a aVar, Exception exc) {
        c0.a p02 = p0(i10, aVar);
        e1 e1Var = new e1(p02, exc, 6);
        this.n.put(1032, p02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1032, e1Var);
        mVar.a();
    }

    @Override // y6.f
    public final void u(final float f10) {
        final c0.a r02 = r0();
        m.a<c0> aVar = new m.a() { // from class: x6.y
            @Override // k8.m.a
            public final void invoke(Object obj) {
                ((c0) obj).m(c0.a.this, f10);
            }
        };
        this.n.put(1019, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1019, aVar);
        mVar.a();
    }

    @Override // w6.n0.c
    public final void v(final int i10) {
        final c0.a m02 = m0();
        m.a<c0> aVar = new m.a() { // from class: x6.z
            @Override // k8.m.a
            public final void invoke(Object obj) {
                ((c0) obj).Y(c0.a.this, i10);
            }
        };
        this.n.put(5, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(5, aVar);
        mVar.a();
    }

    @Override // w6.n0.c
    public final void w(final n0.f fVar, final n0.f fVar2, final int i10) {
        if (i10 == 1) {
            this.y = false;
        }
        a aVar = this.f17958m;
        n0 n0Var = this.f17960u;
        Objects.requireNonNull(n0Var);
        aVar.d = a.b(n0Var, aVar.f17963b, aVar.f17965e, aVar.f17962a);
        final c0.a m02 = m0();
        m.a<c0> aVar2 = new m.a() { // from class: x6.f
            @Override // k8.m.a
            public final void invoke(Object obj) {
                c0.a aVar3 = c0.a.this;
                int i11 = i10;
                n0.f fVar3 = fVar;
                n0.f fVar4 = fVar2;
                c0 c0Var = (c0) obj;
                c0Var.V(aVar3, i11);
                c0Var.h0(aVar3, fVar3, fVar4, i11);
            }
        };
        this.n.put(12, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(12, aVar2);
        mVar.a();
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void x(String str) {
        c0.a r02 = r0();
        w wVar = new w(r02, str, 1);
        this.n.put(1013, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1013, wVar);
        mVar.a();
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void y(final String str, final long j10, final long j11) {
        final c0.a r02 = r0();
        m.a<c0> aVar = new m.a() { // from class: x6.j
            @Override // k8.m.a
            public final void invoke(Object obj) {
                c0.a aVar2 = c0.a.this;
                String str2 = str;
                long j12 = j11;
                long j13 = j10;
                c0 c0Var = (c0) obj;
                c0Var.A(aVar2, str2, j12);
                c0Var.O(aVar2, str2, j13, j12);
                c0Var.w(aVar2, 1, str2, j12);
            }
        };
        this.n.put(1009, r02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(1009, aVar);
        mVar.a();
    }

    @Override // w6.n0.c
    public final void z(boolean z10) {
        c0.a m02 = m0();
        x xVar = new x(m02, z10, 1);
        this.n.put(10, m02);
        k8.m<c0> mVar = this.f17959t;
        mVar.b(10, xVar);
        mVar.a();
    }
}
