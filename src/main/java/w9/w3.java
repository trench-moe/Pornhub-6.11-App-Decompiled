package w9;

import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class w3 extends u5 implements t6 {
    private static final w3 zza;
    private int zze;
    private long zzf;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        w3 w3Var = new w3();
        zza = w3Var;
        u5.k(w3.class, w3Var);
    }

    public static /* synthetic */ void A(w3 w3Var, String str) {
        Objects.requireNonNull(str);
        w3Var.zze |= 2;
        w3Var.zzg = str;
    }

    public static /* synthetic */ void B(w3 w3Var, String str) {
        Objects.requireNonNull(str);
        w3Var.zze |= 4;
        w3Var.zzh = str;
    }

    public static /* synthetic */ void C(w3 w3Var) {
        w3Var.zze &= -5;
        w3Var.zzh = zza.zzh;
    }

    public static /* synthetic */ void D(w3 w3Var, long j10) {
        w3Var.zze |= 8;
        w3Var.zzi = j10;
    }

    public static /* synthetic */ void E(w3 w3Var) {
        w3Var.zze &= -9;
        w3Var.zzi = 0L;
    }

    public static /* synthetic */ void F(w3 w3Var, double d) {
        w3Var.zze |= 32;
        w3Var.zzk = d;
    }

    public static /* synthetic */ void G(w3 w3Var) {
        w3Var.zze &= -33;
        w3Var.zzk = 0.0d;
    }

    public static v3 v() {
        return (v3) zza.m();
    }

    public static /* synthetic */ void z(w3 w3Var, long j10) {
        w3Var.zze |= 1;
        w3Var.zzf = j10;
    }

    public final boolean H() {
        return (this.zze & 32) != 0;
    }

    public final boolean I() {
        return (this.zze & 8) != 0;
    }

    public final boolean J() {
        return (this.zze & 1) != 0;
    }

    public final boolean K() {
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
                    return new v3(null);
                }
                return new w3();
            }
            return new b7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final double s() {
        return this.zzk;
    }

    public final long t() {
        return this.zzi;
    }

    public final long u() {
        return this.zzf;
    }

    public final String x() {
        return this.zzg;
    }

    public final String y() {
        return this.zzh;
    }
}
