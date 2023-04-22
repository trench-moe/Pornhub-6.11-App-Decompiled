package m0;

/* loaded from: classes2.dex */
public class d<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f12858a;

    /* renamed from: b  reason: collision with root package name */
    public int f12859b;

    public d(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f12858a = new Object[i10];
    }

    @Override // m0.c
    public boolean a(T t2) {
        int i10;
        boolean z10;
        int i11 = 0;
        while (true) {
            i10 = this.f12859b;
            if (i11 >= i10) {
                z10 = false;
                break;
            } else if (this.f12858a[i11] == t2) {
                z10 = true;
                break;
            } else {
                i11++;
            }
        }
        if (z10) {
            throw new IllegalStateException("Already in the pool!");
        }
        Object[] objArr = this.f12858a;
        if (i10 < objArr.length) {
            objArr[i10] = t2;
            this.f12859b = i10 + 1;
            return true;
        }
        return false;
    }

    @Override // m0.c
    public T b() {
        int i10 = this.f12859b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = this.f12858a;
            T t2 = (T) objArr[i11];
            objArr[i11] = null;
            this.f12859b = i10 - 1;
            return t2;
        }
        return null;
    }
}
