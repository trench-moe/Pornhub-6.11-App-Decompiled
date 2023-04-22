package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Objects;
import t9.k2;
import t9.p1;
import t9.q1;
import t9.r2;
import t9.s1;
import t9.s2;

/* loaded from: classes.dex */
public final class e extends l1<e, t9.m0> implements k2 {
    private static final q1<Integer, zzju> zzb = new a0.b();
    private static final e zze;
    private int zzf;
    private h zzg;
    private c0 zzh;
    private s1<a0> zzi = r2.f15333m;
    private p1 zzj = t9.l1.f15284m;

    static {
        e eVar = new e();
        zze = eVar;
        l1.c(e.class, eVar);
    }

    public static t9.m0 m() {
        return zze.h();
    }

    public static /* synthetic */ void o(e eVar, h hVar) {
        Objects.requireNonNull(hVar);
        eVar.zzg = hVar;
        eVar.zzf |= 1;
    }

    public static void p(e eVar, Iterable iterable) {
        p1 p1Var = eVar.zzj;
        if (!((t9.x0) p1Var).f15365c) {
            t9.l1 l1Var = (t9.l1) p1Var;
            int i10 = l1Var.f15286j;
            eVar.zzj = l1Var.zzg(i10 == 0 ? 10 : i10 + i10);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((t9.l1) eVar.zzj).h(((zzju) it.next()).zza());
        }
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
                        return zze;
                    }
                    return new t9.m0(null);
                }
                return new e();
            }
            return new s2(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001e", new Object[]{"zzf", "zzg", "zzh", "zzi", a0.class, "zzj", m9.a.D0});
        }
        return (byte) 1;
    }
}
