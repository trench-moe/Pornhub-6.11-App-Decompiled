package m6;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12913a;

    /* renamed from: b  reason: collision with root package name */
    public final u6.a f12914b;

    /* renamed from: c  reason: collision with root package name */
    public final u6.a f12915c;
    public final String d;

    public b(Context context, u6.a aVar, u6.a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f12913a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f12914b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f12915c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.d = str;
    }

    @Override // m6.f
    public Context a() {
        return this.f12913a;
    }

    @Override // m6.f
    public String b() {
        return this.d;
    }

    @Override // m6.f
    public u6.a c() {
        return this.f12915c;
    }

    @Override // m6.f
    public u6.a d() {
        return this.f12914b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f12913a.equals(fVar.a()) && this.f12914b.equals(fVar.d()) && this.f12915c.equals(fVar.c()) && this.d.equals(fVar.b());
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f12913a.hashCode() ^ 1000003) * 1000003) ^ this.f12914b.hashCode()) * 1000003) ^ this.f12915c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("CreationContext{applicationContext=");
        m10.append(this.f12913a);
        m10.append(", wallClock=");
        m10.append(this.f12914b);
        m10.append(", monotonicClock=");
        m10.append(this.f12915c);
        m10.append(", backendName=");
        return android.support.v4.media.b.m(m10, this.d, "}");
    }
}
