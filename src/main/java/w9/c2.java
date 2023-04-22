package w9;

import java.util.List;

/* loaded from: classes2.dex */
public final class c2 extends u5 implements t6 {
    private static final c2 zza;
    private int zze;
    private int zzf;
    private a6 zzg;
    private a6 zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        c2 c2Var = new c2();
        zza = c2Var;
        u5.k(c2.class, c2Var);
    }

    public c2() {
        a7 a7Var = a7.f17067m;
        this.zzg = a7Var;
        this.zzh = a7Var;
    }

    public static /* synthetic */ void A(c2 c2Var, int i10, l2 l2Var) {
        a6 a6Var = c2Var.zzg;
        if (!a6Var.a()) {
            c2Var.zzg = u5.q(a6Var);
        }
        c2Var.zzg.set(i10, l2Var);
    }

    public static /* synthetic */ void B(c2 c2Var, int i10, e2 e2Var) {
        a6 a6Var = c2Var.zzh;
        if (!a6Var.a()) {
            c2Var.zzh = u5.q(a6Var);
        }
        c2Var.zzh.set(i10, e2Var);
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
                    return new b2(null);
                }
                return new c2();
            }
            return new b7(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", l2.class, "zzh", e2.class, "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzf;
    }

    public final int t() {
        return this.zzh.size();
    }

    public final int u() {
        return this.zzg.size();
    }

    public final e2 w(int i10) {
        return (e2) this.zzh.get(i10);
    }

    public final l2 x(int i10) {
        return (l2) this.zzg.get(i10);
    }

    public final List y() {
        return this.zzh;
    }

    public final List z() {
        return this.zzg;
    }
}
