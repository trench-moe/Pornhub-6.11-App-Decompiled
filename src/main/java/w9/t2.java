package w9;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;

/* loaded from: classes2.dex */
public final class t2 extends u5 implements t6 {
    private static final t2 zza;
    private int zze;
    private long zzf;
    private String zzg = BuildConfig.FLAVOR;
    private int zzh;
    private a6 zzi;
    private a6 zzj;
    private a6 zzk;
    private String zzl;
    private boolean zzm;
    private a6 zzn;

    static {
        t2 t2Var = new t2();
        zza = t2Var;
        u5.k(t2.class, t2Var);
    }

    public t2() {
        a7 a7Var = a7.f17067m;
        this.zzi = a7Var;
        this.zzj = a7Var;
        this.zzk = a7Var;
        this.zzl = BuildConfig.FLAVOR;
        this.zzn = a7Var;
    }

    public static /* synthetic */ void D(t2 t2Var, int i10, r2 r2Var) {
        a6 a6Var = t2Var.zzj;
        if (!a6Var.a()) {
            t2Var.zzj = u5.q(a6Var);
        }
        t2Var.zzj.set(i10, r2Var);
    }

    public static void E(t2 t2Var) {
        t2Var.zzk = a7.f17067m;
    }

    public static s2 w() {
        return (s2) zza.m();
    }

    public static t2 y() {
        return zza;
    }

    public final List A() {
        return this.zzk;
    }

    public final List B() {
        return this.zzn;
    }

    public final List C() {
        return this.zzi;
    }

    public final boolean F() {
        return this.zzm;
    }

    public final boolean G() {
        return (this.zze & 2) != 0;
    }

    public final boolean H() {
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
                    return new s2(null);
                }
                return new t2();
            }
            return new b7(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", v2.class, "zzj", r2.class, "zzk", c2.class, "zzl", "zzm", "zzn", z3.class});
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzn.size();
    }

    public final int t() {
        return this.zzj.size();
    }

    public final long u() {
        return this.zzf;
    }

    public final r2 v(int i10) {
        return (r2) this.zzj.get(i10);
    }

    public final String z() {
        return this.zzg;
    }
}
