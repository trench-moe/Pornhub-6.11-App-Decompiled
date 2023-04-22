package e9;

import d9.a;
import d9.a.d;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    public final int f9146a;

    /* renamed from: b  reason: collision with root package name */
    public final d9.a<O> f9147b;

    /* renamed from: c  reason: collision with root package name */
    public final O f9148c;
    public final String d;

    public a(d9.a<O> aVar, O o10, String str) {
        this.f9147b = aVar;
        this.f9148c = o10;
        this.d = str;
        this.f9146a = Arrays.hashCode(new Object[]{aVar, o10, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return h9.m.a(this.f9147b, aVar.f9147b) && h9.m.a(this.f9148c, aVar.f9148c) && h9.m.a(this.d, aVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9146a;
    }
}
