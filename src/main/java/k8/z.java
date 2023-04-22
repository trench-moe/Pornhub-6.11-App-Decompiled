package k8;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class z<V> {

    /* renamed from: a  reason: collision with root package name */
    public long[] f12033a = new long[10];

    /* renamed from: b  reason: collision with root package name */
    public V[] f12034b = (V[]) new Object[10];

    /* renamed from: c  reason: collision with root package name */
    public int f12035c;
    public int d;

    public synchronized void a(long j10, V v2) {
        try {
            int i10 = this.d;
            if (i10 > 0) {
                if (j10 <= this.f12033a[((this.f12035c + i10) - 1) % this.f12034b.length]) {
                    b();
                }
            }
            c();
            int i11 = this.f12035c;
            int i12 = this.d;
            V[] vArr = this.f12034b;
            int length = (i11 + i12) % vArr.length;
            this.f12033a[length] = j10;
            vArr[length] = v2;
            this.d = i12 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        try {
            this.f12035c = 0;
            this.d = 0;
            Arrays.fill(this.f12034b, (Object) null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        int length = this.f12034b.length;
        if (this.d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) new Object[i10];
        int i11 = this.f12035c;
        int i12 = length - i11;
        System.arraycopy(this.f12033a, i11, jArr, 0, i12);
        System.arraycopy(this.f12034b, this.f12035c, vArr, 0, i12);
        int i13 = this.f12035c;
        if (i13 > 0) {
            System.arraycopy(this.f12033a, 0, jArr, i12, i13);
            System.arraycopy(this.f12034b, 0, vArr, i12, this.f12035c);
        }
        this.f12033a = jArr;
        this.f12034b = vArr;
        this.f12035c = 0;
    }

    public final V d(long j10, boolean z10) {
        V v2 = null;
        long j11 = Long.MAX_VALUE;
        while (this.d > 0) {
            long j12 = j10 - this.f12033a[this.f12035c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            v2 = f();
            j11 = j12;
        }
        return v2;
    }

    public synchronized V e(long j10) {
        return d(j10, true);
    }

    public final V f() {
        a.f(this.d > 0);
        V[] vArr = this.f12034b;
        int i10 = this.f12035c;
        V v2 = vArr[i10];
        vArr[i10] = null;
        this.f12035c = (i10 + 1) % vArr.length;
        this.d--;
        return v2;
    }
}
