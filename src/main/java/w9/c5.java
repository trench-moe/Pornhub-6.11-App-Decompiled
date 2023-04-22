package w9;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class c5 extends z4 implements RandomAccess, y6 {

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f17094f;

    /* renamed from: j  reason: collision with root package name */
    public int f17095j;

    static {
        new c5(new boolean[0], 0).f17389c = false;
    }

    public c5() {
        this.f17094f = new boolean[10];
        this.f17095j = 0;
    }

    public c5(boolean[] zArr, int i10) {
        this.f17094f = zArr;
        this.f17095j = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f17095j)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        boolean[] zArr = this.f17094f;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[a0.a.c(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f17094f, i10, zArr2, i10 + 1, this.f17095j - i10);
            this.f17094f = zArr2;
        }
        this.f17094f[i10] = booleanValue;
        this.f17095j++;
        ((AbstractList) this).modCount++;
    }

    @Override // w9.z4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // w9.z4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = b6.f17081a;
        Objects.requireNonNull(collection);
        if (collection instanceof c5) {
            c5 c5Var = (c5) collection;
            int i10 = c5Var.f17095j;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f17095j;
            if (IntCompanionObject.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                boolean[] zArr = this.f17094f;
                if (i12 > zArr.length) {
                    this.f17094f = Arrays.copyOf(zArr, i12);
                }
                System.arraycopy(c5Var.f17094f, 0, this.f17094f, this.f17095j, c5Var.f17095j);
                this.f17095j = i12;
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

    public final void e(boolean z10) {
        b();
        int i10 = this.f17095j;
        boolean[] zArr = this.f17094f;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[a0.a.c(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f17094f = zArr2;
        }
        boolean[] zArr3 = this.f17094f;
        int i11 = this.f17095j;
        this.f17095j = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // w9.z4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c5) {
            c5 c5Var = (c5) obj;
            if (this.f17095j != c5Var.f17095j) {
                return false;
            }
            boolean[] zArr = c5Var.f17094f;
            for (int i10 = 0; i10 < this.f17095j; i10++) {
                if (this.f17094f[i10] != zArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final String g(int i10) {
        return a1.a.h(35, "Index:", i10, ", Size:", this.f17095j);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Boolean.valueOf(this.f17094f[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f17095j) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // w9.z4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f17095j; i11++) {
            i10 = (i10 * 31) + b6.a(this.f17094f[i11]);
        }
        return i10;
    }

    @Override // w9.a6
    public final /* bridge */ /* synthetic */ a6 i(int i10) {
        if (i10 >= this.f17095j) {
            return new c5(Arrays.copyOf(this.f17094f, i10), this.f17095j);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i10 = this.f17095j;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f17094f[i11] == booleanValue) {
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
        boolean[] zArr = this.f17094f;
        boolean z10 = zArr[i10];
        if (i10 < this.f17095j - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f17095j--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f17094f;
        System.arraycopy(zArr, i11, zArr, i10, this.f17095j - i11);
        this.f17095j -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        h(i10);
        boolean[] zArr = this.f17094f;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17095j;
    }
}
