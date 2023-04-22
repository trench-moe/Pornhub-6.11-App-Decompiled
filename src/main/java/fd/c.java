package fd;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f9555a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f9556b;

    /* renamed from: c  reason: collision with root package name */
    public final a f9557c;
    public final String d;

    public c(String str, Class<?> cls, a aVar, String str2) {
        this.f9555a = str;
        this.f9556b = cls;
        this.f9557c = aVar;
        this.d = str2;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("[PropertyDescription ");
        m10.append(this.f9555a);
        m10.append(",");
        m10.append(this.f9556b);
        m10.append(", ");
        m10.append(this.f9557c);
        m10.append("/");
        return android.support.v4.media.b.m(m10, this.d, "]");
    }
}
