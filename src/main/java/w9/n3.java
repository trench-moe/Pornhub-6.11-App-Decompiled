package w9;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import java.util.Objects;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import l.InterfaceC0186;

/* loaded from: classes2.dex */
public final class n3 extends u5 implements t6 {
    public static final /* synthetic */ int zza = 0;
    private static final n3 zze;
    private boolean zzA;
    private String zzB;
    private long zzC;
    private int zzD;
    private String zzE;
    private String zzF;
    private boolean zzG;
    private a6 zzH;
    private String zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private String zzM;
    private long zzN;
    private long zzO;
    private String zzP;
    private String zzQ;
    private int zzR;
    private String zzS;
    private q3 zzT;
    private y5 zzU;
    private long zzV;
    private long zzW;
    private String zzX;
    private String zzY;
    private int zzZ;
    private boolean zzaa;
    private String zzab;
    private boolean zzac;
    private j3 zzad;
    private String zzae;
    private int zzf;
    private int zzg;
    private int zzh;
    private a6 zzi;
    private a6 zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private int zzt;
    private String zzu;
    private String zzv;
    private String zzw;
    private long zzx;
    private long zzy;
    private String zzz;

    static {
        n3 n3Var = new n3();
        zze = n3Var;
        u5.k(n3.class, n3Var);
    }

    public n3() {
        a7 a7Var = a7.f17067m;
        this.zzi = a7Var;
        this.zzj = a7Var;
        this.zzp = BuildConfig.FLAVOR;
        this.zzq = BuildConfig.FLAVOR;
        this.zzr = BuildConfig.FLAVOR;
        this.zzs = BuildConfig.FLAVOR;
        this.zzu = BuildConfig.FLAVOR;
        this.zzv = BuildConfig.FLAVOR;
        this.zzw = BuildConfig.FLAVOR;
        this.zzz = BuildConfig.FLAVOR;
        this.zzB = BuildConfig.FLAVOR;
        this.zzE = BuildConfig.FLAVOR;
        this.zzF = BuildConfig.FLAVOR;
        this.zzH = a7Var;
        this.zzI = BuildConfig.FLAVOR;
        this.zzM = BuildConfig.FLAVOR;
        this.zzP = BuildConfig.FLAVOR;
        this.zzQ = BuildConfig.FLAVOR;
        this.zzS = BuildConfig.FLAVOR;
        this.zzU = v5.f17341m;
        this.zzX = BuildConfig.FLAVOR;
        this.zzY = BuildConfig.FLAVOR;
        this.zzab = BuildConfig.FLAVOR;
        this.zzae = BuildConfig.FLAVOR;
    }

    public static /* synthetic */ void A0(n3 n3Var, long j10) {
        n3Var.zzf |= 2;
        n3Var.zzk = j10;
    }

    public static /* synthetic */ void B0(n3 n3Var, long j10) {
        n3Var.zzf |= 4;
        n3Var.zzl = j10;
    }

    public static /* synthetic */ void C0(n3 n3Var, long j10) {
        n3Var.zzf |= 8;
        n3Var.zzm = j10;
    }

    public static /* synthetic */ void D0(n3 n3Var, long j10) {
        n3Var.zzf |= 16;
        n3Var.zzn = j10;
    }

    public static /* synthetic */ void E0(n3 n3Var) {
        n3Var.zzf &= -17;
        n3Var.zzn = 0L;
    }

    public static /* synthetic */ void F0(n3 n3Var, long j10) {
        n3Var.zzf |= 32;
        n3Var.zzo = j10;
    }

    public static /* synthetic */ void G0(n3 n3Var) {
        n3Var.zzf &= -33;
        n3Var.zzo = 0L;
    }

    public static /* synthetic */ void H(n3 n3Var, long j10) {
        n3Var.zzf |= 1073741824;
        n3Var.zzO = j10;
    }

    public static /* synthetic */ void H0(n3 n3Var) {
        n3Var.zzf |= 64;
        n3Var.zzp = "android";
    }

    public static /* synthetic */ void I(n3 n3Var) {
        n3Var.zzf &= IntCompanionObject.MAX_VALUE;
        n3Var.zzP = zze.zzP;
    }

