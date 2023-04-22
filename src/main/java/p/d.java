package p;

/* loaded from: classes2.dex */
public class d<E> implements Cloneable {
    public static final Object n = new Object();

    /* renamed from: c  reason: collision with root package name */
    public boolean f13745c;

    /* renamed from: f  reason: collision with root package name */
    public long[] f13746f;

    /* renamed from: j  reason: collision with root package name */
    public Object[] f13747j;

    /* renamed from: m  reason: collision with root package name */
    public int f13748m;

    public d() {
        this(10);
    }

    public d(int i10) {
        this.f13745c = false;
        if (i10 == 0) {
            this.f13746f = a0.b.F;
            this.f13747j = a0.b.G;
            return;
        }
        int K = a0.b.K(i10);
        this.f13746f = new long[K];
        this.f13747j = new Object[K];
    }

    public void a(long j10, E e10) {
        int i10 = this.f13748m;
        if (i10 != 0 && j10 <= this.f13746f[i10 - 1]) {
            j(j10, e10);
            return;
        }
        if (this.f13745c && i10 >= this.f13746f.length) {
            d();
        }
        int i11 = this.f13748m;
        if (i11 >= this.f13746f.length) {
            int K = a0.b.K(i11 + 1);
            long[] jArr = new long[K];
            Object[] objArr = new Object[K];
            long[] jArr2 = this.f13746f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f13747j;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f13746f = jArr;
            this.f13747j = objArr;
        }
        this.f13746f[i11] = j10;
        this.f13747j[i11] = e10;
        this.f13748m = i11 + 1;
    }

    public void b() {
        int i10 = this.f13748m;
        Object[] objArr = this.f13747j;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f13748m = 0;
        this.f13745c = false;
    }

    /* renamed from: c */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f13746f = (long[]) this.f13746f.clone();
            dVar.f13747j = (Object[]) this.f13747j.clone();
            return dVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void d() {
        int i10 = this.f13748m;
        long[] jArr = this.f13746f;
        Object[] objArr = this.f13747j;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != n) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f13745c = false;
        this.f13748m = i11;
    }

    public E f(long j10) {
        return g(j10, null);
    }

    public E g(long j10, E e10) {
        int h10 = a0.b.h(this.f13746f, this.f13748m, j10);
        if (h10 >= 0) {
            Object[] objArr = this.f13747j;
            if (objArr[h10] != n) {
                return (E) objArr[h10];
            }
        }
        return e10;
    }

    public long i(int i10) {
        if (this.f13745c) {
            d();
        }
        return this.f13746f[i10];
    }

    public void j(long j10, E e10) {
        int h10 = a0.b.h(this.f13746f, this.f13748m, j10);
        if (h10 >= 0) {
            this.f13747j[h10] = e10;
            return;
        }
        int i10 = ~h10;
        int i11 = this.f13748m;
        if (i10 < i11) {
            Object[] objArr = this.f13747j;
            if (objArr[i10] == n) {
                this.f13746f[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f13745c && i11 >= this.f13746f.length) {
            d();
            i10 = ~a0.b.h(this.f13746f, this.f13748m, j10);
        }
        int i12 = this.f13748m;
        if (i12 >= this.f13746f.length) {
            int K = a0.b.K(i12 + 1);
            long[] jArr = new long[K];
            Object[] objArr2 = new Object[K];
            long[] jArr2 = this.f13746f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f13747j;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f13746f = jArr;
            this.f13747j = objArr2;
        }
        int i13 = this.f13748m;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f13746f;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f13747j;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f13748m - i10);
        }
        this.f13746f[i10] = j10;
        this.f13747j[i10] = e10;
        this.f13748m++;
    }

    public int k() {
        if (this.f13745c) {
            d();
        }
        return this.f13748m;
    }

    public E l(int i10) {
        if (this.f13745c) {
            d();
        }
        return (E) this.f13747j[i10];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f13748m * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f13748m; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(i(i10));
            sb2.append('=');
            E l10 = l(i10);
            if (l10 != this) {
                sb2.append(l10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
