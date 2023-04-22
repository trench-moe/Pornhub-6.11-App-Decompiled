package com.google.android.gms.internal.cast;

import java.util.Objects;
import t9.k2;
import t9.s2;

/* loaded from: classes.dex */
public final class i extends l1<i, t9.o0> implements k2 {
    private static final i zzb;
    private int zze;
    private q zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private m0 zzn;
    private int zzo;
    private int zzp;

    static {
        i iVar = new i();
        zzb = iVar;
        l1.c(i.class, iVar);
    }

    public static t9.o0 m() {
        return zzb.h();
    }

    public static t9.o0 n(i iVar) {
        t9.o0 h10 = zzb.h();
        h10.b(iVar);
        return h10;
    }

    public static i p() {
        return zzb;
    }

    public static /* synthetic */ void q(i iVar, q qVar) {
        Objects.requireNonNull(qVar);
        iVar.zzf = qVar;
        iVar.zze |= 1;
    }

    public static /* synthetic */ void r(i iVar, boolean z10) {
        iVar.zze |= 2;
        iVar.zzg = z10;
    }

    public static /* synthetic */ void s(i iVar, long j10) {
        iVar.zze |= 4;
        iVar.zzh = j10;
    }

    public static /* synthetic */ void t(i iVar, int i10) {
        iVar.zze |= 64;
        iVar.zzl = i10;
    }

    public static /* synthetic */ void u(i iVar, int i10) {
        iVar.zze |= 128;
        iVar.zzm = i10;
    }

    public static /* synthetic */ void v(i iVar, int i10) {
        iVar.zze |= 1024;
        iVar.zzp = i10;
    }

    @Override // com.google.android.gms.internal.cast.l1
    public final Object e(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new t9.o0(null);
                }
                return new i();
            }
            return new s2(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007င\u0006\bင\u0007\tဉ\b\nဌ\t\u000bင\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", a0.b.M, "zzk", r3.c.y, "zzl", "zzm", "zzn", "zzo", b7.k.f3597b0, "zzp"});
        }
        return (byte) 1;
    }
}
