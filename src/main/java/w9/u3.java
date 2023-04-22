package w9;

import java.util.List;

/* loaded from: classes2.dex */
public final class u3 extends u5 implements t6 {
    private static final u3 zza;
    private int zze;
    private int zzf;
    private z5 zzg = h6.f17182m;

    static {
        u3 u3Var = new u3();
        zza = u3Var;
        u5.k(u3.class, u3Var);
    }

    public static t3 v() {
        return (t3) zza.m();
    }

    public static /* synthetic */ void y(u3 u3Var, int i10) {
        u3Var.zze |= 1;
        u3Var.zzf = i10;
    }

    public static void z(u3 u3Var, Iterable iterable) {
        z5 z5Var = u3Var.zzg;
        if (!((z4) z5Var).f17389c) {
            u3Var.zzg = u5.p(z5Var);
        }
        com.google.android.gms.internal.measurement.c.g(iterable, u3Var.zzg);
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
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
                    return new t3(null);
                }
                return new u3();
            }
            return new b7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int s() {
        return ((h6) this.zzg).size();
    }

    public final int t() {
        return this.zzf;
    }

    public final long u(int i10) {
        h6 h6Var = (h6) this.zzg;
        h6Var.l(i10);
        return h6Var.f17183f[i10];
    }

    public final List x() {
        return this.zzg;
    }
}
