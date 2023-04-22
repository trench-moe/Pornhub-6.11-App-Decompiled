package com.google.android.gms.internal.measurement;

import java.util.logging.Logger;
import t9.k0;
import w9.b6;
import w9.c7;
import w9.f5;
import w9.s6;
import w9.v7;

/* loaded from: classes.dex */
public abstract class e extends cb.e {
    public static final Logger Q = Logger.getLogger(e.class.getName());
    public static final boolean R = v7.f17350e;
    public f5 P;

    public e() {
    }

    public /* synthetic */ e(k0 k0Var) {
    }

    public static int C0(zzix zzixVar) {
        int g10 = zzixVar.g();
        return l0(g10) + g10;
    }

    @Deprecated
    public static int D0(int i10, s6 s6Var, c7 c7Var) {
        int l02 = l0(i10 << 3);
        int i11 = l02 + l02;
        c cVar = (c) s6Var;
        int e10 = cVar.e();
        if (e10 == -1) {
            e10 = c7Var.c(cVar);
            cVar.h(e10);
        }
        return i11 + e10;
    }

    public static int E0(int i10) {
        if (i10 >= 0) {
            return l0(i10);
        }
        return 10;
    }

    public static int F0(s6 s6Var, c7 c7Var) {
        c cVar = (c) s6Var;
        int e10 = cVar.e();
        if (e10 == -1) {
            e10 = c7Var.c(cVar);
            cVar.h(e10);
        }
        return l0(e10) + e10;
    }

    public static int G0(String str) {
        int length;
        try {
            length = h.c(str);
        } catch (zzmp unused) {
            length = str.getBytes(b6.f17081a).length;
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

    public abstract void p0(int i10, zzix zzixVar);

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
