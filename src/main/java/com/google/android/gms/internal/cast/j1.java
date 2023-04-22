package com.google.android.gms.internal.cast;

import java.util.logging.Logger;
import t9.j2;
import t9.o3;
import t9.t1;
import t9.t2;

/* loaded from: classes.dex */
public abstract class j1 extends cb.e {
    public static final Logger Q = Logger.getLogger(j1.class.getName());
    public static final boolean R = o3.f15314e;
    public k1 P;

    public j1() {
    }

    public /* synthetic */ j1(a0.b bVar) {
    }

    public static int C0(zzoe zzoeVar) {
        int g10 = zzoeVar.g();
        return l0(g10) + g10;
    }

    @Deprecated
    public static int D0(int i10, j2 j2Var, t2 t2Var) {
        int l02 = l0(i10 << 3);
        int i11 = l02 + l02;
        h1 h1Var = (h1) j2Var;
        int a10 = h1Var.a();
        if (a10 == -1) {
            a10 = t2Var.c(h1Var);
            h1Var.b(a10);
        }
        return i11 + a10;
    }

    public static int E0(int i10) {
        if (i10 >= 0) {
            return l0(i10);
        }
        return 10;
    }

    public static int F0(j2 j2Var, t2 t2Var) {
        h1 h1Var = (h1) j2Var;
        int a10 = h1Var.a();
        if (a10 == -1) {
            a10 = t2Var.c(h1Var);
            h1Var.b(a10);
        }
        return l0(a10) + a10;
    }

    public static int G0(String str) {
        int length;
        try {
            length = o1.c(str);
        } catch (zzrq unused) {
            length = str.getBytes(t1.f15353a).length;
        }
        return l0(length) + length;
    }

    public static int H0(int i10) {
        return l0(i10 << 3);
    }

    public static int l0(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int m0(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public abstract void A0(int i10, long j10);

    public abstract void B0(long j10);

    public abstract void n0(byte b10);

    public abstract void o0(int i10, boolean z10);

    public abstract void p0(int i10, zzoe zzoeVar);

    public abstract void q0(int i10, int i11);

    public abstract void r0(int i10);

    public abstract void s0(int i10, long j10);

    public abstract void t0(long j10);

    public abstract void u0(int i10, int i11);

    public abstract void v0(int i10);

    public abstract void w0(int i10, String str);

    public abstract void x0(int i10, int i11);

    public abstract void y0(int i10, int i11);

    public abstract void z0(int i10);
}
