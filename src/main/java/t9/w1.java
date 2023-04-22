package t9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class w1 extends y1 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class<?> f15364c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // t9.y1
    public final void a(Object obj, long j10) {
        List unmodifiableList;
        List list = (List) o3.j(obj, j10);
        if (list instanceof v1) {
            unmodifiableList = ((v1) list).c();
        } else if (f15364c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof p2) && (list instanceof s1)) {
                s1 s1Var = (s1) list;
                if (s1Var.a()) {
                    s1Var.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        o3.f15313c.u(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t9.y1
    public final <E> void b(Object obj, Object obj2, long j10) {
        u1 u1Var;
        List list = (List) o3.j(obj2, j10);
        int size = list.size();
        List list2 = (List) o3.j(obj, j10);
        if (list2.isEmpty()) {
            list2 = list2 instanceof v1 ? new u1(size) : ((list2 instanceof p2) && (list2 instanceof s1)) ? ((s1) list2).zzg(size) : new ArrayList(size);
            o3.f15313c.u(obj, j10, list2);
        } else {
            if (f15364c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                o3.f15313c.u(obj, j10, arrayList);
                u1Var = arrayList;
            } else if (list2 instanceof k3) {
                u1 u1Var2 = new u1(list2.size() + size);
                u1Var2.addAll(u1Var2.size(), (k3) list2);
                o3.f15313c.u(obj, j10, u1Var2);
                u1Var = u1Var2;
            } else if ((list2 instanceof p2) && (list2 instanceof s1)) {
                s1 s1Var = (s1) list2;
                if (!s1Var.a()) {
                    list2 = s1Var.zzg(list2.size() + size);
                    o3.f15313c.u(obj, j10, list2);
                }
            }
            list2 = u1Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        o3.f15313c.u(obj, j10, list);
    }
}
