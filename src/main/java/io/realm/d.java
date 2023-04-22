package io.realm;

import io.realm.internal.OsObjectStore;
import io.realm.internal.OsSharedRealm;

/* loaded from: classes2.dex */
public class d extends a {
    public final z A;

    public d(RealmCache realmCache, OsSharedRealm.a aVar) {
        super(realmCache, null, aVar);
        s sVar = realmCache.f10804c;
        synchronized (RealmCache.f10800e) {
            RealmCache d = RealmCache.d(sVar.f11005c, false);
            if (d != null) {
                synchronized (d) {
                    if (d.f() <= 0 && !realmCache.f10804c.f11014m && OsObjectStore.c(this.n) == -1) {
                        this.n.beginTransaction();
                        if (OsObjectStore.c(this.n) == -1) {
                            OsObjectStore.e(this.n, -1L);
                        }
                        this.n.commitTransaction();
                    }
                }
            } else if (!realmCache.f10804c.f11014m && OsObjectStore.c(this.n) == -1) {
                this.n.beginTransaction();
                if (OsObjectStore.c(this.n) == -1) {
                    OsObjectStore.e(this.n, -1L);
                }
                this.n.commitTransaction();
            }
        }
        this.A = new i(this);
    }

    public d(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.A = new i(this);
    }

    @Override // io.realm.a
    public z i() {
        return this.A;
    }
}
