package io.realm;

import io.realm.internal.InvalidRow;

/* loaded from: classes2.dex */
public abstract class v implements u {
    public static <E extends u> boolean w(E e10) {
        if (e10 instanceof io.realm.internal.l) {
            io.realm.internal.n nVar = ((io.realm.internal.l) e10).o().f10983c;
            return nVar != null && nVar.f();
        }
        return true;
    }

    public final void u() {
        if (!(this instanceof io.realm.internal.l)) {
            throw new IllegalArgumentException("Object not managed by Realm, so it cannot be removed.");
        }
        io.realm.internal.l lVar = (io.realm.internal.l) this;
        if (lVar.o().f10983c == null) {
            throw new IllegalStateException("Object malformed: missing object in Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
        }
        if (lVar.o().d == null) {
            throw new IllegalStateException("Object malformed: missing Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
        }
        lVar.o().d.e();
        io.realm.internal.n nVar = lVar.o().f10983c;
        nVar.d().o(nVar.y());
        lVar.o().f10983c = InvalidRow.INSTANCE;
    }

    public final boolean v() {
        return w(this);
    }
}
