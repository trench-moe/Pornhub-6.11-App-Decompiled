package t9;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class l1 extends x0<Integer> implements RandomAccess, p1, p2 {

    /* renamed from: m  reason: collision with root package name */
    public static final l1 f15284m;

    /* renamed from: f  reason: collision with root package name */
    public int[] f15285f;

    /* renamed from: j  reason: collision with root package name */
    public int f15286j;

    static {
        l1 l1Var = new l1(new int[0], 0);
        f15284m = l1Var;
        l1Var.f15365c = false;
    }

    public l1() {
        this.f15285f = new int[10];
        this.f15286j = 0;
    }

    public l1(int[] iArr, int i10) {
        this.f15285f = iArr;
        this.f15286j = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f15286j)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        int[] iArr = this.f15285f;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[a0.a.c(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f15285f, i10, iArr2, i10 + 1, this.f15286j - i10);
            this.f15285f = iArr2;
        }
        this.f15285f[i10] = intValue;
        this.f15286j++;
        ((AbstractList) this).modCount++;
    }

    @Override // t9.x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }

    @Override // t9.x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        b();
        Charset charset = t1.f15353a;
        Objects.requireNonNull(collection);
        if (collection instanceof l1) {
            l1 l1Var = (l1) collection;
            int i10 = l1Var.f15286j;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f15286j;
            if (IntCompanionObject.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                int[] iArr = this.f15285f;
                if (i12 > iArr.length) {
                    this.f15285f = Arrays.copyOf(iArr, i12);
                }
                System.arraycopy(l1Var.f15285f, 0, this.f15285f, this.f15286j, l1Var.f15286j);
                this.f15286j = i12;
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

    public final int e(int i10) {
        l(i10);
        return this.f15285f[i10];
    }

    @Override // t9.x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l1) {
            l1 l1Var = (l1) obj;
            if (this.f15286j != l1Var.f15286j) {
                return false;
            }
            int[] iArr = l1Var.f15285f;
            for (int i10 = 0; i10 < this.f15286j; i10++) {
                if (this.f15285f[i10] != iArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // t9.s1
    /* renamed from: g */
    public final p1 zzg(int i10) {
        if (i10 >= this.f15286j) {
            return new l1(Arrays.copyOf(this.f15285f, i10), this.f15286j);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        l(i10);
        return Integer.valueOf(this.f15285f[i10]);
    }

    public final void h(int i10) {
        b();
        int i11 = this.f15286j;
        int[] iArr = this.f15285f;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[a0.a.c(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f15285f = iArr2;
        }
        int[] iArr3 = this.f15285f;
        int i12 = this.f15286j;
        this.f15286j = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // t9.x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f15286j; i11++) {
            i10 = (i10 * 31) + this.f15285f[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f15286j;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f15285f[i11] == intValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    public final String j(int i10) {
        return a1.a.h(35, "Index:", i10, ", Size:", this.f15286j);
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f15286j) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    @Override // t9.x0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        b();
        l(i10);
        int[] iArr = this.f15285f;
        int i12 = iArr[i10];
        if (i10 < this.f15286j - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f15286j--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f15285f;
        System.arraycopy(iArr, i11, iArr, i10, this.f15286j - i11);
        this.f15286j -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        l(i10);
        int[] iArr = this.f15285f;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15286j;
    }
}
