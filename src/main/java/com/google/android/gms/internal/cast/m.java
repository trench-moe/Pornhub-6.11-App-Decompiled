package com.google.android.gms.internal.cast;

import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import l.InterfaceC0186;
import t9.k2;
import t9.p1;
import t9.r2;
import t9.s1;
import t9.s2;

/* loaded from: classes.dex */
public final class m extends l1<m, t9.r0> implements k2 {
    private static final m zzb;
    private s1<o> zzA;
    private s1<o0> zzB;
    private int zzC;
    private int zzD;
    private q zzE;
    private int zzF;
    private l zzG;
    private s1<q> zzH;
    private q zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private int zzO;
    private u0 zzP;
    private i zzQ;
    private d zzR;
    private b0 zzS;
    private n0 zzT;
    private d0 zzU;
    private s1<h> zzV;
    private int zzW;
    private h0 zzX;
    private s1<j> zzY;
    private boolean zzZ;
    private boolean zzaa;
    private int zzab;
    private e zzac;
    private l0 zzad;
    private y zzae;
    private g0 zzaf;
    private r0 zzag;
    private n zzah;
    private int zzai;
    private int zzaj;
    private int zzak;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private w zzj;
    private k0 zzk;
    private v zzl;
    private t zzm;
    private k zzn;
    private j0 zzo;
    private g zzp;
    private t0 zzq;
    private s zzs;
    private c zzt;
    private f0 zzv;
    private s1<x> zzy;
    private s1<z> zzz;
    private byte zzal = 2;
    private String zzr = BuildConfig.FLAVOR;
    private String zzu = BuildConfig.FLAVOR;
    private String zzw = BuildConfig.FLAVOR;
    private p1 zzx = t9.l1.f15284m;

    static {
        m mVar = new m();
        zzb = mVar;
        l1.c(m.class, mVar);
    }

    public m() {
        r2<Object> r2Var = r2.f15333m;
        this.zzy = r2Var;
        this.zzz = r2Var;
        this.zzA = r2Var;
        this.zzB = r2Var;
        this.zzH = r2Var;
        this.zzV = r2Var;
        this.zzY = r2Var;
    }

    public static t9.r0 n() {
        return zzb.h();
    }

    public static t9.r0 o(m mVar) {
        t9.r0 h10 = zzb.h();
        h10.b(mVar);
        return h10;
    }

    public static /* synthetic */ void q(m mVar, int i10) {
        mVar.zze |= 268435456;
        mVar.zzO = i10;
    }

    public static /* synthetic */ void r(m mVar, i iVar) {
        Objects.requireNonNull(iVar);
        mVar.zzQ = iVar;
        mVar.zze |= 1073741824;
    }

    public static /* synthetic */ void s(m mVar, h hVar) {
        Objects.requireNonNull(hVar);
        s1<h> s1Var = mVar.zzV;
        if (!s1Var.a()) {
            int size = s1Var.size();
            mVar.zzV = s1Var.zzg(size == 0 ? 10 : size + size);
        }
        mVar.zzV.add(hVar);
    }

    public static /* synthetic */ void t(m mVar, e eVar) {
        Objects.requireNonNull(eVar);
        mVar.zzac = eVar;
        mVar.zzf |= 256;
    }

    public static /* synthetic */ void u(m mVar, long j10) {
        mVar.zze |= 2;
        mVar.zzh = j10;
    }

    public static /* synthetic */ void v(m mVar, String str) {
        mVar.zze |= InterfaceC0186.f43;
        mVar.zzr = str;
    }

    public static /* synthetic */ void w(m mVar, String str) {
        Objects.requireNonNull(str);
        mVar.zze |= 16384;
        mVar.zzu = str;
    }

    public static /* synthetic */ void x(m mVar, String str) {
        mVar.zze |= 65536;
        mVar.zzw = str;
    }

    @Override // com.google.android.gms.internal.cast.l1
    public final Object e(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            byte b10 = 1;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (obj == null) {
                                b10 = 0;
                            }
                            this.zzal = b10;
                            return null;
                        }
                        return zzb;
                    }
                    return new t9.r0(null);
                }
                return new m();
            }
            return new s2(zzb, "\u00019\u0000\u0002\u000199\u0000\b\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u000f\u0011ဈ\u0010\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017ဌ\u0011\u0018ဉ\u0015\u0019\u001b\u001aဉ\u0016\u001bဌ\u0018\u001cင\u0019\u001dင\u001a\u001eင\u001b\u001fဆ\u001c ဉ\u001d!ဉ\u001e\"ဉ\u001f#ဌ\u0012$ဉ\u0013%ᐉ &ဉ!'ဉ\"(\u001b)ဌ#*ဉ$+\u001b,ဌ\u0017-ဇ%.ဇ&/ဌ'0ဉ(1င\u00142ဉ)3ဉ*4ဉ+5ဉ,6ဉ-7ဌ.8ဌ/9ဌ0", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", r3.c.B, "zzj", "zzk", "zzl", "zzm", "zzn", "zzu", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzv", "zzw", "zzx", "zzy", x.class, "zzz", z.class, "zzA", o.class, "zzB", o0.class, "zzC", b7.k.f3599c0, "zzG", "zzH", q.class, "zzI", "zzK", cb.e.J, "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzD", mb.a.A, "zzE", "zzS", "zzT", "zzU", "zzV", h.class, "zzW", a0.b.U, "zzX", "zzY", j.class, "zzJ", f1.a.f9360z, "zzZ", "zzaa", "zzab", x.c.f17616m, "zzac", "zzF", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", o9.b.A, "zzaj", a0.b.S, "zzak", a0.b.N});
        }
        return Byte.valueOf(this.zzal);
    }

    public final i m() {
        i iVar = this.zzQ;
        if (iVar == null) {
            iVar = i.p();
        }
        return iVar;
    }
}
