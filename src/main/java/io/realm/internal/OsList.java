package io.realm.internal;

import io.realm.internal.ObservableCollection;
import io.realm.r;

/* loaded from: classes2.dex */
public class OsList implements g, ObservableCollection {

    /* renamed from: j  reason: collision with root package name */
    public static final long f10873j = nativeGetFinalizerPtr();

    /* renamed from: c  reason: collision with root package name */
    public final long f10874c;

    /* renamed from: f  reason: collision with root package name */
    public final i<ObservableCollection.a> f10875f = new i<>();

    public OsList(UncheckedRow uncheckedRow, long j10) {
        OsSharedRealm osSharedRealm = uncheckedRow.f10937f.f10929j;
        long[] nativeCreate = nativeCreate(osSharedRealm.getNativePtr(), uncheckedRow.f10938j, j10);
        this.f10874c = nativeCreate[0];
        osSharedRealm.context.a(this);
        if (nativeCreate[1] != 0) {
            new Table(osSharedRealm, nativeCreate[1]);
        }
    }

    private static native long[] nativeCreate(long j10, long j11, long j12);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeSize(long j10);

    public long a() {
        return nativeSize(this.f10874c);
    }

    @Override // io.realm.internal.g
    public long getNativeFinalizerPtr() {
        return f10873j;
    }

    @Override // io.realm.internal.g
    public long getNativePtr() {
        return this.f10874c;
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j10) {
        OsCollectionChangeSet osCollectionChangeSet = new OsCollectionChangeSet(j10, false);
        if (j10 == 0) {
            return;
        }
        i<ObservableCollection.a> iVar = this.f10875f;
        for (ObservableCollection.a aVar : iVar.f10958a) {
            if (iVar.f10959b) {
                return;
            }
            Object obj = aVar.f10960a.get();
            if (obj == null) {
                iVar.f10958a.remove(aVar);
            } else if (aVar.f10962c) {
                continue;
            } else {
                ObservableCollection.a aVar2 = aVar;
                S s10 = aVar2.f10961b;
                if (s10 instanceof io.realm.l) {
                    ((io.realm.l) s10).a(obj, new o(osCollectionChangeSet));
                } else if (!(s10 instanceof r)) {
                    StringBuilder m10 = a1.a.m("Unsupported listener type: ");
                    m10.append(aVar2.f10961b);
                    throw new RuntimeException(m10.toString());
                } else {
                    ((r) s10).a(obj);
                }
            }
        }
    }
}