    public static /* synthetic */ void I0(n3 n3Var, String str) {
        Objects.requireNonNull(str);
        n3Var.zzf |= 128;
        n3Var.zzq = str;
    }

    public static /* synthetic */ void J(n3 n3Var, int i10) {
        n3Var.zzg |= 2;
        n3Var.zzR = i10;
    }

    public static /* synthetic */ void J0(n3 n3Var, String str) {
        Objects.requireNonNull(str);
        n3Var.zzf |= 256;
        n3Var.zzr = str;
    }

    public static /* synthetic */ void K(n3 n3Var, int i10, e3 e3Var) {
        n3Var.U0();
        n3Var.zzi.set(i10, e3Var);
    }

    public static /* synthetic */ void K0(n3 n3Var, String str) {
        Objects.requireNonNull(str);
        n3Var.zzf |= ConstantsKt.MINIMUM_BLOCK_SIZE;
        n3Var.zzs = str;
    }

    public static /* synthetic */ void L(n3 n3Var, String str) {
        Objects.requireNonNull(str);
        n3Var.zzg |= 4;
        n3Var.zzS = str;
    }

    public static /* synthetic */ void L0(n3 n3Var, int i10) {
        n3Var.zzf |= 1024;
        n3Var.zzt = i10;
    }

    public static /* synthetic */ void M(n3 n3Var, q3 q3Var) {
        n3Var.zzT = q3Var;
        n3Var.zzg |= 8;
    }

    public static /* synthetic */ void M0(n3 n3Var, String str) {
        Objects.requireNonNull(str);
        n3Var.zzf |= InterfaceC0186.f43;
        n3Var.zzu = str;
    }

    public static void N(n3 n3Var, Iterable iterable) {
        y5 y5Var = n3Var.zzU;
        if (!((z4) y5Var).f17389c) {
            v5 v5Var = (v5) y5Var;
            int i10 = v5Var.f17343j;
            n3Var.zzU = v5Var.i(i10 == 0 ? 10 : i10 + i10);
        }
        com.google.android.gms.internal.measurement.c.g(iterable, n3Var.zzU);
    }

    public static /* synthetic */ void N0(n3 n3Var, String str) {
        Objects.requireNonNull(str);
        n3Var.zzf |= ConstantsKt.DEFAULT_BLOCK_SIZE;
        n3Var.zzv = str;
    }

    public static /* synthetic */ void O(n3 n3Var, e3 e3Var) {
        n3Var.U0();
        n3Var.zzi.add(e3Var);
    }

    public static /* synthetic */ void O0(n3 n3Var, String str) {
        Objects.requireNonNull(str);
        n3Var.zzf |= ConstantsKt.DEFAULT_BUFFER_SIZE;
        n3Var.zzw = str;
    }

    public static /* synthetic */ void P(n3 n3Var, long j10) {
        n3Var.zzg |= 16;
        n3Var.zzV = j10;
    }

    public static /* synthetic */ void P0(n3 n3Var, long j10) {
        n3Var.zzf |= 16384;
        n3Var.zzx = j10;
    }

    public static /* synthetic */ void Q(n3 n3Var, long j10) {
        n3Var.zzg |= 32;
        n3Var.zzW = j10;
    }

    public static /* synthetic */ void Q0(n3 n3Var) {
        n3Var.zzf |= 32768;
        n3Var.zzy = 55005L;
    }

    public static /* synthetic */ void R(n3 n3Var, String str) {
        n3Var.zzg |= 128;
        n3Var.zzY = str;
    }

    public static /* synthetic */ void R0(n3 n3Var, String str) {
        Objects.requireNonNull(str);
        n3Var.zzf |= 65536;
        n3Var.zzz = str;
    }

    public static /* synthetic */ void S0(n3 n3Var) {
        n3Var.zzf &= -65537;
        n3Var.zzz = zze.zzz;
    }

    public static /* synthetic */ void T(n3 n3Var, boolean z10) {
        n3Var.zzf |= 131072;
        n3Var.zzA = z10;
    }

