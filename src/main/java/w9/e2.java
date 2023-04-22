package w9;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e2 extends u5 implements t6 {
    private static final e2 zza;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.FLAVOR;
    private a6 zzh = a7.f17067m;
    private boolean zzi;
    private j2 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        e2 e2Var = new e2();
        zza = e2Var;
        u5.k(e2.class, e2Var);
    }

    public static /* synthetic */ void A(e2 e2Var, String str) {
        e2Var.zze |= 2;
        e2Var.zzg = str;
    }

    public static /* synthetic */ void B(e2 e2Var, int i10, g2 g2Var) {
        Objects.requireNonNull(g2Var);
        a6 a6Var = e2Var.zzh;
        if (!a6Var.a()) {
            e2Var.zzh = u5.q(a6Var);
        }
        e2Var.zzh.set(i10, g2Var);
    }

    public static d2 u() {
        return (d2) zza.m();
    }

    public final boolean C() {
        return this.zzk;
    }

    public final boolean D() {
        return this.zzl;
    }

    public final boolean E() {
        return this.zzm;
    }

    public final boolean F() {
        return (this.zze & 8) != 0;
    }

    public final boolean G() {
        return (this.zze & 1) != 0;
    }

    public final boolean H() {
        return (this.zze & 64) != 0;
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
                    return new d2(null);
                }
                return new e2();
            }
            return new b7(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", g2.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzh.size();
    }

    public final int t() {
        return this.zzf;
    }

    public final g2 w(int i10) {
        return (g2) this.zzh.get(i10);
    }

    public final j2 x() {
        j2 j2Var = this.zzj;
        return j2Var == null ? j2.t() : j2Var;
    }

    public final String y() {
        return this.zzg;
    }

    public final List z() {
        return this.zzh;
    }
}
