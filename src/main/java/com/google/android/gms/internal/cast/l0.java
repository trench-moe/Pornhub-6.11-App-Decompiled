package com.google.android.gms.internal.cast;

import t9.k2;
import t9.r2;
import t9.s1;
import t9.s2;

/* loaded from: classes.dex */
public final class l0 extends l1<l0, t9.s0> implements k2 {
    private static final l0 zzb;
    private int zze;
    private s1<s0> zzf;
    private s1<p> zzg;
    private q0 zzh;

    static {
        l0 l0Var = new l0();
        zzb = l0Var;
        l1.c(l0.class, l0Var);
    }

    public l0() {
        r2<Object> r2Var = r2.f15333m;
        this.zzf = r2Var;
        this.zzg = r2Var;
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
                    return new t9.s0(3);
                }
                return new l0();
            }
            return new s2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zze", "zzf", s0.class, "zzg", p.class, "zzh"});
        }
        return (byte) 1;
    }
}
