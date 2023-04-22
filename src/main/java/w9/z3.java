package w9;

import java.util.List;

/* loaded from: classes2.dex */
public final class z3 extends u5 implements t6 {
    private static final z3 zza;
    private int zze;
    private a6 zzf = a7.f17067m;
    private x3 zzg;

    static {
        z3 z3Var = new z3();
        zza = z3Var;
        u5.k(z3.class, z3Var);
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
                    return new x2(1);
                }
                return new z3();
            }
            return new b7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", b4.class, "zzg"});
        }
        return (byte) 1;
    }

    public final x3 s() {
        x3 x3Var = this.zzg;
        if (x3Var == null) {
            x3Var = x3.u();
        }
        return x3Var;
    }

    public final List u() {
        return this.zzf;
    }
}
