package xb;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class b0<E> implements List<E>, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    public final List<E> f18210c;

    public b0(List<E> list) {
        this.f18210c = Collections.unmodifiableList(list);
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        this.f18210c.add(i10, e10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e10) {
        return this.f18210c.add(e10);
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        return this.f18210c.addAll(i10, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f18210c.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f18210c.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f18210c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f18210c.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f18210c.equals(obj);
    }

    @Override // java.util.List
    public E get(int i10) {
        return this.f18210c.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f18210c.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f18210c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f18210c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f18210c.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f18210c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f18210c.listIterator();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return this.f18210c.listIterator(i10);
    }

    @Override // java.util.List
    public E remove(int i10) {
        return this.f18210c.remove(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f18210c.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f18210c.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f18210c.retainAll(collection);
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        return this.f18210c.set(i10, e10);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f18210c.size();
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return this.f18210c.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f18210c.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f18210c.toArray(tArr);
    }
}
