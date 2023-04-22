package t7;

import com.appsflyer.oaid.BuildConfig;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import k8.c0;
import k8.s;
import k8.t;
import kotlin.UByte;
import s6.q;

/* loaded from: classes2.dex */
public final class g extends jd.e {

    /* renamed from: f  reason: collision with root package name */
    public static final a f15149f = q.f14886m;

    /* renamed from: c  reason: collision with root package name */
    public final a f15150c;

    /* loaded from: classes2.dex */
    public interface a {
        boolean b(int i10, int i11, int i12, int i13, int i14);
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f15151a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f15152b;

        /* renamed from: c  reason: collision with root package name */
        public final int f15153c;

        public b(int i10, boolean z10, int i11) {
            this.f15151a = i10;
            this.f15152b = z10;
            this.f15153c = i11;
        }
    }

    public g() {
        this.f15150c = null;
    }

    public g(a aVar) {
        this.f15150c = aVar;
    }

    public static String A(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int B(byte[] bArr, int i10, int i11) {
        int C = C(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return C;
        }
        while (C < bArr.length - 1) {
            if (C % 2 == 0 && bArr[C + 1] == 0) {
                return C;
            }
            C = C(bArr, C + 1);
        }
        return bArr.length;
    }

    public static int C(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int D(t tVar, int i10) {
        byte[] bArr = tVar.f12009a;
        int i11 = tVar.f12010b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & UByte.MAX_VALUE) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean E(k8.t r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.g.E(k8.t, int, int, boolean):boolean");
    }

    public static byte[] i(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? c0.f11943f : Arrays.copyOfRange(bArr, i10, i11);
    }

    public static t7.a k(t tVar, int i10, int i11) {
        int C;
        String concat;
        int s10 = tVar.s();
        String z10 = z(s10);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, 0, i12);
        tVar.f12010b += i12;
        if (i11 == 2) {
            String valueOf = String.valueOf(t3.a.v(new String(bArr, 0, 3, "ISO-8859-1")));
            String concat2 = valueOf.length() != 0 ? "image/".concat(valueOf) : new String("image/");
            if ("image/jpg".equals(concat2)) {
                concat2 = "image/jpeg";
            }
            concat = concat2;
            C = 2;
        } else {
            C = C(bArr, 0);
            String v2 = t3.a.v(new String(bArr, 0, C, "ISO-8859-1"));
            concat = v2.indexOf(47) == -1 ? v2.length() != 0 ? "image/".concat(v2) : new String("image/") : v2;
        }
        int i13 = bArr[C + 1] & UByte.MAX_VALUE;
        int i14 = C + 2;
        int B = B(bArr, i14, s10);
        return new t7.a(concat, new String(bArr, i14, B - i14, z10), i13, i(bArr, y(s10) + B, i12));
    }

    public static t7.b l(t tVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, 0, i10);
        tVar.f12010b += i10;
        return new t7.b(str, bArr);
    }

    public static c m(t tVar, int i10, int i11, boolean z10, int i12, a aVar) {
        int i13 = tVar.f12010b;
        int C = C(tVar.f12009a, i13);
        String str = new String(tVar.f12009a, i13, C - i13, "ISO-8859-1");
        tVar.D(C + 1);
        int f10 = tVar.f();
        int f11 = tVar.f();
        long t2 = tVar.t();
        long j10 = t2 == 4294967295L ? -1L : t2;
        long t8 = tVar.t();
        long j11 = t8 == 4294967295L ? -1L : t8;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (tVar.f12010b < i14) {
            h p10 = p(i11, tVar, z10, i12, aVar);
            if (p10 != null) {
                arrayList.add(p10);
            }
        }
        return new c(str, f10, f11, j10, j11, (h[]) arrayList.toArray(new h[0]));
    }

