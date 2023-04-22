package com.google.android.gms.internal.cast;

import com.appsflyer.oaid.BuildConfig;
import t9.k2;
import t9.r2;
import t9.s1;
import t9.s2;

/* loaded from: classes.dex */
public final class g extends l1<g, t9.f0> implements k2 {
    private static final g zzb;
    private int zze;
    private int zzf;
    private boolean zzg;
    private int zzh;
    private boolean zzi;
    private s1<i0> zzj;
    private s1<i0> zzk;
    private String zzl;

    static {
        g gVar = new g();
        zzb = gVar;
        l1.c(g.class, gVar);
    }

    public g() {
        r2<Object> r2Var = r2.f15333m;
        this.zzj = r2Var;
        this.zzk = r2Var;
        this.zzl = BuildConfig.FLAVOR;
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
                    return new t9.f0(1);
                }
                return new g();
            }
            return new s2(zzb, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zze", "zzf", cb.e.E, "zzg", "zzh", a0.b.P, "zzi", "zzj", i0.class, "zzk", i0.class, "zzl"});
        }
        return (byte) 1;
    }
}
