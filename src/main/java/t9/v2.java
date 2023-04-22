package t9;

import com.google.android.gms.internal.cast.zzoe;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class v2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f15360a;

    /* renamed from: b  reason: collision with root package name */
    public static final f3<?, ?> f15361b;

    /* renamed from: c  reason: collision with root package name */
    public static final f3<?, ?> f15362c;
    public static final f3<?, ?> d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f15360a = cls;
        f15361b = t(false);
        f15362c = t(true);
        d = new h3();
    }

    public static int A(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.cast.j1.l0(i10 << 3) + 8) * size;
    }

    public static int B(List<?> list) {
        return list.size() * 8;
    }

    public static int C(int i10, List<j2> list, t2 t2Var) {
        int size = list.size();
        if (size != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += com.google.android.gms.internal.cast.j1.D0(i10, list.get(i12), t2Var);
            }
            return i11;
        }
        return 0;
    }

    public static int D(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.cast.j1.H0(i10) * size) + E(list);
    }

    public static int E(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l1) {
            l1 l1Var = (l1) list;
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.cast.j1.E0(l1Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.cast.j1.E0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int F(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.cast.j1.H0(i10) * list.size()) + G(list);
    }

    public static int G(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z1) {
            z1 z1Var = (z1) list;
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.cast.j1.m0(z1Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.cast.j1.m0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int H(int i10, Object obj, t2 t2Var) {
        if (!(obj instanceof com.google.android.gms.internal.cast.m1)) {
            return com.google.android.gms.internal.cast.j1.F0((j2) obj, t2Var) + com.google.android.gms.internal.cast.j1.l0(i10 << 3);
        }
        int l02 = com.google.android.gms.internal.cast.j1.l0(i10 << 3);
        int a10 = ((com.google.android.gms.internal.cast.m1) obj).a();
        return com.google.android.gms.internal.cast.j1.l0(a10) + a10 + l02;
    }

    public static int I(int i10, List<?> list, t2 t2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int H0 = com.google.android.gms.internal.cast.j1.H0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof com.google.android.gms.internal.cast.m1) {
                int a10 = ((com.google.android.gms.internal.cast.m1) obj).a();
                H0 += com.google.android.gms.internal.cast.j1.l0(a10) + a10;
            } else {
                H0 = com.google.android.gms.internal.cast.j1.F0((j2) obj, t2Var) + H0;
            }
        }
        return H0;
    }

    public static int J(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.cast.j1.H0(i10) * size) + K(list);
    }

    public static int K(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l1) {
            l1 l1Var = (l1) list;
            i10 = 0;
            while (i11 < size) {
                int e10 = l1Var.e(i11);
                i10 += com.google.android.gms.internal.cast.j1.l0((e10 >> 31) ^ (e10 + e10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i10 += com.google.android.gms.internal.cast.j1.l0((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int L(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.cast.j1.H0(i10) * size) + M(list);
    }

    public static int M(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z1) {
            z1 z1Var = (z1) list;
            i10 = 0;
            while (i11 < size) {
                long e10 = z1Var.e(i11);
                i10 += com.google.android.gms.internal.cast.j1.m0((e10 >> 63) ^ (e10 + e10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i10 += com.google.android.gms.internal.cast.j1.m0((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int N(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int H0 = com.google.android.gms.internal.cast.j1.H0(i10) * size;
        if (list instanceof v1) {
            v1 v1Var = (v1) list;
            while (i11 < size) {
                Object k10 = v1Var.k(i11);
                H0 = (k10 instanceof zzoe ? com.google.android.gms.internal.cast.j1.C0((zzoe) k10) : com.google.android.gms.internal.cast.j1.G0((String) k10)) + H0;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                H0 = (obj instanceof zzoe ? com.google.android.gms.internal.cast.j1.C0((zzoe) obj) : com.google.android.gms.internal.cast.j1.G0((String) obj)) + H0;
                i11++;
            }
        }
        return H0;
    }

    public static int O(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.cast.j1.H0(i10) * size) + P(list);
    }

    public static int P(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l1) {
            l1 l1Var = (l1) list;
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.cast.j1.l0(l1Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.cast.j1.l0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int Q(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.cast.j1.H0(i10) * size) + R(list);
    }

    public static int R(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z1) {
            z1 z1Var = (z1) list;
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.cast.j1.m0(z1Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.cast.j1.m0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static void b(int i10, List<Boolean> list, com.google.android.gms.internal.cast.k1 k1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(k1Var);
            int i11 = 0;
            if (z10) {
                k1Var.f6904a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).booleanValue();
                    i12++;
                }
                k1Var.f6904a.z0(i12);
                while (i11 < list.size()) {
                    k1Var.f6904a.n0(list.get(i11).booleanValue() ? (byte) 1 : (byte) 0);
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    k1Var.f6904a.o0(i10, list.get(i11).booleanValue());
                    i11++;
                }
            }
        }
    }

    public static void c(int i10, List<zzoe> list, com.google.android.gms.internal.cast.k1 k1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(k1Var);
        for (int i11 = 0; i11 < list.size(); i11++) {
            k1Var.f6904a.p0(i10, list.get(i11));
        }
    }

    public static void d(int i10, List<Double> list, com.google.android.gms.internal.cast.k1 k1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(k1Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                k1Var.f6904a.s0(i10, Double.doubleToRawLongBits(list.get(i11).doubleValue()));
                i11++;
            }
            return;
        }
        k1Var.f6904a.x0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).doubleValue();
            i12 += 8;
        }
        k1Var.f6904a.z0(i12);
        while (i11 < list.size()) {
            k1Var.f6904a.t0(Double.doubleToRawLongBits(list.get(i11).doubleValue()));
            i11++;
        }
    }

    public static void e(int i10, List<Integer> list, com.google.android.gms.internal.cast.k1 k1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(k1Var);
            int i11 = 0;
            if (z10) {
                k1Var.f6904a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += com.google.android.gms.internal.cast.j1.E0(list.get(i13).intValue());
                }
                k1Var.f6904a.z0(i12);
                while (i11 < list.size()) {
                    k1Var.f6904a.v0(list.get(i11).intValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    k1Var.f6904a.u0(i10, list.get(i11).intValue());
                    i11++;
                }
            }
        }
    }

    public static void f(int i10, List<Integer> list, com.google.android.gms.internal.cast.k1 k1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(k1Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                k1Var.f6904a.q0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        k1Var.f6904a.x0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).intValue();
            i12 += 4;
        }
        k1Var.f6904a.z0(i12);
        while (i11 < list.size()) {
            k1Var.f6904a.r0(list.get(i11).intValue());
            i11++;
        }
    }

    public static void g(int i10, List<Long> list, com.google.android.gms.internal.cast.k1 k1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(k1Var);
            int i11 = 0;
            if (z10) {
                k1Var.f6904a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).longValue();
                    i12 += 8;
                }
                k1Var.f6904a.z0(i12);
                while (i11 < list.size()) {
                    k1Var.f6904a.t0(list.get(i11).longValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    k1Var.f6904a.s0(i10, list.get(i11).longValue());
                    i11++;
                }
            }
        }
    }

    public static void h(int i10, List<Float> list, com.google.android.gms.internal.cast.k1 k1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(k1Var);
            int i11 = 0;
            if (z10) {
                k1Var.f6904a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).floatValue();
                    i12 += 4;
                }
                k1Var.f6904a.z0(i12);
                while (i11 < list.size()) {
                    k1Var.f6904a.r0(Float.floatToRawIntBits(list.get(i11).floatValue()));
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    k1Var.f6904a.q0(i10, Float.floatToRawIntBits(list.get(i11).floatValue()));
                    i11++;
                }
            }
        }
    }

    public static void i(int i10, List<?> list, com.google.android.gms.internal.cast.k1 k1Var, t2 t2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            k1Var.d(i10, list.get(i11), t2Var);
        }
    }

    public static void j(int i10, List<Integer> list, com.google.android.gms.internal.cast.k1 k1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(k1Var);
            int i11 = 0;
            if (z10) {
                k1Var.f6904a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += com.google.android.gms.internal.cast.j1.E0(list.get(i13).intValue());
                }
                k1Var.f6904a.z0(i12);
                while (i11 < list.size()) {
                    k1Var.f6904a.v0(list.get(i11).intValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    k1Var.f6904a.u0(i10, list.get(i11).intValue());
                    i11++;
                }
            }
        }
    }

    public static void k(int i10, List<Long> list, com.google.android.gms.internal.cast.k1 k1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(k1Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                k1Var.f6904a.A0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        k1Var.f6904a.x0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += com.google.android.gms.internal.cast.j1.m0(list.get(i13).longValue());
        }
        k1Var.f6904a.z0(i12);
        while (i11 < list.size()) {
            k1Var.f6904a.B0(list.get(i11).longValue());
            i11++;
        }
    }

    public static void l(int i10, List<?> list, com.google.android.gms.internal.cast.k1 k1Var, t2 t2Var) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                k1Var.e(i10, list.get(i11), t2Var);
            }
        }
    }

    public static void m(int i10, List<Integer> list, com.google.android.gms.internal.cast.k1 k1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(k1Var);
            int i11 = 0;
            if (z10) {
                k1Var.f6904a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).intValue();
                    i12 += 4;
                }
                k1Var.f6904a.z0(i12);
                while (i11 < list.size()) {
                    k1Var.f6904a.r0(list.get(i11).intValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    k1Var.f6904a.q0(i10, list.get(i11).intValue());
                    i11++;
                }
            }
        }
    }

    public static void n(int i10, List<Long> list, com.google.android.gms.internal.cast.k1 k1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(k1Var);
            int i11 = 0;
            if (z10) {
                k1Var.f6904a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).longValue();
                    i12 += 8;
                }
                k1Var.f6904a.z0(i12);
                while (i11 < list.size()) {
                    k1Var.f6904a.t0(list.get(i11).longValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    k1Var.f6904a.s0(i10, list.get(i11).longValue());
                    i11++;
                }
            }
        }
    }

    public static void o(int i10, List<Integer> list, com.google.android.gms.internal.cast.k1 k1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(k1Var);
            int i11 = 0;
            if (z10) {
                k1Var.f6904a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = list.get(i13).intValue();
                    i12 += com.google.android.gms.internal.cast.j1.l0((intValue >> 31) ^ (intValue + intValue));
                }
                k1Var.f6904a.z0(i12);
                while (i11 < list.size()) {
                    com.google.android.gms.internal.cast.j1 j1Var = k1Var.f6904a;
                    int intValue2 = list.get(i11).intValue();
                    j1Var.z0((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    com.google.android.gms.internal.cast.j1 j1Var2 = k1Var.f6904a;
                    int intValue3 = list.get(i11).intValue();
                    j1Var2.y0(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
                    i11++;
                }
            }
        }
    }

    public static void p(int i10, List<Long> list, com.google.android.gms.internal.cast.k1 k1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(k1Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                com.google.android.gms.internal.cast.j1 j1Var = k1Var.f6904a;
                long longValue = list.get(i11).longValue();
                j1Var.A0(i10, (longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
            return;
        }
        k1Var.f6904a.x0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = list.get(i13).longValue();
            i12 += com.google.android.gms.internal.cast.j1.m0((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        k1Var.f6904a.z0(i12);
        while (i11 < list.size()) {
            com.google.android.gms.internal.cast.j1 j1Var2 = k1Var.f6904a;
            long longValue3 = list.get(i11).longValue();
            j1Var2.B0((longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    public static void q(int i10, List<String> list, com.google.android.gms.internal.cast.k1 k1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(k1Var);
        int i11 = 0;
        if (!(list instanceof v1)) {
            while (i11 < list.size()) {
                k1Var.f6904a.w0(i10, list.get(i11));
                i11++;
            }
            return;
        }
        v1 v1Var = (v1) list;
        while (i11 < list.size()) {
            Object k10 = v1Var.k(i11);
            if (k10 instanceof String) {
                k1Var.f6904a.w0(i10, (String) k10);
            } else {
                k1Var.f6904a.p0(i10, (zzoe) k10);
            }
            i11++;
        }
    }

    public static void r(int i10, List<Integer> list, com.google.android.gms.internal.cast.k1 k1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(k1Var);
            int i11 = 0;
            if (z10) {
                k1Var.f6904a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += com.google.android.gms.internal.cast.j1.l0(list.get(i13).intValue());
                }
                k1Var.f6904a.z0(i12);
                while (i11 < list.size()) {
                    k1Var.f6904a.z0(list.get(i11).intValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    k1Var.f6904a.y0(i10, list.get(i11).intValue());
                    i11++;
                }
            }
        }
    }

    public static void s(int i10, List<Long> list, com.google.android.gms.internal.cast.k1 k1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(k1Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                k1Var.f6904a.A0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        k1Var.f6904a.x0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += com.google.android.gms.internal.cast.j1.m0(list.get(i13).longValue());
        }
        k1Var.f6904a.z0(i12);
        while (i11 < list.size()) {
            k1Var.f6904a.B0(list.get(i11).longValue());
            i11++;
        }
    }

    public static f3<?, ?> t(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (f3) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int u(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.cast.j1.l0(i10 << 3) + 1) * size;
    }

    public static int v(int i10, List<zzoe> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int H0 = com.google.android.gms.internal.cast.j1.H0(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            H0 += com.google.android.gms.internal.cast.j1.C0(list.get(i11));
        }
        return H0;
    }

    public static int w(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.cast.j1.H0(i10) * size) + x(list);
    }

    public static int x(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l1) {
            l1 l1Var = (l1) list;
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.cast.j1.E0(l1Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.cast.j1.E0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int y(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.cast.j1.l0(i10 << 3) + 4) * size;
    }

    public static int z(List<?> list) {
        return list.size() * 4;
    }
}
