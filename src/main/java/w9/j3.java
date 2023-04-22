package w9;

import com.appsflyer.oaid.BuildConfig;

/* loaded from: classes2.dex */
public final class j3 extends u5 implements t6 {
    private static final j3 zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private y2 zzh;

    static {
        j3 j3Var = new j3();
        zza = j3Var;
        u5.k(j3.class, j3Var);
    }

    @Override // w9.u5
    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new m2(1);
                }
                return new j3();
            }
            return new b7(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
