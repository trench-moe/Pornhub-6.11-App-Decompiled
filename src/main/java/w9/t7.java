package w9;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class t7 extends x0.c {
    public t7(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // x0.c
    public final double c(Object obj, long j10) {
        return Double.longBitsToDouble(m(obj, j10));
    }

    @Override // x0.c
    public final float d(Object obj, long j10) {
        return Float.intBitsToFloat(l(obj, j10));
    }

    @Override // x0.c
    public final void e(Object obj, long j10, boolean z10) {
        if (v7.f17352g) {
            v7.c(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            v7.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // x0.c
    public final void f(Object obj, long j10, byte b10) {
        if (v7.f17352g) {
            v7.c(obj, j10, b10);
        } else {
            v7.d(obj, j10, b10);
        }
    }

    @Override // x0.c
    public final void g(Object obj, long j10, double d) {
        q(obj, j10, Double.doubleToLongBits(d));
    }

    @Override // x0.c
    public final void h(Object obj, long j10, float f10) {
        p(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // x0.c
    public final boolean i(Object obj, long j10) {
        return v7.f17352g ? v7.o(obj, j10) : v7.p(obj, j10);
    }
}
