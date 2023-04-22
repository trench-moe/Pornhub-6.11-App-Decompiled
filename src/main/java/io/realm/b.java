package io.realm;

import io.realm.internal.OsSharedRealm;
import io.realm.p;

/* loaded from: classes2.dex */
public class b implements OsSharedRealm.InitializationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p.a f10835a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f10836b;

    public b(a aVar, p.a aVar2) {
        this.f10836b = aVar;
        this.f10835a = aVar2;
    }

    @Override // io.realm.internal.OsSharedRealm.InitializationCallback
    public void onInit(OsSharedRealm osSharedRealm) {
        ((s3.b) this.f10835a).a(new p(osSharedRealm));
    }
}
