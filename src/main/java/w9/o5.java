package w9;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class o5 extends z4 implements RandomAccess, y6 {

    /* renamed from: f  reason: collision with root package name */
    public float[] f17266f;

    /* renamed from: j  reason: collision with root package name */
    public int f17267j;

    static {
        new o5(new float[0], 0).f17389c = false;
    }

    public o5() {
        this.f17266f = new float[10];
        this.f17267j = 0;
    }

    public o5(float[] fArr, int i10) {
        this.f17266f = fArr;
        this.f17267j = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f17267j)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        float[] fArr = this.f17266f;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[a0.a.c(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f17266f, i10, fArr2, i10 + 1, this.f17267j - i10);
            this.f17266f = fArr2;
        }
        this.f17266f[i10] = floatValue;
        this.f17267j++;
        ((AbstractList) this).modCount++;
    }

    @Override // w9.z4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }

    @Override // w9.z4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = b6.f17081a;
        Objects.requireNonNull(collection);
        if (collection instanceof o5) {
            o5 o5Var = (o5) collection;
            int i10 = o5Var.f17267j;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f17267j;
            if (IntCompanionObject.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                float[] fArr = this.f17266f;
                if (i12 > fArr.length) {
                    this.f17266f = Arrays.copyOf(fArr, i12);
                }
                System.arraycopy(o5Var.f17266f, 0, this.f17266f, this.f17267j, o5Var.f17267j);
                this.f17267j = i12;
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

    public final void e(float f10) {
        b();
        int i10 = this.f17267j;
        float[] fArr = this.f17266f;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[a0.a.c(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f17266f = fArr2;
        }
        float[] fArr3 = this.f17266f;
        int i11 = this.f17267j;
        this.f17267j = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // w9.z4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o5) {
            o5 o5Var = (o5) obj;
            if (this.f17267j != o5Var.f17267j) {
                return false;
            }
            float[] fArr = o5Var.f17266f;
            for (int i10 = 0; i10 < this.f17267j; i10++) {
                if (Float.floatToIntBits(this.f17266f[i10]) != Float.floatToIntBits(fArr[i10])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final String g(int i10) {
        return a1.a.h(35, "Index:", i10, ", Size:", this.f17267j);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Float.valueOf(this.f17266f[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f17267j) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // w9.z4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f17267j; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f17266f[i11]);
        }
        return i10;
    }

    @Override // w9.a6
    public final /* bridge */ /* synthetic */ a6 i(int i10) {
        if (i10 >= this.f17267j) {
            return new o5(Arrays.copyOf(this.f17266f, i10), this.f17267j);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i10 = this.f17267j;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f17266f[i11] == floatValue) {
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
        float[] fArr = this.f17266f;
        float f10 = fArr[i10];
        if (i10 < this.f17267j - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f17267j--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f17266f;
        System.arraycopy(fArr, i11, fArr, i10, this.f17267j - i11);
        this.f17267j -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        b();
        h(i10);
        float[] fArr = this.f17266f;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17267j;
    }
}
