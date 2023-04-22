package sc;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final String f14948a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14949b;

    public a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f14948a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f14949b = str2;
    }

    @Override // sc.d
    public String a() {
        return this.f14948a;
    }

    @Override // sc.d
    public String b() {
        return this.f14949b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f14948a.equals(dVar.a()) && this.f14949b.equals(dVar.b());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f14948a.hashCode() ^ 1000003) * 1000003) ^ this.f14949b.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("LibraryVersion{libraryName=");
        m10.append(this.f14948a);
        m10.append(", version=");
        return android.support.v4.media.b.m(m10, this.f14949b, "}");
    }
}
