package w9;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class a7 extends z4 implements RandomAccess {

    /* renamed from: m  reason: collision with root package name */
    public static final a7 f17067m;

    /* renamed from: f  reason: collision with root package name */
    public Object[] f17068f;

    /* renamed from: j  reason: collision with root package name */
    public int f17069j;

    static {
        a7 a7Var = new a7(new Object[0], 0);
        f17067m = a7Var;
        a7Var.f17389c = false;
    }

    public a7(Object[] objArr, int i10) {
        this.f17068f = objArr;
        this.f17069j = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f17069j)) {
            throw new IndexOutOfBoundsException(e(i10));
        }
        Object[] objArr = this.f17068f;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[a0.a.c(i11, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f17068f, i10, objArr2, i10 + 1, this.f17069j - i10);
            this.f17068f = objArr2;
        }
        this.f17068f[i10] = obj;
        this.f17069j++;
        ((AbstractList) this).modCount++;
    }

    @Override // w9.z4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f17069j;
        Object[] objArr = this.f17068f;
        if (i10 == objArr.length) {
            this.f17068f = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f17068f;
        int i11 = this.f17069j;
        this.f17069j = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final String e(int i10) {
        return a1.a.h(35, "Index:", i10, ", Size:", this.f17069j);
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f17069j) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return this.f17068f[i10];
    }

    @Override // w9.a6
    public final /* bridge */ /* synthetic */ a6 i(int i10) {
        if (i10 >= this.f17069j) {
            return new a7(Arrays.copyOf(this.f17068f, i10), this.f17069j);
        }
        throw new IllegalArgumentException();
    }

    @Override // w9.z4, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        b();
        g(i10);
        Object[] objArr = this.f17068f;
        Object obj = objArr[i10];
        if (i10 < this.f17069j - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f17069j--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        g(i10);
        Object[] objArr = this.f17068f;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17069j;
    }
}
