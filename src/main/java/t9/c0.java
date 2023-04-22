package t9;

import com.google.android.gms.internal.cast.zzdu;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class c0<E> extends d0<Object> {

    /* renamed from: c  reason: collision with root package name */
    public final int f15187c;

    /* renamed from: f  reason: collision with root package name */
    public int f15188f;

    /* renamed from: j  reason: collision with root package name */
    public final zzdu<E> f15189j;

    public c0(zzdu<E> zzduVar, int i10) {
        int size = zzduVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(t3.a.G(i10, size, "index"));
        }
        this.f15187c = size;
        this.f15188f = i10;
        this.f15189j = zzduVar;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f15188f < this.f15187c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15188f > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f15188f;
            this.f15188f = i10 + 1;
            return this.f15189j.get(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15188f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f15188f - 1;
            this.f15188f = i10;
            return this.f15189j.get(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15188f - 1;
    }
}
