package j7;

import android.util.Log;
import android.util.Pair;
import j7.a;
import k8.c0;
import k8.p;
import k8.t;
import kotlin.KotlinVersion;
import w6.y;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f11437a = c0.v("OpusHead");

    /* loaded from: classes2.dex */
    public interface a {
        int a();

        int b();

        int c();
    }

    /* renamed from: j7.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0167b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final int f11438a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11439b;

        /* renamed from: c  reason: collision with root package name */
        public final t f11440c;

        public C0167b(a.b bVar, y yVar) {
            t tVar = bVar.f11436b;
            this.f11440c = tVar;
            tVar.D(12);
            int v2 = tVar.v();
            if ("audio/raw".equals(yVar.B)) {
                int r10 = c0.r(yVar.Q, yVar.O);
                if (v2 == 0 || v2 % r10 != 0) {
                    Log.w("AtomParsers", a1.a.h(88, "Audio sample size mismatch. stsd sample size: ", r10, ", stsz sample size: ", v2));
                    v2 = r10;
                }
            }
            this.f11438a = v2 == 0 ? -1 : v2;
            this.f11439b = tVar.v();
        }

        @Override // j7.b.a
        public int a() {
            return this.f11438a;
        }

        @Override // j7.b.a
        public int b() {
            return this.f11439b;
        }

        @Override // j7.b.a
        public int c() {
            int i10 = this.f11438a;
            return i10 == -1 ? this.f11440c.v() : i10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final t f11441a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11442b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11443c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f11444e;

        public c(a.b bVar) {
            t tVar = bVar.f11436b;
            this.f11441a = tVar;
            tVar.D(12);
            this.f11443c = tVar.v() & KotlinVersion.MAX_COMPONENT_VALUE;
            this.f11442b = tVar.v();
        }

        @Override // j7.b.a
        public int a() {
            return -1;
        }

        @Override // j7.b.a
        public int b() {
            return this.f11442b;
        }

        @Override // j7.b.a
        public int c() {
            int i10 = this.f11443c;
            if (i10 == 8) {
                return this.f11441a.s();
            }
            if (i10 == 16) {
                return this.f11441a.x();
            }
            int i11 = this.d;
            this.d = i11 + 1;
            if (i11 % 2 == 0) {
                int s10 = this.f11441a.s();
                this.f11444e = s10;
                return (s10 & 240) >> 4;
            }
            return this.f11444e & 15;
        }
    }

    public static Pair<String, byte[]> a(t tVar, int i10) {
        tVar.D(i10 + 8 + 4);
        tVar.E(1);
        b(tVar);
        tVar.E(2);
        int s10 = tVar.s();
        if ((s10 & 128) != 0) {
            tVar.E(2);
        }
        if ((s10 & 64) != 0) {
            tVar.E(tVar.x());
        }
        if ((s10 & 32) != 0) {
            tVar.E(2);
        }
        tVar.E(1);
        b(tVar);
        String d = p.d(tVar.s());
        if (!"audio/mpeg".equals(d) && !"audio/vnd.dts".equals(d)) {
            if (!"audio/vnd.dts.hd".equals(d)) {
                tVar.E(12);
                tVar.E(1);
                int b10 = b(tVar);
                byte[] bArr = new byte[b10];
                System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, 0, b10);
                tVar.f12010b += b10;
                return Pair.create(d, bArr);
            }
        }
        return Pair.create(d, null);
    }

    public static int b(t tVar) {
        int s10 = tVar.s();
        int i10 = s10 & 127;
        while ((s10 & 128) == 128) {
            s10 = tVar.s();
            i10 = (i10 << 7) | (s10 & 127);
        }
        return i10;
    }

    public static Pair<Integer, k> c(t tVar, int i10, int i11) {
        Integer num;
        k kVar;
        Pair<Integer, k> create;
        int i12;
        int i13;
        byte[] bArr;
        int i14 = tVar.f12010b;
        while (i14 - i10 < i11) {
            tVar.D(i14);
            int f10 = tVar.f();
            int i15 = 1;
            c7.k.a(f10 > 0, "childAtomSize must be positive");
            if (tVar.f() == 1936289382) {
                int i16 = i14 + 8;
                int i17 = -1;
                int i18 = 0;
                String str = null;
                Integer num2 = null;
                while (i16 - i14 < f10) {
                    tVar.D(i16);
                    int f11 = tVar.f();
                    int f12 = tVar.f();
                    if (f12 == 1718775137) {
                        num2 = Integer.valueOf(tVar.f());
                    } else if (f12 == 1935894637) {
                        tVar.E(4);
                        str = tVar.p(4);
                    } else if (f12 == 1935894633) {
                        i17 = i16;
                        i18 = f11;
                    }
                    i16 += f11;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    c7.k.a(num2 != null, "frma atom is mandatory");
                    c7.k.a(i17 != -1, "schi atom is mandatory");
                    int i19 = i17 + 8;
                    while (true) {
                        if (i19 - i17 >= i18) {
                            num = num2;
                            kVar = null;
                            break;
                        }
                        tVar.D(i19);
                        int f13 = tVar.f();
                        if (tVar.f() == 1952804451) {
                            int f14 = (tVar.f() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                            tVar.E(i15);
                            if (f14 == 0) {
                                tVar.E(i15);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int s10 = tVar.s();
                                i12 = s10 & 15;
                                i13 = (s10 & 240) >> 4;
                            }
                            boolean z10 = tVar.s() == i15;
                            int s11 = tVar.s();
                            byte[] bArr2 = new byte[16];
                            System.arraycopy(tVar.f12009a, tVar.f12010b, bArr2, 0, 16);
                            tVar.f12010b += 16;
                            if (z10 && s11 == 0) {
                                int s12 = tVar.s();
                                byte[] bArr3 = new byte[s12];
                                System.arraycopy(tVar.f12009a, tVar.f12010b, bArr3, 0, s12);
                                tVar.f12010b += s12;
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            kVar = new k(z10, str, s11, bArr2, i13, i12, bArr);
                        } else {
                            i19 += f13;
                            i15 = 1;
                        }
                    }
                    c7.k.a(kVar != null, "tenc atom is mandatory");
                    int i20 = c0.f11939a;
                    create = Pair.create(num, kVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i14 += f10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j7.m d(j7.j r44, j7.a.C0166a r45, c7.q r46) {
        /*
            Method dump skipped, instructions count: 1630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.b.d(j7.j, j7.a$a, c7.q):j7.m");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
        if (r8 == 0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0bef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<j7.m> e(j7.a.C0166a r46, c7.q r47, long r48, com.google.android.exoplayer2.drm.b r50, boolean r51, boolean r52, jb.c<j7.j, j7.j> r53) {
        /*
            Method dump skipped, instructions count: 3143
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.b.e(j7.a$a, c7.q, long, com.google.android.exoplayer2.drm.b, boolean, boolean, jb.c):java.util.List");
    }
}
