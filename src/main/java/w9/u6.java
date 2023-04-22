package w9;

import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzjp;
import com.google.android.gms.internal.measurement.zzkh;
import com.google.android.gms.internal.measurement.zzkw;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class u6<T> implements c7<T> {
    public static final int[] n = new int[0];

    /* renamed from: o  reason: collision with root package name */
    public static final Unsafe f17316o = v7.k();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f17317a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f17318b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17319c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final s6 f17320e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f17321f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f17322g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f17323h;

    /* renamed from: i  reason: collision with root package name */
    public final int f17324i;

    /* renamed from: j  reason: collision with root package name */
    public final int f17325j;

    /* renamed from: k  reason: collision with root package name */
    public final g6 f17326k;

    /* renamed from: l  reason: collision with root package name */
    public final o7 f17327l;

    /* renamed from: m  reason: collision with root package name */
    public final j5 f17328m;

    public u6(int[] iArr, Object[] objArr, int i10, int i11, s6 s6Var, boolean z10, int[] iArr2, int i12, int i13, w6 w6Var, g6 g6Var, o7 o7Var, j5 j5Var, m6 m6Var) {
        this.f17317a = iArr;
        this.f17318b = objArr;
        this.f17319c = i10;
        this.d = i11;
        this.f17322g = z10;
        this.f17321f = j5Var != null && j5Var.c(s6Var);
        this.f17323h = iArr2;
        this.f17324i = i12;
        this.f17325j = i13;
        this.f17326k = g6Var;
        this.f17327l = o7Var;
        this.f17328m = j5Var;
        this.f17320e = s6Var;
    }

    public static p7 B(Object obj) {
        u5 u5Var = (u5) obj;
        p7 p7Var = u5Var.zzc;
        if (p7Var == p7.f17276f) {
            p7 b10 = p7.b();
            u5Var.zzc = b10;
            return b10;
        }
        return p7Var;
    }

    public static u6 C(o6 o6Var, w6 w6Var, g6 g6Var, o7 o7Var, j5 j5Var, m6 m6Var) {
        if (o6Var instanceof b7) {
            return D((b7) o6Var, w6Var, g6Var, o7Var, j5Var, m6Var);
        }
        m7 m7Var = (m7) o6Var;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w9.u6 D(w9.b7 r35, w9.w6 r36, w9.g6 r37, w9.o7 r38, w9.j5 r39, w9.m6 r40) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.u6.D(w9.b7, w9.w6, w9.g6, w9.o7, w9.j5, w9.m6):w9.u6");
    }

    public static double E(Object obj, long j10) {
        return ((Double) v7.j(obj, j10)).doubleValue();
    }

    public static float F(Object obj, long j10) {
        return ((Float) v7.j(obj, j10)).floatValue();
    }

    public static int I(Object obj, long j10) {
        return ((Integer) v7.j(obj, j10)).intValue();
    }

    public static long k(Object obj, long j10) {
        return ((Long) v7.j(obj, j10)).longValue();
    }

    public static Field o(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            android.support.v4.media.a.o(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(android.support.v4.media.b.m(sb2, " not found. Known fields are ", arrays));
        }
    }

    public static boolean x(Object obj, long j10) {
        return ((Boolean) v7.j(obj, j10)).booleanValue();
    }

    public static final void z(int i10, Object obj, f5 f5Var) {
        if (obj instanceof String) {
            f5Var.f17135a.w0(i10, (String) obj);
            return;
        }
        f5Var.f17135a.p0(i10, (zzix) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x04dc, code lost:
        if (r5 == 1048575) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04de, code lost:
        r30.putInt(r12, r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04e4, code lost:
        r3 = r8.f17324i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04e8, code lost:
        if (r3 >= r8.f17325j) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04ea, code lost:
        r4 = r8.f17323h[r3];
        r5 = r8.f17317a[r4];
        r5 = w9.v7.j(r12, r8.j(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04fc, code lost:
        if (r5 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0503, code lost:
        if (r8.l(r4) != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0505, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0508, code lost:
        r5 = (com.google.android.gms.internal.measurement.zzkw) r5;
        r0 = (w9.l6) r8.n(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0510, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0511, code lost:
        if (r1 != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0515, code lost:
        if (r0 != r36) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x051c, code lost:
        throw com.google.android.gms.internal.measurement.zzkh.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x051f, code lost:
        if (r0 > r36) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0521, code lost:
        if (r9 != r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0523, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0528, code lost:
        throw com.google.android.gms.internal.measurement.zzkh.c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, w9.b5 r38) {
        /*
            Method dump skipped, instructions count: 1360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.u6.A(java.lang.Object, byte[], int, int, int, w9.b5):int");
    }

    public final int G(Object obj) {
        int i10;
        int l02;
        int l03;
        int l04;
        int m02;
        int l05;
        int E0;
        int l06;
        int l07;
        int g10;
        int l08;
        int H;
        int l09;
        int m03;
        int B;
        int H0;
        int l010;
        int i11;
        int l011;
        int g11;
        int l012;
        Unsafe unsafe = f17316o;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        int i16 = 0;
        while (i13 < this.f17317a.length) {
            int j10 = j(i13);
            int[] iArr = this.f17317a;
            int i17 = iArr[i13];
            int i18 = (j10 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i18 <= 17) {
                int i19 = iArr[i13 + 2];
                int i20 = i19 & i12;
                i10 = 1 << (i19 >>> 20);
                if (i20 != i15) {
                    i16 = unsafe.getInt(obj, i20);
                    i15 = i20;
                }
            } else {
                i10 = 0;
            }
            long j11 = i12 & j10;
            switch (i18) {
                case 0:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        l02 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        H = l02 + 8;
                        i14 += H;
                        break;
                    }
                case 1:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        l03 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        H = l03 + 4;
                        i14 += H;
                        break;
                    }
                case 2:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(obj, j11);
                        l04 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        m02 = com.google.android.gms.internal.measurement.e.m0(j12);
                        H = l04 + m02;
                        i14 += H;
                        break;
                    }
                case 3:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        long j13 = unsafe.getLong(obj, j11);
                        l04 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        m02 = com.google.android.gms.internal.measurement.e.m0(j13);
                        H = l04 + m02;
                        i14 += H;
                        break;
                    }
                case 4:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        int i21 = unsafe.getInt(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.E0(i21);
                        H = E0 + l05;
                        i14 += H;
                        break;
                    }
                case 5:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        l02 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        H = l02 + 8;
                        i14 += H;
                        break;
                    }
                case 6:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        l03 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        H = l03 + 4;
                        i14 += H;
                        break;
                    }
                case 7:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        l06 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        H = l06 + 1;
                        i14 += H;
                        break;
                    }
                case 8:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j11);
                        if (!(object instanceof zzix)) {
                            l05 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                            E0 = com.google.android.gms.internal.measurement.e.G0((String) object);
                            H = E0 + l05;
                            i14 += H;
                            break;
                        } else {
                            l07 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                            g10 = ((zzix) object).g();
                            l08 = com.google.android.gms.internal.measurement.e.l0(g10);
                            i14 = l08 + g10 + l07 + i14;
                            break;
                        }
                    }
                case 9:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        H = e7.H(i17, unsafe.getObject(obj, j11), m(i13));
                        i14 += H;
                        break;
                    }
                case 10:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        l07 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        g10 = ((zzix) unsafe.getObject(obj, j11)).g();
                        l08 = com.google.android.gms.internal.measurement.e.l0(g10);
                        i14 = l08 + g10 + l07 + i14;
                        break;
                    }
                case 11:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        int i22 = unsafe.getInt(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.l0(i22);
                        H = E0 + l05;
                        i14 += H;
                        break;
                    }
                case 12:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        int i23 = unsafe.getInt(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.E0(i23);
                        H = E0 + l05;
                        i14 += H;
                        break;
                    }
                case 13:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        l03 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        H = l03 + 4;
                        i14 += H;
                        break;
                    }
                case 14:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        l02 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        H = l02 + 8;
                        i14 += H;
                        break;
                    }
                case 15:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        int i24 = unsafe.getInt(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.l0((i24 >> 31) ^ (i24 + i24));
                        H = E0 + l05;
                        i14 += H;
                        break;
                    }
                case 16:
                    if ((i10 & i16) == 0) {
                        break;
                    } else {
                        long j14 = unsafe.getLong(obj, j11);
                        l09 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        m03 = com.google.android.gms.internal.measurement.e.m0((j14 >> 63) ^ (j14 + j14));
                        H = m03 + l09;
                        i14 += H;
                        break;
                    }
                case 17:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        H = com.google.android.gms.internal.measurement.e.D0(i17, (s6) unsafe.getObject(obj, j11), m(i13));
                        i14 += H;
                        break;
                    }
                case 18:
                    H = e7.A(i17, (List) unsafe.getObject(obj, j11));
                    i14 += H;
                    break;
                case 19:
                    H = e7.y(i17, (List) unsafe.getObject(obj, j11));
                    i14 += H;
                    break;
                case 20:
                    H = e7.F(i17, (List) unsafe.getObject(obj, j11));
                    i14 += H;
                    break;
                case 21:
                    H = e7.Q(i17, (List) unsafe.getObject(obj, j11), false);
                    i14 += H;
                    break;
                case 22:
                    H = e7.D(i17, (List) unsafe.getObject(obj, j11), false);
                    i14 += H;
                    break;
                case 23:
                    H = e7.A(i17, (List) unsafe.getObject(obj, j11));
                    i14 += H;
                    break;
                case 24:
                    H = e7.y(i17, (List) unsafe.getObject(obj, j11));
                    i14 += H;
                    break;
                case 25:
                    H = e7.s(i17, (List) unsafe.getObject(obj, j11));
                    i14 += H;
                    break;
                case 26:
                    H = e7.N(i17, (List) unsafe.getObject(obj, j11));
                    i14 += H;
                    break;
                case 27:
                    H = e7.I(i17, (List) unsafe.getObject(obj, j11), m(i13));
                    i14 += H;
                    break;
                case 28:
                    H = e7.v(i17, (List) unsafe.getObject(obj, j11));
                    i14 += H;
                    break;
                case 29:
                    H = e7.O(i17, (List) unsafe.getObject(obj, j11), false);
                    i14 += H;
                    break;
                case 30:
                    H = e7.w(i17, (List) unsafe.getObject(obj, j11), false);
                    i14 += H;
                    break;
                case 31:
                    H = e7.y(i17, (List) unsafe.getObject(obj, j11));
                    i14 += H;
                    break;
                case 32:
                    H = e7.A(i17, (List) unsafe.getObject(obj, j11));
                    i14 += H;
                    break;
                case 33:
                    H = e7.J(i17, (List) unsafe.getObject(obj, j11), false);
                    i14 += H;
                    break;
                case 34:
                    H = e7.L(i17, (List) unsafe.getObject(obj, j11), false);
                    i14 += H;
                    break;
                case 35:
                    B = e7.B((List) unsafe.getObject(obj, j11));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i17);
                        l010 = com.google.android.gms.internal.measurement.e.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 36:
                    B = e7.z((List) unsafe.getObject(obj, j11));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i17);
                        l010 = com.google.android.gms.internal.measurement.e.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 37:
                    B = e7.G((List) unsafe.getObject(obj, j11));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i17);
                        l010 = com.google.android.gms.internal.measurement.e.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 38:
                    B = e7.R((List) unsafe.getObject(obj, j11));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i17);
                        l010 = com.google.android.gms.internal.measurement.e.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 39:
                    B = e7.E((List) unsafe.getObject(obj, j11));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i17);
                        l010 = com.google.android.gms.internal.measurement.e.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 40:
                    B = e7.B((List) unsafe.getObject(obj, j11));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i17);
                        l010 = com.google.android.gms.internal.measurement.e.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 41:
                    B = e7.z((List) unsafe.getObject(obj, j11));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i17);
                        l010 = com.google.android.gms.internal.measurement.e.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 42:
                    Class cls = e7.f17123a;
                    B = ((List) unsafe.getObject(obj, j11)).size();
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i17);
                        l010 = com.google.android.gms.internal.measurement.e.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 43:
                    B = e7.P((List) unsafe.getObject(obj, j11));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i17);
                        l010 = com.google.android.gms.internal.measurement.e.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 44:
                    B = e7.x((List) unsafe.getObject(obj, j11));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i17);
                        l010 = com.google.android.gms.internal.measurement.e.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 45:
                    B = e7.z((List) unsafe.getObject(obj, j11));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i17);
                        l010 = com.google.android.gms.internal.measurement.e.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 46:
                    B = e7.B((List) unsafe.getObject(obj, j11));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i17);
                        l010 = com.google.android.gms.internal.measurement.e.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 47:
                    B = e7.K((List) unsafe.getObject(obj, j11));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i17);
                        l010 = com.google.android.gms.internal.measurement.e.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 48:
                    B = e7.M((List) unsafe.getObject(obj, j11));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i17);
                        l010 = com.google.android.gms.internal.measurement.e.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 49:
                    H = e7.C(i17, (List) unsafe.getObject(obj, j11), m(i13));
                    i14 += H;
                    break;
                case 50:
                    m6.a(i17, unsafe.getObject(obj, j11), n(i13));
                    break;
                case 51:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        l02 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        H = l02 + 8;
                        i14 += H;
                        break;
                    }
                case 52:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        l03 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        H = l03 + 4;
                        i14 += H;
                        break;
                    }
                case 53:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        long k10 = k(obj, j11);
                        l04 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        m02 = com.google.android.gms.internal.measurement.e.m0(k10);
                        H = l04 + m02;
                        i14 += H;
                        break;
                    }
                case 54:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        long k11 = k(obj, j11);
                        l04 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        m02 = com.google.android.gms.internal.measurement.e.m0(k11);
                        H = l04 + m02;
                        i14 += H;
                        break;
                    }
                case 55:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        int I = I(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.E0(I);
                        H = E0 + l05;
                        i14 += H;
                        break;
                    }
                case 56:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        l02 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        H = l02 + 8;
                        i14 += H;
                        break;
                    }
                case 57:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        l03 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        H = l03 + 4;
                        i14 += H;
                        break;
                    }
                case 58:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        l06 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        H = l06 + 1;
                        i14 += H;
                        break;
                    }
                case 59:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j11);
                        if (!(object2 instanceof zzix)) {
                            l05 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                            E0 = com.google.android.gms.internal.measurement.e.G0((String) object2);
                            H = E0 + l05;
                            i14 += H;
                            break;
                        } else {
                            l011 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                            g11 = ((zzix) object2).g();
                            l012 = com.google.android.gms.internal.measurement.e.l0(g11);
                            i11 = l012 + g11 + l011;
                            i14 += i11;
                            break;
                        }
                    }
                case 60:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        H = e7.H(i17, unsafe.getObject(obj, j11), m(i13));
                        i14 += H;
                        break;
                    }
                case 61:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        l011 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        g11 = ((zzix) unsafe.getObject(obj, j11)).g();
                        l012 = com.google.android.gms.internal.measurement.e.l0(g11);
                        i11 = l012 + g11 + l011;
                        i14 += i11;
                        break;
                    }
                case 62:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        int I2 = I(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.l0(I2);
                        H = E0 + l05;
                        i14 += H;
                        break;
                    }
                case 63:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        int I3 = I(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.E0(I3);
                        H = E0 + l05;
                        i14 += H;
                        break;
                    }
                case 64:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        l03 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        H = l03 + 4;
                        i14 += H;
                        break;
                    }
                case 65:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        l02 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        H = l02 + 8;
                        i14 += H;
                        break;
                    }
                case 66:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        int I4 = I(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.l0((I4 >> 31) ^ (I4 + I4));
                        H = E0 + l05;
                        i14 += H;
                        break;
                    }
                case 67:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        long k12 = k(obj, j11);
                        l09 = com.google.android.gms.internal.measurement.e.l0(i17 << 3);
                        m03 = com.google.android.gms.internal.measurement.e.m0((k12 >> 63) ^ (k12 + k12));
                        H = m03 + l09;
                        i14 += H;
                        break;
                    }
                case 68:
                    if (!w(obj, i17, i13)) {
                        break;
                    } else {
                        H = com.google.android.gms.internal.measurement.e.D0(i17, (s6) unsafe.getObject(obj, j11), m(i13));
                        i14 += H;
                        break;
                    }
            }
            i13 += 3;
            i12 = 1048575;
        }
        o7 o7Var = this.f17327l;
        int a10 = o7Var.a(o7Var.c(obj)) + i14;
        if (this.f17321f) {
            this.f17328m.a(obj);
            throw null;
        }
        return a10;
    }

    public final int H(Object obj) {
        int l02;
        int l03;
        int l04;
        int m02;
        int l05;
        int E0;
        int l06;
        int l07;
        int g10;
        int l08;
        int H;
        int B;
        int H0;
        int l09;
        int i10;
        Unsafe unsafe = f17316o;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f17317a.length; i12 += 3) {
            int j10 = j(i12);
            int i13 = (j10 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            int i14 = this.f17317a[i12];
            long j11 = j10 & 1048575;
            if (i13 >= zzjp.f7072c.zza() && i13 <= zzjp.f7073f.zza()) {
                int i15 = this.f17317a[i12 + 2];
            }
            switch (i13) {
                case 0:
                    if (u(obj, i12)) {
                        l02 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        H = l02 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (u(obj, i12)) {
                        l03 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        H = l03 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (u(obj, i12)) {
                        long h10 = v7.h(obj, j11);
                        l04 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        m02 = com.google.android.gms.internal.measurement.e.m0(h10);
                        H = m02 + l04;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (u(obj, i12)) {
                        long h11 = v7.h(obj, j11);
                        l04 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        m02 = com.google.android.gms.internal.measurement.e.m0(h11);
                        H = m02 + l04;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (u(obj, i12)) {
                        int g11 = v7.g(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.E0(g11);
                        H = E0 + l05;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (u(obj, i12)) {
                        l02 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        H = l02 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (u(obj, i12)) {
                        l03 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        H = l03 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (u(obj, i12)) {
                        l06 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        H = l06 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (u(obj, i12)) {
                        Object j12 = v7.j(obj, j11);
                        if (!(j12 instanceof zzix)) {
                            l05 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                            E0 = com.google.android.gms.internal.measurement.e.G0((String) j12);
                            H = E0 + l05;
                            break;
                        } else {
                            l07 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                            g10 = ((zzix) j12).g();
                            l08 = com.google.android.gms.internal.measurement.e.l0(g10);
                            i10 = l08 + g10 + l07;
                            i11 += i10;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (u(obj, i12)) {
                        H = e7.H(i14, v7.j(obj, j11), m(i12));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (u(obj, i12)) {
                        l07 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        g10 = ((zzix) v7.j(obj, j11)).g();
                        l08 = com.google.android.gms.internal.measurement.e.l0(g10);
                        i10 = l08 + g10 + l07;
                        i11 += i10;
                    } else {
                        continue;
                    }
                case 11:
                    if (u(obj, i12)) {
                        int g12 = v7.g(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.l0(g12);
                        H = E0 + l05;
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (u(obj, i12)) {
                        int g13 = v7.g(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.E0(g13);
                        H = E0 + l05;
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (u(obj, i12)) {
                        l03 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        H = l03 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (u(obj, i12)) {
                        l02 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        H = l02 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (u(obj, i12)) {
                        int g14 = v7.g(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.l0((g14 >> 31) ^ (g14 + g14));
                        H = E0 + l05;
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (u(obj, i12)) {
                        long h12 = v7.h(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.m0((h12 >> 63) ^ (h12 + h12));
                        H = E0 + l05;
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (u(obj, i12)) {
                        H = com.google.android.gms.internal.measurement.e.D0(i14, (s6) v7.j(obj, j11), m(i12));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    H = e7.A(i14, (List) v7.j(obj, j11));
                    break;
                case 19:
                    H = e7.y(i14, (List) v7.j(obj, j11));
                    break;
                case 20:
                    H = e7.F(i14, (List) v7.j(obj, j11));
                    break;
                case 21:
                    H = e7.Q(i14, (List) v7.j(obj, j11), false);
                    break;
                case 22:
                    H = e7.D(i14, (List) v7.j(obj, j11), false);
                    break;
                case 23:
                    H = e7.A(i14, (List) v7.j(obj, j11));
                    break;
                case 24:
                    H = e7.y(i14, (List) v7.j(obj, j11));
                    break;
                case 25:
                    H = e7.s(i14, (List) v7.j(obj, j11));
                    break;
                case 26:
                    H = e7.N(i14, (List) v7.j(obj, j11));
                    break;
                case 27:
                    H = e7.I(i14, (List) v7.j(obj, j11), m(i12));
                    break;
                case 28:
                    H = e7.v(i14, (List) v7.j(obj, j11));
                    break;
                case 29:
                    H = e7.O(i14, (List) v7.j(obj, j11), false);
                    break;
                case 30:
                    H = e7.w(i14, (List) v7.j(obj, j11), false);
                    break;
                case 31:
                    H = e7.y(i14, (List) v7.j(obj, j11));
                    break;
                case 32:
                    H = e7.A(i14, (List) v7.j(obj, j11));
                    break;
                case 33:
                    H = e7.J(i14, (List) v7.j(obj, j11), false);
                    break;
                case 34:
                    H = e7.L(i14, (List) v7.j(obj, j11), false);
                    break;
                case 35:
                    B = e7.B((List) unsafe.getObject(obj, j11));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i14);
                        l09 = com.google.android.gms.internal.measurement.e.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    } else {
                        continue;
                    }
                case 36:
                    B = e7.z((List) unsafe.getObject(obj, j11));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i14);
                        l09 = com.google.android.gms.internal.measurement.e.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    } else {
                        continue;
                    }
                case 37:
                    B = e7.G((List) unsafe.getObject(obj, j11));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i14);
                        l09 = com.google.android.gms.internal.measurement.e.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    } else {
                        continue;
                    }
                case 38:
                    B = e7.R((List) unsafe.getObject(obj, j11));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i14);
                        l09 = com.google.android.gms.internal.measurement.e.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    } else {
                        continue;
                    }
                case 39:
                    B = e7.E((List) unsafe.getObject(obj, j11));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i14);
                        l09 = com.google.android.gms.internal.measurement.e.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    } else {
                        continue;
                    }
                case 40:
                    B = e7.B((List) unsafe.getObject(obj, j11));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i14);
                        l09 = com.google.android.gms.internal.measurement.e.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    } else {
                        continue;
                    }
                case 41:
                    B = e7.z((List) unsafe.getObject(obj, j11));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i14);
                        l09 = com.google.android.gms.internal.measurement.e.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    } else {
                        continue;
                    }
                case 42:
                    Class cls = e7.f17123a;
                    B = ((List) unsafe.getObject(obj, j11)).size();
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i14);
                        l09 = com.google.android.gms.internal.measurement.e.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    } else {
                        continue;
                    }
                case 43:
                    B = e7.P((List) unsafe.getObject(obj, j11));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i14);
                        l09 = com.google.android.gms.internal.measurement.e.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    } else {
                        continue;
                    }
                case 44:
                    B = e7.x((List) unsafe.getObject(obj, j11));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i14);
                        l09 = com.google.android.gms.internal.measurement.e.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    } else {
                        continue;
                    }
                case 45:
                    B = e7.z((List) unsafe.getObject(obj, j11));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i14);
                        l09 = com.google.android.gms.internal.measurement.e.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    } else {
                        continue;
                    }
                case 46:
                    B = e7.B((List) unsafe.getObject(obj, j11));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i14);
                        l09 = com.google.android.gms.internal.measurement.e.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    } else {
                        continue;
                    }
                case 47:
                    B = e7.K((List) unsafe.getObject(obj, j11));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i14);
                        l09 = com.google.android.gms.internal.measurement.e.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    } else {
                        continue;
                    }
                case 48:
                    B = e7.M((List) unsafe.getObject(obj, j11));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.measurement.e.H0(i14);
                        l09 = com.google.android.gms.internal.measurement.e.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    } else {
                        continue;
                    }
                case 49:
                    H = e7.C(i14, (List) v7.j(obj, j11), m(i12));
                    break;
                case 50:
                    m6.a(i14, v7.j(obj, j11), n(i12));
                    continue;
                case 51:
                    if (w(obj, i14, i12)) {
                        l02 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        H = l02 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (w(obj, i14, i12)) {
                        l03 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        H = l03 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (w(obj, i14, i12)) {
                        long k10 = k(obj, j11);
                        l04 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        m02 = com.google.android.gms.internal.measurement.e.m0(k10);
                        H = m02 + l04;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (w(obj, i14, i12)) {
                        long k11 = k(obj, j11);
                        l04 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        m02 = com.google.android.gms.internal.measurement.e.m0(k11);
                        H = m02 + l04;
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (w(obj, i14, i12)) {
                        int I = I(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.E0(I);
                        H = E0 + l05;
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (w(obj, i14, i12)) {
                        l02 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        H = l02 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (w(obj, i14, i12)) {
                        l03 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        H = l03 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (w(obj, i14, i12)) {
                        l06 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        H = l06 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (w(obj, i14, i12)) {
                        Object j13 = v7.j(obj, j11);
                        if (!(j13 instanceof zzix)) {
                            l05 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                            E0 = com.google.android.gms.internal.measurement.e.G0((String) j13);
                            H = E0 + l05;
                            break;
                        } else {
                            l07 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                            g10 = ((zzix) j13).g();
                            l08 = com.google.android.gms.internal.measurement.e.l0(g10);
                            i10 = l08 + g10 + l07;
                            i11 += i10;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (w(obj, i14, i12)) {
                        H = e7.H(i14, v7.j(obj, j11), m(i12));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (w(obj, i14, i12)) {
                        zzix zzixVar = (zzix) v7.j(obj, j11);
                        l07 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        g10 = zzixVar.g();
                        l08 = com.google.android.gms.internal.measurement.e.l0(g10);
                        i10 = l08 + g10 + l07;
                        i11 += i10;
                    } else {
                        continue;
                    }
                case 62:
                    if (w(obj, i14, i12)) {
                        int I2 = I(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.l0(I2);
                        H = E0 + l05;
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (w(obj, i14, i12)) {
                        int I3 = I(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.E0(I3);
                        H = E0 + l05;
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (w(obj, i14, i12)) {
                        l03 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        H = l03 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (w(obj, i14, i12)) {
                        l02 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        H = l02 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (w(obj, i14, i12)) {
                        int I4 = I(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.l0((I4 >> 31) ^ (I4 + I4));
                        H = E0 + l05;
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (w(obj, i14, i12)) {
                        long k12 = k(obj, j11);
                        l05 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.measurement.e.m0((k12 >> 63) ^ (k12 + k12));
                        H = E0 + l05;
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (w(obj, i14, i12)) {
                        H = com.google.android.gms.internal.measurement.e.D0(i14, (s6) v7.j(obj, j11), m(i12));
                        break;
                    } else {
                        continue;
                    }
                default:
                    continue;
            }
            i11 += H;
        }
        o7 o7Var = this.f17327l;
        return o7Var.a(o7Var.c(obj)) + i11;
    }

    public final int J(Object obj, byte[] bArr, int i10, int i11, int i12, long j10) {
        Unsafe unsafe = f17316o;
        Object n10 = n(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzkw) object).c()) {
            zzkw a10 = zzkw.f7085c.a();
            m6.b(a10, object);
            unsafe.putObject(obj, j10, a10);
        }
        l6 l6Var = (l6) n10;
        throw null;
    }

    public final int K(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, b5 b5Var) {
        Unsafe unsafe = f17316o;
        long j11 = this.f17317a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(t9.k0.N(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(t9.k0.y(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int M = t9.k0.M(bArr, i10, b5Var);
                    unsafe.putObject(obj, j10, Long.valueOf(b5Var.f17079b));
                    unsafe.putInt(obj, j11, i13);
                    return M;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int J = t9.k0.J(bArr, i10, b5Var);
                    unsafe.putObject(obj, j10, Integer.valueOf(b5Var.f17078a));
                    unsafe.putInt(obj, j11, i13);
                    return J;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(t9.k0.N(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(t9.k0.y(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int M2 = t9.k0.M(bArr, i10, b5Var);
                    unsafe.putObject(obj, j10, Boolean.valueOf(b5Var.f17079b != 0));
                    unsafe.putInt(obj, j11, i13);
                    return M2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int J2 = t9.k0.J(bArr, i10, b5Var);
                    int i18 = b5Var.f17078a;
                    if (i18 == 0) {
                        unsafe.putObject(obj, j10, BuildConfig.FLAVOR);
                    } else if ((i15 & 536870912) != 0 && !com.google.android.gms.internal.measurement.h.d(bArr, J2, J2 + i18)) {
                        throw zzkh.a();
                    } else {
                        unsafe.putObject(obj, j10, new String(bArr, J2, i18, b6.f17081a));
                        J2 += i18;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return J2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    int C = t9.k0.C(m(i17), bArr, i10, i11, b5Var);
                    Object object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j10, b5Var.f17080c);
                    } else {
                        unsafe.putObject(obj, j10, b6.c(object, b5Var.f17080c));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return C;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int w10 = t9.k0.w(bArr, i10, b5Var);
                    unsafe.putObject(obj, j10, b5Var.f17080c);
                    unsafe.putInt(obj, j11, i13);
                    return w10;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int J3 = t9.k0.J(bArr, i10, b5Var);
                    int i19 = b5Var.f17078a;
                    x5 l10 = l(i17);
                    if (l10 == null || l10.a(i19)) {
                        unsafe.putObject(obj, j10, Integer.valueOf(i19));
                        unsafe.putInt(obj, j11, i13);
                    } else {
                        B(obj).c(i12, Long.valueOf(i19));
                    }
                    return J3;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int J4 = t9.k0.J(bArr, i10, b5Var);
                    unsafe.putObject(obj, j10, Integer.valueOf(f1.a.c(b5Var.f17078a)));
                    unsafe.putInt(obj, j11, i13);
                    return J4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int M3 = t9.k0.M(bArr, i10, b5Var);
                    unsafe.putObject(obj, j10, Long.valueOf(f1.a.d(b5Var.f17079b)));
                    unsafe.putInt(obj, j11, i13);
                    return M3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    int B = t9.k0.B(m(i17), bArr, i10, i11, (i12 & (-8)) | 4, b5Var);
                    Object object2 = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j10, b5Var.f17080c);
                    } else {
                        unsafe.putObject(obj, j10, b6.c(object2, b5Var.f17080c));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return B;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x02f7, code lost:
        if (r0 != r15) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02fa, code lost:
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0342, code lost:
        if (r0 != r15) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0344, code lost:
        r5 = r0;
        r2 = r19;
        r10 = r26;
        r9 = r27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int L(java.lang.Object r30, byte[] r31, int r32, int r33, w9.b5 r34) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.u6.L(java.lang.Object, byte[], int, int, w9.b5):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x023c -> B:126:0x023d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x028a -> B:146:0x028b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01bf -> B:93:0x01c0). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int M(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, w9.b5 r30) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.u6.M(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, w9.b5):int");
    }

    public final int N(int i10) {
        return this.f17317a[i10 + 2];
    }

    public final int O(int i10, int i11) {
        int length = (this.f17317a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f17317a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    @Override // w9.c7
    public final void a(Object obj) {
        int i10;
        int i11 = this.f17324i;
        while (true) {
            i10 = this.f17325j;
            if (i11 >= i10) {
                break;
            }
            long j10 = j(this.f17323h[i11]) & 1048575;
            Object j11 = v7.j(obj, j10);
            if (j11 != null) {
                ((zzkw) j11).b();
                v7.f17349c.r(obj, j10, j11);
            }
            i11++;
        }
        int length = this.f17323h.length;
        while (i10 < length) {
            this.f17326k.a(obj, this.f17323h[i10]);
            i10++;
        }
        this.f17327l.g(obj);
        if (this.f17321f) {
            this.f17328m.b(obj);
        }
    }

    @Override // w9.c7
    public final int b(Object obj) {
        int i10;
        int b10;
        int length = this.f17317a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int j10 = j(i12);
            int i13 = this.f17317a[i12];
            long j11 = 1048575 & j10;
            int i14 = 37;
            switch ((j10 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
                case 0:
                    i10 = i11 * 53;
                    b10 = b6.b(Double.doubleToLongBits(v7.e(obj, j11)));
                    i11 = b10 + i10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    b10 = Float.floatToIntBits(v7.f(obj, j11));
                    i11 = b10 + i10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    b10 = b6.b(v7.h(obj, j11));
                    i11 = b10 + i10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    b10 = b6.b(v7.h(obj, j11));
                    i11 = b10 + i10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    b10 = v7.g(obj, j11);
                    i11 = b10 + i10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    b10 = b6.b(v7.h(obj, j11));
                    i11 = b10 + i10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    b10 = v7.g(obj, j11);
                    i11 = b10 + i10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    b10 = b6.a(v7.r(obj, j11));
                    i11 = b10 + i10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    b10 = ((String) v7.j(obj, j11)).hashCode();
                    i11 = b10 + i10;
                    break;
                case 9:
                    Object j12 = v7.j(obj, j11);
                    if (j12 != null) {
                        i14 = j12.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i10 = i11 * 53;
                    b10 = v7.j(obj, j11).hashCode();
                    i11 = b10 + i10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    b10 = v7.g(obj, j11);
                    i11 = b10 + i10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    b10 = v7.g(obj, j11);
                    i11 = b10 + i10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    b10 = v7.g(obj, j11);
                    i11 = b10 + i10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    b10 = b6.b(v7.h(obj, j11));
                    i11 = b10 + i10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    b10 = v7.g(obj, j11);
                    i11 = b10 + i10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    b10 = b6.b(v7.h(obj, j11));
                    i11 = b10 + i10;
                    break;
                case 17:
                    Object j13 = v7.j(obj, j11);
                    if (j13 != null) {
                        i14 = j13.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    b10 = v7.j(obj, j11).hashCode();
                    i11 = b10 + i10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    b10 = v7.j(obj, j11).hashCode();
                    i11 = b10 + i10;
                    break;
                case 51:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = b6.b(Double.doubleToLongBits(E(obj, j11)));
                        i11 = b10 + i10;
                    }
                    break;
                case 52:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = Float.floatToIntBits(F(obj, j11));
                        i11 = b10 + i10;
                    }
                    break;
                case 53:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = b6.b(k(obj, j11));
                        i11 = b10 + i10;
                    }
                    break;
                case 54:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = b6.b(k(obj, j11));
                        i11 = b10 + i10;
                    }
                    break;
                case 55:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = I(obj, j11);
                        i11 = b10 + i10;
                    }
                    break;
                case 56:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = b6.b(k(obj, j11));
                        i11 = b10 + i10;
                    }
                    break;
                case 57:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = I(obj, j11);
                        i11 = b10 + i10;
                    }
                    break;
                case 58:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = b6.a(x(obj, j11));
                        i11 = b10 + i10;
                    }
                    break;
                case 59:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = ((String) v7.j(obj, j11)).hashCode();
                        i11 = b10 + i10;
                    }
                    break;
                case 60:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = v7.j(obj, j11).hashCode();
                        i11 = b10 + i10;
                    }
                    break;
                case 61:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = v7.j(obj, j11).hashCode();
                        i11 = b10 + i10;
                    }
                    break;
                case 62:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = I(obj, j11);
                        i11 = b10 + i10;
                    }
                    break;
                case 63:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = I(obj, j11);
                        i11 = b10 + i10;
                    }
                    break;
                case 64:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = I(obj, j11);
                        i11 = b10 + i10;
                    }
                    break;
                case 65:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = b6.b(k(obj, j11));
                        i11 = b10 + i10;
                    }
                    break;
                case 66:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = I(obj, j11);
                        i11 = b10 + i10;
                    }
                    break;
                case 67:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = b6.b(k(obj, j11));
                        i11 = b10 + i10;
                    }
                    break;
                case 68:
                    if (w(obj, i13, i12)) {
                        i10 = i11 * 53;
                        b10 = v7.j(obj, j11).hashCode();
                        i11 = b10 + i10;
                    }
                    break;
            }
        }
        int hashCode = this.f17327l.c(obj).hashCode() + (i11 * 53);
        if (this.f17321f) {
            this.f17328m.a(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // w9.c7
    public final int c(Object obj) {
        return this.f17322g ? H(obj) : G(obj);
    }

    @Override // w9.c7
    public final Object d() {
        return ((u5) this.f17320e).r(4, null, null);
    }

    @Override // w9.c7
    public final void e(Object obj, f5 f5Var) {
        if (!this.f17322g) {
            y(obj, f5Var);
        } else if (this.f17321f) {
            this.f17328m.a(obj);
            throw null;
        } else {
            int length = this.f17317a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int j10 = j(i10);
                int i11 = this.f17317a[i10];
                switch ((j10 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
                    case 0:
                        if (u(obj, i10)) {
                            f5Var.c(i11, v7.e(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (u(obj, i10)) {
                            f5Var.d(i11, v7.f(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (u(obj, i10)) {
                            f5Var.f17135a.A0(i11, v7.h(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (u(obj, i10)) {
                            f5Var.f17135a.A0(i11, v7.h(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (u(obj, i10)) {
                            f5Var.f17135a.u0(i11, v7.g(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (u(obj, i10)) {
                            f5Var.f17135a.s0(i11, v7.h(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (u(obj, i10)) {
                            f5Var.f17135a.q0(i11, v7.g(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (u(obj, i10)) {
                            f5Var.f17135a.o0(i11, v7.r(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (u(obj, i10)) {
                            z(i11, v7.j(obj, j10 & 1048575), f5Var);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (u(obj, i10)) {
                            f5Var.f(i11, v7.j(obj, j10 & 1048575), m(i10));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (u(obj, i10)) {
                            f5Var.f17135a.p0(i11, (zzix) v7.j(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (u(obj, i10)) {
                            f5Var.f17135a.y0(i11, v7.g(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (u(obj, i10)) {
                            f5Var.f17135a.u0(i11, v7.g(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (u(obj, i10)) {
                            f5Var.f17135a.q0(i11, v7.g(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (u(obj, i10)) {
                            f5Var.f17135a.s0(i11, v7.h(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (u(obj, i10)) {
                            f5Var.a(i11, v7.g(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (u(obj, i10)) {
                            f5Var.b(i11, v7.h(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (u(obj, i10)) {
                            f5Var.e(i11, v7.j(obj, j10 & 1048575), m(i10));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        e7.d(i11, (List) v7.j(obj, j10 & 1048575), f5Var, false);
                        break;
                    case 19:
                        e7.h(i11, (List) v7.j(obj, j10 & 1048575), f5Var, false);
                        break;
                    case 20:
                        e7.k(i11, (List) v7.j(obj, j10 & 1048575), f5Var, false);
                        break;
                    case 21:
                        e7.t(i11, (List) v7.j(obj, j10 & 1048575), f5Var, false);
                        break;
                    case 22:
                        e7.j(i11, (List) v7.j(obj, j10 & 1048575), f5Var, false);
                        break;
                    case 23:
                        e7.g(i11, (List) v7.j(obj, j10 & 1048575), f5Var, false);
                        break;
                    case 24:
                        e7.f(i11, (List) v7.j(obj, j10 & 1048575), f5Var, false);
                        break;
                    case 25:
                        e7.b(i11, (List) v7.j(obj, j10 & 1048575), f5Var, false);
                        break;
                    case 26:
                        e7.q(i11, (List) v7.j(obj, j10 & 1048575), f5Var);
                        break;
                    case 27:
                        e7.l(i11, (List) v7.j(obj, j10 & 1048575), f5Var, m(i10));
                        break;
                    case 28:
                        e7.c(i11, (List) v7.j(obj, j10 & 1048575), f5Var);
                        break;
                    case 29:
                        e7.r(i11, (List) v7.j(obj, j10 & 1048575), f5Var, false);
                        break;
                    case 30:
                        e7.e(i11, (List) v7.j(obj, j10 & 1048575), f5Var, false);
                        break;
                    case 31:
                        e7.m(i11, (List) v7.j(obj, j10 & 1048575), f5Var, false);
                        break;
                    case 32:
                        e7.n(i11, (List) v7.j(obj, j10 & 1048575), f5Var, false);
                        break;
                    case 33:
                        e7.o(i11, (List) v7.j(obj, j10 & 1048575), f5Var, false);
                        break;
                    case 34:
                        e7.p(i11, (List) v7.j(obj, j10 & 1048575), f5Var, false);
                        break;
                    case 35:
                        e7.d(i11, (List) v7.j(obj, j10 & 1048575), f5Var, true);
                        break;
                    case 36:
                        e7.h(i11, (List) v7.j(obj, j10 & 1048575), f5Var, true);
                        break;
                    case 37:
                        e7.k(i11, (List) v7.j(obj, j10 & 1048575), f5Var, true);
                        break;
                    case 38:
                        e7.t(i11, (List) v7.j(obj, j10 & 1048575), f5Var, true);
                        break;
                    case 39:
                        e7.j(i11, (List) v7.j(obj, j10 & 1048575), f5Var, true);
                        break;
                    case 40:
                        e7.g(i11, (List) v7.j(obj, j10 & 1048575), f5Var, true);
                        break;
                    case 41:
                        e7.f(i11, (List) v7.j(obj, j10 & 1048575), f5Var, true);
                        break;
                    case 42:
                        e7.b(i11, (List) v7.j(obj, j10 & 1048575), f5Var, true);
                        break;
                    case 43:
                        e7.r(i11, (List) v7.j(obj, j10 & 1048575), f5Var, true);
                        break;
                    case 44:
                        e7.e(i11, (List) v7.j(obj, j10 & 1048575), f5Var, true);
                        break;
                    case 45:
                        e7.m(i11, (List) v7.j(obj, j10 & 1048575), f5Var, true);
                        break;
                    case 46:
                        e7.n(i11, (List) v7.j(obj, j10 & 1048575), f5Var, true);
                        break;
                    case 47:
                        e7.o(i11, (List) v7.j(obj, j10 & 1048575), f5Var, true);
                        break;
                    case 48:
                        e7.p(i11, (List) v7.j(obj, j10 & 1048575), f5Var, true);
                        break;
                    case 49:
                        e7.i(i11, (List) v7.j(obj, j10 & 1048575), f5Var, m(i10));
                        break;
                    case 50:
                        if (v7.j(obj, j10 & 1048575) != null) {
                            l6 l6Var = (l6) n(i10);
                            throw null;
                        }
                        break;
                    case 51:
                        if (w(obj, i11, i10)) {
                            f5Var.c(i11, E(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (w(obj, i11, i10)) {
                            f5Var.d(i11, F(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (w(obj, i11, i10)) {
                            f5Var.f17135a.A0(i11, k(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (w(obj, i11, i10)) {
                            f5Var.f17135a.A0(i11, k(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (w(obj, i11, i10)) {
                            f5Var.f17135a.u0(i11, I(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (w(obj, i11, i10)) {
                            f5Var.f17135a.s0(i11, k(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (w(obj, i11, i10)) {
                            f5Var.f17135a.q0(i11, I(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (w(obj, i11, i10)) {
                            f5Var.f17135a.o0(i11, x(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (w(obj, i11, i10)) {
                            z(i11, v7.j(obj, j10 & 1048575), f5Var);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (w(obj, i11, i10)) {
                            f5Var.f(i11, v7.j(obj, j10 & 1048575), m(i10));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (w(obj, i11, i10)) {
                            f5Var.f17135a.p0(i11, (zzix) v7.j(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (w(obj, i11, i10)) {
                            f5Var.f17135a.y0(i11, I(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (w(obj, i11, i10)) {
                            f5Var.f17135a.u0(i11, I(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (w(obj, i11, i10)) {
                            f5Var.f17135a.q0(i11, I(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (w(obj, i11, i10)) {
                            f5Var.f17135a.s0(i11, k(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (w(obj, i11, i10)) {
                            f5Var.a(i11, I(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (w(obj, i11, i10)) {
                            f5Var.b(i11, k(obj, j10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (w(obj, i11, i10)) {
                            f5Var.e(i11, v7.j(obj, j10 & 1048575), m(i10));
                            break;
                        } else {
                            break;
                        }
                }
            }
            o7 o7Var = this.f17327l;
            o7Var.i(o7Var.c(obj), f5Var);
        }
    }

    @Override // w9.c7
    public final boolean f(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f17324i) {
            int i15 = this.f17323h[i14];
            int i16 = this.f17317a[i15];
            int j10 = j(i15);
            int i17 = this.f17317a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f17316o.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & j10) != 0 && !v(obj, i15, i10, i11, i19)) {
                return false;
            }
            int i20 = (j10 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i20 != 9 && i20 != 17) {
                if (i20 != 27) {
                    if (i20 == 60 || i20 == 68) {
                        if (w(obj, i16, i15) && !m(i15).f(v7.j(obj, j10 & 1048575))) {
                            return false;
                        }
                    } else if (i20 != 49) {
                        if (i20 == 50 && !((zzkw) v7.j(obj, j10 & 1048575)).isEmpty()) {
                            l6 l6Var = (l6) n(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) v7.j(obj, j10 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    c7 m10 = m(i15);
                    for (int i21 = 0; i21 < list.size(); i21++) {
                        if (!m10.f(list.get(i21))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (v(obj, i15, i10, i11, i19) && !m(i15).f(v7.j(obj, j10 & 1048575))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        if (this.f17321f) {
            this.f17328m.a(obj);
            throw null;
        }
        return true;
    }

    @Override // w9.c7
    public final void g(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.f17317a.length; i10 += 3) {
            int j10 = j(i10);
            long j11 = 1048575 & j10;
            int i11 = this.f17317a[i10];
            switch ((j10 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
                case 0:
                    if (u(obj2, i10)) {
                        v7.m(obj, j11, v7.e(obj2, j11));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (u(obj2, i10)) {
                        v7.f17349c.h(obj, j11, v7.f(obj2, j11));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (u(obj2, i10)) {
                        v7.n(obj, j11, v7.h(obj2, j11));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (u(obj2, i10)) {
                        v7.n(obj, j11, v7.h(obj2, j11));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (u(obj2, i10)) {
                        v7.f17349c.p(obj, j11, v7.g(obj2, j11));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (u(obj2, i10)) {
                        v7.n(obj, j11, v7.h(obj2, j11));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (u(obj2, i10)) {
                        v7.f17349c.p(obj, j11, v7.g(obj2, j11));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (u(obj2, i10)) {
                        v7.f17349c.e(obj, j11, v7.r(obj2, j11));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (u(obj2, i10)) {
                        v7.f17349c.r(obj, j11, v7.j(obj2, j11));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    p(obj, obj2, i10);
                    break;
                case 10:
                    if (u(obj2, i10)) {
                        v7.f17349c.r(obj, j11, v7.j(obj2, j11));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (u(obj2, i10)) {
                        v7.f17349c.p(obj, j11, v7.g(obj2, j11));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (u(obj2, i10)) {
                        v7.f17349c.p(obj, j11, v7.g(obj2, j11));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (u(obj2, i10)) {
                        v7.f17349c.p(obj, j11, v7.g(obj2, j11));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (u(obj2, i10)) {
                        v7.n(obj, j11, v7.h(obj2, j11));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (u(obj2, i10)) {
                        v7.f17349c.p(obj, j11, v7.g(obj2, j11));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (u(obj2, i10)) {
                        v7.n(obj, j11, v7.h(obj2, j11));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    p(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f17326k.b(obj, obj2, j11);
                    break;
                case 50:
                    Class cls = e7.f17123a;
                    v7.f17349c.r(obj, j11, m6.b(v7.j(obj, j11), v7.j(obj2, j11)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (w(obj2, i11, i10)) {
                        v7.f17349c.r(obj, j11, v7.j(obj2, j11));
                        s(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    q(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (w(obj2, i11, i10)) {
                        v7.f17349c.r(obj, j11, v7.j(obj2, j11));
                        s(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    q(obj, obj2, i10);
                    break;
            }
        }
        o7 o7Var = this.f17327l;
        Class cls2 = e7.f17123a;
        o7Var.h(obj, o7Var.d(o7Var.c(obj), o7Var.c(obj2)));
        if (this.f17321f) {
            this.f17328m.a(obj2);
            throw null;
        }
    }

    @Override // w9.c7
    public final boolean h(Object obj, Object obj2) {
        boolean a10;
        int length = this.f17317a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int j10 = j(i10);
            long j11 = j10 & 1048575;
            switch ((j10 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
                case 0:
                    if (t(obj, obj2, i10) && Double.doubleToLongBits(v7.e(obj, j11)) == Double.doubleToLongBits(v7.e(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (t(obj, obj2, i10) && Float.floatToIntBits(v7.f(obj, j11)) == Float.floatToIntBits(v7.f(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (t(obj, obj2, i10) && v7.h(obj, j11) == v7.h(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (t(obj, obj2, i10) && v7.h(obj, j11) == v7.h(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (t(obj, obj2, i10) && v7.g(obj, j11) == v7.g(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (t(obj, obj2, i10) && v7.h(obj, j11) == v7.h(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (t(obj, obj2, i10) && v7.g(obj, j11) == v7.g(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (t(obj, obj2, i10) && v7.r(obj, j11) == v7.r(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (t(obj, obj2, i10) && e7.a(v7.j(obj, j11), v7.j(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (t(obj, obj2, i10) && e7.a(v7.j(obj, j11), v7.j(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (t(obj, obj2, i10) && e7.a(v7.j(obj, j11), v7.j(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (t(obj, obj2, i10) && v7.g(obj, j11) == v7.g(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (t(obj, obj2, i10) && v7.g(obj, j11) == v7.g(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (t(obj, obj2, i10) && v7.g(obj, j11) == v7.g(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (t(obj, obj2, i10) && v7.h(obj, j11) == v7.h(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (t(obj, obj2, i10) && v7.g(obj, j11) == v7.g(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (t(obj, obj2, i10) && v7.h(obj, j11) == v7.h(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (t(obj, obj2, i10) && e7.a(v7.j(obj, j11), v7.j(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    a10 = e7.a(v7.j(obj, j11), v7.j(obj2, j11));
                    break;
                case 50:
                    a10 = e7.a(v7.j(obj, j11), v7.j(obj2, j11));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long N = N(i10) & 1048575;
                    if (v7.g(obj, N) == v7.g(obj2, N) && e7.a(v7.j(obj, j11), v7.j(obj2, j11))) {
                        continue;
                    }
                    return false;
                default:
                    continue;
            }
            if (!a10) {
                return false;
            }
        }
        if (this.f17327l.c(obj).equals(this.f17327l.c(obj2))) {
            if (this.f17321f) {
                this.f17328m.a(obj);
                this.f17328m.a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // w9.c7
    public final void i(Object obj, byte[] bArr, int i10, int i11, b5 b5Var) {
        if (this.f17322g) {
            L(obj, bArr, i10, i11, b5Var);
        } else {
            A(obj, bArr, i10, i11, 0, b5Var);
        }
    }

    public final int j(int i10) {
        return this.f17317a[i10 + 1];
    }

    public final x5 l(int i10) {
        int i11 = i10 / 3;
        return (x5) this.f17318b[i11 + i11 + 1];
    }

    public final c7 m(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f17318b;
        c7 c7Var = (c7) objArr[i12];
        if (c7Var != null) {
            return c7Var;
        }
        c7 a10 = z6.f17390c.a((Class) objArr[i12 + 1]);
        this.f17318b[i12] = a10;
        return a10;
    }

    public final Object n(int i10) {
        int i11 = i10 / 3;
        return this.f17318b[i11 + i11];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        w9.v7.f17349c.r(r8, r0, r9);
        r(r8, r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(java.lang.Object r8, java.lang.Object r9, int r10) {
        /*
            r7 = this;
            r3 = r7
            int[] r0 = r3.f17317a
            int r1 = r10 + 1
            r6 = 1
            r0 = r0[r1]
            r5 = 6
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            r6 = 4
            long r0 = (long) r0
            boolean r5 = r3.u(r9, r10)
            r2 = r5
            if (r2 != 0) goto L18
            r6 = 5
            return
        L18:
            java.lang.Object r2 = w9.v7.j(r8, r0)
            java.lang.Object r9 = w9.v7.j(r9, r0)
            if (r2 == 0) goto L37
            r6 = 5
            if (r9 != 0) goto L27
            r6 = 7
            goto L37
        L27:
            r6 = 4
            java.lang.Object r9 = w9.b6.c(r2, r9)
            x0.c r2 = w9.v7.f17349c
            r5 = 7
            r2.r(r8, r0, r9)
            r5 = 3
            r3.r(r8, r10)
            return
        L37:
            if (r9 == 0) goto L42
            x0.c r2 = w9.v7.f17349c
            r2.r(r8, r0, r9)
            r6 = 1
            r3.r(r8, r10)
        L42:
            r6 = 7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.u6.p(java.lang.Object, java.lang.Object, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        w9.v7.f17349c.r(r9, r1, r10);
        s(r9, r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(java.lang.Object r9, java.lang.Object r10, int r11) {
        /*
            r8 = this;
            int[] r0 = r8.f17317a
            r7 = 5
            int r1 = r11 + 1
            r1 = r0[r1]
            r0 = r0[r11]
            r5 = 7
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 1
            r1 = r1 & r2
            r5 = 3
            long r1 = (long) r1
            r5 = 4
            boolean r3 = r8.w(r10, r0, r11)
            if (r3 != 0) goto L19
            return
        L19:
            boolean r4 = r8.w(r9, r0, r11)
            r3 = r4
            if (r3 == 0) goto L26
            r7 = 4
            java.lang.Object r3 = w9.v7.j(r9, r1)
            goto L29
        L26:
            r6 = 5
            r4 = 0
            r3 = r4
        L29:
            java.lang.Object r10 = w9.v7.j(r10, r1)
            if (r3 == 0) goto L41
            if (r10 != 0) goto L33
            r6 = 1
            goto L41
        L33:
            java.lang.Object r10 = w9.b6.c(r3, r10)
            x0.c r3 = w9.v7.f17349c
            r7 = 6
            r3.r(r9, r1, r10)
            r8.s(r9, r0, r11)
            return
        L41:
            if (r10 == 0) goto L4f
            r5 = 1
            x0.c r3 = w9.v7.f17349c
            r6 = 3
            r3.r(r9, r1, r10)
            r6 = 5
            r8.s(r9, r0, r11)
            r7 = 6
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.u6.q(java.lang.Object, java.lang.Object, int):void");
    }

    public final void r(Object obj, int i10) {
        int i11 = this.f17317a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        v7.f17349c.p(obj, j10, (1 << (i11 >>> 20)) | v7.g(obj, j10));
    }

    public final void s(Object obj, int i10, int i11) {
        v7.f17349c.p(obj, this.f17317a[i11 + 2] & 1048575, i10);
    }

    public final boolean t(Object obj, Object obj2, int i10) {
        return u(obj, i10) == u(obj2, i10);
    }

    public final boolean u(Object obj, int i10) {
        int[] iArr = this.f17317a;
        int i11 = iArr[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 != 1048575) {
            return (v7.g(obj, j10) & (1 << (i11 >>> 20))) != 0;
        }
        int i12 = iArr[i10 + 1];
        long j11 = i12 & 1048575;
        switch ((i12 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
            case 0:
                return Double.doubleToRawLongBits(v7.e(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(v7.f(obj, j11)) != 0;
            case 2:
                return v7.h(obj, j11) != 0;
            case 3:
                return v7.h(obj, j11) != 0;
            case 4:
                return v7.g(obj, j11) != 0;
            case 5:
                return v7.h(obj, j11) != 0;
            case 6:
                return v7.g(obj, j11) != 0;
            case 7:
                return v7.r(obj, j11);
            case 8:
                Object j12 = v7.j(obj, j11);
                if (j12 instanceof String) {
                    return !((String) j12).isEmpty();
                } else if (j12 instanceof zzix) {
                    return !zzix.f7071c.equals(j12);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return v7.j(obj, j11) != null;
            case 10:
                return !zzix.f7071c.equals(v7.j(obj, j11));
            case 11:
                return v7.g(obj, j11) != 0;
            case 12:
                return v7.g(obj, j11) != 0;
            case 13:
                return v7.g(obj, j11) != 0;
            case 14:
                return v7.h(obj, j11) != 0;
            case 15:
                return v7.g(obj, j11) != 0;
            case 16:
                return v7.h(obj, j11) != 0;
            case 17:
                return v7.j(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean v(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? u(obj, i10) : (i12 & i13) != 0;
    }

    public final boolean w(Object obj, int i10, int i11) {
        return v7.g(obj, (long) (this.f17317a[i11 + 2] & 1048575)) == i10;
    }

    public final void y(Object obj, f5 f5Var) {
        int i10;
        if (this.f17321f) {
            this.f17328m.a(obj);
            throw null;
        }
        int length = this.f17317a.length;
        Unsafe unsafe = f17316o;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 1048575;
        int i14 = 0;
        while (i12 < length) {
            int j10 = j(i12);
            int[] iArr = this.f17317a;
            int i15 = iArr[i12];
            int i16 = (j10 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i16 <= 17) {
                int i17 = iArr[i12 + 2];
                int i18 = i17 & i11;
                if (i18 != i13) {
                    i14 = unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            long j11 = j10 & i11;
            switch (i16) {
                case 0:
                    if ((i14 & i10) != 0) {
                        f5Var.c(i15, v7.e(obj, j11));
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 1:
                    if ((i14 & i10) != 0) {
                        f5Var.d(i15, v7.f(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 2:
                    if ((i14 & i10) != 0) {
                        f5Var.f17135a.A0(i15, unsafe.getLong(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 3:
                    if ((i14 & i10) != 0) {
                        f5Var.f17135a.A0(i15, unsafe.getLong(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 4:
                    if ((i14 & i10) != 0) {
                        f5Var.f17135a.u0(i15, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 5:
                    if ((i14 & i10) != 0) {
                        f5Var.f17135a.s0(i15, unsafe.getLong(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 6:
                    if ((i14 & i10) != 0) {
                        f5Var.f17135a.q0(i15, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 7:
                    if ((i14 & i10) != 0) {
                        f5Var.f17135a.o0(i15, v7.r(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 8:
                    if ((i14 & i10) != 0) {
                        z(i15, unsafe.getObject(obj, j11), f5Var);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 9:
                    if ((i14 & i10) != 0) {
                        f5Var.f(i15, unsafe.getObject(obj, j11), m(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 10:
                    if ((i14 & i10) != 0) {
                        f5Var.f17135a.p0(i15, (zzix) unsafe.getObject(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 11:
                    if ((i14 & i10) != 0) {
                        f5Var.f17135a.y0(i15, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 12:
                    if ((i14 & i10) != 0) {
                        f5Var.f17135a.u0(i15, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 13:
                    if ((i14 & i10) != 0) {
                        f5Var.f17135a.q0(i15, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 14:
                    if ((i14 & i10) != 0) {
                        f5Var.f17135a.s0(i15, unsafe.getLong(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 15:
                    if ((i14 & i10) != 0) {
                        f5Var.a(i15, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 16:
                    if ((i14 & i10) != 0) {
                        f5Var.b(i15, unsafe.getLong(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 17:
                    if ((i14 & i10) != 0) {
                        f5Var.e(i15, unsafe.getObject(obj, j11), m(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 18:
                    e7.d(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 19:
                    e7.h(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 20:
                    e7.k(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 21:
                    e7.t(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 22:
                    e7.j(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 23:
                    e7.g(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 24:
                    e7.f(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 25:
                    e7.b(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 26:
                    e7.q(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var);
                    break;
                case 27:
                    e7.l(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, m(i12));
                    break;
                case 28:
                    e7.c(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var);
                    break;
                case 29:
                    e7.r(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, false);
                    break;
                case 30:
                    e7.e(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, false);
                    break;
                case 31:
                    e7.m(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, false);
                    break;
                case 32:
                    e7.n(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, false);
                    break;
                case 33:
                    e7.o(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, false);
                    break;
                case 34:
                    e7.p(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, false);
                    break;
                case 35:
                    e7.d(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, true);
                    break;
                case 36:
                    e7.h(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, true);
                    break;
                case 37:
                    e7.k(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, true);
                    break;
                case 38:
                    e7.t(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, true);
                    break;
                case 39:
                    e7.j(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, true);
                    break;
                case 40:
                    e7.g(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, true);
                    break;
                case 41:
                    e7.f(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, true);
                    break;
                case 42:
                    e7.b(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, true);
                    break;
                case 43:
                    e7.r(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, true);
                    break;
                case 44:
                    e7.e(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, true);
                    break;
                case 45:
                    e7.m(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, true);
                    break;
                case 46:
                    e7.n(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, true);
                    break;
                case 47:
                    e7.o(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, true);
                    break;
                case 48:
                    e7.p(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, true);
                    break;
                case 49:
                    e7.i(this.f17317a[i12], (List) unsafe.getObject(obj, j11), f5Var, m(i12));
                    break;
                case 50:
                    if (unsafe.getObject(obj, j11) != null) {
                        l6 l6Var = (l6) n(i12);
                        throw null;
                    }
                    break;
                case 51:
                    if (w(obj, i15, i12)) {
                        f5Var.c(i15, E(obj, j11));
                        break;
                    }
                    break;
                case 52:
                    if (w(obj, i15, i12)) {
                        f5Var.d(i15, F(obj, j11));
                        break;
                    }
                    break;
                case 53:
                    if (w(obj, i15, i12)) {
                        f5Var.f17135a.A0(i15, k(obj, j11));
                        break;
                    }
                    break;
                case 54:
                    if (w(obj, i15, i12)) {
                        f5Var.f17135a.A0(i15, k(obj, j11));
                        break;
                    }
                    break;
                case 55:
                    if (w(obj, i15, i12)) {
                        f5Var.f17135a.u0(i15, I(obj, j11));
                        break;
                    }
                    break;
                case 56:
                    if (w(obj, i15, i12)) {
                        f5Var.f17135a.s0(i15, k(obj, j11));
                        break;
                    }
                    break;
                case 57:
                    if (w(obj, i15, i12)) {
                        f5Var.f17135a.q0(i15, I(obj, j11));
                        break;
                    }
                    break;
                case 58:
                    if (w(obj, i15, i12)) {
                        f5Var.f17135a.o0(i15, x(obj, j11));
                        break;
                    }
                    break;
                case 59:
                    if (w(obj, i15, i12)) {
                        z(i15, unsafe.getObject(obj, j11), f5Var);
                        break;
                    }
                    break;
                case 60:
                    if (w(obj, i15, i12)) {
                        f5Var.f(i15, unsafe.getObject(obj, j11), m(i12));
                        break;
                    }
                    break;
                case 61:
                    if (w(obj, i15, i12)) {
                        f5Var.f17135a.p0(i15, (zzix) unsafe.getObject(obj, j11));
                        break;
                    }
                    break;
                case 62:
                    if (w(obj, i15, i12)) {
                        f5Var.f17135a.y0(i15, I(obj, j11));
                        break;
                    }
                    break;
                case 63:
                    if (w(obj, i15, i12)) {
                        f5Var.f17135a.u0(i15, I(obj, j11));
                        break;
                    }
                    break;
                case 64:
                    if (w(obj, i15, i12)) {
                        f5Var.f17135a.q0(i15, I(obj, j11));
                        break;
                    }
                    break;
                case 65:
                    if (w(obj, i15, i12)) {
                        f5Var.f17135a.s0(i15, k(obj, j11));
                        break;
                    }
                    break;
                case 66:
                    if (w(obj, i15, i12)) {
                        f5Var.a(i15, I(obj, j11));
                        break;
                    }
                    break;
                case 67:
                    if (w(obj, i15, i12)) {
                        f5Var.b(i15, k(obj, j11));
                        break;
                    }
                    break;
                case 68:
                    if (w(obj, i15, i12)) {
                        f5Var.e(i15, unsafe.getObject(obj, j11), m(i12));
                        break;
                    }
                    break;
            }
            i12 += 3;
            i11 = 1048575;
        }
        o7 o7Var = this.f17327l;
        o7Var.i(o7Var.c(obj), f5Var);
    }
}
