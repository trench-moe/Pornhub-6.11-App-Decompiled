package t9;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class n3 extends h2.k {
    public n3(Unsafe unsafe) {
        super(unsafe, 2);
    }

    @Override // h2.k
    public final double f(Object obj, long j10) {
        return Double.longBitsToDouble(p(obj, j10));
    }

    @Override // h2.k
    public final float g(Object obj, long j10) {
        return Float.intBitsToFloat(o(obj, j10));
    }

    @Override // h2.k
    public final void h(Object obj, long j10, boolean z10) {
        if (o3.f15316g) {
            o3.c(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            o3.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // h2.k
    public final void i(Object obj, long j10, byte b10) {
        if (o3.f15316g) {
            o3.c(obj, j10, b10);
        } else {
            o3.d(obj, j10, b10);
        }
    }

    @Override // h2.k
    public final void j(Object obj, long j10, double d) {
        t(obj, j10, Double.doubleToLongBits(d));
    }

    @Override // h2.k
    public final void k(Object obj, long j10, float f10) {
        s(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // h2.k
    public final boolean l(Object obj, long j10) {
        return o3.f15316g ? o3.n(obj, j10) : o3.o(obj, j10);
    }
}
