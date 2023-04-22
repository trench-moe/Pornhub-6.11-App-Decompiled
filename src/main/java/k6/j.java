package k6;

/* loaded from: classes2.dex */
public final class j extends n {

    /* renamed from: a  reason: collision with root package name */
    public final long f11878a;

    public j(long j10) {
        this.f11878a = j10;
    }

    @Override // k6.n
    public long b() {
        return this.f11878a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f11878a == ((n) obj).b();
    }

    public int hashCode() {
        long j10 = this.f11878a;
        return 1000003 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("LogResponse{nextRequestWaitMillis=");
        m10.append(this.f11878a);
        m10.append("}");
        return m10.toString();
    }
}
