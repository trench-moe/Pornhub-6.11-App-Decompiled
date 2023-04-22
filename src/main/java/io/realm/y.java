package io.realm;

import io.realm.internal.OsResults;
import io.realm.log.RealmLog;

/* loaded from: classes2.dex */
public class y<E> extends m<E> {
    public y(a aVar, OsResults osResults, Class<E> cls) {
        super(aVar, osResults, cls);
    }

    public y(a aVar, OsResults osResults, String str) {
        super(aVar, osResults, str);
    }

    public final void e(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        this.f10974c.e();
        ((be.a) this.f10974c.n.capabilities).b("Listeners cannot be used on current thread.");
    }

    public final void g(Object obj, boolean z10) {
        if (z10 && obj == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        if (this.f10974c.k()) {
            RealmLog.b("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", this.f10974c.f10823j.f11005c);
        }
    }

    public void h() {
        g(null, false);
        this.f10977m.i();
    }
}
