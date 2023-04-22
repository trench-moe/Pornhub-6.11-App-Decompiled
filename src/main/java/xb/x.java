package xb;

import java.util.Objects;
import xb.c0;

/* loaded from: classes2.dex */
public final class x extends c0.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f18332a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18333b;

    /* renamed from: c  reason: collision with root package name */
    public final String f18334c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18335e;

    /* renamed from: f  reason: collision with root package name */
    public final sb.d f18336f;

    public x(String str, String str2, String str3, String str4, int i10, sb.d dVar) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f18332a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f18333b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f18334c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.d = str4;
        this.f18335e = i10;
        Objects.requireNonNull(dVar, "Null developmentPlatformProvider");
        this.f18336f = dVar;
    }

    @Override // xb.c0.a
    public String a() {
        return this.f18332a;
    }

    @Override // xb.c0.a
    public int b() {
        return this.f18335e;
    }

    @Override // xb.c0.a
    public sb.d c() {
        return this.f18336f;
    }

    @Override // xb.c0.a
    public String d() {
        return this.d;
    }

    @Override // xb.c0.a
    public String e() {
        return this.f18333b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.a) {
            c0.a aVar = (c0.a) obj;
            return this.f18332a.equals(aVar.a()) && this.f18333b.equals(aVar.e()) && this.f18334c.equals(aVar.f()) && this.d.equals(aVar.d()) && this.f18335e == aVar.b() && this.f18336f.equals(aVar.c());
        }
        return false;
    }

    @Override // xb.c0.a
    public String f() {
        return this.f18334c;
    }

    public int hashCode() {
        return ((((((((((this.f18332a.hashCode() ^ 1000003) * 1000003) ^ this.f18333b.hashCode()) * 1000003) ^ this.f18334c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f18335e) * 1000003) ^ this.f18336f.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("AppData{appIdentifier=");
        m10.append(this.f18332a);
        m10.append(", versionCode=");
        m10.append(this.f18333b);
        m10.append(", versionName=");
        m10.append(this.f18334c);
        m10.append(", installUuid=");
        m10.append(this.d);
        m10.append(", deliveryMechanism=");
        m10.append(this.f18335e);
        m10.append(", developmentPlatformProvider=");
        m10.append(this.f18336f);
        m10.append("}");
        return m10.toString();
    }
}
