package qb;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f14471a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14472b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14473c;

    public l(Class<?> cls, int i10, int i11) {
        Objects.requireNonNull(cls, "Null dependency anInterface.");
        this.f14471a = cls;
        this.f14472b = i10;
        this.f14473c = i11;
    }

    public boolean a() {
        return this.f14472b == 2;
    }

    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f14471a == lVar.f14471a && this.f14472b == lVar.f14472b && this.f14473c == lVar.f14473c) {
                z10 = true;
            }
        }
        return z10;
    }

    public int hashCode() {
        return ((((this.f14471a.hashCode() ^ 1000003) * 1000003) ^ this.f14472b) * 1000003) ^ this.f14473c;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f14471a);
        sb2.append(", type=");
        int i10 = this.f14472b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i11 = this.f14473c;
        if (i11 == 0) {
            str = "direct";
        } else if (i11 == 1) {
            str = "provider";
        } else if (i11 != 2) {
            throw new AssertionError(a1.a.j("Unsupported injection: ", i11));
        } else {
            str = "deferred";
        }
        return android.support.v4.media.b.m(sb2, str, "}");
    }
}
