package w9;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class g5 extends z4 implements RandomAccess, y6 {

    /* renamed from: f  reason: collision with root package name */
    public double[] f17165f;

    /* renamed from: j  reason: collision with root package name */
    public int f17166j;

    static {
        new g5(new double[0], 0).f17389c = false;
    }

    public g5() {
        this.f17165f = new double[10];
        this.f17166j = 0;
    }

    public g5(double[] dArr, int i10) {
        this.f17165f = dArr;
        this.f17166j = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f17166j)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        double[] dArr = this.f17165f;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[a0.a.c(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f17165f, i10, dArr2, i10 + 1, this.f17166j - i10);
            this.f17165f = dArr2;
        }
        this.f17165f[i10] = doubleValue;
        this.f17166j++;
        ((AbstractList) this).modCount++;
    }

    @Override // w9.z4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }

    @Override // w9.z4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = b6.f17081a;
        Objects.requireNonNull(collection);
        if (collection instanceof g5) {
            g5 g5Var = (g5) collection;
            int i10 = g5Var.f17166j;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f17166j;
            if (IntCompanionObject.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                double[] dArr = this.f17165f;
                if (i12 > dArr.length) {
                    this.f17165f = Arrays.copyOf(dArr, i12);
                }
                System.arraycopy(g5Var.f17165f, 0, this.f17165f, this.f17166j, g5Var.f17166j);
                this.f17166j = i12;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(double d) {
        b();
        int i10 = this.f17166j;
        double[] dArr = this.f17165f;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[a0.a.c(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f17165f = dArr2;
        }
        double[] dArr3 = this.f17165f;
        int i11 = this.f17166j;
        this.f17166j = i11 + 1;
        dArr3[i11] = d;
    }

    @Override // w9.z4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g5) {
            g5 g5Var = (g5) obj;
            if (this.f17166j != g5Var.f17166j) {
                return false;
            }
            double[] dArr = g5Var.f17165f;
            for (int i10 = 0; i10 < this.f17166j; i10++) {
                if (Double.doubleToLongBits(this.f17165f[i10]) != Double.doubleToLongBits(dArr[i10])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final String g(int i10) {
        return a1.a.h(35, "Index:", i10, ", Size:", this.f17166j);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Double.valueOf(this.f17165f[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f17166j) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // w9.z4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f17166j; i11++) {
            i10 = (i10 * 31) + b6.b(Double.doubleToLongBits(this.f17165f[i11]));
        }
        return i10;
    }

    @Override // w9.a6
    public final /* bridge */ /* synthetic */ a6 i(int i10) {
        if (i10 >= this.f17166j) {
            return new g5(Arrays.copyOf(this.f17165f, i10), this.f17166j);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i10 = this.f17166j;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f17165f[i11] == doubleValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // w9.z4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        b();
        h(i10);
        double[] dArr = this.f17165f;
        double d = dArr[i10];
        if (i10 < this.f17166j - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f17166j--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f17165f;
        System.arraycopy(dArr, i11, dArr, i10, this.f17166j - i11);
        this.f17166j -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        b();
        h(i10);
        double[] dArr = this.f17165f;
        double d = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17166j;
    }
}
