package com.google.android.gms.internal.cast;

import com.appsflyer.oaid.BuildConfig;
import t9.k2;
import t9.p1;
import t9.q1;
import t9.s2;

/* loaded from: classes.dex */
public final class u extends l1<u, t9.e0> implements k2 {
    private static final q1<Integer, Object> zzb = new a0.b();
    private static final u zze;
    private int zzf;
    private boolean zzh;
    private v0 zzi;
    private boolean zzj;
    private String zzg = BuildConfig.FLAVOR;
    private p1 zzk = t9.l1.f15284m;

    static {
        u uVar = new u();
        zze = uVar;
        l1.c(u.class, uVar);
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
                        return zze;
                    }
                    return new t9.e0(3);
                }
                return new u();
            }
            return new s2(zze, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005,", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", x.c.f17617t});
        }
        return (byte) 1;
    }
}
