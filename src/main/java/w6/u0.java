package w6;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: c  reason: collision with root package name */
    public static final u0 f16746c;

    /* renamed from: a  reason: collision with root package name */
    public final long f16747a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16748b;

    static {
        u0 u0Var = new u0(0L, 0L);
        new u0(Long.MAX_VALUE, Long.MAX_VALUE);
        new u0(Long.MAX_VALUE, 0L);
        new u0(0L, Long.MAX_VALUE);
        f16746c = u0Var;
    }

    public u0(long j10, long j11) {
        k8.a.c(j10 >= 0);
        k8.a.c(j11 >= 0);
        this.f16747a = j10;
        this.f16748b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f16747a == u0Var.f16747a && this.f16748b == u0Var.f16748b;
    }

    public int hashCode() {
        return (((int) this.f16747a) * 31) + ((int) this.f16748b);
    }
}
