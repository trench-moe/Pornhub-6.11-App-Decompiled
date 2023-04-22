package w9;

/* loaded from: classes2.dex */
public final class a3 extends u5 implements t6 {
    private static final a3 zza;
    private int zze;
    private int zzf;
    private s3 zzg;
    private s3 zzh;
    private boolean zzi;

    static {
        a3 a3Var = new a3();
        zza = a3Var;
        u5.k(a3.class, a3Var);
    }

    public static /* synthetic */ void A(a3 a3Var, boolean z10) {
        a3Var.zze |= 8;
        a3Var.zzi = z10;
    }

    public static z2 t() {
        return (z2) zza.m();
    }

    public static /* synthetic */ void x(a3 a3Var, int i10) {
        a3Var.zze |= 1;
        a3Var.zzf = i10;
    }

    public static /* synthetic */ void y(a3 a3Var, s3 s3Var) {
        a3Var.zzg = s3Var;
        a3Var.zze |= 2;
    }

    public static /* synthetic */ void z(a3 a3Var, s3 s3Var) {
        a3Var.zzh = s3Var;
        a3Var.zze |= 4;
    }

    public final boolean B() {
        return this.zzi;
    }

    public final boolean C() {
        return (this.zze & 1) != 0;
    }

    public final boolean D() {
        return (this.zze & 8) != 0;
    }

    public final boolean E() {
        return (this.zze & 4) != 0;
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
                    return new z2(null);
                }
                return new a3();
            }
            return new b7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzf;
    }

    public final s3 v() {
        s3 s3Var = this.zzg;
        if (s3Var == null) {
            s3Var = s3.z();
        }
        return s3Var;
    }

    public final s3 w() {
        s3 s3Var = this.zzh;
        return s3Var == null ? s3.z() : s3Var;
    }
}
