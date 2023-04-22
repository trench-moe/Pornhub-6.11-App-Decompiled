package com.google.common.collect;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import kb.v;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f7958j = 0;
    @RetainedWith
    @NullableDecl
    @LazyInit

    /* renamed from: f  reason: collision with root package name */
    public transient ImmutableList<E> f7959f;

    /* loaded from: classes.dex */
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.r(this.elements);
        }
    }

    public static int o(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        jb.e.c(z10, "collection too large");
        return 1073741824;
    }

    public static <E> ImmutableSet<E> p(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int o10 = o(i10);
                Object[] objArr2 = new Object[o10];
                int i11 = o10 - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    kb.f.a(obj, i14);
                    int hashCode = obj.hashCode();
                    int b10 = kb.f.b(hashCode);
                    while (true) {
                        int i15 = b10 & i11;
                        Object obj2 = objArr2[i15];
                        if (obj2 == null) {
                            objArr[i13] = obj;
                            objArr2[i15] = obj;
                            i12 += hashCode;
                            i13++;
                            break;
                        } else if (obj2.equals(obj)) {
                            break;
                        } else {
                            b10++;
                        }
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    return new SingletonImmutableSet(objArr[0], i12);
                }
                if (o(i13) < o10 / 2) {
                    return p(i13, objArr);
                }
                int length = objArr.length;
                if (i13 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new RegularImmutableSet(objArr, i12, objArr2, i11, i13);
            }
            return new SingletonImmutableSet(objArr[0]);
        }
        return RegularImmutableSet.y;
    }

    public static <E> ImmutableSet<E> q(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.l()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return p(array.length, array);
    }

    public static <E> ImmutableSet<E> r(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? p(eArr.length, (Object[]) eArr.clone()) : new SingletonImmutableSet(eArr[0]) : RegularImmutableSet.y;
    }

    public static <E> ImmutableSet<E> w(E e10, E e11, E e12) {
        return p(3, e10, e11, e12);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> b() {
        ImmutableList<E> immutableList = this.f7959f;
        if (immutableList == null) {
            immutableList = s();
            this.f7959f = immutableList;
        }
        return immutableList;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && u() && ((ImmutableSet) obj).u() && hashCode() != obj.hashCode()) {
            return false;
        }
        return v.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return v.b(this);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public ImmutableList<E> s() {
        return ImmutableList.o(toArray());
    }

    public boolean u() {
        return this instanceof RegularImmutableSet;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }
}
