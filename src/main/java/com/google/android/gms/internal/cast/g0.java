package com.google.android.gms.internal.cast;

import t9.k2;
import t9.s2;

/* loaded from: classes.dex */
public final class g0 extends l1<g0, t9.e0> implements k2 {
    private static final g0 zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;

    static {
        g0 g0Var = new g0();
        zzb = g0Var;
        l1.c(g0.class, g0Var);
    }

    @Override // com.google.android.gms.internal.cast.l1
    public final Object e(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                t9.o1 o1Var = r3.c.A;
                return new s2(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", o1Var, "zzk", o1Var, "zzl"});
            } else if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new t9.e0(5);
            } else {
                return new g0();
            }
        }
        return (byte) 1;
    }
}
