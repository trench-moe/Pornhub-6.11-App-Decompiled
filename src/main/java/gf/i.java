package gf;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Method f9967a;

    /* renamed from: b  reason: collision with root package name */
    public final List<?> f9968b;

    public i(Method method, List<?> list) {
        this.f9967a = method;
        this.f9968b = Collections.unmodifiableList(list);
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f9967a.getDeclaringClass().getName(), this.f9967a.getName(), this.f9968b);
    }
}
