package io.realm;

import io.realm.internal.InvalidRow;
import io.realm.internal.OsResults;
import io.realm.internal.UncheckedRow;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public abstract class m<E> extends AbstractList<E> implements OrderedRealmCollection<E> {

    /* renamed from: c  reason: collision with root package name */
    public final io.realm.a f10974c;

    /* renamed from: f  reason: collision with root package name */
    public final Class<E> f10975f;

    /* renamed from: j  reason: collision with root package name */
    public final String f10976j;

    /* renamed from: m  reason: collision with root package name */
    public final OsResults f10977m;

    /* loaded from: classes2.dex */
    public class a extends OsResults.a<E> {
        public a() {
            super(m.this.f10977m);
        }

        @Override // io.realm.internal.OsResults.a
        public E c(UncheckedRow uncheckedRow) {
            m mVar = m.this;
            return (E) mVar.f10974c.h(mVar.f10975f, mVar.f10976j, uncheckedRow);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends OsResults.b<E> {
        public b(int i10) {
            super(m.this.f10977m, i10);
        }

        @Override // io.realm.internal.OsResults.a
        public E c(UncheckedRow uncheckedRow) {
            m mVar = m.this;
            return (E) mVar.f10974c.h(mVar.f10975f, mVar.f10976j, uncheckedRow);
        }
    }

    public m(io.realm.a aVar, OsResults osResults, Class<E> cls) {
        this.f10974c = aVar;
        this.f10977m = osResults;
        this.f10975f = cls;
        this.f10976j = null;
    }

    public m(io.realm.a aVar, OsResults osResults, String str) {
        this.f10974c = aVar;
        this.f10977m = osResults;
        this.f10975f = null;
        this.f10976j = str;
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean add(E e10) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public final E b(boolean z10, E e10) {
        UncheckedRow e11 = this.f10977m.e();
        if (e11 != null) {
            return (E) this.f10974c.h(this.f10975f, this.f10976j, e11);
        }
        if (z10) {
            throw new IndexOutOfBoundsException("No results were found.");
        }
        return e10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        y yVar = (y) this;
        yVar.f10974c.e();
        if (!yVar.f10977m.f10906m || ((obj instanceof io.realm.internal.l) && ((io.realm.internal.l) obj).o().f10983c == InvalidRow.INSTANCE)) {
            return false;
        }
        a aVar = new a();
        while (aVar.hasNext()) {
            if (aVar.next().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.realm.RealmCollection
    public boolean f() {
        return this.f10977m.g();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        this.f10974c.e();
        return (E) this.f10974c.h(this.f10975f, this.f10976j, this.f10977m.f(i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new b(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new b(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public E remove(int i10) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        y yVar = (y) this;
        yVar.f10974c.e();
        if (yVar.f10977m.f10906m) {
            long k10 = this.f10977m.k();
            return k10 > 2147483647L ? IntCompanionObject.MAX_VALUE : (int) k10;
        }
        return 0;
    }

    @Override // io.realm.RealmCollection
    public boolean v() {
        return true;
    }
}
