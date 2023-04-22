package io.realm.internal;

import io.realm.k;

/* loaded from: classes2.dex */
public class o implements io.realm.k {

    /* renamed from: c  reason: collision with root package name */
    public final io.realm.k f10964c;

    public o(OsCollectionChangeSet osCollectionChangeSet) {
        this.f10964c = osCollectionChangeSet;
        osCollectionChangeSet.f();
        osCollectionChangeSet.d();
    }

    @Override // io.realm.k
    public k.a[] a() {
        return this.f10964c.a();
    }

    @Override // io.realm.k
    public k.a[] b() {
        return this.f10964c.b();
    }

    @Override // io.realm.k
    public k.a[] c() {
        return this.f10964c.c();
    }
}
