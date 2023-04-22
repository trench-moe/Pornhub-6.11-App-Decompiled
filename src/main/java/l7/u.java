package l7;

import c7.a;
import kotlin.UByte;

/* loaded from: classes2.dex */
public final class u extends c7.a {

    /* loaded from: classes2.dex */
    public static final class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        public final k8.a0 f12614a;

        /* renamed from: b  reason: collision with root package name */
        public final k8.t f12615b = new k8.t();

        public b(k8.a0 a0Var, a aVar) {
            this.f12614a = a0Var;
        }

        @Override // c7.a.f
        public a.e a(c7.i iVar, long j10) {
            int g10;
            long position = iVar.getPosition();
            int min = (int) Math.min(20000L, iVar.b() - position);
            this.f12615b.z(min);
            iVar.o(this.f12615b.f12009a, 0, min);
            k8.t tVar = this.f12615b;
            int i10 = -1;
            long j11 = -9223372036854775807L;
            int i11 = -1;
            while (tVar.a() >= 4) {
                if (u.g(tVar.f12009a, tVar.f12010b) != 442) {
                    tVar.E(1);
                } else {
                    tVar.E(4);
                    long c10 = v.c(tVar);
                    if (c10 != -9223372036854775807L) {
                        long b10 = this.f12614a.b(c10);
                        if (b10 > j10) {
                            return j11 == -9223372036854775807L ? a.e.a(b10, position) : a.e.b(position + i11);
                        } else if (100000 + b10 > j10) {
                            return a.e.b(position + tVar.f12010b);
                        } else {
                            i11 = tVar.f12010b;
                            j11 = b10;
                        }
                    }
                    int i12 = tVar.f12011c;
                    if (tVar.a() >= 10) {
                        tVar.E(9);
                        int s10 = tVar.s() & 7;
                        if (tVar.a() >= s10) {
                            tVar.E(s10);
                            if (tVar.a() >= 4) {
                                if (u.g(tVar.f12009a, tVar.f12010b) == 443) {
                                    tVar.E(4);
                                    int x10 = tVar.x();
                                    if (tVar.a() < x10) {
                                        tVar.D(i12);
                                    } else {
                                        tVar.E(x10);
                                    }
                                }
                                while (true) {
                                    if (tVar.a() < 4 || (g10 = u.g(tVar.f12009a, tVar.f12010b)) == 442 || g10 == 441 || (g10 >>> 8) != 1) {
                                        break;
                                    }
                                    tVar.E(4);
                                    if (tVar.a() < 2) {
                                        tVar.D(i12);
                                        break;
                                    }
                                    tVar.D(Math.min(tVar.f12011c, tVar.f12010b + tVar.x()));
                                }
                            } else {
                                tVar.D(i12);
                            }
                        } else {
                            tVar.D(i12);
                        }
                    } else {
                        tVar.D(i12);
                    }
                    i10 = tVar.f12010b;
                }
            }
            return j11 != -9223372036854775807L ? a.e.c(j11, position + i10) : a.e.d;
        }

        @Override // c7.a.f
        public void b() {
            this.f12615b.A(k8.c0.f11943f);
        }
    }

    public u(k8.a0 a0Var, long j10, long j11) {
        super(new a.b(), new b(a0Var, null), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int g(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & UByte.MAX_VALUE) | ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
    }
}
