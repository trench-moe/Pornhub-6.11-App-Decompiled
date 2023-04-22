package w6;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.PlaybackException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import k8.h;

/* loaded from: classes2.dex */
public interface n0 {

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final k8.h f16681a;

        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public final h.b f16682a = new h.b();

            public a a(b bVar) {
                h.b bVar2 = this.f16682a;
                k8.h hVar = bVar.f16681a;
                Objects.requireNonNull(bVar2);
                for (int i10 = 0; i10 < hVar.b(); i10++) {
                    k8.a.e(i10, 0, hVar.b());
                    bVar2.a(hVar.f11956a.keyAt(i10));
                }
                return this;
            }

            public a b(int i10, boolean z10) {
                h.b bVar = this.f16682a;
                Objects.requireNonNull(bVar);
                if (z10) {
                    k8.a.f(!bVar.f11958b);
                    bVar.f11957a.append(i10, true);
                }
                return this;
            }

            public b c() {
                return new b(this.f16682a.b(), null);
            }
        }

        static {
            new h.b().b();
        }

        public b(k8.h hVar, a aVar) {
            this.f16681a = hVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f16681a.equals(((b) obj).f16681a);
            }
            return false;
        }

        public int hashCode() {
            return this.f16681a.hashCode();
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c {
        void C(n0 n0Var, d dVar);

        @Deprecated
        void G(boolean z10, int i10);

        void L(int i10);

        void P(b bVar);

        void W(w7.o oVar, i8.j jVar);

        void Y(boolean z10, int i10);

        void Z(m0 m0Var);

        void d(int i10);

        void e(x0 x0Var, int i10);

        @Deprecated
        void f(boolean z10);

        void g(d0 d0Var);

        void g0(PlaybackException playbackException);

        @Deprecated
        void h(int i10);

        @Deprecated
        void i(List<o7.a> list);

        void l0(boolean z10);

        void m(boolean z10);

        @Deprecated
        void n();

        void p(PlaybackException playbackException);

        void s(c0 c0Var, int i10);

        void v(int i10);

        void w(f fVar, f fVar2, int i10);

        void z(boolean z10);
    }

    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final k8.h f16683a;

        public d(k8.h hVar) {
            this.f16683a = hVar;
        }

        public boolean a(int i10) {
            return this.f16683a.f11956a.get(i10);
        }

        public boolean b(int... iArr) {
            k8.h hVar = this.f16683a;
            Objects.requireNonNull(hVar);
            for (int i10 : iArr) {
                if (hVar.a(i10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                return this.f16683a.equals(((d) obj).f16683a);
            }
            return false;
        }

        public int hashCode() {
            return this.f16683a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public interface e extends l8.l, y6.f, y7.i, o7.e, a7.b, c {
    }

    /* loaded from: classes2.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final Object f16684a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16685b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f16686c;
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public final long f16687e;

        /* renamed from: f  reason: collision with root package name */
        public final long f16688f;

        /* renamed from: g  reason: collision with root package name */
        public final int f16689g;

        /* renamed from: h  reason: collision with root package name */
        public final int f16690h;

        static {
            s6.p pVar = s6.p.f14875f;
        }

        public f(Object obj, int i10, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f16684a = obj;
            this.f16685b = i10;
            this.f16686c = obj2;
            this.d = i11;
            this.f16687e = j10;
            this.f16688f = j11;
            this.f16689g = i12;
            this.f16690h = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                return this.f16685b == fVar.f16685b && this.d == fVar.d && this.f16687e == fVar.f16687e && this.f16688f == fVar.f16688f && this.f16689g == fVar.f16689g && this.f16690h == fVar.f16690h && jb.d.a(this.f16684a, fVar.f16684a) && jb.d.a(this.f16686c, fVar.f16686c);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f16684a, Integer.valueOf(this.f16685b), this.f16686c, Integer.valueOf(this.d), Integer.valueOf(this.f16685b), Long.valueOf(this.f16687e), Long.valueOf(this.f16688f), Integer.valueOf(this.f16689g), Integer.valueOf(this.f16690h)});
        }
    }

    void A();

    PlaybackException B();

    void C(boolean z10);

    long D();

    long E();

    List<y7.a> F();

    int G();

    boolean H(int i10);

    void I(SurfaceView surfaceView);

    void J(e eVar);

    int K();

    w7.o L();

    x0 M();

    Looper N();

    boolean O();

    long P();

    void Q();

    void R();

    void S(TextureView textureView);

    i8.j T();

    void U();

    d0 V();

    long W();

    boolean a();

    void b(m0 m0Var);

    long c();

    void d(int i10, long j10);

    m0 e();

    void f();

    int g();

    long getCurrentPosition();

    long getDuration();

    void h();

    b i();

    boolean isPlaying();

    void j(e eVar);

    boolean k();

    void l(boolean z10);

    void n(long j10);

    @Deprecated
    void o(c cVar);

    int p();

    void pause();

    void q(int i10);

    int r();

    int s();

    void t(TextureView textureView);

    l8.s u();

    void v(List<c0> list, boolean z10);

    int w();

    void x(SurfaceView surfaceView);

    void y(c0 c0Var);

    int z();
}
