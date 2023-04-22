package w9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class e6 extends g6 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f17122c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // w9.g6
    public final void a(Object obj, long j10) {
        List unmodifiableList;
        List list = (List) v7.j(obj, j10);
        if (list instanceof d6) {
            unmodifiableList = ((d6) list).d();
        } else if (f17122c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof y6) && (list instanceof a6)) {
                a6 a6Var = (a6) list;
                if (a6Var.a()) {
                    a6Var.zzb();
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        v7.f17349c.r(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w9.g6
    public final void b(Object obj, Object obj2, long j10) {
        c6 c6Var;
        List list = (List) v7.j(obj2, j10);
        int size = list.size();
        c6 c6Var2 = (List) v7.j(obj, j10);
        if (c6Var2.isEmpty()) {
            c6Var2 = c6Var2 instanceof d6 ? new c6(size) : ((c6Var2 instanceof y6) && (c6Var2 instanceof a6)) ? ((a6) c6Var2).i(size) : new ArrayList(size);
            v7.f17349c.r(obj, j10, c6Var2);
        } else {
            if (f17122c.isAssignableFrom(c6Var2.getClass())) {
                ArrayList arrayList = new ArrayList(c6Var2.size() + size);
                arrayList.addAll(c6Var2);
                v7.f17349c.r(obj, j10, arrayList);
                c6Var = arrayList;
            } else if (c6Var2 instanceof r7) {
                c6 c6Var3 = new c6(c6Var2.size() + size);
                c6Var3.addAll(c6Var3.size(), (r7) c6Var2);
                v7.f17349c.r(obj, j10, c6Var3);
                c6Var = c6Var3;
            } else if ((c6Var2 instanceof y6) && (c6Var2 instanceof a6)) {
                a6 a6Var = (a6) c6Var2;
                if (!a6Var.a()) {
                    c6Var2 = a6Var.i(c6Var2.size() + size);
                    v7.f17349c.r(obj, j10, c6Var2);
                }
            }
            c6Var2 = c6Var;
        }
        int size2 = c6Var2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            c6Var2.addAll(list);
        }
        if (size2 > 0) {
            list = c6Var2;
        }
        v7.f17349c.r(obj, j10, list);
    }
}
