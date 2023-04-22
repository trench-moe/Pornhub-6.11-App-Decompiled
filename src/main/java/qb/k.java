package qb;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class k {

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final qb.b<?> f14466a;

        /* renamed from: b  reason: collision with root package name */
        public final Set<b> f14467b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public final Set<b> f14468c = new HashSet();

        public b(qb.b<?> bVar) {
            this.f14466a = bVar;
        }

        public boolean a() {
            return this.f14468c.isEmpty();
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Class<?> f14469a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f14470b;

        public c(Class cls, boolean z10, a aVar) {
            this.f14469a = cls;
            this.f14470b = z10;
        }

        public boolean equals(Object obj) {
            boolean z10 = false;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f14469a.equals(this.f14469a) && cVar.f14470b == this.f14470b) {
                    z10 = true;
                }
            }
            return z10;
        }

        public int hashCode() {
            return ((this.f14469a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f14470b).hashCode();
        }
    }

    public static void a(List<qb.b<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<qb.b<?>> it = list.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                for (Set<b> set2 : hashMap.values()) {
                    for (b bVar : set2) {
                        for (l lVar : bVar.f14466a.f14447b) {
                            if ((lVar.f14473c == 0) && (set = (Set) hashMap.get(new c(lVar.f14471a, lVar.a(), null))) != null) {
                                for (b bVar2 : set) {
                                    bVar.f14467b.add(bVar2);
                                    bVar2.f14468c.add(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set set3 : hashMap.values()) {
                    hashSet.addAll(set3);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b bVar3 = (b) it2.next();
                    if (bVar3.a()) {
                        hashSet2.add(bVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    b bVar4 = (b) hashSet2.iterator().next();
                    hashSet2.remove(bVar4);
                    i10++;
                    while (true) {
                        for (b bVar5 : bVar4.f14467b) {
                            bVar5.f14468c.remove(bVar4);
                            if (bVar5.a()) {
                                hashSet2.add(bVar5);
                            }
                        }
                    }
                }
                if (i10 == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it3 = hashSet.iterator();
                loop11: while (true) {
                    while (it3.hasNext()) {
                        b bVar6 = (b) it3.next();
                        if (!bVar6.a() && !bVar6.f14467b.isEmpty()) {
                            arrayList.add(bVar6.f14466a);
                        }
                    }
                    break loop11;
                }
                throw new DependencyCycleException(arrayList);
            }
            qb.b<?> next = it.next();
            b bVar7 = new b(next);
            for (Class<? super Object> cls : next.f14446a) {
                boolean z10 = !next.b();
                c cVar = new c(cls, z10, null);
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set4 = (Set) hashMap.get(cVar);
                if (!set4.isEmpty() && !z10) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set4.add(bVar7);
            }
        }
    }
}
