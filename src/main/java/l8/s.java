package l8;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: e  reason: collision with root package name */
    public static final s f12742e = new s(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f12743a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12744b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12745c;
    public final float d;

    public s(int i10, int i11) {
        this.f12743a = i10;
        this.f12744b = i11;
        this.f12745c = 0;
        this.d = 1.0f;
    }

    public s(int i10, int i11, int i12, float f10) {
        this.f12743a = i10;
        this.f12744b = i11;
        this.f12745c = i12;
        this.d = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f12743a == sVar.f12743a && this.f12744b == sVar.f12744b && this.f12745c == sVar.f12745c && this.d == sVar.d;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((217 + this.f12743a) * 31) + this.f12744b) * 31) + this.f12745c) * 31);
    }
}
