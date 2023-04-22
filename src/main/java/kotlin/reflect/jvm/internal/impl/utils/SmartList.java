package kotlin.reflect.jvm.internal.impl.utils;

import a1.a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class SmartList<E> extends AbstractList<E> implements RandomAccess {
    private Object myElem;
    private int mySize;

    /* loaded from: classes3.dex */
    public static class EmptyIterator<T> implements Iterator<T> {
        private static final EmptyIterator INSTANCE = new EmptyIterator();

        private EmptyIterator() {
        }

        public static <T> EmptyIterator<T> getInstance() {
            return INSTANCE;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes3.dex */
    public class SingletonIterator extends SingletonIteratorBase<E> {
        private final int myInitialModCount;

        public SingletonIterator() {
            super();
            this.myInitialModCount = ((AbstractList) SmartList.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.SingletonIteratorBase
        public void checkCoModification() {
            if (((AbstractList) SmartList.this).modCount == this.myInitialModCount) {
                return;
            }
            StringBuilder m10 = a.m("ModCount: ");
            m10.append(((AbstractList) SmartList.this).modCount);
            m10.append("; expected: ");
            m10.append(this.myInitialModCount);
            throw new ConcurrentModificationException(m10.toString());
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.SingletonIteratorBase
        public E getElement() {
            return (E) SmartList.this.myElem;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkCoModification();
            SmartList.this.clear();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class SingletonIteratorBase<T> implements Iterator<T> {
        private boolean myVisited;

        private SingletonIteratorBase() {
        }

        public abstract void checkCoModification();

        public abstract T getElement();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.myVisited;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.myVisited) {
                throw new NoSuchElementException();
            }
            this.myVisited = true;
            checkCoModification();
            return getElement();
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        if (i10 < 0 || i10 > (i11 = this.mySize)) {
            StringBuilder n = a.n("Index: ", i10, ", Size: ");
            n.append(this.mySize);
            throw new IndexOutOfBoundsException(n.toString());
        }
        if (i11 == 0) {
            this.myElem = e10;
        } else if (i11 == 1 && i10 == 0) {
            this.myElem = new Object[]{e10, this.myElem};
        } else {
            Object[] objArr = new Object[i11 + 1];
            if (i11 == 1) {
                objArr[0] = this.myElem;
            } else {
                Object[] objArr2 = (Object[]) this.myElem;
                System.arraycopy(objArr2, 0, objArr, 0, i10);
                System.arraycopy(objArr2, i10, objArr, i10 + 1, this.mySize - i10);
            }
            objArr[i10] = e10;
            this.myElem = objArr;
        }
        this.mySize++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        int i10 = this.mySize;
        if (i10 == 0) {
            this.myElem = e10;
        } else if (i10 == 1) {
            this.myElem = new Object[]{this.myElem, e10};
        } else {
            Object[] objArr = (Object[]) this.myElem;
            int length = objArr.length;
            if (i10 >= length) {
                int c10 = a0.a.c(length, 3, 2, 1);
                int i11 = i10 + 1;
                if (c10 < i11) {
                    c10 = i11;
                }
                Object[] objArr2 = new Object[c10];
                this.myElem = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.mySize] = e10;
        }
        this.mySize++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.myElem = null;
        this.mySize = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.mySize)) {
            return i11 == 1 ? (E) this.myElem : (E) ((Object[]) this.myElem)[i10];
        }
        StringBuilder n = a.n("Index: ", i10, ", Size: ");
        n.append(this.mySize);
        throw new IndexOutOfBoundsException(n.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        int i10 = this.mySize;
        if (i10 == 0) {
            EmptyIterator emptyIterator = EmptyIterator.getInstance();
            if (emptyIterator == null) {
                $$$reportNull$$$0(2);
            }
            return emptyIterator;
        } else if (i10 == 1) {
            return new SingletonIterator();
        } else {
            Iterator<E> it = super.iterator();
            if (it == null) {
                $$$reportNull$$$0(3);
            }
            return it;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        int i11;
        E e10;
        if (i10 < 0 || i10 >= (i11 = this.mySize)) {
            StringBuilder n = a.n("Index: ", i10, ", Size: ");
            n.append(this.mySize);
            throw new IndexOutOfBoundsException(n.toString());
        }
        if (i11 == 1) {
            e10 = (E) this.myElem;
            this.myElem = null;
        } else {
            Object[] objArr = (Object[]) this.myElem;
            Object obj = objArr[i10];
            if (i11 == 2) {
                this.myElem = objArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                }
                objArr[this.mySize - 1] = null;
            }
            e10 = (E) obj;
        }
        this.mySize--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.mySize)) {
            StringBuilder n = a.n("Index: ", i10, ", Size: ");
            n.append(this.mySize);
            throw new IndexOutOfBoundsException(n.toString());
        } else if (i11 == 1) {
            E e11 = (E) this.myElem;
            this.myElem = e10;
            return e11;
        } else {
            Object[] objArr = (Object[]) this.myElem;
            E e12 = (E) objArr[i10];
            objArr[i10] = e10;
            return e12;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.mySize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            $$$reportNull$$$0(4);
        }
        int length = tArr.length;
        int i10 = this.mySize;
        if (i10 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.myElem;
                return tArr2;
            }
            tArr[0] = this.myElem;
        } else if (length < i10) {
            T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.myElem, i10, tArr.getClass());
            if (tArr3 == null) {
                $$$reportNull$$$0(6);
            }
            return tArr3;
        } else if (i10 != 0) {
            System.arraycopy(this.myElem, 0, tArr, 0, i10);
        }
        int i11 = this.mySize;
        if (length > i11) {
            tArr[i11] = 0;
        }
        return tArr;
    }
}
