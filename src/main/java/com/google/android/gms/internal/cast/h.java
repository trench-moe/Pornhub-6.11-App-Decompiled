package com.google.android.gms.internal.cast;

import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import t9.k2;
import t9.s2;

/* loaded from: classes.dex */
public final class h extends l1<h, t9.n0> implements k2 {
    private static final h zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;

    static {
        h hVar = new h();
        zzb = hVar;
        l1.c(h.class, hVar);
    }

    public static t9.n0 m() {
        return zzb.h();
    }

    public static /* synthetic */ void o(h hVar, String str) {
        Objects.requireNonNull(str);
        hVar.zze |= 1;
        hVar.zzf = str;
    }

    public static /* synthetic */ void p(h hVar, String str) {
        Objects.requireNonNull(str);
        hVar.zze |= 2;
        hVar.zzg = str;
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
                    return new t9.n0(null);
                }
                return new h();
            }
            return new s2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
