package l;

import android.content.Context;
import java.io.DataInput;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Iterator;

/* renamed from: l.ۢ۠۬  reason: contains not printable characters */
/* loaded from: mthook/hook.dex */
public class C0185 {

    /* renamed from: ۠ۤۛ  reason: not valid java name and contains not printable characters */
    public static boolean f36 = true;

    /* renamed from: ۖۛ۫  reason: not valid java name and contains not printable characters */
    public static Object m1497(Object obj) {
        return ((Iterator) obj).next();
    }

    /* renamed from: ۗۙۘ  reason: not valid java name and contains not printable characters */
    public static File[] m1498(Object obj) {
        return ((File) obj).listFiles();
    }

    /* renamed from: ۙۥ۫  reason: not valid java name and contains not printable characters */
    public static int m1499(Object obj) {
        return ((InputStream) obj).available();
    }

    /* renamed from: ۙۦۖ  reason: not valid java name and contains not printable characters */
    public static boolean m1500(Object obj, Object obj2) {
        return ((String) obj).endsWith((String) obj2);
    }

    /* renamed from: ۚۦۚ  reason: not valid java name and contains not printable characters */
    public static void m1501(Object obj, Object obj2) {
        ((PrintStream) obj).println((String) obj2);
    }

    /* renamed from: ۛ۫ۖ  reason: not valid java name and contains not printable characters */
    public static String m1502(Object obj) {
        short[] sArr = (short[]) obj;
        int length = sArr.length;
        char[] cArr = new char[length];
        do {
            length--;
            cArr[length] = (char) (sArr[length] ^ (-98));
        } while (length != 0);
        return new String(cArr);
    }

    /* renamed from: ۜۗۜ  reason: not valid java name and contains not printable characters */
    public static String m1503(Object obj) {
        return obj.toString();
    }

    /* renamed from: ۠ۗۜ  reason: not valid java name and contains not printable characters */
    public static InterfaceC0189 m1504(File file, String str) {
        return new C0195(new C0194(file, str));
    }

    /* renamed from: ۠ۤۛ  reason: not valid java name and contains not printable characters */
    public static boolean m1505() {
        return false;
    }

    /* renamed from: ۠ۧۥ  reason: not valid java name and contains not printable characters */
    public static StringBuilder m1506(Object obj, long j10) {
        return ((StringBuilder) obj).append(j10);
    }

    /* renamed from: ۠۬ۘ  reason: not valid java name and contains not printable characters */
    public static Object m1507(Object obj, Object obj2) {
        return ((Field) obj).get(obj2);
    }

    /* renamed from: ۤۘۙ  reason: not valid java name and contains not printable characters */
    public static Class m1508(Object obj, boolean z10, Object obj2) {
        return Class.forName((String) obj, z10, (ClassLoader) obj2);
    }

    /* renamed from: ۤۘ۬  reason: not valid java name and contains not printable characters */
    public static String m1509(Object obj) {
        return ((Context) obj).getPackageName();
    }

    /* renamed from: ۤ۠ۜ  reason: not valid java name and contains not printable characters */
    public static void m1510(Object obj, boolean z10) {
        ((AccessibleObject) obj).setAccessible(z10);
    }

    /* renamed from: ۥ۠ۗ  reason: contains not printable characters */
    public static String m1511(int i10) {
        return Integer.toHexString(i10);
    }

    /* renamed from: ۧۡۦ  reason: not valid java name and contains not printable characters */
    public static void m1512(Object obj, Object obj2) {
        ((DataInput) obj).readFully((byte[]) obj2);
    }

    /* renamed from: ۬ۡۧ  reason: not valid java name and contains not printable characters */
    public static boolean m1513(Object obj) {
        return ((File) obj).isDirectory();
    }
}
