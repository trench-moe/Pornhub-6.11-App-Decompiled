package w9;

/* loaded from: classes2.dex */
public final class q3 extends u5 implements t6 {
    private static final q3 zza;
    private int zze;
    private int zzf = 1;
    private a6 zzg = a7.f17067m;

    static {
        q3 q3Var = new q3();
        zza = q3Var;
        u5.k(q3.class, q3Var);
    }

    public static o3 s() {
        return (o3) zza.m();
    }

    public static /* synthetic */ void u(q3 q3Var, g3 g3Var) {
        a6 a6Var = q3Var.zzg;
        if (!a6Var.a()) {
            q3Var.zzg = u5.q(a6Var);
        }
        q3Var.zzg.add(g3Var);
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
                    return new o3(null);
                }
                return new q3();
            }
            return new b7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", p3.f17272a, "zzg", g3.class});
        }
        return (byte) 1;
    }
}
