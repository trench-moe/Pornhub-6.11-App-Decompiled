package com.google.android.gms.internal.cast;

import t9.k2;
import t9.s2;

/* loaded from: classes.dex */
public final class b0 extends l1<b0, t9.f0> implements k2 {
    private static final b0 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private byte zzi = 2;

    static {
        b0 b0Var = new b0();
        zzb = b0Var;
        l1.c(b0.class, b0Var);
    }

    @Override // com.google.android.gms.internal.cast.l1
    public final Object e(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            this.zzi = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new t9.f0(4);
                }
                return new b0();
            }
            return new s2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔌ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"zze", "zzf", a0.b.R, "zzg", "zzh", t9.k0.f15279c});
        }
        return Byte.valueOf(this.zzi);
    }
}
