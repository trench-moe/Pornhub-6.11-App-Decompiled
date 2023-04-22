package com.google.android.gms.internal.cast;

import com.appsflyer.oaid.BuildConfig;
import t9.k2;
import t9.p1;
import t9.q1;
import t9.s2;

/* loaded from: classes.dex */
public final class d extends l1<d, t9.l0> implements k2 {
    private static final q1<Integer, zzju> zzb = new o9.b(null);
    private static final d zze;
    private int zzf;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private p1 zzi = t9.l1.f15284m;

    static {
        d dVar = new d();
        zze = dVar;
        l1.c(d.class, dVar);
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
                    return new t9.l0(0);
                }
                return new d();
            }
            return new s2(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001e", new Object[]{"zzf", "zzg", "zzh", "zzi", m9.a.D0});
        }
        return (byte) 1;
    }
}
