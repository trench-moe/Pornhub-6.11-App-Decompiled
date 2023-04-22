package y5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f18416a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<a<?, ?>>> f18417b = new HashMap();

    /* loaded from: classes2.dex */
    public static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f18418a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f18419b;

        /* renamed from: c  reason: collision with root package name */
        public final h5.e<T, R> f18420c;

        public a(Class<T> cls, Class<R> cls2, h5.e<T, R> eVar) {
            this.f18418a = cls;
            this.f18419b = cls2;
            this.f18420c = eVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f18418a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f18419b);
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.f18416a.contains(str)) {
            this.f18416a.add(str);
        }
        list = this.f18417b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f18417b.put(str, list);
        }
        return list;
    }

    public synchronized <T, R> List<Class<R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (String str : this.f18416a) {
                List<a<?, ?>> list = this.f18417b.get(str);
                if (list != null) {
                    for (a<?, ?> aVar : list) {
                        if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f18419b)) {
                            arrayList.add(aVar.f18419b);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }
}
