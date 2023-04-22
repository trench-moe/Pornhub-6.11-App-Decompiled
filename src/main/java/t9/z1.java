package t9;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class z1 extends x0<Long> implements RandomAccess, r1, p2 {

    /* renamed from: m  reason: collision with root package name */
    public static final z1 f15376m;

    /* renamed from: f  reason: collision with root package name */
    public long[] f15377f;

    /* renamed from: j  reason: collision with root package name */
    public int f15378j;

    static {
        z1 z1Var = new z1(new long[0], 0);
        f15376m = z1Var;
        z1Var.f15365c = false;
    }

    public z1() {
        this.f15377f = new long[10];
        this.f15378j = 0;
    }

    public z1(long[] jArr, int i10) {
        this.f15377f = jArr;
        this.f15378j = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f15378j)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        long[] jArr = this.f15377f;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[a0.a.c(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f15377f, i10, jArr2, i10 + 1, this.f15378j - i10);
            this.f15377f = jArr2;
        }
        this.f15377f[i10] = longValue;
        this.f15378j++;
        ((AbstractList) this).modCount++;
    }

    @Override // t9.x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        int i10 = this.f15378j;
        long[] jArr = this.f15377f;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[a0.a.c(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f15377f = jArr2;
        }
        long[] jArr3 = this.f15377f;
        int i11 = this.f15378j;
        this.f15378j = i11 + 1;
        jArr3[i11] = longValue;
        return true;
    }

    @Override // t9.x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        b();
        Charset charset = t1.f15353a;
        Objects.requireNonNull(collection);
        if (collection instanceof z1) {
            z1 z1Var = (z1) collection;
            int i10 = z1Var.f15378j;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f15378j;
            if (IntCompanionObject.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                long[] jArr = this.f15377f;
                if (i12 > jArr.length) {
                    this.f15377f = Arrays.copyOf(jArr, i12);
                }
                System.arraycopy(z1Var.f15377f, 0, this.f15377f, this.f15378j, z1Var.f15378j);
                this.f15378j = i12;
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

    public final long e(int i10) {
        h(i10);
        return this.f15377f[i10];
    }

    @Override // t9.x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z1) {
            z1 z1Var = (z1) obj;
            if (this.f15378j != z1Var.f15378j) {
                return false;
            }
            long[] jArr = z1Var.f15377f;
            for (int i10 = 0; i10 < this.f15378j; i10++) {
                if (this.f15377f[i10] != jArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final String g(int i10) {
        return a1.a.h(35, "Index:", i10, ", Size:", this.f15378j);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Long.valueOf(this.f15377f[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f15378j) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // t9.x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f15378j; i11++) {
            i10 = (i10 * 31) + t1.a(this.f15377f[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i10 = this.f15378j;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f15377f[i11] == longValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // t9.x0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        b();
        h(i10);
        long[] jArr = this.f15377f;
        long j10 = jArr[i10];
        if (i10 < this.f15378j - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f15378j--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f15377f;
        System.arraycopy(jArr, i11, jArr, i10, this.f15378j - i11);
        this.f15378j -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        h(i10);
        long[] jArr = this.f15377f;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15378j;
    }

    @Override // t9.s1
    public final /* bridge */ /* synthetic */ s1<Long> zzg(int i10) {
        if (i10 >= this.f15378j) {
            return new z1(Arrays.copyOf(this.f15377f, i10), this.f15378j);
        }
        throw new IllegalArgumentException();
    }
}
