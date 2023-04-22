package io.realm;

import io.realm.internal.OsObjectStore;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Util;
import io.realm.internal.objectstore.OsKeyPathMapping;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class RealmCache {

    /* renamed from: e  reason: collision with root package name */
    public static final List<WeakReference<RealmCache>> f10800e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public static final Collection<RealmCache> f10801f = new ConcurrentLinkedQueue();

    /* renamed from: b  reason: collision with root package name */
    public final String f10803b;

    /* renamed from: c  reason: collision with root package name */
    public s f10804c;

    /* renamed from: a  reason: collision with root package name */
    public final Map<ge.a<RealmCacheType, OsSharedRealm.a>, b> f10802a = new HashMap();
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* loaded from: classes2.dex */
    public enum RealmCacheType {
        TYPED_REALM,
        DYNAMIC_REALM
    }

    /* loaded from: classes2.dex */
    public static class a extends b {

        /* renamed from: c  reason: collision with root package name */
        public io.realm.a f10808c;

        public a(q qVar) {
            super(null);
        }

        @Override // io.realm.RealmCache.b
        public void a() {
            String str = this.f10808c.f10823j.f11005c;
            this.f10809a.set(null);
            this.f10808c = null;
            if (this.f10810b.decrementAndGet() < 0) {
                throw new IllegalStateException(android.support.v4.media.b.j("Global reference counter of Realm", str, " not be negative."));
            }
        }

        @Override // io.realm.RealmCache.b
        public io.realm.a b() {
            return this.f10808c;
        }

        @Override // io.realm.RealmCache.b
        public int c() {
            return this.f10810b.get();
        }

        @Override // io.realm.RealmCache.b
        public boolean d() {
            return this.f10808c != null;
        }

        @Override // io.realm.RealmCache.b
        public void e(io.realm.a aVar) {
            this.f10808c = aVar;
            this.f10809a.set(0);
            this.f10810b.incrementAndGet();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadLocal<Integer> f10809a = new ThreadLocal<>();

        /* renamed from: b  reason: collision with root package name */
        public AtomicInteger f10810b = new AtomicInteger(0);

        public b() {
        }

        public b(q qVar) {
        }

        public abstract void a();

        public abstract io.realm.a b();

        public abstract int c();

        public abstract boolean d();

        public abstract void e(io.realm.a aVar);
    }

    /* loaded from: classes2.dex */
    public static class c extends b {

        /* renamed from: c  reason: collision with root package name */
        public final ThreadLocal<io.realm.a> f10811c;

        public c(q qVar) {
            super(null);
            this.f10811c = new ThreadLocal<>();
        }

        @Override // io.realm.RealmCache.b
        public void a() {
            String str = this.f10811c.get().f10823j.f11005c;
            this.f10809a.set(null);
            this.f10811c.set(null);
            if (this.f10810b.decrementAndGet() < 0) {
                throw new IllegalStateException(android.support.v4.media.b.j("Global reference counter of Realm", str, " can not be negative."));
            }
        }

        @Override // io.realm.RealmCache.b
        public io.realm.a b() {
            return this.f10811c.get();
        }

        @Override // io.realm.RealmCache.b
        public int c() {
            Integer num = this.f10809a.get();
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        @Override // io.realm.RealmCache.b
        public boolean d() {
            return this.f10811c.get() != null;
        }

        @Override // io.realm.RealmCache.b
        public void e(io.realm.a aVar) {
            this.f10811c.set(aVar);
            this.f10809a.set(0);
            this.f10810b.incrementAndGet();
        }
    }

    public RealmCache(String str) {
        this.f10803b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r7, java.io.File r8) {
        /*
            boolean r0 = r8.exists()
            if (r0 == 0) goto L7
            goto L38
        L7:
            r0 = 0
            android.content.Context r1 = io.realm.a.f10819w     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d
            java.io.InputStream r1 = r1.open(r7)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d
            if (r1 == 0) goto L47
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L65
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L65
            r8 = 4096(0x1000, float:5.74E-42)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L44
        L1d:
            int r3 = r1.read(r8)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L44
            r4 = -1
            if (r3 <= r4) goto L29
            r4 = 0
            r2.write(r8, r4, r3)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L44
            goto L1d
        L29:
            r1.close()     // Catch: java.io.IOException -> L2d
            goto L2e
        L2d:
            r0 = move-exception
        L2e:
            r2.close()     // Catch: java.io.IOException -> L32
            goto L36
        L32:
            r7 = move-exception
            if (r0 != 0) goto L36
            r0 = r7
        L36:
            if (r0 != 0) goto L39
        L38:
            return
        L39:
            io.realm.exceptions.RealmFileException r7 = new io.realm.exceptions.RealmFileException
            io.realm.exceptions.RealmFileException$Kind r8 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR
            r7.<init>(r8, r0)
            throw r7
        L41:
            r7 = move-exception
            r0 = r2
            goto L61
        L44:
            r8 = move-exception
            r0 = r2
            goto L66
        L47:
            io.realm.exceptions.RealmFileException r8 = new io.realm.exceptions.RealmFileException     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L65
            io.realm.exceptions.RealmFileException$Kind r2 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L65
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L65
            r3.<init>()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L65
            java.lang.String r4 = "Invalid input stream to the asset file: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L65
            r3.append(r7)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L65
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L65
            r8.<init>(r2, r3)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L65
            throw r8     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L65
        L60:
            r7 = move-exception
        L61:
            r6 = r1
            r1 = r0
            r0 = r6
            goto L89
        L65:
            r8 = move-exception
        L66:
            r6 = r1
            r1 = r0
            r0 = r6
            goto L6f
        L6a:
            r7 = move-exception
            r1 = r0
            goto L89
        L6d:
            r8 = move-exception
            r1 = r0
        L6f:
            io.realm.exceptions.RealmFileException r2 = new io.realm.exceptions.RealmFileException     // Catch: java.lang.Throwable -> L88
            io.realm.exceptions.RealmFileException$Kind r3 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR     // Catch: java.lang.Throwable -> L88
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r4.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r5 = "Could not resolve the path to the asset file: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L88
            r4.append(r7)     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L88
            r2.<init>(r3, r7, r8)     // Catch: java.lang.Throwable -> L88
            throw r2     // Catch: java.lang.Throwable -> L88
        L88:
            r7 = move-exception
        L89:
            if (r0 == 0) goto L90
            r0.close()     // Catch: java.io.IOException -> L8f
            goto L90
        L8f:
        L90:
            if (r1 == 0) goto L95
            r1.close()     // Catch: java.io.IOException -> L95
        L95:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.RealmCache.a(java.lang.String, java.io.File):void");
    }

    public static <E extends io.realm.a> E c(s sVar, Class<E> cls) {
        E e10;
        RealmCache d = d(sVar.f11005c, true);
        OsSharedRealm.a aVar = OsSharedRealm.a.f10918j;
        synchronized (d) {
            b e11 = d.e(cls, aVar);
            boolean z10 = d.f() == 0;
            new File(sVar.f11005c).exists();
            if (z10) {
                File file = Util.b(sVar.d) ^ true ? new File(sVar.f11003a, sVar.f11004b) : null;
                Objects.requireNonNull(io.realm.internal.h.a(false));
                boolean z11 = !Util.b(null);
                if (file != null || z11) {
                    OsObjectStore.a(sVar, new q(file, sVar, z11, null));
                }
                d.f10804c = sVar;
            } else {
                d.g(sVar);
            }
            if (!e11.d()) {
                d.b(cls, e11, aVar);
            }
            Integer num = e11.f10809a.get();
            e11.f10809a.set(Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            e10 = (E) e11.b();
        }
        return e10;
    }

    public static RealmCache d(String str, boolean z10) {
        RealmCache realmCache;
        List<WeakReference<RealmCache>> list = f10800e;
        synchronized (list) {
            Iterator it = ((ArrayList) list).iterator();
            realmCache = null;
            while (it.hasNext()) {
                RealmCache realmCache2 = (RealmCache) ((WeakReference) it.next()).get();
                if (realmCache2 == null) {
                    it.remove();
                } else if (realmCache2.f10803b.equals(str)) {
                    realmCache = realmCache2;
                }
            }
            if (realmCache == null && z10) {
                realmCache = new RealmCache(str);
                ((ArrayList) f10800e).add(new WeakReference(realmCache));
            }
        }
        return realmCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <E extends io.realm.a> void b(Class<E> cls, b bVar, OsSharedRealm.a aVar) {
        d dVar;
        if (cls == p.class) {
            p pVar = new p(this, aVar);
            z zVar = pVar.A;
            Objects.requireNonNull(zVar);
            new OsKeyPathMapping(zVar.f11038e.n.getNativePtr());
            dVar = pVar;
        } else if (cls != d.class) {
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        } else {
            dVar = new d(this, aVar);
        }
        bVar.e(dVar);
    }

    public final <E extends io.realm.a> b e(Class<E> cls, OsSharedRealm.a aVar) {
        RealmCacheType realmCacheType;
        if (cls == p.class) {
            realmCacheType = RealmCacheType.TYPED_REALM;
        } else if (cls != d.class) {
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        } else {
            realmCacheType = RealmCacheType.DYNAMIC_REALM;
        }
        ge.a<RealmCacheType, OsSharedRealm.a> aVar2 = new ge.a<>(realmCacheType, aVar);
        b bVar = this.f10802a.get(aVar2);
        if (bVar == null) {
            bVar = aVar.equals(OsSharedRealm.a.f10918j) ? new c(null) : new a(null);
            this.f10802a.put(aVar2, bVar);
        }
        return bVar;
    }

    public final int f() {
        int i10 = 0;
        for (b bVar : this.f10802a.values()) {
            i10 += bVar.f10810b.get();
        }
        return i10;
    }

    public final void g(s sVar) {
        if (this.f10804c.equals(sVar)) {
            return;
        }
        if (!Arrays.equals(this.f10804c.a(), sVar.a())) {
            throw new IllegalArgumentException("Wrong key used to decrypt Realm.");
        }
        r3.c cVar = sVar.f11008g;
        r3.c cVar2 = this.f10804c.f11008g;
        if (cVar2 != null && cVar != null && r3.c.class.equals(r3.c.class) && !cVar.equals(cVar2)) {
            StringBuilder m10 = a1.a.m("Configurations cannot be different if used to open the same file. The most likely cause is that equals() and hashCode() are not overridden in the migration class: ");
            m10.append(sVar.f11008g.getClass().getCanonicalName());
            throw new IllegalArgumentException(m10.toString());
        }
        StringBuilder m11 = a1.a.m("Configurations cannot be different if used to open the same file. \nCached configuration: \n");
        m11.append(this.f10804c);
        m11.append("\n\nNew configuration: \n");
        m11.append(sVar);
        throw new IllegalArgumentException(m11.toString());
    }
}
