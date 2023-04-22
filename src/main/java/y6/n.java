package y6;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final int f18474a;

    /* renamed from: b  reason: collision with root package name */
    public final float f18475b;

    public n(int i10, float f10) {
        this.f18474a = i10;
        this.f18475b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            return this.f18474a == nVar.f18474a && Float.compare(nVar.f18475b, this.f18475b) == 0;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f18475b) + ((527 + this.f18474a) * 31);
    }
}
