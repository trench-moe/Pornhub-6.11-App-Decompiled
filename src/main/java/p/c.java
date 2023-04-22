package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p.f;

/* loaded from: classes2.dex */
public final class c<E> implements Collection<E>, Set<E> {
    public static final int[] n = new int[0];

    /* renamed from: t  reason: collision with root package name */
    public static final Object[] f13737t = new Object[0];

    /* renamed from: u  reason: collision with root package name */
    public static Object[] f13738u;

    /* renamed from: w  reason: collision with root package name */
    public static int f13739w;
    public static Object[] y;

    /* renamed from: z  reason: collision with root package name */
    public static int f13740z;

    /* renamed from: c  reason: collision with root package name */
    public int[] f13741c;

    /* renamed from: f  reason: collision with root package name */
    public Object[] f13742f;

    /* renamed from: j  reason: collision with root package name */
    public int f13743j;

    /* renamed from: m  reason: collision with root package name */
    public f<E, E> f13744m;

    public c() {
        this(0);
    }

    public c(int i10) {
        if (i10 == 0) {
            this.f13741c = n;
            this.f13742f = f13737t;
        } else {
            b(i10);
        }
        this.f13743j = 0;
    }

    public static void e(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (f13740z < 10) {
                    objArr[0] = y;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    y = objArr;
                    f13740z++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (f13739w < 10) {
                    objArr[0] = f13738u;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f13738u = objArr;
                    f13739w++;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int g10;
        if (e10 == null) {
            g10 = h();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            g10 = g(e10, hashCode);
        }
        if (g10 >= 0) {
            return false;
        }
        int i11 = ~g10;
        int i12 = this.f13743j;
        int[] iArr = this.f13741c;
        if (i12 >= iArr.length) {
            int i13 = 4;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i13 = 8;
            }
            Object[] objArr = this.f13742f;
            b(i13);
            int[] iArr2 = this.f13741c;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f13742f, 0, objArr.length);
            }
            e(iArr, objArr, this.f13743j);
        }
        int i14 = this.f13743j;
        if (i11 < i14) {
            int[] iArr3 = this.f13741c;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f13742f;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f13743j - i11);
        }
        this.f13741c[i11] = i10;
        this.f13742f[i11] = e10;
        this.f13743j++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f13743j;
        int[] iArr = this.f13741c;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f13742f;
            b(size);
            int i10 = this.f13743j;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f13741c, 0, i10);
                System.arraycopy(objArr, 0, this.f13742f, 0, this.f13743j);
            }
            e(iArr, objArr, this.f13743j);
        }
        for (E e10 : collection) {
            z10 |= add(e10);
        }
        return z10;
    }

    public final void b(int i10) {
        if (i10 == 8) {
            synchronized (c.class) {
                Object[] objArr = y;
                if (objArr != null) {
                    this.f13742f = objArr;
                    y = (Object[]) objArr[0];
                    this.f13741c = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f13740z--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (c.class) {
                Object[] objArr2 = f13738u;
                if (objArr2 != null) {
                    this.f13742f = objArr2;
                    f13738u = (Object[]) objArr2[0];
                    this.f13741c = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f13739w--;
                    return;
                }
            }
        }
        this.f13741c = new int[i10];
        this.f13742f = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f13743j;
        if (i10 != 0) {
            e(this.f13741c, this.f13742f, i10);
            this.f13741c = n;
            this.f13742f = f13737t;
            this.f13743j = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f13743j != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f13743j; i10++) {
                try {
                    if (!set.contains(this.f13742f[i10])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int g(Object obj, int i10) {
        int i11 = this.f13743j;
        if (i11 == 0) {
            return -1;
        }
        int g10 = a0.b.g(this.f13741c, i11, i10);
        if (g10 >= 0 && !obj.equals(this.f13742f[g10])) {
            int i12 = g10 + 1;
            while (i12 < i11 && this.f13741c[i12] == i10) {
                if (obj.equals(this.f13742f[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = g10 - 1; i13 >= 0 && this.f13741c[i13] == i10; i13--) {
                if (obj.equals(this.f13742f[i13])) {
                    return i13;
                }
            }
            return ~i12;
        }
        return g10;
    }

    public final int h() {
        int i10 = this.f13743j;
        if (i10 == 0) {
            return -1;
        }
        int g10 = a0.b.g(this.f13741c, i10, 0);
        if (g10 >= 0 && this.f13742f[g10] != null) {
            int i11 = g10 + 1;
            while (i11 < i10 && this.f13741c[i11] == 0) {
                if (this.f13742f[i11] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = g10 - 1; i12 >= 0 && this.f13741c[i12] == 0; i12--) {
                if (this.f13742f[i12] == null) {
                    return i12;
                }
            }
            return ~i11;
        }
        return g10;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f13741c;
        int i10 = this.f13743j;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        return obj == null ? h() : g(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f13743j <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        if (this.f13744m == null) {
            this.f13744m = new b(this);
        }
        f<E, E> fVar = this.f13744m;
        if (fVar.f13750b == null) {
            fVar.f13750b = new f.c();
        }
        return fVar.f13750b.iterator();
    }

    public E j(int i10) {
        Object[] objArr = this.f13742f;
        E e10 = (E) objArr[i10];
        int i11 = this.f13743j;
        if (i11 <= 1) {
            e(this.f13741c, objArr, i11);
            this.f13741c = n;
            this.f13742f = f13737t;
            this.f13743j = 0;
        } else {
            int[] iArr = this.f13741c;
            int i12 = 8;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i13 = i11 - 1;
                this.f13743j = i13;
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    System.arraycopy(iArr, i14, iArr, i10, i13 - i10);
                    Object[] objArr2 = this.f13742f;
                    System.arraycopy(objArr2, i14, objArr2, i10, this.f13743j - i10);
                }
                this.f13742f[this.f13743j] = null;
            } else {
                if (i11 > 8) {
                    i12 = i11 + (i11 >> 1);
                }
                b(i12);
                this.f13743j--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f13741c, 0, i10);
                    System.arraycopy(objArr, 0, this.f13742f, 0, i10);
                }
                int i15 = this.f13743j;
                if (i10 < i15) {
                    int i16 = i10 + 1;
                    System.arraycopy(iArr, i16, this.f13741c, i10, i15 - i10);
                    System.arraycopy(objArr, i16, this.f13742f, i10, this.f13743j - i10);
                }
            }
        }
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            j(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f13743j - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f13742f[i10])) {
                j(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f13743j;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f13743j;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f13742f, 0, objArr, 0, i10);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f13743j) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f13743j));
        }
        System.arraycopy(this.f13742f, 0, tArr, 0, this.f13743j);
        int length = tArr.length;
        int i10 = this.f13743j;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f13743j * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f13743j; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f13742f[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
