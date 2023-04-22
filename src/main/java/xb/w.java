package xb;

import java.util.Objects;
import xb.c0;

/* loaded from: classes2.dex */
public final class w extends c0 {

    /* renamed from: a  reason: collision with root package name */
    public final c0.a f18329a;

    /* renamed from: b  reason: collision with root package name */
    public final c0.c f18330b;

    /* renamed from: c  reason: collision with root package name */
    public final c0.b f18331c;

    public w(c0.a aVar, c0.c cVar, c0.b bVar) {
        Objects.requireNonNull(aVar, "Null appData");
        this.f18329a = aVar;
        Objects.requireNonNull(cVar, "Null osData");
        this.f18330b = cVar;
        Objects.requireNonNull(bVar, "Null deviceData");
        this.f18331c = bVar;
    }

    @Override // xb.c0
    public c0.a a() {
        return this.f18329a;
    }

    @Override // xb.c0
    public c0.b b() {
        return this.f18331c;
    }

    @Override // xb.c0
    public c0.c c() {
        return this.f18330b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return this.f18329a.equals(c0Var.a()) && this.f18330b.equals(c0Var.c()) && this.f18331c.equals(c0Var.b());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f18329a.hashCode() ^ 1000003) * 1000003) ^ this.f18330b.hashCode()) * 1000003) ^ this.f18331c.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("StaticSessionData{appData=");
        m10.append(this.f18329a);
        m10.append(", osData=");
        m10.append(this.f18330b);
        m10.append(", deviceData=");
        m10.append(this.f18331c);
        m10.append("}");
        return m10.toString();
    }
}
