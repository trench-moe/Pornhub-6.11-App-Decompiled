package sc;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f14950a;

    /* renamed from: b  reason: collision with root package name */
    public final c f14951b;

    public b(Set<d> set, c cVar) {
        this.f14950a = b(set);
        this.f14951b = cVar;
    }

    public static String b(Set<d> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            d next = it.next();
            sb2.append(next.a());
            sb2.append('/');
            sb2.append(next.b());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // sc.g
    public String a() {
        if (this.f14951b.c().isEmpty()) {
            return this.f14950a;
        }
        return this.f14950a + ' ' + b(this.f14951b.c());
    }
}
