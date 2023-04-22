package l;

import android.content.Context;
import cc.binmt.signature.Hook;
import java.io.File;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.UByte;

/* renamed from: l.ۦۛ۟  reason: contains not printable characters */
/* loaded from: mthook/hook.dex */
public class C0191 {

    /* renamed from: ۗۢۤ  reason: not valid java name and contains not printable characters */
    public static boolean f89 = true;

    /* renamed from: ۖۙۡ  reason: not valid java name and contains not printable characters */
    public static byte[] m1586() {
        return Hook.getData();
    }

    /* renamed from: ۗۢۡ  reason: not valid java name and contains not printable characters */
    public static boolean m1587(Object obj, Object obj2) {
        return ((String) obj).matches((String) obj2);
    }

    /* renamed from: ۗۢۤ  reason: not valid java name and contains not printable characters */
    public static boolean m1588() {
        return false;
    }

    /* renamed from: ۘۤۗ  reason: not valid java name and contains not printable characters */
    public static String m1589(Object obj) {
        return ((Context) obj).getPackageResourcePath();
    }

    /* renamed from: ۙۗۜ  reason: not valid java name and contains not printable characters */
    public static Certificate m1590(Object obj, Object obj2) {
        return ((CertificateFactory) obj).generateCertificate((InputStream) obj2);
    }

    /* renamed from: ۚۗۙ  reason: not valid java name and contains not printable characters */
    public static void m1591(Object obj) {
        ((Throwable) obj).printStackTrace();
    }

    /* renamed from: ۚۘۨ  reason: not valid java name and contains not printable characters */
    public static boolean m1592(Object obj) {
        return ((File) obj).delete();
    }

    /* renamed from: ۚ۠ۥ  reason: not valid java name and contains not printable characters */
    public static boolean m1593(Object obj) {
        return ((Iterator) obj).hasNext();
    }

    /* renamed from: ۛۤۦ  reason: not valid java name and contains not printable characters */
    public static void m1594(Object obj) {
        System.loadLibrary((String) obj);
    }

    /* renamed from: ۡ۫ۘ  reason: not valid java name and contains not printable characters */
    public static int m1595(byte[] bArr, int i10) {
        return bArr[i10] & UByte.MAX_VALUE;
    }

    /* renamed from: ۤۖۘ  reason: not valid java name and contains not printable characters */
    public static String m1596(Object obj) {
        short[] sArr = (short[]) obj;
        int length = sArr.length;
        char[] cArr = new char[length];
        do {
            int i10 = length - 1;
            cArr[i10] = (char) (sArr[i10] ^ (-28));
            if (i10 == 0) {
                break;
            }
            int i11 = i10 - 1;
            cArr[i11] = (char) (sArr[i11] ^ (-20));
            if (i11 == 0) {
                break;
            }
            length = i11 - 1;
            cArr[length] = (char) (sArr[length] ^ 102);
        } while (length != 0);
        return new String(cArr);
    }

    /* renamed from: ۥ۟ۡ  reason: contains not printable characters */
    public static File m1597(Object obj) {
        return ((Context) obj).getCacheDir();
    }

    /* renamed from: ۥۥۖ  reason: contains not printable characters */
    public static long m1598(long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        int i10 = calendar.get(1);
        if (i10 < 1980) {
            return 2162688L;
        }
        return (calendar.get(13) >> 1) | ((i10 - 1980) << 25) | ((calendar.get(2) + 1) << 21) | (calendar.get(5) << 16) | (calendar.get(11) << 11) | (calendar.get(12) << 5);
    }

    /* renamed from: ۧۛ۫  reason: not valid java name and contains not printable characters */
    public static int m1599(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i10] & UByte.MAX_VALUE);
    }

    /* renamed from: ۨ۟ۙ  reason: not valid java name and contains not printable characters */
    public static int m1600(byte[] bArr, int i10) {
        return ((((bArr[i10 + 3] & UByte.MAX_VALUE) << 8) | (bArr[i10 + 2] & UByte.MAX_VALUE)) << 16) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8);
    }

    /* renamed from: ۬ۦۤ  reason: not valid java name and contains not printable characters */
    public static void m1601(Object obj, Object obj2) {
        Hook.hookOpen((String) obj, (String) obj2);
    }

    /* renamed from: ۬۫ۗ  reason: not valid java name and contains not printable characters */
    public static long m1602(long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, ((int) ((j10 >> 25) & 127)) + 1980);
        calendar.set(2, ((int) ((j10 >> 21) & 15)) - 1);
        calendar.set(5, ((int) (j10 >> 16)) & 31);
        calendar.set(11, ((int) (j10 >> 11)) & 31);
        calendar.set(12, ((int) (j10 >> 5)) & 63);
        calendar.set(13, ((int) (j10 << 1)) & 62);
        return calendar.getTime().getTime();
    }
}
