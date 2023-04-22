package com.google.android.gms.internal.cast;

import com.appsflyer.oaid.BuildConfig;
import t9.k2;
import t9.r2;
import t9.s1;
import t9.s2;

/* loaded from: classes.dex */
public final class o0 extends l1<o0, t9.p0> implements k2 {
    private static final o0 zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private s1<x> zzg;
    private s1<q> zzh;
    private boolean zzi;

    static {
        o0 o0Var = new o0();
        zzb = o0Var;
        l1.c(o0.class, o0Var);
    }

    public o0() {
        r2<Object> r2Var = r2.f15333m;
        this.zzg = r2Var;
        this.zzh = r2Var;
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
                    return new t9.p0(5);
                }
                return new o0();
            }
            return new s2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zze", "zzf", "zzg", x.class, "zzh", q.class, "zzi"});
        }
        return (byte) 1;
    }
}
