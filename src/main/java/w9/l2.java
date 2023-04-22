package w9;

import com.appsflyer.oaid.BuildConfig;

/* loaded from: classes2.dex */
public final class l2 extends u5 implements t6 {
    private static final l2 zza;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.FLAVOR;
    private g2 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        l2 l2Var = new l2();
        zza = l2Var;
        u5.k(l2.class, l2Var);
    }

    public static k2 u() {
        return (k2) zza.m();
    }

    public static /* synthetic */ void x(l2 l2Var, String str) {
        l2Var.zze |= 2;
        l2Var.zzg = str;
    }

    public final boolean A() {
        return this.zzk;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    public final boolean C() {
        return (this.zze & 32) != 0;
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
                    return new k2(null);
                }
                return new l2();
            }
            return new b7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzf;
    }

    public final g2 t() {
        g2 g2Var = this.zzh;
        return g2Var == null ? g2.t() : g2Var;
    }

    public final String w() {
        return this.zzg;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        return this.zzj;
    }
}
