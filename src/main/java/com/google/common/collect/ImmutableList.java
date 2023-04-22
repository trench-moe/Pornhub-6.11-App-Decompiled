package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import kb.x;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    public static final kb.a f7944f = new b(RegularImmutableList.n, 0);

    /* loaded from: classes.dex */
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            Object[] objArr = this.elements;
            kb.a aVar = ImmutableList.f7944f;
            return objArr.length == 0 ? RegularImmutableList.n : ImmutableList.q((Object[]) objArr.clone());
        }
    }

    /* loaded from: classes.dex */
    public class SubList extends ImmutableList<E> {

        /* renamed from: j  reason: collision with root package name */
        public final transient int f7945j;

        /* renamed from: m  reason: collision with root package name */
        public final transient int f7946m;

        public SubList(int i10, int i11) {
            this.f7945j = i10;
            this.f7946m = i11;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object[] g() {
            return ImmutableList.this.g();
        }

        @Override // java.util.List
        public E get(int i10) {
            jb.e.d(i10, this.f7946m);
            return ImmutableList.this.get(i10 + this.f7945j);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int h() {
            return ImmutableList.this.j() + this.f7945j + this.f7946m;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return listIterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int j() {
            return ImmutableList.this.j() + this.f7945j;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean l() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return listIterator(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7946m;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* renamed from: z */
        public ImmutableList<E> subList(int i10, int i11) {
            jb.e.f(i10, i11, this.f7946m);
            ImmutableList immutableList = ImmutableList.this;
            int i12 = this.f7945j;
            return immutableList.subList(i10 + i12, i11 + i12);
        }
    }

    /* loaded from: classes.dex */
    public static final class a<E> extends ImmutableCollection.a<E> {
        public a() {
            super(4);
        }

        @CanIgnoreReturnValue
        public a<E> b(E e10) {
            Objects.requireNonNull(e10);
            int i10 = this.f7942b + 1;
            Object[] objArr = this.f7941a;
            if (objArr.length < i10) {
                this.f7941a = Arrays.copyOf(objArr, ImmutableCollection.b.a(objArr.length, i10));
                this.f7943c = false;
            } else if (this.f7943c) {
                this.f7941a = (Object[]) objArr.clone();
                this.f7943c = false;
            }
            Object[] objArr2 = this.f7941a;
            int i11 = this.f7942b;
            this.f7942b = i11 + 1;
            objArr2[i11] = e10;
            return this;
        }

        public ImmutableList<E> c() {
            this.f7943c = true;
            return ImmutableList.p(this.f7941a, this.f7942b);
        }
    }

    /* loaded from: classes.dex */
    public static class b<E> extends kb.a<E> {

        /* renamed from: j  reason: collision with root package name */
        public final ImmutableList<E> f7947j;

        public b(ImmutableList<E> immutableList, int i10) {
            super(immutableList.size(), i10);
            this.f7947j = immutableList;
        }

        @Override // kb.a
        public E a(int i10) {
            return this.f7947j.get(i10);
        }
    }

    public static <E> ImmutableList<E> o(Object[] objArr) {
        return p(objArr, objArr.length);
    }

    public static <E> ImmutableList<E> p(Object[] objArr, int i10) {
        return i10 == 0 ? (ImmutableList<E>) RegularImmutableList.n : new RegularImmutableList(objArr, i10);
    }

    public static <E> ImmutableList<E> q(Object... objArr) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            kb.f.a(objArr[i10], i10);
        }
        return p(objArr, objArr.length);
    }

    public static <E> ImmutableList<E> r(Collection<? extends E> collection) {
        if (collection instanceof ImmutableCollection) {
            ImmutableList<E> b10 = ((ImmutableCollection) collection).b();
            if (b10.l()) {
                b10 = o(b10.toArray());
            }
            return b10;
        }
        return q(collection.toArray());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> ImmutableList<E> w() {
        return (ImmutableList<E>) RegularImmutableList.n;
    }

    public static <E> ImmutableList<E> x(E e10) {
        return q(e10);
    }

    public static <E> ImmutableList<E> y(E e10, E e11, E e12, E e13, E e14) {
        return q(e10, e11, e12, e13, e14);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList<E> b() {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int e(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            if (!(list instanceof RandomAccess)) {
                Iterator<E> it = list.iterator();
                for (E e10 : this) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    if (!jb.d.a(e10, it.next())) {
                        return false;
                    }
                }
                return !it.hasNext();
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (!jb.d.a(get(i10), list.get(i10))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public x<E> m() {
        return listIterator();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s */
    public kb.a listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: u */
    public kb.a listIterator(int i10) {
        jb.e.e(i10, size());
        return isEmpty() ? f7944f : new b(this, i10);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    @Override // java.util.List
    /* renamed from: z */
    public ImmutableList<E> subList(int i10, int i11) {
        jb.e.f(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? (ImmutableList<E>) RegularImmutableList.n : new SubList(i10, i12);
    }
}
