package kb;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class a<E> extends x<Object> implements ListIterator<Object> {

    /* renamed from: c  reason: collision with root package name */
    public final int f12044c;

    /* renamed from: f  reason: collision with root package name */
    public int f12045f;

    public a(int i10, int i11) {
        jb.e.e(i11, i10);
        this.f12044c = i10;
        this.f12045f = i11;
    }

    public abstract E a(int i10);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f12045f < this.f12044c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12045f > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f12045f;
            this.f12045f = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12045f;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f12045f - 1;
            this.f12045f = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12045f - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
