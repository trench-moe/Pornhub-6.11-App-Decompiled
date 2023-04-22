package kotlin.reflect.jvm.internal.pcollections;

import a1.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class ConsPStack<E> implements Iterable<E> {
    private static final ConsPStack<Object> EMPTY = new ConsPStack<>();
    public final E first;
    public final ConsPStack<E> rest;
    private final int size;

    /* loaded from: classes3.dex */
    public static class Itr<E> implements Iterator<E> {
        private ConsPStack<E> next;

        public Itr(ConsPStack<E> consPStack) {
            this.next = consPStack;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return ((ConsPStack) this.next).size > 0;
        }

        @Override // java.util.Iterator
        public E next() {
            ConsPStack<E> consPStack = this.next;
            E e10 = consPStack.first;
            this.next = consPStack.rest;
            return e10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private ConsPStack() {
        this.size = 0;
        this.first = null;
        this.rest = null;
    }

    private ConsPStack(E e10, ConsPStack<E> consPStack) {
        this.first = e10;
        this.rest = consPStack;
        this.size = consPStack.size + 1;
    }

    public static <E> ConsPStack<E> empty() {
        return (ConsPStack<E>) EMPTY;
    }

    private Iterator<E> iterator(int i10) {
        return new Itr(subList(i10));
    }

    private ConsPStack<E> minus(Object obj) {
        if (this.size == 0) {
            return this;
        }
        if (this.first.equals(obj)) {
            return this.rest;
        }
        ConsPStack<E> minus = this.rest.minus(obj);
        return minus == this.rest ? this : new ConsPStack<>(this.first, minus);
    }

    private ConsPStack<E> subList(int i10) {
        if (i10 < 0 || i10 > this.size) {
            throw new IndexOutOfBoundsException();
        }
        return i10 == 0 ? this : this.rest.subList(i10 - 1);
    }

    public E get(int i10) {
        if (i10 < 0 || i10 > this.size) {
            throw new IndexOutOfBoundsException();
        }
        try {
            return iterator(i10).next();
        } catch (NoSuchElementException unused) {
            throw new IndexOutOfBoundsException(a.j("Index: ", i10));
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return iterator(0);
    }

    public ConsPStack<E> minus(int i10) {
        return minus(get(i10));
    }

    public ConsPStack<E> plus(E e10) {
        return new ConsPStack<>(e10, this);
    }

    public int size() {
        return this.size;
    }
}
