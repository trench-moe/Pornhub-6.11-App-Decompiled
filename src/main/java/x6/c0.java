package x6;

import android.util.SparseArray;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.source.i;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import w6.d0;
import w6.m0;
import w6.n0;
import w6.x0;

/* loaded from: classes2.dex */
public interface c0 {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f17970a;

        /* renamed from: b  reason: collision with root package name */
        public final x0 f17971b;

        /* renamed from: c  reason: collision with root package name */
        public final int f17972c;
        public final i.a d;

        /* renamed from: e  reason: collision with root package name */
        public final long f17973e;

        /* renamed from: f  reason: collision with root package name */
        public final x0 f17974f;

        /* renamed from: g  reason: collision with root package name */
        public final int f17975g;

        /* renamed from: h  reason: collision with root package name */
        public final i.a f17976h;

        /* renamed from: i  reason: collision with root package name */
        public final long f17977i;

        /* renamed from: j  reason: collision with root package name */
        public final long f17978j;

        public a(long j10, x0 x0Var, int i10, i.a aVar, long j11, x0 x0Var2, int i11, i.a aVar2, long j12, long j13) {
            this.f17970a = j10;
            this.f17971b = x0Var;
            this.f17972c = i10;
            this.d = aVar;
            this.f17973e = j11;
            this.f17974f = x0Var2;
            this.f17975g = i11;
            this.f17976h = aVar2;
            this.f17977i = j12;
            this.f17978j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                return this.f17970a == aVar.f17970a && this.f17972c == aVar.f17972c && this.f17973e == aVar.f17973e && this.f17975g == aVar.f17975g && this.f17977i == aVar.f17977i && this.f17978j == aVar.f17978j && jb.d.a(this.f17971b, aVar.f17971b) && jb.d.a(this.d, aVar.d) && jb.d.a(this.f17974f, aVar.f17974f) && jb.d.a(this.f17976h, aVar.f17976h);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f17970a), this.f17971b, Integer.valueOf(this.f17972c), this.d, Long.valueOf(this.f17973e), this.f17974f, Integer.valueOf(this.f17975g), this.f17976h, Long.valueOf(this.f17977i), Long.valueOf(this.f17978j)});
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b(k8.h hVar, SparseArray<a> sparseArray) {
            SparseArray sparseArray2 = new SparseArray(hVar.b());
            for (int i10 = 0; i10 < hVar.b(); i10++) {
                k8.a.e(i10, 0, hVar.b());
                int keyAt = hVar.f11956a.keyAt(i10);
                a aVar = sparseArray.get(keyAt);
                Objects.requireNonNull(aVar);
                sparseArray2.append(keyAt, aVar);
            }
        }
    }

    @Deprecated
    void A(a aVar, String str, long j10);

    @Deprecated
    void B(a aVar, List<o7.a> list);

    void C(a aVar, w7.c cVar, w7.d dVar);

    void D(a aVar, d0 d0Var);

    void E(a aVar);

    void F(a aVar, boolean z10);

    @Deprecated
    void G(a aVar, int i10, w6.y yVar);

    void H(a aVar, m0 m0Var);

    void I(a aVar, z6.d dVar);

    void J(a aVar, int i10);

    @Deprecated
    void K(a aVar, w6.y yVar);

    void L(a aVar, w7.c cVar, w7.d dVar);

    void M(a aVar, w6.c0 c0Var, int i10);

    void N(a aVar, boolean z10);

    void O(a aVar, String str, long j10, long j11);

    void P(a aVar, long j10, int i10);

    @Deprecated
    void Q(a aVar, int i10, z6.d dVar);

    void R(a aVar, w6.y yVar, z6.e eVar);

    void S(a aVar, Exception exc);

    void T(a aVar, int i10, long j10, long j11);

    void U(a aVar, o7.a aVar2);

    @Deprecated
    void V(a aVar, int i10);

    void W(a aVar, w6.y yVar, z6.e eVar);

    void X(a aVar, boolean z10);

    void Y(a aVar, int i10);

    void Z(a aVar, Exception exc);

    void a(a aVar, z6.d dVar);

    void a0(a aVar, boolean z10);

    @Deprecated
    void b(a aVar);

    @Deprecated
    void b0(a aVar);

    @Deprecated
    void c(a aVar, boolean z10, int i10);

    void c0(a aVar, int i10, long j10, long j11);

    void d(a aVar, l8.s sVar);

    @Deprecated
    void d0(a aVar, boolean z10);

    void e(a aVar, int i10);

    @Deprecated
    void e0(a aVar);

    void f(a aVar, n0.b bVar);

    void f0(a aVar, int i10);

    void g(a aVar, w7.d dVar);

    void g0(a aVar, Object obj, long j10);

    void h(a aVar);

    void h0(a aVar, n0.f fVar, n0.f fVar2, int i10);

    void i(a aVar, w7.o oVar, i8.j jVar);

    void i0(a aVar, String str);

    void j(a aVar);

    @Deprecated
    void j0(a aVar, int i10, int i11, int i12, float f10);

    @Deprecated
    void k(a aVar, String str, long j10);

    void k0(a aVar, String str);

    void l(a aVar, long j10);

    void l0(a aVar, int i10);

    void m(a aVar, float f10);

    void m0(a aVar, w7.c cVar, w7.d dVar, IOException iOException, boolean z10);

    void n(a aVar, z6.d dVar);

    void n0(a aVar, Exception exc);

    void o(a aVar, PlaybackException playbackException);

    void o0(a aVar, z6.d dVar);

    @Deprecated
    void p(a aVar, int i10, z6.d dVar);

    void p0(a aVar);

    void q(a aVar, int i10, int i11);

    void r(a aVar, boolean z10, int i10);

    void s(a aVar, Exception exc);

    void t(a aVar, String str, long j10, long j11);

    void u(a aVar, int i10, long j10);

    void v(a aVar, w7.c cVar, w7.d dVar);

    @Deprecated
    void w(a aVar, int i10, String str, long j10);

    @Deprecated
    void x(a aVar, w6.y yVar);

    void y(a aVar);

    void z(n0 n0Var, b bVar);
}
