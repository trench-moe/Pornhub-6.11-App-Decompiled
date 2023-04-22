package com.google.android.gms.internal.cast;

import t9.k2;
import t9.r1;
import t9.s2;
import t9.z1;

/* loaded from: classes.dex */
public final class f0 extends l1<f0, t9.s0> implements k2 {
    private static final f0 zzb;
    private int zze;
    private long zzf;
    private r1 zzg;
    private r1 zzh;

    static {
        f0 f0Var = new f0();
        zzb = f0Var;
        l1.c(f0.class, f0Var);
    }

    public f0() {
        z1 z1Var = z1.f15376m;
        this.zzg = z1Var;
        this.zzh = z1Var;
    }

    @Override // com.google.android.gms.internal.cast.l1
    public final Object e(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new t9.s0(2);
                }
                return new f0();
            }
            return new s2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
