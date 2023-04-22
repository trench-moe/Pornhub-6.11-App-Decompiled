package n5;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import n5.m;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: e  reason: collision with root package name */
    public static final c f13353e = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final m<Object, Object> f13354f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<b<?, ?>> f13355a;

    /* renamed from: b  reason: collision with root package name */
    public final c f13356b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b<?, ?>> f13357c;
    public final m0.c<List<Throwable>> d;

    /* loaded from: classes2.dex */
    public static class a implements m<Object, Object> {
        @Override // n5.m
        public boolean a(Object obj) {
            return false;
        }

        @Override // n5.m
        public m.a<Object> b(Object obj, int i10, int i11, h5.d dVar) {
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Model> f13358a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<Data> f13359b;

        /* renamed from: c  reason: collision with root package name */
        public final n<? extends Model, ? extends Data> f13360c;

        public b(Class<Model> cls, Class<Data> cls2, n<? extends Model, ? extends Data> nVar) {
            this.f13358a = cls;
            this.f13359b = cls2;
            this.f13360c = nVar;
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
    }

    public q(m0.c<List<Throwable>> cVar) {
        c cVar2 = f13353e;
        this.f13355a = new ArrayList();
        this.f13357c = new HashSet();
        this.d = cVar;
        this.f13356b = cVar2;
    }

    public synchronized <Model> List<m<Model, ?>> a(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f13355a) {
                if (!this.f13357c.contains(bVar) && bVar.f13358a.isAssignableFrom(cls)) {
                    this.f13357c.add(bVar);
                    m<? extends Object, ? extends Object> a10 = bVar.f13360c.a(this);
                    Objects.requireNonNull(a10, "Argument must not be null");
                    arrayList.add(a10);
                    this.f13357c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            try {
                this.f13357c.clear();
                throw th;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public synchronized <Model, Data> m<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b<?, ?> bVar : this.f13355a) {
                if (this.f13357c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.f13358a.isAssignableFrom(cls) && bVar.f13359b.isAssignableFrom(cls2)) {
                    this.f13357c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f13357c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f13356b;
                m0.c<List<Throwable>> cVar2 = this.d;
                Objects.requireNonNull(cVar);
                return new p(arrayList, cVar2);
            } else if (arrayList.size() == 1) {
                return (m) arrayList.get(0);
            } else if (z10) {
                return (m<Model, Data>) f13354f;
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            try {
                this.f13357c.clear();
                throw th;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <Model, Data> m<Model, Data> c(b<?, ?> bVar) {
        m<Model, Data> mVar = (m<Model, Data>) bVar.f13360c.a(this);
        Objects.requireNonNull(mVar, "Argument must not be null");
        return mVar;
    }

    public synchronized List<Class<?>> d(Class<?> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            while (true) {
                for (b<?, ?> bVar : this.f13355a) {
                    if (!arrayList.contains(bVar.f13359b) && bVar.f13358a.isAssignableFrom(cls)) {
                        arrayList.add(bVar.f13359b);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }
}
