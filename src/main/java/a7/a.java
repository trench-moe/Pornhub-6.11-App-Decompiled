package a7;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f201a;

    /* renamed from: b  reason: collision with root package name */
    public final int f202b;

    /* renamed from: c  reason: collision with root package name */
    public final int f203c;

    public a(int i10, int i11, int i12) {
        this.f201a = i10;
        this.f202b = i11;
        this.f203c = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f201a == aVar.f201a && this.f202b == aVar.f202b && this.f203c == aVar.f203c;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f201a) * 31) + this.f202b) * 31) + this.f203c;
    }
}
