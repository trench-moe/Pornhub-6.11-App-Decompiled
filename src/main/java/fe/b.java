package fe;

import io.realm.ImportFlag;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Util;
import io.realm.internal.c;
import io.realm.internal.l;
import io.realm.internal.m;
import io.realm.internal.n;
import io.realm.p;
import io.realm.u;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class b extends m {

    /* renamed from: a  reason: collision with root package name */
    public final m f9574a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Class<? extends u>> f9575b;

    public b(m mVar, Collection<Class<? extends u>> collection) {
        this.f9574a = mVar;
        HashSet hashSet = new HashSet();
        if (mVar != null) {
            Set<Class<? extends u>> e10 = mVar.e();
            for (Class<? extends u> cls : collection) {
                if (e10.contains(cls)) {
                    hashSet.add(cls);
                }
            }
        }
        this.f9575b = Collections.unmodifiableSet(hashSet);
    }

    @Override // io.realm.internal.m
    public <E extends u> E a(p pVar, E e10, boolean z10, Map<u, l> map, Set<ImportFlag> set) {
        k(Util.a(e10.getClass()));
        return (E) this.f9574a.a(pVar, e10, z10, map, set);
    }

    @Override // io.realm.internal.m
    public c b(Class<? extends u> cls, OsSchemaInfo osSchemaInfo) {
        k(cls);
        return this.f9574a.b(cls, osSchemaInfo);
    }

    @Override // io.realm.internal.m
    public Map<Class<? extends u>, OsObjectSchemaInfo> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Class<? extends u>, OsObjectSchemaInfo> entry : this.f9574a.c().entrySet()) {
            if (this.f9575b.contains(entry.getKey())) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    @Override // io.realm.internal.m
    public Set<Class<? extends u>> e() {
        return this.f9575b;
    }

    @Override // io.realm.internal.m
    public String g(Class<? extends u> cls) {
        k(cls);
        return this.f9574a.f(cls);
    }

    @Override // io.realm.internal.m
    public <E extends u> boolean h(Class<E> cls) {
        k(Util.a(cls));
        return this.f9574a.h(cls);
    }

    @Override // io.realm.internal.m
    public <E extends u> E i(Class<E> cls, Object obj, n nVar, c cVar, boolean z10, List<String> list) {
        k(cls);
        return (E) this.f9574a.i(cls, obj, nVar, cVar, z10, list);
    }

    @Override // io.realm.internal.m
    public boolean j() {
        m mVar = this.f9574a;
        if (mVar == null) {
            return true;
        }
        return mVar.j();
    }

    public final void k(Class<? extends u> cls) {
        if (this.f9575b.contains(cls)) {
            return;
        }
        throw new IllegalArgumentException(cls.getSimpleName() + " is not part of the schema for this Realm");
    }
}
