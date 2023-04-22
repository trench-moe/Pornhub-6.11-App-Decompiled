package io.realm.internal;

import io.realm.internal.ObservableCollection;
import io.realm.internal.core.DescriptorOrdering;
import io.realm.internal.core.QueryDescriptor;
import io.realm.r;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class OsResults implements g, ObservableCollection {

    /* renamed from: u  reason: collision with root package name */
    public static final long f10902u = nativeGetFinalizerPtr();

    /* renamed from: c  reason: collision with root package name */
    public final long f10903c;

    /* renamed from: f  reason: collision with root package name */
    public final OsSharedRealm f10904f;

    /* renamed from: j  reason: collision with root package name */
    public final Table f10905j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f10906m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public final i<ObservableCollection.a> f10907t;

    /* loaded from: classes2.dex */
    public enum Mode {
        EMPTY,
        TABLE,
        PRIMITIVE_LIST,
        QUERY,
        LINK_LIST,
        TABLEVIEW
    }

    /* loaded from: classes2.dex */
    public static abstract class a<T> implements Iterator<T> {

        /* renamed from: c  reason: collision with root package name */
        public OsResults f10914c;

        /* renamed from: f  reason: collision with root package name */
        public int f10915f = -1;

        public a(OsResults osResults) {
            if (osResults.f10904f.isClosed()) {
                throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
            }
            this.f10914c = osResults;
            if (osResults.n) {
                return;
            }
            if (osResults.f10904f.isInTransaction()) {
                this.f10914c = this.f10914c.d();
            } else {
                this.f10914c.f10904f.addIterator(this);
            }
        }

        public void a() {
            if (this.f10914c == null) {
                throw new ConcurrentModificationException("No outside changes to a Realm is allowed while iterating a living Realm collection.");
            }
        }

        public abstract T c(UncheckedRow uncheckedRow);

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return ((long) (this.f10915f + 1)) < this.f10914c.k();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            int i10 = this.f10915f + 1;
            this.f10915f = i10;
            if (i10 < this.f10914c.k()) {
                return c(this.f10914c.f(this.f10915f));
            }
            StringBuilder m10 = a1.a.m("Cannot access index ");
            m10.append(this.f10915f);
            m10.append(" when size is ");
            m10.append(this.f10914c.k());
            m10.append(". Remember to check hasNext() before using next().");
            throw new NoSuchElementException(m10.toString());
        }

        @Override // java.util.Iterator
        @Deprecated
        public void remove() {
            throw new UnsupportedOperationException("remove() is not supported by RealmResults iterators.");
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b<T> extends a<T> implements ListIterator<T> {
        public b(OsResults osResults, int i10) {
            super(osResults);
            if (i10 >= 0 && i10 <= this.f10914c.k()) {
                this.f10915f = i10 - 1;
                return;
            }
            StringBuilder m10 = a1.a.m("Starting location must be a valid index: [0, ");
            m10.append(this.f10914c.k() - 1);
            m10.append("]. Yours was ");
            m10.append(i10);
            throw new IndexOutOfBoundsException(m10.toString());
        }

        @Override // java.util.ListIterator
        @Deprecated
        public void add(T t2) {
            throw new UnsupportedOperationException("Adding an element is not supported. Use Realm.createObject() instead.");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            a();
            return this.f10915f >= 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            a();
            return this.f10915f + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            a();
            try {
                UncheckedRow f10 = this.f10914c.f(this.f10915f);
                io.realm.m mVar = io.realm.m.this;
                this.f10915f--;
                return (T) mVar.f10974c.h(mVar.f10975f, mVar.f10976j, f10);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException(android.support.v4.media.a.j(a1.a.m("Cannot access index less than zero. This was "), this.f10915f, ". Remember to check hasPrevious() before using previous()."));
            }
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            a();
            return this.f10915f;
        }

        @Override // java.util.ListIterator
        @Deprecated
        public void set(T t2) {
            throw new UnsupportedOperationException("Replacing an element is not supported.");
        }
    }

    public OsResults(OsSharedRealm osSharedRealm, Table table, long j10) {
        Mode mode;
        Mode mode2 = Mode.QUERY;
        this.n = false;
        this.f10907t = new i<>();
        this.f10904f = osSharedRealm;
        f fVar = osSharedRealm.context;
        this.f10905j = table;
        this.f10903c = j10;
        fVar.a(this);
        byte nativeGetMode = nativeGetMode(j10);
        if (nativeGetMode == 0) {
            mode = Mode.EMPTY;
        } else if (nativeGetMode == 1) {
            mode = Mode.TABLE;
        } else if (nativeGetMode == 2) {
            mode = Mode.PRIMITIVE_LIST;
        } else if (nativeGetMode == 3) {
            mode = mode2;
        } else if (nativeGetMode == 4) {
            mode = Mode.LINK_LIST;
        } else if (nativeGetMode != 5) {
            throw new IllegalArgumentException(a1.a.j("Invalid value: ", nativeGetMode));
        } else {
            mode = Mode.TABLEVIEW;
        }
        this.f10906m = mode != mode2;
    }

    public static OsResults c(OsSharedRealm osSharedRealm, TableQuery tableQuery, DescriptorOrdering descriptorOrdering) {
        tableQuery.h();
        return new OsResults(osSharedRealm, tableQuery.f10932c, nativeCreateResults(osSharedRealm.getNativePtr(), tableQuery.f10933f, descriptorOrdering.f10951c));
    }

    private static native void nativeClear(long j10);

    public static native long nativeCreateResults(long j10, long j11, long j12);

    private static native long nativeCreateSnapshot(long j10);

    private static native void nativeEvaluateQueryIfNeeded(long j10, boolean z10);

    private static native long nativeFirstRow(long j10);

    private static native long nativeGetFinalizerPtr();

    private static native byte nativeGetMode(long j10);

    private static native long nativeGetRow(long j10, int i10);

    private static native boolean nativeIsValid(long j10);

    private static native long nativeSize(long j10);

    private static native long nativeSort(long j10, QueryDescriptor queryDescriptor);

    private native void nativeStartListening(long j10);

    private native void nativeStopListening(long j10);

    public <T> void a(T t2, io.realm.l<T> lVar) {
        if (this.f10907t.c()) {
            nativeStartListening(this.f10903c);
        }
        this.f10907t.a(new ObservableCollection.a(t2, lVar));
    }

    public void b() {
        nativeClear(this.f10903c);
    }

    public OsResults d() {
        if (this.n) {
            return this;
        }
        OsResults osResults = new OsResults(this.f10904f, this.f10905j, nativeCreateSnapshot(this.f10903c));
        osResults.n = true;
        return osResults;
    }

    public UncheckedRow e() {
        long nativeFirstRow = nativeFirstRow(this.f10903c);
        if (nativeFirstRow != 0) {
            Table table = this.f10905j;
            return new UncheckedRow(table.f10928f, table, nativeFirstRow);
        }
        return null;
    }

    public UncheckedRow f(int i10) {
        Table table = this.f10905j;
        return new UncheckedRow(table.f10928f, table, nativeGetRow(this.f10903c, i10));
    }

    public boolean g() {
        return nativeIsValid(this.f10903c);
    }

    @Override // io.realm.internal.g
    public long getNativeFinalizerPtr() {
        return f10902u;
    }

    @Override // io.realm.internal.g
    public long getNativePtr() {
        return this.f10903c;
    }

    public void h() {
        if (this.f10906m) {
            return;
        }
        nativeEvaluateQueryIfNeeded(this.f10903c, false);
        notifyChangeListeners(0L);
    }

    public void i() {
        i<ObservableCollection.a> iVar = this.f10907t;
        iVar.f10959b = true;
        iVar.f10958a.clear();
        nativeStopListening(this.f10903c);
    }

    public <T> void j(T t2, io.realm.l<T> lVar) {
        this.f10907t.d(t2, lVar);
        if (this.f10907t.c()) {
            nativeStopListening(this.f10903c);
        }
    }

    public long k() {
        return nativeSize(this.f10903c);
    }

    public OsResults l(QueryDescriptor queryDescriptor) {
        return new OsResults(this.f10904f, this.f10905j, nativeSort(this.f10903c, queryDescriptor));
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j10) {
        OsCollectionChangeSet dVar = j10 == 0 ? new d() : new OsCollectionChangeSet(j10, !this.f10906m);
        if (dVar.e() && this.f10906m) {
            return;
        }
        this.f10906m = true;
        i<ObservableCollection.a> iVar = this.f10907t;
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
                    ((io.realm.l) s10).a(obj, new o(dVar));
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
