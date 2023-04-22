package w9;

import com.appsflyer.oaid.BuildConfig;

/* loaded from: classes2.dex */
public final class v2 extends u5 implements t6 {
    private static final v2 zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;

    static {
        v2 v2Var = new v2();
        zza = v2Var;
        u5.k(v2.class, v2Var);
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
                    return new u2(0);
                }
                return new v2();
            }
            return new b7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final String t() {
        return this.zzf;
    }

    public final String u() {
        return this.zzg;
    }
}
