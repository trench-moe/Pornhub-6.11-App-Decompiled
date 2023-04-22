package i6;

import com.google.android.datatransport.Priority;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f10541a;

    /* renamed from: b  reason: collision with root package name */
    public final T f10542b;

    /* renamed from: c  reason: collision with root package name */
    public final Priority f10543c;

    public a(Integer num, T t2, Priority priority) {
        this.f10541a = num;
        Objects.requireNonNull(t2, "Null payload");
        this.f10542b = t2;
        this.f10543c = priority;
    }

    @Override // i6.c
    public Integer a() {
        return this.f10541a;
    }

    @Override // i6.c
    public T b() {
        return this.f10542b;
    }

    @Override // i6.c
    public Priority c() {
        return this.f10543c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            Integer num = this.f10541a;
            if (num != null) {
                if (num.equals(cVar.a())) {
                    if (this.f10542b.equals(cVar.b())) {
                        return true;
                    }
                }
                return false;
            }
            if (cVar.a() == null) {
                if (this.f10542b.equals(cVar.b()) && this.f10543c.equals(cVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f10541a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f10542b.hashCode()) * 1000003) ^ this.f10543c.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Event{code=");
        m10.append(this.f10541a);
        m10.append(", payload=");
        m10.append(this.f10542b);
        m10.append(", priority=");
        m10.append(this.f10543c);
        m10.append("}");
        return m10.toString();
    }
}
