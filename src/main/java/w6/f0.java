package w6;

import com.google.android.exoplayer2.source.i;

/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final i.a f16580a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16581b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16582c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f16583e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f16584f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f16585g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f16586h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f16587i;

    public f0(i.a aVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        k8.a.c(!z13 || z11);
        k8.a.c(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        k8.a.c(z14);
        this.f16580a = aVar;
        this.f16581b = j10;
        this.f16582c = j11;
        this.d = j12;
        this.f16583e = j13;
        this.f16584f = z10;
        this.f16585g = z11;
        this.f16586h = z12;
        this.f16587i = z13;
    }

    public f0 a(long j10) {
        return j10 == this.f16582c ? this : new f0(this.f16580a, this.f16581b, j10, this.d, this.f16583e, this.f16584f, this.f16585g, this.f16586h, this.f16587i);
    }

    public f0 b(long j10) {
        return j10 == this.f16581b ? this : new f0(this.f16580a, j10, this.f16582c, this.d, this.f16583e, this.f16584f, this.f16585g, this.f16586h, this.f16587i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f16581b == f0Var.f16581b && this.f16582c == f0Var.f16582c && this.d == f0Var.d && this.f16583e == f0Var.f16583e && this.f16584f == f0Var.f16584f && this.f16585g == f0Var.f16585g && this.f16586h == f0Var.f16586h && this.f16587i == f0Var.f16587i && k8.c0.a(this.f16580a, f0Var.f16580a);
    }

    public int hashCode() {
        return ((((((((((((((((this.f16580a.hashCode() + 527) * 31) + ((int) this.f16581b)) * 31) + ((int) this.f16582c)) * 31) + ((int) this.d)) * 31) + ((int) this.f16583e)) * 31) + (this.f16584f ? 1 : 0)) * 31) + (this.f16585g ? 1 : 0)) * 31) + (this.f16586h ? 1 : 0)) * 31) + (this.f16587i ? 1 : 0);
    }
}
