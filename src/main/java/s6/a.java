package s6;

/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    public final long f14845b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14846c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final long f14847e;

    /* renamed from: f  reason: collision with root package name */
    public final int f14848f;

    public a(long j10, int i10, int i11, long j11, int i12, C0262a c0262a) {
        this.f14845b = j10;
        this.f14846c = i10;
        this.d = i11;
        this.f14847e = j11;
        this.f14848f = i12;
    }

    @Override // s6.e
    public int a() {
        return this.d;
    }

    @Override // s6.e
    public long b() {
        return this.f14847e;
    }

    @Override // s6.e
    public int c() {
        return this.f14846c;
    }

    @Override // s6.e
    public int d() {
        return this.f14848f;
    }

    @Override // s6.e
    public long e() {
        return this.f14845b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f14845b == eVar.e() && this.f14846c == eVar.c() && this.d == eVar.a() && this.f14847e == eVar.b() && this.f14848f == eVar.d();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f14845b;
        long j11 = this.f14847e;
        return this.f14848f ^ ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f14846c) * 1000003) ^ this.d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("EventStoreConfig{maxStorageSizeInBytes=");
        m10.append(this.f14845b);
        m10.append(", loadBatchSize=");
        m10.append(this.f14846c);
        m10.append(", criticalSectionEnterTimeoutMs=");
        m10.append(this.d);
        m10.append(", eventCleanUpAge=");
        m10.append(this.f14847e);
        m10.append(", maxBlobByteSizePerRow=");
        return android.support.v4.media.a.j(m10, this.f14848f, "}");
    }
}
