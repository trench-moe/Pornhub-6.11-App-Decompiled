package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.exceptions.RealmException;
import io.realm.internal.i;
import io.realm.u;
import io.realm.w;
import org.bson.types.ObjectId;

@Keep
/* loaded from: classes2.dex */
public class OsObject implements g {
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;
    private i<a> observerPairs = new i<>();

    /* loaded from: classes2.dex */
    public static class a<T extends u> extends i.b<T, w<T>> {
        public a(T t2, w<T> wVar) {
            super(t2, wVar);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements io.realm.j {
        public b(String[] strArr, boolean z10) {
        }
    }

    public OsObject(OsSharedRealm osSharedRealm, UncheckedRow uncheckedRow) {
        this.nativePtr = nativeCreate(osSharedRealm.getNativePtr(), uncheckedRow.f10938j);
        osSharedRealm.context.a(this);
    }

    public static UncheckedRow create(Table table) {
        return new UncheckedRow(table.f10929j.context, table, nativeCreateNewObject(table.f10927c));
    }

    public static long createEmbeddedObject(Table table, long j10, long j11) {
        return nativeCreateEmbeddedObject(table.f10927c, j10, j11);
    }

    public static long createRow(Table table) {
        return nativeCreateRow(table.f10927c);
    }

    public static long createRowWithPrimaryKey(Table table, long j10, Object obj) {
        RealmFieldType i10 = table.i(j10);
        OsSharedRealm osSharedRealm = table.f10929j;
        if (i10 == RealmFieldType.STRING) {
            if (obj == null || (obj instanceof String)) {
                return nativeCreateRowWithStringPrimaryKey(osSharedRealm.getNativePtr(), table.f10927c, j10, (String) obj);
            }
            throw new IllegalArgumentException("Primary key value is not a String: " + obj);
        } else if (i10 == RealmFieldType.INTEGER) {
            return nativeCreateRowWithLongPrimaryKey(osSharedRealm.getNativePtr(), table.f10927c, j10, obj == null ? 0L : Long.parseLong(obj.toString()), obj == null);
        } else if (i10 != RealmFieldType.OBJECT_ID) {
            throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + i10);
        } else if (obj == null || (obj instanceof ObjectId)) {
            return nativeCreateRowWithObjectIdPrimaryKey(osSharedRealm.getNativePtr(), table.f10927c, j10, obj == null ? null : obj.toString());
        } else {
            throw new IllegalArgumentException("Primary key value is not an ObjectId: " + obj);
        }
    }

    public static UncheckedRow createWithPrimaryKey(Table table, Object obj) {
        long andVerifyPrimaryKeyColumnIndex = getAndVerifyPrimaryKeyColumnIndex(table);
        RealmFieldType i10 = table.i(andVerifyPrimaryKeyColumnIndex);
        OsSharedRealm osSharedRealm = table.f10929j;
        if (i10 == RealmFieldType.STRING) {
            if (obj == null || (obj instanceof String)) {
                return new UncheckedRow(osSharedRealm.context, table, nativeCreateNewObjectWithStringPrimaryKey(osSharedRealm.getNativePtr(), table.f10927c, andVerifyPrimaryKeyColumnIndex, (String) obj));
            }
            throw new IllegalArgumentException("Primary key value is not a String: " + obj);
        } else if (i10 == RealmFieldType.INTEGER) {
            return new UncheckedRow(osSharedRealm.context, table, nativeCreateNewObjectWithLongPrimaryKey(osSharedRealm.getNativePtr(), table.f10927c, andVerifyPrimaryKeyColumnIndex, obj == null ? 0L : Long.parseLong(obj.toString()), obj == null));
        } else if (i10 == RealmFieldType.OBJECT_ID) {
            return new UncheckedRow(osSharedRealm.context, table, nativeCreateNewObjectWithObjectIdPrimaryKey(osSharedRealm.getNativePtr(), table.f10927c, andVerifyPrimaryKeyColumnIndex, obj == null ? null : obj.toString()));
        } else {
            throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + i10);
        }
    }

    private static long getAndVerifyPrimaryKeyColumnIndex(Table table) {
        String b10 = OsObjectStore.b(table.f10929j, table.d());
        if (b10 != null) {
            return table.f(b10);
        }
        throw new IllegalStateException(table.k() + " has no primary key defined.");
    }

    private static native long nativeCreate(long j10, long j11);

    private static native long nativeCreateEmbeddedObject(long j10, long j11, long j12);

    private static native long nativeCreateNewObject(long j10);

    private static native long nativeCreateNewObjectWithLongPrimaryKey(long j10, long j11, long j12, long j13, boolean z10);

    private static native long nativeCreateNewObjectWithObjectIdPrimaryKey(long j10, long j11, long j12, String str);

    private static native long nativeCreateNewObjectWithStringPrimaryKey(long j10, long j11, long j12, String str);

    private static native long nativeCreateRow(long j10);

    private static native long nativeCreateRowWithLongPrimaryKey(long j10, long j11, long j12, long j13, boolean z10);

    private static native long nativeCreateRowWithObjectIdPrimaryKey(long j10, long j11, long j12, String str);

    private static native long nativeCreateRowWithStringPrimaryKey(long j10, long j11, long j12, String str);

    private static native long nativeGetFinalizerPtr();

    private native void nativeStartListening(long j10);

    private native void nativeStopListening(long j10);

    private void notifyChangeListeners(String[] strArr) {
        i<a> iVar = this.observerPairs;
        for (a aVar : iVar.f10958a) {
            if (iVar.f10959b) {
                return;
            }
            Object obj = aVar.f10960a.get();
            if (obj == null) {
                iVar.f10958a.remove(aVar);
            } else if (!aVar.f10962c) {
                a aVar2 = aVar;
                u uVar = (u) obj;
                boolean z10 = strArr == null;
                ((w) aVar2.f10961b).a(uVar, new b(z10 ? new String[0] : strArr, z10));
            }
        }
    }

    public <T extends u> void addListener(T t2, w<T> wVar) {
        if (this.observerPairs.c()) {
            nativeStartListening(this.nativePtr);
        }
        this.observerPairs.a(new a(t2, wVar));
    }

    @Override // io.realm.internal.g
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.g
    public long getNativePtr() {
        return this.nativePtr;
    }

    public <T extends u> void removeListener(T t2) {
        this.observerPairs.e(t2);
        if (this.observerPairs.c()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public <T extends u> void removeListener(T t2, w<T> wVar) {
        this.observerPairs.d(t2, wVar);
        if (this.observerPairs.c()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public void setObserverPairs(i<a> iVar) {
        if (!this.observerPairs.c()) {
            throw new IllegalStateException("'observerPairs' is not empty. Listeners have been added before.");
        }
        this.observerPairs = iVar;
        if (iVar.c()) {
            return;
        }
        nativeStartListening(this.nativePtr);
    }
}
