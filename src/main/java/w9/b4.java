package w9;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;

/* loaded from: classes2.dex */
public final class b4 extends u5 implements t6 {
    private static final b4 zza;
    private int zze;
    private int zzf;
    private a6 zzg = a7.f17067m;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private boolean zzj;
    private double zzk;

    static {
        b4 b4Var = new b4();
        zza = b4Var;
        u5.k(b4.class, b4Var);
    }

    public final boolean A() {
        return (this.zze & 4) != 0;
    }

    public final int B() {
        int g10 = b7.k.g(this.zzf);
        if (g10 == 0) {
            g10 = 1;
        }
        return g10;
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
                    return new m2(2);
                }
                return new b4();
            }
            return new b7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", a4.f17065a, "zzg", b4.class, "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final double s() {
        return this.zzk;
    }

    public final String u() {
        return this.zzh;
    }

    public final String v() {
        return this.zzi;
    }

    public final List w() {
        return this.zzg;
    }

    public final boolean x() {
        return this.zzj;
    }

    public final boolean y() {
        return (this.zze & 8) != 0;
    }

    public final boolean z() {
        return (this.zze & 16) != 0;
    }
}
