package w9;

/* loaded from: classes2.dex */
public final class c3 extends u5 implements t6 {
    private static final c3 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        c3 c3Var = new c3();
        zza = c3Var;
        u5.k(c3.class, c3Var);
    }

    public static b3 u() {
        return (b3) zza.m();
    }

    public static /* synthetic */ void w(c3 c3Var, int i10) {
        c3Var.zze |= 1;
        c3Var.zzf = i10;
    }

    public static /* synthetic */ void x(c3 c3Var, long j10) {
        c3Var.zze |= 2;
        c3Var.zzg = j10;
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
                    return new b3(null);
                }
                return new c3();
            }
            return new b7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzf;
    }

    public final long t() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zze & 2) != 0;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
