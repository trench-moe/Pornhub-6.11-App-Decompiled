package w9;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class i3 extends u5 implements t6 {
    private static final i3 zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private a6 zzk = a7.f17067m;

    static {
        i3 i3Var = new i3();
        zza = i3Var;
        u5.k(i3.class, i3Var);
    }

    public static /* synthetic */ void B(i3 i3Var, String str) {
        Objects.requireNonNull(str);
        i3Var.zze |= 1;
        i3Var.zzf = str;
    }

    public static /* synthetic */ void C(i3 i3Var, String str) {
        Objects.requireNonNull(str);
        i3Var.zze |= 2;
        i3Var.zzg = str;
    }

    public static /* synthetic */ void D(i3 i3Var) {
        i3Var.zze &= -3;
        i3Var.zzg = zza.zzg;
    }

    public static /* synthetic */ void E(i3 i3Var, long j10) {
        i3Var.zze |= 4;
        i3Var.zzh = j10;
    }

    public static /* synthetic */ void F(i3 i3Var) {
        i3Var.zze &= -5;
        i3Var.zzh = 0L;
    }

    public static /* synthetic */ void G(i3 i3Var, double d) {
        i3Var.zze |= 16;
        i3Var.zzj = d;
    }

    public static /* synthetic */ void H(i3 i3Var) {
        i3Var.zze &= -17;
        i3Var.zzj = 0.0d;
    }

    public static void I(i3 i3Var, i3 i3Var2) {
        a6 a6Var = i3Var.zzk;
        if (!a6Var.a()) {
            i3Var.zzk = u5.q(a6Var);
        }
        i3Var.zzk.add(i3Var2);
    }

    public static void J(i3 i3Var, Iterable iterable) {
        a6 a6Var = i3Var.zzk;
        if (!a6Var.a()) {
            i3Var.zzk = u5.q(a6Var);
        }
        com.google.android.gms.internal.measurement.c.g(iterable, i3Var.zzk);
    }

    public static void K(i3 i3Var) {
        i3Var.zzk = a7.f17067m;
    }

    public static h3 w() {
        return (h3) zza.m();
    }

    public final List A() {
        return this.zzk;
    }

    public final boolean L() {
        return (this.zze & 16) != 0;
    }

    public final boolean M() {
        return (this.zze & 8) != 0;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final boolean P() {
        return (this.zze & 2) != 0;
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
                    return new h3(null);
                }
                return new i3();
            }
            return new b7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", i3.class});
        }
        return (byte) 1;
    }

    public final double s() {
        return this.zzj;
    }

    public final float t() {
        return this.zzi;
    }

    public final int u() {
        return this.zzk.size();
    }

    public final long v() {
        return this.zzh;
    }

    public final String y() {
        return this.zzf;
    }

    public final String z() {
        return this.zzg;
    }
}
