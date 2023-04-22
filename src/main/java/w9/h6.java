package w9;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class h6 extends z4 implements RandomAccess, z5, y6 {

    /* renamed from: m  reason: collision with root package name */
    public static final h6 f17182m;

    /* renamed from: f  reason: collision with root package name */
    public long[] f17183f;

    /* renamed from: j  reason: collision with root package name */
    public int f17184j;

    static {
        h6 h6Var = new h6(new long[0], 0);
        f17182m = h6Var;
        h6Var.f17389c = false;
    }

    public h6() {
        this.f17183f = new long[10];
        this.f17184j = 0;
    }

    public h6(long[] jArr, int i10) {
        this.f17183f = jArr;
        this.f17184j = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f17184j)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        long[] jArr = this.f17183f;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[a0.a.c(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f17183f, i10, jArr2, i10 + 1, this.f17184j - i10);
            this.f17183f = jArr2;
        }
        this.f17183f[i10] = longValue;
        this.f17184j++;
        ((AbstractList) this).modCount++;
    }

    @Override // w9.z4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }

    @Override // w9.z4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = b6.f17081a;
        Objects.requireNonNull(collection);
        if (collection instanceof h6) {
            h6 h6Var = (h6) collection;
            int i10 = h6Var.f17184j;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f17184j;
            if (IntCompanionObject.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                long[] jArr = this.f17183f;
                if (i12 > jArr.length) {
                    this.f17183f = Arrays.copyOf(jArr, i12);
                }
                System.arraycopy(h6Var.f17183f, 0, this.f17183f, this.f17184j, h6Var.f17184j);
                this.f17184j = i12;
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
        l(i10);
        return this.f17183f[i10];
    }

    @Override // w9.z4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h6) {
            h6 h6Var = (h6) obj;
            if (this.f17184j != h6Var.f17184j) {
                return false;
            }
            long[] jArr = h6Var.f17183f;
            for (int i10 = 0; i10 < this.f17184j; i10++) {
                if (this.f17183f[i10] != jArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // w9.a6
    /* renamed from: g */
    public final z5 i(int i10) {
        if (i10 >= this.f17184j) {
            return new h6(Arrays.copyOf(this.f17183f, i10), this.f17184j);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        l(i10);
        return Long.valueOf(this.f17183f[i10]);
    }

    public final void h(long j10) {
        b();
        int i10 = this.f17184j;
        long[] jArr = this.f17183f;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[a0.a.c(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f17183f = jArr2;
        }
        long[] jArr3 = this.f17183f;
        int i11 = this.f17184j;
        this.f17184j = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // w9.z4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f17184j; i11++) {
            i10 = (i10 * 31) + b6.b(this.f17183f[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i10 = this.f17184j;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f17183f[i11] == longValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    public final String j(int i10) {
        return a1.a.h(35, "Index:", i10, ", Size:", this.f17184j);
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f17184j) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    @Override // w9.z4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        b();
        l(i10);
        long[] jArr = this.f17183f;
        long j10 = jArr[i10];
        if (i10 < this.f17184j - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f17184j--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f17183f;
        System.arraycopy(jArr, i11, jArr, i10, this.f17184j - i11);
        this.f17184j -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        l(i10);
        long[] jArr = this.f17183f;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17184j;
    }
}
