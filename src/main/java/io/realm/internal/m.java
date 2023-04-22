package io.realm.internal;

import io.realm.ImportFlag;
import io.realm.exceptions.RealmException;
import io.realm.p;
import io.realm.u;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class m {
    public static RealmException d(Class<? extends u> cls) {
        return new RealmException(String.format("'%s' is not part of the schema for this Realm.", cls.toString()));
    }

    public abstract <E extends u> E a(p pVar, E e10, boolean z10, Map<u, l> map, Set<ImportFlag> set);

    public abstract c b(Class<? extends u> cls, OsSchemaInfo osSchemaInfo);

    public abstract Map<Class<? extends u>, OsObjectSchemaInfo> c();

    public abstract Set<Class<? extends u>> e();

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return e().equals(((m) obj).e());
        }
        return false;
    }

    public final String f(Class<? extends u> cls) {
        return g(Util.a(cls));
    }

    public abstract String g(Class<? extends u> cls);

    public abstract <E extends u> boolean h(Class<E> cls);

    public int hashCode() {
        return e().hashCode();
    }

    public abstract <E extends u> E i(Class<E> cls, Object obj, n nVar, c cVar, boolean z10, List<String> list);

    public boolean j() {
        return false;
    }
}
