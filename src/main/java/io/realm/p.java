package io.realm;

import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.Util;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public class p extends io.realm.a {
    public static final Object B = new Object();
    public static s C;
    public final z A;

    /* loaded from: classes2.dex */
    public interface a {

        /* renamed from: io.realm.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public interface InterfaceC0158a {
            void onError(Throwable th);
        }

        /* loaded from: classes2.dex */
        public interface b {
            void onSuccess();
        }
    }

    public p(RealmCache realmCache, OsSharedRealm.a aVar) {
        super(realmCache, new OsSchemaInfo(realmCache.f10804c.f11011j.c().values()), aVar);
        this.A = new g(this, new io.realm.internal.b(this.f10823j.f11011j, this.n.getSchemaInfo()));
        s sVar = this.f10823j;
        if (sVar.f11014m) {
            io.realm.internal.m mVar = sVar.f11011j;
            for (Class<? extends u> cls : mVar.e()) {
                String l10 = Table.l(mVar.f(cls));
                if (!this.n.hasTable(l10)) {
                    this.n.close();
                    throw new RealmMigrationNeededException(this.f10823j.f11005c, String.format(Locale.US, "Cannot open the read only Realm. '%s' is missing.", Table.e(l10)));
                }
            }
        }
    }

    public p(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.A = new g(this, new io.realm.internal.b(this.f10823j.f11011j, osSharedRealm.getSchemaInfo()));
    }

    public static p t() {
        s sVar;
        synchronized (B) {
            sVar = C;
        }
        if (sVar == null) {
            if (io.realm.a.f10819w == null) {
                throw new IllegalStateException("Call `Realm.init(Context)` before calling this method.");
            }
            throw new IllegalStateException("Set default configuration by using `Realm.setDefaultConfiguration(RealmConfiguration)`.");
        }
        return (p) RealmCache.c(sVar, p.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void v(android.content.Context r7, java.lang.String r8) {
        /*
            android.content.Context r8 = io.realm.a.f10819w
            if (r8 != 0) goto Lb4
            if (r7 == 0) goto Lac
            java.io.File r8 = r7.getFilesDir()
            if (r8 == 0) goto L18
            boolean r0 = r8.exists()
            if (r0 == 0) goto L13
            goto L5c
        L13:
            r8.mkdirs()     // Catch: java.lang.SecurityException -> L17
            goto L18
        L17:
        L18:
            if (r8 == 0) goto L20
            boolean r8 = r8.exists()
            if (r8 != 0) goto L4c
        L20:
            r8 = 5
            long[] r8 = new long[r8]
            r8 = {x00b6: FILL_ARRAY_DATA  , data: [1, 2, 5, 10, 16} // fill-array
            r0 = 200(0xc8, double:9.9E-322)
            r2 = 0
            r4 = -1
        L2b:
            java.io.File r5 = r7.getFilesDir()
            if (r5 == 0) goto L3b
            java.io.File r5 = r7.getFilesDir()
            boolean r5 = r5.exists()
            if (r5 != 0) goto L4c
        L3b:
            int r4 = r4 + 1
            r5 = 4
            int r5 = java.lang.Math.min(r4, r5)
            r5 = r8[r5]
            android.os.SystemClock.sleep(r5)
            long r2 = r2 + r5
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 <= 0) goto L2b
        L4c:
            java.io.File r8 = r7.getFilesDir()
            if (r8 == 0) goto L90
            java.io.File r8 = r7.getFilesDir()
            boolean r8 = r8.exists()
            if (r8 == 0) goto L90
        L5c:
            io.realm.internal.k.a(r7)
            io.realm.s$a r8 = new io.realm.s$a
            r8.<init>(r7)
            io.realm.s r8 = r8.a()
            w(r8)
            io.realm.internal.h r8 = io.realm.internal.h.b()
            java.util.Objects.requireNonNull(r8)
            android.content.Context r8 = r7.getApplicationContext()
            if (r8 == 0) goto L7f
            android.content.Context r8 = r7.getApplicationContext()
            io.realm.a.f10819w = r8
            goto L81
        L7f:
            io.realm.a.f10819w = r7
        L81:
            java.io.File r8 = new java.io.File
            java.io.File r7 = r7.getFilesDir()
            java.lang.String r0 = ".realm.temp"
            r8.<init>(r7, r0)
            io.realm.internal.OsSharedRealm.initialize(r8)
            goto Lb4
        L90:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Context.getFilesDir() returns "
            java.lang.StringBuilder r0 = a1.a.m(r0)
            java.io.File r7 = r7.getFilesDir()
            r0.append(r7)
            java.lang.String r7 = " which is not an existing directory. See https://issuetracker.google.com/issues/36918154"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        Lac:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Non-null context required."
            r7.<init>(r8)
            throw r7
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.p.v(android.content.Context, java.lang.String):void");
    }

    public static void w(s sVar) {
        synchronized (B) {
            C = sVar;
        }
    }

    public <E extends u> RealmQuery<E> E(Class<E> cls) {
        e();
        return new RealmQuery<>(this, cls);
    }

    @Override // io.realm.a
    public z i() {
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends u> E s(E e10, ImportFlag... importFlagArr) {
        Class<?> cls = e10.getClass();
        if (this.n.getSchemaInfo().a(this.f10823j.f11011j.f(cls)).b() == null) {
            StringBuilder m10 = a1.a.m("A RealmObject with no @PrimaryKey cannot be updated: ");
            m10.append(cls.toString());
            throw new IllegalArgumentException(m10.toString());
        }
        HashMap hashMap = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ImportFlag importFlag : importFlagArr) {
            if (importFlag != null) {
                linkedHashSet.add(importFlag);
            }
        }
        e();
        if (n()) {
            if (this.f10823j.f11011j.h(Util.a(e10.getClass()))) {
                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
            }
            try {
                return (E) this.f10823j.f11011j.a(this, e10, true, hashMap, linkedHashSet);
            } catch (IllegalStateException e11) {
                if (e11.getMessage().startsWith("Attempting to create an object of type")) {
                    throw new RealmPrimaryKeyConstraintException(e11.getMessage());
                }
                throw e11;
            }
        }
        throw new IllegalStateException("`copyOrUpdate` can only be called inside a write transaction.");
    }
}
