package w9;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e3 extends u5 implements t6 {
    private static final e3 zza;
    private int zze;
    private a6 zzf = a7.f17067m;
    private String zzg = BuildConfig.FLAVOR;
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        e3 e3Var = new e3();
        zza = e3Var;
        u5.k(e3.class, e3Var);
    }

    public static /* synthetic */ void B(e3 e3Var, int i10, i3 i3Var) {
        Objects.requireNonNull(i3Var);
        e3Var.M();
        e3Var.zzf.set(i10, i3Var);
    }

    public static /* synthetic */ void C(e3 e3Var, i3 i3Var) {
        Objects.requireNonNull(i3Var);
        e3Var.M();
        e3Var.zzf.add(i3Var);
    }

    public static /* synthetic */ void D(e3 e3Var, Iterable iterable) {
        e3Var.M();
        com.google.android.gms.internal.measurement.c.g(iterable, e3Var.zzf);
    }

    public static void E(e3 e3Var) {
        e3Var.zzf = a7.f17067m;
    }

    public static /* synthetic */ void F(e3 e3Var, int i10) {
        e3Var.M();
        e3Var.zzf.remove(i10);
    }

    public static /* synthetic */ void G(e3 e3Var, String str) {
        Objects.requireNonNull(str);
        e3Var.zze |= 1;
        e3Var.zzg = str;
    }

    public static /* synthetic */ void H(e3 e3Var, long j10) {
        e3Var.zze |= 2;
        e3Var.zzh = j10;
    }

    public static /* synthetic */ void I(e3 e3Var, long j10) {
        e3Var.zze |= 4;
        e3Var.zzi = j10;
    }

    public static d3 w() {
        return (d3) zza.m();
    }

    public final List A() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zze & 8) != 0;
    }

    public final boolean K() {
        return (this.zze & 4) != 0;
    }

    public final boolean L() {
        return (this.zze & 2) != 0;
    }

    public final void M() {
        a6 a6Var = this.zzf;
        if (!a6Var.a()) {
            this.zzf = u5.q(a6Var);
        }
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
                    return new d3(null);
                }
                return new e3();
            }
            return new b7(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", i3.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzj;
    }

    public final int t() {
        return this.zzf.size();
    }

    public final long u() {
        return this.zzi;
    }

    public final long v() {
        return this.zzh;
    }

    public final i3 y(int i10) {
        return (i3) this.zzf.get(i10);
    }

    public final String z() {
        return this.zzg;
    }
}
