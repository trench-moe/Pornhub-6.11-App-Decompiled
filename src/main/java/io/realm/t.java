package io.realm;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public class t<E> extends AbstractList<E> implements OrderedRealmCollection<E> {

    /* renamed from: c  reason: collision with root package name */
    public List<E> f11028c = new ArrayList();

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        this.f11028c.add(i10, e10);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        this.f11028c.add(e10);
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f11028c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f11028c.contains(obj);
    }

    @Override // io.realm.RealmCollection
    public boolean f() {
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        return this.f11028c.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return super.iterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return super.listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        return super.listIterator(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        E remove = this.f11028c.remove(i10);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        return this.f11028c.set(i10, e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11028c.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("RealmList<?>@[");
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            E e10 = get(i10);
            if (e10 instanceof u) {
                sb2.append(System.identityHashCode(e10));
            } else if (e10 instanceof byte[]) {
                sb2.append("byte[");
                sb2.append(((byte[]) e10).length);
                sb2.append("]");
            } else {
                sb2.append(e10);
            }
            sb2.append(",");
        }
        if (size() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // io.realm.RealmCollection
    public boolean v() {
        return false;
    }
}
