package w9;

import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class r2 extends u5 implements t6 {
    private static final r2 zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        r2 r2Var = new r2();
        zza = r2Var;
        u5.k(r2.class, r2Var);
    }

    public static /* synthetic */ r2 t() {
        return zza;
    }

    public static /* synthetic */ void v(r2 r2Var, String str) {
        Objects.requireNonNull(str);
        r2Var.zze |= 1;
        r2Var.zzf = str;
    }

    public final boolean A() {
        return (this.zze & 8) != 0;
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
                    return new p2(null);
                }
                return new r2();
            }
            return new b7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzi;
    }

    public final String u() {
        return this.zzf;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zze & 2) != 0;
    }

    public final boolean z() {
        return (this.zze & 4) != 0;
    }
}
