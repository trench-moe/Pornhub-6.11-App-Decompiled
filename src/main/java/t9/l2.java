package t9;

import com.google.android.gms.internal.cast.zzoe;
import com.google.android.gms.internal.cast.zzot;
import com.google.android.gms.internal.cast.zzpy;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class l2<T> implements t2<T> {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f15287l = new int[0];

    /* renamed from: m  reason: collision with root package name */
    public static final Unsafe f15288m = o3.k();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f15289a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f15290b;

    /* renamed from: c  reason: collision with root package name */
    public final j2 f15291c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f15292e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f15293f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15294g;

    /* renamed from: h  reason: collision with root package name */
    public final int f15295h;

    /* renamed from: i  reason: collision with root package name */
    public final y1 f15296i;

    /* renamed from: j  reason: collision with root package name */
    public final f3<?, ?> f15297j;

    /* renamed from: k  reason: collision with root package name */
    public final d1<?> f15298k;

    public l2(int[] iArr, Object[] objArr, j2 j2Var, boolean z10, int[] iArr2, int i10, int i11, n2 n2Var, y1 y1Var, f3 f3Var, d1 d1Var, e2 e2Var) {
        this.f15289a = iArr;
        this.f15290b = objArr;
        this.f15292e = z10;
        this.d = d1Var != null && d1Var.c(j2Var);
        this.f15293f = iArr2;
        this.f15294g = i10;
        this.f15295h = i11;
        this.f15296i = y1Var;
        this.f15297j = f3Var;
        this.f15298k = d1Var;
        this.f15291c = j2Var;
    }

    public static <T> boolean k(T t2, long j10) {
        return ((Boolean) o3.j(t2, j10)).booleanValue();
    }

    public static final void m(int i10, Object obj, com.google.android.gms.internal.cast.k1 k1Var) {
        if (obj instanceof String) {
            k1Var.f6904a.w0(i10, (String) obj);
            return;
        }
        k1Var.f6904a.p0(i10, (zzoe) obj);
    }

    public static l2 n(h2 h2Var, n2 n2Var, y1 y1Var, f3 f3Var, d1 d1Var, e2 e2Var) {
        if (h2Var instanceof s2) {
            return o((s2) h2Var, n2Var, y1Var, f3Var, d1Var, e2Var);
        }
        e3 e3Var = (e3) h2Var;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> t9.l2<T> o(t9.s2 r33, t9.n2 r34, t9.y1 r35, t9.f3<?, ?> r36, t9.d1<?> r37, t9.e2 r38) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.l2.o(t9.s2, t9.n2, t9.y1, t9.f3, t9.d1, t9.e2):t9.l2");
    }

    public static <T> double p(T t2, long j10) {
        return ((Double) o3.j(t2, j10)).doubleValue();
    }

    public static <T> float q(T t2, long j10) {
        return ((Float) o3.j(t2, j10)).floatValue();
    }

    public static <T> int t(T t2, long j10) {
        return ((Integer) o3.j(t2, j10)).intValue();
    }

    public static <T> long w(T t2, long j10) {
        return ((Long) o3.j(t2, j10)).longValue();
    }

    public static Field z(Class<?> cls, String str) {
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        t9.o3.f15313c.u(r8, r0, r3);
        C(r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(T r8, T r9, int r10) {
        /*
            r7 = this;
            int[] r0 = r7.f15289a
            int r1 = r10 + 1
            r0 = r0[r1]
            r6 = 2
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r0 = (long) r0
            r5 = 4
            boolean r3 = r7.h(r9, r10)
            r2 = r3
            if (r2 != 0) goto L16
            r6 = 3
            return
        L16:
            java.lang.Object r3 = t9.o3.j(r8, r0)
            r2 = r3
            java.lang.Object r3 = t9.o3.j(r9, r0)
            r9 = r3
            if (r2 == 0) goto L35
            if (r9 != 0) goto L26
            r6 = 7
            goto L35
        L26:
            java.lang.Object r9 = t9.t1.b(r2, r9)
            h2.k r2 = t9.o3.f15313c
            r2.u(r8, r0, r9)
            r5 = 5
            r7.C(r8, r10)
            r6 = 3
            return
        L35:
            if (r9 == 0) goto L42
            r6 = 2
            h2.k r2 = t9.o3.f15313c
            r6 = 5
            r2.u(r8, r0, r9)
            r5 = 1
            r7.C(r8, r10)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.l2.A(java.lang.Object, java.lang.Object, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        t9.o3.f15313c.u(r6, r1, r7);
        D(r6, r0, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(T r6, T r7, int r8) {
        /*
            r5 = this;
            int[] r0 = r5.f15289a
            int r1 = r8 + 1
            r4 = 3
            r1 = r0[r1]
            r0 = r0[r8]
            r4 = 4
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            long r1 = (long) r1
            r4 = 2
            boolean r4 = r5.j(r7, r0, r8)
            r3 = r4
            if (r3 != 0) goto L19
            r4 = 2
            return
        L19:
            boolean r3 = r5.j(r6, r0, r8)
            if (r3 == 0) goto L24
            java.lang.Object r3 = t9.o3.j(r6, r1)
            goto L27
        L24:
            r4 = 1
            r3 = 0
            r4 = 5
        L27:
            java.lang.Object r7 = t9.o3.j(r7, r1)
            if (r3 == 0) goto L43
            if (r7 != 0) goto L31
            r4 = 6
            goto L43
        L31:
            r4 = 6
            java.lang.Object r4 = t9.t1.b(r3, r7)
            r7 = r4
            h2.k r3 = t9.o3.f15313c
            r4 = 6
            r3.u(r6, r1, r7)
            r4 = 2
            r5.D(r6, r0, r8)
            r4 = 1
            return
        L43:
            if (r7 == 0) goto L4e
            h2.k r3 = t9.o3.f15313c
            r4 = 4
            r3.u(r6, r1, r7)
            r5.D(r6, r0, r8)
        L4e:
            r4 = 1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.l2.B(java.lang.Object, java.lang.Object, int):void");
    }

    public final void C(T t2, int i10) {
        int i11 = this.f15289a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        o3.f15313c.s(t2, j10, (1 << (i11 >>> 20)) | o3.g(t2, j10));
    }

    public final void D(T t2, int i10, int i11) {
        o3.f15313c.s(t2, this.f15289a[i11 + 2] & 1048575, i10);
    }

    public final boolean E(T t2, T t8, int i10) {
        return h(t2, i10) == h(t8, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t9.t2
    public final boolean a(T t2) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f15294g) {
            int i15 = this.f15293f[i14];
            int i16 = this.f15289a[i15];
            int v2 = v(i15);
            int i17 = this.f15289a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f15288m.getInt(t2, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & v2) != 0 && !i(t2, i15, i10, i11, i19)) {
                return false;
            }
            int i20 = (v2 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i20 != 9 && i20 != 17) {
                if (i20 != 27) {
                    if (i20 == 60 || i20 == 68) {
                        if (j(t2, i16, i15) && !x(i15).a(o3.j(t2, v2 & 1048575))) {
                            return false;
                        }
                    } else if (i20 != 49) {
                        if (i20 == 50 && !((zzpy) o3.j(t2, v2 & 1048575)).isEmpty()) {
                            d2 d2Var = (d2) y(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) o3.j(t2, v2 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    t2 x10 = x(i15);
                    for (int i21 = 0; i21 < list.size(); i21++) {
                        if (!x10.a(list.get(i21))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (i(t2, i15, i10, i11, i19) && !x(i15).a(o3.j(t2, v2 & 1048575))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        if (this.d) {
            this.f15298k.a(t2);
            throw null;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0234, code lost:
        if (r3 != false) goto L53;
     */
    @Override // t9.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(T r13) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.l2.b(java.lang.Object):int");
    }

    @Override // t9.t2
    public final int c(T t2) {
        return this.f15292e ? s(t2) : r(t2);
    }

    @Override // t9.t2
    public final void d(T t2, T t8) {
        Objects.requireNonNull(t8);
        for (int i10 = 0; i10 < this.f15289a.length; i10 += 3) {
            int v2 = v(i10);
            long j10 = 1048575 & v2;
            int i11 = this.f15289a[i10];
            switch ((v2 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
                case 0:
                    if (h(t8, i10)) {
                        o3.f15313c.j(t2, j10, o3.e(t8, j10));
                        C(t2, i10);
                        break;
                    }
                    break;
                case 1:
                    if (h(t8, i10)) {
                        o3.f15313c.k(t2, j10, o3.f(t8, j10));
                        C(t2, i10);
                        continue;
                    }
                    break;
                case 2:
                    if (h(t8, i10)) {
                        o3.m(t2, j10, o3.h(t8, j10));
                        C(t2, i10);
                        continue;
                    }
                    break;
                case 3:
                    if (h(t8, i10)) {
                        o3.m(t2, j10, o3.h(t8, j10));
                        C(t2, i10);
                        continue;
                    }
                    break;
                case 4:
                    if (h(t8, i10)) {
                        o3.f15313c.s(t2, j10, o3.g(t8, j10));
                        C(t2, i10);
                        continue;
                    }
                    break;
                case 5:
                    if (h(t8, i10)) {
                        o3.m(t2, j10, o3.h(t8, j10));
                        C(t2, i10);
                        continue;
                    }
                    break;
                case 6:
                    if (h(t8, i10)) {
                        o3.f15313c.s(t2, j10, o3.g(t8, j10));
                        C(t2, i10);
                        continue;
                    }
                    break;
                case 7:
                    if (h(t8, i10)) {
                        o3.f15313c.h(t2, j10, o3.q(t8, j10));
                        C(t2, i10);
                        continue;
                    }
                    break;
                case 8:
                    if (h(t8, i10)) {
                        o3.f15313c.u(t2, j10, o3.j(t8, j10));
                        C(t2, i10);
                        continue;
                    }
                    break;
                case 9:
                    A(t2, t8, i10);
                    continue;
                case 10:
                    if (h(t8, i10)) {
                        o3.f15313c.u(t2, j10, o3.j(t8, j10));
                        C(t2, i10);
                        continue;
                    }
                    break;
                case 11:
                    if (h(t8, i10)) {
                        o3.f15313c.s(t2, j10, o3.g(t8, j10));
                        C(t2, i10);
                        continue;
                    }
                    break;
                case 12:
                    if (h(t8, i10)) {
                        o3.f15313c.s(t2, j10, o3.g(t8, j10));
                        C(t2, i10);
                        continue;
                    }
                    break;
                case 13:
                    if (h(t8, i10)) {
                        o3.f15313c.s(t2, j10, o3.g(t8, j10));
                        C(t2, i10);
                        continue;
                    }
                    break;
                case 14:
                    if (h(t8, i10)) {
                        o3.m(t2, j10, o3.h(t8, j10));
                        C(t2, i10);
                        continue;
                    }
                    break;
                case 15:
                    if (h(t8, i10)) {
                        o3.f15313c.s(t2, j10, o3.g(t8, j10));
                        C(t2, i10);
                        continue;
                    }
                    break;
                case 16:
                    if (h(t8, i10)) {
                        o3.m(t2, j10, o3.h(t8, j10));
                        C(t2, i10);
                        continue;
                    }
                    break;
                case 17:
                    A(t2, t8, i10);
                    continue;
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
                    this.f15296i.b(t2, t8, j10);
                    continue;
                case 50:
                    Class<?> cls = v2.f15360a;
                    zzpy zzpyVar = (zzpy) o3.j(t2, j10);
                    zzpy zzpyVar2 = (zzpy) o3.j(t8, j10);
                    if (!zzpyVar2.isEmpty()) {
                        if (!zzpyVar.c()) {
                            zzpyVar = zzpyVar.a();
                        }
                        zzpyVar.f();
                        if (!zzpyVar2.isEmpty()) {
                            zzpyVar.putAll(zzpyVar2);
                        }
                    }
                    o3.f15313c.u(t2, j10, zzpyVar);
                    continue;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (j(t8, i11, i10)) {
                        o3.f15313c.u(t2, j10, o3.j(t8, j10));
                        D(t2, i11, i10);
                        continue;
                    }
                    break;
                case 60:
                    B(t2, t8, i10);
                    continue;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (j(t8, i11, i10)) {
                        o3.f15313c.u(t2, j10, o3.j(t8, j10));
                        D(t2, i11, i10);
                        continue;
                    }
                    break;
                case 68:
                    B(t2, t8, i10);
                    continue;
                default:
                    continue;
            }
        }
        f3<?, ?> f3Var = this.f15297j;
        Class<?> cls2 = v2.f15360a;
        f3Var.f(t2, f3Var.d(f3Var.c(t2), f3Var.c(t8)));
        if (this.d) {
            this.f15298k.a(t8);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0201 A[SYNTHETIC] */
    @Override // t9.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(T r11, T r12) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.l2.e(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // t9.t2
    public final void f(T t2) {
        int i10;
        int i11 = this.f15294g;
        while (true) {
            i10 = this.f15295h;
            if (i11 >= i10) {
                break;
            }
            long v2 = v(this.f15293f[i11]) & 1048575;
            Object j10 = o3.j(t2, v2);
            if (j10 != null) {
                ((zzpy) j10).b();
                o3.f15313c.u(t2, v2, j10);
            }
            i11++;
        }
        int length = this.f15293f.length;
        while (i10 < length) {
            this.f15296i.a(t2, this.f15293f[i10]);
            i10++;
        }
        this.f15297j.e(t2);
        if (this.d) {
            this.f15298k.b(t2);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // t9.t2
    public final void g(T r14, com.google.android.gms.internal.cast.k1 r15) {
        /*
            Method dump skipped, instructions count: 1618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.l2.g(java.lang.Object, com.google.android.gms.internal.cast.k1):void");
    }

    public final boolean h(T t2, int i10) {
        int[] iArr = this.f15289a;
        int i11 = iArr[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 != 1048575) {
            return (o3.g(t2, j10) & (1 << (i11 >>> 20))) != 0;
        }
        int i12 = iArr[i10 + 1];
        long j11 = i12 & 1048575;
        switch ((i12 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
            case 0:
                return Double.doubleToRawLongBits(o3.e(t2, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(o3.f(t2, j11)) != 0;
            case 2:
                return o3.h(t2, j11) != 0;
            case 3:
                return o3.h(t2, j11) != 0;
            case 4:
                return o3.g(t2, j11) != 0;
            case 5:
                return o3.h(t2, j11) != 0;
            case 6:
                return o3.g(t2, j11) != 0;
            case 7:
                return o3.q(t2, j11);
            case 8:
                Object j12 = o3.j(t2, j11);
                if (j12 instanceof String) {
                    return !((String) j12).isEmpty();
                } else if (j12 instanceof zzoe) {
                    return !zzoe.f6957c.equals(j12);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return o3.j(t2, j11) != null;
            case 10:
                return !zzoe.f6957c.equals(o3.j(t2, j11));
            case 11:
                return o3.g(t2, j11) != 0;
            case 12:
                return o3.g(t2, j11) != 0;
            case 13:
                return o3.g(t2, j11) != 0;
            case 14:
                return o3.h(t2, j11) != 0;
            case 15:
                return o3.g(t2, j11) != 0;
            case 16:
                return o3.h(t2, j11) != 0;
            case 17:
                return o3.j(t2, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean i(T t2, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? h(t2, i10) : (i12 & i13) != 0;
    }

    public final boolean j(T t2, int i10, int i11) {
        return o3.g(t2, (long) (this.f15289a[i11 + 2] & 1048575)) == i10;
    }

    public final void l(T t2, com.google.android.gms.internal.cast.k1 k1Var) {
        int i10;
        if (this.d) {
            this.f15298k.a(t2);
            throw null;
        }
        int length = this.f15289a.length;
        Unsafe unsafe = f15288m;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 1048575;
        int i14 = 0;
        while (i12 < length) {
            int v2 = v(i12);
            int[] iArr = this.f15289a;
            int i15 = iArr[i12];
            int i16 = (v2 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i16 <= 17) {
                int i17 = iArr[i12 + 2];
                int i18 = i17 & i11;
                if (i18 != i13) {
                    i14 = unsafe.getInt(t2, i18);
                    i13 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = v2 & i11;
            switch (i16) {
                case 0:
                    if ((i14 & i10) != 0) {
                        k1Var.b(i15, o3.e(t2, j10));
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 1:
                    if ((i14 & i10) != 0) {
                        k1Var.c(i15, o3.f(t2, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 2:
                    if ((i14 & i10) != 0) {
                        k1Var.f6904a.A0(i15, unsafe.getLong(t2, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 3:
                    if ((i14 & i10) != 0) {
                        k1Var.f6904a.A0(i15, unsafe.getLong(t2, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 4:
                    if ((i14 & i10) != 0) {
                        k1Var.f6904a.u0(i15, unsafe.getInt(t2, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 5:
                    if ((i14 & i10) != 0) {
                        k1Var.f6904a.s0(i15, unsafe.getLong(t2, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 6:
                    if ((i14 & i10) != 0) {
                        k1Var.f6904a.q0(i15, unsafe.getInt(t2, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 7:
                    if ((i14 & i10) != 0) {
                        k1Var.f6904a.o0(i15, o3.q(t2, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 8:
                    if ((i14 & i10) != 0) {
                        m(i15, unsafe.getObject(t2, j10), k1Var);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 9:
                    if ((i14 & i10) != 0) {
                        k1Var.e(i15, unsafe.getObject(t2, j10), x(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 10:
                    if ((i14 & i10) != 0) {
                        k1Var.f6904a.p0(i15, (zzoe) unsafe.getObject(t2, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 11:
                    if ((i14 & i10) != 0) {
                        k1Var.f6904a.y0(i15, unsafe.getInt(t2, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 12:
                    if ((i14 & i10) != 0) {
                        k1Var.f6904a.u0(i15, unsafe.getInt(t2, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 13:
                    if ((i14 & i10) != 0) {
                        k1Var.f6904a.q0(i15, unsafe.getInt(t2, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 14:
                    if ((i14 & i10) != 0) {
                        k1Var.f6904a.s0(i15, unsafe.getLong(t2, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 15:
                    if ((i14 & i10) != 0) {
                        k1Var.f(i15, unsafe.getInt(t2, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 16:
                    if ((i14 & i10) != 0) {
                        k1Var.a(i15, unsafe.getLong(t2, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 17:
                    if ((i14 & i10) != 0) {
                        k1Var.d(i15, unsafe.getObject(t2, j10), x(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 18:
                    v2.d(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 19:
                    v2.h(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 20:
                    v2.k(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 21:
                    v2.s(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 22:
                    v2.j(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 23:
                    v2.g(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 24:
                    v2.f(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 25:
                    v2.b(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 26:
                    v2.q(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var);
                    break;
                case 27:
                    v2.l(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, x(i12));
                    break;
                case 28:
                    v2.c(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var);
                    break;
                case 29:
                    v2.r(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, false);
                    break;
                case 30:
                    v2.e(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, false);
                    break;
                case 31:
                    v2.m(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, false);
                    break;
                case 32:
                    v2.n(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, false);
                    break;
                case 33:
                    v2.o(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, false);
                    break;
                case 34:
                    v2.p(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, false);
                    break;
                case 35:
                    v2.d(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, true);
                    break;
                case 36:
                    v2.h(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, true);
                    break;
                case 37:
                    v2.k(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, true);
                    break;
                case 38:
                    v2.s(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, true);
                    break;
                case 39:
                    v2.j(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, true);
                    break;
                case 40:
                    v2.g(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, true);
                    break;
                case 41:
                    v2.f(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, true);
                    break;
                case 42:
                    v2.b(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, true);
                    break;
                case 43:
                    v2.r(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, true);
                    break;
                case 44:
                    v2.e(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, true);
                    break;
                case 45:
                    v2.m(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, true);
                    break;
                case 46:
                    v2.n(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, true);
                    break;
                case 47:
                    v2.o(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, true);
                    break;
                case 48:
                    v2.p(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, true);
                    break;
                case 49:
                    v2.i(this.f15289a[i12], (List) unsafe.getObject(t2, j10), k1Var, x(i12));
                    break;
                case 50:
                    if (unsafe.getObject(t2, j10) != null) {
                        d2 d2Var = (d2) y(i12);
                        throw null;
                    }
                    break;
                case 51:
                    if (j(t2, i15, i12)) {
                        k1Var.b(i15, p(t2, j10));
                        break;
                    }
                    break;
                case 52:
                    if (j(t2, i15, i12)) {
                        k1Var.c(i15, q(t2, j10));
                        break;
                    }
                    break;
                case 53:
                    if (j(t2, i15, i12)) {
                        k1Var.f6904a.A0(i15, w(t2, j10));
                        break;
                    }
                    break;
                case 54:
                    if (j(t2, i15, i12)) {
                        k1Var.f6904a.A0(i15, w(t2, j10));
                        break;
                    }
                    break;
                case 55:
                    if (j(t2, i15, i12)) {
                        k1Var.f6904a.u0(i15, t(t2, j10));
                        break;
                    }
                    break;
                case 56:
                    if (j(t2, i15, i12)) {
                        k1Var.f6904a.s0(i15, w(t2, j10));
                        break;
                    }
                    break;
                case 57:
                    if (j(t2, i15, i12)) {
                        k1Var.f6904a.q0(i15, t(t2, j10));
                        break;
                    }
                    break;
                case 58:
                    if (j(t2, i15, i12)) {
                        k1Var.f6904a.o0(i15, k(t2, j10));
                        break;
                    }
                    break;
                case 59:
                    if (j(t2, i15, i12)) {
                        m(i15, unsafe.getObject(t2, j10), k1Var);
                        break;
                    }
                    break;
                case 60:
                    if (j(t2, i15, i12)) {
                        k1Var.e(i15, unsafe.getObject(t2, j10), x(i12));
                        break;
                    }
                    break;
                case 61:
                    if (j(t2, i15, i12)) {
                        k1Var.f6904a.p0(i15, (zzoe) unsafe.getObject(t2, j10));
                        break;
                    }
                    break;
                case 62:
                    if (j(t2, i15, i12)) {
                        k1Var.f6904a.y0(i15, t(t2, j10));
                        break;
                    }
                    break;
                case 63:
                    if (j(t2, i15, i12)) {
                        k1Var.f6904a.u0(i15, t(t2, j10));
                        break;
                    }
                    break;
                case 64:
                    if (j(t2, i15, i12)) {
                        k1Var.f6904a.q0(i15, t(t2, j10));
                        break;
                    }
                    break;
                case 65:
                    if (j(t2, i15, i12)) {
                        k1Var.f6904a.s0(i15, w(t2, j10));
                        break;
                    }
                    break;
                case 66:
                    if (j(t2, i15, i12)) {
                        k1Var.f(i15, t(t2, j10));
                        break;
                    }
                    break;
                case 67:
                    if (j(t2, i15, i12)) {
                        k1Var.a(i15, w(t2, j10));
                        break;
                    }
                    break;
                case 68:
                    if (j(t2, i15, i12)) {
                        k1Var.d(i15, unsafe.getObject(t2, j10), x(i12));
                        break;
                    }
                    break;
            }
            i12 += 3;
            i11 = 1048575;
        }
        f3<?, ?> f3Var = this.f15297j;
        f3Var.g(f3Var.c(t2), k1Var);
    }

    public final int r(T t2) {
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
        Unsafe unsafe = f15288m;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        int i16 = 0;
        while (i13 < this.f15289a.length) {
            int v2 = v(i13);
            int[] iArr = this.f15289a;
            int i17 = iArr[i13];
            int i18 = (v2 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i18 <= 17) {
                int i19 = iArr[i13 + 2];
                int i20 = i19 & i12;
                i10 = 1 << (i19 >>> 20);
                if (i20 != i15) {
                    i16 = unsafe.getInt(t2, i20);
                    i15 = i20;
                }
            } else {
                i10 = 0;
            }
            long j10 = i12 & v2;
            switch (i18) {
                case 0:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        l02 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        H = l02 + 8;
                        i14 += H;
                        break;
                    }
                case 1:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        l03 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        H = l03 + 4;
                        i14 += H;
                        break;
                    }
                case 2:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(t2, j10);
                        l04 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        m02 = com.google.android.gms.internal.cast.j1.m0(j11);
                        H = l04 + m02;
                        i14 += H;
                        break;
                    }
                case 3:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(t2, j10);
                        l04 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        m02 = com.google.android.gms.internal.cast.j1.m0(j12);
                        H = l04 + m02;
                        i14 += H;
                        break;
                    }
                case 4:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        int i21 = unsafe.getInt(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.E0(i21);
                        H = E0 + l05;
                        i14 += H;
                        break;
                    }
                case 5:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        l02 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        H = l02 + 8;
                        i14 += H;
                        break;
                    }
                case 6:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        l03 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        H = l03 + 4;
                        i14 += H;
                        break;
                    }
                case 7:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        l06 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        H = l06 + 1;
                        i14 += H;
                        break;
                    }
                case 8:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(t2, j10);
                        if (!(object instanceof zzoe)) {
                            l05 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                            E0 = com.google.android.gms.internal.cast.j1.G0((String) object);
                            H = E0 + l05;
                            i14 += H;
                            break;
                        } else {
                            l07 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                            g10 = ((zzoe) object).g();
                            l08 = com.google.android.gms.internal.cast.j1.l0(g10);
                            i14 = l08 + g10 + l07 + i14;
                            break;
                        }
                    }
                case 9:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        H = v2.H(i17, unsafe.getObject(t2, j10), x(i13));
                        i14 += H;
                        break;
                    }
                case 10:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        l07 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        g10 = ((zzoe) unsafe.getObject(t2, j10)).g();
                        l08 = com.google.android.gms.internal.cast.j1.l0(g10);
                        i14 = l08 + g10 + l07 + i14;
                        break;
                    }
                case 11:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        int i22 = unsafe.getInt(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.l0(i22);
                        H = E0 + l05;
                        i14 += H;
                        break;
                    }
                case 12:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        int i23 = unsafe.getInt(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.E0(i23);
                        H = E0 + l05;
                        i14 += H;
                        break;
                    }
                case 13:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        l03 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        H = l03 + 4;
                        i14 += H;
                        break;
                    }
                case 14:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        l02 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        H = l02 + 8;
                        i14 += H;
                        break;
                    }
                case 15:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        int i24 = unsafe.getInt(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.l0((i24 >> 31) ^ (i24 + i24));
                        H = E0 + l05;
                        i14 += H;
                        break;
                    }
                case 16:
                    if ((i10 & i16) == 0) {
                        break;
                    } else {
                        long j13 = unsafe.getLong(t2, j10);
                        l09 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        m03 = com.google.android.gms.internal.cast.j1.m0((j13 >> 63) ^ (j13 + j13));
                        H = m03 + l09;
                        i14 += H;
                        break;
                    }
                case 17:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        H = com.google.android.gms.internal.cast.j1.D0(i17, (j2) unsafe.getObject(t2, j10), x(i13));
                        i14 += H;
                        break;
                    }
                case 18:
                    H = v2.A(i17, (List) unsafe.getObject(t2, j10));
                    i14 += H;
                    break;
                case 19:
                    H = v2.y(i17, (List) unsafe.getObject(t2, j10));
                    i14 += H;
                    break;
                case 20:
                    H = v2.F(i17, (List) unsafe.getObject(t2, j10));
                    i14 += H;
                    break;
                case 21:
                    H = v2.Q(i17, (List) unsafe.getObject(t2, j10), false);
                    i14 += H;
                    break;
                case 22:
                    H = v2.D(i17, (List) unsafe.getObject(t2, j10), false);
                    i14 += H;
                    break;
                case 23:
                    H = v2.A(i17, (List) unsafe.getObject(t2, j10));
                    i14 += H;
                    break;
                case 24:
                    H = v2.y(i17, (List) unsafe.getObject(t2, j10));
                    i14 += H;
                    break;
                case 25:
                    H = v2.u(i17, (List) unsafe.getObject(t2, j10));
                    i14 += H;
                    break;
                case 26:
                    H = v2.N(i17, (List) unsafe.getObject(t2, j10));
                    i14 += H;
                    break;
                case 27:
                    H = v2.I(i17, (List) unsafe.getObject(t2, j10), x(i13));
                    i14 += H;
                    break;
                case 28:
                    H = v2.v(i17, (List) unsafe.getObject(t2, j10));
                    i14 += H;
                    break;
                case 29:
                    H = v2.O(i17, (List) unsafe.getObject(t2, j10), false);
                    i14 += H;
                    break;
                case 30:
                    H = v2.w(i17, (List) unsafe.getObject(t2, j10), false);
                    i14 += H;
                    break;
                case 31:
                    H = v2.y(i17, (List) unsafe.getObject(t2, j10));
                    i14 += H;
                    break;
                case 32:
                    H = v2.A(i17, (List) unsafe.getObject(t2, j10));
                    i14 += H;
                    break;
                case 33:
                    H = v2.J(i17, (List) unsafe.getObject(t2, j10), false);
                    i14 += H;
                    break;
                case 34:
                    H = v2.L(i17, (List) unsafe.getObject(t2, j10), false);
                    i14 += H;
                    break;
                case 35:
                    B = v2.B((List) unsafe.getObject(t2, j10));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i17);
                        l010 = com.google.android.gms.internal.cast.j1.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 36:
                    B = v2.z((List) unsafe.getObject(t2, j10));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i17);
                        l010 = com.google.android.gms.internal.cast.j1.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 37:
                    B = v2.G((List) unsafe.getObject(t2, j10));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i17);
                        l010 = com.google.android.gms.internal.cast.j1.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 38:
                    B = v2.R((List) unsafe.getObject(t2, j10));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i17);
                        l010 = com.google.android.gms.internal.cast.j1.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 39:
                    B = v2.E((List) unsafe.getObject(t2, j10));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i17);
                        l010 = com.google.android.gms.internal.cast.j1.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 40:
                    B = v2.B((List) unsafe.getObject(t2, j10));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i17);
                        l010 = com.google.android.gms.internal.cast.j1.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 41:
                    B = v2.z((List) unsafe.getObject(t2, j10));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i17);
                        l010 = com.google.android.gms.internal.cast.j1.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 42:
                    Class<?> cls = v2.f15360a;
                    B = ((List) unsafe.getObject(t2, j10)).size();
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i17);
                        l010 = com.google.android.gms.internal.cast.j1.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 43:
                    B = v2.P((List) unsafe.getObject(t2, j10));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i17);
                        l010 = com.google.android.gms.internal.cast.j1.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 44:
                    B = v2.x((List) unsafe.getObject(t2, j10));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i17);
                        l010 = com.google.android.gms.internal.cast.j1.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 45:
                    B = v2.z((List) unsafe.getObject(t2, j10));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i17);
                        l010 = com.google.android.gms.internal.cast.j1.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 46:
                    B = v2.B((List) unsafe.getObject(t2, j10));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i17);
                        l010 = com.google.android.gms.internal.cast.j1.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 47:
                    B = v2.K((List) unsafe.getObject(t2, j10));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i17);
                        l010 = com.google.android.gms.internal.cast.j1.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 48:
                    B = v2.M((List) unsafe.getObject(t2, j10));
                    if (B <= 0) {
                        break;
                    } else {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i17);
                        l010 = com.google.android.gms.internal.cast.j1.l0(B);
                        i11 = l010 + H0 + B;
                        i14 += i11;
                        break;
                    }
                case 49:
                    H = v2.C(i17, (List) unsafe.getObject(t2, j10), x(i13));
                    i14 += H;
                    break;
                case 50:
                    e2.a(i17, unsafe.getObject(t2, j10), y(i13));
                    break;
                case 51:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        l02 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        H = l02 + 8;
                        i14 += H;
                        break;
                    }
                case 52:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        l03 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        H = l03 + 4;
                        i14 += H;
                        break;
                    }
                case 53:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        long w10 = w(t2, j10);
                        l04 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        m02 = com.google.android.gms.internal.cast.j1.m0(w10);
                        H = l04 + m02;
                        i14 += H;
                        break;
                    }
                case 54:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        long w11 = w(t2, j10);
                        l04 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        m02 = com.google.android.gms.internal.cast.j1.m0(w11);
                        H = l04 + m02;
                        i14 += H;
                        break;
                    }
                case 55:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        int t8 = t(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.E0(t8);
                        H = E0 + l05;
                        i14 += H;
                        break;
                    }
                case 56:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        l02 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        H = l02 + 8;
                        i14 += H;
                        break;
                    }
                case 57:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        l03 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        H = l03 + 4;
                        i14 += H;
                        break;
                    }
                case 58:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        l06 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        H = l06 + 1;
                        i14 += H;
                        break;
                    }
                case 59:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(t2, j10);
                        if (!(object2 instanceof zzoe)) {
                            l05 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                            E0 = com.google.android.gms.internal.cast.j1.G0((String) object2);
                            H = E0 + l05;
                            i14 += H;
                            break;
                        } else {
                            l011 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                            g11 = ((zzoe) object2).g();
                            l012 = com.google.android.gms.internal.cast.j1.l0(g11);
                            i11 = l012 + g11 + l011;
                            i14 += i11;
                            break;
                        }
                    }
                case 60:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        H = v2.H(i17, unsafe.getObject(t2, j10), x(i13));
                        i14 += H;
                        break;
                    }
                case 61:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        l011 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        g11 = ((zzoe) unsafe.getObject(t2, j10)).g();
                        l012 = com.google.android.gms.internal.cast.j1.l0(g11);
                        i11 = l012 + g11 + l011;
                        i14 += i11;
                        break;
                    }
                case 62:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        int t10 = t(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.l0(t10);
                        H = E0 + l05;
                        i14 += H;
                        break;
                    }
                case 63:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        int t11 = t(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.E0(t11);
                        H = E0 + l05;
                        i14 += H;
                        break;
                    }
                case 64:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        l03 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        H = l03 + 4;
                        i14 += H;
                        break;
                    }
                case 65:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        l02 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        H = l02 + 8;
                        i14 += H;
                        break;
                    }
                case 66:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        int t12 = t(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.l0((t12 >> 31) ^ (t12 + t12));
                        H = E0 + l05;
                        i14 += H;
                        break;
                    }
                case 67:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        long w12 = w(t2, j10);
                        l09 = com.google.android.gms.internal.cast.j1.l0(i17 << 3);
                        m03 = com.google.android.gms.internal.cast.j1.m0((w12 >> 63) ^ (w12 + w12));
                        H = m03 + l09;
                        i14 += H;
                        break;
                    }
                case 68:
                    if (!j(t2, i17, i13)) {
                        break;
                    } else {
                        H = com.google.android.gms.internal.cast.j1.D0(i17, (j2) unsafe.getObject(t2, j10), x(i13));
                        i14 += H;
                        break;
                    }
            }
            i13 += 3;
            i12 = 1048575;
        }
        f3<?, ?> f3Var = this.f15297j;
        int a10 = f3Var.a(f3Var.c(t2)) + i14;
        if (this.d) {
            this.f15298k.a(t2);
            throw null;
        }
        return a10;
    }

    public final int s(T t2) {
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
        Unsafe unsafe = f15288m;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f15289a.length; i12 += 3) {
            int v2 = v(i12);
            int i13 = (v2 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            int i14 = this.f15289a[i12];
            long j10 = v2 & 1048575;
            if (i13 >= zzot.f6958c.zza() && i13 <= zzot.f6959f.zza()) {
                int i15 = this.f15289a[i12 + 2];
            }
            switch (i13) {
                case 0:
                    if (h(t2, i12)) {
                        l02 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        H = l02 + 8;
                        i11 += H;
                        break;
                    }
                    break;
                case 1:
                    if (h(t2, i12)) {
                        l03 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        H = l03 + 4;
                        i11 += H;
                        break;
                    }
                    break;
                case 2:
                    if (h(t2, i12)) {
                        long h10 = o3.h(t2, j10);
                        l04 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        m02 = com.google.android.gms.internal.cast.j1.m0(h10);
                        H = m02 + l04;
                        i11 += H;
                        break;
                    }
                    break;
                case 3:
                    if (h(t2, i12)) {
                        long h11 = o3.h(t2, j10);
                        l04 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        m02 = com.google.android.gms.internal.cast.j1.m0(h11);
                        H = m02 + l04;
                        i11 += H;
                        break;
                    }
                    break;
                case 4:
                    if (h(t2, i12)) {
                        int g11 = o3.g(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.E0(g11);
                        H = E0 + l05;
                        i11 += H;
                        break;
                    }
                    break;
                case 5:
                    if (h(t2, i12)) {
                        l02 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        H = l02 + 8;
                        i11 += H;
                        break;
                    }
                    break;
                case 6:
                    if (h(t2, i12)) {
                        l03 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        H = l03 + 4;
                        i11 += H;
                        break;
                    }
                    break;
                case 7:
                    if (h(t2, i12)) {
                        l06 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        H = l06 + 1;
                        i11 += H;
                        break;
                    }
                    break;
                case 8:
                    if (h(t2, i12)) {
                        Object j11 = o3.j(t2, j10);
                        if (!(j11 instanceof zzoe)) {
                            l05 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                            E0 = com.google.android.gms.internal.cast.j1.G0((String) j11);
                            H = E0 + l05;
                            i11 += H;
                            break;
                        } else {
                            l07 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                            g10 = ((zzoe) j11).g();
                            l08 = com.google.android.gms.internal.cast.j1.l0(g10);
                            i10 = l08 + g10 + l07;
                            i11 += i10;
                        }
                    }
                    break;
                case 9:
                    if (h(t2, i12)) {
                        H = v2.H(i14, o3.j(t2, j10), x(i12));
                        i11 += H;
                        break;
                    }
                    break;
                case 10:
                    if (h(t2, i12)) {
                        l07 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        g10 = ((zzoe) o3.j(t2, j10)).g();
                        l08 = com.google.android.gms.internal.cast.j1.l0(g10);
                        i10 = l08 + g10 + l07;
                        i11 += i10;
                    }
                    break;
                case 11:
                    if (h(t2, i12)) {
                        int g12 = o3.g(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.l0(g12);
                        H = E0 + l05;
                        i11 += H;
                        break;
                    }
                    break;
                case 12:
                    if (h(t2, i12)) {
                        int g13 = o3.g(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.E0(g13);
                        H = E0 + l05;
                        i11 += H;
                        break;
                    }
                    break;
                case 13:
                    if (h(t2, i12)) {
                        l03 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        H = l03 + 4;
                        i11 += H;
                        break;
                    }
                    break;
                case 14:
                    if (h(t2, i12)) {
                        l02 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        H = l02 + 8;
                        i11 += H;
                        break;
                    }
                    break;
                case 15:
                    if (h(t2, i12)) {
                        int g14 = o3.g(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.l0((g14 >> 31) ^ (g14 + g14));
                        H = E0 + l05;
                        i11 += H;
                        break;
                    }
                    break;
                case 16:
                    if (h(t2, i12)) {
                        long h12 = o3.h(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.m0((h12 >> 63) ^ (h12 + h12));
                        H = E0 + l05;
                        i11 += H;
                        break;
                    }
                    break;
                case 17:
                    if (h(t2, i12)) {
                        H = com.google.android.gms.internal.cast.j1.D0(i14, (j2) o3.j(t2, j10), x(i12));
                        i11 += H;
                        break;
                    }
                    break;
                case 18:
                    H = v2.A(i14, (List) o3.j(t2, j10));
                    i11 += H;
                    break;
                case 19:
                    H = v2.y(i14, (List) o3.j(t2, j10));
                    i11 += H;
                    break;
                case 20:
                    H = v2.F(i14, (List) o3.j(t2, j10));
                    i11 += H;
                    break;
                case 21:
                    H = v2.Q(i14, (List) o3.j(t2, j10), false);
                    i11 += H;
                    break;
                case 22:
                    H = v2.D(i14, (List) o3.j(t2, j10), false);
                    i11 += H;
                    break;
                case 23:
                    H = v2.A(i14, (List) o3.j(t2, j10));
                    i11 += H;
                    break;
                case 24:
                    H = v2.y(i14, (List) o3.j(t2, j10));
                    i11 += H;
                    break;
                case 25:
                    H = v2.u(i14, (List) o3.j(t2, j10));
                    i11 += H;
                    break;
                case 26:
                    H = v2.N(i14, (List) o3.j(t2, j10));
                    i11 += H;
                    break;
                case 27:
                    H = v2.I(i14, (List) o3.j(t2, j10), x(i12));
                    i11 += H;
                    break;
                case 28:
                    H = v2.v(i14, (List) o3.j(t2, j10));
                    i11 += H;
                    break;
                case 29:
                    H = v2.O(i14, (List) o3.j(t2, j10), false);
                    i11 += H;
                    break;
                case 30:
                    H = v2.w(i14, (List) o3.j(t2, j10), false);
                    i11 += H;
                    break;
                case 31:
                    H = v2.y(i14, (List) o3.j(t2, j10));
                    i11 += H;
                    break;
                case 32:
                    H = v2.A(i14, (List) o3.j(t2, j10));
                    i11 += H;
                    break;
                case 33:
                    H = v2.J(i14, (List) o3.j(t2, j10), false);
                    i11 += H;
                    break;
                case 34:
                    H = v2.L(i14, (List) o3.j(t2, j10), false);
                    i11 += H;
                    break;
                case 35:
                    B = v2.B((List) unsafe.getObject(t2, j10));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i14);
                        l09 = com.google.android.gms.internal.cast.j1.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    }
                    break;
                case 36:
                    B = v2.z((List) unsafe.getObject(t2, j10));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i14);
                        l09 = com.google.android.gms.internal.cast.j1.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    }
                    break;
                case 37:
                    B = v2.G((List) unsafe.getObject(t2, j10));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i14);
                        l09 = com.google.android.gms.internal.cast.j1.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    }
                    break;
                case 38:
                    B = v2.R((List) unsafe.getObject(t2, j10));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i14);
                        l09 = com.google.android.gms.internal.cast.j1.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    }
                    break;
                case 39:
                    B = v2.E((List) unsafe.getObject(t2, j10));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i14);
                        l09 = com.google.android.gms.internal.cast.j1.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    }
                    break;
                case 40:
                    B = v2.B((List) unsafe.getObject(t2, j10));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i14);
                        l09 = com.google.android.gms.internal.cast.j1.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    }
                    break;
                case 41:
                    B = v2.z((List) unsafe.getObject(t2, j10));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i14);
                        l09 = com.google.android.gms.internal.cast.j1.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    }
                    break;
                case 42:
                    Class<?> cls = v2.f15360a;
                    B = ((List) unsafe.getObject(t2, j10)).size();
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i14);
                        l09 = com.google.android.gms.internal.cast.j1.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    }
                    break;
                case 43:
                    B = v2.P((List) unsafe.getObject(t2, j10));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i14);
                        l09 = com.google.android.gms.internal.cast.j1.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    }
                    break;
                case 44:
                    B = v2.x((List) unsafe.getObject(t2, j10));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i14);
                        l09 = com.google.android.gms.internal.cast.j1.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    }
                    break;
                case 45:
                    B = v2.z((List) unsafe.getObject(t2, j10));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i14);
                        l09 = com.google.android.gms.internal.cast.j1.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    }
                    break;
                case 46:
                    B = v2.B((List) unsafe.getObject(t2, j10));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i14);
                        l09 = com.google.android.gms.internal.cast.j1.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    }
                    break;
                case 47:
                    B = v2.K((List) unsafe.getObject(t2, j10));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i14);
                        l09 = com.google.android.gms.internal.cast.j1.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    }
                    break;
                case 48:
                    B = v2.M((List) unsafe.getObject(t2, j10));
                    if (B > 0) {
                        H0 = com.google.android.gms.internal.cast.j1.H0(i14);
                        l09 = com.google.android.gms.internal.cast.j1.l0(B);
                        i10 = l09 + H0 + B;
                        i11 += i10;
                    }
                    break;
                case 49:
                    H = v2.C(i14, (List) o3.j(t2, j10), x(i12));
                    i11 += H;
                    break;
                case 50:
                    e2.a(i14, o3.j(t2, j10), y(i12));
                    continue;
                case 51:
                    if (j(t2, i14, i12)) {
                        l02 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        H = l02 + 8;
                        i11 += H;
                        break;
                    }
                    break;
                case 52:
                    if (j(t2, i14, i12)) {
                        l03 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        H = l03 + 4;
                        i11 += H;
                        break;
                    }
                    break;
                case 53:
                    if (j(t2, i14, i12)) {
                        long w10 = w(t2, j10);
                        l04 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        m02 = com.google.android.gms.internal.cast.j1.m0(w10);
                        H = m02 + l04;
                        i11 += H;
                        break;
                    }
                    break;
                case 54:
                    if (j(t2, i14, i12)) {
                        long w11 = w(t2, j10);
                        l04 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        m02 = com.google.android.gms.internal.cast.j1.m0(w11);
                        H = m02 + l04;
                        i11 += H;
                        break;
                    }
                    break;
                case 55:
                    if (j(t2, i14, i12)) {
                        int t8 = t(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.E0(t8);
                        H = E0 + l05;
                        i11 += H;
                        break;
                    }
                    break;
                case 56:
                    if (j(t2, i14, i12)) {
                        l02 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        H = l02 + 8;
                        i11 += H;
                        break;
                    }
                    break;
                case 57:
                    if (j(t2, i14, i12)) {
                        l03 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        H = l03 + 4;
                        i11 += H;
                        break;
                    }
                    break;
                case 58:
                    if (j(t2, i14, i12)) {
                        l06 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        H = l06 + 1;
                        i11 += H;
                        break;
                    }
                    break;
                case 59:
                    if (j(t2, i14, i12)) {
                        Object j12 = o3.j(t2, j10);
                        if (!(j12 instanceof zzoe)) {
                            l05 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                            E0 = com.google.android.gms.internal.cast.j1.G0((String) j12);
                            H = E0 + l05;
                            i11 += H;
                            break;
                        } else {
                            l07 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                            g10 = ((zzoe) j12).g();
                            l08 = com.google.android.gms.internal.cast.j1.l0(g10);
                            i10 = l08 + g10 + l07;
                            i11 += i10;
                        }
                    }
                    break;
                case 60:
                    if (j(t2, i14, i12)) {
                        H = v2.H(i14, o3.j(t2, j10), x(i12));
                        i11 += H;
                        break;
                    }
                    break;
                case 61:
                    if (j(t2, i14, i12)) {
                        l07 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        g10 = ((zzoe) o3.j(t2, j10)).g();
                        l08 = com.google.android.gms.internal.cast.j1.l0(g10);
                        i10 = l08 + g10 + l07;
                        i11 += i10;
                    }
                    break;
                case 62:
                    if (j(t2, i14, i12)) {
                        int t10 = t(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.l0(t10);
                        H = E0 + l05;
                        i11 += H;
                        break;
                    }
                    break;
                case 63:
                    if (j(t2, i14, i12)) {
                        int t11 = t(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.E0(t11);
                        H = E0 + l05;
                        i11 += H;
                        break;
                    }
                    break;
                case 64:
                    if (j(t2, i14, i12)) {
                        l03 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        H = l03 + 4;
                        i11 += H;
                        break;
                    }
                    break;
                case 65:
                    if (j(t2, i14, i12)) {
                        l02 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        H = l02 + 8;
                        i11 += H;
                        break;
                    }
                    break;
                case 66:
                    if (j(t2, i14, i12)) {
                        int t12 = t(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.l0((t12 >> 31) ^ (t12 + t12));
                        H = E0 + l05;
                        i11 += H;
                        break;
                    }
                    break;
                case 67:
                    if (j(t2, i14, i12)) {
                        long w12 = w(t2, j10);
                        l05 = com.google.android.gms.internal.cast.j1.l0(i14 << 3);
                        E0 = com.google.android.gms.internal.cast.j1.m0((w12 >> 63) ^ (w12 + w12));
                        H = E0 + l05;
                        i11 += H;
                        break;
                    }
                    break;
                case 68:
                    if (j(t2, i14, i12)) {
                        H = com.google.android.gms.internal.cast.j1.D0(i14, (j2) o3.j(t2, j10), x(i12));
                        i11 += H;
                        break;
                    }
                    break;
                default:
            }
        }
        f3<?, ?> f3Var = this.f15297j;
        return f3Var.a(f3Var.c(t2)) + i11;
    }

    public final int u(int i10) {
        return this.f15289a[i10 + 2];
    }

    public final int v(int i10) {
        return this.f15289a[i10 + 1];
    }

    public final t2 x(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f15290b;
        t2 t2Var = (t2) objArr[i12];
        if (t2Var != null) {
            return t2Var;
        }
        t2<T> a10 = q2.f15328c.a((Class) objArr[i12 + 1]);
        this.f15290b[i12] = a10;
        return a10;
    }

    public final Object y(int i10) {
        int i11 = i10 / 3;
        return this.f15290b[i11 + i11];
    }
}
