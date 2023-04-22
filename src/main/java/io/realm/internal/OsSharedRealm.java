package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsResults;
import io.realm.internal.android.AndroidRealmNotifier;
import io.realm.s;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

@Keep
/* loaded from: classes2.dex */
public final class OsSharedRealm implements Closeable, g {
    public static final byte FILE_EXCEPTION_INCOMPATIBLE_SYNC_FILE = 7;
    public static final byte FILE_EXCEPTION_KIND_ACCESS_ERROR = 0;
    public static final byte FILE_EXCEPTION_KIND_BAD_HISTORY = 1;
    public static final byte FILE_EXCEPTION_KIND_EXISTS = 3;
    public static final byte FILE_EXCEPTION_KIND_FORMAT_UPGRADE_REQUIRED = 6;
    public static final byte FILE_EXCEPTION_KIND_INCOMPATIBLE_LOCK_FILE = 5;
    public static final byte FILE_EXCEPTION_KIND_NOT_FOUND = 4;
    public static final byte FILE_EXCEPTION_KIND_PERMISSION_DENIED = 2;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private static final List<OsSharedRealm> sharedRealmsUnderConstruction = new CopyOnWriteArrayList();
    private static volatile File temporaryDirectory;
    public final io.realm.internal.a capabilities;
    public final f context;
    public final List<WeakReference<OsResults.a>> iterators;
    private final long nativePtr;
    private final OsRealmConfig osRealmConfig;
    private final List<WeakReference<j>> pendingRows;
    public final RealmNotifier realmNotifier;
    private final OsSchemaInfo schemaInfo;
    private final List<OsSharedRealm> tempSharedRealmsForCallback;

    @Keep
    /* loaded from: classes2.dex */
    public interface InitializationCallback {
        void onInit(OsSharedRealm osSharedRealm);
    }

    @Keep
    /* loaded from: classes2.dex */
    public interface MigrationCallback {
        void onMigrationNeeded(OsSharedRealm osSharedRealm, long j10, long j11);
    }

    @Keep
    /* loaded from: classes2.dex */
    public interface SchemaChangedCallback {
        void onSchemaChanged();
    }

    /* loaded from: classes2.dex */
    public static class a implements Comparable<a> {

        /* renamed from: j  reason: collision with root package name */
        public static final a f10918j = new a(-1, -1);

        /* renamed from: c  reason: collision with root package name */
        public final long f10919c;

        /* renamed from: f  reason: collision with root package name */
        public final long f10920f;

