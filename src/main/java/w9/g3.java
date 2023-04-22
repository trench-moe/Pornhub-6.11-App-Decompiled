package w9;

import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g3 extends u5 implements t6 {
    private static final g3 zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private long zzg;

    static {
        g3 g3Var = new g3();
        zza = g3Var;
        u5.k(g3.class, g3Var);
    }

    public static f3 s() {
        return (f3) zza.m();
    }

    public static /* synthetic */ void u(g3 g3Var, String str) {
        Objects.requireNonNull(str);
        g3Var.zze |= 1;
        g3Var.zzf = str;
    }

    public static /* synthetic */ void v(g3 g3Var, long j10) {
        g3Var.zze |= 2;
        g3Var.zzg = j10;
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
                    return new f3(null);
                }
                return new g3();
            }
            return new b7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
