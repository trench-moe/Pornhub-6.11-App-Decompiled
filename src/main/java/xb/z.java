package xb;

import java.util.Objects;
import xb.c0;

/* loaded from: classes2.dex */
public final class z extends c0.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f18345a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18346b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f18347c;

    public z(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "Null osRelease");
        this.f18345a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f18346b = str2;
        this.f18347c = z10;
    }

    @Override // xb.c0.c
    public boolean a() {
        return this.f18347c;
    }

    @Override // xb.c0.c
    public String b() {
        return this.f18346b;
    }

    @Override // xb.c0.c
    public String c() {
        return this.f18345a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.c) {
            c0.c cVar = (c0.c) obj;
            return this.f18345a.equals(cVar.c()) && this.f18346b.equals(cVar.b()) && this.f18347c == cVar.a();
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f18345a.hashCode() ^ 1000003) * 1000003) ^ this.f18346b.hashCode()) * 1000003) ^ (this.f18347c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("OsData{osRelease=");
        m10.append(this.f18345a);
        m10.append(", osCodeName=");
        m10.append(this.f18346b);
        m10.append(", isRooted=");
        m10.append(this.f18347c);
        m10.append("}");
        return m10.toString();
    }
}