    public static /* synthetic */ void U(n3 n3Var) {
        n3Var.zzf &= -131073;
        n3Var.zzA = false;
    }

    public static /* synthetic */ void V(n3 n3Var, String str) {
        Objects.requireNonNull(str);
        n3Var.zzf |= 262144;
        n3Var.zzB = str;
    }

    public static /* synthetic */ void W(n3 n3Var) {
        n3Var.zzf &= -262145;
        n3Var.zzB = zze.zzB;
    }

    public static /* synthetic */ void X(n3 n3Var, long j10) {
        n3Var.zzf |= 524288;
        n3Var.zzC = j10;
    }

    public static /* synthetic */ void Y(n3 n3Var, int i10) {
        n3Var.zzf |= 1048576;
        n3Var.zzD = i10;
    }

    public static /* synthetic */ void Z(n3 n3Var, String str) {
        n3Var.zzf |= 2097152;
        n3Var.zzE = str;
    }

    public static /* synthetic */ void a0(n3 n3Var) {
        n3Var.zzf &= -2097153;
        n3Var.zzE = zze.zzE;
    }

    public static /* synthetic */ void b0(n3 n3Var, String str) {
        Objects.requireNonNull(str);
        n3Var.zzf |= 4194304;
        n3Var.zzF = str;
    }

    public static /* synthetic */ void c0(n3 n3Var, boolean z10) {
        n3Var.zzf |= 8388608;
        n3Var.zzG = z10;
    }

    public static /* synthetic */ void d0(n3 n3Var, Iterable iterable) {
        a6 a6Var = n3Var.zzH;
        if (!a6Var.a()) {
            n3Var.zzH = u5.q(a6Var);
        }
        com.google.android.gms.internal.measurement.c.g(iterable, n3Var.zzH);
    }

    public static void e0(n3 n3Var) {
        n3Var.zzH = a7.f17067m;
    }

    public static /* synthetic */ void f0(n3 n3Var, String str) {
        Objects.requireNonNull(str);
        n3Var.zzf |= 16777216;
        n3Var.zzI = str;
    }

    public static /* synthetic */ void g0(n3 n3Var, int i10) {
        n3Var.zzf |= 33554432;
        n3Var.zzJ = i10;
    }

    public static /* synthetic */ void h0(n3 n3Var) {
        n3Var.zzf |= 1;
        n3Var.zzh = 1;
    }

    public static /* synthetic */ void i0(n3 n3Var) {
        n3Var.zzf &= -268435457;
        n3Var.zzM = zze.zzM;
    }

    public static /* synthetic */ void j0(n3 n3Var, long j10) {
        n3Var.zzf |= 536870912;
        n3Var.zzN = j10;
    }

    public static /* synthetic */ void t0(n3 n3Var, Iterable iterable) {
        n3Var.U0();
        com.google.android.gms.internal.measurement.c.g(iterable, n3Var.zzi);
    }

    public static void u0(n3 n3Var) {
        n3Var.zzi = a7.f17067m;
    }

    public static /* synthetic */ void v0(n3 n3Var, int i10) {
        n3Var.U0();
        n3Var.zzi.remove(i10);
    }

    public static /* synthetic */ void w0(n3 n3Var, int i10, w3 w3Var) {
        Objects.requireNonNull(w3Var);
        n3Var.V0();
        n3Var.zzj.set(i10, w3Var);
    }

    public static /* synthetic */ void x0(n3 n3Var, w3 w3Var) {
        Objects.requireNonNull(w3Var);
        n3Var.V0();
        n3Var.zzj.add(w3Var);
    }

    public static /* synthetic */ void y0(n3 n3Var, Iterable iterable) {
        n3Var.V0();
        com.google.android.gms.internal.measurement.c.g(iterable, n3Var.zzj);
    }

    public static /* synthetic */ void z0(n3 n3Var, int i10) {
        n3Var.V0();
        n3Var.zzj.remove(i10);
    }

    public static m3 z1() {
        return (m3) zze.m();
    }

    public final String A() {
        return this.zzq;
    }

    public final String B() {
        return this.zzp;
    }

    public final w3 B1(int i10) {
        return (w3) this.zzj.get(i10);
    }

