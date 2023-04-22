package w9;

import com.google.android.gms.internal.measurement.zzix;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class q7 extends o7 {
    @Override // w9.o7
    public final /* synthetic */ int a(Object obj) {
        return ((p7) obj).a();
    }

    @Override // w9.o7
    public final int b(Object obj) {
        p7 p7Var = (p7) obj;
        int i10 = p7Var.d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < p7Var.f17277a; i12++) {
                int i13 = p7Var.f17278b[i12];
                int l02 = com.google.android.gms.internal.measurement.e.l0(8);
                int g10 = ((zzix) p7Var.f17279c[i12]).g();
                i11 += com.google.android.gms.internal.measurement.e.l0(g10) + g10 + com.google.android.gms.internal.measurement.e.l0(24) + com.google.android.gms.internal.measurement.e.l0(i13 >>> 3) + com.google.android.gms.internal.measurement.e.l0(16) + l02 + l02;
            }
            p7Var.d = i11;
            return i11;
        }
        return i10;
    }

    @Override // w9.o7
    public final /* synthetic */ Object c(Object obj) {
        return ((u5) obj).zzc;
    }

    @Override // w9.o7
    public final Object d(Object obj, Object obj2) {
        p7 p7Var = (p7) obj2;
        if (p7Var.equals(p7.f17276f)) {
            return obj;
        }
        p7 p7Var2 = (p7) obj;
        int i10 = p7Var2.f17277a + p7Var.f17277a;
        int[] copyOf = Arrays.copyOf(p7Var2.f17278b, i10);
        System.arraycopy(p7Var.f17278b, 0, copyOf, p7Var2.f17277a, p7Var.f17277a);
        Object[] copyOf2 = Arrays.copyOf(p7Var2.f17279c, i10);
        System.arraycopy(p7Var.f17279c, 0, copyOf2, p7Var2.f17277a, p7Var.f17277a);
        return new p7(i10, copyOf, copyOf2, true);
    }

    @Override // w9.o7
    public final /* synthetic */ Object e() {
        return p7.b();
    }

    @Override // w9.o7
    public final /* bridge */ /* synthetic */ void f(Object obj, int i10, long j10) {
        ((p7) obj).c(i10 << 3, Long.valueOf(j10));
    }

    @Override // w9.o7
    public final void g(Object obj) {
        ((u5) obj).zzc.f17280e = false;
    }

    @Override // w9.o7
    public final /* synthetic */ void h(Object obj, Object obj2) {
        ((u5) obj).zzc = (p7) obj2;
    }

    @Override // w9.o7
    public final /* synthetic */ void i(Object obj, f5 f5Var) {
        ((p7) obj).d(f5Var);
    }
}