    public static d n(t tVar, int i10, int i11, boolean z10, int i12, a aVar) {
        int i13 = tVar.f12010b;
        int C = C(tVar.f12009a, i13);
        String str = new String(tVar.f12009a, i13, C - i13, "ISO-8859-1");
        tVar.D(C + 1);
        int s10 = tVar.s();
        boolean z11 = (s10 & 2) != 0;
        boolean z12 = (s10 & 1) != 0;
        int s11 = tVar.s();
        String[] strArr = new String[s11];
        for (int i14 = 0; i14 < s11; i14++) {
            int i15 = tVar.f12010b;
            int C2 = C(tVar.f12009a, i15);
            strArr[i14] = new String(tVar.f12009a, i15, C2 - i15, "ISO-8859-1");
            tVar.D(C2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (tVar.f12010b < i16) {
            h p10 = p(i11, tVar, z10, i12, aVar);
            if (p10 != null) {
                arrayList.add(p10);
            }
        }
        return new d(str, z11, z12, strArr, (h[]) arrayList.toArray(new h[0]));
    }

    public static e o(t tVar, int i10) {
        if (i10 < 4) {
            return null;
        }
        int s10 = tVar.s();
        String z10 = z(s10);
        byte[] bArr = new byte[3];
        System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, 0, 3);
        tVar.f12010b += 3;
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        System.arraycopy(tVar.f12009a, tVar.f12010b, bArr2, 0, i11);
        tVar.f12010b += i11;
        int B = B(bArr2, 0, s10);
        String str2 = new String(bArr2, 0, B, z10);
        int y = y(s10) + B;
        return new e(str, str2, t(bArr2, y, B(bArr2, y, s10), z10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x01ac, code lost:
        if (r13 == 67) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static t7.h p(int r19, k8.t r20, boolean r21, int r22, t7.g.a r23) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.g.p(int, k8.t, boolean, int, t7.g$a):t7.h");
    }

    public static f q(t tVar, int i10) {
        int s10 = tVar.s();
        String z10 = z(s10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, 0, i11);
        tVar.f12010b += i11;
        int C = C(bArr, 0);
        String str = new String(bArr, 0, C, "ISO-8859-1");
        int i12 = C + 1;
        int B = B(bArr, i12, s10);
        String t2 = t(bArr, i12, B, z10);
        int y = y(s10) + B;
        int B2 = B(bArr, y, s10);
        return new f(str, t2, t(bArr, y, B2, z10), i(bArr, y(s10) + B2, i11));
    }

    public static j r(t tVar, int i10) {
        int x10 = tVar.x();
        int u2 = tVar.u();
        int u10 = tVar.u();
        int s10 = tVar.s();
        int s11 = tVar.s();
        s sVar = new s();
        sVar.j(tVar.f12009a, tVar.f12011c);
        sVar.k(tVar.f12010b * 8);
        int i11 = ((i10 - 10) * 8) / (s10 + s11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int g10 = sVar.g(s10);
            int g11 = sVar.g(s11);
            iArr[i12] = g10;
            iArr2[i12] = g11;
        }
        return new j(x10, u2, u10, iArr, iArr2);
    }

    public static k s(t tVar, int i10) {
        byte[] bArr = new byte[i10];
        System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, 0, i10);
        tVar.f12010b += i10;
        int C = C(bArr, 0);
        return new k(new String(bArr, 0, C, "ISO-8859-1"), i(bArr, C + 1, i10));
    }

    public static String t(byte[] bArr, int i10, int i11, String str) {
        return (i11 <= i10 || i11 > bArr.length) ? BuildConfig.FLAVOR : new String(bArr, i10, i11 - i10, str);
    }

    public static l u(t tVar, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int s10 = tVar.s();
        String z10 = z(s10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, 0, i11);
        tVar.f12010b += i11;
        return new l(str, null, new String(bArr, 0, B(bArr, 0, s10), z10));
    }

    public static l v(t tVar, int i10) {
        if (i10 < 1) {
            return null;
        }
        int s10 = tVar.s();
        String z10 = z(s10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, 0, i11);
        tVar.f12010b += i11;
        int B = B(bArr, 0, s10);
        String str = new String(bArr, 0, B, z10);
        int y = y(s10) + B;
        return new l("TXXX", str, t(bArr, y, B(bArr, y, s10), z10));
    }

    public static m w(t tVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, 0, i10);
        tVar.f12010b += i10;
        return new m(str, null, new String(bArr, 0, C(bArr, 0), "ISO-8859-1"));
    }

    public static m x(t tVar, int i10) {
        if (i10 < 1) {
            return null;
        }
        int s10 = tVar.s();
        String z10 = z(s10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, 0, i11);
        tVar.f12010b += i11;
        int B = B(bArr, 0, s10);
        String str = new String(bArr, 0, B, z10);
        int y = y(s10) + B;
        return new m("WXXX", str, t(bArr, y, C(bArr, y), "ISO-8859-1"));
    }

    public static int y(int i10) {
        if (i10 != 0 && i10 != 3) {
            return 2;
        }
        return 1;
    }

    public static String z(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    @Override // jd.e
    public o7.a g(o7.d dVar, ByteBuffer byteBuffer) {
        return j(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o7.a j(byte[] r14, int r15) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.g.j(byte[], int):o7.a");
    }
}
