package w9;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class f implements o {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17130c;

    public f(Boolean bool) {
        this.f17130c = bool == null ? false : bool.booleanValue();
    }

    @Override // w9.o
    public final Boolean b() {
        return Boolean.valueOf(this.f17130c);
    }

    @Override // w9.o
    public final o c() {
        return new f(Boolean.valueOf(this.f17130c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f17130c == ((f) obj).f17130c;
    }

    @Override // w9.o
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f17130c).hashCode();
    }

    @Override // w9.o
    public final o j(String str, h2.h hVar, List list) {
        if ("toString".equals(str)) {
            return new s(Boolean.toString(this.f17130c));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f17130c), str));
    }

    public final String toString() {
        return String.valueOf(this.f17130c);
    }

    @Override // w9.o
    public final Double zzh() {
        return Double.valueOf(true != this.f17130c ? 0.0d : 1.0d);
    }

    @Override // w9.o
    public final String zzi() {
        return Boolean.toString(this.f17130c);
    }
}
