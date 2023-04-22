package l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.nio.charset.Charset;
import java.security.cert.Certificate;

/* renamed from: l.ۥۤۖ  reason: contains not printable characters */
/* loaded from: mthook/hook.dex */
public class C0190 {

    /* renamed from: ۨۘ۟  reason: not valid java name and contains not printable characters */
    public static int f70;

    /* renamed from: ۖۖۢ  reason: not valid java name and contains not printable characters */
    public int f71;

    /* renamed from: ۗ۫ۖ  reason: not valid java name and contains not printable characters */
    public byte[] f72;

    /* renamed from: ۗ۬ۢ  reason: not valid java name and contains not printable characters */
    public int f73;

    /* renamed from: ۘۖۦ  reason: not valid java name and contains not printable characters */
    public long f74;

    /* renamed from: ۘۛۖ  reason: not valid java name and contains not printable characters */
    public int f75;

    /* renamed from: ۛ۟ۚ  reason: not valid java name and contains not printable characters */
    public long f76;

    /* renamed from: ۜۤۗ  reason: not valid java name and contains not printable characters */
    public int f77;

    /* renamed from: ۟۫ۢ  reason: not valid java name and contains not printable characters */
    public int f78;

    /* renamed from: ۠ۙ۟  reason: not valid java name and contains not printable characters */
    public byte[] f79;

    /* renamed from: ۠ۚۙ  reason: not valid java name and contains not printable characters */
    public int f80;

    /* renamed from: ۠ۡۜ  reason: not valid java name and contains not printable characters */
    public int f81;

    /* renamed from: ۡۧۖ  reason: not valid java name and contains not printable characters */
    public byte[] f82;

    /* renamed from: ۤ۬ۖ  reason: not valid java name and contains not printable characters */
    public boolean f83;

    /* renamed from: ۥۙۤ  reason: contains not printable characters */
    public int f84;

    /* renamed from: ۥۤۢ  reason: contains not printable characters */
    public int f85;

    /* renamed from: ۦۥۦ  reason: contains not printable characters */
    public int f86;

    /* renamed from: ۨۦۤ  reason: not valid java name and contains not printable characters */
    public boolean f87;

    /* renamed from: ۨۨ۟  reason: not valid java name and contains not printable characters */
    public int f88;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0061, code lost:
        if (r3.endsWith(l.C0180.m1461(r0)) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0190(java.lang.String r3, java.nio.charset.Charset r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 10
            r2.f75 = r0
            r2.f84 = r0
            byte[] r0 = r3.getBytes(r4)
            r2.f72 = r0
            java.lang.String r4 = r4.name()
            r0 = 5
            short[] r0 = l.C0180.m1458(r0)
            r0 = {x0068: FILL_ARRAY_DATA  , data: [-71, -80, 32, -63, -36} // fill-array
            java.lang.String r0 = l.C0191.m1596(r0)
            boolean r4 = r4.equalsIgnoreCase(r0)
            r2.f83 = r4
            r4 = 0
            byte[] r0 = new byte[r4]
            r2.f79 = r0
            byte[] r0 = new byte[r4]
            r2.f82 = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = l.C0191.m1598(r0)
            int r1 = (int) r0
            r2.f78 = r1
            r0 = 1
            short[] r0 = l.C0180.m1458(r0)
            r0 = {x0072: FILL_ARRAY_DATA  , data: [-33} // fill-array
            java.lang.String r0 = l.C0180.m1461(r0)
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L63
            r0 = 1
            short[] r0 = l.C0180.m1458(r0)
            r0 = {x0078: FILL_ARRAY_DATA  , data: [-84} // fill-array
            java.lang.String r0 = l.C0180.m1461(r0)
            boolean r3 = r3.endsWith(r0)
            if (r3 == 0) goto L64
        L63:
            r4 = 1
        L64:
            r2.f87 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0190.<init>(java.lang.String, java.nio.charset.Charset):void");
    }

    public C0190(C0187 c0187, Charset charset) {
        this.f75 = 10;
        this.f84 = 10;
        if (c0187.m1540()) {
            this.f75 = 20;
            this.f84 = 20;
        }
        this.f72 = c0187.m1548().getBytes(charset);
        String name = charset.name();
        short[] m1458 = C0180.m1458(5);
        // fill-array-data instruction
        m1458[0] = 20;
        m1458[1] = 21;
        m1458[2] = 7;
        m1458[3] = 108;
        m1458[4] = 121;
        this.f83 = name.equalsIgnoreCase(C0188.m1556(m1458));
        this.f78 = (int) C0191.m1598(c0187.m1533());
        this.f79 = c0187.m1520() == null ? new byte[0] : c0187.m1520();
        this.f82 = c0187.m1542() == null ? new byte[0] : c0187.m1542().getBytes(charset);
        this.f88 = c0187.m1516();
        this.f81 = c0187.m1526();
        this.f87 = c0187.m1527();
    }

    /* renamed from: ۖۥۚ  reason: not valid java name and contains not printable characters */
    public static Class m1575(Object obj) {
        return obj.getClass();
    }

    /* renamed from: ۚۦۙ  reason: not valid java name and contains not printable characters */
    public static File m1576(Object obj) {
        return ((File) obj).getParentFile();
    }

    /* renamed from: ۛۚ۠  reason: not valid java name and contains not printable characters */
    public static void m1577(Object obj) {
        ((Closeable) obj).close();
    }

    /* renamed from: ۛ۫ۘ  reason: not valid java name and contains not printable characters */
    public static File m1578(Object obj) {
        return ((Context) obj).getFilesDir();
    }

    /* renamed from: ۜۙۢ  reason: not valid java name and contains not printable characters */
    public static int m1579(Object obj) {
        return ((Number) obj).intValue();
    }

    /* renamed from: ۜ۬ۘ  reason: not valid java name and contains not printable characters */
    public static String m1580(Object obj) {
        short[] sArr = (short[]) obj;
        int length = sArr.length;
        char[] cArr = new char[length];
        do {
            int i10 = length - 1;
            cArr[i10] = (char) (sArr[i10] ^ (-115));
            if (i10 == 0) {
                break;
            }
            length = i10 - 1;
            cArr[length] = (char) (sArr[length] ^ (-67));
        } while (length != 0);
        return new String(cArr);
    }

    /* renamed from: ۜ۬۟  reason: not valid java name and contains not printable characters */
    public static byte[] m1581(Object obj) {
        return ((Certificate) obj).getEncoded();
    }

    /* renamed from: ۥۡۚ  reason: contains not printable characters */
    public static ClassLoader m1582(Object obj) {
        return ((Class) obj).getClassLoader();
    }

    /* renamed from: ۥ۫۟  reason: contains not printable characters */
    public static ApplicationInfo m1583(Object obj) {
        return ((Context) obj).getApplicationInfo();
    }

    /* renamed from: ۨۘ۟  reason: not valid java name and contains not printable characters */
    public static boolean m1584() {
        return true;
    }

    /* renamed from: ۨ۟۬  reason: not valid java name and contains not printable characters */
    public static StringBuilder m1585(Object obj, Object obj2) {
        return ((StringBuilder) obj).append((String) obj2);
    }
}
