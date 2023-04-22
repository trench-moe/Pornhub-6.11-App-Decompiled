package gc;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f9938a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Object> f9939b;

    public c(String str, Map<Class<?>, Object> map) {
        this.f9938a = str;
        this.f9939b = map;
    }

    public c(String str, Map map, a aVar) {
        this.f9938a = str;
        this.f9939b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f9938a.equals(cVar.f9938a) && this.f9939b.equals(cVar.f9939b);
        }
        return false;
    }

    public int hashCode() {
        return this.f9939b.hashCode() + (this.f9938a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("FieldDescriptor{name=");
        m10.append(this.f9938a);
        m10.append(", properties=");
        m10.append(this.f9939b.values());
        m10.append("}");
        return m10.toString();
    }
}
