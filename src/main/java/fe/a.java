package fe;

import io.realm.ImportFlag;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Util;
import io.realm.internal.c;
import io.realm.internal.l;
import io.realm.internal.m;
import io.realm.internal.n;
import io.realm.p;
import io.realm.u;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class a extends m {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<? extends u>, m> f9572a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Class<? extends u>> f9573b = new HashMap();

    public a(m... mVarArr) {
        HashMap hashMap = new HashMap();
        for (m mVar : mVarArr) {
            for (Class<? extends u> cls : mVar.e()) {
                String f10 = mVar.f(cls);
                Class<? extends u> cls2 = this.f9573b.get(f10);
                if (cls2 != null && !cls2.equals(cls)) {
                    throw new IllegalStateException(String.format("It is not allowed for two different model classes to share the same internal name in Realm. The classes %s and %s are being included from the modules '%s' and '%s' and they share the same internal name '%s'.", cls2, cls, hashMap.get(cls2), mVar, f10));
                }
                hashMap.put(cls, mVar);
                this.f9573b.put(f10, cls);
            }
        }
        this.f9572a = Collections.unmodifiableMap(hashMap);
    }

    @Override // io.realm.internal.m
    public <E extends u> E a(p pVar, E e10, boolean z10, Map<u, l> map, Set<ImportFlag> set) {
        return (E) k(Util.a(e10.getClass())).a(pVar, e10, z10, map, set);
    }

    @Override // io.realm.internal.m
    public c b(Class<? extends u> cls, OsSchemaInfo osSchemaInfo) {
        return k(cls).b(cls, osSchemaInfo);
    }

    @Override // io.realm.internal.m
    public Map<Class<? extends u>, OsObjectSchemaInfo> c() {
        HashMap hashMap = new HashMap();
        for (m mVar : this.f9572a.values()) {
            hashMap.putAll(mVar.c());
        }
        return hashMap;
    }

    @Override // io.realm.internal.m
    public Set<Class<? extends u>> e() {
        return this.f9572a.keySet();
    }

    @Override // io.realm.internal.m
    public String g(Class<? extends u> cls) {
        return k(cls).f(cls);
    }

    @Override // io.realm.internal.m
    public <E extends u> boolean h(Class<E> cls) {
        return k(Util.a(cls)).h(cls);
    }

    @Override // io.realm.internal.m
    public <E extends u> E i(Class<E> cls, Object obj, n nVar, c cVar, boolean z10, List<String> list) {
        return (E) k(cls).i(cls, obj, nVar, cVar, z10, list);
    }

    @Override // io.realm.internal.m
    public boolean j() {
        for (Map.Entry<Class<? extends u>, m> entry : this.f9572a.entrySet()) {
            if (!entry.getValue().j()) {
                return false;
            }
        }
        return true;
    }

    public final m k(Class<? extends u> cls) {
        m mVar = this.f9572a.get(cls);
        if (mVar != null) {
            return mVar;
        }
        throw new RealmException(cls.getSimpleName() + " is not part of the schema for this Realm");
    }
}
