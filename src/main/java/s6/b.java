package s6;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class b extends j {

    /* renamed from: a  reason: collision with root package name */
    public final long f14852a;

    /* renamed from: b  reason: collision with root package name */
    public final l6.q f14853b;

    /* renamed from: c  reason: collision with root package name */
    public final l6.m f14854c;

    public b(long j10, l6.q qVar, l6.m mVar) {
        this.f14852a = j10;
        Objects.requireNonNull(qVar, "Null transportContext");
        this.f14853b = qVar;
        Objects.requireNonNull(mVar, "Null event");
        this.f14854c = mVar;
    }

    @Override // s6.j
    public l6.m a() {
        return this.f14854c;
    }

    @Override // s6.j
    public long b() {
        return this.f14852a;
    }

    @Override // s6.j
    public l6.q c() {
        return this.f14853b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return this.f14852a == jVar.b() && this.f14853b.equals(jVar.c()) && this.f14854c.equals(jVar.a());
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f14852a;
        return this.f14854c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f14853b.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("PersistedEvent{id=");
        m10.append(this.f14852a);
        m10.append(", transportContext=");
        m10.append(this.f14853b);
        m10.append(", event=");
        m10.append(this.f14854c);
        m10.append("}");
        return m10.toString();
    }
}
