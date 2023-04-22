package c7;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c  reason: collision with root package name */
    public static final v f3833c = new v(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f3834a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3835b;

    public v(long j10, long j11) {
        this.f3834a = j10;
        this.f3835b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return this.f3834a == vVar.f3834a && this.f3835b == vVar.f3835b;
    }

    public int hashCode() {
        return (((int) this.f3834a) * 31) + ((int) this.f3835b);
    }

    public String toString() {
        long j10 = this.f3834a;
        long j11 = this.f3835b;
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("[timeUs=");
        sb2.append(j10);
        sb2.append(", position=");
        sb2.append(j11);
        sb2.append("]");
        return sb2.toString();
    }
}
