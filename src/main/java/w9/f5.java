package w9;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class f5 {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.e f17135a;

    public f5(com.google.android.gms.internal.measurement.e eVar) {
        Charset charset = b6.f17081a;
        this.f17135a = eVar;
        eVar.P = this;
    }

    public final void a(int i10, int i11) {
        this.f17135a.y0(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void b(int i10, long j10) {
        this.f17135a.A0(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void c(int i10, double d) {
        this.f17135a.s0(i10, Double.doubleToRawLongBits(d));
    }

    public final void d(int i10, float f10) {
        this.f17135a.q0(i10, Float.floatToRawIntBits(f10));
    }

    public final void e(int i10, Object obj, c7 c7Var) {
        com.google.android.gms.internal.measurement.e eVar = this.f17135a;
        eVar.x0(i10, 3);
        c7Var.e((s6) obj, eVar.P);
        eVar.x0(i10, 4);
    }

    public final void f(int i10, Object obj, c7 c7Var) {
        Object obj2 = (s6) obj;
        com.google.android.gms.internal.measurement.d dVar = (com.google.android.gms.internal.measurement.d) this.f17135a;
        dVar.z0((i10 << 3) | 2);
        com.google.android.gms.internal.measurement.c cVar = (com.google.android.gms.internal.measurement.c) obj2;
        int e10 = cVar.e();
        if (e10 == -1) {
            e10 = c7Var.c(cVar);
            cVar.h(e10);
        }
        dVar.z0(e10);
        c7Var.e(obj2, dVar.P);
    }
}
