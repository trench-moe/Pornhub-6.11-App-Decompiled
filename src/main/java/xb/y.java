package xb;

import java.util.Objects;
import xb.c0;

/* loaded from: classes2.dex */
public final class y extends c0.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f18337a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18338b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18339c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f18340e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f18341f;

    /* renamed from: g  reason: collision with root package name */
    public final int f18342g;

    /* renamed from: h  reason: collision with root package name */
    public final String f18343h;

    /* renamed from: i  reason: collision with root package name */
    public final String f18344i;

    public y(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f18337a = i10;
        Objects.requireNonNull(str, "Null model");
        this.f18338b = str;
        this.f18339c = i11;
        this.d = j10;
        this.f18340e = j11;
        this.f18341f = z10;
        this.f18342g = i12;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f18343h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f18344i = str3;
    }

    @Override // xb.c0.b
    public int a() {
        return this.f18337a;
    }

    @Override // xb.c0.b
    public int b() {
        return this.f18339c;
    }

    @Override // xb.c0.b
    public long c() {
        return this.f18340e;
    }

    @Override // xb.c0.b
    public boolean d() {
        return this.f18341f;
    }

    @Override // xb.c0.b
    public String e() {
        return this.f18343h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.b) {
            c0.b bVar = (c0.b) obj;
            return this.f18337a == bVar.a() && this.f18338b.equals(bVar.f()) && this.f18339c == bVar.b() && this.d == bVar.i() && this.f18340e == bVar.c() && this.f18341f == bVar.d() && this.f18342g == bVar.h() && this.f18343h.equals(bVar.e()) && this.f18344i.equals(bVar.g());
        }
        return false;
    }

    @Override // xb.c0.b
    public String f() {
        return this.f18338b;
    }

    @Override // xb.c0.b
    public String g() {
        return this.f18344i;
    }

    @Override // xb.c0.b
    public int h() {
        return this.f18342g;
    }

    public int hashCode() {
        long j10 = this.d;
        long j11 = this.f18340e;
        return ((((((((((((((((this.f18337a ^ 1000003) * 1000003) ^ this.f18338b.hashCode()) * 1000003) ^ this.f18339c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f18341f ? 1231 : 1237)) * 1000003) ^ this.f18342g) * 1000003) ^ this.f18343h.hashCode()) * 1000003) ^ this.f18344i.hashCode();
    }

    @Override // xb.c0.b
    public long i() {
        return this.d;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("DeviceData{arch=");
        m10.append(this.f18337a);
        m10.append(", model=");
        m10.append(this.f18338b);
        m10.append(", availableProcessors=");
        m10.append(this.f18339c);
        m10.append(", totalRam=");
        m10.append(this.d);
        m10.append(", diskSpace=");
        m10.append(this.f18340e);
        m10.append(", isEmulator=");
        m10.append(this.f18341f);
        m10.append(", state=");
        m10.append(this.f18342g);
        m10.append(", manufacturer=");
        m10.append(this.f18343h);
        m10.append(", modelClass=");
        return android.support.v4.media.b.m(m10, this.f18344i, "}");
    }
}
