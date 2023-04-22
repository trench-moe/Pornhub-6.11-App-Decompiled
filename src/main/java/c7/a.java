package c7;

import c7.u;
import k8.c0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0050a f3766a;

    /* renamed from: b  reason: collision with root package name */
    public final f f3767b;

    /* renamed from: c  reason: collision with root package name */
    public c f3768c;
    public final int d;

    /* renamed from: c7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0050a implements u {

        /* renamed from: a  reason: collision with root package name */
        public final d f3769a;

        /* renamed from: b  reason: collision with root package name */
        public final long f3770b;

        /* renamed from: c  reason: collision with root package name */
        public final long f3771c;
        public final long d;

        /* renamed from: e  reason: collision with root package name */
        public final long f3772e;

        /* renamed from: f  reason: collision with root package name */
        public final long f3773f;

        /* renamed from: g  reason: collision with root package name */
        public final long f3774g;

        public C0050a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f3769a = dVar;
            this.f3770b = j10;
            this.f3771c = j11;
            this.d = j12;
            this.f3772e = j13;
            this.f3773f = j14;
            this.f3774g = j15;
        }

        @Override // c7.u
        public boolean d() {
            return true;
        }

        @Override // c7.u
        public u.a i(long j10) {
            return new u.a(new v(j10, c.a(this.f3769a.a(j10), this.f3771c, this.d, this.f3772e, this.f3773f, this.f3774g)));
        }

        @Override // c7.u
        public long j() {
            return this.f3770b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements d {
        @Override // c7.a.d
        public long a(long j10) {
            return j10;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f3775a;

        /* renamed from: b  reason: collision with root package name */
        public final long f3776b;

        /* renamed from: c  reason: collision with root package name */
        public final long f3777c;
        public long d;

        /* renamed from: e  reason: collision with root package name */
        public long f3778e;

        /* renamed from: f  reason: collision with root package name */
        public long f3779f;

        /* renamed from: g  reason: collision with root package name */
        public long f3780g;

        /* renamed from: h  reason: collision with root package name */
        public long f3781h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f3775a = j10;
            this.f3776b = j11;
            this.d = j12;
            this.f3778e = j13;
            this.f3779f = j14;
            this.f3780g = j15;
            this.f3777c = j16;
            this.f3781h = a(j11, j12, j13, j14, j15, j16);
        }

        public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return c0.i(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        long a(long j10);
    }

    /* loaded from: classes.dex */
    public static final class e {
        public static final e d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f3782a;

        /* renamed from: b  reason: collision with root package name */
        public final long f3783b;

        /* renamed from: c  reason: collision with root package name */
        public final long f3784c;

        public e(int i10, long j10, long j11) {
            this.f3782a = i10;
            this.f3783b = j10;
            this.f3784c = j11;
        }

        public static e a(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e b(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }

        public static e c(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        e a(i iVar, long j10);

        void b();
    }

    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f3767b = fVar;
        this.d = i10;
        this.f3766a = new C0050a(dVar, j10, j11, j12, j13, j14, j15);
    }

    public int a(i iVar, t tVar) {
        while (true) {
            c cVar = this.f3768c;
            k8.a.g(cVar);
            long j10 = cVar.f3779f;
            long j11 = cVar.f3780g;
            long j12 = cVar.f3781h;
            if (j11 - j10 <= this.d) {
                c(false, j10);
                return d(iVar, j10, tVar);
            } else if (!f(iVar, j12)) {
                return d(iVar, j12, tVar);
            } else {
                iVar.l();
                e a10 = this.f3767b.a(iVar, cVar.f3776b);
                int i10 = a10.f3782a;
                if (i10 == -3) {
                    c(false, j12);
                    return d(iVar, j12, tVar);
                } else if (i10 == -2) {
                    long j13 = a10.f3783b;
                    long j14 = a10.f3784c;
                    cVar.d = j13;
                    cVar.f3779f = j14;
                    cVar.f3781h = c.a(cVar.f3776b, j13, cVar.f3778e, j14, cVar.f3780g, cVar.f3777c);
                } else if (i10 != -1) {
                    if (i10 == 0) {
                        f(iVar, a10.f3784c);
                        c(true, a10.f3784c);
                        return d(iVar, a10.f3784c, tVar);
                    }
                    throw new IllegalStateException("Invalid case");
                } else {
                    long j15 = a10.f3783b;
                    long j16 = a10.f3784c;
                    cVar.f3778e = j15;
                    cVar.f3780g = j16;
                    cVar.f3781h = c.a(cVar.f3776b, cVar.d, j15, cVar.f3779f, j16, cVar.f3777c);
                }
            }
        }
    }

    public final boolean b() {
        return this.f3768c != null;
    }

    public final void c(boolean z10, long j10) {
        this.f3768c = null;
        this.f3767b.b();
    }

    public final int d(i iVar, long j10, t tVar) {
        if (j10 == iVar.getPosition()) {
            return 0;
        }
        tVar.f3828a = j10;
        return 1;
    }

    public final void e(long j10) {
        c cVar = this.f3768c;
        if (cVar == null || cVar.f3775a != j10) {
            long a10 = this.f3766a.f3769a.a(j10);
            C0050a c0050a = this.f3766a;
            this.f3768c = new c(j10, a10, c0050a.f3771c, c0050a.d, c0050a.f3772e, c0050a.f3773f, c0050a.f3774g);
        }
    }

    public final boolean f(i iVar, long j10) {
        long position = j10 - iVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        iVar.m((int) position);
        return true;
    }
}
