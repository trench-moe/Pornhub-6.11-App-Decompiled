package w9;

import com.appsflyer.oaid.BuildConfig;

/* loaded from: classes2.dex */
public final class j2 extends u5 implements t6 {
    private static final j2 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;

    static {
        j2 j2Var = new j2();
        zza = j2Var;
        u5.k(j2.class, j2Var);
    }

    public static j2 t() {
        return zza;
    }

    public final boolean A() {
        return (this.zze & 2) != 0;
    }

    public final boolean B() {
        return (this.zze & 16) != 0;
    }

    public final boolean C() {
        return (this.zze & 8) != 0;
    }

    public final int D() {
        int j10 = t9.j0.j(this.zzf);
        if (j10 == 0) {
            j10 = 1;
        }
        return j10;
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
                    return new h2(0);
                }
                return new j2();
            }
            return new b7(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", i2.f17191a, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final String u() {
        return this.zzh;
    }

    public final String v() {
        return this.zzj;
    }

    public final String w() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }

    public final boolean z() {
        return (this.zze & 4) != 0;
    }
}
