package w9;

import java.util.List;

/* loaded from: classes2.dex */
public final class x3 extends u5 implements t6 {
    private static final x3 zza;
    private a6 zze = a7.f17067m;

    static {
        x3 x3Var = new x3();
        zza = x3Var;
        u5.k(x3.class, x3Var);
    }

    public static x3 u() {
        return zza;
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
                    return new u2(1);
                }
                return new x3();
            }
            return new b7(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", y3.class});
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zze.size();
    }

    public final List v() {
        return this.zze;
    }
}
