package com.google.android.gms.internal.cast;

import com.appsflyer.oaid.BuildConfig;
import t9.k2;
import t9.s2;

/* loaded from: classes.dex */
public final class j0 extends l1<j0, t9.q0> implements k2 {
    private static final j0 zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;
    private int zzj;
    private int zzk;
    private String zzi = BuildConfig.FLAVOR;
    private String zzl = BuildConfig.FLAVOR;

    static {
        j0 j0Var = new j0();
        zzb = j0Var;
        l1.c(j0.class, j0Var);
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
                    return new t9.q0(4);
                }
                return new j0();
            }
            return new s2(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
