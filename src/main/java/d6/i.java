package d6;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i<T, Y> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<T, a<Y>> f8794a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public long f8795b;

    /* renamed from: c  reason: collision with root package name */
    public long f8796c;

    /* loaded from: classes.dex */
    public static final class a<Y> {

        /* renamed from: a  reason: collision with root package name */
        public final Y f8797a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8798b;

        public a(Y y, int i10) {
            this.f8797a = y;
            this.f8798b = i10;
        }
    }

    public i(long j10) {
        this.f8795b = j10;
    }

    public synchronized Y a(T t2) {
        a<Y> aVar;
        aVar = this.f8794a.get(t2);
        return aVar != null ? aVar.f8797a : null;
    }

    public int b(Y y) {
        return 1;
    }

    public void c(T t2, Y y) {
    }

    public synchronized Y d(T t2, Y y) {
        try {
            int b10 = b(y);
            long j10 = b10;
            if (j10 >= this.f8795b) {
                c(t2, y);
                return null;
            }
            if (y != null) {
                this.f8796c += j10;
            }
            a<Y> put = this.f8794a.put(t2, y == null ? null : new a<>(y, b10));
            if (put != null) {
                this.f8796c -= put.f8798b;
                if (!put.f8797a.equals(y)) {
                    c(t2, put.f8797a);
                }
            }
            e(this.f8795b);
            return put != null ? put.f8797a : null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e(long j10) {
        while (this.f8796c > j10) {
            try {
                Iterator<Map.Entry<T, a<Y>>> it = this.f8794a.entrySet().iterator();
                Map.Entry<T, a<Y>> next = it.next();
                a<Y> value = next.getValue();
                this.f8796c -= value.f8798b;
                T key = next.getKey();
                it.remove();
                c(key, value.f8797a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
