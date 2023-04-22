package io.realm;

import io.realm.a;
import io.realm.annotations.RealmModule;
import io.realm.b0;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@RealmModule
/* loaded from: classes2.dex */
class DefaultRealmModuleMediator extends io.realm.internal.m {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<Class<? extends u>> f10793a;

    static {
        HashSet hashSet = new HashSet(1);
        hashSet.add(r3.d.class);
        f10793a = Collections.unmodifiableSet(hashSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (r7.f10823j.f11005c.equals(r17.f10823j.f11005c) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cd  */
    @Override // io.realm.internal.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <E extends io.realm.u> E a(io.realm.p r17, E r18, boolean r19, java.util.Map<io.realm.u, io.realm.internal.l> r20, java.util.Set<io.realm.ImportFlag> r21) {
        /*
            Method dump skipped, instructions count: 747
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.DefaultRealmModuleMediator.a(io.realm.p, io.realm.u, boolean, java.util.Map, java.util.Set):io.realm.u");
    }

    @Override // io.realm.internal.m
    public io.realm.internal.c b(Class<? extends u> cls, OsSchemaInfo osSchemaInfo) {
        Objects.requireNonNull(cls, "A class extending RealmObject must be provided");
        if (cls.equals(r3.d.class)) {
            OsObjectSchemaInfo osObjectSchemaInfo = b0.f10837u;
            return new b0.a(osSchemaInfo);
        }
        throw io.realm.internal.m.d(cls);
    }

    @Override // io.realm.internal.m
    public Map<Class<? extends u>, OsObjectSchemaInfo> c() {
        HashMap hashMap = new HashMap(1);
        hashMap.put(r3.d.class, b0.f10837u);
        return hashMap;
    }

    @Override // io.realm.internal.m
    public Set<Class<? extends u>> e() {
        return f10793a;
    }

    @Override // io.realm.internal.m
    public String g(Class<? extends u> cls) {
        if (cls.equals(r3.d.class)) {
            return "RealmVideo";
        }
        throw io.realm.internal.m.d(cls);
    }

    @Override // io.realm.internal.m
    public <E extends u> boolean h(Class<E> cls) {
        if (cls.equals(r3.d.class)) {
            return false;
        }
        throw io.realm.internal.m.d(cls);
    }

    @Override // io.realm.internal.m
    public <E extends u> E i(Class<E> cls, Object obj, io.realm.internal.n nVar, io.realm.internal.c cVar, boolean z10, List<String> list) {
        a.b bVar = a.f10820z.get();
        try {
            bVar.b((a) obj, nVar, cVar, z10, list);
            Objects.requireNonNull(cls, "A class extending RealmObject must be provided");
            if (cls.equals(r3.d.class)) {
                return cls.cast(new b0());
            }
            throw io.realm.internal.m.d(cls);
        } finally {
            bVar.a();
        }
    }

    @Override // io.realm.internal.m
    public boolean j() {
        return true;
    }
}
