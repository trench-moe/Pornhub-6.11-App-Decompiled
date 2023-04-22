package i7;

import c7.h;
import c7.i;
import c7.j;
import c7.q;
import c7.r;
import c7.w;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import k8.t;
import o7.a;
import t7.g;
import t7.l;
import y6.p;

/* loaded from: classes2.dex */
public final class d implements h {

    /* renamed from: u  reason: collision with root package name */
    public static final g.a f10551u;

    /* renamed from: a  reason: collision with root package name */
    public final int f10552a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10553b;

    /* renamed from: c  reason: collision with root package name */
    public final t f10554c;
    public final p.a d;

    /* renamed from: e  reason: collision with root package name */
    public final q f10555e;

    /* renamed from: f  reason: collision with root package name */
    public final r f10556f;

    /* renamed from: g  reason: collision with root package name */
    public final w f10557g;

    /* renamed from: h  reason: collision with root package name */
    public j f10558h;

    /* renamed from: i  reason: collision with root package name */
    public w f10559i;

    /* renamed from: j  reason: collision with root package name */
    public w f10560j;

    /* renamed from: k  reason: collision with root package name */
    public int f10561k;

    /* renamed from: l  reason: collision with root package name */
    public o7.a f10562l;

    /* renamed from: m  reason: collision with root package name */
    public long f10563m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public long f10564o;

    /* renamed from: p  reason: collision with root package name */
    public int f10565p;

    /* renamed from: q  reason: collision with root package name */
    public e f10566q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f10567r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f10568s;

    /* renamed from: t  reason: collision with root package name */
    public long f10569t;

    static {
        k0.c cVar = k0.c.B;
        f10551u = s6.p.n;
    }

    public d() {
        this(0);
    }

    public d(int i10) {
        this.f10552a = i10;
        this.f10553b = -9223372036854775807L;
        this.f10554c = new t(10);
        this.d = new p.a();
        this.f10555e = new q();
        this.f10563m = -9223372036854775807L;
        this.f10556f = new r();
        c7.g gVar = new c7.g();
        this.f10557g = gVar;
        this.f10560j = gVar;
    }

    public static long e(o7.a aVar) {
        if (aVar != null) {
            int length = aVar.f13605c.length;
            for (int i10 = 0; i10 < length; i10++) {
                a.b bVar = aVar.f13605c[i10];
                if (bVar instanceof l) {
                    l lVar = (l) bVar;
                    if (lVar.f15154c.equals("TLEN")) {
                        return w6.g.b(Long.parseLong(lVar.f15165j));
                    }
                }
            }
        }
        return -9223372036854775807L;
    }

    public static boolean i(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    @Override // c7.h
    public void a() {
    }

    public final long b(long j10) {
        return ((j10 * 1000000) / this.d.d) + this.f10563m;
    }

    @Override // c7.h
    public void c(j jVar) {
        this.f10558h = jVar;
        w r10 = jVar.r(0, 1);
        this.f10559i = r10;
        this.f10560j = r10;
        this.f10558h.l();
    }

    public final e d(i iVar) {
        iVar.o(this.f10554c.f12009a, 0, 4);
        this.f10554c.D(0);
        this.d.a(this.f10554c.f());
        return new a(iVar.b(), iVar.getPosition(), this.d);
    }

    @Override // c7.h
    public boolean f(i iVar) {
        return k(iVar, true);
    }

    @Override // c7.h
    public void g(long j10, long j11) {
        this.f10561k = 0;
        this.f10563m = -9223372036854775807L;
        this.n = 0L;
        this.f10565p = 0;
        this.f10569t = j11;
        e eVar = this.f10566q;
        if ((eVar instanceof b) && !((b) eVar).a(j11)) {
            this.f10568s = true;
            this.f10560j = this.f10557g;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r8 != 1231971951) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0254  */
    @Override // c7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int h(c7.i r40, c7.t r41) {
        /*
            Method dump skipped, instructions count: 1147
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.d.h(c7.i, c7.t):int");
    }

    public final boolean j(i iVar) {
        e eVar = this.f10566q;
        if (eVar != null) {
            long b10 = eVar.b();
            if (b10 != -1 && iVar.f() > b10 - 4) {
                return true;
            }
        }
        try {
            return !iVar.e(this.f10554c.f12009a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean k(i iVar, boolean z10) {
        int i10;
        int i11;
        int a10;
        int i12 = z10 ? 32768 : 131072;
        iVar.l();
        if (iVar.getPosition() == 0) {
            o7.a a11 = this.f10556f.a(iVar, (this.f10552a & 4) == 0 ? null : f10551u);
            this.f10562l = a11;
            if (a11 != null) {
                this.f10555e.b(a11);
            }
            i11 = (int) iVar.f();
            if (!z10) {
                iVar.m(i11);
            }
            i10 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (!j(iVar)) {
                this.f10554c.D(0);
                int f10 = this.f10554c.f();
                if ((i10 == 0 || i(f10, i10)) && (a10 = p.a(f10)) != -1) {
                    i13++;
                    if (i13 == 1) {
                        this.d.a(f10);
                        i10 = f10;
                    } else if (i13 == 4) {
                        break;
                    }
                    iVar.g(a10 - 4);
                }
                int i15 = i14 + 1;
                if (i14 == i12) {
                    if (z10) {
                        return false;
                    }
                    throw ParserException.a("Searched too many bytes.", null);
                }
                if (z10) {
                    iVar.l();
                    iVar.g(i11 + i15);
                } else {
                    iVar.m(1);
                }
                i14 = i15;
                i10 = 0;
                i13 = 0;
            } else if (i13 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            iVar.m(i11 + i14);
        } else {
            iVar.l();
        }
        this.f10561k = i10;
        return true;
    }
}
