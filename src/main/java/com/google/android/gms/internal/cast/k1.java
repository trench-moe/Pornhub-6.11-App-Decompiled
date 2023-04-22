package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import t9.j2;
import t9.t1;
import t9.t2;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public final j1 f6904a;

    public k1(j1 j1Var) {
        Charset charset = t1.f15353a;
        this.f6904a = j1Var;
        j1Var.P = this;
    }

    public final void a(int i10, long j10) {
        this.f6904a.A0(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void b(int i10, double d) {
        this.f6904a.s0(i10, Double.doubleToRawLongBits(d));
    }

    public final void c(int i10, float f10) {
        this.f6904a.q0(i10, Float.floatToRawIntBits(f10));
    }

    public final void d(int i10, Object obj, t2 t2Var) {
        j1 j1Var = this.f6904a;
        j1Var.x0(i10, 3);
        t2Var.g((j2) obj, j1Var.P);
        j1Var.x0(i10, 4);
    }

    public final void e(int i10, Object obj, t2 t2Var) {
        j2 j2Var = (j2) obj;
        i1 i1Var = (i1) this.f6904a;
        i1Var.z0((i10 << 3) | 2);
        h1 h1Var = (h1) j2Var;
        int a10 = h1Var.a();
        if (a10 == -1) {
            a10 = t2Var.c(h1Var);
            h1Var.b(a10);
        }
        i1Var.z0(a10);
        t2Var.g(j2Var, i1Var.P);
    }

    public final void f(int i10, int i11) {
        this.f6904a.y0(i10, (i11 >> 31) ^ (i11 + i11));
    }
}
