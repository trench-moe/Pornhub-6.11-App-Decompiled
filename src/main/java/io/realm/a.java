package io.realm;

import android.content.Context;
import android.os.Looper;
import io.realm.RealmCache;
import io.realm.exceptions.RealmException;
import io.realm.internal.CheckedRow;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.UncheckedRow;
import io.realm.internal.objectstore.OsKeyPathMapping;
import io.realm.log.RealmLog;
import io.realm.p;
import java.io.Closeable;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public abstract class a implements Closeable {

    /* renamed from: w  reason: collision with root package name */
    public static volatile Context f10819w;
    public static final ce.c y;

    /* renamed from: z  reason: collision with root package name */
    public static final c f10820z;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10821c;

    /* renamed from: f  reason: collision with root package name */
    public final long f10822f;

    /* renamed from: j  reason: collision with root package name */
    public final s f10823j;

    /* renamed from: m  reason: collision with root package name */
    public RealmCache f10824m;
    public OsSharedRealm n;

    /* renamed from: t  reason: collision with root package name */
    public boolean f10825t;

    /* renamed from: u  reason: collision with root package name */
    public OsSharedRealm.SchemaChangedCallback f10826u;

    /* renamed from: io.realm.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0156a implements OsSharedRealm.SchemaChangedCallback {
        public C0156a() {
        }

        @Override // io.realm.internal.OsSharedRealm.SchemaChangedCallback
        public void onSchemaChanged() {
            z i10 = a.this.i();
            if (i10 != null) {
                io.realm.internal.b bVar = i10.f11039f;
                if (bVar != null) {
                    for (Map.Entry<Class<? extends u>, io.realm.internal.c> entry : bVar.f10941a.entrySet()) {
                        entry.getValue().c(bVar.f10943c.b(entry.getKey(), bVar.d));
                    }
                }
                i10.f11035a.clear();
                i10.f11036b.clear();
                i10.f11037c.clear();
                i10.d.clear();
            }
            if (a.this instanceof p) {
                Objects.requireNonNull(i10);
                new OsKeyPathMapping(i10.f11038e.n.getNativePtr());
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public a f10828a;

        /* renamed from: b  reason: collision with root package name */
        public io.realm.internal.n f10829b;

        /* renamed from: c  reason: collision with root package name */
        public io.realm.internal.c f10830c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public List<String> f10831e;

        public void a() {
            this.f10828a = null;
            this.f10829b = null;
            this.f10830c = null;
            this.d = false;
            this.f10831e = null;
        }

        public void b(a aVar, io.realm.internal.n nVar, io.realm.internal.c cVar, boolean z10, List<String> list) {
            this.f10828a = aVar;
            this.f10829b = nVar;
            this.f10830c = cVar;
            this.d = z10;
            this.f10831e = list;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends ThreadLocal<b> {
        @Override // java.lang.ThreadLocal
        public b initialValue() {
            return new b();
        }
    }

    static {
        int i10 = ce.c.f4098f;
        y = new ce.c(i10, i10);
        new ce.c(1, 1);
        f10820z = new c();
    }

    public a(RealmCache realmCache, OsSchemaInfo osSchemaInfo, OsSharedRealm.a aVar) {
        r3.c cVar;
        s sVar = realmCache.f10804c;
        this.f10826u = new C0156a();
        this.f10822f = Thread.currentThread().getId();
        this.f10823j = sVar;
        this.f10824m = null;
        io.realm.c cVar2 = (osSchemaInfo == null || (cVar = sVar.f11008g) == null) ? null : new io.realm.c(cVar);
        p.a aVar2 = sVar.f11013l;
        io.realm.b bVar = aVar2 != null ? new io.realm.b(this, aVar2) : null;
        OsRealmConfig.b bVar2 = new OsRealmConfig.b(sVar);
        bVar2.f10901f = new File(f10819w.getFilesDir(), ".realm.temp").getAbsolutePath();
        bVar2.f10900e = true;
        bVar2.f10899c = cVar2;
        bVar2.f10898b = osSchemaInfo;
        bVar2.d = bVar;
        OsSharedRealm osSharedRealm = OsSharedRealm.getInstance(bVar2, aVar);
        this.n = osSharedRealm;
        this.f10821c = osSharedRealm.isFrozen();
        this.f10825t = true;
        this.n.registerSchemaChangedCallback(this.f10826u);
        this.f10824m = realmCache;
    }

    public a(OsSharedRealm osSharedRealm) {
        this.f10826u = new C0156a();
        this.f10822f = Thread.currentThread().getId();
        this.f10823j = osSharedRealm.getConfiguration();
        this.f10824m = null;
        this.n = osSharedRealm;
        this.f10821c = osSharedRealm.isFrozen();
        this.f10825t = false;
    }

    public void a() {
        e();
        this.n.beginTransaction();
    }

    public void c() {
        e();
        this.n.cancelTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a b10;
        if (!this.f10821c && this.f10822f != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm instance can only be closed on the thread it was created.");
        }
        RealmCache realmCache = this.f10824m;
        if (realmCache == null) {
            this.f10824m = null;
            OsSharedRealm osSharedRealm = this.n;
            if (osSharedRealm == null || !this.f10825t) {
                return;
            }
            osSharedRealm.close();
            this.n = null;
            return;
        }
        synchronized (realmCache) {
            String str = this.f10823j.f11005c;
            RealmCache.b e10 = realmCache.e(getClass(), m() ? this.n.getVersionID() : OsSharedRealm.a.f10918j);
            int c10 = e10.c();
            if (c10 <= 0) {
                RealmLog.b("%s has been closed already. refCount is %s", str, Integer.valueOf(c10));
                return;
            }
            int i10 = c10 - 1;
            if (i10 == 0) {
                e10.a();
                this.f10824m = null;
                OsSharedRealm osSharedRealm2 = this.n;
                if (osSharedRealm2 != null && this.f10825t) {
                    osSharedRealm2.close();
                    this.n = null;
                }
                int i11 = 0;
                for (RealmCache.b bVar : realmCache.f10802a.values()) {
                    if (bVar instanceof RealmCache.c) {
                        i11 += bVar.f10810b.get();
                    }
                }
                if (i11 == 0) {
                    realmCache.f10804c = null;
                    for (RealmCache.b bVar2 : realmCache.f10802a.values()) {
                        if ((bVar2 instanceof RealmCache.a) && (b10 = bVar2.b()) != null) {
                            while (!b10.k()) {
                                b10.close();
                            }
                        }
                    }
                    Objects.requireNonNull(this.f10823j);
                    Objects.requireNonNull(io.realm.internal.h.a(false));
                }
            } else {
                e10.f10809a.set(Integer.valueOf(i10));
            }
        }
    }

    public void d() {
        Looper looper = ((be.a) this.n.capabilities).f3654a;
        if ((looper != null && looper == Looper.getMainLooper()) && !this.f10823j.f11016p) {
            throw new RealmException("Queries on the UI thread have been disabled. They can be enabled by setting 'RealmConfiguration.Builder.allowQueriesOnUiThread(true)'.");
        }
    }

    public void e() {
        OsSharedRealm osSharedRealm = this.n;
        if (osSharedRealm == null || osSharedRealm.isClosed()) {
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        }
        if (!this.f10821c && this.f10822f != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
        }
    }

    public void f() {
        e();
        this.n.commitTransaction();
    }

    public void finalize() {
        OsSharedRealm osSharedRealm;
        if (this.f10825t && (osSharedRealm = this.n) != null && !osSharedRealm.isClosed()) {
            RealmLog.b("Remember to call close() on all Realm instances. Realm %s is being finalized without being closed, this can lead to running out of native memory.", this.f10823j.f11005c);
            RealmCache realmCache = this.f10824m;
            if (realmCache != null && !realmCache.d.getAndSet(true)) {
                ((ConcurrentLinkedQueue) RealmCache.f10801f).add(realmCache);
            }
        }
        super.finalize();
    }

    public <E extends u> E h(Class<E> cls, String str, UncheckedRow uncheckedRow) {
        if (str != null) {
            return new e(this, new CheckedRow(uncheckedRow));
        }
        io.realm.internal.m mVar = this.f10823j.f11011j;
        z i10 = i();
        i10.a();
        return (E) mVar.i(cls, this, uncheckedRow, i10.f11039f.a(cls), false, Collections.emptyList());
    }

    public abstract z i();

    public boolean k() {
        if (this.f10821c || this.f10822f == Thread.currentThread().getId()) {
            OsSharedRealm osSharedRealm = this.n;
            return osSharedRealm == null || osSharedRealm.isClosed();
        }
        throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
    }

    public boolean m() {
        OsSharedRealm osSharedRealm = this.n;
        if (osSharedRealm == null || osSharedRealm.isClosed()) {
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        }
        return this.f10821c;
    }

    public boolean n() {
        e();
        return this.n.isInTransaction();
    }
}
