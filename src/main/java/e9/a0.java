package e9;

import h9.m;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final a<?> f9149a;

    /* renamed from: b  reason: collision with root package name */
    public final c9.d f9150b;

    public /* synthetic */ a0(a aVar, c9.d dVar) {
        this.f9149a = aVar;
        this.f9150b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof a0)) {
            a0 a0Var = (a0) obj;
            if (h9.m.a(this.f9149a, a0Var.f9149a) && h9.m.a(this.f9150b, a0Var.f9150b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9149a, this.f9150b});
    }

    public final String toString() {
        m.a aVar = new m.a(this);
        aVar.a("key", this.f9149a);
        aVar.a("feature", this.f9150b);
        return aVar.toString();
    }
}
