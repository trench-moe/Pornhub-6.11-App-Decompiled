package w9;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class m implements o {
    @Override // w9.o
    public final Boolean b() {
        return Boolean.FALSE;
    }

    @Override // w9.o
    public final o c() {
        return o.f17257l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof m;
    }

    @Override // w9.o
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // w9.o
    public final o j(String str, h2.h hVar, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    @Override // w9.o
    public final Double zzh() {
        return Double.valueOf(0.0d);
    }

    @Override // w9.o
    public final String zzi() {
        return "null";
    }
}
