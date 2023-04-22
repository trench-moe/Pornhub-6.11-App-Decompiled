package w6;

/* loaded from: classes2.dex */
public final class m0 {
    public static final m0 d = new m0(1.0f, 1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f16678a;

    /* renamed from: b  reason: collision with root package name */
    public final float f16679b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16680c;

    public m0(float f10, float f11) {
        k8.a.c(f10 > 0.0f);
        k8.a.c(f11 > 0.0f);
        this.f16678a = f10;
        this.f16679b = f11;
        this.f16680c = Math.round(f10 * 1000.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m0.class != obj.getClass()) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f16678a == m0Var.f16678a && this.f16679b == m0Var.f16679b;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f16679b) + ((Float.floatToRawIntBits(this.f16678a) + 527) * 31);
    }

    public String toString() {
        return k8.c0.k("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f16678a), Float.valueOf(this.f16679b));
    }
}