        public a(long j10, long j11) {
            this.f10919c = j10;
            this.f10920f = j11;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(a aVar) {
            if (aVar != null) {
                long j10 = this.f10919c;
                long j11 = aVar.f10919c;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            }
            throw new IllegalArgumentException("Version cannot be compared to a null value.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10919c == aVar.f10919c && this.f10920f == aVar.f10920f;
        }

        public int hashCode() {
            long j10 = this.f10919c;
            long j11 = this.f10920f;
            return (((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("VersionID{version=");
            m10.append(this.f10919c);
            m10.append(", index=");
            m10.append(this.f10920f);
            m10.append('}');
            return m10.toString();
        }
    }

    private OsSharedRealm(long j10, OsRealmConfig osRealmConfig) {
        this.tempSharedRealmsForCallback = new ArrayList();
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        this.nativePtr = j10;
        this.osRealmConfig = osRealmConfig;
        this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(j10), this);
        f fVar = osRealmConfig.f10885m;
        this.context = fVar;
        fVar.a(this);
        this.capabilities = new be.a();
        this.realmNotifier = null;
        boolean z10 = false;
        nativeSetAutoRefresh(j10, false);
        Iterator<OsSharedRealm> it = sharedRealmsUnderConstruction.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            OsSharedRealm next = it.next();
            if (next.context == osRealmConfig.f10885m) {
                z10 = true;
                next.tempSharedRealmsForCallback.add(this);
                break;
            }
        }
        if (!z10) {
            throw new IllegalStateException("Cannot find the parent 'OsSharedRealm' which is under construction.");
        }
    }

    private OsSharedRealm(OsRealmConfig osRealmConfig, a aVar) {
        ArrayList arrayList = new ArrayList();
        this.tempSharedRealmsForCallback = arrayList;
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        be.a aVar2 = new be.a();
        AndroidRealmNotifier androidRealmNotifier = new AndroidRealmNotifier(this, aVar2);
        f fVar = osRealmConfig.f10885m;
        this.context = fVar;
        List<OsSharedRealm> list = sharedRealmsUnderConstruction;
        list.add(this);
        try {
            long nativeGetSharedRealm = nativeGetSharedRealm(osRealmConfig.f10884j, aVar.f10919c, aVar.f10920f, androidRealmNotifier);
            this.nativePtr = nativeGetSharedRealm;
            arrayList.clear();
            list.remove(this);
            this.osRealmConfig = osRealmConfig;
            this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(nativeGetSharedRealm), this);
            fVar.a(this);
            this.capabilities = aVar2;
            this.realmNotifier = androidRealmNotifier;
            if (aVar.equals(a.f10918j)) {
                nativeSetAutoRefresh(nativeGetSharedRealm, aVar2.a());
            }
        } catch (Throwable th) {
            try {
                for (OsSharedRealm osSharedRealm : this.tempSharedRealmsForCallback) {
                    if (!osSharedRealm.isClosed()) {
                        osSharedRealm.close();
                    }
                }
                throw th;
            } catch (Throwable th2) {
                this.tempSharedRealmsForCallback.clear();
                sharedRealmsUnderConstruction.remove(this);
                throw th2;
            }
        }
    }

    private void detachIterators() {
        for (WeakReference<OsResults.a> weakReference : this.iterators) {
            OsResults.a aVar = weakReference.get();
            if (aVar != null) {
                aVar.f10914c = aVar.f10914c.d();
            }
        }
        this.iterators.clear();
    }

    private void executePendingRowQueries() {
        for (WeakReference<j> weakReference : this.pendingRows) {
            if (weakReference.get() != null) {
                throw new IllegalStateException("The query has been executed. This 'PendingRow' is not valid anymore.");
            }
        }
        this.pendingRows.clear();
    }

    public static OsSharedRealm getInstance(OsRealmConfig.b bVar, a aVar) {
        OsRealmConfig a10 = bVar.a();
        Objects.requireNonNull(h.b());
        return new OsSharedRealm(a10, aVar);
    }

    public static OsSharedRealm getInstance(s sVar, a aVar) {
        return getInstance(new OsRealmConfig.b(sVar), aVar);
    }

    public static File getTemporaryDirectory() {
        return temporaryDirectory;
    }

    public static void initialize(File file) {
        if (temporaryDirectory != null) {
            return;
        }
        String absolutePath = file.getAbsolutePath();
        if (!file.isDirectory() && !file.mkdirs() && !file.isDirectory()) {
            throw new IOException(a1.a.l("failed to create temporary directory: ", absolutePath));
        }
        if (!absolutePath.endsWith("/")) {
            absolutePath = a1.a.l(absolutePath, "/");
        }
        nativeInit(absolutePath);
        temporaryDirectory = file;
    }

    private static native void nativeBeginTransaction(long j10);

    private static native void nativeCancelTransaction(long j10);

    private static native void nativeCloseSharedRealm(long j10);

    private static native void nativeCommitTransaction(long j10);

    private static native boolean nativeCompact(long j10);

    private static native long nativeCreateTable(long j10, String str);

    private static native long nativeCreateTableWithPrimaryKeyField(long j10, String str, String str2, int i10, boolean z10);

    private static native long nativeFreeze(long j10);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetSchemaInfo(long j10);

    private static native long nativeGetSharedRealm(long j10, long j11, long j12, RealmNotifier realmNotifier);

    private static native long nativeGetTableRef(long j10, String str);

    private static native String[] nativeGetTablesName(long j10);

    private static native long[] nativeGetVersionID(long j10);

    private static native boolean nativeHasTable(long j10, String str);

    private static native void nativeInit(String str);

    private static native boolean nativeIsAutoRefresh(long j10);

    private static native boolean nativeIsClosed(long j10);

    private static native boolean nativeIsEmpty(long j10);

    private static native boolean nativeIsFrozen(long j10);

    private static native boolean nativeIsInTransaction(long j10);

    private static native long nativeNumberOfVersions(long j10);

    private static native void nativeRefresh(long j10);

    private static native void nativeRegisterSchemaChangedCallback(long j10, SchemaChangedCallback schemaChangedCallback);

    private static native void nativeRenameTable(long j10, String str, String str2);

    private static native void nativeSetAutoRefresh(long j10, boolean z10);

    private static native long nativeSize(long j10);

    private static native void nativeStopWaitForChange(long j10);

    private static native boolean nativeWaitForChange(long j10);

    private static native void nativeWriteCopy(long j10, String str, byte[] bArr);

    private static void runInitializationCallback(long j10, OsRealmConfig osRealmConfig, InitializationCallback initializationCallback) {
        initializationCallback.onInit(new OsSharedRealm(j10, osRealmConfig));
    }

    private static void runMigrationCallback(long j10, OsRealmConfig osRealmConfig, MigrationCallback migrationCallback, long j11) {
        migrationCallback.onMigrationNeeded(new OsSharedRealm(j10, osRealmConfig), j11, osRealmConfig.f10882c.f11007f);
    }

    public void addIterator(OsResults.a aVar) {
        this.iterators.add(new WeakReference<>(aVar));
    }

    public void addPendingRow(j jVar) {
        this.pendingRows.add(new WeakReference<>(jVar));
    }

    public void beginTransaction() {
        detachIterators();
        executePendingRowQueries();
        nativeBeginTransaction(this.nativePtr);
    }

    public void cancelTransaction() {
        nativeCancelTransaction(this.nativePtr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RealmNotifier realmNotifier = this.realmNotifier;
        if (realmNotifier != null) {
            realmNotifier.close();
        }
        synchronized (this.context) {
            nativeCloseSharedRealm(this.nativePtr);
        }
    }

    public void commitTransaction() {
        nativeCommitTransaction(this.nativePtr);
    }

    public boolean compact() {
        return nativeCompact(this.nativePtr);
    }

    public Table createTable(String str) {
        return new Table(this, nativeCreateTable(this.nativePtr, str));
    }

    public Table createTableWithPrimaryKey(String str, String str2, RealmFieldType realmFieldType, boolean z10) {
        return new Table(this, nativeCreateTableWithPrimaryKeyField(this.nativePtr, str, str2, realmFieldType.getNativeValue(), z10));
    }

    public OsSharedRealm freeze() {
        return new OsSharedRealm(this.osRealmConfig, getVersionID());
    }

    public s getConfiguration() {
        return this.osRealmConfig.f10882c;
    }

    @Override // io.realm.internal.g
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.g
    public long getNativePtr() {
        return this.nativePtr;
    }

    public long getNumberOfVersions() {
        return nativeNumberOfVersions(this.nativePtr);
    }

    public String getPath() {
        return this.osRealmConfig.f10882c.f11005c;
    }

    public OsSchemaInfo getSchemaInfo() {
        return this.schemaInfo;
    }

    public Table getTable(String str) {
        return new Table(this, nativeGetTableRef(this.nativePtr, str));
    }

    public String[] getTablesNames() {
        String[] nativeGetTablesName = nativeGetTablesName(this.nativePtr);
        return nativeGetTablesName != null ? nativeGetTablesName : new String[0];
    }

    public a getVersionID() {
        long[] nativeGetVersionID = nativeGetVersionID(this.nativePtr);
        if (nativeGetVersionID != null) {
            return new a(nativeGetVersionID[0], nativeGetVersionID[1]);
        }
        throw new IllegalStateException("Cannot get versionId, this could be related to a non existing read/write transaction");
    }

    public boolean hasTable(String str) {
        return nativeHasTable(this.nativePtr, str);
    }

    public void invalidateIterators() {
        for (WeakReference<OsResults.a> weakReference : this.iterators) {
            OsResults.a aVar = weakReference.get();
            if (aVar != null) {
                aVar.f10914c = null;
            }
        }
        this.iterators.clear();
    }

    public boolean isAutoRefresh() {
        return nativeIsAutoRefresh(this.nativePtr);
    }

    public boolean isClosed() {
        return nativeIsClosed(this.nativePtr);
    }

    public boolean isEmpty() {
        return nativeIsEmpty(this.nativePtr);
    }

    public boolean isFrozen() {
        return nativeIsFrozen(this.nativePtr);
    }

    public boolean isInTransaction() {
        return nativeIsInTransaction(this.nativePtr);
    }

    public boolean isSyncRealm() {
        return this.osRealmConfig.f10883f != null;
    }

    public void refresh() {
        if (isFrozen()) {
            throw new IllegalStateException("It is not possible to refresh frozen Realms.");
        }
        nativeRefresh(this.nativePtr);
    }

    public void registerSchemaChangedCallback(SchemaChangedCallback schemaChangedCallback) {
        nativeRegisterSchemaChangedCallback(this.nativePtr, schemaChangedCallback);
    }

    public void removePendingRow(j jVar) {
        for (WeakReference<j> weakReference : this.pendingRows) {
            j jVar2 = weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.pendingRows.remove(weakReference);
            }
        }
    }

    public void renameTable(String str, String str2) {
        nativeRenameTable(this.nativePtr, str, str2);
    }

    public void setAutoRefresh(boolean z10) {
        ((be.a) this.capabilities).b(null);
        nativeSetAutoRefresh(this.nativePtr, z10);
    }

    public long size() {
        return nativeSize(this.nativePtr);
    }

    public void stopWaitForChange() {
        nativeStopWaitForChange(this.nativePtr);
    }

    public boolean waitForChange() {
        return nativeWaitForChange(this.nativePtr);
    }

    public void writeCopy(File file, byte[] bArr) {
        if (file.isFile() && file.exists()) {
            throw new IllegalArgumentException("The destination file must not exist");
        }
        nativeWriteCopy(this.nativePtr, file.getAbsolutePath(), bArr);
    }
}
