package io.realm;

import io.realm.internal.OsObject;
import io.realm.internal.i;
import io.realm.u;
import java.util.List;

/* loaded from: classes2.dex */
public final class n<E extends u> {

    /* renamed from: h  reason: collision with root package name */
    public static b f10980h = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public E f10981a;

    /* renamed from: c  reason: collision with root package name */
    public io.realm.internal.n f10983c;
    public io.realm.a d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10984e;

    /* renamed from: f  reason: collision with root package name */
    public List<String> f10985f;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10982b = true;

    /* renamed from: g  reason: collision with root package name */
    public io.realm.internal.i<OsObject.a> f10986g = new io.realm.internal.i<>();

    /* loaded from: classes2.dex */
    public static class b implements i.a<OsObject.a> {
        public b(a aVar) {
        }

        @Override // io.realm.internal.i.a
        public void a(OsObject.a aVar, Object obj) {
            ((w) aVar.f10961b).a((u) obj, null);
        }
    }

    public n(E e10) {
        this.f10981a = e10;
    }
}
