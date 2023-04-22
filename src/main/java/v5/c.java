package v5;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<?, ?>> f16020a = new ArrayList();

    /* loaded from: classes2.dex */
    public static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Z> f16021a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f16022b;

        /* renamed from: c  reason: collision with root package name */
        public final b<Z, R> f16023c;

        public a(Class<Z> cls, Class<R> cls2, b<Z, R> bVar) {
            this.f16021a = cls;
            this.f16022b = cls2;
            this.f16023c = bVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f16021a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f16022b);
        }
    }

    public synchronized <Z, R> List<Class<R>> a(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.f16020a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f16022b)) {
                arrayList.add(aVar.f16022b);
            }
        }
        return arrayList;
    }
}
