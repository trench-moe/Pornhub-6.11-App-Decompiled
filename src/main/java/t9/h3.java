package t9;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class h3 extends f3<g3, g3> {
    @Override // t9.f3
    public final int a(g3 g3Var) {
        g3 g3Var2 = g3Var;
        int i10 = g3Var2.f15227c;
        if (i10 == -1) {
            g3Var2.f15227c = 0;
            return 0;
        }
        return i10;
    }

    @Override // t9.f3
    public final int b(g3 g3Var) {
        g3 g3Var2 = g3Var;
        int i10 = g3Var2.f15227c;
        if (i10 == -1) {
            g3Var2.f15227c = 0;
            return 0;
        }
        return i10;
    }

    @Override // t9.f3
    public final /* synthetic */ g3 c(Object obj) {
        return ((com.google.android.gms.internal.cast.l1) obj).zzc;
    }

    @Override // t9.f3
    public final g3 d(g3 g3Var, g3 g3Var2) {
        g3 g3Var3 = g3Var2;
        if (g3Var3.equals(g3.d)) {
            return g3Var;
        }
        g3 g3Var4 = g3Var;
        Objects.requireNonNull(g3Var4);
        Objects.requireNonNull(g3Var3);
        int[] copyOf = Arrays.copyOf(g3Var4.f15225a, 0);
        System.arraycopy(g3Var3.f15225a, 0, copyOf, 0, 0);
        Object[] copyOf2 = Arrays.copyOf(g3Var4.f15226b, 0);
        System.arraycopy(g3Var3.f15226b, 0, copyOf2, 0, 0);
        return new g3(copyOf, copyOf2);
    }

    @Override // t9.f3
    public final void e(Object obj) {
        g3 g3Var = ((com.google.android.gms.internal.cast.l1) obj).zzc;
    }

    @Override // t9.f3
    public final /* synthetic */ void f(Object obj, g3 g3Var) {
        ((com.google.android.gms.internal.cast.l1) obj).zzc = g3Var;
    }

    @Override // t9.f3
    public final /* synthetic */ void g(g3 g3Var, com.google.android.gms.internal.cast.k1 k1Var) {
    }
}
