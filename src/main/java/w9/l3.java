package w9;

import java.util.List;

/* loaded from: classes2.dex */
public final class l3 extends u5 implements t6 {
    private static final l3 zza;
    private a6 zze = a7.f17067m;

    static {
        l3 l3Var = new l3();
        zza = l3Var;
        u5.k(l3.class, l3Var);
    }

    public static k3 s() {
        return (k3) zza.m();
    }

    public static /* synthetic */ void w(l3 l3Var, n3 n3Var) {
        a6 a6Var = l3Var.zze;
        if (!a6Var.a()) {
            l3Var.zze = u5.q(a6Var);
        }
        l3Var.zze.add(n3Var);
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
                    return new k3(null);
                }
                return new l3();
            }
            return new b7(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", n3.class});
        }
        return (byte) 1;
    }

    public final n3 u() {
        return (n3) this.zze.get(0);
    }

    public final List v() {
        return this.zze;
    }
}
