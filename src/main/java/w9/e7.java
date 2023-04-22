package w9;

import com.google.android.gms.internal.measurement.zzix;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e7 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f17123a;

    /* renamed from: b  reason: collision with root package name */
    public static final o7 f17124b;

    /* renamed from: c  reason: collision with root package name */
    public static final o7 f17125c;
    public static final o7 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f17123a = cls;
        f17124b = u(false);
        f17125c = u(true);
        d = new q7();
    }

    public static int A(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.measurement.e.l0(i10 << 3) + 8) * size;
    }

    public static int B(List list) {
        return list.size() * 8;
    }

    public static int C(int i10, List list, c7 c7Var) {
        int size = list.size();
        if (size != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += com.google.android.gms.internal.measurement.e.D0(i10, (s6) list.get(i12), c7Var);
            }
            return i11;
        }
        return 0;
    }

    public static int D(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.measurement.e.H0(i10) * size) + E(list);
    }

    public static int E(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v5) {
            v5 v5Var = (v5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.measurement.e.E0(v5Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.measurement.e.E0(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int F(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.measurement.e.H0(i10) * list.size()) + G(list);
    }

    public static int G(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h6) {
            h6 h6Var = (h6) list;
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.measurement.e.m0(h6Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.measurement.e.m0(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int H(int i10, Object obj, c7 c7Var) {
        if (!(obj instanceof com.google.android.gms.internal.measurement.f)) {
            return com.google.android.gms.internal.measurement.e.F0((s6) obj, c7Var) + com.google.android.gms.internal.measurement.e.l0(i10 << 3);
        }
        int l02 = com.google.android.gms.internal.measurement.e.l0(i10 << 3);
        int a10 = ((com.google.android.gms.internal.measurement.f) obj).a();
        return com.google.android.gms.internal.measurement.e.l0(a10) + a10 + l02;
    }

    public static int I(int i10, List list, c7 c7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int H0 = com.google.android.gms.internal.measurement.e.H0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof com.google.android.gms.internal.measurement.f) {
                int a10 = ((com.google.android.gms.internal.measurement.f) obj).a();
                H0 += com.google.android.gms.internal.measurement.e.l0(a10) + a10;
            } else {
                H0 = com.google.android.gms.internal.measurement.e.F0((s6) obj, c7Var) + H0;
            }
        }
        return H0;
    }

    public static int J(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.measurement.e.H0(i10) * size) + K(list);
    }

    public static int K(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v5) {
            v5 v5Var = (v5) list;
            i10 = 0;
            while (i11 < size) {
                int e10 = v5Var.e(i11);
                i10 += com.google.android.gms.internal.measurement.e.l0((e10 >> 31) ^ (e10 + e10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += com.google.android.gms.internal.measurement.e.l0((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int L(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.measurement.e.H0(i10) * size) + M(list);
    }

    public static int M(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h6) {
            h6 h6Var = (h6) list;
            i10 = 0;
            while (i11 < size) {
                long e10 = h6Var.e(i11);
                i10 += com.google.android.gms.internal.measurement.e.m0((e10 >> 63) ^ (e10 + e10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += com.google.android.gms.internal.measurement.e.m0((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int N(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int H0 = com.google.android.gms.internal.measurement.e.H0(i10) * size;
        if (list instanceof d6) {
            d6 d6Var = (d6) list;
            while (i11 < size) {
                Object F = d6Var.F(i11);
                H0 = (F instanceof zzix ? com.google.android.gms.internal.measurement.e.C0((zzix) F) : com.google.android.gms.internal.measurement.e.G0((String) F)) + H0;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                H0 = (obj instanceof zzix ? com.google.android.gms.internal.measurement.e.C0((zzix) obj) : com.google.android.gms.internal.measurement.e.G0((String) obj)) + H0;
                i11++;
            }
        }
        return H0;
    }

    public static int O(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.measurement.e.H0(i10) * size) + P(list);
    }

    public static int P(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v5) {
            v5 v5Var = (v5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.measurement.e.l0(v5Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.measurement.e.l0(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int Q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.measurement.e.H0(i10) * size) + R(list);
    }

    public static int R(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h6) {
            h6 h6Var = (h6) list;
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.measurement.e.m0(h6Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.measurement.e.m0(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void b(int i10, List list, f5 f5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(f5Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                f5Var.f17135a.o0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        f5Var.f17135a.x0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            i12++;
        }
        f5Var.f17135a.z0(i12);
        while (i11 < list.size()) {
            f5Var.f17135a.n0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void c(int i10, List list, f5 f5Var) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(f5Var);
            for (int i11 = 0; i11 < list.size(); i11++) {
                f5Var.f17135a.p0(i10, (zzix) list.get(i11));
            }
        }
    }

    public static void d(int i10, List list, f5 f5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(f5Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                f5Var.f17135a.s0(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        f5Var.f17135a.x0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            i12 += 8;
        }
        f5Var.f17135a.z0(i12);
        while (i11 < list.size()) {
            f5Var.f17135a.t0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void e(int i10, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(f5Var);
            int i11 = 0;
            if (z10) {
                f5Var.f17135a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += com.google.android.gms.internal.measurement.e.E0(((Integer) list.get(i13)).intValue());
                }
                f5Var.f17135a.z0(i12);
                while (i11 < list.size()) {
                    f5Var.f17135a.v0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    f5Var.f17135a.u0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
            }
        }
    }

    public static void f(int i10, List list, f5 f5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(f5Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                f5Var.f17135a.q0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        f5Var.f17135a.x0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        f5Var.f17135a.z0(i12);
        while (i11 < list.size()) {
            f5Var.f17135a.r0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void g(int i10, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(f5Var);
            int i11 = 0;
            if (z10) {
                f5Var.f17135a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    i12 += 8;
                }
                f5Var.f17135a.z0(i12);
                while (i11 < list.size()) {
                    f5Var.f17135a.t0(((Long) list.get(i11)).longValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    f5Var.f17135a.s0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
            }
        }
    }

    public static void h(int i10, List list, f5 f5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(f5Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                f5Var.f17135a.q0(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        f5Var.f17135a.x0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).floatValue();
            i12 += 4;
        }
        f5Var.f17135a.z0(i12);
        while (i11 < list.size()) {
            f5Var.f17135a.r0(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void i(int i10, List list, f5 f5Var, c7 c7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            f5Var.e(i10, list.get(i11), c7Var);
        }
    }

    public static void j(int i10, List list, f5 f5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(f5Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                f5Var.f17135a.u0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        f5Var.f17135a.x0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += com.google.android.gms.internal.measurement.e.E0(((Integer) list.get(i13)).intValue());
        }
        f5Var.f17135a.z0(i12);
        while (i11 < list.size()) {
            f5Var.f17135a.v0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void k(int i10, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(f5Var);
            int i11 = 0;
            if (z10) {
                f5Var.f17135a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += com.google.android.gms.internal.measurement.e.m0(((Long) list.get(i13)).longValue());
                }
                f5Var.f17135a.z0(i12);
                while (i11 < list.size()) {
                    f5Var.f17135a.B0(((Long) list.get(i11)).longValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    f5Var.f17135a.A0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
            }
        }
    }

    public static void l(int i10, List list, f5 f5Var, c7 c7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            f5Var.f(i10, list.get(i11), c7Var);
        }
    }

    public static void m(int i10, List list, f5 f5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(f5Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                f5Var.f17135a.q0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        f5Var.f17135a.x0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        f5Var.f17135a.z0(i12);
        while (i11 < list.size()) {
            f5Var.f17135a.r0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void n(int i10, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(f5Var);
            int i11 = 0;
            if (z10) {
                f5Var.f17135a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    i12 += 8;
                }
                f5Var.f17135a.z0(i12);
                while (i11 < list.size()) {
                    f5Var.f17135a.t0(((Long) list.get(i11)).longValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    f5Var.f17135a.s0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
            }
        }
    }

    public static void o(int i10, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(f5Var);
            int i11 = 0;
            if (z10) {
                f5Var.f17135a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += com.google.android.gms.internal.measurement.e.l0((intValue >> 31) ^ (intValue + intValue));
                }
                f5Var.f17135a.z0(i12);
                while (i11 < list.size()) {
                    com.google.android.gms.internal.measurement.e eVar = f5Var.f17135a;
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    eVar.z0((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    com.google.android.gms.internal.measurement.e eVar2 = f5Var.f17135a;
                    int intValue3 = ((Integer) list.get(i11)).intValue();
                    eVar2.y0(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
                    i11++;
                }
            }
        }
    }

    public static void p(int i10, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(f5Var);
            int i11 = 0;
            if (z10) {
                f5Var.f17135a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = ((Long) list.get(i13)).longValue();
                    i12 += com.google.android.gms.internal.measurement.e.m0((longValue >> 63) ^ (longValue + longValue));
                }
                f5Var.f17135a.z0(i12);
                while (i11 < list.size()) {
                    com.google.android.gms.internal.measurement.e eVar = f5Var.f17135a;
                    long longValue2 = ((Long) list.get(i11)).longValue();
                    eVar.B0((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    com.google.android.gms.internal.measurement.e eVar2 = f5Var.f17135a;
                    long longValue3 = ((Long) list.get(i11)).longValue();
                    eVar2.A0(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
                    i11++;
                }
            }
        }
    }

    public static void q(int i10, List list, f5 f5Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(f5Var);
        int i11 = 0;
        if (!(list instanceof d6)) {
            while (i11 < list.size()) {
                f5Var.f17135a.w0(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        d6 d6Var = (d6) list;
        while (i11 < list.size()) {
            Object F = d6Var.F(i11);
            if (F instanceof String) {
                f5Var.f17135a.w0(i10, (String) F);
            } else {
                f5Var.f17135a.p0(i10, (zzix) F);
            }
            i11++;
        }
    }

    public static void r(int i10, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(f5Var);
            int i11 = 0;
            if (z10) {
                f5Var.f17135a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += com.google.android.gms.internal.measurement.e.l0(((Integer) list.get(i13)).intValue());
                }
                f5Var.f17135a.z0(i12);
                while (i11 < list.size()) {
                    f5Var.f17135a.z0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    f5Var.f17135a.y0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
            }
        }
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.measurement.e.l0(i10 << 3) + 1) * size;
    }

    public static void t(int i10, List list, f5 f5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(f5Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                f5Var.f17135a.A0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        f5Var.f17135a.x0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += com.google.android.gms.internal.measurement.e.m0(((Long) list.get(i13)).longValue());
        }
        f5Var.f17135a.z0(i12);
        while (i11 < list.size()) {
            f5Var.f17135a.B0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static o7 u(boolean z10) {
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
            return (o7) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int H0 = com.google.android.gms.internal.measurement.e.H0(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            H0 += com.google.android.gms.internal.measurement.e.C0((zzix) list.get(i11));
        }
        return H0;
    }

    public static int w(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.measurement.e.H0(i10) * size) + x(list);
    }

    public static int x(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v5) {
            v5 v5Var = (v5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.measurement.e.E0(v5Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += com.google.android.gms.internal.measurement.e.E0(((Integer) list.get(i11)).intValue());
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
        return (com.google.android.gms.internal.measurement.e.l0(i10 << 3) + 4) * size;
    }

    public static int z(List list) {
        return list.size() * 4;
    }
}
