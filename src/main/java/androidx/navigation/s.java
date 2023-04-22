package androidx.navigation;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2711a;

    /* renamed from: b  reason: collision with root package name */
    public int f2712b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2713c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f2714e;

    /* renamed from: f  reason: collision with root package name */
    public int f2715f;

    /* renamed from: g  reason: collision with root package name */
    public int f2716g;

    public s(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14) {
        this.f2711a = z10;
        this.f2712b = i10;
        this.f2713c = z11;
        this.d = i11;
        this.f2714e = i12;
        this.f2715f = i13;
        this.f2716g = i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            return this.f2711a == sVar.f2711a && this.f2712b == sVar.f2712b && this.f2713c == sVar.f2713c && this.d == sVar.d && this.f2714e == sVar.f2714e && this.f2715f == sVar.f2715f && this.f2716g == sVar.f2716g;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((this.f2711a ? 1 : 0) * 31) + this.f2712b) * 31) + (this.f2713c ? 1 : 0)) * 31) + this.d) * 31) + this.f2714e) * 31) + this.f2715f) * 31) + this.f2716g;
    }
}
