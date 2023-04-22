package w9;

import com.appsflyer.oaid.BuildConfig;

/* loaded from: classes2.dex */
public final class g2 extends u5 implements t6 {
    private static final g2 zza;
    private int zze;
    private o2 zzf;
    private j2 zzg;
    private boolean zzh;
    private String zzi = BuildConfig.FLAVOR;

    static {
        g2 g2Var = new g2();
        zza = g2Var;
        u5.k(g2.class, g2Var);
    }

    public static g2 t() {
        return zza;
    }

    public static /* synthetic */ void x(g2 g2Var, String str) {
        g2Var.zze |= 8;
        g2Var.zzi = str;
    }

    public final boolean A() {
        return (this.zze & 2) != 0;
    }

    public final boolean B() {
        return (this.zze & 8) != 0;
    }

    public final boolean C() {
        return (this.zze & 1) != 0;
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
                    return new f2(null);
                }
                return new g2();
            }
            return new b7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final j2 u() {
        j2 j2Var = this.zzg;
        return j2Var == null ? j2.t() : j2Var;
    }

    public final o2 v() {
        o2 o2Var = this.zzf;
        if (o2Var == null) {
            o2Var = o2.u();
        }
        return o2Var;
    }

    public final String w() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzh;
    }

    public final boolean z() {
        return (this.zze & 4) != 0;
    }
}
