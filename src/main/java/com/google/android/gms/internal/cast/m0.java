package com.google.android.gms.internal.cast;

import t9.k2;
import t9.s2;

/* loaded from: classes.dex */
public final class m0 extends l1<m0, t9.e0> implements k2 {
    private static final m0 zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        m0 m0Var = new m0();
        zzb = m0Var;
        l1.c(m0.class, m0Var);
    }

    @Override // com.google.android.gms.internal.cast.l1
    public final Object e(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                t9.o1 o1Var = a0.b.T;
                return new s2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", o1Var, "zzg", o1Var});
            } else if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new t9.e0(6);
            } else {
                return new m0();
            }
        }
        return (byte) 1;
    }
}
