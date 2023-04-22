package sc;

import android.content.Context;
import qb.b;
import qb.l;
import qb.r;

/* loaded from: classes2.dex */
public class f {

    /* loaded from: classes2.dex */
    public interface a<T> {
        String a(T t2);
    }

    public static qb.b<?> a(String str, String str2) {
        sc.a aVar = new sc.a(str, str2);
        b.C0250b a10 = qb.b.a(d.class);
        a10.d = 1;
        a10.f14454e = new qb.a(aVar);
        return a10.b();
    }

    public static qb.b<?> b(final String str, final a<Context> aVar) {
        b.C0250b a10 = qb.b.a(d.class);
        a10.d = 1;
        a10.a(new l(Context.class, 1, 0));
        a10.f14454e = new qb.e() { // from class: sc.e
            @Override // qb.e
            public final Object a(qb.c cVar) {
                return new a(str, aVar.a((Context) ((r) cVar).a(Context.class)));
            }
        };
        return a10.b();
    }
}
