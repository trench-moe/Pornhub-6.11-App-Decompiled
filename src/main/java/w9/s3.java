package w9;

import java.util.List;

/* loaded from: classes2.dex */
public final class s3 extends u5 implements t6 {
    private static final s3 zza;
    private z5 zze;
    private z5 zzf;
    private a6 zzg;
    private a6 zzh;

    static {
        s3 s3Var = new s3();
        zza = s3Var;
        u5.k(s3.class, s3Var);
    }

    public s3() {
        h6 h6Var = h6.f17182m;
        this.zze = h6Var;
        this.zzf = h6Var;
        a7 a7Var = a7.f17067m;
        this.zzg = a7Var;
        this.zzh = a7Var;
    }

    public static void F(s3 s3Var, Iterable iterable) {
        z5 z5Var = s3Var.zze;
        if (!((z4) z5Var).f17389c) {
            s3Var.zze = u5.p(z5Var);
        }
        com.google.android.gms.internal.measurement.c.g(iterable, s3Var.zze);
    }

    public static void G(s3 s3Var) {
        s3Var.zze = h6.f17182m;
    }

    public static void H(s3 s3Var, Iterable iterable) {
        z5 z5Var = s3Var.zzf;
        if (!((z4) z5Var).f17389c) {
            s3Var.zzf = u5.p(z5Var);
        }
        com.google.android.gms.internal.measurement.c.g(iterable, s3Var.zzf);
    }

    public static void I(s3 s3Var) {
        s3Var.zzf = h6.f17182m;
    }

    public static void J(s3 s3Var, Iterable iterable) {
        a6 a6Var = s3Var.zzg;
        if (!a6Var.a()) {
            s3Var.zzg = u5.q(a6Var);
        }
        com.google.android.gms.internal.measurement.c.g(iterable, s3Var.zzg);
    }

    public static void K(s3 s3Var, int i10) {
        a6 a6Var = s3Var.zzg;
        if (!a6Var.a()) {
            s3Var.zzg = u5.q(a6Var);
        }
        s3Var.zzg.remove(i10);
    }

    public static void L(s3 s3Var, Iterable iterable) {
        a6 a6Var = s3Var.zzh;
        if (!a6Var.a()) {
            s3Var.zzh = u5.q(a6Var);
        }
        com.google.android.gms.internal.measurement.c.g(iterable, s3Var.zzh);
    }

    public static void M(s3 s3Var, int i10) {
        a6 a6Var = s3Var.zzh;
        if (!a6Var.a()) {
            s3Var.zzh = u5.q(a6Var);
        }
        s3Var.zzh.remove(i10);
    }

    public static r3 x() {
        return (r3) zza.m();
    }

    public static s3 z() {
        return zza;
    }

    public final u3 A(int i10) {
        return (u3) this.zzh.get(i10);
    }

    public final List B() {
        return this.zzg;
    }

    public final List C() {
        return this.zzf;
    }

    public final List D() {
        return this.zzh;
    }

    public final List E() {
        return this.zze;
    }

    @Override // w9.u5
    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new r3(null);
                }
                return new s3();
            }
            return new b7(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", c3.class, "zzh", u3.class});
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzg.size();
    }

    public final int t() {
        return ((h6) this.zzf).size();
    }

    public final int u() {
        return this.zzh.size();
    }

    public final int v() {
        return ((h6) this.zze).size();
    }

    public final c3 w(int i10) {
        return (c3) this.zzg.get(i10);
    }
}
