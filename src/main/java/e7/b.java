package e7;

import c7.h;
import c7.i;
import c7.j;
import c7.k;
import c7.m;
import c7.n;
import c7.o;
import c7.p;
import c7.u;
import c7.w;
import c7.y;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import k0.c;
import k8.c0;
import k8.s;
import k8.t;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f9129a = new byte[42];

    /* renamed from: b  reason: collision with root package name */
    public final t f9130b = new t(new byte[32768], 0);

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9131c;
    public final m.a d;

    /* renamed from: e  reason: collision with root package name */
    public j f9132e;

    /* renamed from: f  reason: collision with root package name */
    public w f9133f;

    /* renamed from: g  reason: collision with root package name */
    public int f9134g;

    /* renamed from: h  reason: collision with root package name */
    public o7.a f9135h;

    /* renamed from: i  reason: collision with root package name */
    public p f9136i;

    /* renamed from: j  reason: collision with root package name */
    public int f9137j;

    /* renamed from: k  reason: collision with root package name */
    public int f9138k;

    /* renamed from: l  reason: collision with root package name */
    public a f9139l;

    /* renamed from: m  reason: collision with root package name */
    public int f9140m;
    public long n;

    static {
        c cVar = c.A;
    }

    public b(int i10) {
        this.f9131c = (i10 & 1) != 0;
        this.d = new m.a();
        this.f9134g = 0;
    }

    @Override // c7.h
    public void a() {
    }

    public final void b() {
        p pVar = this.f9136i;
        int i10 = c0.f11939a;
        this.f9133f.b((this.n * 1000000) / pVar.f3811e, 1, this.f9140m, 0, null);
    }

    @Override // c7.h
    public void c(j jVar) {
        this.f9132e = jVar;
        this.f9133f = jVar.r(0, 1);
        jVar.l();
    }

    @Override // c7.h
    public boolean f(i iVar) {
        n.a(iVar, false);
        byte[] bArr = new byte[4];
        iVar.o(bArr, 0, 4);
        return (((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8)) | (255 & ((long) bArr[3]))) == 1716281667;
    }

    @Override // c7.h
    public void g(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f9134g = 0;
        } else {
            a aVar = this.f9139l;
            if (aVar != null) {
                aVar.e(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.n = j12;
        this.f9140m = 0;
        this.f9130b.z(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int, boolean] */
    @Override // c7.h
    public int h(i iVar, c7.t tVar) {
        byte[] bArr;
        boolean z10;
        p pVar;
        u bVar;
        long j10;
        boolean z11;
        int i10 = this.f9134g;
        ?? r42 = 0;
        if (i10 == 0) {
            iVar.l();
            long f10 = iVar.f();
            o7.a a10 = n.a(iVar, !this.f9131c);
            iVar.m((int) (iVar.f() - f10));
            this.f9135h = a10;
            this.f9134g = 1;
            return 0;
        } else if (i10 == 1) {
            byte[] bArr2 = this.f9129a;
            iVar.o(bArr2, 0, bArr2.length);
            iVar.l();
            this.f9134g = 2;
            return 0;
        } else {
            int i11 = 4;
            int i12 = 3;
            if (i10 == 2) {
                iVar.readFully(new byte[4], 0, 4);
                if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 1716281667) {
                    this.f9134g = 3;
                    return 0;
                }
                throw ParserException.a("Failed to read FLAC stream marker.", null);
            }
            if (i10 == 3) {
                p pVar2 = this.f9136i;
                boolean z12 = false;
                while (!z12) {
                    iVar.l();
                    s sVar = new s(new byte[i11]);
                    iVar.o(sVar.f12006a, r42, i11);
                    boolean f11 = sVar.f();
                    int g10 = sVar.g(r12);
                    int g11 = sVar.g(24) + i11;
                    if (g10 == 0) {
                        byte[] bArr3 = new byte[38];
                        iVar.readFully(bArr3, r42, 38);
                        pVar2 = new p(bArr3, i11);
                    } else if (pVar2 == null) {
                        throw new IllegalArgumentException();
                    } else {
                        if (g10 == i12) {
                            t tVar2 = new t(g11);
                            iVar.readFully(tVar2.f12009a, r42, g11);
                            pVar2 = pVar2.b(n.b(tVar2));
                        } else {
                            if (g10 == i11) {
                                t tVar3 = new t(g11);
                                iVar.readFully(tVar3.f12009a, r42, g11);
                                tVar3.E(i11);
                                z10 = f11;
                                pVar = new p(pVar2.f3808a, pVar2.f3809b, pVar2.f3810c, pVar2.d, pVar2.f3811e, pVar2.f3813g, pVar2.f3814h, pVar2.f3816j, pVar2.f3817k, pVar2.f(p.a(Arrays.asList(y.b(tVar3, r42, r42).f3842a), Collections.emptyList())));
                            } else {
                                z10 = f11;
                                if (g10 == 6) {
                                    t tVar4 = new t(g11);
                                    iVar.readFully(tVar4.f12009a, 0, g11);
                                    tVar4.E(i11);
                                    int f12 = tVar4.f();
                                    String q10 = tVar4.q(tVar4.f(), jb.b.f11658a);
                                    String p10 = tVar4.p(tVar4.f());
                                    int f13 = tVar4.f();
                                    int f14 = tVar4.f();
                                    int f15 = tVar4.f();
                                    int f16 = tVar4.f();
                                    int f17 = tVar4.f();
                                    byte[] bArr4 = new byte[f17];
                                    System.arraycopy(tVar4.f12009a, tVar4.f12010b, bArr4, 0, f17);
                                    tVar4.f12010b += f17;
                                    pVar = new p(pVar2.f3808a, pVar2.f3809b, pVar2.f3810c, pVar2.d, pVar2.f3811e, pVar2.f3813g, pVar2.f3814h, pVar2.f3816j, pVar2.f3817k, pVar2.f(p.a(Collections.emptyList(), Collections.singletonList(new r7.a(f12, q10, p10, f13, f14, f15, f16, bArr4)))));
                                } else {
                                    iVar.m(g11);
                                    int i13 = c0.f11939a;
                                    this.f9136i = pVar2;
                                    z12 = z10;
                                    r42 = 0;
                                    i11 = 4;
                                    i12 = 3;
                                    r12 = 7;
                                }
                            }
                            pVar2 = pVar;
                            int i132 = c0.f11939a;
                            this.f9136i = pVar2;
                            z12 = z10;
                            r42 = 0;
                            i11 = 4;
                            i12 = 3;
                            r12 = 7;
                        }
                    }
                    z10 = f11;
                    int i1322 = c0.f11939a;
                    this.f9136i = pVar2;
                    z12 = z10;
                    r42 = 0;
                    i11 = 4;
                    i12 = 3;
                    r12 = 7;
                }
                Objects.requireNonNull(this.f9136i);
                this.f9137j = Math.max(this.f9136i.f3810c, 6);
                w wVar = this.f9133f;
                int i14 = c0.f11939a;
                wVar.d(this.f9136i.e(this.f9129a, this.f9135h));
                this.f9134g = 4;
                return 0;
            }
            long j11 = 0;
            if (i10 == 4) {
                iVar.l();
                byte[] bArr5 = new byte[2];
                iVar.o(bArr5, 0, 2);
                int i15 = (bArr5[1] & UByte.MAX_VALUE) | ((bArr5[0] & UByte.MAX_VALUE) << 8);
                if ((i15 >> 2) != 16382) {
                    iVar.l();
                    throw ParserException.a("First frame does not start with sync code.", null);
                }
                iVar.l();
                this.f9138k = i15;
                j jVar = this.f9132e;
                int i16 = c0.f11939a;
                long position = iVar.getPosition();
                long b10 = iVar.b();
                Objects.requireNonNull(this.f9136i);
                p pVar3 = this.f9136i;
                if (pVar3.f3817k != null) {
                    bVar = new o(pVar3, position);
                } else if (b10 == -1 || pVar3.f3816j <= 0) {
                    bVar = new u.b(pVar3.d(), 0L);
                } else {
                    a aVar = new a(pVar3, this.f9138k, position, b10);
                    this.f9139l = aVar;
                    bVar = aVar.f3766a;
                }
                jVar.g(bVar);
                this.f9134g = 5;
                return 0;
            } else if (i10 == 5) {
                Objects.requireNonNull(this.f9133f);
                Objects.requireNonNull(this.f9136i);
                a aVar2 = this.f9139l;
                if (aVar2 == null || !aVar2.b()) {
                    if (this.n == -1) {
                        p pVar4 = this.f9136i;
                        iVar.l();
                        iVar.g(1);
                        byte[] bArr6 = new byte[1];
                        iVar.o(bArr6, 0, 1);
                        boolean z13 = (bArr6[0] & 1) == 1;
                        iVar.g(2);
                        r12 = z13 ? 7 : 6;
                        t tVar5 = new t(r12);
                        tVar5.C(k.c(iVar, tVar5.f12009a, 0, r12));
                        iVar.l();
                        try {
                            long y = tVar5.y();
                            if (!z13) {
                                y *= pVar4.f3809b;
                            }
                            j11 = y;
                        } catch (NumberFormatException unused) {
                            r3 = false;
                        }
                        if (r3) {
                            this.n = j11;
                            return 0;
                        }
                        throw ParserException.a(null, null);
                    }
                    t tVar6 = this.f9130b;
                    int i17 = tVar6.f12011c;
                    if (i17 < 32768) {
                        int a11 = iVar.a(tVar6.f12009a, i17, 32768 - i17);
                        r3 = a11 == -1;
                        if (!r3) {
                            this.f9130b.C(i17 + a11);
                        } else if (this.f9130b.a() == 0) {
                            b();
                            return -1;
                        }
                    } else {
                        r3 = false;
                    }
                    t tVar7 = this.f9130b;
                    int i18 = tVar7.f12010b;
                    int i19 = this.f9140m;
                    int i20 = this.f9137j;
                    if (i19 < i20) {
                        tVar7.E(Math.min(i20 - i19, tVar7.a()));
                    }
                    t tVar8 = this.f9130b;
                    Objects.requireNonNull(this.f9136i);
                    int i21 = tVar8.f12010b;
                    while (true) {
                        if (i21 <= tVar8.f12011c - 16) {
                            tVar8.D(i21);
                            if (m.b(tVar8, this.f9136i, this.f9138k, this.d)) {
                                tVar8.D(i21);
                                j10 = this.d.f3805a;
                                break;
                            }
                            i21++;
                        } else {
                            if (r3) {
                                while (true) {
                                    int i22 = tVar8.f12011c;
                                    if (i21 > i22 - this.f9137j) {
                                        tVar8.D(i22);
                                        break;
                                    }
                                    tVar8.D(i21);
                                    try {
                                        z11 = m.b(tVar8, this.f9136i, this.f9138k, this.d);
                                    } catch (IndexOutOfBoundsException unused2) {
                                        z11 = false;
                                    }
                                    if (tVar8.f12010b > tVar8.f12011c) {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        tVar8.D(i21);
                                        j10 = this.d.f3805a;
                                        break;
                                    }
                                    i21++;
                                }
                            } else {
                                tVar8.D(i21);
                            }
                            j10 = -1;
                        }
                    }
                    t tVar9 = this.f9130b;
                    int i23 = tVar9.f12010b - i18;
                    tVar9.D(i18);
                    this.f9133f.a(this.f9130b, i23);
                    this.f9140m += i23;
                    if (j10 != -1) {
                        b();
                        this.f9140m = 0;
                        this.n = j10;
                    }
                    if (this.f9130b.a() < 16) {
                        int a12 = this.f9130b.a();
                        t tVar10 = this.f9130b;
                        byte[] bArr7 = tVar10.f12009a;
                        System.arraycopy(bArr7, tVar10.f12010b, bArr7, 0, a12);
                        this.f9130b.D(0);
                        this.f9130b.C(a12);
                        return 0;
                    }
                    return 0;
                }
                return this.f9139l.a(iVar, tVar);
            } else {
                throw new IllegalStateException();
            }
        }
    }
}
