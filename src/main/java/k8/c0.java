package k8;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a */
    public static final int f11939a;

    /* renamed from: b */
    public static final String f11940b;

    /* renamed from: c */
    public static final String f11941c;
    public static final String d;

    /* renamed from: e */
    public static final String f11942e;

    /* renamed from: f */
    public static final byte[] f11943f;

    /* renamed from: g */
    public static final Pattern f11944g;

    /* renamed from: h */
    public static HashMap<String, String> f11945h;

    /* renamed from: i */
    public static final String[] f11946i;

    /* renamed from: j */
    public static final String[] f11947j;

    /* renamed from: k */
    public static final int[] f11948k;

    /* renamed from: l */
    public static final int[] f11949l;

    static {
        String str = Build.VERSION.CODENAME;
        int i10 = "S".equals(str) ? 31 : "R".equals(str) ? 30 : Build.VERSION.SDK_INT;
        f11939a = i10;
        String str2 = Build.DEVICE;
        f11940b = str2;
        String str3 = Build.MANUFACTURER;
        f11941c = str3;
        String str4 = Build.MODEL;
        d = str4;
        StringBuilder n = a0.a.n(a0.a.e(str3, a0.a.e(str4, a0.a.e(str2, 17))), str2, ", ", str4, ", ");
        n.append(str3);
        n.append(", ");
        n.append(i10);
        f11942e = n.toString();
        f11943f = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f11944g = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f11946i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f11947j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f11948k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f11949l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, KotlinVersion.MAX_COMPONENT_VALUE, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0112 A[EDGE_INSN: B:122:0x0112->B:112:0x0112 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.c0.A(java.lang.String):java.lang.String");
    }

    public static <T> T[] B(T[] tArr, int i10) {
        a.c(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static boolean C(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
                return true;
            }
            return handler.post(runnable);
        }
        return false;
    }

    public static long D(long j10, long j11, long j12) {
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 < 0 || j12 % j11 != 0) {
            if (i10 >= 0 || j11 % j12 != 0) {
                return (long) (j10 * (j11 / j12));
            }
            return (j11 / j12) * j10;
        }
        return j10 / (j12 / j11);
    }

    public static void E(long[] jArr, long j10, long j11) {
        int i10 = 0;
        int i11 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i11 >= 0 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j12;
                i10++;
            }
        } else if (i11 >= 0 || j10 % j11 != 0) {
            double d10 = j10 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = (long) (jArr[i10] * d10);
                i10++;
            }
        } else {
            long j13 = j10 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] * j13;
                i10++;
            }
        }
    }

    public static String[] F(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] G(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] H(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : F(str.trim(), "(\\s*,\\s*)");
    }

    public static byte[] I(InputStream inputStream) {
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static long J(int i10) {
        return i10 & 4294967295L;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            while (true) {
                binarySearch++;
                if (binarySearch >= jArr.length || jArr[binarySearch] != j10) {
                    break;
                }
            }
            i10 = z10 ? binarySearch - 1 : binarySearch;
        }
        if (z11) {
            i10 = Math.min(jArr.length - 1, i10);
        }
        return i10;
    }

    public static int c(n nVar, long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = nVar.f11976a - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            if (nVar.b(i13) < j10) {
                i12 = i13 + 1;
            } else {
                i11 = i13 - 1;
            }
        }
        if (z10 && (i10 = i11 + 1) < nVar.f11976a && nVar.b(i10) == j10) {
            return i10;
        }
        if (z11 && i11 == -1) {
            return 0;
        }
        return i11;
    }

    public static int d(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int binarySearch = Arrays.binarySearch(iArr, i10);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                binarySearch--;
                if (binarySearch < 0 || iArr[binarySearch] != i10) {
                    break;
                }
            }
            i11 = z10 ? binarySearch + 1 : binarySearch;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static int e(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j10);
            i10 = z10 ? binarySearch + 1 : binarySearch;
        }
        if (z11) {
            i10 = Math.max(0, i10);
        }
        return i10;
    }

    public static int f(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static float g(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int h(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static long i(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static Handler j() {
        Looper myLooper = Looper.myLooper();
        a.g(myLooper);
        return new Handler(myLooper, null);
    }

    public static String k(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String l(byte[] bArr) {
        return new String(bArr, jb.b.f11660c);
    }

    public static String m(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, jb.b.f11660c);
    }

    public static int n(int i10) {
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i11 = f11939a;
                if (i11 < 23 && i11 < 21) {
                    return 0;
                }
                return 6396;
            default:
                return 0;
        }
    }

    public static Looper o() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static long p(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    public static int q(int i10) {
        if (i10 != 8) {
            if (i10 != 16) {
                if (i10 != 24) {
                    return i10 != 32 ? 0 : 805306368;
                }
                return 536870912;
            }
            return 2;
        }
        return 3;
    }

    public static int r(int i10, int i11) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 268435456) {
                        if (i10 == 536870912) {
                            return i11 * 3;
                        }
                        if (i10 != 805306368) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                return i11 * 4;
            }
            return i11;
        }
        return i11 * 2;
    }

    public static int s(int i10) {
        if (i10 != 13) {
            switch (i10) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
        return 1;
    }

    public static String t(StringBuilder sb2, Formatter formatter, long j10) {
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        String str = j10 < 0 ? "-" : BuildConfig.FLAVOR;
        long abs = (Math.abs(j10) + 500) / 1000;
        long j11 = abs % 60;
        long j12 = (abs / 60) % 60;
        long j13 = abs / 3600;
        sb2.setLength(0);
        return j13 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11)).toString();
    }

    public static String u(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            a.i("Util", str.length() != 0 ? "Failed to read system property ".concat(str) : new String("Failed to read system property "), e10);
            return null;
        }
    }

    public static byte[] v(String str) {
        return str.getBytes(jb.b.f11660c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0075, code lost:
        r6.reset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0079, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean w(k8.t r4, k8.t r5, java.util.zip.Inflater r6) {
        /*
            int r3 = r4.a()
            r0 = r3
            r1 = 0
            r3 = 1
            if (r0 > 0) goto Lb
            r3 = 7
            return r1
        Lb:
            byte[] r0 = r5.f12009a
            r3 = 6
            int r0 = r0.length
            r3 = 6
            int r3 = r4.a()
            r2 = r3
            if (r0 >= r2) goto L21
            int r0 = r4.a()
            int r0 = r0 * 2
            r3 = 3
            r5.b(r0)
        L21:
            r3 = 5
            if (r6 != 0) goto L2b
            r3 = 4
            java.util.zip.Inflater r6 = new java.util.zip.Inflater
            r3 = 4
            r6.<init>()
        L2b:
            r3 = 1
            byte[] r0 = r4.f12009a
            int r2 = r4.f12010b
            int r4 = r4.a()
            r6.setInput(r0, r2, r4)
            r3 = 0
            r4 = r3
        L39:
            r3 = 6
        L3a:
            r3 = 2
            byte[] r0 = r5.f12009a     // Catch: java.lang.Throwable -> L7a java.util.zip.DataFormatException -> L80
            int r2 = r0.length     // Catch: java.lang.Throwable -> L7a java.util.zip.DataFormatException -> L80
            int r2 = r2 - r4
            r3 = 5
            int r3 = r6.inflate(r0, r4, r2)     // Catch: java.lang.Throwable -> L7a java.util.zip.DataFormatException -> L80
            r0 = r3
            int r4 = r4 + r0
            r3 = 7
            boolean r0 = r6.finished()     // Catch: java.lang.Throwable -> L7a java.util.zip.DataFormatException -> L80
            if (r0 == 0) goto L56
            r3 = 5
            r5.C(r4)     // Catch: java.lang.Throwable -> L7a java.util.zip.DataFormatException -> L80
            r4 = 1
            r6.reset()
            return r4
        L56:
            r3 = 1
            boolean r0 = r6.needsDictionary()     // Catch: java.lang.Throwable -> L7a java.util.zip.DataFormatException -> L80
            if (r0 != 0) goto L75
            boolean r0 = r6.needsInput()     // Catch: java.lang.Throwable -> L7a java.util.zip.DataFormatException -> L80
            if (r0 == 0) goto L65
            r3 = 2
            goto L75
        L65:
            r3 = 1
            byte[] r0 = r5.f12009a     // Catch: java.lang.Throwable -> L7a java.util.zip.DataFormatException -> L80
            r3 = 2
            int r2 = r0.length     // Catch: java.lang.Throwable -> L7a java.util.zip.DataFormatException -> L80
            if (r4 != r2) goto L39
            r3 = 5
            int r0 = r0.length     // Catch: java.lang.Throwable -> L7a java.util.zip.DataFormatException -> L80
            int r0 = r0 * 2
            r3 = 4
            r5.b(r0)     // Catch: java.lang.Throwable -> L7a java.util.zip.DataFormatException -> L80
            goto L3a
        L75:
            r6.reset()
            r3 = 2
            return r1
        L7a:
            r4 = move-exception
            r6.reset()
            r3 = 6
            throw r4
        L80:
            r6.reset()
            r3 = 7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.c0.w(k8.t, k8.t, java.util.zip.Inflater):boolean");
    }

    public static boolean x(int i10) {
        if (i10 != 536870912 && i10 != 805306368) {
            if (i10 != 4) {
                return false;
            }
        }
        return true;
    }

    public static boolean y(int i10) {
        if (i10 != 3 && i10 != 2 && i10 != 268435456 && i10 != 536870912 && i10 != 805306368) {
            if (i10 != 4) {
                return false;
            }
        }
        return true;
    }

    public static boolean z(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }
}
