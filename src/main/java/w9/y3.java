package w9;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;

/* loaded from: classes2.dex */
public final class y3 extends u5 implements t6 {
    private static final y3 zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private a6 zzg = a7.f17067m;

    static {
        y3 y3Var = new y3();
        zza = y3Var;
        u5.k(y3.class, y3Var);
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
                    return new h2(1);
                }
                return new y3();
            }
            return new b7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", b4.class});
        }
        return (byte) 1;
    }

    public final String t() {
        return this.zzf;
    }

    public final List u() {
        return this.zzg;
    }
}
