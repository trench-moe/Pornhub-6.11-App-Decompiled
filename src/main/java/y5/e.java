package y5;

import h5.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<?>> f18421a = new ArrayList();

    /* loaded from: classes2.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f18422a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T> f18423b;

        public a(Class<T> cls, f<T> fVar) {
            this.f18422a = cls;
            this.f18423b = fVar;
        }
    }

    public synchronized <Z> f<Z> a(Class<Z> cls) {
        try {
            int size = this.f18421a.size();
            for (int i10 = 0; i10 < size; i10++) {
                a<?> aVar = this.f18421a.get(i10);
                if (aVar.f18422a.isAssignableFrom(cls)) {
                    return (f<Z>) aVar.f18423b;
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
