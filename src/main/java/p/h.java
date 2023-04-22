package p;

/* loaded from: classes2.dex */
public class h<E> implements Cloneable {
    public static final Object n = new Object();

    /* renamed from: c  reason: collision with root package name */
    public boolean f13769c = false;

    /* renamed from: f  reason: collision with root package name */
    public int[] f13770f;

    /* renamed from: j  reason: collision with root package name */
    public Object[] f13771j;

    /* renamed from: m  reason: collision with root package name */
    public int f13772m;

    public h() {
        int J = a0.b.J(10);
        this.f13770f = new int[J];
        this.f13771j = new Object[J];
    }

    public void a(int i10, E e10) {
        int i11 = this.f13772m;
        if (i11 != 0 && i10 <= this.f13770f[i11 - 1]) {
            i(i10, e10);
            return;
        }
        if (this.f13769c && i11 >= this.f13770f.length) {
            c();
        }
        int i12 = this.f13772m;
        if (i12 >= this.f13770f.length) {
            int J = a0.b.J(i12 + 1);
            int[] iArr = new int[J];
            Object[] objArr = new Object[J];
            int[] iArr2 = this.f13770f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f13771j;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f13770f = iArr;
            this.f13771j = objArr;
        }
        this.f13770f[i12] = i10;
        this.f13771j[i12] = e10;
        this.f13772m = i12 + 1;
    }

    /* renamed from: b */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f13770f = (int[]) this.f13770f.clone();
            hVar.f13771j = (Object[]) this.f13771j.clone();
            return hVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void c() {
        int i10 = this.f13772m;
        int[] iArr = this.f13770f;
        Object[] objArr = this.f13771j;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != n) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f13769c = false;
        this.f13772m = i11;
    }

    public E d(int i10) {
        return f(i10, null);
    }

    public E f(int i10, E e10) {
        int g10 = a0.b.g(this.f13770f, this.f13772m, i10);
        if (g10 >= 0) {
            Object[] objArr = this.f13771j;
            if (objArr[g10] != n) {
                return (E) objArr[g10];
            }
        }
        return e10;
    }

    public int g(int i10) {
        if (this.f13769c) {
            c();
        }
        return this.f13770f[i10];
    }

    public void i(int i10, E e10) {
        int g10 = a0.b.g(this.f13770f, this.f13772m, i10);
        if (g10 >= 0) {
            this.f13771j[g10] = e10;
            return;
        }
        int i11 = ~g10;
        int i12 = this.f13772m;
        if (i11 < i12) {
            Object[] objArr = this.f13771j;
            if (objArr[i11] == n) {
                this.f13770f[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f13769c && i12 >= this.f13770f.length) {
            c();
            i11 = ~a0.b.g(this.f13770f, this.f13772m, i10);
        }
        int i13 = this.f13772m;
        if (i13 >= this.f13770f.length) {
            int J = a0.b.J(i13 + 1);
            int[] iArr = new int[J];
            Object[] objArr2 = new Object[J];
            int[] iArr2 = this.f13770f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f13771j;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f13770f = iArr;
            this.f13771j = objArr2;
        }
        int i14 = this.f13772m;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f13770f;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f13771j;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f13772m - i11);
        }
        this.f13770f[i11] = i10;
        this.f13771j[i11] = e10;
        this.f13772m++;
    }

    public int j() {
        if (this.f13769c) {
            c();
        }
        return this.f13772m;
    }

    public E k(int i10) {
        if (this.f13769c) {
            c();
        }
        return (E) this.f13771j[i10];
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f13772m * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f13772m; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(g(i10));
            sb2.append('=');
            E k10 = k(i10);
            if (k10 != this) {
                sb2.append(k10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
