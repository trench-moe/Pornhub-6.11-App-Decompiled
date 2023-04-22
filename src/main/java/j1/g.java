package j1;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f11211a;

    /* renamed from: b  reason: collision with root package name */
    public k f11212b;

    public g(k kVar, boolean z10) {
        if (kVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.f11211a = bundle;
        this.f11212b = kVar;
        bundle.putBundle("selector", kVar.f11275a);
        bundle.putBoolean("activeScan", z10);
    }

    public final void a() {
        if (this.f11212b == null) {
            k b10 = k.b(this.f11211a.getBundle("selector"));
            this.f11212b = b10;
            if (b10 == null) {
                this.f11212b = k.f11274c;
            }
        }
    }

    public boolean b() {
        return this.f11211a.getBoolean("activeScan");
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            a();
            k kVar = this.f11212b;
            gVar.a();
            return kVar.equals(gVar.f11212b) && b() == gVar.b();
        }
        return false;
    }

    public int hashCode() {
        a();
        return this.f11212b.hashCode() ^ b();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f11212b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        k kVar = this.f11212b;
        kVar.a();
        sb2.append(!kVar.f11276b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
