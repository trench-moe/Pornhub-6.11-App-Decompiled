package com.google.android.gms.internal.cast;

import com.appsflyer.oaid.BuildConfig;
import t9.k2;
import t9.s2;

/* loaded from: classes.dex */
public final class i0 extends l1<i0, t9.p0> implements k2 {
    private static final i0 zzb;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.FLAVOR;

    static {
        i0 i0Var = new i0();
        zzb = i0Var;
        l1.c(i0.class, i0Var);
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
                    return new t9.p0(4);
                }
                return new i0();
            }
            return new s2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
