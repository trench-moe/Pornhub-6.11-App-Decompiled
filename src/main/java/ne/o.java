package ne;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;
import ne.p;

/* loaded from: classes3.dex */
public class o<T extends p & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a  reason: collision with root package name */
    public T[] f13461a;

    @PublishedApi
    public final void a(T t2) {
        d.a aVar = (d.a) t2;
        aVar.i(this);
        T[] tArr = this.f13461a;
        if (tArr == null) {
            tArr = (T[]) new p[4];
            this.f13461a = tArr;
        } else if (this._size >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            tArr = (T[]) ((p[]) copyOf);
            this.f13461a = tArr;
        }
        int i10 = this._size;
        this._size = i10 + 1;
        tArr[i10] = t2;
        aVar.f12115j = i10;
        f(i10);
    }

    @PublishedApi
    public final T b() {
        T[] tArr = this.f13461a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    public final boolean c() {
        return this._size == 0;
    }

    @PublishedApi
    public final T d(int i10) {
        T[] tArr = this.f13461a;
        Intrinsics.checkNotNull(tArr);
        this._size--;
        if (i10 < this._size) {
            g(i10, this._size);
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t2 = tArr[i10];
                Intrinsics.checkNotNull(t2);
                T t8 = tArr[i11];
                Intrinsics.checkNotNull(t8);
                if (((Comparable) t2).compareTo(t8) < 0) {
                    g(i10, i11);
                    f(i11);
                }
            }
            while (true) {
                int i12 = (i10 * 2) + 1;
                if (i12 >= this._size) {
                    break;
                }
                T[] tArr2 = this.f13461a;
                Intrinsics.checkNotNull(tArr2);
                int i13 = i12 + 1;
                if (i13 < this._size) {
                    T t10 = tArr2[i13];
                    Intrinsics.checkNotNull(t10);
                    T t11 = tArr2[i12];
                    Intrinsics.checkNotNull(t11);
                    if (((Comparable) t10).compareTo(t11) < 0) {
                        i12 = i13;
                    }
                }
                T t12 = tArr2[i10];
                Intrinsics.checkNotNull(t12);
                T t13 = tArr2[i12];
                Intrinsics.checkNotNull(t13);
                if (((Comparable) t12).compareTo(t13) <= 0) {
                    break;
                }
                g(i10, i12);
                i10 = i12;
            }
        }
        T t14 = tArr[this._size];
        Intrinsics.checkNotNull(t14);
        t14.i(null);
        t14.g(-1);
        tArr[this._size] = null;
        return t14;
    }

    public final T e() {
        T d;
        synchronized (this) {
            d = this._size > 0 ? d(0) : null;
        }
        return d;
    }

    public final void f(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f13461a;
            Intrinsics.checkNotNull(tArr);
            int i11 = (i10 - 1) / 2;
            T t2 = tArr[i11];
            Intrinsics.checkNotNull(t2);
            T t8 = tArr[i10];
            Intrinsics.checkNotNull(t8);
            if (((Comparable) t2).compareTo(t8) <= 0) {
                return;
            }
            g(i10, i11);
            i10 = i11;
        }
    }

    public final void g(int i10, int i11) {
        T[] tArr = this.f13461a;
        Intrinsics.checkNotNull(tArr);
        T t2 = tArr[i11];
        Intrinsics.checkNotNull(t2);
        T t8 = tArr[i10];
        Intrinsics.checkNotNull(t8);
        tArr[i10] = t2;
        tArr[i11] = t8;
        t2.g(i10);
        t8.g(i11);
    }
}
