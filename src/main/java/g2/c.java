package g2;

import i2.i;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final List<i> f9707a;

    /* renamed from: b  reason: collision with root package name */
    public final char f9708b;

    /* renamed from: c  reason: collision with root package name */
    public final double f9709c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9710e;

    public c(List<i> list, char c10, double d, double d10, String str, String str2) {
        this.f9707a = list;
        this.f9708b = c10;
        this.f9709c = d10;
        this.d = str;
        this.f9710e = str2;
    }

    public static int a(char c10, String str, String str2) {
        return str2.hashCode() + a1.a.b(str, (c10 + 0) * 31, 31);
    }

    public int hashCode() {
        return a(this.f9708b, this.f9710e, this.d);
    }
}
