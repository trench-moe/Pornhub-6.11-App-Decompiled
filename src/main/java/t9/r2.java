package t9;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class r2<E> extends x0<E> implements RandomAccess {

    /* renamed from: m  reason: collision with root package name */
    public static final r2<Object> f15333m;

    /* renamed from: f  reason: collision with root package name */
    public E[] f15334f;

    /* renamed from: j  reason: collision with root package name */
    public int f15335j;

    static {
        r2<Object> r2Var = new r2<>(new Object[0], 0);
        f15333m = r2Var;
        r2Var.f15365c = false;
    }

    public r2(E[] eArr, int i10) {
        this.f15334f = eArr;
        this.f15335j = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f15335j)) {
            throw new IndexOutOfBoundsException(e(i10));
        }
        E[] eArr = this.f15334f;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) new Object[a0.a.c(i11, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f15334f, i10, eArr2, i10 + 1, this.f15335j - i10);
            this.f15334f = eArr2;
        }
        this.f15334f[i10] = e10;
        this.f15335j++;
        ((AbstractList) this).modCount++;
    }

    @Override // t9.x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        b();
        int i10 = this.f15335j;
        E[] eArr = this.f15334f;
        if (i10 == eArr.length) {
            this.f15334f = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f15334f;
        int i11 = this.f15335j;
        this.f15335j = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final String e(int i10) {
        return a1.a.h(35, "Index:", i10, ", Size:", this.f15335j);
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f15335j) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        g(i10);
        return this.f15334f[i10];
    }

    @Override // t9.x0, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        int i11;
        b();
        g(i10);
        E[] eArr = this.f15334f;
        E e10 = eArr[i10];
        if (i10 < this.f15335j - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f15335j--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        b();
        g(i10);
        E[] eArr = this.f15334f;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15335j;
    }

    @Override // t9.s1
    public final /* bridge */ /* synthetic */ s1 zzg(int i10) {
        if (i10 >= this.f15335j) {
            return new r2(Arrays.copyOf(this.f15334f, i10), this.f15335j);
        }
        throw new IllegalArgumentException();
    }
}
