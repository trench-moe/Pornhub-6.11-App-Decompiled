package w9;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;

/* loaded from: classes2.dex */
public final class o2 extends u5 implements t6 {
    private static final o2 zza;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = BuildConfig.FLAVOR;
    private a6 zzi = a7.f17067m;

    static {
        o2 o2Var = new o2();
        zza = o2Var;
        u5.k(o2.class, o2Var);
    }

    public static o2 u() {
        return zza;
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    public final int B() {
        int l10 = mb.a.l(this.zzf);
        if (l10 == 0) {
            return 1;
        }
        return l10;
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
                    return new m2(0);
                }
                return new o2();
            }
            return new b7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", n2.f17246a, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzi.size();
    }

    public final String v() {
        return this.zzg;
    }

    public final List w() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zze & 4) != 0;
    }

    public final boolean z() {
        return (this.zze & 2) != 0;
    }
}
