package gf;

import pe.a0;
import pe.y;

/* loaded from: classes2.dex */
public final class t<T> {

    /* renamed from: a  reason: collision with root package name */
    public final y f10076a;

    /* renamed from: b  reason: collision with root package name */
    public final T f10077b;

    public t(y yVar, T t2, a0 a0Var) {
        this.f10076a = yVar;
        this.f10077b = t2;
    }

    public static <T> t<T> b(T t2, y yVar) {
        if (yVar.f()) {
            return new t<>(yVar, t2, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public boolean a() {
        return this.f10076a.f();
    }

    public String toString() {
        return this.f10076a.toString();
    }
}
