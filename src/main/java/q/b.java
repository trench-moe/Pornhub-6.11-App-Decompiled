package q;

/* loaded from: classes2.dex */
public class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f14137a;

    /* renamed from: b  reason: collision with root package name */
    public int f14138b;

    public b(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f14137a = new Object[i10];
    }

    public T a() {
        int i10 = this.f14138b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = this.f14137a;
            T t2 = (T) objArr[i11];
            objArr[i11] = null;
            this.f14138b = i10 - 1;
            return t2;
        }
        return null;
    }

    public boolean b(T t2) {
        int i10 = this.f14138b;
        Object[] objArr = this.f14137a;
        if (i10 < objArr.length) {
            objArr[i10] = t2;
            this.f14138b = i10 + 1;
            return true;
        }
        return false;
    }
}