    public final String C() {
        return this.zzz;
    }

    public final String C1() {
        return this.zzS;
    }

    public final String D() {
        return this.zzs;
    }

    public final String D1() {
        return this.zzv;
    }

    public final List E() {
        return this.zzH;
    }

    public final String E1() {
        return this.zzB;
    }

    public final List F() {
        return this.zzi;
    }

    public final List G() {
        return this.zzj;
    }

    public final int S() {
        return this.zzJ;
    }

    public final int T0() {
        return this.zzD;
    }

    public final void U0() {
        a6 a6Var = this.zzi;
        if (a6Var.a()) {
            return;
        }
        this.zzi = u5.q(a6Var);
    }

    public final void V0() {
        a6 a6Var = this.zzj;
        if (!a6Var.a()) {
            this.zzj = u5.q(a6Var);
        }
    }

    public final boolean W0() {
        return (this.zzf & 8) != 0;
    }

    public final boolean X0() {
        return (this.zzf & 16384) != 0;
    }

    public final boolean Y0() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean Z0() {
        return (this.zzf & 32) != 0;
    }

    public final boolean a1() {
        return (this.zzf & 16) != 0;
    }

    public final boolean b1() {
        return (this.zzf & 1) != 0;
    }

    public final boolean c1() {
        return (this.zzg & 2) != 0;
    }

    public final boolean d1() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean e1() {
        return (this.zzf & 4) != 0;
    }

    public final boolean f1() {
        return (this.zzf & 1024) != 0;
    }

    public final boolean g1() {
        return (this.zzf & 2) != 0;
    }

    public final boolean h1() {
        return (this.zzf & 32768) != 0;
    }

    public final int i1() {
        return this.zzi.size();
    }

    public final int j1() {
        return this.zzh;
    }

    public final boolean k0() {
        return this.zzA;
    }

    public final int k1() {
        return this.zzR;
    }

    public final boolean l0() {
        return this.zzG;
    }

    public final int l1() {
        return this.zzt;
    }

    public final boolean m0() {
        return (this.zzf & 1073741824) != 0;
    }

    public final int m1() {
        return this.zzj.size();
    }

    public final boolean n0() {
        return (this.zzf & 33554432) != 0;
    }

    public final long n1() {
        return this.zzO;
    }

    public final boolean o0() {
        return (this.zzf & 1048576) != 0;
    }

    public final long o1() {
        return this.zzN;
    }

    public final boolean p0() {
        return (this.zzf & 536870912) != 0;
    }

    public final long p1() {
        return this.zzC;
    }

    public final boolean q0() {
        return (this.zzg & 128) != 0;
    }

    public final long q1() {
        return this.zzV;
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
                        return zze;
                    }
                    return new m3(null);
                }
                return new n3();
            }
            return new b7(zze, "\u00012\u0000\u0002\u0001?2\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-", new Object[]{"zzf", "zzg", "zzh", "zzi", e3.class, "zzj", w3.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", a3.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", w2.f17356a, "zzaa", "zzab", "zzac", "zzad", "zzae"});
        }
        return (byte) 1;
    }

    public final boolean r0() {
        return (this.zzf & 524288) != 0;
    }

    public final long r1() {
        return this.zzm;
    }

    public final String s() {
        return this.zzu;
    }

    public final boolean s0() {
        return (this.zzg & 16) != 0;
    }

    public final long s1() {
        return this.zzx;
    }

    public final String t() {
        return this.zzw;
    }

    public final long t1() {
        return this.zzo;
    }

    public final String u() {
        return this.zzY;
    }

    public final long u1() {
        return this.zzn;
    }

    public final String v() {
        return this.zzr;
    }

    public final long v1() {
        return this.zzl;
    }

    public final String w() {
        return this.zzP;
    }

    public final long w1() {
        return this.zzk;
    }

    public final String x() {
        return this.zzI;
    }

    public final long x1() {
        return this.zzy;
    }

    public final String y() {
        return this.zzF;
    }

    public final e3 y1(int i10) {
        return (e3) this.zzi.get(i10);
    }

    public final String z() {
        return this.zzE;
    }
}
