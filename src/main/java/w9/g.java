package w9;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class g implements o {

    /* renamed from: c  reason: collision with root package name */
    public final o f17159c;

    /* renamed from: f  reason: collision with root package name */
    public final String f17160f;

    public g() {
        throw null;
    }

    public g(String str) {
        this.f17159c = o.f17256k;
        this.f17160f = str;
    }

    public g(String str, o oVar) {
        this.f17159c = oVar;
        this.f17160f = str;
    }

    @Override // w9.o
    public final Boolean b() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // w9.o
    public final o c() {
        return new g(this.f17160f, this.f17159c.c());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f17160f.equals(gVar.f17160f) && this.f17159c.equals(gVar.f17159c);
        }
        return false;
    }

    @Override // w9.o
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return this.f17159c.hashCode() + (this.f17160f.hashCode() * 31);
    }

    @Override // w9.o
    public final o j(String str, h2.h hVar, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // w9.o
    public final Double zzh() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // w9.o
    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }
}
