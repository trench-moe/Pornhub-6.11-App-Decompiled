package w9;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class t implements o {
    @Override // w9.o
    public final Boolean b() {
        return Boolean.FALSE;
    }

    @Override // w9.o
    public final o c() {
        return o.f17256k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof t;
    }

    @Override // w9.o
    public final Iterator h() {
        return null;
    }

    @Override // w9.o
    public final o j(String str, h2.h hVar, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    @Override // w9.o
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // w9.o
    public final String zzi() {
        return "undefined";
    }
}
